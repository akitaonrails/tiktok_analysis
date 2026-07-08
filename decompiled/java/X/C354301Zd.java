package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor.TopGuestGamePlayAnchorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: renamed from: X.01Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor.TopGuestGamePlayAnchorViewModel$openTopGuestGamePlayPanel$1", f = "TopGuestGamePlayAnchorViewModel.kt", l = {30}, m = "invokeSuspend")
public final class C354301Zd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TopGuestGamePlayAnchorViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354301Zd(TopGuestGamePlayAnchorViewModel topGuestGamePlayAnchorViewModel, InterfaceC1364105Vn<? super C354301Zd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = topGuestGamePlayAnchorViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C354301Zd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final long j;
        C1C7U.LIZ("TopGuestGamePlayAnchorViewModel@ecb0.openTopGuestGamePlayPanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TopGuestGamePlayAnchorViewModel topGuestGamePlayAnchorViewModel = this.LLILLJJLI;
            C2252331DDr c2252331DDr = topGuestGamePlayAnchorViewModel.LLILZ;
            TopGuestMetaContent topGuestMetaContent = topGuestGamePlayAnchorViewModel.LLILZLL.LJIIIIZZ;
            if (topGuestMetaContent != null) {
                j = topGuestMetaContent.playId;
            } else {
                j = 0;
            }
            AbstractC354901Zj abstractC354901Zj = new AbstractC354901Zj(j) { // from class: X.01Zg
                public final long LIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C354601Zg) && this.LIZ == ((C354601Zg) obj2).LIZ;
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OpenTopGuestRankListPanel(playId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = j;
                }
            };
            this.LL = 1;
            if (c2252331DDr.emit(abstractC354901Zj, this) == objLJFF) {
                C1C7U.LIZIZ("TopGuestGamePlayAnchorViewModel@ecb0.openTopGuestGamePlayPanel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopGuestGamePlayAnchorViewModel@ecb0.openTopGuestGamePlayPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
