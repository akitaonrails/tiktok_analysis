package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340430kzB extends C1340400kz8 implements Cloneable {
    public final Comment LLILZIL;
    public final C1340410kz9 LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340430kzB)) {
            return false;
        }
        C1340430kzB c1340430kzB = (C1340430kzB) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1340430kzB.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1340430kzB.LLILZLL);
    }

    public final int hashCode() {
        return (this.LLILZIL.hashCode() * 31) + this.LLILZLL.hashCode();
    }

    @Override // X.C1340400kz8
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentItem(comment=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1340430kzB clone() {
        C1340430kzB c1340430kzB = new C1340430kzB(this.LLILZIL.m169clone(), C1340410kz9.LIZ(this.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, null, 16777215));
        C1340420kzA c1340420kzA = new C1340420kzA();
        c1340420kzA.LIZ = c1340430kzB.LLILZ.LIZ;
        c1340430kzB.LLILZ = c1340420kzA;
        return c1340430kzB;
    }

    @Override // X.C1340400kz8, X.AbstractC1049450dPr
    public final Comment LIZ() {
        return this.LLILZIL;
    }

    @Override // X.C1340400kz8
    public final C1340410kz9 LIZIZ() {
        return this.LLILZLL;
    }

    public C1340430kzB(Comment comment, C1340410kz9 c1340410kz9) {
        super(comment, c1340410kz9);
        this.LLILZIL = comment;
        this.LLILZLL = c1340410kz9;
    }

    public static C1340430kzB LJ(C1340430kzB c1340430kzB, C1340410kz9 c1340410kz9) {
        Comment comment = c1340430kzB.LLILZIL;
        c1340430kzB.getClass();
        return new C1340430kzB(comment, c1340410kz9);
    }
}
