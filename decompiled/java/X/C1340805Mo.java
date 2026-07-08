package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$observeItemSelectAndCameraReady$1$1", f = "FullWidthEffectCarouselComponent.kt", l = {}, m = "invokeSuspend")
public final class C1340805Mo extends C09AX implements InterfaceC1631620sYq<Boolean, Integer, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Integer>>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ o LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340805Mo(o oVar, InterfaceC1364105Vn<? super C1340805Mo> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = oVar;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.observeItemSelectAndCameraReady$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        int i = this.LLILLJJLI;
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeItemSelectAndCameraReady: ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append("; currentPositionState: = ");
        sbLIZ.append(this.LLILLL.LLLFF.getValue().intValue());
        C201955140j.LIZLLL(c1632470saD, "FullWidthEffectCarouselComponent", C2188811AlT.LIZIZ(sbLIZ));
        Pair pair = new Pair(Boolean.valueOf(z), C2286608xc.LJ(i));
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeItemSelectAndCameraReady$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Integer num, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Integer>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        C1340805Mo c1340805Mo = new C1340805Mo(this.LLILLL, interfaceC1364105Vn);
        c1340805Mo.LL = zBooleanValue;
        c1340805Mo.LLILLJJLI = iIntValue;
        return c1340805Mo.invokeSuspend(Unit.LIZ);
    }
}
