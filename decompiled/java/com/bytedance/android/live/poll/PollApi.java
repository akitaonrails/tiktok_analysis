package com.bytedance.android.live.poll;

import X.AnonymousClass0957;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.interaction.poll.network.EndPollResponse;
import com.bytedance.android.livesdk.interaction.poll.network.PollHistoryResponse;
import com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse;
import com.bytedance.android.livesdk.model.VoteResponseData;

/* JADX INFO: loaded from: classes.dex */
public interface PollApi {
    void LIZ(long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/end")
    C11NZ<C470590Icr<EndPollResponse>> endCustomPoll(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("end_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/end")
    C11NZ<C470590Icr<EndPollResponse>> endMockPoll(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("end_type") int i, @InterfaceC1501050pAF("mock_room_id") long j3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/end")
    C11NZ<C470590Icr<EndPollResponse>> endPoll(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("end_type") int i);

    @InterfaceC1501160pAQ("/webcast/room/poll/latest")
    C11NZ<C470590Icr<PollHistoryResponse>> getPollHistory(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/start")
    C11NZ<C470590Icr<StartPollResponse>> startPoll(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("option_list") String str, @InterfaceC1501050pAF("duration_ms") long j2, @InterfaceC1501050pAF("kind") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/vote")
    AnonymousClass0957<C470590Icr<VoteResponseData>> vote(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("option_index") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/poll/vote")
    C11NZ<C470590Icr<VoteResponseData>> vote2(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("option_index") int i);
}
