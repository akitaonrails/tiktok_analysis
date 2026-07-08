package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0YEK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEK {
    public final C0YJA LIZ;
    public final C868780Y6i LIZIZ;
    public final C0YLL LIZJ;
    public final C0YEM LIZLLL;

    public C0YEK(C0YJA c0yja, C868780Y6i c868780Y6i, C0YLL c0yll, C0YEM c0yem) {
        this.LIZ = c0yja;
        this.LIZIZ = c868780Y6i;
        this.LIZJ = c0yll;
        this.LIZLLL = c0yem;
    }

    public final void LIZ(String str, String str2, String str3, String str4) {
        float f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UID mismatch from ");
        sbLIZ.append(str);
        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        C868780Y6i c868780Y6i = this.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UID mismatch [source=");
        sbLIZ2.append(str);
        sbLIZ2.append("]: expected=");
        sbLIZ2.append(str2);
        sbLIZ2.append(", actual=");
        sbLIZ2.append(str3);
        c868780Y6i.LJIIIIZZ("UidMismatchTracker", C2188811AlT.LIZIZ(sbLIZ2), illegalStateException);
        C0YLL c0yll = this.LIZJ;
        if (this.LIZLLL.LJIIIZ().LIZIZ) {
            f = 1.0f;
        } else {
            f = 0.01f;
        }
        if (c0yll.LIZJ(f)) {
            C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
            c0yj9.LIZJ("im_sdk_user_id_mismatch");
            c0yj9.LIZ(str2, "request_user_id");
            c0yj9.LIZ(str3, "response_user_id");
            c0yj9.LIZ(str, "mismatch_source");
            c0yj9.LIZ(str4, "tag");
            c0yj9.LIZLLL();
            C0YLL c0yll2 = this.LIZJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("UidMismatchTracker ");
            sbLIZ3.append(str);
            sbLIZ3.append(" caller=");
            sbLIZ3.append(str4);
            c0yll2.LJFF(C2188811AlT.LIZIZ(sbLIZ3), illegalStateException, C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("tag", str4), new Pair("expected_uid", str2), new Pair("actual_uid", str3)));
        }
    }
}
