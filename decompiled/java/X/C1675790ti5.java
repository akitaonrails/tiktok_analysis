package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ti5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675790ti5 extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ List<C1677480tko<Float, C1677280tkU>> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ C1675800ti6 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675790ti5(List<C1677480tko<Float, C1677280tkU>> list, int i, float f, boolean z, float f2, C1675800ti6 c1675800ti6) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = z;
        this.LLILZIL = f2;
        this.LLILZLL = c1675800ti6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        InterfaceC1679550to9 interfaceC1679550to92 = interfaceC1679550to9;
        float fFloatValue = ((Number) ((C1677480tko) ListProtector.get(this.LL, this.LLILLJJLI)).LIZLLL()).floatValue();
        float fLJJJJLL = interfaceC1679550to92.LJJJJLL(this.LLILLL) * fFloatValue;
        if (this.LLILZ) {
            fLJJJJLL = -fLJJJJLL;
        }
        interfaceC1679550to92.LJII(fLJJJJLL);
        interfaceC1679550to92.LJI(interfaceC1679550to92.LJJJJLL(this.LLILZIL) * fFloatValue);
        float f = 1.0f - ((1.0f - this.LLILZLL.LJ) * fFloatValue);
        interfaceC1679550to92.LJIIJ(f);
        interfaceC1679550to92.LJIIJJI(f);
        interfaceC1679550to92.setAlpha(1.0f - ((1.0f - this.LLILZLL.LJFF) * fFloatValue));
        return Unit.LIZ;
    }
}
