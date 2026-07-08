package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426770nER {
    public final C1426590nE9 LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C113G LJ;
    public final VideoPublishEditModel LJFF;
    public final C375830EoP<String> LJI;
    public final String LJII;

    public static C1426770nER LIZ(C1426770nER c1426770nER, C1426590nE9 c1426590nE9, boolean z, C375830EoP c375830EoP, String str, int i) {
        int i2;
        int i3;
        C113G c113g;
        String str2 = str;
        C375830EoP c375830EoP2 = c375830EoP;
        boolean z2 = z;
        C1426590nE9 c1426590nE92 = c1426590nE9;
        if ((i & 1) != 0) {
            c1426590nE92 = c1426770nER.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1426770nER.LIZIZ;
        }
        if ((i & 4) != 0) {
            i2 = c1426770nER.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = c1426770nER.LIZLLL;
        } else {
            i3 = 0;
        }
        VideoPublishEditModel videoPublishEditModel = null;
        if ((i & 16) != 0) {
            c113g = c1426770nER.LJ;
        } else {
            c113g = null;
        }
        if ((i & 32) != 0) {
            videoPublishEditModel = c1426770nER.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP2 = c1426770nER.LJI;
        }
        if ((i & 128) != 0) {
            str2 = c1426770nER.LJII;
        }
        c1426770nER.getClass();
        return new C1426770nER(c1426590nE92, z2, i2, i3, c113g, videoPublishEditModel, c375830EoP2, str2);
    }

    public C1426770nER(C1426590nE9 c1426590nE9, boolean z, int i, int i2, C113G c113g, VideoPublishEditModel videoPublishEditModel, C375830EoP<String> c375830EoP, String str) {
        this.LIZ = c1426590nE9;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = c113g;
        this.LJFF = videoPublishEditModel;
        this.LJI = c375830EoP;
        this.LJII = str;
    }
}
