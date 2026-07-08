package X;

import com.bytedance.keva.Keva;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364240EPu {
    public final IAccountUserService LIZ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();

    public final boolean LIZIZ() {
        if (this.LIZ.isLogin()) {
            if (!this.LIZ.LIZ()) {
                Keva keva = C357770E0x.LIZ;
                String curUserId = this.LIZ.getCurUserId();
                Keva keva2 = C357770E0x.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("server_rendering_consent_");
                sbLIZ.append(curUserId);
                return keva2.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            }
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EffectAuthManager", "Server rendering doesn't support child mode");
        }
        return false;
    }

    public final void LIZ(C19EG c19eg, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJFF(2131833309);
        c1397580mTM.LIZ(2131833308);
        C985403tE.LIZ(c1397580mTM, new AwS103S0400000_5((Function1) function1, (Function1<? super String, Unit>) this, (C364240EPu) c19eg, (C19EG) function0, (Function0<Unit>) 7));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void LIZLLL(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
        C1413450msx.LIZ.getClass();
        C0LAB c0labLJI = C1413450msx.LJI(videoPublishEditModel);
        c0labLJI.LIZ(0, "is_editor_pro");
        c0labLJI.LJ("creation_tool", "effect");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("upload_authorization_popup_show", c0labLJI.LIZ);
        LIZ(c19eg, function0, new AwS584S0100000_5(videoPublishEditModel, 944));
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, String str3) {
        String creationId;
        String str4;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        String str5 = null;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        if (shortVideoContext != null) {
            str4 = shortVideoContext.shootWay;
        } else {
            str4 = null;
        }
        c0lab.LJ("shoot_way", str4);
        c0lab.LJ("content_type", str2);
        c0lab.LJ("content_source", str3);
        if (shortVideoContext != null) {
            str5 = shortVideoContext.enterFrom;
        }
        c0lab.LJ("enter_from", str5);
        c0lab.LJ("shoot_tab_name", "");
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("creation_tool", "effect");
        C2341909Fp.LIZ(str, c0lab.LIZ);
    }
}
