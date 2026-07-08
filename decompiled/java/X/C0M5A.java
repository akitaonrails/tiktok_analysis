package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0M5A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5A {
    public final C0M5B LIZ;
    public final boolean LIZIZ;
    public final AwemeDraft LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C0M5A() {
        this(0);
    }

    public /* synthetic */ C0M5A(int i) {
        this(C0M5B.MIDDLE_PAGE, false, null, null, false);
    }

    public C0M5A(C0M5B c0m5b, boolean z, AwemeDraft awemeDraft, String str, boolean z2) {
        this.LIZ = c0m5b;
        this.LIZIZ = z;
        this.LIZJ = awemeDraft;
        this.LIZLLL = str;
        this.LJ = z2;
    }

    public static C0M5A LIZ(C0M5A c0m5a, C0M5B c0m5b, boolean z, AwemeDraft awemeDraft, String str, boolean z2, int i) {
        boolean z3 = z2;
        String str2 = str;
        AwemeDraft awemeDraft2 = awemeDraft;
        boolean z4 = z;
        C0M5B c0m5b2 = c0m5b;
        if ((i & 1) != 0) {
            c0m5b2 = c0m5a.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c0m5a.LIZIZ;
        }
        if ((i & 4) != 0) {
            awemeDraft2 = c0m5a.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c0m5a.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c0m5a.LJ;
        }
        return new C0M5A(c0m5b2, z4, awemeDraft2, str2, z3);
    }
}
