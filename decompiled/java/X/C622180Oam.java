package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.client.BulletinClientCenter$startInit$1", f = "BulletinClientCenter.kt", l = {}, m = "invokeSuspend")
public final class C622180Oam extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0CTA LL;
    public final /* synthetic */ C622210Oap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622180Oam(C0CTA c0cta, C622210Oap c622210Oap, InterfaceC1364105Vn<? super C622180Oam> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0cta;
        this.LLILLJJLI = c622210Oap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C622180Oam(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str = "";
        C1C7U.LIZ("BulletinClientCenter@3fcf.startInit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C622190Oan c622190Oan = C622190Oan.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startInit sdkOptions = ");
            sbLIZ.append(this.LL);
            C622290Oax.LJFF("BulletinClientCenter", C2188811AlT.LIZIZ(sbLIZ));
            c622190Oan.LIZJ().LJFF();
            this.LLILLJJLI.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
            InterfaceC622540ObM interfaceC622540ObM = C622190Oan.LJIIIZ;
            if (interfaceC622540ObM != null) {
                interfaceC622540ObM.LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C622290Oax.LIZJ("BulletinClientCenter", "startInit error", e);
            C622210Oap c622210Oap = this.LLILLJJLI;
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            c622210Oap.LIZ(enumC622250Oat, str, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinClientCenter@3fcf.startInit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
