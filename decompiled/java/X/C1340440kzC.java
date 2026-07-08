package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340440kzC extends C1340400kz8 implements Cloneable {
    public final Comment LLILZIL;
    public final C1340410kz9 LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340440kzC)) {
            return false;
        }
        C1340440kzC c1340440kzC = (C1340440kzC) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1340440kzC.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1340440kzC.LLILZLL);
    }

    public final int hashCode() {
        return (this.LLILZIL.hashCode() * 31) + this.LLILZLL.hashCode();
    }

    @Override // X.C1340400kz8
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentSecondaryItem(comment=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1340440kzC clone() {
        C1340440kzC c1340440kzC = new C1340440kzC(this.LLILZIL.m169clone(), C1340410kz9.LIZ(this.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, null, 16777215));
        C1340420kzA c1340420kzA = new C1340420kzA();
        c1340420kzA.LIZ = c1340440kzC.LLILZ.LIZ;
        c1340440kzC.LLILZ = c1340420kzA;
        return c1340440kzC;
    }

    @Override // X.C1340400kz8, X.AbstractC1049450dPr
    public final Comment LIZ() {
        return this.LLILZIL;
    }

    @Override // X.C1340400kz8
    public final C1340410kz9 LIZIZ() {
        return this.LLILZLL;
    }

    public C1340440kzC(Comment comment, C1340410kz9 c1340410kz9) {
        super(comment, c1340410kz9);
        this.LLILZIL = comment;
        this.LLILZLL = c1340410kz9;
    }

    public static C1340440kzC LJ(C1340440kzC c1340440kzC, C1340410kz9 c1340410kz9) {
        Comment comment = c1340440kzC.LLILZIL;
        c1340440kzC.getClass();
        return new C1340440kzC(comment, c1340410kz9);
    }
}
