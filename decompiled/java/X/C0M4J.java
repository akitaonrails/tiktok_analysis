package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0M4J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4J {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC562220M3g LIZJ;
    public final C0M4F LIZLLL;
    public final Function1<AwemeDraft, Boolean> LJ;

    public C0M4J(boolean z, boolean z2, EnumC562220M3g enumC562220M3g, C0M4F c0m4f, Function1 function1, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        enumC562220M3g = (i & 4) != 0 ? EnumC562220M3g.ALL : enumC562220M3g;
        c0m4f = (i & 8) != 0 ? C0M4F.EXCEPT_TTN : c0m4f;
        function1 = (i & 64) != 0 ? null : function1;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC562220M3g;
        this.LIZLLL = c0m4f;
        this.LJ = function1;
    }
}
