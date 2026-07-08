package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.120o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196864120o extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1DRG LLJI;
    public final boolean LLJIJIL;
    public final InterfaceC1462140o9U LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664750tQH LLJJ;
    public InterfaceC1461390o8H LLJJI;
    public final C1664750tQH LLJJIII;
    public final C1664750tQH LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664740tQG LLJJJJLIIL;
    public InterfaceC1414530muh LLJJL;
    public C121M LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 666));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 664));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 665));

    public static final float LLLIILIL(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C196864120o.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C196864120o.class, "imageModel", "getImageModel()Lcom/ss/android/ugc/aweme/image/base/ImageEditTempModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C196864120o.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C196864120o.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C196864120o.class, "editInfoStickerApi", "getEditInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C196864120o.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C196864120o.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C196864120o.class, "lyricApi", "getLyricApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditPageApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C196864120o.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C196864120o.class, "textStickerAdapterApi", "getTextStickerAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C196864120o.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C196864120o.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
    }

    public final InterfaceC1461650o8h LLLIL() {
        return (InterfaceC1461650o8h) this.LLJJIJI.getValue(this, LLJLLL[4]);
    }

    public final InterfaceC1455860nzM LLLILZ() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue(this, LLJLLL[3]);
    }

    public final InterfaceC1461350o8D LLLILZLLLI() {
        return (InterfaceC1461350o8D) this.LLJJIJIL.getValue(this, LLJLLL[5]);
    }

    public final InterfaceC391240FVq LLLIZZ() {
        return (InterfaceC391240FVq) this.LLJJJ.getValue(this, LLJLLL[6]);
    }

    public final InterfaceC391240FVq LLLJ() {
        return (InterfaceC391240FVq) this.LLJJJJLIIL.getValue(this, LLJLLL[10]);
    }

    public final C0EZ1 LLLJL() {
        return (C0EZ1) this.LLJJJIL.getValue(this, LLJLLL[7]);
    }

    public final InterfaceC19530111b1 LLLLII() {
        return (InterfaceC19530111b1) this.LLJLILLLLZIIL.getValue(this, LLJLLL[11]);
    }

    public final VideoPublishEditModel LLLLIIIILLL() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJLLL[0]);
    }

    public final C196868120s LLLLIILL() {
        return (C196868120s) this.LLJLLIL.getValue();
    }

    public final InterfaceC1461660o8i LLLLIL() {
        return (InterfaceC1461660o8i) this.LLJJJJJIL.getValue(this, LLJLLL[9]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC1461390o8H interfaceC1461390o8H = this.LLJJI;
        if (interfaceC1461390o8H == null) {
            interfaceC1461390o8H = null;
        }
        interfaceC1461390o8H.LIZ((GestureInteractItem) this.LLJLL.getValue());
        C196868120s c196868120sLLLLIILL = LLLLIILL();
        FrameLayout frameLayout = c196868120sLLLLIILL.LLJLIL;
        if (frameLayout != null) {
            C786410Ut5.C3(frameLayout.getViewTreeObserver(), c196868120sLLLLIILL.LLLFF);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C121O c121o = LLLLIILL().LLJL;
        if (c121o != null) {
            c121o.hide();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final void LLLLILI(InterfaceC1461350o8D interfaceC1461350o8D) {
        interfaceC1461350o8D.i71().LIZ(this, new AObjectS247S0100000_29(this, 77));
        interfaceC1461350o8D.wU1().observe(this, new AObserverS231S0100000_29(this, 106));
        interfaceC1461350o8D.hq0().LIZ(this, new AObjectS247S0100000_29(this, 78));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04d3  */
    /* JADX WARN: Type inference failed for: r0v348, types: [X.120x] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196864120o.onActivityCreated(android.os.Bundle):void");
    }

    public final void LLLIIIIL(Effect effect, Map<String, String> map) {
        String str;
        String str2;
        int iLIZ;
        String panel;
        C196868120s c196868120sLLLLIILL = LLLLIILL();
        C196871120v c196871120v = c196868120sLLLLIILL.LLILLL;
        if (c196871120v != null) {
            if (c196871120v.getStickNumber() >= c196868120sLLLLIILL.LLJJIII) {
                C196871120v c196871120v2 = c196868120sLLLLIILL.LLILLL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131836170);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(c196871120v2, 1035, creativeToastBuilder);
                return;
            }
            C196871120v c196871120v3 = c196868120sLLLLIILL.LLILLL;
            C196870120u c196870120u = c196871120v3.LLIZLLLIL;
            if (c196870120u == null) {
                return;
            }
            C196874120y c196874120y = c196870120u.LIZIZ;
            if (c196874120y != null && c196874120y.LLILZIL) {
                c196874120y.LLILZIL = false;
            }
            String[] strArr = null;
            if (map != null) {
                str = map.get("extra");
                str2 = map.get("sticker_source");
            } else {
                str = null;
                str2 = null;
            }
            String unzipPath = effect.getUnzipPath();
            String effectId = effect.getEffectId();
            int effectType = effect.getEffectType();
            c196870120u.LJFF.getClass();
            C348460DlM c348460DlM = new C348460DlM();
            c348460DlM.LJIIL = unzipPath;
            c348460DlM.LJIILL = effectId;
            if (!TextUtils.isEmpty(str)) {
                strArr = new String[]{str};
            }
            c348460DlM.LJIILJJIL = strArr;
            c348460DlM.LJ = c196870120u.LJ.getDuration();
            Iterator<String> it2 = effect.getIconUrl().getUrlList().iterator();
            if (it2.hasNext()) {
                c348460DlM.LJIILIIL = it2.next();
            }
            String panel2 = "infostickerv2";
            if (effect.getEffectType() != 10) {
                c348460DlM.LJIIZILJ = effect.getResource_id();
                if (effect.getPanel().isEmpty()) {
                    panel = "infostickerv2";
                } else {
                    panel = effect.getPanel();
                }
                c348460DlM.LJIILLIIL = panel;
            }
            if (c196870120u.LJIIJJI) {
                iLIZ = C364360EQg.LIZ();
                c348460DlM.LIZJ = iLIZ;
            } else {
                iLIZ = 0;
            }
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196870120u.LJ);
            if (c348100DkmLIZIZ != null) {
                NLEModel model = c348100DkmLIZIZ.LIZ.getModel();
                if (C351420Dq8.LIZLLL(model)) {
                    c348460DlM.LIZJ = C351420Dq8.LJ(model, EnumC355980DxU.STICKER);
                }
            }
            C01GW c01gw = C311020CHc.LIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c348460DlM.LJIIIIZZ = 0.0f;
            }
            C352130DrH.LIZIZ(c196870120u.LJ).LJIIIZ().LJIIL(c348460DlM);
            c196870120u.LJ.setInfoStickerRestoreMode(1);
            C196874120y c196874120yLIZLLL = c196870120u.LIZLLL(effectId, unzipPath, str, effectType, c348460DlM.LIZIZ, 0.0f, 0.0f, 1.0f, 1.0f, false);
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c348100DkmLIZIZ.LIZ();
                if (!C196870120u.LJIILJJIL(map)) {
                    c196870120u.LIZIZ(c348460DlM.LIZIZ, c196874120yLIZLLL);
                }
                c348460DlM.LJIIIIZZ = 1.0f;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348460DlM);
                c348100DkmLIZIZ.LIZIZ();
            } else if (!C196870120u.LJIILJJIL(map)) {
                c196870120u.LIZIZ(c348460DlM.LIZIZ, c196874120yLIZLLL);
            }
            StickerItemModel stickerItemModel = c196874120yLIZLLL.LLILLL;
            if (stickerItemModel != null) {
                stickerItemModel.challengeIdLoki = C1624570sNT.LIZ(effect);
                c196874120yLIZLLL.LLILLL.updateLayerWeight(iLIZ);
            }
            StickerItemModel stickerItemModel2 = c196874120yLIZLLL.LLILLL;
            if (stickerItemModel2 != null) {
                if (str2 != null) {
                    stickerItemModel2.stickerSource = str2;
                }
                if (effect.getTags() != null && effect.getTags().contains("emoji")) {
                    c196874120yLIZLLL.LLILLL.infoStickerSubtype = 28;
                } else if (!C1462570oAB.LJ(effect) && !C1462570oAB.LJI(effect) && !C1462570oAB.LJFF(effect)) {
                    if (C1462570oAB.LJIIJJI(effect)) {
                        c196874120yLIZLLL.LLILLL.infoStickerSubtype = 32;
                    } else if (C1462570oAB.LJIJI(effect)) {
                        c196874120yLIZLLL.LLILLL.infoStickerSubtype = 30;
                    } else if (effect.getTags() != null && effect.getTags().contains("tenor")) {
                        c196874120yLIZLLL.LLILLL.infoStickerSubtype = 31;
                    } else if (effect.getTags().contains("secretreplies")) {
                        c196874120yLIZLLL.LLILLL.infoStickerSubtype = 35;
                    }
                } else {
                    c196874120yLIZLLL.LLILLL.infoStickerSubtype = 29;
                }
            }
            if (c196874120yLIZLLL.LLILLL != null && effect.getEffectType() != 10) {
                c196874120yLIZLLL.LLILLL.resId = effect.getResource_id();
                if (!effect.getPanel().isEmpty()) {
                    panel2 = effect.getPanel();
                }
                c196874120yLIZLLL.LLILLL.panel = panel2;
            }
            c196871120v3.invalidate();
        }
    }

    public C196864120o(C1DRG c1drg, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        this.LLJI = c1drg;
        this.LLJIJIL = z;
        this.LLJILJIL = interfaceC1462140o9U;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C1451230nrt.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, C1439740nZM.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, InterfaceC1461650o8h.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC391240FVq.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, C0EZ1.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453420nvQ.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1461660o8i.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC391240FVq.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC19530111b1.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d5t, viewGroup, false);
    }

    public final void LLLII(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        C196868120s c196868120sLLLLIILL = LLLLIILL();
        C196871120v c196871120v = c196868120sLLLLIILL.LLILLL;
        if (c196871120v != null) {
            if (c196871120v.getStickNumber() >= c196868120sLLLLIILL.LLJJIII) {
                C196871120v c196871120v2 = c196868120sLLLLIILL.LLILLL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131836170);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(c196871120v2, 1035, creativeToastBuilder);
                return;
            }
            C196871120v c196871120v3 = c196868120sLLLLIILL.LLILLL;
            C196870120u c196870120u = c196871120v3.LLIZLLLIL;
            if (c196870120u == null) {
                return;
            }
            c196870120u.getClass();
            String str3 = map.get("extra");
            String str4 = map.get("extra2");
            String str5 = map.get("sticker_source");
            C0EP3 c0ep3 = AIGCInfo.Companion;
            String str6 = map.get("aigc_info");
            c0ep3.getClass();
            AIGCInfo aIGCInfoLIZ = C0EP3.LIZ(str6);
            String str7 = map.get("info_sticker_subtype");
            float[] fArrLIZ = C0EP0.LIZ(i, i2);
            C1451390ns9 c1451390ns9 = c196870120u.LJFF;
            C196871120v c196871120v4 = c196870120u.LIZJ;
            c1451390ns9.getClass();
            int i3 = c196871120v4.LLILLL;
            int i4 = c196871120v4.LLILZ;
            float f = fArrLIZ[0] / i3;
            float f2 = fArrLIZ[1] / i4;
            c196870120u.LJFF.getClass();
            C348450DlL c348450DlL = new C348450DlL();
            c348450DlL.LJIIL = str2;
            c348450DlL.LJIILIIL = f;
            c348450DlL.LJIILJJIL = f2;
            c348450DlL.LJ = c196870120u.LJ.getDuration();
            if (c196870120u.LJIIJJI) {
                c348450DlL.LIZJ = C364360EQg.LIZ();
            }
            C352130DrH.LIZIZ(c196870120u.LJ).LJIIIZ().LJJJJI(c348450DlL);
            C196874120y c196874120yLIZLLL = c196870120u.LIZLLL(str, str2, str3, 11, c348450DlL.LIZIZ, 0.0f, 0.0f, f, f2, z);
            if (c196874120yLIZLLL != null) {
                c196874120yLIZLLL.LLJILJILJ = true;
                StickerItemModel stickerItemModel = c196874120yLIZLLL.LLILLL;
                stickerItemModel.extra2 = str4;
                stickerItemModel.aigcInfo = aIGCInfoLIZ;
                stickerItemModel.stickerSource = str5;
                if (str7 != null && !TextUtils.isEmpty(str7)) {
                    c196874120yLIZLLL.LLILLL.infoStickerSubtype = CastIntegerProtector.parseInt(str7);
                }
            }
            c196871120v3.invalidate();
        }
    }
}
