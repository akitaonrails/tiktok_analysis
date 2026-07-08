package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.client.BulletinClientCenter$switchAccount$1", f = "BulletinClientCenter.kt", l = {}, m = "invokeSuspend")
public final class C622200Oao extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C622210Oap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622200Oao(C622210Oap c622210Oap, InterfaceC1364105Vn<? super C622200Oao> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c622210Oap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C622200Oao(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinClientCenter@3fcf.switchAccount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C622190Oan.LIZ.LIZJ().LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C622290Oax.LIZJ("BulletinClientCenter", "switchAccount error", e);
            C622210Oap c622210Oap = this.LL;
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c622210Oap.LIZ(enumC622250Oat, message, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinClientCenter@3fcf.switchAccount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
