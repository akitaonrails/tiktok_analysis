package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1628290sTT extends C2217421BqW implements Function2<Integer, InterfaceC1626470sQX, Unit> {
    public C1628290sTT(C1630020sWG c1630020sWG) {
        super(2, c1630020sWG, C1630020sWG.class, "onSlideSelectedCarouselItem", "onSlideSelectedCarouselItem(ILcom/ss/android/ugc/slideslip/model/SlipEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, InterfaceC1626470sQX interfaceC1626470sQX) {
        int iIntValue = num.intValue();
        C1630020sWG c1630020sWG = (C1630020sWG) this.receiver;
        c1630020sWG.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on slide selected carousel item position = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append("   : ");
        sbLIZ.append(C1629110sUn.LIZ(interfaceC1626470sQX).getEffectId());
        C1628270sTR.LIZIZ("CameraEffectCarouselScene", C2188811AlT.LIZIZ(sbLIZ));
        c1630020sWG.LLLZIL(-1, "");
        return Unit.LIZ;
    }
}
