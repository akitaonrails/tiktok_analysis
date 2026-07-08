package X;

import Y.AComparatorS24S0000000_5;
import Y.AObjectS240S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1I, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1I extends C0ETX<C0ET6, C0EFO, C353280Dt8, C0E1J> {
    public static final C0E1P LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public static final int LLLIL;
    public final C19A3 LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final Function0<C353280Dt8> LLJJL;
    public final InterfaceC2217451BqZ<C0E1J> LLJJLIIIJLLLLLLLZ;
    public final FrameCacheViewModel LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C01GW LLLF;
    public InterfaceC353300DtA LLLFF;
    public List<C352700DsC> LLLFFI;
    public C09AE LLLFZ;
    public Boolean LLLI;
    public boolean LLLII;
    public NLETrackSlot LLLIIII;
    public long LLLIIIIL;
    public final C0E1O LLLIIIL;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0E1P] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E1I.class, "adjustCanvasApi", "getAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0E1I.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C0E1I.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C0E1I.class, "epLoadApi", "getEpLoadApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C0E1I.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0), new C2217381BqS(C0E1I.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0), new C2217381BqS(C0E1I.class, "editorProInfoStickerApi", "getEditorProInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0), new C2217381BqS(C0E1I.class, "lyricApi", "getLyricApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0)};
        LLLIIL = new Object() { // from class: X.0E1P
        };
        LLLIL = 8;
    }

    private final C0EHC J6() {
        return (C0EHC) this.LLL.getValue(this, LLLIILIL[7]);
    }

    private final C0EJ3 N6() {
        return (C0EJ3) this.LLJZ.getValue(this, LLLIILIL[5]);
    }

    private final InterfaceC362230EIb S5() {
        return (InterfaceC362230EIb) this.LLJLIL.getValue(this, LLLIILIL[0]);
    }

    private final InterfaceC363820EOe U5() {
        return (InterfaceC363820EOe) this.LLJZIJLIL.getValue(this, LLLIILIL[6]);
    }

    private final C0EC7 d6() {
        return (C0EC7) this.LLJLLL.getValue(this, LLLIILIL[4]);
    }

    private final void k7() {
        Boolean bool = this.LLLI;
        if (bool != null) {
            d6().Jn2(bool.booleanValue());
        }
    }

    private final C0EY2 m6() {
        return (C0EY2) this.LLJLLIL.getValue(this, LLLIILIL[3]);
    }

    public final InterfaceC361710EGb K6() {
        return (InterfaceC361710EGb) this.LLJLL.getValue(this, LLLIILIL[2]);
    }

    public final C0E1J N5() {
        return new C0E1J(new C0E1L(this), new AwS619S0100000_5(this, 21), new AwS619S0100000_5(this, 22), new AwS549S0100000_5(this, 719), new AwS584S0100000_5(this, 623), new C0E1K(this), new C0E1N(this));
    }

    public final C0E5S P6() {
        return (C0E5S) this.LLJLILLLLZIIL.getValue(this, LLLIILIL[1]);
    }

    @Override // X.C0ETX
    public void n5() {
        if (this.LLLII) {
            return;
        }
        C5();
    }

    public final C0E0W u6() {
        return (C0E0W) this.LLLF.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public /* bridge */ /* synthetic */ Function0 w2() {
        return (Function0) this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0ETX
    public void x5() {
        if (this.LLLII) {
            C0ETQ c0etqP4 = P4();
            if (c0etqP4 != null) {
                c0etqP4.close();
                return;
            }
            return;
        }
        C5();
        C0ETQ c0etqP42 = P4();
        if (c0etqP42 != null) {
            c0etqP42.close();
        }
    }

    private final void M5() {
        TextStickerModel textStickerModelYC;
        List<C352950Dsb> list = T2().LIZIZ;
        ArrayList<C352950Dsb> arrayList = new ArrayList();
        for (C352950Dsb c352950Dsb : list) {
            if (C351430Dq9.LIZ(c352950Dsb.LIZIZ) == EnumC355980DxU.TEXT) {
                arrayList.add(c352950Dsb);
            }
        }
        for (C352950Dsb c352950Dsb2 : arrayList) {
            C0EJ3 c0ej3N6 = N6();
            if (c0ej3N6 != null && (textStickerModelYC = c0ej3N6.YC(c352950Dsb2.LJI.getUUID())) != null && (!textStickerModelYC.isVERenderSticker() || c352950Dsb2.LJI.getTransformZ() != textStickerModelYC.getBaseStickerModel().getZIndex())) {
                textStickerModelYC.setForceEffectRender(true);
                textStickerModelYC.getBaseStickerModel().setZIndex(c352950Dsb2.LJI.getTransformZ());
                C0EJ3 c0ej3N62 = N6();
                if (c0ej3N62 != null) {
                    c0ej3N62.RF(textStickerModelYC, true);
                }
            }
        }
    }

    private final void R5() {
        NLEEditor nLEEditorLJI;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
            C0E48 c0e48F42 = F4();
            if (c0e48F42 == null || (nLEEditorLJI = c0e48F42.LLFII().LJI()) == null) {
                return;
            }
            C351420Dq8.LIZ(nLEModelLJI, nLEEditorLJI);
            SeekInfo value = P6().zE2().getValue();
            int iLIZ = value != null ? C352310DrZ.LIZ(value.position) : 0;
            VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (!nLETrack2.getMainTrack() && !C351220Dpo.LLIIZ(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            final ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (NLETrackSlot nLETrackSlot : arrayList2) {
                arrayList3.add(new C352700DsC(C351220Dpo.LLLLLLL(nLETrackSlot.getStartTime()), nLETrackSlot, C351220Dpo.LLLLLLL(nLETrackSlot.getEndTime())));
            }
            InterfaceC353300DtA interfaceC353300DtA = new InterfaceC353300DtA(arrayList3) { // from class: X.0DtR
                public final C353480DtS LIZ;

                {
                    this.LIZ = LIZIZ(0, r2.size() - 1, C13LP.LJLLLL(new AComparatorS24S0000000_5(163), arrayList3));
                }

                @Override // X.InterfaceC353300DtA
                public final List<C352700DsC> LIZ(long j) {
                    ArrayList arrayList4 = new ArrayList();
                    LIZJ(this.LIZ, j, arrayList4);
                    return arrayList4;
                }

                public static C353480DtS LIZIZ(int i, int i2, List list) {
                    long j;
                    if (i > i2) {
                        return null;
                    }
                    int i3 = (i + i2) / 2;
                    C352700DsC c352700DsC = (C352700DsC) ListProtector.get(list, i3);
                    C353480DtS c353480DtS = new C353480DtS(c352700DsC);
                    c353480DtS.LIZJ = LIZIZ(i, i3 - 1, list);
                    C353480DtS c353480DtSLIZIZ = LIZIZ(i3 + 1, i2, list);
                    c353480DtS.LIZLLL = c353480DtSLIZIZ;
                    long j2 = c352700DsC.LIZIZ;
                    C353480DtS c353480DtS2 = c353480DtS.LIZJ;
                    long j3 = Long.MIN_VALUE;
                    if (c353480DtS2 != null) {
                        j = c353480DtS2.LIZIZ;
                    } else {
                        j = Long.MIN_VALUE;
                    }
                    if (c353480DtSLIZIZ != null) {
                        j3 = c353480DtSLIZIZ.LIZIZ;
                    }
                    c353480DtS.LIZIZ = Math.max(j2, Math.max(j, j3));
                    return c353480DtS;
                }

                public static void LIZJ(C353480DtS c353480DtS, long j, List list) {
                    if (c353480DtS == null) {
                        return;
                    }
                    C352700DsC c352700DsC = c353480DtS.LIZ;
                    if (c352700DsC.LIZ <= j && j <= c352700DsC.LIZIZ) {
                        ((ArrayList) list).add(c352700DsC);
                    }
                    C353480DtS c353480DtS2 = c353480DtS.LIZJ;
                    if (c353480DtS2 != null && c353480DtS2.LIZIZ >= j) {
                        LIZJ(c353480DtS2, j, list);
                    }
                    C353480DtS c353480DtS3 = c353480DtS.LIZLLL;
                    if (c353480DtS3 != null && c353480DtS.LIZ.LIZ <= j) {
                        LIZJ(c353480DtS3, j, list);
                    }
                }
            };
            this.LLLFF = interfaceC353300DtA;
            List<C352700DsC> listLIZ = interfaceC353300DtA.LIZ(iLIZ);
            this.LLLFFI = listLIZ;
            Context sceneContext = this.LLJJJJJIL.getSceneContext();
            C0EJ3 c0ej3N6 = N6();
            C0E48 c0e48F43 = F4();
            InterfaceC352930DsZ interfaceC352930DsZLJ = (c0e48F43 == null || (interfaceC353240Dt4Ie = c0e48F43.Ie()) == null) ? null : interfaceC353240Dt4Ie.LJ();
            C0E75 value2 = P6().dQ().getValue();
            i3(new AwS584S0100000_5(C352660Ds8.LIZ(listLIZ, nLEModelLJI, sceneContext, c0ej3N6, interfaceC352930DsZLJ, value2 != null ? value2.LIZJ : null), (List<Pair<Long, Float>>) 624));
            n7(T2().LIZIZ);
        }
    }

    private final void S6() {
        NLETrackSlot nLETrackSlot;
        C0E75 value = P6().dQ().getValue();
        if (value == null || (nLETrackSlot = value.LIZJ) == null) {
            return;
        }
        P6().G22(nLETrackSlot, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true);
        C0E75 value2 = P6().dQ().getValue();
        this.LLLIIII = value2 != null ? value2.LIZJ : null;
        SeekInfo value3 = P6().zE2().getValue();
        this.LLLIIIIL = value3 != null ? value3.position : 0L;
        C12WG.LIZJ(this.LLJJJJJIL, new ARunnableS105S0100000_5(this, 64));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0E1R(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0E1Q(this, null), 3);
        P6().dQ().observe(this, new AObjectS240S0100000_5(this, 103));
    }

    private final void s7() {
        this.LLLI = d6().Jn2(false);
    }

    public final void H5() {
        NLEEditor nLEEditorLJI;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
            C0E48 c0e48F42 = F4();
            if (c0e48F42 == null || (nLEEditorLJI = c0e48F42.LLFII().LJI()) == null) {
                return;
            }
            C351420Dq8.LIZ(nLEModelLJI, nLEEditorLJI);
            List<C352950Dsb> list = T2().LIZIZ;
            List<C352950Dsb> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(40), list);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            for (C352950Dsb c352950Dsb : listLJLLLL) {
                arrayList.add(new C352950Dsb(c352950Dsb.LIZ, c352950Dsb.LIZIZ, c352950Dsb.LIZJ, c352950Dsb.LIZLLL, c352950Dsb.LJ, c352950Dsb.LJFF, c352950Dsb.LJI));
            }
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                ((C352950Dsb) obj).LIZLLL = i2;
                i = i2;
            }
            if (Intrinsics.LJFF(arrayList, list)) {
                return;
            }
            i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 622));
        }
    }

    public final void T6() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(true);
        }
        P6().jB2();
        InterfaceC362230EIb interfaceC362230EIbS5 = S5();
        if (interfaceC362230EIbS5 != null) {
            if (!C357780E0y.LIZ()) {
                interfaceC362230EIbS5.td1(interfaceC362230EIbS5.pg0());
            }
            k7();
        }
        P6().yV(AFwS234S0000000_5.get$arr$(311));
        NLETrackSlot nLETrackSlot = this.LLLIIII;
        if (nLETrackSlot != null) {
            C01TT.LIZJ(new AwS406S0200000_5(this, nLETrackSlot, 69));
        }
        K6().sc0(this.LLLIIIL);
        K6().Ix2(new C0ELW[]{C0ELW.TEXT_STICKER}, false);
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        LiveEvent<Unit> liveEventGs1;
        super.onCreate();
        s7();
        S6();
        R5();
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventGs1 = c0etqP4.Gs1()) != null) {
            liveEventGs1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 104));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 105));
        }
        C12WG.LIZJ(this.LLJJJJJIL, new ARunnableS105S0100000_5(this, 65));
        VideoPublishEditModel editModel = m6().getEditModel();
        if (editModel != null) {
            boolean z = editModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("is_from_create_template", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            c0lab.LJ("creation_id", editModel.getCreationId());
            c0lab.LJ("shoot_way", editModel.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(editModel));
            C20684815ws.LJIILLIIL("adjust_layers_panel_show", c0lab.LIZ);
        }
        K6().V52(this.LLLIIIL);
        K6().Ix2(new C0ELW[]{C0ELW.TEXT_STICKER}, true);
    }

    public final void u7() {
        P6().jB2();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || !c0e48F4.getPlayer().isPlaying()) {
            return;
        }
        c0e48F4.getPlayer().pause(false);
    }

    public InterfaceC2217451BqZ<C0E1J> L6() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final void W6() {
        x5();
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C353280Dt8> o2() {
        return this.LLJJL;
    }

    private final void n7(List<C352950Dsb> list) {
        C09AE c09ae = this.LLLFZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLLFZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C353270Dt7(this, list, null), 3);
    }

    public final void E5(int i) {
        int bottom;
        View viewXg;
        View viewFindViewById;
        C0E5S c0e5sP6 = P6();
        if (c0e5sP6 != null && (viewXg = c0e5sP6.xg()) != null && (viewFindViewById = viewXg.findViewById(R.id.iju)) != null) {
            bottom = viewFindViewById.getBottom();
        } else {
            bottom = 0;
        }
        InterfaceC362230EIb interfaceC362230EIbS5 = S5();
        if (interfaceC362230EIbS5 != null) {
            interfaceC362230EIbS5.Dq1(((i + bottom) + C372480Ej0.LLLLLILLIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), true, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E1I.d7(X.05Vn):java.lang.Object");
    }

    public final void o7(C352950Dsb c352950Dsb) {
        NLETrackSlot nLETrackSlot;
        C0E75 value = P6().dQ().getValue();
        String uuid = null;
        if (value != null) {
            nLETrackSlot = value.LIZJ;
        } else {
            nLETrackSlot = null;
        }
        String uuid2 = c352950Dsb.LJI.getUUID();
        if (nLETrackSlot != null) {
            uuid = nLETrackSlot.getUUID();
        }
        if (Intrinsics.LJFF(uuid2, uuid)) {
            P6().w6(null, false, false);
        } else {
            P6().G22(c352950Dsb.LJI, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0E1O] */
    public C0E1I(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19a3;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = new AwS549S0100000_5(this, 720);
        this.LLJJLIIIJLLLLLLLZ = new C0E1M(this);
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.LLJL = (FrameCacheViewModel) C364210EPr.LIZLLL(FrameCacheViewModel.class);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLJLLL = C1664770tQJ.LIZ(getDiContainer(), C0EC7.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363820EOe.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EHC.class, null);
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(200));
        this.LLLIIIL = new AbstractC385780FAq() { // from class: X.0E1O
            public final int LL = Integer.MAX_VALUE;

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return this.LL;
            }
        };
    }

    public final void y7(int i, int i2) {
        NLEEditor nLEEditorLJI;
        C352950Dsb c352950Dsb;
        C352950Dsb c352950Dsb2;
        String str;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
            C0E48 c0e48F42 = F4();
            if (c0e48F42 == null || (nLEEditorLJI = c0e48F42.LLFII().LJI()) == null || (c352950Dsb = (C352950Dsb) C13LP.LJJJLZIJ(i, T2().LIZIZ)) == null || (c352950Dsb2 = (C352950Dsb) C13LP.LJJJLZIJ(i2, T2().LIZIZ)) == null) {
                return;
            }
            int size = T2().LIZIZ.size();
            String lowerCase = c352950Dsb.LIZIZ.name().toLowerCase(Locale.getDefault());
            VideoPublishEditModel editModel = m6().getEditModel();
            if (editModel != null) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                boolean z = editModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
                C0LAB c0lab = new C0LAB();
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_from_create_template", str);
                c0lab.LJ("creation_id", editModel.getCreationId());
                c0lab.LJ("shoot_way", editModel.mShootWay);
                c0lab.LJ("content_source", C1428470nHB.LJIILIIL(editModel));
                c0lab.LIZ(size, "layer_num");
                c0lab.LJ("layer_name", lowerCase);
                c0lab.LIZ(i3, "layer_position_before");
                c0lab.LIZ(i4, "layer_position_after");
                C20684815ws.LJIILLIIL("adjust_layer", c0lab.LIZ);
            }
            if (i == i2) {
                return;
            }
            C351420Dq8.LIZ(nLEModelLJI, nLEEditorLJI);
            this.LLLII = true;
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("swapItem from:");
            sbLIZ.append(i);
            sbLIZ.append(" to:");
            sbLIZ.append(i2);
            C201955140j.LIZLLL(c563650M8t, "FreeLayerPanelUISlotComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (i > i2) {
                NLETrackSlot nLETrackSlot = c352950Dsb.LJI;
                NLETrackSlot nLETrackSlot2 = c352950Dsb2.LJI;
                EnumC355980DxU enumC355980DxULIZIZ = C351430Dq9.LIZIZ(nLETrackSlot2);
                if (enumC355980DxULIZIZ != null) {
                    int transformZ = nLETrackSlot2.getTransformZ() + 1;
                    C351420Dq8.LIZJ(nLETrackSlot, transformZ, nLEModelLJI, enumC355980DxULIZIZ);
                    nLETrackSlot.setTransformZ(transformZ);
                }
            } else if (i < i2) {
                NLETrackSlot nLETrackSlot3 = c352950Dsb.LJI;
                NLETrackSlot nLETrackSlot4 = c352950Dsb2.LJI;
                EnumC355980DxU enumC355980DxULIZIZ2 = C351430Dq9.LIZIZ(nLETrackSlot4);
                if (enumC355980DxULIZIZ2 != null) {
                    int transformZ2 = nLETrackSlot4.getTransformZ();
                    C351420Dq8.LIZJ(nLETrackSlot3, transformZ2, nLEModelLJI, enumC355980DxULIZIZ2);
                    nLETrackSlot3.setTransformZ(transformZ2);
                }
            }
            M5();
            InterfaceC363820EOe interfaceC363820EOeU5 = U5();
            if (interfaceC363820EOeU5 != null) {
                interfaceC363820EOeU5.L51(null);
            }
            C0EJ3 c0ej3N6 = N6();
            if (c0ej3N6 != null) {
                c0ej3N6.Rc();
            }
            C0EHC c0ehcJ6 = J6();
            if (c0ehcJ6 != null) {
                c0ehcJ6.Rc();
            }
            C0E1X c0e1x = new C0E1X(C0E1V.ADJUST_LAYER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null) {
                C350870DpF.LIZJ(c0e48F43, C051R.LIZIZ(c0e1x));
            }
            ArrayList arrayList = new ArrayList(T2().LIZIZ);
            if (i >= 0 && i2 >= 0 && i < arrayList.size() && i2 < arrayList.size() && i != i2) {
                ListProtector.add(arrayList, i2, ListProtector.remove(arrayList, i));
            }
            i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 621));
        }
    }
}
