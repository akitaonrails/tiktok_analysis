package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.bytedance.im.core.proto.TokenInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YQL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQL {
    public static MessageBody LIZ(MessageBody messageBody) {
        C872660YLg c872660YLgNewBuilder = messageBody.newBuilder();
        ReferenceInfo referenceInfoBuild = null;
        c872660YLgNewBuilder.LJIIJ = null;
        c872660YLgNewBuilder.LJIL = ByteString.EMPTY;
        ReferenceInfo referenceInfo = messageBody.reference_info;
        if (referenceInfo != null) {
            C872750YLp c872750YLpNewBuilder = referenceInfo.newBuilder();
            c872750YLpNewBuilder.LJ = null;
            referenceInfoBuild = c872750YLpNewBuilder.build();
        }
        c872660YLgNewBuilder.LJIJJ = referenceInfoBuild;
        return c872660YLgNewBuilder.build();
    }

    public static Request LIZIZ(C0YEM c0yem, Request request) {
        TokenInfo tokenInfoBuild;
        RequestBody requestBodyBuild;
        C1ES0 c1es0NewBuilder;
        SendMessageRequestBody sendMessageRequestBodyBuild;
        SendMessageP2PRequestBody sendMessageP2PRequestBodyBuild;
        ReferencedMessageInfo referencedMessageInfoBuild;
        C2251871DBx c2251871DBxNewBuilder;
        if (!c0yem.LJIIIZ().LIZJ) {
            return request;
        }
        TokenInfo tokenInfo = request.token_info;
        if (tokenInfo != null && (c2251871DBxNewBuilder = tokenInfo.newBuilder()) != null) {
            c2251871DBxNewBuilder.LJFF = null;
            tokenInfoBuild = c2251871DBxNewBuilder.build();
        } else {
            tokenInfoBuild = null;
        }
        RequestBody requestBody = request.body;
        if (requestBody != null && (c1es0NewBuilder = requestBody.newBuilder()) != null) {
            SendMessageRequestBody sendMessageRequestBody = requestBody.send_message_body;
            if (sendMessageRequestBody != null) {
                C0YCA c0ycaNewBuilder = sendMessageRequestBody.newBuilder();
                c0ycaNewBuilder.LJI = null;
                c0ycaNewBuilder.LJIILL = ByteString.EMPTY;
                ReferencedMessageInfo referencedMessageInfo = sendMessageRequestBody.ref_msg_info;
                if (referencedMessageInfo != null) {
                    C870310YCf c870310YCfNewBuilder = referencedMessageInfo.newBuilder();
                    c870310YCfNewBuilder.LJ = null;
                    referencedMessageInfoBuild = c870310YCfNewBuilder.build();
                } else {
                    referencedMessageInfoBuild = null;
                }
                c0ycaNewBuilder.LJIILIIL = referencedMessageInfoBuild;
                sendMessageRequestBodyBuild = c0ycaNewBuilder.build();
            } else {
                sendMessageRequestBodyBuild = null;
            }
            c1es0NewBuilder.LIZLLL = sendMessageRequestBodyBuild;
            SendMessageP2PRequestBody sendMessageP2PRequestBody = requestBody.send_message_p2p_body;
            if (sendMessageP2PRequestBody != null) {
                C2239971Cln c2239971ClnNewBuilder = sendMessageP2PRequestBody.newBuilder();
                c2239971ClnNewBuilder.LJIIJ = null;
                sendMessageP2PRequestBodyBuild = c2239971ClnNewBuilder.build();
            } else {
                sendMessageP2PRequestBodyBuild = null;
            }
            c1es0NewBuilder.LJJLIIIJLLLLLLLZ = sendMessageP2PRequestBodyBuild;
            requestBodyBuild = c1es0NewBuilder.build();
        } else {
            requestBodyBuild = null;
        }
        C0YLY c0ylyNewBuilder = request.newBuilder();
        c0ylyNewBuilder.LJIJI = tokenInfoBuild;
        c0ylyNewBuilder.LJIIJ = requestBodyBuild;
        c0ylyNewBuilder.LJIIL = null;
        c0ylyNewBuilder.LJIIJJI = null;
        c0ylyNewBuilder.LJIILIIL = null;
        c0ylyNewBuilder.LJIILJJIL = null;
        c0ylyNewBuilder.LJIILL = null;
        c0ylyNewBuilder.LJI = null;
        Map<String, String> mapLJ = C2097608Jq.LJ();
        C1516540pZE.LIZIZ(mapLJ);
        c0ylyNewBuilder.LJIIZILJ = mapLJ;
        return c0ylyNewBuilder.build();
    }

    public static Response LIZJ(C0YEM c0yem, Response response) {
        C1ES1 c1es1NewBuilder;
        NewMessageNotify newMessageNotifyBuild;
        MessagesPerUserResponseBody messagesPerUserResponseBodyBuild;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBodyBuild;
        MessagesInConversationResponseBody messagesInConversationResponseBodyBuild;
        GetStrangerMessagesResponseBody getStrangerMessagesResponseBodyBuild;
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBodyBuild;
        GetRecentMessageRespBody getRecentMessageRespBodyBuild;
        GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBodyBuild;
        ArrayList arrayList;
        MessageInfo messageInfoBuild;
        MessageBody messageBodyLIZ;
        ArrayList arrayList2;
        ConversationRecentMessage conversationRecentMessageBuild;
        ArrayList arrayList3;
        MessageBody messageBodyLIZ2;
        ArrayList arrayList4;
        StrangerConversation strangerConversationBuild;
        MessageBody messageBodyLIZ3;
        ArrayList arrayList5;
        MessageBody messageBodyLIZ4;
        ArrayList arrayList6;
        MessageBody messageBodyLIZ5;
        ArrayList arrayList7;
        MessageBody messageBodyLIZ6;
        ArrayList arrayList8;
        MessageBody messageBodyLIZ7;
        MessageBody messageBodyLIZ8;
        if (!c0yem.LJIIIZ().LIZJ) {
            return response;
        }
        ResponseBody responseBody = response.body;
        ResponseBody responseBodyLIZIZ = null;
        MessageBody messageBodyLIZ9 = null;
        MessageInfo messageInfoBuild2 = null;
        GetMessageByIdResponseBody getMessageByIdResponseBodyBuild = null;
        responseBodyLIZIZ = null;
        if (responseBody != null && (c1es1NewBuilder = responseBody.newBuilder()) != null) {
            NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
            if (newMessageNotify != null) {
                C2274631E1l c2274631E1lNewBuilder = newMessageNotify.newBuilder();
                MessageBody messageBody = newMessageNotify.message;
                if (messageBody != null) {
                    messageBodyLIZ8 = LIZ(messageBody);
                } else {
                    messageBodyLIZ8 = null;
                }
                c2274631E1lNewBuilder.LJI = messageBodyLIZ8;
                newMessageNotifyBuild = c2274631E1lNewBuilder.build();
            } else {
                newMessageNotifyBuild = null;
            }
            c1es1NewBuilder.LJIJ = newMessageNotifyBuild;
            MessagesPerUserResponseBody messagesPerUserResponseBody = responseBody.messages_per_user_body;
            if (messagesPerUserResponseBody != null) {
                C0YSF c0ysfNewBuilder = messagesPerUserResponseBody.newBuilder();
                List<MessageBody> list = messagesPerUserResponseBody.messages;
                if (list != null) {
                    arrayList8 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (MessageBody messageBody2 : list) {
                        if (messageBody2 != null) {
                            messageBodyLIZ7 = LIZ(messageBody2);
                        } else {
                            messageBodyLIZ7 = null;
                        }
                        arrayList8.add(messageBodyLIZ7);
                    }
                } else {
                    arrayList8 = null;
                }
                c0ysfNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList8);
                c0ysfNewBuilder.LIZLLL = arrayList8;
                C13BV c13bv = C13BV.INSTANCE;
                C1516540pZE.LIZ(c13bv);
                c0ysfNewBuilder.LJIIJ = c13bv;
                messagesPerUserResponseBodyBuild = c0ysfNewBuilder.build();
            } else {
                messagesPerUserResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJ = messagesPerUserResponseBodyBuild;
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = responseBody.messages_per_user_init_v2_body;
            if (messagesPerUserInitV2ResponseBody != null) {
                C0YQV c0yqvNewBuilder = messagesPerUserInitV2ResponseBody.newBuilder();
                List<MessageBody> list2 = messagesPerUserInitV2ResponseBody.messages;
                if (list2 != null) {
                    arrayList7 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (MessageBody messageBody3 : list2) {
                        if (messageBody3 != null) {
                            messageBodyLIZ6 = LIZ(messageBody3);
                        } else {
                            messageBodyLIZ6 = null;
                        }
                        arrayList7.add(messageBodyLIZ6);
                    }
                } else {
                    arrayList7 = null;
                }
                c0yqvNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList7);
                c0yqvNewBuilder.LIZLLL = arrayList7;
                C13BV c13bv2 = C13BV.INSTANCE;
                C1516540pZE.LIZ(c13bv2);
                c0yqvNewBuilder.LJIIJJI = c13bv2;
                messagesPerUserInitV2ResponseBodyBuild = c0yqvNewBuilder.build();
            } else {
                messagesPerUserInitV2ResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJFF = messagesPerUserInitV2ResponseBodyBuild;
            MessagesInConversationResponseBody messagesInConversationResponseBody = responseBody.messages_in_conversation_body;
            if (messagesInConversationResponseBody != null) {
                C0YQN c0yqnNewBuilder = messagesInConversationResponseBody.newBuilder();
                List<MessageBody> list3 = messagesInConversationResponseBody.messages;
                if (list3 != null) {
                    arrayList6 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (MessageBody messageBody4 : list3) {
                        if (messageBody4 != null) {
                            messageBodyLIZ5 = LIZ(messageBody4);
                        } else {
                            messageBodyLIZ5 = null;
                        }
                        arrayList6.add(messageBodyLIZ5);
                    }
                } else {
                    arrayList6 = null;
                }
                c0yqnNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList6);
                c0yqnNewBuilder.LIZLLL = arrayList6;
                C13BV c13bv3 = C13BV.INSTANCE;
                C1516540pZE.LIZ(c13bv3);
                c0yqnNewBuilder.LJI = c13bv3;
                messagesInConversationResponseBodyBuild = c0yqnNewBuilder.build();
            } else {
                messagesInConversationResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJIIJJI = messagesInConversationResponseBodyBuild;
            GetStrangerMessagesResponseBody getStrangerMessagesResponseBody = responseBody.get_stranger_messages_body;
            if (getStrangerMessagesResponseBody != null) {
                C0YQT c0yqtNewBuilder = getStrangerMessagesResponseBody.newBuilder();
                List<MessageBody> list4 = getStrangerMessagesResponseBody.messages;
                if (list4 != null) {
                    arrayList5 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    for (MessageBody messageBody5 : list4) {
                        if (messageBody5 != null) {
                            messageBodyLIZ4 = LIZ(messageBody5);
                        } else {
                            messageBodyLIZ4 = null;
                        }
                        arrayList5.add(messageBodyLIZ4);
                    }
                } else {
                    arrayList5 = null;
                }
                c0yqtNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList5);
                c0yqtNewBuilder.LIZLLL = arrayList5;
                getStrangerMessagesResponseBodyBuild = c0yqtNewBuilder.build();
            } else {
                getStrangerMessagesResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJJJJL = getStrangerMessagesResponseBodyBuild;
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = responseBody.get_stranger_conversation_body;
            if (getStrangerConversationListResponseBody != null) {
                C875270YVh c875270YVhNewBuilder = getStrangerConversationListResponseBody.newBuilder();
                List<StrangerConversation> list5 = getStrangerConversationListResponseBody.conversation_list;
                if (list5 != null) {
                    arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                    for (StrangerConversation strangerConversation : list5) {
                        if (strangerConversation != null) {
                            C875290YVj c875290YVjNewBuilder = strangerConversation.newBuilder();
                            MessageBody messageBody6 = strangerConversation.last_message;
                            if (messageBody6 != null) {
                                messageBodyLIZ3 = LIZ(messageBody6);
                            } else {
                                messageBodyLIZ3 = null;
                            }
                            c875290YVjNewBuilder.LJFF = messageBodyLIZ3;
                            strangerConversationBuild = c875290YVjNewBuilder.build();
                        } else {
                            strangerConversationBuild = null;
                        }
                        arrayList4.add(strangerConversationBuild);
                    }
                } else {
                    arrayList4 = null;
                }
                c875270YVhNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList4);
                c875270YVhNewBuilder.LJI = arrayList4;
                getStrangerConversationListResponseBodyBuild = c875270YVhNewBuilder.build();
            } else {
                getStrangerConversationListResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJJJJJL = getStrangerConversationListResponseBodyBuild;
            GetRecentMessageRespBody getRecentMessageRespBody = responseBody.get_recent_message_body;
            if (getRecentMessageRespBody != null) {
                C0YSS c0yssNewBuilder = getRecentMessageRespBody.newBuilder();
                List<ConversationRecentMessage> list6 = getRecentMessageRespBody.messages;
                if (list6 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                    for (ConversationRecentMessage conversationRecentMessage : list6) {
                        if (conversationRecentMessage != null) {
                            C0YU2 c0yu2NewBuilder = conversationRecentMessage.newBuilder();
                            List<MessageBody> list7 = conversationRecentMessage.messages;
                            if (list7 != null) {
                                arrayList3 = new ArrayList(C15438062q.LJIJJ(list7, 10));
                                for (MessageBody messageBody7 : list7) {
                                    if (messageBody7 != null) {
                                        messageBodyLIZ2 = LIZ(messageBody7);
                                    } else {
                                        messageBodyLIZ2 = null;
                                    }
                                    arrayList3.add(messageBodyLIZ2);
                                }
                            } else {
                                arrayList3 = null;
                            }
                            c0yu2NewBuilder.getClass();
                            C1516540pZE.LIZ(arrayList3);
                            c0yu2NewBuilder.LJ = arrayList3;
                            conversationRecentMessageBuild = c0yu2NewBuilder.build();
                        } else {
                            conversationRecentMessageBuild = null;
                        }
                        arrayList2.add(conversationRecentMessageBuild);
                    }
                } else {
                    arrayList2 = null;
                }
                c0yssNewBuilder.getClass();
                C1516540pZE.LIZ(arrayList2);
                c0yssNewBuilder.LJ = arrayList2;
                getRecentMessageRespBodyBuild = c0yssNewBuilder.build();
            } else {
                getRecentMessageRespBodyBuild = null;
            }
            c1es1NewBuilder.LJJLL = getRecentMessageRespBodyBuild;
            GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody = responseBody.get_message_info_by_index_v2_range_body;
            if (getMessageInfoByIndexV2RangeResponseBody != null) {
                C0YR7 c0yr7NewBuilder = getMessageInfoByIndexV2RangeResponseBody.newBuilder();
                List<MessageInfo> list8 = getMessageInfoByIndexV2RangeResponseBody.infos;
                if (list8 != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list8, 10));
                    for (MessageInfo messageInfo : list8) {
                        if (messageInfo != null) {
                            C0YQP c0yqpNewBuilder = messageInfo.newBuilder();
                            MessageBody messageBody8 = messageInfo.body;
                            if (messageBody8 != null) {
                                messageBodyLIZ = LIZ(messageBody8);
                            } else {
                                messageBodyLIZ = null;
                            }
                            c0yqpNewBuilder.LJ = messageBodyLIZ;
                            messageInfoBuild = c0yqpNewBuilder.build();
                        } else {
                            messageInfoBuild = null;
                        }
                        arrayList.add(messageInfoBuild);
                    }
                } else {
                    arrayList = null;
                }
                c0yr7NewBuilder.getClass();
                C1516540pZE.LIZ(arrayList);
                c0yr7NewBuilder.LIZLLL = arrayList;
                getMessageInfoByIndexV2RangeResponseBodyBuild = c0yr7NewBuilder.build();
            } else {
                getMessageInfoByIndexV2RangeResponseBodyBuild = null;
            }
            c1es1NewBuilder.LJJZZI = getMessageInfoByIndexV2RangeResponseBodyBuild;
            GetMessageByIdResponseBody getMessageByIdResponseBody = responseBody.get_message_by_id_body;
            if (getMessageByIdResponseBody != null) {
                C0YQR c0yqrNewBuilder = getMessageByIdResponseBody.newBuilder();
                MessageInfo messageInfo2 = getMessageByIdResponseBody.msg_info;
                if (messageInfo2 != null) {
                    C0YQP c0yqpNewBuilder2 = messageInfo2.newBuilder();
                    MessageBody messageBody9 = messageInfo2.body;
                    if (messageBody9 != null) {
                        messageBodyLIZ9 = LIZ(messageBody9);
                    }
                    c0yqpNewBuilder2.LJ = messageBodyLIZ9;
                    messageInfoBuild2 = c0yqpNewBuilder2.build();
                }
                c0yqrNewBuilder.LIZLLL = messageInfoBuild2;
                getMessageByIdResponseBodyBuild = c0yqrNewBuilder.build();
            }
            c1es1NewBuilder.LJIIJ = getMessageByIdResponseBodyBuild;
            responseBodyLIZIZ = c1es1NewBuilder.build();
        }
        C0YON c0yonNewBuilder = response.newBuilder();
        c0yonNewBuilder.LJIIIIZZ = responseBodyLIZIZ;
        return c0yonNewBuilder.build();
    }

    public static final void LIZLLL(C0YEM c0yem, int i, String str, Request request) {
        try {
            if (C870740YDw.LIZJ(c0yem, Integer.valueOf(i))) {
                return;
            }
            Request requestLIZIZ = LIZIZ(c0yem, request);
            if (str.length() > 0) {
                C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PBLogUtils ");
                sbLIZ.append(str);
                C868780Y6i.LJIILIIL(c868780Y6iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
            }
            C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PBLogUtils Request : ");
            sbLIZ2.append(requestLIZIZ);
            c868780Y6iLIZLLL2.LIZ.LIZJ("imsdk", c868780Y6iLIZLLL2.LIZ(C2188811AlT.LIZIZ(sbLIZ2)), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL3 = c0yem.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PBLogUtils ");
            sbLIZ3.append(e);
            c868780Y6iLIZLLL3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
        }
    }

    public static final void LJ(C0YEM c0yem, int i, String str, Response response) {
        try {
            if (C870740YDw.LIZJ(c0yem, Integer.valueOf(i))) {
                return;
            }
            Response responseLIZJ = LIZJ(c0yem, response);
            if (str.length() > 0) {
                C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PBLogUtils ");
                sbLIZ.append(str);
                C868780Y6i.LJIILIIL(c868780Y6iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
            }
            C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PBLogUtils Response : ");
            sbLIZ2.append(responseLIZJ);
            c868780Y6iLIZLLL2.LIZ.LIZJ("imsdk", c868780Y6iLIZLLL2.LIZ(C2188811AlT.LIZIZ(sbLIZ2)), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL3 = c0yem.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PBLogUtils ");
            sbLIZ3.append(e);
            c868780Y6iLIZLLL3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
        }
    }
}
