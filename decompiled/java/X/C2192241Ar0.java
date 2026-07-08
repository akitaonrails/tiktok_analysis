package X;

import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Ar0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192241Ar0 extends C09AY implements InterfaceC1631620sYq<String, Boolean, Boolean, Integer> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C2192231Aqz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192241Ar0(int i, C2192231Aqz c2192231Aqz) {
        super(3);
        this.LL = i;
        this.LLILLJJLI = c2192231Aqz;
    }

    @Override // X.InterfaceC1631620sYq
    public final Integer invoke(String str, Boolean bool, Boolean bool2) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        int i = this.LL;
        if (zBooleanValue) {
            i = this.LLILLJJLI.LIZIZ.getInt(str2, i);
        } else if (!zBooleanValue2) {
            i = super/*X.1Ar1*/.getInt(str2, i);
        } else {
            String strLJJI = this.LLILLJJLI.LJJI(str2);
            if (this.LLILLJJLI.LIZIZ.contains(strLJJI) && (i = this.LLILLJJLI.LIZIZ.getInt(strLJJI, this.LL)) != this.LL) {
                this.LLILLJJLI.LJJII(str2, new AwS648S0100000_34(this.LLILLJJLI, 27), Integer.valueOf(i));
            }
        }
        return Integer.valueOf(i);
    }
}
