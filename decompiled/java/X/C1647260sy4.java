package X;

import a6n.a;
import com.bytedance.als.ApiCenter;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647260sy4 implements InterfaceC1653190t7d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public InterfaceC1650230t2r LLILZIL;

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return null;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new InterfaceC1653360t7u() { // from class: X.0sy3
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
                int i;
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
                C1647260sy4 c1647260sy4 = this;
                String str = c1653330t7r.LIZIZ;
                c1647260sy4.getClass();
                C1631530sYh.LIZ.getClass();
                String str2 = C1631530sYh.LIZIZ;
                if (Intrinsics.LJFF(str, str2)) {
                    i = 10;
                } else if (Intrinsics.LJFF(str, C1631530sYh.LIZ())) {
                    i = 11;
                } else {
                    i = 8;
                }
                aVar.LIZLLL().shootMode = i;
                ApiCenter apiCenterLIZ = C1309570kBP.LIZ(aVar.LIZ());
                ((com.ss.android.ugc.aweme.shortvideo.component.a) apiCenterLIZ.LIZ(com.ss.android.ugc.aweme.shortvideo.component.a.class)).eP2(true);
                InterfaceC1649660t1w interfaceC1649660t1w = (InterfaceC1649660t1w) apiCenterLIZ.LIZ(InterfaceC1649660t1w.class);
                interfaceC1649660t1w.rS1();
                interfaceC1649660t1w.Hn(3, false);
                InterfaceC1650230t2r interfaceC1650230t2r = this.LLILZIL;
                if (interfaceC1650230t2r == null) {
                    interfaceC1650230t2r = null;
                }
                interfaceC1650230t2r.qh(0);
                ((InterfaceC1649660t1w) apiCenterLIZ.LIZ(InterfaceC1649660t1w.class)).Ik2(true);
                if (C0CHQ.LIZ().LJJIIZI().LJJLI(false)) {
                    ((InterfaceC1650670t3Z) apiCenterLIZ.LIZ(InterfaceC1650670t3Z.class)).p7(true);
                }
                a aVar4 = aVar;
                String str3 = c1653330t7r.LIZIZ;
                aVar4.getClass();
                boolean z = c1646490swp.LIZ;
                if (Intrinsics.LJFF(C1631530sYh.LIZ(), str3) || Intrinsics.LJFF(str2, str3)) {
                    C1648150szV c1648150szV = new C1648150szV(!Intrinsics.LJFF(C1631530sYh.LIZ(), str3));
                    c1648150szV.LIZLLL = z;
                    c1648150szV.LIZJ = 2;
                    ((InterfaceC1647280sy6) C1309570kBP.LIZ(aVar4.LIZ()).LIZ(InterfaceC1647280sy6.class)).configSwitchDuration(c1648150szV);
                }
                a aVar5 = aVar;
                String str4 = c1653330t7r.LIZIZ;
                ShortVideoContext shortVideoContextLIZLLL = aVar5.LIZLLL();
                if ((Intrinsics.LJFF(C1631530sYh.LIZ(), str4) || Intrinsics.LJFF(str2, str4)) && shortVideoContextLIZLLL.LJJJJZI()) {
                    if (shortVideoContextLIZLLL.LJJZ()) {
                        shortVideoContextLIZLLL.cameraComponentModel.mMusicStart = C1444030ngH.LIZIZ(shortVideoContextLIZLLL.stitchContext.stitchParams);
                    } else if (!shortVideoContextLIZLLL.mIsFromDraft || shortVideoContextLIZLLL.LJI().isEmpty()) {
                        shortVideoContextLIZLLL.cameraComponentModel.mMusicStart = 0;
                    }
                    C1439190nYT.LJII(shortVideoContextLIZLLL.cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(shortVideoContextLIZLLL.creativeModel.musicBuzModel), shortVideoContextLIZLLL.cameraComponentModel.mMusicStart);
                    InterfaceC2254001DKc interfaceC2254001DKcLIZJ = aVar5.LIZJ();
                    CameraComponentModel cameraComponentModel = shortVideoContextLIZLLL.cameraComponentModel;
                    interfaceC2254001DKcLIZJ.G4(cameraComponentModel.mMusicPath, cameraComponentModel.mMusicStart, cameraComponentModel.mTotalRecordingTime, false, false, false, -1, -1L);
                }
                C1439190nYT.LJIIIIZZ(i);
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        this.LLILZIL = aVar.LIZIZ();
    }

    public C1647260sy4(String str, String str2, String str3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
    }
}
