package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19718412Cw extends i<InterfaceC1459020o4S, C19717712Cp, C19718112Ct, C19718212Cu> implements InterfaceC1459020o4S, InterfaceC379610EuV {
    public static final C12D0 LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public static final long LLJLL;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public boolean LLJJJ;
    public Function0<Unit> LLJJJIL;
    public boolean LLJJJJ;
    public final C1664680tQA<C156U> LLJJJJJIL;
    public final Function0<C19718112Ct> LLJJJJLIIL;
    public final Function0<C19718212Cu> LLJJL;
    public final Function0<C19717712Cp> LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.12D0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19718412Cw.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19718412Cw.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0), new C2217381BqS(C19718412Cw.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C19718412Cw.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicControlApi;", 0), new C2217381BqS(C19718412Cw.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C19718412Cw.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJL = new Object() { // from class: X.12D0
        };
        LLJLILLLLZIIL = 8;
        LLJLL = 600000L;
    }

    public InterfaceC1459020o4S H4() {
        return this;
    }

    private final InterfaceC1455860nzM O4() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue(this, LLJLIL[2]);
    }

    private final InterfaceC1457600o2A Z4() {
        return (InterfaceC1457600o2A) this.LLJJI.getValue(this, LLJLIL[1]);
    }

    private final InterfaceC1460000o62 d5() {
        return (InterfaceC1460000o62) this.LLJJ.getValue(this, LLJLIL[0]);
    }

    public final InterfaceC1456450o0J K4() {
        return (InterfaceC1456450o0J) this.LLJJIJI.getValue(this, LLJLIL[3]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJLIL[5]);
    }

    public final InterfaceC1454960nxu T4() {
        return (InterfaceC1454960nxu) this.LLJJIJIIJIL.getValue(this, LLJLIL[4]);
    }

    private final void Xi() {
        InterfaceC1460000o62 interfaceC1460000o62D5 = d5();
        if (interfaceC1460000o62D5 != null) {
            interfaceC1460000o62D5.tL2(this, new AwS601S0100000_22(this, 601));
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS608S0100000_29(this, 427));
        } else {
            Z4().ak().LJII(this, Lifecycle.State.RESUMED, new AObjectS247S0100000_29(this, 92));
        }
    }

    @Override // X.InterfaceC1459020o4S
    public void al2() {
        if (C570830Ma9.LIZ(P4().getCurMusicServerLength(), P4(), P4().getMMusicPath())) {
            i3(AFwS273S0000000_29.get$arr$(229));
        } else {
            i3(AFwS273S0000000_29.get$arr$(230));
        }
    }

    public final void k5() {
        C1455260nyO c1455260nyO;
        if (MusicBeanUtilKt.extractAVMusic(P4().creativeModel.musicBuzModel) == null) {
            this.LLJJJIL.invoke();
        }
        C19A3 c19a3 = this.LLJILLL;
        if ((c19a3 instanceof C1455260nyO) && (c1455260nyO = (C1455260nyO) c19a3) != null) {
            C1455260nyO.w(c1455260nyO, false, false, false, false, false, true, true, null, 350);
        }
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelP4 = P4();
        c1458310o3J.getClass();
        C20684815ws.LJIILLIIL("click_remove_add_music", C1458310o3J.LIZ(videoPublishEditModelP4).LIZ);
    }

    @Override // X.InterfaceC1459020o4S
    public void mA1() {
        if (C1453970nwJ.LIZIZ(P4()) && u4.LJJIIJZLJL(P4())) {
            i3(AFwS273S0000000_29.get$arr$(233));
        } else {
            i3(AFwS273S0000000_29.get$arr$(234));
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
        C1438590nXV replaceMusicModel = P4().getReplaceMusicModel();
        if (replaceMusicModel != null && replaceMusicModel.getAddedStrippedOriginSound() && C1453970nwJ.LIZ() && C1453970nwJ.LIZIZ(P4())) {
            i3(AFwS273S0000000_29.get$arr$(228));
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(P4().creativeModel.musicBuzModel);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
                if (c1456960o18 != null && c1456960o18.getStrippedMusic()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                this.LLJJJIL = new AwS430S0200000_29(C1444810nhX.LIZ(P4().creativeModel.musicBuzModel), this, 60);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        boolean zLJI = MethodIDManager.LJI(202099);
        super.onStart();
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 705);
        if (C1428470nHB.LJJZZI(P4())) {
            awS573S0100000_29.invoke();
        } else {
            C0EHK.LJIIJ(O4().ww2(), this, new AObserverS231S0100000_29(awS573S0100000_29, 114));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // ge.i
    public Function0<C19717712Cp> E3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1459020o4S
    public boolean hH() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1459020o4S
    public C1664680tQA<C156U> kp1() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19718112Ct> o2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19718212Cu> w2() {
        return this.LLJJL;
    }

    private final C09AE t5(Function1<? super Float, Unit> function1) {
        return C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19718612Cy(this, function1, null), 3);
    }

    @Override // X.InterfaceC1459020o4S
    public void CK(boolean z) {
        if (z) {
            i3(AFwS273S0000000_29.get$arr$(226));
        } else {
            i3(AFwS273S0000000_29.get$arr$(227));
        }
    }

    public final void F4(MusicBuzModel musicBuzModel) {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        String musicId;
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(musicBuzModel);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
            if (c1456960o18 != null && c1456960o18.getStrippedMusic()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MusicObject musicObject = ((MusicBuzModel) it2.next()).music;
            if (musicObject != null && (musicId = MusicBeanUtilKt.getMusicId(musicObject)) != null) {
                arrayList2.add(musicId);
            }
        }
        AbstractC1452680nuE abstractC1452680nuEGc = O4().gc();
        if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        List<NLETrack> listLJJLIIIJ = C351220Dpo.LJJLIIIJ(model);
        if (listLJJLIIIJ != null) {
            ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
            Iterator<NLETrack> it3 = listLJJLIIIJ.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getSlots(), arrayList3);
            }
            for (NLETrackSlot nLETrackSlot : arrayList3) {
                if (C13LP.LJJJJ(C348350DlB.LIZJ(nLETrackSlot), arrayList2)) {
                    nLETrackSlot.setExtra("slot_extra_muted_by_algorithm", "true");
                }
            }
        }
        nLEEditor.commit();
    }

    @Override // X.InterfaceC1459020o4S
    public void RC1(boolean z) {
        i3(new AwS41S0010000_29(z, 38));
    }

    public void n5(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // X.InterfaceC1459020o4S
    public void tY(Pair<C19718712Cz, MusicBuzModel> pair) {
        AbstractC1452680nuE abstractC1452680nuEGc = O4().gc();
        if (abstractC1452680nuEGc != null) {
            C391360FWc.LIZIZ(abstractC1452680nuEGc, "veEditor#replaceStrippedOriginSound", abstractC1452680nuEGc.LJIJ(), new AwS584S0100000_5(new C347820DkK(pair.getFirst().LIZ), 894));
        }
        C1438590nXV replaceMusicModel = P4().getReplaceMusicModel();
        if (replaceMusicModel != null) {
            replaceMusicModel.setAddedStrippedOriginSound(true);
        }
        C1438590nXV replaceMusicModel2 = P4().getReplaceMusicModel();
        if (replaceMusicModel2 != null) {
            replaceMusicModel2.setStrippedAudioVid(pair.getFirst().LIZIZ);
        }
        i3(AFwS273S0000000_29.get$arr$(231));
        al2();
    }

    public C19718412Cw(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1457600o2A.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456450o0J.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJIL = AFwS218S0000000_29.get$arr$(282);
        this.LLJJJJJIL = new C1664680tQA<>(new C156U(0));
        this.LLJJJJLIIL = new AwS573S0100000_29(this, 704);
        this.LLJJL = new AwS573S0100000_29(this, 706);
        this.LLJJLIIIJLLLLLLLZ = new AwS573S0100000_29(this, 707);
    }

    @Override // X.InterfaceC1459020o4S
    public void JD0(MusicBuzModel musicBuzModel, boolean z) {
        if (musicBuzModel == null) {
            return;
        }
        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(musicBuzModel, this, 61);
        if (z) {
            this.LLJJJIL = awS430S0200000_29;
        } else {
            awS430S0200000_29.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC1459020o4S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Rq0(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r14, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C19718712Cz, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel>> r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19718412Cw.Rq0(kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
