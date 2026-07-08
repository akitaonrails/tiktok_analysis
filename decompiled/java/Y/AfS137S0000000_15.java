package Y;

import X.C09JN;
import X.C0K04;
import X.C1C7U;
import X.C20441214yg;
import X.C915980Zwa;
import X.C974540bT2;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AfS137S0000000_15 implements C09JN {
    public final int $t;

    public static final void accept$5(AfS137S0000000_15 afS137S0000000_15, Object obj) {
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public AfS137S0000000_15(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingApiUtil@9cbe.getAnchorLinkMicUserSetting$2L");
        C1C7U.LIZIZ("MultiCoHostSettingApiUtil@9cbe.getAnchorLinkMicUserSetting$2L");
    }

    public static final void accept$1(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewFragment@e6e6.countDownAndUpdateGoLiveText$2L");
        C1C7U.LIZIZ("MultiGuestPreviewFragment@e6e6.countDownAndUpdateGoLiveText$2L");
    }

    public static final void accept$2(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C1C7U.LIZ("AnchorLinkSettingApiWrapper@e6d5.getAnchorLinkMicUserSetting$2L");
        C1C7U.LIZIZ("AnchorLinkSettingApiWrapper@e6d5.getAnchorLinkMicUserSetting$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0aon] */
    public static final void accept$3(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        if (t != 0) {
            ResumeResponse.ResponseData responseData = (ResumeResponse.ResponseData) t;
            if (responseData.isResume) {
                C915980Zwa.LJI().LJIIJ().LLLIIII(responseData.channelId);
                ?? r2 = new Object(((ResumeResponse.ResponseData) baseResponse.data).users) { // from class: X.0aon
                    public final List<CohostListUser> LIZ;

                    {
                        this.LIZ = list;
                    }
                };
                C20441214yg.LIZIZ("LinkControlPresenter", "try resume cohost");
                C915980Zwa.LJII().LLJILJIL(r2);
            }
        }
    }

    public static final void accept$4(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("path", "resume", jSONObject);
        C0K04.LJFF("log_id", "", jSONObject);
        C974540bT2.LLIIIILZ(c974540bT2, "resume_server_api_error", jSONObject, 12);
    }

    public static final void accept$6(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C1C7U.LIZ("LinkInfoReporter@cb18.start$1L");
        C1C7U.LIZIZ("LinkInfoReporter@cb18.start$1L");
    }

    public static final void accept$7(AfS137S0000000_15 afS137S0000000_15, Object obj) {
        C1C7U.LIZ("LinkInfoReporter@cb18.start$2L");
        C1C7U.LIZIZ("LinkInfoReporter@cb18.start$2L");
    }
}
