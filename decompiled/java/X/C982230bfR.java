package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982230bfR extends C09AY implements Function1<C982510bft, Unit> {
    public final /* synthetic */ AbstractC981980bf2<? extends InterfaceC983270bh7> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ long LLILZ = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C982230bfR(AbstractC981980bf2 abstractC981980bf2, long j, int i, long j2) {
        super(1);
        this.LL = abstractC981980bf2;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C982510bft c982510bft) {
        C982510bft c982510bft2 = c982510bft;
        AbstractC981980bf2<? extends InterfaceC983270bh7> abstractC981980bf2 = this.LL;
        abstractC981980bf2.LJI = false;
        EnumC974260bSa enumC974260bSaY2 = abstractC981980bf2.LIZ.Y2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestSettlementEndApi");
        sbLIZ.append(", EndResult = ");
        sbLIZ.append(c982510bft2);
        C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC974260bSaY2.compareTo(EnumC974260bSa.PUNISH) >= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestSettlementEndApi");
            sbLIZ2.append(", return by status is punish");
            C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            this.LL.LJJIII().LJJ = this.LLILLJJLI;
            this.LL.LJJIII().LJJI = this.LLILLL;
            this.LL.LJJIII().LJJIFFI = this.LLILLL;
            this.LL.LJJJJJ(c982510bft2);
            boolean z = this.LLILLL;
            if (z) {
                AbstractC981980bf2<? extends InterfaceC983270bh7> abstractC981980bf22 = this.LL;
                EnumC982500bfs enumC982500bfs = c982510bft2.LJ;
                InterfaceC983270bh7 interfaceC983270bh7LJJII = abstractC981980bf22.LJJII();
                if (interfaceC983270bh7LJJII != null) {
                    interfaceC983270bh7LJJII.LJII(enumC982500bfs.getType());
                }
                this.LL.LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.NEGATIVE_OVER;
                AbstractC981450beB.LJJIJL(this.LL, "cut_short_request", null, false, 14);
            } else {
                this.LL.LJJIIJ(this.LLILZ, z, c982510bft2.LJFF);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("requestSettlementEndApi");
            sbLIZ3.append(", success callback");
            C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ3));
        }
        return Unit.LIZ;
    }
}
