package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1554, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1554 extends C155B implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1554.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1554.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1554.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.C155B
    public final List<MusicModel> LIZ() {
        C1456960o18 stripMusicModel;
        MusicModel musicModelLIZ;
        MusicModel musicModelLJIL;
        C1664750tQH c1664750tQH = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(((C155W) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).zt().LIZIZ());
        if (aVMusicExtractAVMusic == null || (((stripMusicModel = aVMusicExtractAVMusic.getStripMusicModel()) != null && stripMusicModel.getStrippedMusic()) || (musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic)) == null || !((!((C155H) this.LLILZ.getValue(this, interfaceC2217461BqaArr[0])).LIZJ.invoke().getUnlimitedOnly() || ((C155H) this.LLILZ.getValue(this, interfaceC2217461BqaArr[0])).LIZJ.invoke().isReplaceMusic()) && C155C.LIZ(musicModelLIZ, (C155H) this.LLILZ.getValue(this, interfaceC2217461BqaArr[0])) && ((musicModelLJIL = ((AbstractC204621154x) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[2])).LJIL()) == null || musicModelLJIL.getMusicSelectedFromNonRecommendedTab())))) {
            return C13BV.INSTANCE;
        }
        musicModelLIZ.setSelected(true);
        return Collections.singletonList(musicModelLIZ);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public AnonymousClass1554(C1DRG c1drg) {
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C155W.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
    }
}
