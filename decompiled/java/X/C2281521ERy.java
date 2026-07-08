package X;

import android.util.Pair;
import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.CheckStatusMessagesRequestBody;
import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.bytedance.im.core.proto.GetMediaStatusRequestBody;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.bytedance.im.core.proto.GetMessagePreviewRequestBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeRequestBody;
import com.bytedance.im.core.proto.MessagesPerConversationSearchRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserComboRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.PrefetchConversationIdRequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1ERy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281521ERy extends ProtoAdapter<RequestBody> {
    public static final HashMap<Integer, ProtoAdapter> LIZ = new HashMap<>();

    public C2281521ERy() {
        super(FieldEncoding.LENGTH_DELIMITED, RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RequestBody decode(ProtoReader protoReader) {
        C1ES0 c1es0 = new C1ES0();
        long jBeginMessage = protoReader.beginMessage();
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 100:
                        c1es0.LIZLLL = SendMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 200:
                        c1es0.LJ = MessagesPerUserRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 203:
                        c1es0.LJFF = MessagesPerUserInitV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 204:
                        c1es0.LJI = MessagesPerUserComboRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 206:
                        c1es0.LJII = MessagesPerConversationSearchRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 210:
                        c1es0.LJIIIIZZ = CheckMessagePerUserRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 211:
                        c1es0.LJIIJ = GetMessageByIdRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 212:
                        c1es0.LJIIIZ = CheckStatusMessagesRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 301:
                        c1es0.LJIIJJI = MessagesInConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 302:
                        c1es0.LJIIL = GetMessagesCheckInfoInConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 303:
                        c1es0.LJIILIIL = GetMessagesCheckInfoV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 304:
                        c1es0.LJIILJJIL = MessagesInConversationWithRangeRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 305:
                        c1es0.LJIILL = GetMessagePreviewRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 410:
                        c1es0.LJIILLIIL = SendUserActionRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 411:
                        c1es0.LJIIZILJ = SendInputStatusRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 603:
                        c1es0.LJIJ = DeleteConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 604:
                        c1es0.LJIJI = MarkConversationReadRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 605:
                        c1es0.LJIJJ = ConversationParticipantsListRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 608:
                        c1es0.LJIJJLI = GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 609:
                        c1es0.LJIL = CreateConversationV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 610:
                        c1es0.LJJ = GetConversationInfoListV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 611:
                        c1es0.LJJI = ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 612:
                        c1es0.LJJIFFI = ConversationsPerUserByTopV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 613:
                        c1es0.LJJII = BatchMarkConversationReadRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 614:
                        c1es0.LJJIII = DissolveConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 615:
                        c1es0.LJJIIJ = C2224591C4z.ADAPTER.decode(protoReader);
                        break;
                    case 616:
                        c1es0.LJJIIJZLJL = GetConversationsCheckInfoV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 617:
                        c1es0.LJJIIZ = BatchDeleteConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 650:
                        c1es0.LJJIIZI = ConversationAddParticipantsRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 651:
                        c1es0.LJJIJ = ConversationRemoveParticipantsRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 652:
                        c1es0.LJJIJIIJI = ConversationLeaveRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 655:
                        c1es0.LJJIJIIJIL = UpdateConversationParticipantRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 656:
                        c1es0.LJJIJIL = BatchUpdateConversationParticipantRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 701:
                        c1es0.LJJIJL = DeleteMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 702:
                        c1es0.LJJIJLIJ = RecallMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 705:
                        c1es0.LJJIL = ModifyMessagePropertyRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 706:
                        c1es0.LJJIZ = AckMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 707:
                        c1es0.LJJJ = BatchAckMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 902:
                        c1es0.LJJJI = SetConversationCoreInfoRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 904:
                        c1es0.LJJJIL = UpsertConversationCoreExtInfoRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 921:
                        c1es0.LJJJJ = SetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 922:
                        c1es0.LJJJJI = UpsertConversationSettingExtInfoRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 924:
                        c1es0.LJJJJIZL = BatchSetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                        c1es0.LJJJJJ = GetStrangerConversationListRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1001:
                        c1es0.LJJJJJL = GetStrangerMessagesRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1002:
                        c1es0.LJJJJL = DeleteStrangerMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1003:
                        c1es0.LJJJJLI = DeleteStrangerConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1004:
                        c1es0.LJJJJLL = C2224441C4k.ADAPTER.decode(protoReader);
                        break;
                    case 1005:
                        c1es0.LJJJJZ = MarkStrangerConversationReadRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1006:
                        c1es0.LJJJJZI = C1C4V.ADAPTER.decode(protoReader);
                        break;
                    case 1009:
                        c1es0.LJJJLIIL = DeleteMultiStrangerConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 1010:
                        c1es0.LJJJLL = MarkMultiStrangerConversationReadRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2000:
                        c1es0.LJJJLZIJ = GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2001:
                        c1es0.LJJJZ = GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2005:
                        c1es0.LJJL = GetTicketRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2006:
                        c1es0.LJJLI = GetUserConversationListRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2009:
                        c1es0.LJJLIIIIJ = BroadcastUserCounterRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2010:
                        c1es0.LJJLIIIJ = ClientACKRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2016:
                        c1es0.LJJLIIIJILLIZJL = ReportClientMetricsRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2017:
                        c1es0.LJJLIIIJJI = C2224561C4w.ADAPTER.decode(protoReader);
                        break;
                    case 2018:
                        c1es0.LJJLIIIJJIZ = UnReadCountReportRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2019:
                        c1es0.LJJLIIIJL = BlockMembersRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2020:
                        c1es0.LJJLIIIJLJLI = BlockConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2031:
                        c1es0.LJJLIIIJLLLLLLLZ = SendMessageP2PRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2035:
                        c1es0.LJJLIIJ = GetMessageInfoByIndexV2RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2036:
                        c1es0.LJJLIL = MarkMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2037:
                        c1es0.LJJLJ = PullMarkMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2038:
                        c1es0.LJJLJLI = BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2039:
                        c1es0.LJJLL = GetRecentMessageReqBody.ADAPTER.decode(protoReader);
                        break;
                    case 2040:
                        c1es0.LJJZ = GetCmdMessageReqBody.ADAPTER.decode(protoReader);
                        break;
                    case 2041:
                        c1es0.LJJZZI = GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2043:
                        c1es0.LJJZZIII = MessageByInitRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2044:
                        c1es0.LJL = PreviewerMessagesInConversationRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2045:
                        c1es0.LJLI = PreviewerGetConversationInfoListRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2054:
                        c1es0.LJLIIIL = MarkMsgUnreadCountReportRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2055:
                        c1es0.LJLIIL = MarkMsgGetUnreadCountRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2056:
                        c1es0.LJLIL = BatchUnmarkMessageRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2057:
                        c1es0.LJLILLLLZI = ClientBatchACKRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2059:
                        c1es0.LJLJI = C0YOB.ADAPTER.decode(protoReader);
                        break;
                    case 2060:
                        c1es0.LJLJJI = GetMediaStatusRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2102:
                        c1es0.LJLJJL = ConversationMessageSearchRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2103:
                        c1es0.LJLJJLL = ConversationMessagePreViewRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2200:
                        c1es0.LJLJL = GetMessagesRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2201:
                        c1es0.LJLJLJ = BatchGetMessagesRequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 2202:
                        c1es0.LJLJLLL = PrefetchConversationIdRequestBody.ADAPTER.decode(protoReader);
                        break;
                    default:
                        HashMap<Integer, ProtoAdapter> map = LIZ;
                        if (map.get(Integer.valueOf(iNextTag)) != null) {
                            ProtoAdapter protoAdapter = map.get(Integer.valueOf(iNextTag));
                            Object objDecode = map.get(Integer.valueOf(iNextTag)).decode(protoReader);
                            c1es0.LJLL.put(Integer.valueOf(iNextTag), new Pair<>(protoAdapter, objDecode));
                            c1es0.LJLLI.put(objDecode.getClass().getSimpleName(), objDecode);
                        }
                        break;
                }
            } else {
                protoReader.endMessage(jBeginMessage);
                return c1es0.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RequestBody requestBody) {
        RequestBody requestBody2 = requestBody;
        int iEncodedSizeWithTag = SendMessageRequestBody.ADAPTER.encodedSizeWithTag(100, requestBody2.send_message_body) + MessagesPerUserRequestBody.ADAPTER.encodedSizeWithTag(200, requestBody2.messages_per_user_body) + MessagesPerUserInitV2RequestBody.ADAPTER.encodedSizeWithTag(203, requestBody2.messages_per_user_init_v2_body) + MessagesPerUserComboRequestBody.ADAPTER.encodedSizeWithTag(204, requestBody2.messages_per_user_combo_body) + MessagesPerConversationSearchRequestBody.ADAPTER.encodedSizeWithTag(206, requestBody2.messages_per_conversation_search_body) + CheckMessagePerUserRequestBody.ADAPTER.encodedSizeWithTag(210, requestBody2.check_messages_per_user_body) + CheckStatusMessagesRequestBody.ADAPTER.encodedSizeWithTag(212, requestBody2.check_status_messages_body) + GetMessageByIdRequestBody.ADAPTER.encodedSizeWithTag(211, requestBody2.get_message_by_id_body) + MessagesInConversationRequestBody.ADAPTER.encodedSizeWithTag(301, requestBody2.messages_in_conversation_body) + GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodedSizeWithTag(302, requestBody2.get_messages_checkinfo_in_conversation_body) + GetMessagesCheckInfoV2RequestBody.ADAPTER.encodedSizeWithTag(303, requestBody2.get_messages_check_info_v2_body) + MessagesInConversationWithRangeRequestBody.ADAPTER.encodedSizeWithTag(304, requestBody2.messages_in_conversation_with_range) + GetMessagePreviewRequestBody.ADAPTER.encodedSizeWithTag(305, requestBody2.get_message_preview_body) + SendUserActionRequestBody.ADAPTER.encodedSizeWithTag(410, requestBody2.send_user_action_body) + SendInputStatusRequestBody.ADAPTER.encodedSizeWithTag(411, requestBody2.send_input_status_body) + DeleteConversationRequestBody.ADAPTER.encodedSizeWithTag(603, requestBody2.delete_conversation_body) + MarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(604, requestBody2.mark_conversation_read_body) + ConversationParticipantsListRequestBody.ADAPTER.encodedSizeWithTag(605, requestBody2.conversation_participants_body) + GetConversationInfoV2RequestBody.ADAPTER.encodedSizeWithTag(608, requestBody2.get_conversation_info_v2_body) + CreateConversationV2RequestBody.ADAPTER.encodedSizeWithTag(609, requestBody2.create_conversation_v2_body) + GetConversationInfoListV2RequestBody.ADAPTER.encodedSizeWithTag(610, requestBody2.get_conversation_info_list_v2_body) + ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodedSizeWithTag(611, requestBody2.get_conversation_info_list_by_favorite_v2_body) + ConversationsPerUserByTopV2RequestBody.ADAPTER.encodedSizeWithTag(612, requestBody2.get_conversation_info_list_by_top_v2_body) + BatchMarkConversationReadRequestBody.ADAPTER.encodedSizeWithTag(613, requestBody2.batch_mark_read_body) + DissolveConversationRequestBody.ADAPTER.encodedSizeWithTag(614, requestBody2.dissolve_conversation_body) + C2224591C4z.ADAPTER.encodedSizeWithTag(615, requestBody2.get_conversations_checkinfo_body) + GetConversationsCheckInfoV2RequestBody.ADAPTER.encodedSizeWithTag(616, requestBody2.get_conversation_check_info_v2_body) + BatchDeleteConversationRequestBody.ADAPTER.encodedSizeWithTag(617, requestBody2.batch_delete_conversation_body) + ConversationAddParticipantsRequestBody.ADAPTER.encodedSizeWithTag(650, requestBody2.conversation_add_participants_body) + ConversationRemoveParticipantsRequestBody.ADAPTER.encodedSizeWithTag(651, requestBody2.conversation_remove_participants_body) + ConversationLeaveRequestBody.ADAPTER.encodedSizeWithTag(652, requestBody2.leave_conversation_body) + UpdateConversationParticipantRequestBody.ADAPTER.encodedSizeWithTag(655, requestBody2.update_conversation_participant_body) + BatchUpdateConversationParticipantRequestBody.ADAPTER.encodedSizeWithTag(656, requestBody2.batch_update_conversation_participant_body) + DeleteMessageRequestBody.ADAPTER.encodedSizeWithTag(701, requestBody2.delete_message_body) + RecallMessageRequestBody.ADAPTER.encodedSizeWithTag(702, requestBody2.recall_message_body) + ModifyMessagePropertyRequestBody.ADAPTER.encodedSizeWithTag(705, requestBody2.modify_message_property_body) + AckMessageRequestBody.ADAPTER.encodedSizeWithTag(706, requestBody2.ack_message_body) + BatchAckMessageRequestBody.ADAPTER.encodedSizeWithTag(707, requestBody2.batch_ack_message_body) + SetConversationCoreInfoRequestBody.ADAPTER.encodedSizeWithTag(902, requestBody2.set_conversation_core_info_body) + UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodedSizeWithTag(904, requestBody2.upsert_conversation_core_ext_info_body) + SetConversationSettingInfoRequestBody.ADAPTER.encodedSizeWithTag(921, requestBody2.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodedSizeWithTag(922, requestBody2.upsert_conversation_setting_ext_info_body) + BatchSetConversationSettingInfoRequestBody.ADAPTER.encodedSizeWithTag(924, requestBody2.batch_set_conversation_setting_info_body) + GetStrangerConversationListRequestBody.ADAPTER.encodedSizeWithTag(LSPassThroughRecordSizeConfig.DEFAULT, requestBody2.get_stranger_conversation_body) + GetStrangerMessagesRequestBody.ADAPTER.encodedSizeWithTag(1001, requestBody2.get_stranger_messages_body) + DeleteStrangerMessageRequestBody.ADAPTER.encodedSizeWithTag(1002, requestBody2.delete_stranger_message_body) + DeleteStrangerConversationRequestBody.ADAPTER.encodedSizeWithTag(1003, requestBody2.delete_stranger_conversation_body) + C2224441C4k.ADAPTER.encodedSizeWithTag(1004, requestBody2.delete_stranger_all_conversation_body) + MarkStrangerConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1005, requestBody2.mark_stranger_conversation_read_body) + C1C4V.ADAPTER.encodedSizeWithTag(1006, requestBody2.mark_stranger_all_conversation_read_body) + DeleteMultiStrangerConversationRequestBody.ADAPTER.encodedSizeWithTag(1009, requestBody2.delete_multi_stranger_conversation_body) + MarkMultiStrangerConversationReadRequestBody.ADAPTER.encodedSizeWithTag(1010, requestBody2.mark_multi_stranger_conversation_read_body) + GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodedSizeWithTag(2000, requestBody2.participants_read_index_body) + GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodedSizeWithTag(2001, requestBody2.participants_min_index_body) + GetTicketRequestBody.ADAPTER.encodedSizeWithTag(2005, requestBody2.get_ticket_body) + GetUserConversationListRequestBody.ADAPTER.encodedSizeWithTag(2006, requestBody2.get_conversation_list_body) + BroadcastUserCounterRequestBody.ADAPTER.encodedSizeWithTag(2009, requestBody2.broadcast_user_counter_body) + ClientACKRequestBody.ADAPTER.encodedSizeWithTag(2010, requestBody2.client_ack_body) + ReportClientMetricsRequestBody.ADAPTER.encodedSizeWithTag(2016, requestBody2.report_client_metrics_body) + C2224561C4w.ADAPTER.encodedSizeWithTag(2017, requestBody2.get_configs_body) + UnReadCountReportRequestBody.ADAPTER.encodedSizeWithTag(2018, requestBody2.unread_count_report_body) + BlockMembersRequestBody.ADAPTER.encodedSizeWithTag(2019, requestBody2.block_members_body) + BlockConversationRequestBody.ADAPTER.encodedSizeWithTag(2020, requestBody2.block_conversation_body) + SendMessageP2PRequestBody.ADAPTER.encodedSizeWithTag(2031, requestBody2.send_message_p2p_body) + GetMessageInfoByIndexV2RequestBody.ADAPTER.encodedSizeWithTag(2035, requestBody2.get_message_info_by_index_v2_body) + MarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2036, requestBody2.mark_message_body) + PullMarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2037, requestBody2.pull_mark_message_body) + BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.encodedSizeWithTag(2038, requestBody2.batch_get_conversation_participants_readindex) + GetRecentMessageReqBody.ADAPTER.encodedSizeWithTag(2039, requestBody2.get_recent_message_body) + GetCmdMessageReqBody.ADAPTER.encodedSizeWithTag(2040, requestBody2.get_cmd_message_body) + GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.encodedSizeWithTag(2041, requestBody2.get_message_info_by_index_v2_range_body) + MessageByInitRequestBody.ADAPTER.encodedSizeWithTag(2043, requestBody2.message_by_init) + PreviewerMessagesInConversationRequestBody.ADAPTER.encodedSizeWithTag(2044, requestBody2.previewer_messages_in_conversation_body) + PreviewerGetConversationInfoListRequestBody.ADAPTER.encodedSizeWithTag(2045, requestBody2.previewer_get_conversation_info_list_body) + MarkMsgUnreadCountReportRequestBody.ADAPTER.encodedSizeWithTag(2054, requestBody2.mark_msg_unread_count_report) + MarkMsgGetUnreadCountRequestBody.ADAPTER.encodedSizeWithTag(2055, requestBody2.mark_msg_get_unread_count) + BatchUnmarkMessageRequestBody.ADAPTER.encodedSizeWithTag(2056, requestBody2.batch_unmark_message) + ClientBatchACKRequestBody.ADAPTER.encodedSizeWithTag(2057, requestBody2.client_batch_ack_body) + C0YOB.ADAPTER.encodedSizeWithTag(2059, requestBody2.media_upload_config_request_body) + GetMediaStatusRequestBody.ADAPTER.encodedSizeWithTag(2060, requestBody2.media_status_request_body) + ConversationMessageSearchRequestBody.ADAPTER.encodedSizeWithTag(2102, requestBody2.conversation_message_search_body) + ConversationMessagePreViewRequestBody.ADAPTER.encodedSizeWithTag(2103, requestBody2.conversation_message_pre_view_body) + GetMessagesRequestBody.ADAPTER.encodedSizeWithTag(2200, requestBody2.get_messages_body) + BatchGetMessagesRequestBody.ADAPTER.encodedSizeWithTag(2201, requestBody2.batch_get_messages_body) + PrefetchConversationIdRequestBody.ADAPTER.encodedSizeWithTag(2202, requestBody2.prefetch_conversation_id_body) + requestBody2.unknownFields().size();
        for (Map.Entry<Integer, ProtoAdapter> entry : LIZ.entrySet()) {
            if (requestBody2.extensions.get(entry.getKey()) != null) {
                iEncodedSizeWithTag += entry.getValue().encodedSizeWithTag(entry.getKey().intValue(), requestBody2.extensions.get(entry.getKey()).second);
            }
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RequestBody requestBody) {
        RequestBody requestBody2 = requestBody;
        SendMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 100, requestBody2.send_message_body);
        MessagesPerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 200, requestBody2.messages_per_user_body);
        MessagesPerUserInitV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 203, requestBody2.messages_per_user_init_v2_body);
        MessagesPerUserComboRequestBody.ADAPTER.encodeWithTag(protoWriter, 204, requestBody2.messages_per_user_combo_body);
        MessagesPerConversationSearchRequestBody.ADAPTER.encodeWithTag(protoWriter, 206, requestBody2.messages_per_conversation_search_body);
        CheckMessagePerUserRequestBody.ADAPTER.encodeWithTag(protoWriter, 210, requestBody2.check_messages_per_user_body);
        CheckStatusMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 212, requestBody2.check_status_messages_body);
        GetMessageByIdRequestBody.ADAPTER.encodeWithTag(protoWriter, 211, requestBody2.get_message_by_id_body);
        MessagesInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 301, requestBody2.messages_in_conversation_body);
        GetMessagesCheckInfoInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 302, requestBody2.get_messages_checkinfo_in_conversation_body);
        GetMessagesCheckInfoV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 303, requestBody2.get_messages_check_info_v2_body);
        MessagesInConversationWithRangeRequestBody.ADAPTER.encodeWithTag(protoWriter, 304, requestBody2.messages_in_conversation_with_range);
        GetMessagePreviewRequestBody.ADAPTER.encodeWithTag(protoWriter, 305, requestBody2.get_message_preview_body);
        SendUserActionRequestBody.ADAPTER.encodeWithTag(protoWriter, 410, requestBody2.send_user_action_body);
        SendInputStatusRequestBody.ADAPTER.encodeWithTag(protoWriter, 411, requestBody2.send_input_status_body);
        DeleteConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 603, requestBody2.delete_conversation_body);
        MarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 604, requestBody2.mark_conversation_read_body);
        ConversationParticipantsListRequestBody.ADAPTER.encodeWithTag(protoWriter, 605, requestBody2.conversation_participants_body);
        GetConversationInfoV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 608, requestBody2.get_conversation_info_v2_body);
        CreateConversationV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 609, requestBody2.create_conversation_v2_body);
        GetConversationInfoListV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 610, requestBody2.get_conversation_info_list_v2_body);
        ConversationsPerUserByFavoriteV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 611, requestBody2.get_conversation_info_list_by_favorite_v2_body);
        ConversationsPerUserByTopV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 612, requestBody2.get_conversation_info_list_by_top_v2_body);
        BatchMarkConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 613, requestBody2.batch_mark_read_body);
        DissolveConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 614, requestBody2.dissolve_conversation_body);
        C2224591C4z.ADAPTER.encodeWithTag(protoWriter, 615, requestBody2.get_conversations_checkinfo_body);
        GetConversationsCheckInfoV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 616, requestBody2.get_conversation_check_info_v2_body);
        BatchDeleteConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 617, requestBody2.batch_delete_conversation_body);
        ConversationAddParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 650, requestBody2.conversation_add_participants_body);
        ConversationRemoveParticipantsRequestBody.ADAPTER.encodeWithTag(protoWriter, 651, requestBody2.conversation_remove_participants_body);
        ConversationLeaveRequestBody.ADAPTER.encodeWithTag(protoWriter, 652, requestBody2.leave_conversation_body);
        UpdateConversationParticipantRequestBody.ADAPTER.encodeWithTag(protoWriter, 655, requestBody2.update_conversation_participant_body);
        BatchUpdateConversationParticipantRequestBody.ADAPTER.encodeWithTag(protoWriter, 656, requestBody2.batch_update_conversation_participant_body);
        DeleteMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 701, requestBody2.delete_message_body);
        RecallMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 702, requestBody2.recall_message_body);
        ModifyMessagePropertyRequestBody.ADAPTER.encodeWithTag(protoWriter, 705, requestBody2.modify_message_property_body);
        AckMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 706, requestBody2.ack_message_body);
        BatchAckMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 707, requestBody2.batch_ack_message_body);
        SetConversationCoreInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 902, requestBody2.set_conversation_core_info_body);
        UpsertConversationCoreExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 904, requestBody2.upsert_conversation_core_ext_info_body);
        SetConversationSettingInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 921, requestBody2.set_conversation_setting_info_body);
        UpsertConversationSettingExtInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 922, requestBody2.upsert_conversation_setting_ext_info_body);
        BatchSetConversationSettingInfoRequestBody.ADAPTER.encodeWithTag(protoWriter, 924, requestBody2.batch_set_conversation_setting_info_body);
        GetStrangerConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, LSPassThroughRecordSizeConfig.DEFAULT, requestBody2.get_stranger_conversation_body);
        GetStrangerMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 1001, requestBody2.get_stranger_messages_body);
        DeleteStrangerMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 1002, requestBody2.delete_stranger_message_body);
        DeleteStrangerConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 1003, requestBody2.delete_stranger_conversation_body);
        C2224441C4k.ADAPTER.encodeWithTag(protoWriter, 1004, requestBody2.delete_stranger_all_conversation_body);
        MarkStrangerConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1005, requestBody2.mark_stranger_conversation_read_body);
        C1C4V.ADAPTER.encodeWithTag(protoWriter, 1006, requestBody2.mark_stranger_all_conversation_read_body);
        DeleteMultiStrangerConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 1009, requestBody2.delete_multi_stranger_conversation_body);
        MarkMultiStrangerConversationReadRequestBody.ADAPTER.encodeWithTag(protoWriter, 1010, requestBody2.mark_multi_stranger_conversation_read_body);
        GetConversationParticipantsReadIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, 2000, requestBody2.participants_read_index_body);
        GetConversationParticipantsMinIndexV3RequestBody.ADAPTER.encodeWithTag(protoWriter, 2001, requestBody2.participants_min_index_body);
        GetTicketRequestBody.ADAPTER.encodeWithTag(protoWriter, 2005, requestBody2.get_ticket_body);
        GetUserConversationListRequestBody.ADAPTER.encodeWithTag(protoWriter, 2006, requestBody2.get_conversation_list_body);
        BroadcastUserCounterRequestBody.ADAPTER.encodeWithTag(protoWriter, 2009, requestBody2.broadcast_user_counter_body);
        ClientACKRequestBody.ADAPTER.encodeWithTag(protoWriter, 2010, requestBody2.client_ack_body);
        ReportClientMetricsRequestBody.ADAPTER.encodeWithTag(protoWriter, 2016, requestBody2.report_client_metrics_body);
        C2224561C4w.ADAPTER.encodeWithTag(protoWriter, 2017, requestBody2.get_configs_body);
        UnReadCountReportRequestBody.ADAPTER.encodeWithTag(protoWriter, 2018, requestBody2.unread_count_report_body);
        BlockMembersRequestBody.ADAPTER.encodeWithTag(protoWriter, 2019, requestBody2.block_members_body);
        BlockConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 2020, requestBody2.block_conversation_body);
        SendMessageP2PRequestBody.ADAPTER.encodeWithTag(protoWriter, 2031, requestBody2.send_message_p2p_body);
        GetMessageInfoByIndexV2RequestBody.ADAPTER.encodeWithTag(protoWriter, 2035, requestBody2.get_message_info_by_index_v2_body);
        MarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2036, requestBody2.mark_message_body);
        PullMarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2037, requestBody2.pull_mark_message_body);
        BatchGetConversationParticipantsReadIndexRequestBody.ADAPTER.encodeWithTag(protoWriter, 2038, requestBody2.batch_get_conversation_participants_readindex);
        GetRecentMessageReqBody.ADAPTER.encodeWithTag(protoWriter, 2039, requestBody2.get_recent_message_body);
        GetCmdMessageReqBody.ADAPTER.encodeWithTag(protoWriter, 2040, requestBody2.get_cmd_message_body);
        GetMessageInfoByIndexV2RangeRequestBody.ADAPTER.encodeWithTag(protoWriter, 2041, requestBody2.get_message_info_by_index_v2_range_body);
        MessageByInitRequestBody.ADAPTER.encodeWithTag(protoWriter, 2043, requestBody2.message_by_init);
        PreviewerMessagesInConversationRequestBody.ADAPTER.encodeWithTag(protoWriter, 2044, requestBody2.previewer_messages_in_conversation_body);
        PreviewerGetConversationInfoListRequestBody.ADAPTER.encodeWithTag(protoWriter, 2045, requestBody2.previewer_get_conversation_info_list_body);
        MarkMsgUnreadCountReportRequestBody.ADAPTER.encodeWithTag(protoWriter, 2054, requestBody2.mark_msg_unread_count_report);
        MarkMsgGetUnreadCountRequestBody.ADAPTER.encodeWithTag(protoWriter, 2055, requestBody2.mark_msg_get_unread_count);
        BatchUnmarkMessageRequestBody.ADAPTER.encodeWithTag(protoWriter, 2056, requestBody2.batch_unmark_message);
        ClientBatchACKRequestBody.ADAPTER.encodeWithTag(protoWriter, 2057, requestBody2.client_batch_ack_body);
        C0YOB.ADAPTER.encodeWithTag(protoWriter, 2059, requestBody2.media_upload_config_request_body);
        GetMediaStatusRequestBody.ADAPTER.encodeWithTag(protoWriter, 2060, requestBody2.media_status_request_body);
        ConversationMessageSearchRequestBody.ADAPTER.encodeWithTag(protoWriter, 2102, requestBody2.conversation_message_search_body);
        ConversationMessagePreViewRequestBody.ADAPTER.encodeWithTag(protoWriter, 2103, requestBody2.conversation_message_pre_view_body);
        GetMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 2200, requestBody2.get_messages_body);
        BatchGetMessagesRequestBody.ADAPTER.encodeWithTag(protoWriter, 2201, requestBody2.batch_get_messages_body);
        PrefetchConversationIdRequestBody.ADAPTER.encodeWithTag(protoWriter, 2202, requestBody2.prefetch_conversation_id_body);
        for (Map.Entry<Integer, ProtoAdapter> entry : LIZ.entrySet()) {
            if (requestBody2.extensions.get(entry.getKey()) != null) {
                entry.getValue().encodeWithTag(protoWriter, entry.getKey().intValue(), requestBody2.extensions.get(entry.getKey()).second);
            }
        }
        protoWriter.writeBytes(requestBody2.unknownFields());
    }
}
