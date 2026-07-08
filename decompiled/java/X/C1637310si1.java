package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0si1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637310si1 implements Function0<Boolean> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C1664740tQG LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1637310si1.class, "gameApiComponent", "getGameApiComponent()Lcom/ss/android/ugc/aweme/sticker/GameStickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        InterfaceC1624950sO5 interfaceC1624950sO5 = (InterfaceC1624950sO5) this.LL.getValue(this, LLILLJJLI[0]);
        return Boolean.valueOf(interfaceC1624950sO5 != null ? interfaceC1624950sO5.Cq2() : false);
    }

    public C1637310si1(C1DRG c1drg) {
        this.LL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1624950sO5.class), InterfaceC1624950sO5.class);
    }
}
