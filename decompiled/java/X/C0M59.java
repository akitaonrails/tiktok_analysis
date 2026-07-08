package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0M59, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M59 {
    public final C0M5E LIZ;
    public final boolean LIZIZ;
    public final AwemeDraft LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C0M59() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AILivePhotoRouteResult(targetPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromCrashRestoreDraft=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", draft=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", differentDevice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", normalPost=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0M59(int i) {
        this(C0M5E.MIDDLE_PAGE, false, null, null, false, false);
    }

    public C0M59(C0M5E c0m5e, boolean z, AwemeDraft awemeDraft, String str, boolean z2, boolean z3) {
        this.LIZ = c0m5e;
        this.LIZIZ = z;
        this.LIZJ = awemeDraft;
        this.LIZLLL = str;
        this.LJ = z2;
        this.LJFF = z3;
    }

    public static C0M59 LIZ(C0M59 c0m59, C0M5E c0m5e, boolean z, AwemeDraft awemeDraft, String str, boolean z2, boolean z3, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        String str2 = str;
        AwemeDraft awemeDraft2 = awemeDraft;
        boolean z6 = z;
        C0M5E c0m5e2 = c0m5e;
        if ((i & 1) != 0) {
            c0m5e2 = c0m59.LIZ;
        }
        if ((i & 2) != 0) {
            z6 = c0m59.LIZIZ;
        }
        if ((i & 4) != 0) {
            awemeDraft2 = c0m59.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c0m59.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c0m59.LJ;
        }
        if ((i & 32) != 0) {
            z4 = c0m59.LJFF;
        }
        return new C0M59(c0m5e2, z6, awemeDraft2, str2, z5, z4);
    }
}
