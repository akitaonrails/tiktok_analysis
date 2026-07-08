package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2$CameraPage$3$5$1$1", f = "SocialAvatarCameraSceneV2.kt", l = {175}, m = "invokeSuspend")
public final class C439410HKx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SocialAvatarCameraSceneV2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439410HKx(String str, SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, InterfaceC1364105Vn<? super C439410HKx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = socialAvatarCameraSceneV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439410HKx(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AccountUserService accountUserServiceLJIIJ;
        String curUserId;
        Object objLIZLLL = obj;
        C1C7U.LIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$5$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    long j = this.LLILLJJLI;
                    curUserId = (String) this.LL;
                    C155000ia.LIZIZ(objLIZLLL);
                    i = j;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C0HLI c0hli = C0HLI.LIZ;
                    String str = this.LLILZ;
                    this.LL = curUserId;
                    this.LLILLJJLI = jElapsedRealtime;
                    this.LLILLL = 1;
                    objLIZLLL = c0hli.LIZLLL(str, curUserId, true, true, EnumC2219708mp.ALL, this);
                    i = jElapsedRealtime;
                    if (objLIZLLL == objLJFF) {
                        C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$5$1$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$5$1$1");
                    return unit;
                }
            }
            C443120HZe c443120HZe = (C443120HZe) objLIZLLL;
            SocialAvatarGenerateData socialAvatarGenerateData = new SocialAvatarGenerateData(EnumC439310HKn.METHOD_SHOOT, ((Number) c443120HZe.getSecond()).floatValue(), this.LLILZ, (String) c443120HZe.getFirst(), (RectF) c443120HZe.getThird(), 0, 0, 0, 0, 512);
            C1956107lP.LIZIZ(curUserId, true);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2 = this.LLILZIL;
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "social_avatar_generate_data", socialAvatarGenerateData);
            intent.putExtras(bundle);
            socialAvatarCameraSceneV2.setResult(-1, intent);
            this.LLILZIL.finish();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$5$1$1");
            return unit2;
        } catch (C0HKR e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZIL.LLLF.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_IMAGE_FACE_DETECTION_CHECK);
            C0HWW c0hww = C0HWW.LIZ;
            Float fLIZLLL = C2286608xc.LIZLLL(SystemClock.elapsedRealtime() - i);
            String message = e.getMessage();
            c0hww.getClass();
            C0HWW.LJJIII("fail", "manual_shoot", false, "face_detection", fLIZLLL, message);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$5$1$1");
            return unit3;
        }
    }
}
