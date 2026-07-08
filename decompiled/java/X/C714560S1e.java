package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714560S1e implements InterfaceC0148002o {
    public final AbstractC714580S1g LL;
    public final C714540S1c LLILLJJLI;
    public final C291001Au<C0S1U> LLILLL;
    public final C291001Au<C0S1U> LLILZ;
    public final C291001Au<C0S1Y> LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C714560S1e() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C714560S1e)) {
            return false;
        }
        C714560S1e c714560S1e = (C714560S1e) obj;
        return Intrinsics.LJFF(this.LL, c714560S1e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c714560S1e.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c714560S1e.LLILLL) && Intrinsics.LJFF(this.LLILZ, c714560S1e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c714560S1e.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c714560S1e.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c714560S1e.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<C0S1U> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C0S1U> c291001Au2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C0S1Y> c291001Au3 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        String str = this.LLILZLL;
        return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickReplyState(metaData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickReplyBox=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onEmojiSend=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onDialogStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", quickReplyBoxEnterMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", triggerReason=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C714560S1e(AbstractC714580S1g abstractC714580S1g, C714540S1c c714540S1c, String str, String str2, int i) {
        this((i & 1) != 0 ? new C714550S1d("Invalid") : abstractC714580S1g, (i & 2) != 0 ? new C714540S1c(null, null, null, 0, null, 127) : c714540S1c, null, null, null, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? str2 : "");
    }

    public static C714560S1e LIZ(C714560S1e c714560S1e, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        AbstractC714580S1g abstractC714580S1g;
        C714540S1c c714540S1c;
        String str;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        String str2 = null;
        if ((i & 1) != 0) {
            abstractC714580S1g = c714560S1e.LL;
        } else {
            abstractC714580S1g = null;
        }
        if ((i & 2) != 0) {
            c714540S1c = c714560S1e.LLILLJJLI;
        } else {
            c714540S1c = null;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c714560S1e.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c714560S1e.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c714560S1e.LLILZIL;
        }
        if ((i & 32) != 0) {
            str = c714560S1e.LLILZLL;
        } else {
            str = null;
        }
        if ((i & 64) != 0) {
            str2 = c714560S1e.LLIZ;
        }
        c714560S1e.getClass();
        return new C714560S1e(abstractC714580S1g, c714540S1c, c291001Au6, c291001Au5, c291001Au4, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C714560S1e(AbstractC714580S1g abstractC714580S1g, C714540S1c c714540S1c, C291001Au<? extends C0S1U> c291001Au, C291001Au<? extends C0S1U> c291001Au2, C291001Au<C0S1Y> c291001Au3, String str, String str2) {
        this.LL = abstractC714580S1g;
        this.LLILLJJLI = c714540S1c;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }
}
