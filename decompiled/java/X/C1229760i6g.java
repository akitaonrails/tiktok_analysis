package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229760i6g implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final EnumC1229960i70 LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final GroupPreviewDisplayMeta LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229760i6g)) {
            return false;
        }
        C1229760i6g c1229760i6g = (C1229760i6g) obj;
        return this.LL == c1229760i6g.LL && Intrinsics.LJFF(this.LLILLJJLI, c1229760i6g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1229760i6g.LLILLL) && this.LLILZ == c1229760i6g.LLILZ && this.LLILZIL == c1229760i6g.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1229760i6g.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1229760i6g.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1229760i6g.LLIZLLLIL) && this.LLJ == c1229760i6g.LLJ && this.LLJI == c1229760i6g.LLJI && this.LLJIJIL == c1229760i6g.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1229760i6g.LLJILJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode = (((((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        GroupPreviewDisplayMeta groupPreviewDisplayMeta = this.LLJILJIL;
        return iHashCode + (groupPreviewDisplayMeta != null ? groupPreviewDisplayMeta.hashCode() : 0);
    }

    public final String toString() {
        return "GroupItem(convShortId=" + this.LL + ", groupName=" + this.LLILLJJLI + ", groupAvatar=" + this.LLILLL + ", groupMemberCount=" + this.LLILZ + ", userGroupStatus=" + this.LLILZIL + ", accessCriteriaDesc=" + this.LLILZLL + ", groupDesc=" + this.LLIZ + ", groupType=" + this.LLIZLLLIL + ", businessType=" + this.LLJ + ", isShowing=" + this.LLJI + ", isHighlighted=" + this.LLJIJIL + ", rawData=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1229760i6g)) {
            return false;
        }
        C1229760i6g c1229760i6g = (C1229760i6g) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1229760i6g.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1229760i6g.LLILLL) || this.LLILZ != c1229760i6g.LLILZ || this.LLILZIL != c1229760i6g.LLILZIL || !Intrinsics.LJFF(this.LLILZLL, c1229760i6g.LLILZLL) || this.LLJ != c1229760i6g.LLJ || !Intrinsics.LJFF(this.LLIZ, c1229760i6g.LLIZ) || this.LLJIJIL != c1229760i6g.LLJIJIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1229760i6g) || this.LL != ((C1229760i6g) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }

    public static C1229760i6g LIZ(C1229760i6g c1229760i6g, String str, String str2, int i, EnumC1229960i70 enumC1229960i70, String str3, boolean z, boolean z2, GroupPreviewDisplayMeta groupPreviewDisplayMeta, int i2) {
        long j;
        String str4;
        int i3;
        GroupPreviewDisplayMeta groupPreviewDisplayMeta2 = groupPreviewDisplayMeta;
        EnumC1229960i70 enumC1229960i702 = enumC1229960i70;
        String str5 = str3;
        boolean z3 = z2;
        int i4 = i;
        boolean z4 = z;
        String str6 = str2;
        String str7 = str;
        if ((i2 & 1) != 0) {
            j = c1229760i6g.LL;
        } else {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            str7 = c1229760i6g.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str6 = c1229760i6g.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i4 = c1229760i6g.LLILZ;
        }
        if ((i2 & 16) != 0) {
            enumC1229960i702 = c1229760i6g.LLILZIL;
        }
        String str8 = null;
        if ((i2 & 32) != 0) {
            str4 = c1229760i6g.LLILZLL;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = c1229760i6g.LLIZ;
        }
        if ((i2 & 128) != 0) {
            str8 = c1229760i6g.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            i3 = c1229760i6g.LLJ;
        } else {
            i3 = 0;
        }
        if ((i2 & 512) != 0) {
            z4 = c1229760i6g.LLJI;
        }
        if ((i2 & 1024) != 0) {
            z3 = c1229760i6g.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            groupPreviewDisplayMeta2 = c1229760i6g.LLJILJIL;
        }
        c1229760i6g.getClass();
        return new C1229760i6g(j, str7, str6, i4, enumC1229960i702, str4, str5, str8, i3, z4, z3, groupPreviewDisplayMeta2);
    }

    public C1229760i6g(long j, String str, String str2, int i, EnumC1229960i70 enumC1229960i70, String str3, String str4, String str5, int i2, boolean z, boolean z2, GroupPreviewDisplayMeta groupPreviewDisplayMeta) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = enumC1229960i70;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i2;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = groupPreviewDisplayMeta;
    }
}
