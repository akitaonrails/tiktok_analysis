package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;

/* JADX INFO: renamed from: X.0Kdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522190Kdt {
    public final boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public ChoosePhotoPreviewPageConfig LJFF;
    public final C522300Ke4 LJI;
    public C528230Knd LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C522190Kdt() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChoosePhotoConfig(enableLibrary=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supportRepeatSelect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needPreLoadChallenge=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", forcePreview=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageSelectedIndicatorStyle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", previewConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", storyAlbumUIConfig=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C522190Kdt(int i) {
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = new ChoosePhotoPreviewPageConfig(0);
        C522300Ke4 c522300Ke4 = new C522300Ke4();
        C528230Knd c528230Knd = new C528230Knd(null, null, null, null, false, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 33554431);
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = 0;
        this.LJFF = choosePhotoPreviewPageConfig;
        this.LJI = c522300Ke4;
        this.LJII = c528230Knd;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }
}
