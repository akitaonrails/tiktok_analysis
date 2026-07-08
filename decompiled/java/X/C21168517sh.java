package X;

import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.HandleOutPutAbility$handleCancelOutPut$2", f = "HandleOutPutAbility.kt", l = {}, m = "invokeSuspend")
public final class C21168517sh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21168117sd<AbstractC21169117sn> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21168517sh(C21168117sd<AbstractC21169117sn> c21168117sd, InterfaceC1364105Vn<? super C21168517sh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21168117sd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21168517sh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HandleOutPutAbility@8433.handleCancelOutPut$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LL.LJ;
        if (downloadMobProtocol != 0) {
            downloadMobProtocol.LIZJ();
        }
        InterfaceC21168717sj interfaceC21168717sj = this.LL.LIZ.LIZLLL;
        if (interfaceC21168717sj != null) {
            interfaceC21168717sj.onCancel();
        }
        C21168117sd<AbstractC21169117sn> c21168117sd = this.LL;
        if (c21168117sd.LJII) {
            c21168117sd.LJI.onCancel();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HandleOutPutAbility@8433.handleCancelOutPut$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
