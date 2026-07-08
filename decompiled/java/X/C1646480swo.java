package X;

import a6n.a;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0swo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646480swo implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL = "video";
    public final boolean LLILZ = true;
    public final C1DRG LLILZIL;
    public InterfaceC1650230t2r LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final q LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646480swo.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1646480swo.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new InterfaceC1653360t7u() { // from class: X.0swn
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                a aVar2 = aVar;
                if (aVar2.LIZ) {
                    InterfaceC1646290swV interfaceC1646290swV = aVar2.LIZIZ;
                    if (interfaceC1646290swV != null) {
                        interfaceC1646290swV.n3("record");
                    }
                } else {
                    ln3.a aVar3 = aVar2.LIZLLL;
                    if (aVar3 != null) {
                        aVar3.n3("record");
                    }
                }
                C1631530sYh c1631530sYh = C1631530sYh.LIZ;
                String str = c1653330t7r.LIZIZ;
                c1631530sYh.getClass();
                int iLIZIZ = C1631530sYh.LIZIZ(str);
                aVar.LIZLLL().shootMode = iLIZIZ;
                C1646480swo c1646480swo = this;
                C1664750tQH c1664750tQH = c1646480swo.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1646480swo.LLJI;
                ((com.ss.android.ugc.aweme.shortvideo.component.a) c1664750tQH.getValue(c1646480swo, interfaceC2217461BqaArr[0])).eP2(c1646490swp.LIZLLL);
                a aVar4 = aVar;
                String str2 = c1653330t7r.LIZIZ;
                ShortVideoContext shortVideoContextLIZLLL = aVar4.LIZLLL();
                boolean z = c1646490swp.LIZ;
                if ((Intrinsics.LJFF(C1631530sYh.LIZ(), str2) || Intrinsics.LJFF(C1631530sYh.LIZIZ, str2)) && !shortVideoContextLIZLLL.LJJLL()) {
                    C1648150szV c1648150szV = new C1648150szV(Intrinsics.LJFF(C1631530sYh.LIZIZ, str2));
                    c1648150szV.LIZIZ = Intrinsics.LJFF(str2, C1631530sYh.LIZLLL);
                    c1648150szV.LIZLLL = z;
                    c1648150szV.LIZJ = 2;
                    C1646480swo c1646480swo2 = this;
                    ((InterfaceC1648020szI) c1646480swo2.LLIZLLLIL.getValue(c1646480swo2, interfaceC2217461BqaArr[1])).configSwitchDuration(c1648150szV);
                }
                a aVar5 = aVar;
                String str3 = c1653330t7r.LIZIZ;
                ShortVideoContext shortVideoContextLIZLLL2 = aVar5.LIZLLL();
                if ((Intrinsics.LJFF(C1631530sYh.LIZ(), str3) || Intrinsics.LJFF(C1631530sYh.LIZIZ, str3)) && shortVideoContextLIZLLL2.LJJJJZI()) {
                    if (shortVideoContextLIZLLL2.LJJZ()) {
                        shortVideoContextLIZLLL2.cameraComponentModel.mMusicStart = C1444030ngH.LIZIZ(shortVideoContextLIZLLL2.stitchContext.stitchParams);
                    } else if (!shortVideoContextLIZLLL2.mIsFromDraft || (shortVideoContextLIZLLL2.LJI().isEmpty() && !shortVideoContextLIZLLL2.cameraComponentModel.isRetakeMode)) {
                        shortVideoContextLIZLLL2.cameraComponentModel.mMusicStart = 0;
                    }
                    MusicBuzModel musicBuzModel = shortVideoContextLIZLLL2.creativeModel.musicBuzModel;
                    CameraComponentModel cameraComponentModel = shortVideoContextLIZLLL2.cameraComponentModel;
                    musicBuzModel.musicStartFromCut = cameraComponentModel.mMusicStart;
                    musicBuzModel.musicEditFrom = "";
                    C1439190nYT.LJII(cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(musicBuzModel), shortVideoContextLIZLLL2.cameraComponentModel.mMusicStart);
                    InterfaceC2254001DKc interfaceC2254001DKcLIZJ = aVar5.LIZJ();
                    CameraComponentModel cameraComponentModel2 = shortVideoContextLIZLLL2.cameraComponentModel;
                    interfaceC2254001DKcLIZJ.G4(cameraComponentModel2.mMusicPath, cameraComponentModel2.mMusicStart, cameraComponentModel2.mTotalRecordingTime, false, false, false, -1, -1L);
                }
                C1439190nYT.LJIIIIZZ(iLIZIZ);
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        this.LLILZLL = aVar.LIZIZ();
    }

    public C1646480swo(String str, String str2, C1DRG c1drg) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZIL = c1drg;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJ = (q) c1drg.LJIIL(null, q.class);
    }
}
