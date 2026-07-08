package X;

import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.interaction.poll.network.EndPollResponse;
import com.bytedance.android.livesdk.interaction.poll.network.PollHistoryResponse;
import com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C425401l6 implements PollApi {
    public final DataChannel LIZ;
    public int LIZIZ;
    public final List<String> LIZJ = new ArrayList();
    public long LIZLLL = C158B.LIZ();
    public long LJ = C158B.LIZ();
    public long LJFF = 1;

    public C425401l6(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final void LIZ(long j) {
        PollMessage pollMessage = new PollMessage();
        pollMessage.messageType = 1L;
        pollMessage.pollKind = 2;
        pollMessage.pollId = j;
        pollMessage.endContent = new PollEndContent();
        CommonMessageData commonMessageData = new CommonMessageData();
        pollMessage.baseMessage = commonMessageData;
        commonMessageData.createTime = System.currentTimeMillis();
        C482260Ivg.LIZIZ(C001A.LIVE_POLL_MESSAGE.getIntType(), pollMessage);
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<PollHistoryResponse>> getPollHistory(long j) {
        return C11NZ.LJJJJZ(new C470590Icr());
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<EndPollResponse>> endCustomPoll(long j, long j2, int i) {
        return endMockPoll(j, j2, i, C500260Jjc.LJJJJZ(this.LIZ)).LJJIJIIJIL(new C516401zm(j2, this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.Object] */
    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<EndPollResponse>> endPoll(long j, long j2, int i) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : (ArrayList) this.LIZJ) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("votes", 0L);
                jSONObject.put("display_content", str);
                jSONObject.put("option_idx", 0L);
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("kind", this.LIZIZ);
        jSONObject2.put("poll_id", 0L);
        jSONObject2.put("poll_status", 1);
        jSONObject2.put("start_time", this.LIZLLL);
        jSONObject2.put("end_time", C158B.LIZ());
        jSONObject2.put("poll_option_list", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("poll_data", jSONObject2);
        int intType = C001A.LIVE_POLL_MESSAGE.getIntType();
        ArrayList arrayList = new ArrayList();
        for (String str2 : (ArrayList) this.LIZJ) {
            PollOptionInfo pollOptionInfo = new PollOptionInfo();
            pollOptionInfo.displayContent = str2;
            arrayList.add(pollOptionInfo);
        }
        PollMessage pollMessage = new PollMessage();
        pollMessage.messageType = 1L;
        pollMessage.pollKind = Integer.valueOf(this.LIZIZ);
        pollMessage.pollId = this.LJFF;
        PollEndContent pollEndContent = new PollEndContent();
        pollEndContent.optionList = arrayList;
        pollEndContent.endType = i;
        pollMessage.endContent = pollEndContent;
        CommonMessageData commonMessageData = new CommonMessageData();
        pollMessage.baseMessage = commonMessageData;
        commonMessageData.createTime = C158B.LIZ();
        C482260Ivg.LIZIZ(intType, pollMessage);
        ((ArrayList) this.LIZJ).clear();
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.data = GsonProtectorUtils.fromJson(new Gson(), C786410Ut5.J3(jSONObject3), EndPollResponse.class);
        return C11NZ.LJJJJZ(c470590Icr);
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final AnonymousClass0957<C470590Icr<VoteResponseData>> vote(long j, long j2, int i) {
        return (AnonymousClass0957) C23250099c.LJ(C23271099x.INSTANCE, new C425501l7(null));
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<VoteResponseData>> vote2(long j, long j2, int i) {
        return C11NZ.LJJJJZ(new C470590Icr());
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<EndPollResponse>> endMockPoll(long j, long j2, int i, long j3) {
        C480460Ism.LIZ().getClass();
        return ((PollApi) C480460Ism.LIZLLL(PollApi.class)).endMockPoll(j, j2, i, j3);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Object] */
    @Override // com.bytedance.android.live.poll.PollApi
    public final C11NZ<C470590Icr<StartPollResponse>> startPoll(long j, String str, long j2, int i) throws JSONException {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONArray = new JSONArray("");
        }
        int i2 = 0;
        if (jSONArray.length() >= 2) {
            int length = jSONArray.length();
            while (i2 < length) {
                List<String> list = this.LIZJ;
                Object obj = jSONArray.get(i2);
                if (!(obj instanceof String) || obj == null) {
                    obj = "";
                }
                ((ArrayList) list).add(obj);
                i2++;
            }
        } else {
            do {
                ((ArrayList) this.LIZJ).add("");
                i2++;
            } while (i2 < 2);
        }
        this.LIZIZ = i;
        long jLIZ = C158B.LIZ();
        this.LIZLLL = jLIZ;
        this.LJ = jLIZ + j2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("end_time", this.LJ);
        long j3 = this.LJFF;
        this.LJFF = 1 + j3;
        jSONObject.put("poll_id", j3);
        int intType = C001A.LIVE_POLL_MESSAGE.getIntType();
        ArrayList arrayList = new ArrayList();
        for (String str2 : (ArrayList) this.LIZJ) {
            PollOptionInfo pollOptionInfo = new PollOptionInfo();
            pollOptionInfo.displayContent = str2;
            arrayList.add(pollOptionInfo);
        }
        PollMessage pollMessage = new PollMessage();
        pollMessage.messageType = 0L;
        pollMessage.pollKind = Integer.valueOf(this.LIZIZ);
        pollMessage.pollId = this.LJFF;
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.startTime = this.LIZLLL;
        pollStartContent.endTime = this.LJ;
        pollStartContent.optionList = arrayList;
        pollMessage.startContent = pollStartContent;
        CommonMessageData commonMessageData = new CommonMessageData();
        pollMessage.baseMessage = commonMessageData;
        commonMessageData.createTime = C158B.LIZ();
        C482260Ivg.LIZIZ(intType, pollMessage);
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.data = GsonProtectorUtils.fromJson(new Gson(), C786410Ut5.J3(jSONObject), StartPollResponse.class);
        return C11NZ.LJJJJZ(c470590Icr);
    }
}
