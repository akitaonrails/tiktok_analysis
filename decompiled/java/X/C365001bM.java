package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.ur.socialavatar.SocialAvatarStoryUtils$downloadSocialAvatarBackground$2$1$1", f = "SocialAvatarStoryUtils.kt", l = {}, m = "invokeSuspend")
public final class C365001bM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C365001bM(File file, File file2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, InterfaceC1364105Vn<? super C365001bM> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = file;
        this.LLILLJJLI = file2;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365001bM(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SocialAvatarStoryUtils@8e2e.downloadSocialAvatarBackground$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2388309Xl c2388309Xl = C2388309Xl.LIZ;
        File file = this.LL;
        File file2 = this.LLILLJJLI;
        c2388309Xl.getClass();
        try {
            C08QA.LJIILLIIL(file, file2, true, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1364105Vn<Unit> interfaceC1364105Vn = this.LLILLL;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
        C1C7U.LIZIZ("SocialAvatarStoryUtils@8e2e.downloadSocialAvatarBackground$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
