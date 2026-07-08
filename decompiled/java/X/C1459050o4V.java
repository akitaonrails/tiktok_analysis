package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1459050o4V extends AbstractC572220McO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C19A3 LLJLILLLLZIIL;
    public final int LLJLL;
    public final C01GW LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C11NJ LLJZ;
    public boolean LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459050o4V.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459050o4V.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLL.getValue(this, LLLF[1]);
    }

    private final InterfaceC1455860nzM o2() {
        return (InterfaceC1455860nzM) this.LLJLLL.getValue(this, LLLF[0]);
    }

    private final C1459010o4R w2() {
        return (C1459010o4R) this.LLJLLIL.getValue();
    }

    public void H2() {
        this.LLJZ.dispose();
    }

    private final void G2() {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        if (C1458070o2v.LJFF() && MusicBeanUtilKt.extractAVMusic(LJJJLIIL().creativeModel.musicBuzModel) == null) {
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            int duration = 0;
            if (videoPublishEditModelLJJJLIIL == null || (creativeModel = videoPublishEditModelLJJJLIIL.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || musicBuzModel.musicMaxLoopDuration != 0) {
                return;
            }
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            MusicBuzModel musicBuzModel2 = LJJJLIIL().creativeModel.musicBuzModel;
            int iLIZLLL = C1458070o2v.LIZLLL();
            InterfaceC1455860nzM interfaceC1455860nzMO2 = o2();
            if (interfaceC1455860nzMO2 != null && (abstractC1452680nuEGc = interfaceC1455860nzMO2.gc()) != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null) {
                duration = interfaceC1452170ntPLJIJ.getDuration();
            }
            int iMin = Math.min(iLIZLLL, duration);
            c1452640nuA.getClass();
            C1452640nuA.LJIIIZ(musicBuzModel2, true, iMin);
        }
    }

    private final void T2() {
        if (LJJJLIIL().mIsFromDraft) {
            if (C1458070o2v.LJFF()) {
                if (MusicBeanUtilKt.extractAVMusic(LJJJLIIL().creativeModel.musicBuzModel) == null || LJJJLIIL().creativeModel.musicBuzModel.shouldMusicLoop == C1458070o2v.LJ(LJJJLIIL().creativeModel.musicBuzModel)) {
                    return;
                }
                C1654360t9W.LIZ = true;
                return;
            }
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJJLIIL().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null || !aVMusicExtractAVMusic.isLoopMusic() || C1458070o2v.LJFF()) {
                return;
            }
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            MusicBuzModel musicBuzModel = LJJJLIIL().creativeModel.musicBuzModel;
            int iLJJL = C1416310mxZ.LJJL(LJJJLIIL(), 0, null, 3);
            c1452640nuA.getClass();
            C1452640nuA.LJIIIIZZ(musicBuzModel, false, iLJJL);
            C1452640nuA.LJIIJ(aVMusicExtractAVMusic, false, C1416310mxZ.LJJL(LJJJLIIL(), 0, null, 3));
            InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) getDiContainer().LJIIL(null, InterfaceC1454960nxu.class);
            if (interfaceC1454960nxu != null) {
                interfaceC1454960nxu.Rq(aVMusicExtractAVMusic.path, aVMusicExtractAVMusic, false, false, false, false, aVMusicExtractAVMusic.getDuration(), false, true, "", false, null);
            }
        }
    }

    @Override // X.InterfaceC1453200nv4
    public void Fp() {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.Fp();
        }
    }

    @Override // X.InterfaceC1453200nv4
    public Boolean Oj() {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC1459070o4X.Oj());
    }

    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    public void U1() {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.U1();
        }
    }

    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    public List<MusicModel> getMusicList() {
        List<MusicModel> musicList;
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        return (interfaceC1459070o4X == null || (musicList = interfaceC1459070o4X.getMusicList()) == null) ? C13BV.INSTANCE : musicList;
    }

    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    public void hide() {
        super.hide();
        C1459010o4R c1459010o4RW2 = w2();
        InterfaceC1459070o4X interfaceC1459070o4X = c1459010o4RW2.LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.hide();
        }
        InterfaceC1459150o4f interfaceC1459150o4f = c1459010o4RW2.LLJLLL;
        if (interfaceC1459150o4f != null) {
            interfaceC1459150o4f.cancel();
        }
        c1459010o4RW2.LLJLLL = null;
    }

    @Override // X.InterfaceC1453200nv4
    public String ib() {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            return interfaceC1459070o4X.ib();
        }
        return null;
    }

    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    public void mi() {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.mi();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        Boolean boolValueOf;
        InterfaceC1455860nzM interfaceC1455860nzMO2;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ2;
        NLEModel nLEModelLIZ;
        super.onCreate();
        if (C1416310mxZ.LJJJJZ(LJJJLIIL())) {
            InterfaceC1455860nzM interfaceC1455860nzMO22 = o2();
            if (interfaceC1455860nzMO22 == null || (abstractC1452680nuEGc2 = interfaceC1455860nzMO22.gc()) == null || (interfaceC1452170ntPLJIJ2 = abstractC1452680nuEGc2.LJIJ()) == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPLJIJ2)) == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(C346780Die.LIZ(nLEModelLIZ) != null);
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && (interfaceC1455860nzMO2 = o2()) != null && (abstractC1452680nuEGc = interfaceC1455860nzMO2.gc()) != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
                interfaceC391070FUzLJFF.LJJI(new C347060Dj6(LJJJLIIL().getVoiceVolume(), Double.valueOf(0.0d), false));
            }
        }
        G2();
        T2();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        H2();
    }

    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    public void Ex1(String str) {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.LIZ(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bb  */
    @Override // X.AbstractC572220McO, X.InterfaceC1453200nv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJ(boolean r49) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459050o4V.LJJ(boolean):void");
    }

    @Override // X.InterfaceC1453200nv4
    public boolean LLLLZI(boolean z) {
        InterfaceC1459070o4X interfaceC1459070o4X = w2().LLJJJJLIIL;
        if (interfaceC1459070o4X == null || !interfaceC1459070o4X.LLLLZI(z)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1453200nv4
    public void vU(boolean z) {
        AVMusic aVMusicExtractAVMusic;
        if (C1458070o2v.LJFF() && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJJLIIL().creativeModel.musicBuzModel)) != null && aVMusicExtractAVMusic.isLoopMusic() != z) {
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            int iLJJL = C1416310mxZ.LJJL(LJJJLIIL(), 0, aVMusicExtractAVMusic, 1);
            c1452640nuA.getClass();
            C1452640nuA.LJIIJ(aVMusicExtractAVMusic, z, iLJJL);
            InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) getDiContainer().LJIIL(null, InterfaceC1454960nxu.class);
            if (interfaceC1454960nxu != null) {
                interfaceC1454960nxu.Rq("", null, false, false, false, false, -1L, false, true, "", false, null);
                interfaceC1454960nxu.Rq(aVMusicExtractAVMusic.path, aVMusicExtractAVMusic, false, false, false, false, aVMusicExtractAVMusic.getDuration(), false, true, "", false, null);
            }
        }
    }

    public C1459050o4V(C1DRG c1drg, C19A3 c19a3, int i) {
        super(c1drg);
        this.LLJLILLLLZIIL = c19a3;
        this.LLJLL = i;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS423S0200000_22(c1drg, this, 56));
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJZ = new C11NJ();
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
