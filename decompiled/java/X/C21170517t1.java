package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.DownloadAbility$handleRequest$1", f = "DownloadAbility.kt", l = {}, m = "invokeSuspend")
public final class C21170517t1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21170317sz<CONTEXT> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21170517t1(C21170317sz<CONTEXT> c21170317sz, InterfaceC1364105Vn<? super C21170517t1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21170317sz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21170517t1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadAbility@6e2d.handleRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2222908nL.LIZIZ(this.LL.LIZ.LIZIZ(), false);
        C21170317sz<CONTEXT> c21170317sz = this.LL;
        c21170317sz.LJII.LJII(c21170317sz.LJIILJJIL);
        C21170317sz<CONTEXT> c21170317sz2 = this.LL;
        DownloadAbilityProtocol<CONTEXT> downloadAbilityProtocol = c21170317sz2.LJII;
        String str = c21170317sz2.LJIILIIL().LIZIZ;
        String str2 = (String) ListProtector.get(this.LL.LJIILIIL().LIZ, this.LL.LJIIJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LJIIIIZZ);
        sbLIZ.append(this.LL.LIZ.LIZIZ);
        if (downloadAbilityProtocol.LJIIIIZZ(str, str2, C2188811AlT.LIZIZ(sbLIZ), this.LL.LIZ.LIZIZ())) {
            this.LL.LJFF.LIZJ = true;
            C1371690lnb.LIZJ("DownloadAbility", "use local file");
        } else {
            C21170317sz<CONTEXT> c21170317sz3 = this.LL;
            String str3 = (String) ListProtector.get(c21170317sz3.LJIILIIL().LIZ, this.LL.LJIIJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL.LJIIIIZZ);
            sbLIZ2.append(this.LL.LIZ.LIZIZ);
            c21170317sz3.LJIIL(str3, C2188811AlT.LIZIZ(sbLIZ2), this.LL.LIZ.LIZIZ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAbility@6e2d.handleRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
