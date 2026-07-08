package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20384914pb extends AbstractC21342018fa {
    public static final /* synthetic */ int LIZJ = 0;
    public final C410901il LIZ;
    public final C410901il LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C20384914pb(C410901il c410901il, C410901il c410901il2) {
        this.LIZ = c410901il;
        this.LIZIZ = c410901il2;
    }

    public static boolean LJFF(Playbook playbook, Playbook playbook2) {
        Long lValueOf;
        if (playbook.playbookId != playbook2.playbookId) {
            return false;
        }
        PlaybookContent playbookContent = playbook.content;
        Long lValueOf2 = null;
        if (playbookContent != null) {
            lValueOf = Long.valueOf(playbookContent.playbookContentId);
        } else {
            lValueOf = null;
        }
        PlaybookContent playbookContent2 = playbook2.content;
        if (playbookContent2 != null) {
            lValueOf2 = Long.valueOf(playbookContent2.playbookContentId);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        PlaybookContent playbookContent3 = playbook.content;
        PlaybookContent playbookContent4 = playbook2.content;
        if ((playbookContent3 != null && playbookContent4 != null && (!Intrinsics.LJFF(playbookContent3.title, playbookContent4.title) || !Intrinsics.LJFF(playbookContent3.coverUri, playbookContent4.coverUri) || !Intrinsics.LJFF(playbookContent3.description, playbookContent4.description) || playbookContent3.minSymphonyEngineAppVersion != playbookContent4.minSymphonyEngineAppVersion || !Intrinsics.LJFF(playbookContent3.flowStr, playbookContent4.flowStr))) || playbook.totalFavorites != playbook2.totalFavorites || playbook.totalUsage != playbook2.totalUsage || playbook.createTime != playbook2.createTime || playbook.updateTime != playbook2.updateTime || playbook.isMyFavorite != playbook2.isMyFavorite || playbook.isUpdatedVersion != playbook2.isUpdatedVersion) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        if (i >= this.LIZ.size() || i2 >= this.LIZIZ.size()) {
            return false;
        }
        Object obj = this.LIZ.get(i);
        Object obj2 = this.LIZIZ.get(i2);
        if ((obj instanceof C20390914qZ) && (obj2 instanceof C20390914qZ)) {
            C20390914qZ c20390914qZ = (C20390914qZ) obj;
            C20390914qZ c20390914qZ2 = (C20390914qZ) obj2;
            if (!LJFF(c20390914qZ.LIZ, c20390914qZ2.LIZ) || c20390914qZ.LIZIZ != c20390914qZ2.LIZIZ || c20390914qZ.LIZJ != c20390914qZ2.LIZJ) {
                return false;
            }
            return true;
        }
        if ((obj instanceof Playbook) && (obj2 instanceof Playbook)) {
            return LJFF((Playbook) obj, (Playbook) obj2);
        }
        if ((obj instanceof C20412414u2) && (obj2 instanceof C20412414u2)) {
            return Intrinsics.LJFF(obj, obj2);
        }
        if ((obj instanceof C11V2) && (obj2 instanceof C11V2)) {
            return Intrinsics.LJFF(obj, obj2);
        }
        if ((obj instanceof C20389314qJ) && (obj2 instanceof C20389314qJ)) {
            C20389314qJ c20389314qJ = (C20389314qJ) obj;
            C20359414lU c20359414lU = c20389314qJ.LIZ;
            C20389314qJ c20389314qJ2 = (C20389314qJ) obj2;
            C20359414lU c20359414lU2 = c20389314qJ2.LIZ;
            if (c20359414lU.LIZ != c20359414lU2.LIZ || !Intrinsics.LJFF(c20359414lU.LIZIZ, c20359414lU2.LIZIZ) || c20389314qJ.LIZIZ != c20389314qJ2.LIZIZ || !Intrinsics.LJFF(c20389314qJ.LIZJ, c20389314qJ2.LIZJ)) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C1777560wME) && (obj2 instanceof C1777560wME)) {
            C1777560wME c1777560wME = (C1777560wME) obj;
            C1777560wME c1777560wME2 = (C1777560wME) obj2;
            if (c1777560wME.LIZ != c1777560wME2.LIZ || c1777560wME.LIZIZ != c1777560wME2.LIZIZ || !Intrinsics.LJFF(c1777560wME.LIZJ, c1777560wME2.LIZJ)) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C20359414lU) && (obj2 instanceof C20359414lU)) {
            C20359414lU c20359414lU3 = (C20359414lU) obj;
            C20359414lU c20359414lU4 = (C20359414lU) obj2;
            if (c20359414lU3.LIZ != c20359414lU4.LIZ || !Intrinsics.LJFF(c20359414lU3.LIZIZ, c20359414lU4.LIZIZ)) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C20361214lm) && (obj2 instanceof C20361214lm)) {
            return C20362314lx.LIZ((C20361214lm) obj, (C20361214lm) obj2);
        }
        if ((obj instanceof C1890520zIQ) && (obj2 instanceof C1890520zIQ)) {
            if (((C1890520zIQ) obj).LIZ != ((C1890520zIQ) obj2).LIZ) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C20407814tI) && (obj2 instanceof C20407814tI)) {
            if (((C20407814tI) obj).LIZ != ((C20407814tI) obj2).LIZ) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C1890550zIT) && (obj2 instanceof C1890550zIT)) {
            if (((C1890550zIT) obj).LIZ != ((C1890550zIT) obj2).LIZ) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C20390514qV) && (obj2 instanceof C20390514qV)) {
            if (((C20390514qV) obj).LIZ != ((C20390514qV) obj2).LIZ) {
                return false;
            }
            return true;
        }
        if ((obj instanceof C20408114tL) && (obj2 instanceof C20408114tL)) {
            return true;
        }
        if ((obj instanceof C20408214tM) && (obj2 instanceof C20408214tM)) {
            return true;
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        if (i >= this.LIZ.size() || i2 >= this.LIZIZ.size() || this.LIZ.get(i).getClass() != this.LIZIZ.get(i2).getClass()) {
            return false;
        }
        return true;
    }
}
