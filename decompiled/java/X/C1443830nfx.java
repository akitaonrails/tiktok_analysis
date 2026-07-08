package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0nfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.changeavatar.ChangeAvatarComponent$request$1$1", f = "ChangeAvatarComponent.kt", l = {87}, m = "invokeSuspend")
public final class C1443830nfx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1443890ng3 LLILLJJLI;
    public final /* synthetic */ SocialAvatarUpdateInfoStruct LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Exception, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1443830nfx(C1443890ng3 c1443890ng3, SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct, Function0<Unit> function0, Function1<? super Exception, Unit> function1, InterfaceC1364105Vn<? super C1443830nfx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1443890ng3;
        this.LLILLL = socialAvatarUpdateInfoStruct;
        this.LLILZ = function0;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1443830nfx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        long jLongValue;
        int iIntValue3;
        boolean zBooleanValue;
        long jLongValue2;
        boolean zBooleanValue2;
        C1C7U.LIZ("ChangeAvatarComponent@f7b0.request$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class);
                    Activity activity = this.LLILLJJLI.getActivity();
                    String compiledAvatarUri = this.LLILLL.getCompiledAvatarUri();
                    String str = "";
                    if (compiledAvatarUri == null) {
                        compiledAvatarUri = "";
                    }
                    String dynamicAvatarUri = this.LLILLL.getDynamicAvatarUri();
                    if (dynamicAvatarUri == null) {
                        dynamicAvatarUri = "";
                    }
                    String staticAvatarUri = this.LLILLL.getStaticAvatarUri();
                    if (staticAvatarUri == null) {
                        staticAvatarUri = "";
                    }
                    Integer styleSelection = this.LLILLL.getStyleSelection();
                    if (styleSelection != null) {
                        iIntValue = styleSelection.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer expressionSelection = this.LLILLL.getExpressionSelection();
                    if (expressionSelection != null) {
                        iIntValue2 = expressionSelection.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    Long avatarId = this.LLILLL.getAvatarId();
                    if (avatarId != null) {
                        jLongValue = avatarId.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Integer avatarCount = this.LLILLL.getAvatarCount();
                    if (avatarCount != null) {
                        iIntValue3 = avatarCount.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    Boolean boolIsFirstAvatar = this.LLILLL.isFirstAvatar();
                    if (boolIsFirstAvatar != null) {
                        zBooleanValue = boolIsFirstAvatar.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    C0HDY c0hdy = new C0HDY(compiledAvatarUri, jLongValue, iIntValue, zBooleanValue, iIntValue2, iIntValue3, dynamicAvatarUri, staticAvatarUri);
                    String enterFrom = this.LLILLL.getEnterFrom();
                    if (enterFrom != null) {
                        str = enterFrom;
                    }
                    Long downloadTimeInMs = this.LLILLL.getDownloadTimeInMs();
                    if (downloadTimeInMs != null) {
                        jLongValue2 = downloadTimeInMs.longValue();
                    } else {
                        jLongValue2 = -1;
                    }
                    C437430HDh c437430HDh = new C437430HDh(4, C2286608xc.LJFF(jLongValue2), str, Intrinsics.LJFF(this.LLILLL.getNeedUpdate(), true));
                    Boolean boolIsUsingUserBucket = this.LLILLL.isUsingUserBucket();
                    if (boolIsUsingUserBucket != null) {
                        zBooleanValue2 = boolIsUsingUserBucket.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    this.LL = 1;
                    if (iSocialAvatarService.LJII(activity, c0hdy, true, true, c437430HDh, zBooleanValue2, this) == objLJFF) {
                        C1C7U.LIZIZ("ChangeAvatarComponent@f7b0.request$1$1");
                        return objLJFF;
                    }
                }
                this.LLILZ.invoke();
            } catch (C0HDR e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZIL.invoke(null);
            }
            this.LLILLJJLI.LLILLL.invoke(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChangeAvatarComponent@f7b0.request$1$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLILLL.invoke(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
