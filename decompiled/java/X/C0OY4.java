package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OY4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OY4 implements InterfaceC111300bX {
    public final long LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final UrlModel LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public final Map<String, String> LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OY4)) {
            return false;
        }
        C0OY4 c0oy4 = (C0OY4) obj;
        return this.LL == c0oy4.LL && this.LLILLJJLI == c0oy4.LLILLJJLI && this.LLILLL == c0oy4.LLILLL && Intrinsics.LJFF(this.LLILZ, c0oy4.LLILZ) && this.LLILZIL == c0oy4.LLILZIL && this.LLILZLL == c0oy4.LLILZLL && this.LLIZ == c0oy4.LLIZ && this.LLIZLLLIL == c0oy4.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0oy4.LLJ) && this.LLJI == c0oy4.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0oy4.LLJIJIL) && this.LLJILJIL == c0oy4.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c0oy4.LLJILJILJ);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        UrlModel urlModel = this.LLILZ;
        return ((((((((((((((((((iY2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ.hashCode();
    }

    public final String toString() {
        return "BulletinCommentSheetHierarchyData(bbId=" + this.LL + ", bbItemId=" + this.LLILLJJLI + ", isIdentityCreator=" + this.LLILLL + ", creatorAvatar=" + this.LLILZ + ", totalCommentsTotal=" + this.LLILZIL + ", enableComment=" + this.LLILZLL + ", isChannelOpen=" + this.LLIZ + ", enableAction=" + this.LLIZLLLIL + ", contentType=" + this.LLJ + ", openKeyboard=" + this.LLJI + ", enterFrom=" + this.LLJIJIL + ", useCacheData=" + this.LLJILJIL + ", extraEventParams=" + this.LLJILJILJ + ')';
    }

    public C0OY4(long j, long j2, boolean z, UrlModel urlModel, int i, boolean z2, boolean z3, boolean z4, String str, boolean z5, String str2, boolean z6, Map<String, String> map) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = z;
        this.LLILZ = urlModel;
        this.LLILZIL = i;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
        this.LLJ = str;
        this.LLJI = z5;
        this.LLJIJIL = str2;
        this.LLJILJIL = z6;
        this.LLJILJILJ = map;
    }
}
