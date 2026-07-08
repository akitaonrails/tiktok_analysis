package X;

import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Ar5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192291Ar5 extends C09AY implements InterfaceC1631620sYq<String, Boolean, Boolean, Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C2192231Aqz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192291Ar5(C2192231Aqz c2192231Aqz, boolean z) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = c2192231Aqz;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(String str, Boolean bool, Boolean bool2) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean z = this.LL;
        if (zBooleanValue) {
            z = this.LLILLJJLI.LIZIZ.getBoolean(str2, z);
        } else if (!zBooleanValue2) {
            z = super/*X.1Ar1*/.getBoolean(str2, z);
        } else {
            String strLJJI = this.LLILLJJLI.LJJI(str2);
            if (this.LLILLJJLI.LIZIZ.contains(strLJJI) && (z = this.LLILLJJLI.LIZIZ.getBoolean(strLJJI, this.LL)) != this.LL) {
                this.LLILLJJLI.LJJII(str2, new AwS648S0100000_34(this.LLILLJJLI, 25), Boolean.valueOf(z));
            }
        }
        return Boolean.valueOf(z);
    }
}
