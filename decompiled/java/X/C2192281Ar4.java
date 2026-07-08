package X;

import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ar4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192281Ar4 extends C09AY implements InterfaceC1631620sYq<String, Boolean, Boolean, String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C2192231Aqz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192281Ar4(C2192231Aqz c2192231Aqz, String str) {
        super(3);
        this.LL = str;
        this.LLILLJJLI = c2192231Aqz;
    }

    @Override // X.InterfaceC1631620sYq
    public final String invoke(String str, Boolean bool, Boolean bool2) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        String str3 = this.LL;
        if (zBooleanValue) {
            return this.LLILLJJLI.LIZIZ.getString(str2, str3);
        }
        if (!zBooleanValue2) {
            return super/*X.1Ar1*/.getString(str2, str3);
        }
        String strLJJI = this.LLILLJJLI.LJJI(str2);
        if (!this.LLILLJJLI.LIZIZ.contains(strLJJI)) {
            return str3;
        }
        String string = this.LLILLJJLI.LIZIZ.getString(strLJJI, this.LL);
        if (string == null) {
            return string;
        }
        String str4 = this.LL;
        C2192231Aqz c2192231Aqz = this.LLILLJJLI;
        if (Intrinsics.LJFF(string, str4)) {
            return string;
        }
        c2192231Aqz.LJJII(str2, new AwS648S0100000_34(c2192231Aqz, 29), string);
        return string;
    }
}
