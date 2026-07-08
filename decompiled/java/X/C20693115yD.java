package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693115yD extends AbstractC19293010ds {
    public final CharSequence LLILZIL;
    public final C207088161u LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final Object LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20693115yD)) {
            return false;
        }
        C20693115yD c20693115yD = (C20693115yD) obj;
        return Intrinsics.LJFF(this.LLILZIL, c20693115yD.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c20693115yD.LLILZLL) && this.LLIZ == c20693115yD.LLIZ && this.LLIZLLLIL == c20693115yD.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c20693115yD.LLJ) && this.LLJI == c20693115yD.LLJI && this.LLJIJIL == c20693115yD.LLJIJIL;
    }

    public final int hashCode() {
        int iHashCode = this.LLILZIL.hashCode() * 31;
        C207088161u c207088161u = this.LLILZLL;
        int iHashCode2 = (((((iHashCode + (c207088161u == null ? 0 : c207088161u.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        Object obj = this.LLJ;
        return ((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationFeedbackItem(text=");
        sbLIZ.append((Object) this.LLILZIL);
        sbLIZ.append(", feedbackInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", divider=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", blockEnd=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", blockBegin=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLIZLLLIL;
    }

    public static C20693115yD LIZIZ(C20693115yD c20693115yD, boolean z, boolean z2, boolean z3, int i) {
        CharSequence charSequence;
        C207088161u c207088161u;
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        Object obj = null;
        if ((i & 1) != 0) {
            charSequence = c20693115yD.LLILZIL;
        } else {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            c207088161u = c20693115yD.LLILZLL;
        } else {
            c207088161u = null;
        }
        if ((i & 4) != 0) {
            z4 = c20693115yD.LLIZ;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z7 = c20693115yD.LLIZLLLIL;
        }
        if ((i & 16) != 0) {
            obj = c20693115yD.LLJ;
        }
        if ((i & 32) != 0) {
            z6 = c20693115yD.LLJI;
        }
        if ((i & 64) != 0) {
            z5 = c20693115yD.LLJIJIL;
        }
        c20693115yD.getClass();
        return new C20693115yD(charSequence, c207088161u, z4, z7, obj, z6, z5);
    }

    public C20693115yD(CharSequence charSequence, C207088161u c207088161u, boolean z, boolean z2, Object obj, boolean z3, boolean z4) {
        super(z2, obj, 8);
        this.LLILZIL = charSequence;
        this.LLILZLL = c207088161u;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = obj;
        this.LLJI = z3;
        this.LLJIJIL = z4;
    }
}
