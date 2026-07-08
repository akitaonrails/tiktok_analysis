package X;

import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Ar3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192271Ar3 extends C09AY implements InterfaceC1631620sYq<String, Boolean, Boolean, Long> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C2192231Aqz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192271Ar3(long j, C2192231Aqz c2192231Aqz) {
        super(3);
        this.LL = j;
        this.LLILLJJLI = c2192231Aqz;
    }

    @Override // X.InterfaceC1631620sYq
    public final Long invoke(String str, Boolean bool, Boolean bool2) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        long j = this.LL;
        if (zBooleanValue) {
            j = this.LLILLJJLI.LIZIZ.getLong(str2, j);
        } else if (!zBooleanValue2) {
            j = super/*X.1Ar1*/.getLong(str2, j);
        } else {
            String strLJJI = this.LLILLJJLI.LJJI(str2);
            if (this.LLILLJJLI.LIZIZ.contains(strLJJI)) {
                j = this.LLILLJJLI.LIZIZ.getLong(strLJJI, this.LL);
                if (j != this.LL) {
                    this.LLILLJJLI.LJJII(str2, new AwS648S0100000_34(this.LLILLJJLI, 28), Long.valueOf(j));
                }
            }
        }
        return Long.valueOf(j);
    }
}
