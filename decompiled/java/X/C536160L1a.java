package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0L1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536160L1a implements InterfaceC522520KeQ {
    public static final int[] LLIZLLLIL;
    public final Activity LL;
    public long LLILLJJLI;
    public CreativeDialogWrapper LLILLL;
    public final C0VSJ LLILZ;
    public final C0VSJ LLILZIL;
    public final C0VSJ LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    static {
        int[] iArrLIZ = C422830Gi1.LIZ(301);
        if (iArrLIZ == null) {
            iArrLIZ = new int[]{120, 120};
        }
        LLIZLLLIL = iArrLIZ;
    }

    public C536160L1a(Activity activity) {
        this.LL = activity;
        C20022113Vr c20022113Vr = new C20022113Vr();
        EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.LOCAL_EXTRACT_MUSIC;
        this.LLILZ = c20022113Vr.LJIIJ(enumC20227914Cv, "tmp/", true);
        this.LLILZIL = c20022113Vr.LJIIJ(enumC20227914Cv, "audio/", true);
        this.LLILZLL = c20022113Vr.LJIIJ(enumC20227914Cv, "thumb/", true);
        this.LLIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(160));
    }

    public final void LIZJ(String str) {
        Bundle bundle;
        String string;
        String string2;
        String string3;
        Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(this.LL);
        if (bundleLJIIL != null) {
            bundle = bundleLJIIL.getBundle("extra_log_info_map");
        } else {
            bundle = null;
        }
        String str2 = "";
        if (bundle == null || (string = bundle.getString("shoot_way")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("enter_from")) == null) {
            string2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (bundle != null && (string3 = bundle.getString("creation_id")) != null) {
            str2 = string3;
        }
        c2344009Gk.LJIIIIZZ("creation_id", str2);
        c2344009Gk.LJIIIIZZ("shoot_way", string);
        c2344009Gk.LJIIIIZZ("enter_from", string2);
        c2344009Gk.LJIIIIZZ("fail_type", str);
        C20684815ws.LJIILLIIL("upload_sound_from_video_popup_show", c2344009Gk.LIZ);
    }

    public final void LJ(int i) {
        C01TT.LIZLLL(new AwS552S0100000_8(this, 302));
        LIZJ("import_failed");
        LIZLLL(i, false, 0L, 0L, 0L);
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        MediaModel mediaModel;
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && (mediaModel = (MediaModel) C13LP.LJJJLL(parcelableArrayListExtra)) != null) {
            long j = mediaModel.duration;
            if (j < 1000) {
                Activity activity = this.LL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131826424);
                C1390380mHk.LIZ(activity, 3051, creativeToastBuilder);
                LIZJ("video_too_short");
                return;
            }
            if (j > 1200000) {
                Activity activity2 = this.LL;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131826427);
                C1390380mHk.LIZ(activity2, 3051, creativeToastBuilder2);
                LIZJ("video_too_long");
                return;
            }
            C01TT.LIZLLL(new AwS409S0200000_8(this, C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L1Z(this, mediaModel, intent, null), 3), 45));
        }
    }

    public static void LIZLLL(int i, boolean z, long j, long j2, long j3) {
        int i2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (z) {
            c2344009Gk.LIZLLL(j, "time");
            c2344009Gk.LIZLLL(j2, "audio_file_size");
            c2344009Gk.LIZLLL(j3, "thumb_file_size");
        } else {
            c2344009Gk.LIZJ(i, "error_code");
        }
        C20684815ws.LJIILLIIL("av_performance_extract_audio_from_video", c2344009Gk.LIZ);
    }
}
