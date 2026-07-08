package X;

import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.114V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C114V {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C375830EoP<List<List<ReadTextEffectBean>>> LJFF;
    public final C375830EoP<ReadTextEffectBean> LJI;
    public final ShortVideoCommonParams LJII;

    public C114V() {
        this(0);
    }

    public /* synthetic */ C114V(int i) {
        this(true, true, false, "", false, new C375830EoP(new ArrayList()), null, null);
    }

    public C114V(boolean z, boolean z2, boolean z3, String str, boolean z4, C375830EoP<List<List<ReadTextEffectBean>>> c375830EoP, C375830EoP<ReadTextEffectBean> c375830EoP2, ShortVideoCommonParams shortVideoCommonParams) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJ = z4;
        this.LJFF = c375830EoP;
        this.LJI = c375830EoP2;
        this.LJII = shortVideoCommonParams;
    }

    public static C114V LIZ(C114V c114v, boolean z, boolean z2, boolean z3, String str, boolean z4, C375830EoP c375830EoP, C375830EoP c375830EoP2, ShortVideoCommonParams shortVideoCommonParams, int i) {
        ShortVideoCommonParams shortVideoCommonParams2 = shortVideoCommonParams;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        boolean z5 = z4;
        String str2 = str;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        if ((i & 1) != 0) {
            z8 = c114v.LIZ;
        }
        if ((i & 2) != 0) {
            z7 = c114v.LIZIZ;
        }
        if ((i & 4) != 0) {
            z6 = c114v.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c114v.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c114v.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP4 = c114v.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP3 = c114v.LJI;
        }
        if ((i & 128) != 0) {
            shortVideoCommonParams2 = c114v.LJII;
        }
        c114v.getClass();
        return new C114V(z8, z7, z6, str2, z5, c375830EoP4, c375830EoP3, shortVideoCommonParams2);
    }
}
