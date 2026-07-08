package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681550trN extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ List<C05P1<Float>> LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681550trN(List<? extends C05P1<Float>> list, long j) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        float fLJJJJLL;
        C05P1 c05p1;
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float fLJJJJLL2 = interfaceC1675870tiD2.LJJJJLL(C1681540trM.LJJII);
        float fLJJJJLL3 = interfaceC1675870tiD2.LJJJJLL(C1681540trM.LJJIII);
        float f = fLJJJJLL2 / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        List<C1668650tWZ> list = C1681540trM.LJJIFFI;
        List<C05P1<Float>> list2 = this.LL;
        long j = this.LLILLJJLI;
        int i = 0;
        for (C1668650tWZ c1668650tWZ : list) {
            int i2 = i + 1;
            if (i >= 0) {
                float f2 = c1668650tWZ.LL;
                if (list2 != null && (c05p1 = (C05P1) ListProtector.get(list2, i)) != null) {
                    fLJJJJLL = interfaceC1675870tiD2.LJJJJLL(((Number) c05p1.getValue()).floatValue());
                } else {
                    fLJJJJLL = interfaceC1675870tiD2.LJJJJLL(f2);
                }
                float fIntBitsToFloat = i * (fLJJJJLL2 + fLJJJJLL3);
                if (interfaceC1675870tiD2.getLayoutDirection() == EnumC1671200tag.Rtl) {
                    fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32)) - fIntBitsToFloat) - fLJJJJLL2;
                }
                C1675860tiC.LJIIL(interfaceC1675870tiD2, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() & 4294967295L)) - fLJJJJLL)) & 4294967295L), (((long) Float.floatToRawIntBits(fLJJJJLL2)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL)) & 4294967295L), jFloatToRawIntBits, null, 0, 240);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
