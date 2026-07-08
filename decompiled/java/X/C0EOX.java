package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS302S0200000_5;
import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EOX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EOX extends C0ETX<InterfaceC363800EOc, C0EOU, C07WW, C0EOQ> implements InterfaceC363800EOc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final Function0<C07WW> LLLFFI;
    public final Function0<C0EOQ> LLLFZ;

    public InterfaceC363800EOc H5() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EOX.class, "canvasApi", "getCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EOX.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EOX.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EOX.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/opacity/OpacityPanelContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EOX.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EOX.class, "resPreloadApi", "getResPreloadApi()Lcom/ss/android/ugc/gamora/editorpro/components/IEditorProResPreloadApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EOX.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0EOX.class, "keyFrameApi", "getKeyFrameApi()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0EOX.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0EOX.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0EOX.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C0EOX.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C0EOX.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/aweme/tools/sticker/common/text/pro/titlebar/TextTitleBarApi;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13};
        LLLII = 8;
    }

    private final C0E4L J6() {
        return (C0E4L) this.LLJLL.getValue(this, LLLI[5]);
    }

    private final C0EOK K6() {
        return (C0EOK) this.LLJZ.getValue(this, LLLI[8]);
    }

    private final C0EJ3 L6() {
        return (C0EJ3) this.LLJZIJLIL.getValue(this, LLLI[9]);
    }

    private final C0EFH R5() {
        return (C0EFH) this.LLJLILLLLZIIL.getValue(this, LLLI[4]);
    }

    private final InterfaceC363820EOe U5() {
        return (InterfaceC363820EOe) this.LLL.getValue(this, LLLI[10]);
    }

    private final C0ENB d6() {
        return (C0ENB) this.LLJLLL.getValue(this, LLLI[7]);
    }

    private final InterfaceC361710EGb u6() {
        return (InterfaceC361710EGb) this.LLJLLIL.getValue(this, LLLI[6]);
    }

    @Override // ge.i
    public Function0<C0EOU> E3() {
        return new AwS549S0100000_5(this, 732);
    }

    public final InterfaceC362230EIb M5() {
        return (InterfaceC362230EIb) this.LLJJL.getValue(this, LLLI[0]);
    }

    public final InterfaceC360800ECo N5() {
        return (InterfaceC360800ECo) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLI[1]);
    }

    public final C0EOZ N6() {
        return (C0EOZ) this.LLLFF.getValue(this, LLLI[12]);
    }

    public final C0E5S P6() {
        return (C0E5S) this.LLLF.getValue(this, LLLI[11]);
    }

    public final C0EY2 S5() {
        return (C0EY2) this.LLJL.getValue(this, LLLI[2]);
    }

    public final C363780EOa m6() {
        return (C363780EOa) this.LLJLIL.getValue(this, LLLI[3]);
    }

    @Override // X.C0ETX
    public void Xi() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        LiveEvent<Unit> liveEventGs1;
        LiveEvent<Unit> liveEventL72;
        super.Xi();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        MutableLiveData mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot");
        if (mutableLiveDataLIZ != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS170S0200000_5(c0e48F4, this, 9));
        }
        MutableLiveData mutableLiveDataLIZ2 = c0e48F4.S7().LIZ("video_position_event");
        if (mutableLiveDataLIZ2 != null) {
            mutableLiveDataLIZ2.observe(this, new AObserverS209S0100000_5(this, 79));
        }
        c0e48F4.og().LJJLJ().observe(this, new AObserverS209S0100000_5(this, 80));
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventL72 = c0etqP4.L72()) != null) {
            liveEventL72.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 111));
        }
        C0ETQ c0etqP42 = P4();
        if (c0etqP42 != null && (liveEventGs1 = c0etqP42.Gs1()) != null) {
            liveEventGs1.LJII(this, Lifecycle.State.RESUMED, new AObjectS302S0200000_5(c0e48F4, this, 5));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 112));
        }
        N6().Ui0(true);
        if (Intrinsics.LJFF(m6().LLJ, "bottom_item_captions_edit_adjust_opacity")) {
            N6().li();
        } else {
            N6().Rx2();
        }
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07WW> o2() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EOQ> w2() {
        return this.LLLFZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AI(float r60) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EOX.AI(float):void");
    }

    public final void E5(float f) {
        C0E48 c0e48F4;
        if (!Intrinsics.LJFF(T2().LIZ, "bottom_item_edit_adjust_opacity") && (c0e48F4 = F4()) != null) {
            C355080Dw2.LIZ(c0e48F4);
        }
        S6(f);
    }

    public final void S6(float f) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI;
        List<TextStickerModel> listOo1;
        if (Intrinsics.LJFF(T2().LIZ, "bottom_item_captions_edit_adjust_opacity") && N6().e9()) {
            C0EJ3 c0ej3L6 = L6();
            if (c0ej3L6 == null || (listOo1 = c0ej3L6.Oo1()) == null) {
                listOo1 = C13BV.INSTANCE;
            }
            C0EJ3 c0ej3L62 = L6();
            if (c0ej3L62 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listOo1, 10));
                for (TextStickerModel textStickerModel : listOo1) {
                    arrayList.add(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                }
                c0ej3L62.OZ0(arrayList, true);
            }
        }
        C0E1X c0e1x = new C0E1X(C0E1V.ADJUST_OPACITY.getNameId(), null, null, null, null, 30);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null && (nLEEditorLJI = interfaceC351350Dq1LLFII.LJI()) != null) {
            C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        }
        i3(new AwS3S0000001_5(f, 8));
    }

    public C0EOX(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), C363780EOa.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EFH.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), C0E4L.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), C0ENB.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363820EOe.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLLFF = C1664770tQJ.LIZ(getDiContainer(), C0EOZ.class, null);
        this.LLLFFI = new AwS549S0100000_5(this, 730);
        this.LLLFZ = new AwS549S0100000_5(this, 731);
    }
}
