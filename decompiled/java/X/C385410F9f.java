package X;

import Y.AObserverS209S0100000_5;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS41S0500000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS6S0120000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385410F9f extends C0ETZ<InterfaceC384330F5b, C385880FBa, C385430F9h, C385590F9x> implements InterfaceC384330F5b {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public final C1DRG LLJJI;
    public final Function0<C385430F9h> LLJJIII;
    public final Function0<C385590F9x> LLJJIJI;
    public final C385670FAf<TextStickerModel> LLJJIJIIJIL;
    public final C385670FAf<C0FHM> LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public C0FSC LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public HashSet<InterfaceC385510F9p> LLJLL;
    public boolean LLJLLIL;
    public final Function0<Unit> LLJLLL;
    public final C385450F9j LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C385410F9f.class, "textApi", "getTextApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C385410F9f.class, "textFontApi", "getTextFontApi()Lcom/ss/android/ugc/gamora/editor/sticker/text/pro/TextFontCategoryPagerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C385410F9f.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C385410F9f.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C385410F9f.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLL = 8;
    }

    public final void U5() {
        List<C0FFC> listC1;
        this.LLJJJJLIIL = null;
        T6();
        C0EOK c0eokX5 = x5();
        if (c0eokX5 != null && (listC1 = c0eokX5.c1()) != null) {
            Iterator<C0FFC> it2 = listC1.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIJ().LJI.LJI(this);
            }
        }
        TextStickerModel textStickerModelD5 = D5(T2().LIZ);
        C0FSC c0fsc = this.LLJJL;
        if (c0fsc != null) {
            c0fsc.LIZ(TextStickerModel.copy$default(textStickerModelD5, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, "", null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1048577, 65535, null), this.LLJLIL);
        }
        this.LLJLILLLLZIIL = false;
    }

    private final C0EJ3 E5() {
        return (C0EJ3) this.LLJJJ.getValue(this, LLJZIJLIL[0]);
    }

    private final InterfaceC385920FBe H5() {
        return (InterfaceC385920FBe) this.LLJJJIL.getValue(this, LLJZIJLIL[1]);
    }

    private final void N5() {
        int align = T2().LIZ.getAlign();
        int i = 1;
        if (align == 1) {
            i = 3;
        } else if (align != 2) {
            i = 2;
        }
        s7(TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, 0, 0, i, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -129, 65535, null));
        i3(new AwS584S0100000_5(this, 576));
    }

    private final void S5() {
        i3(new AwS584S0100000_5(this, 577));
    }

    private final C0EGY n5() {
        return (C0EGY) this.LLJJJJJIL.getValue(this, LLJZIJLIL[3]);
    }

    public final InterfaceC361710EGb C5() {
        return (InterfaceC361710EGb) this.LLJL.getValue(this, LLJZIJLIL[4]);
    }

    public final void d7() {
        if (((Boolean) C0AZR.LIZ.getValue()).booleanValue()) {
            i3(AFwS234S0000000_5.get$arr$(295));
        } else {
            i3(AFwS234S0000000_5.get$arr$(296));
        }
    }

    @Override // X.InterfaceC384330F5b
    public void u0() {
        C0E55 player;
        if (this.LLJLLIL) {
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LIZ(this.LLJLLL);
        }
        Iterator<InterfaceC385510F9p> it2 = this.LLJLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        i3(AFwS234S0000000_5.get$arr$(291));
        InterfaceC361710EGb interfaceC361710EGbC5 = C5();
        if (interfaceC361710EGbC5 != null) {
            interfaceC361710EGbC5.o10(new C0ELW[]{C0ELW.VIDEO, C0ELW.INFO_STICKER, C0ELW.LYRIC_STICKER}, true);
        }
        InterfaceC361710EGb interfaceC361710EGbC52 = C5();
        if (interfaceC361710EGbC52 != null) {
            interfaceC361710EGbC52.sc0(this.LLJZ);
        }
    }

    public final C0EOK x5() {
        return (C0EOK) this.LLJJJJ.getValue(this, LLJZIJLIL[2]);
    }

    private final void M5() {
        if (ps1()) {
            i3(AFwS234S0000000_5.get$arr$(290));
        }
    }

    private final void T6() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot")) == null) {
            return;
        }
        mutableLiveDataLIZ.removeObservers(this);
    }

    private final TextFontModel v5() {
        String effectId;
        String resource_id;
        String panel;
        TextFontStyleData textFontStyleData = (TextFontStyleData) C13LP.LJJJLZIJ(0, C0FI2.LJIJJ().LJIJ());
        if (textFontStyleData == null) {
            return new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16383, null);
        }
        Effect effect = textFontStyleData.LJ;
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        Effect effect2 = textFontStyleData.LJ;
        if (effect2 == null || (resource_id = effect2.getResource_id()) == null) {
            resource_id = "";
        }
        Effect effect3 = textFontStyleData.LJ;
        if (effect3 == null || (panel = effect3.getPanel()) == null) {
            panel = "";
        }
        String str = textFontStyleData.fontName;
        if (str == null) {
            str = "";
        }
        String str2 = textFontStyleData.title;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = textFontStyleData.fileName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleData.LIZ;
        return new TextFontModel(effectId, resource_id, panel, "trending", str, str2, 28, 0, str3, str4 != null ? str4 : "", textFontStyleData.enableBgColor == 1, textFontStyleData.enableMaskBlurLightColor == 1, false, 0, 12416, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K6() {
        /*
            r15 = this;
            X.0E48 r1 = r15.F4()
            if (r1 != 0) goto L7
            return
        L7:
            X.0E55 r8 = r1.getPlayer()
            r0 = 0
            r8.pause(r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r7 = r1.LLLLLLIL()
            if (r7 == 0) goto L6e
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r7.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentSticker r0 = com.bytedance.ies.nle.editor_jni.NLESegmentSticker.dynamicCast(r0)
            if (r0 == 0) goto La0
            com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim r2 = r0.getAnimation()
        L23:
            java.lang.Object r0 = r15.T2()
            X.0F9h r0 = (X.C385430F9h) r0
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r0.getTextMotionModel()
            boolean r0 = X.C363290EMd.LIZ(r0)
            r4 = 2
            r5 = 0
            if (r0 == 0) goto L6f
            if (r2 == 0) goto Lb4
            int r0 = r2.getInDuration()
        L3e:
            long r2 = (long) r0
        L3f:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            java.lang.Object r0 = r15.T2()
            X.0F9h r0 = (X.C385430F9h) r0
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r0.getTextMotionModel()
            int r0 = r0.motionType
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r4) goto La2
            long r4 = r7.getStartTime()
            long r0 = r7.getEndTime()
            long r0 = r0 - r2
            long r9 = java.lang.Math.max(r4, r0)
            long r0 = (long) r6
            long r9 = r9 + r0
            long r11 = r7.getEndTime()
            long r11 = r11 - r0
            r13 = 0
            r14 = 1
            r8.LJJIIZI(r9, r11, r13, r14)
        L6e:
            return
        L6f:
            if (r2 == 0) goto L82
            boolean r1 = r2.getLoop()
            r0 = 1
            if (r1 != r0) goto L82
            long r2 = r7.getEndTime()
            long r0 = r7.getStartTime()
            long r2 = r2 - r0
            goto L3f
        L82:
            java.lang.Object r0 = r15.T2()
            X.0F9h r0 = (X.C385430F9h) r0
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r0.getTextMotionModel()
            int r0 = r0.motionType
            if (r0 != r4) goto L99
            if (r2 == 0) goto Lb4
            int r0 = r2.getOutDuration()
            goto L3e
        L99:
            if (r2 == 0) goto Lb4
            int r0 = r2.getInDuration()
            goto L3e
        La0:
            r2 = 0
            goto L23
        La2:
            long r9 = r7.getStartTime()
            long r0 = (long) r6
            long r9 = r9 + r0
            long r11 = r7.getStartTime()
            long r11 = r11 + r2
            long r11 = r11 - r0
            r13 = 0
            r14 = 1
            r8.LJJIIZI(r9, r11, r13, r14)
            return
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385410F9f.K6():void");
    }

    public final void Xi() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        T6();
        MutableLiveData mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot");
        if (mutableLiveDataLIZ != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 70));
        }
    }

    @Override // X.InterfaceC384330F5b
    public void hP2() {
        if (ps1()) {
            M5();
        } else if (((Boolean) C0AZQ.LIZ.getValue()).booleanValue()) {
            u0();
        } else {
            i3(AFwS234S0000000_5.get$arr$(292));
        }
    }

    @Override // X.InterfaceC384330F5b, X.C0FEF
    public boolean onBackPressed() {
        M5();
        if (T2().LIZIZ != C0FHM.VISIBLE) {
            return false;
        }
        u0();
        return true;
    }

    @Override // X.InterfaceC384330F5b
    public boolean ps1() {
        return T2().LJII == C0FHM.VISIBLE;
    }

    public final InterfaceC361830EGn t5() {
        return (InterfaceC361830EGn) n5().Rr2().LIZJ(InterfaceC361830EGn.class);
    }

    @Override // X.InterfaceC384330F5b
    public C385670FAf<C0FHM> S1() {
        return this.LLJJIJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC384330F5b
    public C385670FAf<TextStickerModel> j4() {
        return this.LLJJIJIIJIL;
    }

    public final void m6() {
        M5();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C385430F9h> o2() {
        return this.LLJJIII;
    }

    public final void u6() {
        u0();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C385590F9x> w2() {
        return this.LLJJIJI;
    }

    private final TextStickerModel D5(TextStickerModel textStickerModel) {
        List<C0FFC> listC1;
        String str;
        C0FFC next;
        TextStickerModel textStickerModelLJLI;
        C0F7S sourceType;
        float fLLLLLLL;
        TextStyleModel textStyleModelLIZ;
        String str2;
        C0EOK c0eokX5 = x5();
        if (c0eokX5 != null && (listC1 = c0eokX5.c1()) != null) {
            Iterator<C0FFC> it2 = listC1.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C364540EQy.LIZ(next.LJLI()) == textStickerModel.getBaseStickerModel().getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FFC c0ffc = next;
            if (c0ffc != null && (textStickerModelLJLI = c0ffc.LJLI()) != null) {
                if (this.LLJLILLLLZIIL) {
                    sourceType = C0F7S.EDITOR_PRO;
                } else {
                    sourceType = textStickerModelLJLI.getSourceType();
                }
                BaseStickerModel baseStickerModel = textStickerModelLJLI.getBaseStickerModel();
                float alpha = textStickerModel.getBaseStickerModel().getAlpha();
                C0E48 c0e48F4 = F4();
                if (c0e48F4 != null) {
                    fLLLLLLL = C351220Dpo.LLLLLLL(C350870DpF.LJI(c0e48F4).getMaxTargetEnd());
                } else {
                    fLLLLLLL = 0.0f;
                }
                boolean z = false;
                BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Math.min(fLLLLLLL, baseStickerModel.getEndTime()), false, 0.0f, 0.0f, false, alpha, null, null, null, false, 2080374783, 15, null);
                String textStr = textStickerModel.getTextStr();
                String textStrWithLineBreak = textStickerModel.getTextStrWithLineBreak();
                TextFontModel textFontModelLIZ = TextFontModel.LIZ(textStickerModel.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
                TextMotionModel textMotionModelLIZ = TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023);
                int mode = textStickerModel.getMode();
                int color = textStickerModel.getColor();
                int align = textStickerModel.getAlign();
                TextStyleModel textStyle = textStickerModel.getTextStyle();
                if (textStyle != null) {
                    textStyleModelLIZ = TextStyleModel.LIZ(textStyle, null, null, null, null, false, null, 2047);
                } else {
                    textStyleModelLIZ = null;
                }
                if (textStickerModelLJLI.getForceEffectRender() || textStickerModelLJLI.getAutoAdaptCanvas()) {
                    z = true;
                }
                String string = C1664590tQ1.LJIIIZ(this).getString(2131821598);
                CaptionTemplateModel captionTemplateModelLIZ = CaptionTemplateModel.LIZ(textStickerModel.getCaptionTemplateModel(), false, null, null, false, false, false, 63);
                Integer numValueOf = Integer.valueOf(textStickerModel.getColor());
                String str3 = textStickerModel.getFontModel().fontName;
                String str4 = textStickerModel.getFontModel().fontCategoryId;
                TextStyleModel textStyle2 = textStickerModel.getTextStyle();
                if (textStyle2 != null) {
                    str2 = textStyle2.styleResId;
                } else {
                    str2 = null;
                }
                TextStyleModel textStyle3 = textStickerModel.getTextStyle();
                if (textStyle3 != null) {
                    str = textStyle3.styleCategoryId;
                }
                return TextStickerModel.copy$default(textStickerModelLJLI, baseStickerModelCopy$default, null, null, textStr, textStrWithLineBreak, mode, color, align, 0.0f, textFontModelLIZ, false, false, false, true, false, null, null, null, null, null, string, null, null, false, null, 0L, 0L, sourceType, textMotionModelLIZ, null, true, null, null, false, false, captionTemplateModelLIZ, textStyleModelLIZ, new TextEventTrackingModel(numValueOf, str3, str4, str2, str, textStickerModel.getTextMotionModel().motionResId, textStickerModel.getTextMotionModel().motionCategoryId, Integer.valueOf(textStickerModel.getAlign()), C385050F7v.LIZLLL(textStickerModel)), null, null, null, false, z, null, false, false, false, null, 670028038, 64455, null);
            }
        }
        return textStickerModel;
    }

    private final void J6(EnumC371580EhY enumC371580EhY) {
        boolean z;
        boolean z2 = false;
        if (enumC371580EhY == EnumC371580EhY.SHOW) {
            z = true;
        } else {
            z = false;
        }
        List<C385490F9n> list = T2().LIZJ;
        ArrayList arrayList = new ArrayList();
        for (C385490F9n c385490F9n : list) {
            if (C1697810uHb.LJIIJJI("text_font", "text_style", "text_motion").contains(c385490F9n.LIZ)) {
                arrayList.add(c385490F9n);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((C385490F9n) it2.next()).LJ) {
                z2 = true;
            }
        }
        if (z) {
            if (z2) {
                i3(AFwS234S0000000_5.get$arr$(293));
            }
        } else if (!z2) {
            i3(AFwS234S0000000_5.get$arr$(294));
        }
    }

    private final TextStickerModel L6(TextStickerModel textStickerModel) {
        boolean z;
        TextStickerModel textStickerModelCopy$default = textStickerModel;
        if (textStickerModelCopy$default.getCaptionModel() == null) {
            textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModelCopy$default, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65023, null);
        }
        if (!textStickerModelCopy$default.getAutoLineBreak()) {
            String textStrWithLineBreak = textStickerModelCopy$default.getTextStrWithLineBreak();
            if (textStrWithLineBreak.length() == 0) {
                textStrWithLineBreak = textStickerModelCopy$default.getTextStr();
            }
            textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModelCopy$default, null, null, null, textStrWithLineBreak, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -9, 65535, null);
        }
        if (!textStickerModelCopy$default.getForceEffectRender() && !textStickerModelCopy$default.getAutoAdaptCanvas()) {
            z = false;
        } else {
            z = true;
        }
        return TextStickerModel.copy$default(textStickerModelCopy$default, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, C1664590tQ1.LJIIIZ(this).getString(2131821598), null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, z, null, false, false, false, null, -1048577, 64511, null);
    }

    private final int k5(TextStickerModel textStickerModel) {
        int align = textStickerModel.getAlign();
        if (align != 1) {
            if (align != 2) {
                if (align != 3) {
                    return R.raw.icon_lines_center_aligned_fill;
                }
                return R.raw.icon_lines_right_aligned;
            }
            return R.raw.icon_lines_center_aligned;
        }
        return R.raw.icon_lines_left_aligned;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel] */
    private final void k7(TextStickerModel textStickerModel) {
        C0E48 c0e48F4;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt initSize;
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ;
        LiveState<BaseStickerModel> liveState;
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ2;
        LiveState<BaseStickerModel> liveState2;
        List<C0FFC> listC1;
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            C391040FUw.LIZ.getClass();
            this.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(C391040FUw.LIZIZ.getBoolean("text_gesture_guide_show", false));
        }
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, Boolean.TRUE) && (c0e48F4 = F4()) != null && (iNLEMediaSessionF1 = c0e48F4.f1()) != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null && (initSize = mediaRuntimeApi.getInitSize()) != null) {
            C0EOK c0eokX5 = x5();
            C0FFC c0ffc = null;
            if (c0eokX5 != null && (listC1 = c0eokX5.c1()) != null) {
                Iterator<C0FFC> it2 = listC1.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0FFC next = it2.next();
                    if (C364540EQy.LIZ(next.LJLI()) == C364540EQy.LIZ(T2().LIZ)) {
                        c0ffc = next;
                        break;
                    }
                }
                c0ffc = c0ffc;
            }
            if (!Intrinsics.LJFF(T2().LIZ.getTextStr(), textStickerModel.getTextStr()) && textStickerModel.getBaseStickerModel().getId() == C364540EQy.LIZ(T2().LIZ)) {
                if (c0ffc != null && (c1664680tQALJJIJ2 = c0ffc.LJJIJ()) != null && (liveState2 = c1664680tQALJJIJ2.LJI) != null) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = BaseStickerModel.copy$default(liveState2.LIZJ(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
                    liveState2.LJI(this);
                    liveState2.LJIIIZ(this, Lifecycle.State.STARTED, new AwS41S0500000_5(c259800zU, (C259800zU<BaseStickerModel>) liveState2, (LiveState<BaseStickerModel>) this, (C385410F9f) c0ffc, (C0FFC) initSize, (PairIntInt) 2));
                    return;
                }
                return;
            }
            if (c0ffc != null && (c1664680tQALJJIJ = c0ffc.LJJIJ()) != null && (liveState = c1664680tQALJJIJ.LJI) != null) {
                liveState.LJI(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel] */
    private final void n7(TextStickerModel textStickerModel) {
        int i;
        StickerModel stickerModelF3;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        this.LLJLLIL = true;
        i3(AFwS234S0000000_5.get$arr$(298));
        c0e48F4.getPlayer().LJJIIJZLJL(this.LLJLLL);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = L6(textStickerModel);
        int iIntValue = 0;
        if (textStickerModel.isNotEmptyModel()) {
            this.LLJLILLLLZIIL = false;
            C0EOK c0eokX5 = x5();
            if (c0eokX5 != null) {
                c0eokX5.k3((StickerModel) c259800zU.element, EnumC356070Dxd.COMMIT);
            }
            o7((TextStickerModel) c259800zU.element);
            W6((TextStickerModel) c259800zU.element);
            Xi();
            return;
        }
        this.LLJLILLLLZIIL = true;
        BaseStickerModel baseStickerModel = ((TextStickerModel) c259800zU.element).getBaseStickerModel();
        C385630FAb.LIZLLL(baseStickerModel, c0e48F4.getPlayer().Jh(), c0e48F4.getPlayer().qq());
        List<NLETrack> listLJ = C349560Dn8.LJ(C350870DpF.LJI(c0e48F4));
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        long startTime = (long) baseStickerModel.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        nLETrackSlot.setStartTime(startTime * j);
        nLETrackSlot.setEndTime(((long) baseStickerModel.getEndTime()) * j);
        Integer numLJI = C357540E0a.LJI(nLETrackSlot, listLJ, false);
        if (numLJI != null) {
            iIntValue = numLJI.intValue();
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
            Iterator it2 = ((ArrayList) listLJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer()));
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                Integer numValueOf = Integer.valueOf(((Number) it3.next()).intValue());
                while (it3.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((Number) it3.next()).intValue());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue() + 1;
                }
            }
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel, 0, iIntValue + 1 + 2000, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -3, 15, null);
        TextFontModel textFontModelV5 = v5();
        TextStickerModel textStickerModel2 = (TextStickerModel) c259800zU.element;
        TextFontModel textFontModelV52 = v5();
        if (textFontModelV5.enableMaskBlurLightColor) {
            i = 5;
        } else {
            i = 1;
        }
        c259800zU.element = TextStickerModel.copy$default(textStickerModel2, baseStickerModelCopy$default, null, null, null, null, i, 0, 0, 0.0f, textFontModelV52, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -546, 65535, null);
        if (C351420Dq8.LIZLLL(C350870DpF.LJI(c0e48F4))) {
            ((TextStickerModel) c259800zU.element).getBaseStickerModel().setZIndex(C351420Dq8.LJ(C350870DpF.LJI(c0e48F4), EnumC355980DxU.TEXT));
            ((TextStickerModel) c259800zU.element).setForceEffectRender(true);
        }
        C0EOK c0eokX52 = x5();
        if (c0eokX52 != null) {
            c0eokX52.LJJZZI(new C0FTB() { // from class: X.0F9g
                @Override // X.C0FTB
                public final void LIZ(StickerModel stickerModel, boolean z) {
                }

                @Override // X.C0FTB
                public final void LIZIZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LIZJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LIZLLL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJFF(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJI(StickerModel stickerModel, boolean z) {
                }

                @Override // X.C0FTB
                public final void LJII() {
                }

                @Override // X.C0FTB
                public final void LJIIIIZZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIIZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIJ(StickerModel stickerModel, String str) {
                }

                @Override // X.C0FTB
                public final void LJIIJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIL(StickerModel stickerModel, int i2) {
                }

                @Override // X.C0FTB
                public final void LJIILIIL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILJJIL(int i2) {
                }

                @Override // X.C0FTB
                public final void LJIILL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILLIIL(int i2) {
                }

                @Override // X.C0FTB
                public final void LJIIZILJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJ(int i2) {
                }

                @Override // X.C0FTB
                public final void LJIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJJLI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIL() {
                }

                @Override // X.C0FTB
                public final void LJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIFFI(int i2) {
                }

                @Override // X.C0FTB
                public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
                }

                @Override // X.C0FTB
                public final void LJJIII(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
                }

                @Override // X.C0FTB
                public final void LJJIIZ() {
                }

                @Override // X.C0FTB
                public final void LJJIIZI(int i2) {
                }

                @Override // X.C0FTB
                public final void LJJIJ() {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJIL(int i2) {
                }

                @Override // X.C0FTB
                public final EnumC1466150oFx[] LJJIJIL() {
                    return new EnumC1466150oFx[]{EnumC1466150oFx.TEXT};
                }

                @Override // X.C0FTB
                public final void f4(StickerModel stickerModel) {
                    int id = stickerModel.getId();
                    Integer num = this.LL.LLJJJJLIIL;
                    if (num != null && id == num.intValue()) {
                        C0EOK c0eokX53 = this.LL.x5();
                        if (c0eokX53 != null) {
                            c0eokX53.LJLLLL(this);
                        }
                        this.LL.i3(new AwS584S0100000_5(stickerModel, 579));
                        this.LL.W6(c259800zU.element);
                        this.LL.Xi();
                    }
                }
            });
        }
        C0EOK c0eokX53 = x5();
        if (c0eokX53 != null && (stickerModelF3 = c0eokX53.f3((StickerModel) c259800zU.element, EnumC356070Dxd.COMMIT)) != null) {
            this.LLJJJJLIIL = Integer.valueOf(stickerModelF3.getId());
            o7(new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null));
        }
    }

    private final void o7(TextStickerModel textStickerModel) {
        Iterator<InterfaceC385510F9p> it2 = this.LLJLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
        C0FSC c0fsc = this.LLJJL;
        if (c0fsc != null) {
            c0fsc.LIZIZ(textStickerModel);
        }
        i3(new AwS371S0200000_5(this, textStickerModel, 122));
        InterfaceC361710EGb interfaceC361710EGbC5 = C5();
        if (interfaceC361710EGbC5 != null) {
            interfaceC361710EGbC5.o10(new C0ELW[]{C0ELW.VIDEO, C0ELW.INFO_STICKER, C0ELW.LYRIC_STICKER}, false);
        }
        InterfaceC361710EGb interfaceC361710EGbC52 = C5();
        if (interfaceC361710EGbC52 != null) {
            interfaceC361710EGbC52.V52(this.LLJZ);
        }
        show();
    }

    private final void s7(TextStickerModel textStickerModel) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EJ3 c0ej3E5;
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
        k7(textStickerModel);
        TextStickerModel textStickerModelD5 = D5(textStickerModel);
        C0EOK c0eokX5 = x5();
        if (c0eokX5 != null) {
            c0eokX5.k3(textStickerModelD5, EnumC356070Dxd.COMMIT);
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (nLETrackSlotLLLLLLIL = c0e48F42.LLLLLLIL()) != null && (c0ej3E5 = E5()) != null) {
            c0ej3E5.BO0(nLETrackSlotLLLLLLIL, true);
        }
        i3(new AwS584S0100000_5(textStickerModelD5, 580));
    }

    @Override // X.InterfaceC384330F5b
    public boolean EA(TextStickerModel textStickerModel) {
        int id = textStickerModel.getBaseStickerModel().getId();
        Integer num = this.LLJJJJLIIL;
        if (num != null && id == num.intValue()) {
            return true;
        }
        return false;
    }

    public final void K4(int i) {
        if (i == T2().LIZ.getColor()) {
            return;
        }
        s7(TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, 0, i, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -65, 65535, null));
    }

    public final List<C385490F9n> N6(TextStickerModel textStickerModel) {
        int i;
        VideoPublishEditModel videoPublishEditModel;
        C385490F9n[] c385490F9nArr = new C385490F9n[4];
        if (((Boolean) C0AZT.LIZ.getValue()).booleanValue()) {
            i = R.raw.icon_fonts;
        } else {
            i = R.raw.icon_color_text_circle;
        }
        c385490F9nArr[0] = new C385490F9n("text_font", i, false, null, 124);
        c385490F9nArr[1] = new C385490F9n("text_color", R.drawable.c5j, false, null, 120);
        c385490F9nArr[2] = new C385490F9n("text_style", R.raw.icon_text_stroke, false, null, 124);
        c385490F9nArr[3] = new C385490F9n("text_alignment", k5(textStickerModel), false, null, 124);
        ArrayList arrayList = new ArrayList(C1697810uHb.LJIIJJI(c385490F9nArr));
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ == null || (videoPublishEditModel = editModelProviderLIZIZ.getEditModel()) == null) {
            videoPublishEditModel = new VideoPublishEditModel();
        }
        if (C1416310mxZ.LJIJJ(videoPublishEditModel)) {
            C391040FUw.LIZ.getClass();
            arrayList.add(new C385490F9n("text_motion", R.raw.icon_color_text_animate_background, !C391040FUw.LIZIZ.getBoolean("text_motion_guide_show", false), "creation_motion_text_stickers_Icon_tux_lottie.json", 28));
        }
        return arrayList;
    }

    public final void P6(EnumC371580EhY enumC371580EhY) {
        boolean z;
        boolean z2;
        List<C385490F9n> listU7;
        if (enumC371580EhY == EnumC371580EhY.SHOW) {
            i3(new AwS584S0100000_5(this, 578));
            return;
        }
        M5();
        C0FHM c0fhm = T2().LIZLLL;
        C0FHM c0fhm2 = C0FHM.VISIBLE;
        boolean z3 = true;
        if (c0fhm == c0fhm2) {
            z = true;
        } else {
            z = false;
        }
        if (T2().LJFF == c0fhm2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (T2().LJI != c0fhm2) {
            z3 = false;
        }
        if (z) {
            listU7 = u7("text_font", false);
        } else if (!z2 && z3) {
            listU7 = u7("text_motion", false);
        } else {
            listU7 = u7("text_style", false);
        }
        i3(new AwS6S0120000_5((List) listU7, (List<C385490F9n>) z, z3, true));
    }

    public final void R5(String str) {
        i3(new AwS119S1100000_5(this, str, 8));
    }

    public final List<C385490F9n> S6(TextStickerModel textStickerModel) {
        List<C385490F9n> list = T2().LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C385490F9n c385490F9nLIZ : list) {
            if (Intrinsics.LJFF(c385490F9nLIZ.LIZ, "text_alignment")) {
                c385490F9nLIZ = C385490F9n.LIZ(c385490F9nLIZ, k5(textStickerModel), false, 125);
            }
            arrayList.add(c385490F9nLIZ);
        }
        return arrayList;
    }

    public final void W6(TextStickerModel textStickerModel) {
        NLETrackSlot nLETrackSlotLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48F4), textStickerModel.getUuid())) != null) {
            c0e48F4.S7().LIZIZ(new C358740E4q(nLETrackSlotLIZ, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    public final void d5(TextStickerModel textStickerModel) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        if (C364540EQy.LIZ(T2().LIZ) != textStickerModel.getBaseStickerModel().getId()) {
            TextStickerModel textStickerModelD5 = D5(T2().LIZ);
            C0FSC c0fsc = this.LLJJL;
            if (c0fsc != null) {
                c0fsc.LIZ(TextStickerModel.copy$default(textStickerModelD5, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, "", null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1048577, 65535, null), this.LLJLIL);
            }
            boolean z2 = false;
            this.LLJLILLLLZIIL = false;
            EditModelProvider.Companion.getClass();
            EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
            if (editModelProviderLIZIZ == null || (videoPublishEditModel = editModelProviderLIZIZ.getEditModel()) == null) {
                videoPublishEditModel = new VideoPublishEditModel();
            }
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (textStickerModel.getCaptionModel() != null) {
                z2 = true;
            }
            u4.LJJLIIIIJ(videoPublishEditModel, "click_text", 1, null, boolValueOf, null, null, null, Boolean.valueOf(z2), Boolean.valueOf(textStickerModel.isVERenderSticker()), 224);
            C0FSC c0fsc2 = this.LLJJL;
            if (c0fsc2 != null) {
                c0fsc2.LIZIZ(textStickerModel);
            }
            s7(L6(textStickerModel));
        }
    }

    @Override // X.InterfaceC384330F5b
    public void hQ0(InterfaceC385510F9p interfaceC385510F9p) {
        this.LLJLL.remove(interfaceC385510F9p);
    }

    @Override // X.InterfaceC384330F5b
    public void mp1(InterfaceC385510F9p interfaceC385510F9p) {
        this.LLJLL.add(interfaceC385510F9p);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0F9j] */
    public C385410F9f(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = AFwS191S0000000_5.get$arr$(183);
        this.LLJJIJI = new AwS549S0100000_5(this, 666);
        this.LLJJIJIIJIL = Z1(new C2217381BqS() { // from class: X.0F9m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385430F9h) obj).LIZ;
            }
        });
        this.LLJJIJIL = Z1(new C2217381BqS() { // from class: X.0F9l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385430F9h) obj).LIZIZ;
            }
        });
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC385920FBe.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJLL = new HashSet<>();
        this.LLJLLL = AFwS191S0000000_5.get$arr$(184);
        this.LLJZ = new AbstractC385780FAq() { // from class: X.0F9j
            public final int LL = Integer.MIN_VALUE;

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return this.LL;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                if (this.LLILLJJLI.T2().LIZIZ == C0FHM.VISIBLE) {
                    this.LLILLJJLI.u0();
                    return true;
                }
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (this.LLILLJJLI.T2().LIZIZ == C0FHM.VISIBLE) {
                    this.LLILLJJLI.u0();
                    return true;
                }
                return false;
            }
        };
    }

    public final void H4(String str, String str2) {
        s7(TextStickerModel.copy$default(T2().LIZ, null, null, null, str, str2, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -25, 65535, null));
    }

    public final void P4(TextMotionModel textMotionModel, CaptionTemplateModel captionTemplateModel) {
        if (Intrinsics.LJFF(textMotionModel, T2().LIZ.getTextMotionModel())) {
            return;
        }
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModel, null, false, null, null, false, false, captionTemplateModel, null, null, null, null, null, false, false, null, false, false, false, null, -268435457, 65527, null);
        if (textMotionModel.motionEnabled == 1) {
            C384180F4m c384180F4m = C384180F4m.LIZIZ;
            String str = textMotionModel.motionResId;
            boolean zLIZ = C363290EMd.LIZ(textMotionModel);
            c384180F4m.getClass();
            ArrayList<C443120HZe<Long, String, Boolean>> arrayList = C384180F4m.LJIIJJI;
            synchronized (arrayList) {
                try {
                    arrayList.add(new C443120HZe<>(Long.valueOf(System.currentTimeMillis()), str, Boolean.valueOf(zLIZ)));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        s7(textStickerModelCopy$default);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6(java.lang.String r2, X.EnumC371580EhY r3) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -2115337775: goto L36;
                case -2100400097: goto L29;
                case -1783100079: goto L1d;
                case -1037978591: goto L14;
                case -864437496: goto Lb;
                default: goto L7;
            }
        L7:
            r1.J6(r3)
            return
        Lb:
            java.lang.String r0 = "text_motion"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto L7
        L14:
            java.lang.String r0 = "text_font"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto L7
        L1d:
            java.lang.String r0 = "text_alignment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r1.N5()
            goto L7
        L29:
            java.lang.String r0 = "text_style"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto L7
        L32:
            r1.R5(r2)
            goto L7
        L36:
            java.lang.String r0 = "text_color"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r1.S5()
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385410F9f.d6(java.lang.String, X.0EhY):void");
    }

    public final List<C385490F9n> u7(String str, boolean z) {
        C385490F9n c385490F9nLIZ;
        boolean z2;
        List<C385490F9n> list = T2().LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C385490F9n c385490F9n : list) {
            if (Intrinsics.LJFF(c385490F9n.LIZ, str)) {
                if (z && c385490F9n.LJ) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c385490F9nLIZ = C385490F9n.LIZ(c385490F9n, 0, z2, 111);
            } else {
                c385490F9nLIZ = C385490F9n.LIZ(c385490F9n, 0, false, 111);
            }
            arrayList.add(c385490F9nLIZ);
        }
        return arrayList;
    }

    @Override // X.InterfaceC384330F5b, X.C0FF7
    public void LLZLI(TextStickerModel textStickerModel, C388340FKm c388340FKm, C390420FSm c390420FSm, C0FSC c0fsc) {
        C0FHM c0fhm = T2().LIZIZ;
        C0FHM c0fhm2 = C0FHM.VISIBLE;
        if (c0fhm == c0fhm2 && C364540EQy.LIZ(T2().LIZ) == textStickerModel.getBaseStickerModel().getId()) {
            i3(AFwS234S0000000_5.get$arr$(297));
        } else if (T2().LIZIZ == c0fhm2 && C364540EQy.LIZ(T2().LIZ) != textStickerModel.getBaseStickerModel().getId()) {
            d5(textStickerModel);
        } else {
            this.LLJJL = c0fsc;
            n7(textStickerModel);
        }
    }

    public final void O4(TextFontModel textFontModel, int i, String str, CaptionTemplateModel captionTemplateModel) {
        if (Intrinsics.LJFF(textFontModel, T2().LIZ.getFontModel())) {
            return;
        }
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(T2().LIZ, null, null, null, null, str, i, 0, 0, 0.0f, textFontModel, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, captionTemplateModel, null, null, null, null, null, false, false, null, false, false, false, null, -561, 65527, null);
        if (textStickerModelCopy$default.isVERenderSticker()) {
            C384180F4m c384180F4m = C384180F4m.LIZIZ;
            String str2 = textFontModel.fontResId;
            c384180F4m.getClass();
            ArrayList<Pair<Long, String>> arrayList = C384180F4m.LJIIIZ;
            synchronized (arrayList) {
                try {
                    arrayList.add(new Pair<>(Long.valueOf(System.currentTimeMillis()), str2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        s7(textStickerModelCopy$default);
    }

    public final void T4(TextStyleModel textStyleModel, int i, int i2, Effect effect, boolean z, InterfaceC385920FBe interfaceC385920FBe) {
        TextFontModel textFontModelLIZIZ;
        TextStickerModel textStickerModelCopy$default;
        int i3 = i2;
        if (Intrinsics.LJFF(textStyleModel, T2().LIZ.getTextStyle()) && T2().LIZ.getColor() == i && T2().LIZ.getMode() == i3) {
            return;
        }
        if (effect != null) {
            textFontModelLIZIZ = C363470EMv.LIZIZ(22, effect);
        } else {
            textFontModelLIZIZ = null;
        }
        if (z) {
            TextFontModel textFontModelLIZ = TextFontModel.LIZ(T2().LIZ.getFontModel(), "", null, null, null, null, null, 0, 0, null, null, false, false, 0, 16382);
            if (interfaceC385920FBe != null) {
                interfaceC385920FBe.GE(TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, 0, 0, 0, 0.0f, textFontModelLIZ, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -513, 65535, null));
            }
            if (T2().LIZ.getMode() == 5) {
                i3 = 5;
            }
        }
        if (textFontModelLIZIZ != null) {
            textStickerModelCopy$default = TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, i3, i, 0, 0.0f, textFontModelLIZIZ, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, textStyleModel, null, null, null, null, false, false, null, false, false, false, null, -609, 65519, null);
        } else {
            textStickerModelCopy$default = TextStickerModel.copy$default(T2().LIZ, null, null, null, null, null, i3, i, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, textStyleModel, null, null, null, null, false, false, null, false, false, false, null, -97, 65519, null);
        }
        if (textStyleModel != null && textStickerModelCopy$default.isVERenderSticker()) {
            C384180F4m c384180F4m = C384180F4m.LIZIZ;
            String str = textStyleModel.styleResId;
            boolean z2 = textStyleModel.isEffectStyle;
            c384180F4m.getClass();
            if (str != null) {
                ArrayList<C443120HZe<Long, String, Boolean>> arrayList = C384180F4m.LJIIJ;
                synchronized (arrayList) {
                    try {
                        arrayList.add(new C443120HZe<>(Long.valueOf(System.currentTimeMillis()), str, Boolean.valueOf(z2)));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        s7(textStickerModelCopy$default);
    }
}
