package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677140tkG extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ AbstractC1159950gI5 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C13LY<Float> LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677140tkG(AbstractC1159950gI5 abstractC1159950gI5, float f, float f2, C13LY<Float> c13ly, float f3, float f4, int i, int i2) {
        super(2);
        this.LL = abstractC1159950gI5;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = c13ly;
        this.LLILZIL = f3;
        this.LLILZLL = f4;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1677100tkC.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
