package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0leB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365850leB implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ = 3000;
    public final IMContact LIZLLL;
    public final boolean LJ;
    public final InterfaceC913660Zsq LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1365850leB)) {
            return false;
        }
        C1365850leB c1365850leB = (C1365850leB) obj;
        return Intrinsics.LJFF(this.LIZ, c1365850leB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1365850leB.LIZIZ) && this.LIZJ == c1365850leB.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1365850leB.LIZLLL) && this.LJ == c1365850leB.LJ && Intrinsics.LJFF(this.LJFF, c1365850leB.LJFF) && Intrinsics.LJFF(this.LJI, c1365850leB.LJI) && Intrinsics.LJFF(this.LJII, c1365850leB.LJII) && this.LJIIIIZZ == c1365850leB.LJIIIIZZ && this.LJIIIZ == c1365850leB.LJIIIZ && this.LJIIJ == c1365850leB.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1365850leB.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1365850leB.LJIIL) && this.LJIILIIL == c1365850leB.LJIILIIL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJII;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        String str4 = this.LJIIJJI;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIL;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        return "ShareSendingEvent(awemeId=" + this.LIZ + ", identity=" + this.LIZIZ + ", duration=" + this.LIZJ + ", contact=" + this.LIZLLL + ", isMulti=" + this.LJ + ", undoCallback=" + this.LJFF + ", enterFrom=" + this.LJI + ", enterMethod=" + this.LJII + ", hasShowAnimation=" + this.LJIIIIZZ + ", hasDismissAnimation=" + this.LJIIIZ + ", isNewGroup=" + this.LJIIJ + ", enterPosition=" + this.LJIIJJI + ", followStatus=" + this.LJIIL + ", isCreateGroupAndShare=" + this.LJIILIIL + ')';
    }

    public C1365850leB(String str, String str2, IMContact iMContact, boolean z, C1365350ldN c1365350ldN, String str3, String str4, boolean z2, boolean z3, boolean z4, String str5, String str6, boolean z5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = iMContact;
        this.LJ = z;
        this.LJFF = c1365350ldN;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = str5;
        this.LJIIL = str6;
        this.LJIILIIL = z5;
    }
}
