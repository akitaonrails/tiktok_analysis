package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460830I5h {
    public final C869590Y9l LIZ;
    public final IMUser LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final AbstractC460840I5i LJ;

    public C460830I5h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460830I5h)) {
            return false;
        }
        C460830I5h c460830I5h = (C460830I5h) obj;
        return Intrinsics.LJFF(this.LIZ, c460830I5h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c460830I5h.LIZIZ) && this.LIZJ == c460830I5h.LIZJ && Intrinsics.LJFF(this.LIZLLL, c460830I5h.LIZLLL) && Intrinsics.LJFF(this.LJ, c460830I5h.LJ);
    }

    public final int hashCode() {
        C869590Y9l c869590Y9l = this.LIZ;
        int iHashCode = (c869590Y9l == null ? 0 : c869590Y9l.hashCode()) * 31;
        IMUser iMUser = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (iMUser == null ? 0 : iMUser.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyLayoutUiState(originalMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sender=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", replyText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C460830I5h(int i) {
        final Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        final Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        final Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        final Integer numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        this(null, null, false, null, new AbstractC460840I5i(numValueOf, numValueOf2, numValueOf3, numValueOf4) { // from class: X.0I5j
            public final Integer LIZ;
            public final Integer LIZIZ;
            public final Integer LIZJ;
            public final Integer LIZLLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C460850I5j)) {
                    return false;
                }
                C460850I5j c460850I5j = (C460850I5j) obj;
                return Intrinsics.LJFF(this.LIZ, c460850I5j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c460850I5j.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c460850I5j.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c460850I5j.LIZLLL);
            }

            public final int hashCode() {
                Integer num = this.LIZ;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.LIZIZ;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.LIZJ;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.LIZLLL;
                return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PaddingValue(left=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", top=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", right=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", bottom=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = numValueOf;
                this.LIZIZ = numValueOf2;
                this.LIZJ = numValueOf3;
                this.LIZLLL = numValueOf4;
            }
        });
    }

    public C460830I5h(C869590Y9l c869590Y9l, IMUser iMUser, boolean z, String str, AbstractC460840I5i abstractC460840I5i) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = iMUser;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = abstractC460840I5i;
    }

    public static C460830I5h LIZ(C460830I5h c460830I5h, C869590Y9l c869590Y9l, IMUser iMUser, boolean z, String str, int i) {
        AbstractC460840I5i abstractC460840I5i;
        String str2 = str;
        boolean z2 = z;
        IMUser iMUser2 = iMUser;
        C869590Y9l c869590Y9l2 = c869590Y9l;
        if ((i & 1) != 0) {
            c869590Y9l2 = c460830I5h.LIZ;
        }
        if ((i & 2) != 0) {
            iMUser2 = c460830I5h.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c460830I5h.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c460830I5h.LIZLLL;
        }
        if ((i & 16) != 0) {
            abstractC460840I5i = c460830I5h.LJ;
        } else {
            abstractC460840I5i = null;
        }
        c460830I5h.getClass();
        return new C460830I5h(c869590Y9l2, iMUser2, z2, str2, abstractC460840I5i);
    }
}
