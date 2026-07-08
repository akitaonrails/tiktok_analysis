package X;

import android.graphics.DashPathEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669070tXF extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669070tXF(float f, float f2, float f3, float f4, long j) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float fLJJJJLL = interfaceC1675870tiD2.LJJJJLL(this.LL);
        float fLJJJJLL2 = interfaceC1675870tiD2.LJJJJLL(this.LLILLJJLI);
        C1669100tXI c1669100tXI = InterfaceC1669090tXH.LIZ;
        float[] fArr = {interfaceC1675870tiD2.LJJJJLL(this.LLILLL), interfaceC1675870tiD2.LJJJJLL(this.LLILZ)};
        c1669100tXI.getClass();
        C1669080tXG c1669080tXG = new C1669080tXG(new DashPathEffect(fArr, 0.0f));
        float f = fLJJJJLL / 2.0f;
        C1675860tiC.LJIIL(interfaceC1675870tiD2, this.LLILZIL, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32)) - fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() & 4294967295L)) - fLJJJJLL)) & 4294967295L), (((long) Float.floatToRawIntBits(fLJJJJLL2)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL2)) & 4294967295L), new C1695210uDP(fLJJJJLL, 0.0f, 0, 0, c1669080tXG, 14), 0, 224);
        return Unit.LIZ;
    }
}
