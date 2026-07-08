package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.155A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C155A extends C155B implements InterfaceC379610EuV {
    public final C1DRG LLILLL;
    public final AnonymousClass1554 LLILZ;
    public MusicModel LLILZIL;

    @Override // X.C155B
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C155B
    public final List<MusicModel> LIZ() {
        List<MusicModel> listSingletonList;
        List<MusicModel> listLIZ = this.LLILZ.LIZ();
        if (!(!listLIZ.isEmpty())) {
            MusicModel musicModel = this.LLILZIL;
            return (musicModel == null || (listSingletonList = Collections.singletonList(musicModel)) == null) ? C13BV.INSTANCE : listSingletonList;
        }
        MusicModel musicModel2 = (MusicModel) C13LP.LJJJJZI(listLIZ);
        if (musicModel2.getMusicSelectedFromNonRecommendedTab()) {
            this.LLILZIL = musicModel2;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C155A(C1DRG c1drg) {
        this.LLILLL = c1drg;
        this.LLILZ = new AnonymousClass1554(c1drg);
    }
}
