package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0sWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1630050sWJ extends C1696260uF6 implements InterfaceC1631620sYq<Integer, InterfaceC1626470sQX, Boolean, Unit> {
    public C1630050sWJ(C1630020sWG c1630020sWG) {
        super(3, c1630020sWG, C1630020sWG.class, "onCarouselItemClicked", "onCarouselItemClicked(ILcom/ss/android/ugc/slideslip/model/SlipEffect;ZZZ)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, InterfaceC1626470sQX interfaceC1626470sQX, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1630020sWG) this.receiver).LLLLZLLIL(num.intValue(), interfaceC1626470sQX, zBooleanValue, true, true);
        return Unit.LIZ;
    }
}
