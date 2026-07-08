package X;

import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricMiniDraftData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQL {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final LyricMiniDraftData LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EQL)) {
            return false;
        }
        C0EQL c0eql = (C0EQL) obj;
        return Intrinsics.LJFF(this.LIZ, c0eql.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eql.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eql.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eql.LIZLLL) && Intrinsics.LJFF(this.LJ, c0eql.LJ) && Intrinsics.LJFF(this.LJFF, c0eql.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        LyricMiniDraftData lyricMiniDraftData = this.LJ;
        int iHashCode2 = (iHashCode + (lyricMiniDraftData == null ? 0 : lyricMiniDraftData.hashCode())) * 31;
        String str = this.LJFF;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricsMiniDraftConfig(musicName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lyricId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", miniDraftData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", selectedFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0EQL LIZ(C0EQL c0eql, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        String str6 = str2;
        String str7 = str;
        if ((i & 1) != 0) {
            str7 = c0eql.LIZ;
        }
        LyricMiniDraftData lyricMiniDraftData = null;
        if ((i & 2) != 0) {
            str3 = c0eql.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c0eql.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = c0eql.LIZLLL;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            lyricMiniDraftData = c0eql.LJ;
        }
        if ((i & 32) != 0) {
            str6 = c0eql.LJFF;
        }
        c0eql.getClass();
        return new C0EQL(str7, str3, str4, str5, lyricMiniDraftData, str6);
    }

    public /* synthetic */ C0EQL(String str, String str2, String str3, String str4, LyricMiniDraftData lyricMiniDraftData) {
        this(str, str2, str3, str4, lyricMiniDraftData, null);
    }

    public C0EQL(String str, String str2, String str3, String str4, LyricMiniDraftData lyricMiniDraftData, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = lyricMiniDraftData;
        this.LJFF = str5;
    }
}
