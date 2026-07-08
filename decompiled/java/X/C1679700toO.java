package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0toO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679700toO extends C09AY implements Function0<C1679680toM> {
    public final /* synthetic */ C1683130ttv LL;
    public final /* synthetic */ C05UN LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1690500u5o LLILZ;
    public final /* synthetic */ C05P0<C1683130ttv> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679700toO(C1683130ttv c1683130ttv, C05UN c05un, long j, InterfaceC1690500u5o interfaceC1690500u5o, C05P0<C1683130ttv> c05p0) {
        super(0);
        this.LL = c1683130ttv;
        this.LLILLJJLI = c05un;
        this.LLILLL = j;
        this.LLILZ = interfaceC1690500u5o;
        this.LLILZIL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1679680toM invoke() {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        C1683130ttv c1683130ttvLJ = C1679750toT.LJ(this.LLILZIL);
        C1683130ttv c1683130ttv = this.LL;
        float fLIZLLL = C13LZ.LIZLLL(this.LLILLJJLI.LJ.LIZLLL().floatValue(), 0.0f, 1.0f);
        if (c1683130ttvLJ != null) {
            fIntBitsToFloat = c1683130ttvLJ.LIZJ - c1683130ttvLJ.LIZ;
            fIntBitsToFloat2 = c1683130ttvLJ.LIZLLL - c1683130ttvLJ.LIZIZ;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (this.LLILLL >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.LLILLL & 4294967295L));
        }
        if (c1683130ttv != null) {
            float f = c1683130ttv.LIZJ - c1683130ttv.LIZ;
            float f2 = f + ((fIntBitsToFloat - f) * fLIZLLL);
            fIntBitsToFloat = f2 < 0.0f ? 0.0f : f2;
            float f3 = c1683130ttv.LIZLLL - c1683130ttv.LIZIZ;
            float f4 = f3 + ((fIntBitsToFloat2 - f3) * fLIZLLL);
            fIntBitsToFloat2 = f4 >= 0.0f ? f4 : 0.0f;
        }
        InterfaceC1690500u5o interfaceC1690500u5o = this.LLILZ;
        return new C1679680toM(C1671180tae.LIZ(interfaceC1690500u5o.LLIIIJ(fIntBitsToFloat), interfaceC1690500u5o.LLIIIJ(fIntBitsToFloat2)));
    }
}
