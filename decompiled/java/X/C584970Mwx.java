package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584970Mwx implements C0N8J<Aweme> {
    public final C0N8J<Aweme> LIZ;
    public final C0N8J<Aweme> LIZIZ;

    public C584970Mwx(int i) {
        C0N22 c0n22 = new C0N22();
        C0N21 c0n21 = new C0N21();
        this.LIZ = c0n22;
        this.LIZIZ = c0n21;
    }

    @Override // X.C0N8J
    public final C0N23 LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // X.C0N8J
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C0N23 LIZIZ(Aweme aweme, String str) {
        C0N23 c0n23LIZ;
        if (Intrinsics.LJFF(str, "general_search") && (c0n23LIZ = this.LIZIZ.LIZ(aweme)) != null) {
            return c0n23LIZ;
        }
        return this.LIZ.LIZ(aweme);
    }
}
