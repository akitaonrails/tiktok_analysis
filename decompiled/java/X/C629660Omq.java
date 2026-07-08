package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Omq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629660Omq implements InterfaceC0148002o {
    public final AbstractC1623806Xk<MusicDetail> LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final Pair<Integer, Integer> LLILZLL;
    public final C291001Au<Integer> LLIZ;
    public final String LLIZLLLIL;

    public C629660Omq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C629660Omq)) {
            return false;
        }
        C629660Omq c629660Omq = (C629660Omq) obj;
        return Intrinsics.LJFF(this.LL, c629660Omq.LL) && this.LLILLJJLI == c629660Omq.LLILLJJLI && this.LLILLL == c629660Omq.LLILLL && this.LLILZ == c629660Omq.LLILZ && this.LLILZIL == c629660Omq.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c629660Omq.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c629660Omq.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c629660Omq.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<Integer> c291001Au = this.LLIZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDetailState(musicDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showPgcMetadataInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", behindTheSongVideoType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", artistLabel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", scrollXY=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", scrollState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C629660Omq(int i) {
        this(C491101vh.LIZ, true, 0, 0, 0, new Pair(0, 0), null, null);
    }

    public C629660Omq(AbstractC1623806Xk<MusicDetail> abstractC1623806Xk, boolean z, int i, int i2, int i3, Pair<Integer, Integer> pair, C291001Au<Integer> c291001Au, String str) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = pair;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = str;
    }

    public static C629660Omq LIZ(C629660Omq c629660Omq, AbstractC1623806Xk abstractC1623806Xk, int i, int i2, int i3, Pair pair, String str, int i4) {
        boolean z;
        C291001Au<Integer> c291001Au;
        int i5 = i3;
        String str2 = str;
        int i6 = i2;
        int i7 = i;
        Pair pair2 = pair;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i4 & 1) != 0) {
            abstractC1623806Xk2 = c629660Omq.LL;
        }
        if ((i4 & 2) != 0) {
            z = c629660Omq.LLILLJJLI;
        } else {
            z = false;
        }
        if ((i4 & 4) != 0) {
            i7 = c629660Omq.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i6 = c629660Omq.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i5 = c629660Omq.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            pair2 = c629660Omq.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            c291001Au = c629660Omq.LLIZ;
        } else {
            c291001Au = null;
        }
        if ((i4 & 128) != 0) {
            str2 = c629660Omq.LLIZLLLIL;
        }
        c629660Omq.getClass();
        return new C629660Omq(abstractC1623806Xk2, z, i7, i6, i5, pair2, c291001Au, str2);
    }
}
