package X;

import android.util.Pair;
import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.BizNewDirectPushNotify;
import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.CheckStatusMessagesResponseBody;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetMediaStatusResponseBody;
import com.bytedance.im.core.proto.GetMediaUploadConfigResponseBody;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.GetMessagePreviewResponseBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.bytedance.im.core.proto.InputStatusNotify;
import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.bytedance.im.core.proto.MarkMessageResponseBody;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody;
import com.bytedance.im.core.proto.MessagesPerConversationSearchResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserComboResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.PrefetchConversationIdResponseBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1ERz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281531ERz extends ProtoAdapter<ResponseBody> {
    public static final HashMap<Integer, ProtoAdapter> LIZ = new HashMap<>();

    public C2281531ERz() {
        super(FieldEncoding.LENGTH_DELIMITED, ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ResponseBody decode(ProtoReader protoReader) {
        C1ES1 c1es1 = new C1ES1();
        long jBeginMessage = protoReader.beginMessage();
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 100:
                        c1es1.LIZLLL = SendMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 200:
                        c1es1.LJ = MessagesPerUserResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 203:
                        c1es1.LJFF = MessagesPerUserInitV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 204:
                        c1es1.LJI = MessagesPerUserComboResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 206:
                        c1es1.LJII = MessagesPerConversationSearchResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 210:
                        c1es1.LJIIIIZZ = CheckMessagesPerUserResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 211:
                        c1es1.LJIIJ = GetMessageByIdResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 212:
                        c1es1.LJIIIZ = CheckStatusMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 301:
                        c1es1.LJIIJJI = MessagesInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 302:
                        c1es1.LJIIL = GetMessagesCheckInfoInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 303:
                        c1es1.LJIILIIL = GetMessagesCheckInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 304:
                        c1es1.LJIILJJIL = MessagesInConversationWithRangeResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 305:
                        c1es1.LJIILL = GetMessagePreviewResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 410:
                        c1es1.LJIILLIIL = C1C58.ADAPTER.decode(protoReader);
                        break;
                    case 411:
                        c1es1.LJIIZILJ = SendInputStatusResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 500:
                        c1es1.LJIJ = NewMessageNotify.ADAPTER.decode(protoReader);
                        break;
                    case 501:
                        c1es1.LJIJI = MarkConversationReadNotify.ADAPTER.decode(protoReader);
                        break;
                    case 503:
                        c1es1.LJIJJ = StrangerNewMessageNotify.ADAPTER.decode(protoReader);
                        break;
                    case 504:
                        c1es1.LJIJJLI = NewDirectPushNotify.ADAPTER.decode(protoReader);
                        break;
                    case 510:
                        c1es1.LJIL = InputStatusNotify.ADAPTER.decode(protoReader);
                        break;
                    case 511:
                        c1es1.LJJ = BizNewDirectPushNotify.ADAPTER.decode(protoReader);
                        break;
                    case 605:
                        c1es1.LJJIJIIJI = ConversationParticipantsListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 608:
                        c1es1.LJJIIJ = GetConversationInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 609:
                        c1es1.LJJIIJZLJL = CreateConversationV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 610:
                        c1es1.LJJIIZ = GetConversationInfoListV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 611:
                        c1es1.LJJIIZI = GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 612:
                        c1es1.LJJIJ = GetConversationInfoListByTopV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 613:
                        c1es1.LJJI = BatchMarkConversationReadResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 615:
                        c1es1.LJJIFFI = GetConversationsCheckInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 616:
                        c1es1.LJJII = GetConversationsCheckInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 617:
                        c1es1.LJJIII = BatchDeleteConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 650:
                        c1es1.LJJIJIIJIL = ConversationAddParticipantsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 651:
                        c1es1.LJJIJIL = ConversationRemoveParticipantsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 655:
                        c1es1.LJJIJL = UpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 656:
                        c1es1.LJJIJLIJ = BatchUpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 702:
                        c1es1.LJJIL = C1C52.ADAPTER.decode(protoReader);
                        break;
                    case 705:
                        c1es1.LJJIZ = ModifyMessagePropertyResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 706:
                        c1es1.LJJJ = AckMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 707:
                        c1es1.LJJJI = C1C4S.ADAPTER.decode(protoReader);
                        break;
                    case 902:
                        c1es1.LJJJIL = SetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 904:
                        c1es1.LJJJJ = UpsertConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 921:
                        c1es1.LJJJJI = SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 922:
                        c1es1.LJJJJIZL = UpsertConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 924:
                        c1es1.LJJJJJ = BatchSetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                        c1es1.LJJJJJL = GetStrangerConversationListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1001:
                        c1es1.LJJJJL = GetStrangerMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1002:
                        c1es1.LJJJJLI = C2224531C4t.ADAPTER.decode(protoReader);
                        break;
                    case 1003:
                        c1es1.LJJJJLL = C2224501C4q.ADAPTER.decode(protoReader);
                        break;
                    case 1004:
                        c1es1.LJJJJZ = C2224471C4n.ADAPTER.decode(protoReader);
                        break;
                    case 1005:
                        c1es1.LJJJJZI = C2224381C4e.ADAPTER.decode(protoReader);
                        break;
                    case 1006:
                        c1es1.LJJJLIIL = C2224351C4b.ADAPTER.decode(protoReader);
                        break;
                    case 1007:
                        c1es1.LJJJLL = GetStrangerUnreadCountResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1009:
                        c1es1.LJJJLZIJ = DeleteMultiStrangerConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1010:
                        c1es1.LJJJZ = MarkMultiStrangerConversationReadResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2000:
                        c1es1.LJJL = GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2001:
                        c1es1.LJJLI = GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2005:
                        c1es1.LJJLIIIIJ = GetTicketResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2006:
                        c1es1.LJJLIIIJ = GetUserConversationListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2009:
                        c1es1.LJJLIIIJILLIZJL = BroadcastUserCounterResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2016:
                        c1es1.LJJLIIIJJI = C1C55.ADAPTER.decode(protoReader);
                        break;
                    case 2017:
                        c1es1.LJJLIIIJJIZ = GetConfigsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2018:
                        c1es1.LJJLIIIJL = UnReadCountReportResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2019:
                        c1es1.LJJLIIIJLJLI = BlockMembersResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2020:
                        c1es1.LJJLIIIJLLLLLLLZ = C1C4Y.ADAPTER.decode(protoReader);
                        break;
                    case 2035:
                        c1es1.LJJLIIJ = GetMessageInfoByIndexV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2036:
                        c1es1.LJJLIL = MarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2037:
                        c1es1.LJJLJ = PullMarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2038:
                        c1es1.LJJLJLI = BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2039:
                        c1es1.LJJLL = GetRecentMessageRespBody.ADAPTER.decode(protoReader);
                        break;
                    case 2040:
                        c1es1.LJJZ = GetCmdMessageRespBody.ADAPTER.decode(protoReader);
                        break;
                    case 2041:
                        c1es1.LJJZZI = GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2043:
                        c1es1.LJJZZIII = MessageByInitResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2044:
                        c1es1.LJL = PreviewerMessagesInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2045:
                        c1es1.LJLI = PreviewerGetConversationInfoListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2054:
                        c1es1.LJLIIIL = MarkMsgUnreadCountReportResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2055:
                        c1es1.LJLIIL = MarkMsgGetUnreadCountResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2056:
                        c1es1.LJLIL = BatchUnmarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2057:
                        c1es1.LJLILLLLZI = C2224411C4h.ADAPTER.decode(protoReader);
                        break;
                    case 2059:
                        c1es1.LJLJI = GetMediaUploadConfigResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2060:
                        c1es1.LJLJJI = GetMediaStatusResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2103:
                        c1es1.LJLJJL = ConversationMessagePreViewResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2200:
                        c1es1.LJLJJLL = GetMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2201:
                        c1es1.LJLJL = BatchGetMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2202:
                        c1es1.LJLJLJ = PrefetchConversationIdResponseBody.ADAPTER.decode(protoReader);
                        break;
                    default:
                        HashMap<Integer, ProtoAdapter> map = LIZ;
                        if (map.get(Integer.valueOf(iNextTag)) != null) {
                            ProtoAdapter protoAdapter = map.get(Integer.valueOf(iNextTag));
                            Object objDecode = map.get(Integer.valueOf(iNextTag)).decode(protoReader);
                            c1es1.LJLJLLL.put(Integer.valueOf(iNextTag), new Pair<>(protoAdapter, objDecode));
                            c1es1.LJLL.put(objDecode.getClass().getSimpleName(), objDecode);
                        }
                        break;
                }
            } else {
                protoReader.endMessage(jBeginMessage);
                return c1es1.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        int iEncodedSizeWithTag = SendMessageResponseBody.ADAPTER.encodedSizeWithTag(100, responseBody2.send_message_body) + MessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(200, responseBody2.messages_per_user_body) + MessagesPerUserInitV2ResponseBody.ADAPTER.encodedSizeWithTag(203, responseBody2.messages_per_user_init_v2_body) + MessagesPerUserComboResponseBody.ADAPTER.encodedSizeWithTag(204, responseBody2.messages_per_user_combo_body) + MessagesPerConversationSearchResponseBody.ADAPTER.encodedSizeWithTag(206, responseBody2.messages_per_conversation_search_body) + CheckMessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(210, responseBody2.check_messages_per_user_body) + CheckStatusMessagesResponseBody.ADAPTER.encodedSizeWithTag(212, responseBody2.check_status_message_body) + GetMessageByIdResponseBody.ADAPTER.encodedSizeWithTag(211, responseBody2.get_message_by_id_body) + MessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(301, responseBody2.messages_in_conversation_body) + GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodedSizeWithTag(302, responseBody2.get_messages_checkinfo_in_conversation_body) + GetMessagesCheckInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(303, responseBody2.get_message_check_info_v2_body) + MessagesInConversationWithRangeResponseBody.ADAPTER.encodedSizeWithTag(304, responseBody2.messages_in_conversation_with_range) + GetMessagePreviewResponseBody.ADAPTER.encodedSizeWithTag(305, responseBody2.get_message_preview_body) + C1C58.ADAPTER.encodedSizeWithTag(410, responseBody2.send_user_action_body) + SendInputStatusResponseBody.ADAPTER.encodedSizeWithTag(411, responseBody2.send_input_status_body) + NewMessageNotify.ADAPTER.encodedSizeWithTag(500, responseBody2.has_new_message_notify) + MarkConversationReadNotify.ADAPTER.encodedSizeWithTag(501, responseBody2.mark_conversation_read_notify) + StrangerNewMessageNotify.ADAPTER.encodedSizeWithTag(503, responseBody2.stranger_has_new_message_notify) + NewDirectPushNotify.ADAPTER.encodedSizeWithTag(504, responseBody2.has_new_direct_push_notify) + InputStatusNotify.ADAPTER.encodedSizeWithTag(510, responseBody2.input_status_notify) + BizNewDirectPushNotify.ADAPTER.encodedSizeWithTag(511, responseBody2.biz_has_new_direct_push_notify) + BatchMarkConversationReadResponseBody.ADAPTER.encodedSizeWithTag(613, responseBody2.batch_mark_read_body) + GetConversationsCheckInfoResponseBody.ADAPTER.encodedSizeWithTag(615, responseBody2.get_conversations_checkinfo_body) + GetConversationsCheckInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(616, responseBody2.get_conversations_check_info_v2_body) + BatchDeleteConversationResponseBody.ADAPTER.encodedSizeWithTag(617, responseBody2.batch_delete_conversation_body) + GetConversationInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(608, responseBody2.get_conversation_info_v2_body) + CreateConversationV2ResponseBody.ADAPTER.encodedSizeWithTag(609, responseBody2.create_conversation_v2_body) + GetConversationInfoListV2ResponseBody.ADAPTER.encodedSizeWithTag(610, responseBody2.get_conversation_info_list_v2_body) + GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodedSizeWithTag(611, responseBody2.get_conversation_info_list_by_favorite_v2_body) + GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodedSizeWithTag(612, responseBody2.get_conversation_info_list_by_top_v2_body) + ConversationParticipantsListResponseBody.ADAPTER.encodedSizeWithTag(605, responseBody2.conversation_participants_body) + ConversationAddParticipantsResponseBody.ADAPTER.encodedSizeWithTag(650, responseBody2.conversation_add_participants_body) + ConversationRemoveParticipantsResponseBody.ADAPTER.encodedSizeWithTag(651, responseBody2.conversation_remove_participants_body) + UpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(655, responseBody2.update_conversation_participant_body) + BatchUpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(656, responseBody2.batch_update_conversation_participant_body) + C1C52.ADAPTER.encodedSizeWithTag(702, responseBody2.recall_message_body) + ModifyMessagePropertyResponseBody.ADAPTER.encodedSizeWithTag(705, responseBody2.modify_message_property_body) + AckMessageResponseBody.ADAPTER.encodedSizeWithTag(706, responseBody2.ack_message_body) + C1C4S.ADAPTER.encodedSizeWithTag(707, responseBody2.batch_ack_message_body) + SetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(902, responseBody2.set_conversation_core_info_body) + UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(904, responseBody2.upsert_conversation_core_ext_info_body) + SetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(921, responseBody2.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(922, responseBody2.upsert_conversation_setting_ext_info_body) + BatchSetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(924, responseBody2.batch_set_conversation_setting_info_body) + GetStrangerConversationListResponseBody.ADAPTER.encodedSizeWithTag(LSPassThroughRecordSizeConfig.DEFAULT, responseBody2.get_stranger_conversation_body) + GetStrangerMessagesResponseBody.ADAPTER.encodedSizeWithTag(1001, responseBody2.get_stranger_messages_body) + C2224531C4t.ADAPTER.encodedSizeWithTag(1002, responseBody2.delete_stranger_message_body) + C2224501C4q.ADAPTER.encodedSizeWithTag(1003, responseBody2.delete_stranger_conversation_body) + C2224471C4n.ADAPTER.encodedSizeWithTag(1004, responseBody2.delete_stranger_all_conversation_body) + C2224381C4e.ADAPTER.encodedSizeWithTag(1005, responseBody2.mark_stranger_conversation_read_body) + C2224351C4b.ADAPTER.encodedSizeWithTag(1006, responseBody2.mark_stranger_all_conversation_read_body) + GetStrangerUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(1007, responseBody2.get_stranger_unread_count_body) + DeleteMultiStrangerConversationResponseBody.ADAPTER.encodedSizeWithTag(1009, responseBody2.delete_multi_stranger_conversation_body) + MarkMultiStrangerConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1010, responseBody2.mark_multi_stranger_conversation_read_body) + GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2000, responseBody2.participants_read_index_body) + GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2001, responseBody2.participants_min_index_body) + GetTicketResponseBody.ADAPTER.encodedSizeWithTag(2005, responseBody2.get_ticket_body) + GetUserConversationListResponseBody.ADAPTER.encodedSizeWithTag(2006, responseBody2.get_conversation_list_body) + BroadcastUserCounterResponseBody.ADAPTER.encodedSizeWithTag(2009, responseBody2.broadcast_user_counter_body) + C1C55.ADAPTER.encodedSizeWithTag(2016, responseBody2.report_client_metrics_body) + GetConfigsResponseBody.ADAPTER.encodedSizeWithTag(2017, responseBody2.get_configs_body) + UnReadCountReportResponseBody.ADAPTER.encodedSizeWithTag(2018, responseBody2.unread_count_report_body) + BlockMembersResponseBody.ADAPTER.encodedSizeWithTag(2019, responseBody2.block_members_body) + C1C4Y.ADAPTER.encodedSizeWithTag(2020, responseBody2.block_conversation_body) + GetMessageInfoByIndexV2ResponseBody.ADAPTER.encodedSizeWithTag(2035, responseBody2.get_message_info_by_index_v2_body) + MarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2036, responseBody2.mark_message_body) + PullMarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2037, responseBody2.pull_mark_message_body) + BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.encodedSizeWithTag(2038, responseBody2.batch_get_conversation_participants_readindex) + GetRecentMessageRespBody.ADAPTER.encodedSizeWithTag(2039, responseBody2.get_recent_message_body) + GetCmdMessageRespBody.ADAPTER.encodedSizeWithTag(2040, responseBody2.get_cmd_message_body) + GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.encodedSizeWithTag(2041, responseBody2.get_message_info_by_index_v2_range_body) + MessageByInitResponseBody.ADAPTER.encodedSizeWithTag(2043, responseBody2.message_by_init) + PreviewerMessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(2044, responseBody2.previewer_messages_in_conversation_body) + PreviewerGetConversationInfoListResponseBody.ADAPTER.encodedSizeWithTag(2045, responseBody2.previewer_get_conversation_info_list_body) + MarkMsgUnreadCountReportResponseBody.ADAPTER.encodedSizeWithTag(2054, responseBody2.mark_msg_unread_count_report) + MarkMsgGetUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(2055, responseBody2.mark_msg_get_unread_count) + BatchUnmarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2056, responseBody2.batch_unmark_message) + C2224411C4h.ADAPTER.encodedSizeWithTag(2057, responseBody2.client_batch_ack_body) + GetMediaUploadConfigResponseBody.ADAPTER.encodedSizeWithTag(2059, responseBody2.media_upload_config_response_body) + GetMediaStatusResponseBody.ADAPTER.encodedSizeWithTag(2060, responseBody2.media_status_response_body) + ConversationMessagePreViewResponseBody.ADAPTER.encodedSizeWithTag(2103, responseBody2.conversation_message_pre_view_body) + GetMessagesResponseBody.ADAPTER.encodedSizeWithTag(2200, responseBody2.get_messages_body) + BatchGetMessagesResponseBody.ADAPTER.encodedSizeWithTag(2201, responseBody2.batch_get_messages_body) + PrefetchConversationIdResponseBody.ADAPTER.encodedSizeWithTag(2202, responseBody2.prefetch_conversation_id_body) + responseBody2.unknownFields().size();
        for (Map.Entry<Integer, ProtoAdapter> entry : LIZ.entrySet()) {
            if (responseBody2.extensions.get(entry.getKey()) != null) {
                iEncodedSizeWithTag += entry.getValue().encodedSizeWithTag(entry.getKey().intValue(), responseBody2.extensions.get(entry.getKey()).second);
            }
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        SendMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 100, responseBody2.send_message_body);
        MessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 200, responseBody2.messages_per_user_body);
        MessagesPerUserInitV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 203, responseBody2.messages_per_user_init_v2_body);
        MessagesPerUserComboResponseBody.ADAPTER.encodeWithTag(protoWriter, 204, responseBody2.messages_per_user_combo_body);
        MessagesPerConversationSearchResponseBody.ADAPTER.encodeWithTag(protoWriter, 206, responseBody2.messages_per_conversation_search_body);
        CheckMessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 210, responseBody2.check_messages_per_user_body);
        CheckStatusMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 212, responseBody2.check_status_message_body);
        GetMessageByIdResponseBody.ADAPTER.encodeWithTag(protoWriter, 211, responseBody2.get_message_by_id_body);
        MessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 301, responseBody2.messages_in_conversation_body);
        GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 302, responseBody2.get_messages_checkinfo_in_conversation_body);
        GetMessagesCheckInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 303, responseBody2.get_message_check_info_v2_body);
        MessagesInConversationWithRangeResponseBody.ADAPTER.encodeWithTag(protoWriter, 304, responseBody2.messages_in_conversation_with_range);
        GetMessagePreviewResponseBody.ADAPTER.encodeWithTag(protoWriter, 305, responseBody2.get_message_preview_body);
        C1C58.ADAPTER.encodeWithTag(protoWriter, 410, responseBody2.send_user_action_body);
        SendInputStatusResponseBody.ADAPTER.encodeWithTag(protoWriter, 411, responseBody2.send_input_status_body);
        NewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 500, responseBody2.has_new_message_notify);
        MarkConversationReadNotify.ADAPTER.encodeWithTag(protoWriter, 501, responseBody2.mark_conversation_read_notify);
        StrangerNewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 503, responseBody2.stranger_has_new_message_notify);
        NewDirectPushNotify.ADAPTER.encodeWithTag(protoWriter, 504, responseBody2.has_new_direct_push_notify);
        InputStatusNotify.ADAPTER.encodeWithTag(protoWriter, 510, responseBody2.input_status_notify);
        BizNewDirectPushNotify.ADAPTER.encodeWithTag(protoWriter, 511, responseBody2.biz_has_new_direct_push_notify);
        BatchMarkConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 613, responseBody2.batch_mark_read_body);
        GetConversationsCheckInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 615, responseBody2.get_conversations_checkinfo_body);
        GetConversationsCheckInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 616, responseBody2.get_conversations_check_info_v2_body);
        BatchDeleteConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 617, responseBody2.batch_delete_conversation_body);
        GetConversationInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 608, responseBody2.get_conversation_info_v2_body);
        CreateConversationV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 609, responseBody2.create_conversation_v2_body);
        GetConversationInfoListV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 610, responseBody2.get_conversation_info_list_v2_body);
        GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 611, responseBody2.get_conversation_info_list_by_favorite_v2_body);
        GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 612, responseBody2.get_conversation_info_list_by_top_v2_body);
        ConversationParticipantsListResponseBody.ADAPTER.encodeWithTag(protoWriter, 605, responseBody2.conversation_participants_body);
        ConversationAddParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 650, responseBody2.conversation_add_participants_body);
        ConversationRemoveParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 651, responseBody2.conversation_remove_participants_body);
        UpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 655, responseBody2.update_conversation_participant_body);
        BatchUpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 656, responseBody2.batch_update_conversation_participant_body);
        C1C52.ADAPTER.encodeWithTag(protoWriter, 702, responseBody2.recall_message_body);
        ModifyMessagePropertyResponseBody.ADAPTER.encodeWithTag(protoWriter, 705, responseBody2.modify_message_property_body);
        AckMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 706, responseBody2.ack_message_body);
        C1C4S.ADAPTER.encodeWithTag(protoWriter, 707, responseBody2.batch_ack_message_body);
        SetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 902, responseBody2.set_conversation_core_info_body);
        UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 904, responseBody2.upsert_conversation_core_ext_info_body);
        SetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 921, responseBody2.set_conversation_setting_info_body);
        UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 922, responseBody2.upsert_conversation_setting_ext_info_body);
        BatchSetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 924, responseBody2.batch_set_conversation_setting_info_body);
        GetStrangerConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, LSPassThroughRecordSizeConfig.DEFAULT, responseBody2.get_stranger_conversation_body);
        GetStrangerMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 1001, responseBody2.get_stranger_messages_body);
        C2224531C4t.ADAPTER.encodeWithTag(protoWriter, 1002, responseBody2.delete_stranger_message_body);
        C2224501C4q.ADAPTER.encodeWithTag(protoWriter, 1003, responseBody2.delete_stranger_conversation_body);
        C2224471C4n.ADAPTER.encodeWithTag(protoWriter, 1004, responseBody2.delete_stranger_all_conversation_body);
        C2224381C4e.ADAPTER.encodeWithTag(protoWriter, 1005, responseBody2.mark_stranger_conversation_read_body);
        C2224351C4b.ADAPTER.encodeWithTag(protoWriter, 1006, responseBody2.mark_stranger_all_conversation_read_body);
        GetStrangerUnreadCountResponseBody.ADAPTER.encodeWithTag(protoWriter, 1007, responseBody2.get_stranger_unread_count_body);
        DeleteMultiStrangerConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 1009, responseBody2.delete_multi_stranger_conversation_body);
        MarkMultiStrangerConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1010, responseBody2.mark_multi_stranger_conversation_read_body);
        GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2000, responseBody2.participants_read_index_body);
        GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2001, responseBody2.participants_min_index_body);
        GetTicketResponseBody.ADAPTER.encodeWithTag(protoWriter, 2005, responseBody2.get_ticket_body);
        GetUserConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 2006, responseBody2.get_conversation_list_body);
        BroadcastUserCounterResponseBody.ADAPTER.encodeWithTag(protoWriter, 2009, responseBody2.broadcast_user_counter_body);
        C1C55.ADAPTER.encodeWithTag(protoWriter, 2016, responseBody2.report_client_metrics_body);
        GetConfigsResponseBody.ADAPTER.encodeWithTag(protoWriter, 2017, responseBody2.get_configs_body);
        UnReadCountReportResponseBody.ADAPTER.encodeWithTag(protoWriter, 2018, responseBody2.unread_count_report_body);
        BlockMembersResponseBody.ADAPTER.encodeWithTag(protoWriter, 2019, responseBody2.block_members_body);
        C1C4Y.ADAPTER.encodeWithTag(protoWriter, 2020, responseBody2.block_conversation_body);
        GetMessageInfoByIndexV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 2035, responseBody2.get_message_info_by_index_v2_body);
        MarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2036, responseBody2.mark_message_body);
        PullMarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2037, responseBody2.pull_mark_message_body);
        BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.encodeWithTag(protoWriter, 2038, responseBody2.batch_get_conversation_participants_readindex);
        GetRecentMessageRespBody.ADAPTER.encodeWithTag(protoWriter, 2039, responseBody2.get_recent_message_body);
        GetCmdMessageRespBody.ADAPTER.encodeWithTag(protoWriter, 2040, responseBody2.get_cmd_message_body);
        GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.encodeWithTag(protoWriter, 2041, responseBody2.get_message_info_by_index_v2_range_body);
        MessageByInitResponseBody.ADAPTER.encodeWithTag(protoWriter, 2043, responseBody2.message_by_init);
        PreviewerMessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 2044, responseBody2.previewer_messages_in_conversation_body);
        PreviewerGetConversationInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 2045, responseBody2.previewer_get_conversation_info_list_body);
        MarkMsgUnreadCountReportResponseBody.ADAPTER.encodeWithTag(protoWriter, 2054, responseBody2.mark_msg_unread_count_report);
        MarkMsgGetUnreadCountResponseBody.ADAPTER.encodeWithTag(protoWriter, 2055, responseBody2.mark_msg_get_unread_count);
        BatchUnmarkMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 2056, responseBody2.batch_unmark_message);
        C2224411C4h.ADAPTER.encodeWithTag(protoWriter, 2057, responseBody2.client_batch_ack_body);
        GetMediaUploadConfigResponseBody.ADAPTER.encodeWithTag(protoWriter, 2059, responseBody2.media_upload_config_response_body);
        GetMediaStatusResponseBody.ADAPTER.encodeWithTag(protoWriter, 2060, responseBody2.media_status_response_body);
        ConversationMessagePreViewResponseBody.ADAPTER.encodeWithTag(protoWriter, 2103, responseBody2.conversation_message_pre_view_body);
        GetMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 2200, responseBody2.get_messages_body);
        BatchGetMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 2201, responseBody2.batch_get_messages_body);
        PrefetchConversationIdResponseBody.ADAPTER.encodeWithTag(protoWriter, 2202, responseBody2.prefetch_conversation_id_body);
        for (Map.Entry<Integer, ProtoAdapter> entry : LIZ.entrySet()) {
            if (responseBody2.extensions.get(entry.getKey()) != null) {
                entry.getValue().encodeWithTag(protoWriter, entry.getKey().intValue(), responseBody2.extensions.get(entry.getKey()).second);
            }
        }
        protoWriter.writeBytes(responseBody2.unknownFields());
    }
}
