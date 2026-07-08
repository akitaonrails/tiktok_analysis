package X;

import Y.AfS0S1110100_14;
import android.app.Activity;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ZIU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIU {
    public static final C0ZIU LIZ = new C0ZIU();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static final IAVPublishService LIZLLL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();

    public static boolean LIZIZ(int i) {
        return i == 10 || i == 9 || i == 8 || i == 12 || i == 13 || i == 18;
    }

    public static void LIZJ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("creation_id", LIZIZ);
        c2344009Gk.LJIIIIZZ("credit_item_category", str);
        IAVPublishService iAVPublishService = LIZLLL;
        if (iAVPublishService.isAfterPost()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("after_post", str2);
        if (iAVPublishService.getAwemeType() != null) {
            c2344009Gk.LJFF("aweme_type", iAVPublishService.getAwemeType());
        }
        C20684815ws.LJIILLIIL("click_credits_item", c2344009Gk.LIZ);
    }

    public static void LIZ(Activity activity, String str, String str2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC19484711Kz<VideoInfoFromURLResponse> abstractC19484711KzLIZ = C0ZIV.LIZIZ.LIZ("", CastLongProtector.parseLong(str));
        SettingsManager.LIZLLL().getClass();
        long jLJ = SettingsManager.LJ("check_credit_video_permission_threshold", 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC19473011Gm interfaceC19473011Gm = new InterfaceC19473011Gm() { // from class: X.0ZIT
            @Override // X.InterfaceC19473011Gm
            public final void LIZ(InterfaceC19474811He<? super VideoInfoFromURLResponse> interfaceC19474811He) {
                interfaceC19474811He.onSuccess(new VideoInfoFromURLResponse(104, null, null));
            }
        };
        abstractC19484711KzLIZ.getClass();
        abstractC19484711KzLIZ.LJJIJIL(jLJ, timeUnit, C11S5.LIZIZ, interfaceC19473011Gm).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS0S1110100_14(activity, jCurrentTimeMillis, str2, z, 0), new AfS0S1110100_14(activity, jCurrentTimeMillis, str2, z, 1));
    }

    public static void LIZLLL(Activity activity, VideoInfoFromURLResponse videoInfoFromURLResponse, long j, String str, boolean z) {
        AssemViewModel value;
        ComponentActivity componentActivity;
        float fCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000.0f;
        if ((activity instanceof C19EG) && (componentActivity = (ComponentActivity) activity) != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionVideoShareModel.class);
            value = new AssemVMLazy(C724750Sbp.LJIIJ(componentActivity, c19719912DlLIZ), new AwS558S0100000_14(c19719912DlLIZ, 1480), new C452070Ho5(), C724750Sbp.LJII(componentActivity), C724750Sbp.LJIIIZ(componentActivity), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) componentActivity, 1481), AFwS248S0000000_14.get$arr$(467)).getValue();
        } else {
            value = null;
        }
        int i = videoInfoFromURLResponse.statusCode;
        if (i != 0) {
            i = 1;
        }
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("mention_video_Info_respose", videoInfoFromURLResponse);
            intent.putExtra("mention_video_enter_method", str);
            if (activity != null) {
                C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlc5OA8Tcaavzz7PHTKIThV0Nnti4TVbU=", null));
                activity.finish();
            }
        } else if (!LIZLLL.returnMentionVideoRespose(activity, videoInfoFromURLResponse, str) && value != null) {
            value.setState(new AwS593S0100000_14(new Pair(videoInfoFromURLResponse, str), (Pair<VideoInfoFromURLResponse, String>) 229));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", Float.valueOf(fCurrentTimeMillis));
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("tools_performance_check_credit_video_permission", i, jSONObject);
    }
}
