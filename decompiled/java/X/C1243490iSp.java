package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243490iSp extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C13LY<Float> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243490iSp(float f, float f2, C13LY<Float> c13ly, int i, float f3, int i2) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = c13ly;
        this.LLILZ = i;
        this.LLILZIL = f3;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1677100tkC.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
