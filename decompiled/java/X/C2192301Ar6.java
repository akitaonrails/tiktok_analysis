package X;

import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Ar6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192301Ar6 extends C09AY implements InterfaceC1631620sYq<String, Boolean, Boolean, Double> {
    public final /* synthetic */ double LL;
    public final /* synthetic */ C2192231Aqz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192301Ar6(double d, C2192231Aqz c2192231Aqz) {
        super(3);
        this.LL = d;
        this.LLILLJJLI = c2192231Aqz;
    }

    @Override // X.InterfaceC1631620sYq
    public final Double invoke(String str, Boolean bool, Boolean bool2) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        double d = this.LL;
        if (zBooleanValue) {
            d = this.LLILLJJLI.LIZIZ.getDouble(str2, d);
        } else if (!zBooleanValue2) {
            d = super/*X.1Ar1*/.getDouble(str2, d);
        } else {
            String strLJJI = this.LLILLJJLI.LJJI(str2);
            if (this.LLILLJJLI.LIZIZ.contains(strLJJI)) {
                d = this.LLILLJJLI.LIZIZ.getDouble(strLJJI, this.LL);
                if (d != this.LL) {
                    this.LLILLJJLI.LJJII(str2, new AwS648S0100000_34(this.LLILLJJLI, 26), Double.valueOf(d));
                }
            }
        }
        return Double.valueOf(d);
    }
}
