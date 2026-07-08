package X;

import android.graphics.Rect;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.114z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194431114z extends i<C0FVP, C114F, C194410114e, C114H> implements C0FVP, InterfaceC379610EuV, InterfaceC1166920gTK {
    public static final AnonymousClass1151 LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public EnumC388580FLk LLJJ;
    public AnonymousClass1150 LLJJI;
    public final Function0<C194410114e> LLJJIII;
    public final Function0<C114H> LLJJIJI;
    public InterfaceC1635410sex LLJJIJIIJIL;
    public C09AE LLJJIJIL;
    public List<C09AE> LLJJJ;
    public final C0FMR LLJJJIL;
    public final C0FMR LLJJJJ;
    public C0FMR LLJJJJJIL;
    public ArrayList<AnonymousClass1149> LLJJJJLIIL;
    public final ArrayList<AnonymousClass1149> LLJJL;
    public ArrayList<AnonymousClass1149> LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public C1450610nqt LLJLLL;
    public boolean LLJZ;
    public Pair<Integer, String> LLJZIJLIL;
    public Pair<Integer, Integer> LLL;
    public Pair<Integer, Integer> LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public C389000FNa LLLFZ;
    public final MutableLiveData<Boolean> LLLI;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1151] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C194431114z.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C194431114z.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C194431114z.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0), new C2217381BqS(C194431114z.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0), new C2217381BqS(C194431114z.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0)};
        LLLII = new Object() { // from class: X.1151
        };
        LLLIIIIL = 8;
    }

    private final boolean U5() {
        return false;
    }

    public final void J6(int i) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.C0FVP
    public void xv() {
    }

    private final InterfaceC1450920nrO C5() {
        return (InterfaceC1450920nrO) this.LLJLLIL.getValue(this, LLLIIII[4]);
    }

    private final void T6() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        EnumC388580FLk enumC388580FLk = this.LLJJ;
        if (enumC388580FLk == EnumC388580FLk.CLOSE || enumC388580FLk == EnumC388580FLk.ONLY_EDITOR || enumC388580FLk == EnumC388580FLk.PANEL_EDITOR) {
            i3(AFwS234S0000000_5.get$arr$(72));
            return;
        }
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 == null || (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) == null || (textStickerModel = c1664680tQALLZLLIL.LIZ) == null || (textTemplateModel = textStickerModel.getTextTemplateModel()) == null || !textTemplateModel.enableTextTemplate) {
            return;
        }
        i3(new AwS584S0100000_5(textTemplateModel, 127));
    }

    private final void n7() {
        EnumC388580FLk enumC388580FLk = this.LLJJ;
        if (enumC388580FLk == EnumC388580FLk.ONLY_EDITOR) {
            i3(AFwS273S0000000_29.get$arr$(177));
        } else if (enumC388580FLk == EnumC388580FLk.PANEL_EDITOR || enumC388580FLk == EnumC388580FLk.ONLY_PANEL) {
            i3(AFwS273S0000000_29.get$arr$(179));
        }
    }

    private final C0FVY v5() {
        return (C0FVY) this.LLJLILLLLZIIL.getValue(this, LLLIIII[2]);
    }

    private final InterfaceC1453410nvP x5() {
        return (InterfaceC1453410nvP) this.LLJLL.getValue(this, LLLIIII[3]);
    }

    public final VideoPublishEditModel D5() {
        return (VideoPublishEditModel) this.LLJL.getValue(this, LLLIIII[0]);
    }

    public final void I7() {
        i3(AFwS273S0000000_29.get$arr$(185));
    }

    public final void K4() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        if (this.LLLF != null) {
            u7(null, null);
            i3(AFwS273S0000000_29.get$arr$(172));
        }
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        boolean zU5 = U5();
        TextStickerModel textStickerModelT4 = T4();
        boolean z = false;
        boolean z2 = textStickerModelT4 != null && C0F8Y.LJIIL(textStickerModelT4);
        c1402910mbx.getClass();
        C1402910mbx.LJFF(videoPublishEditModelD5, "None", "None", zU5, false, false, z2);
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 != null && (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) != null && (textStickerModel = c1664680tQALLZLLIL.LIZ) != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null && textTemplateModel.useDefaultText) {
            z = true;
        }
        InterfaceC388390FKr interfaceC388390FKrM52 = M5();
        if (interfaceC388390FKrM52 != null) {
            interfaceC388390FKrM52.LLZZJLIL();
        }
        InterfaceC1450920nrO interfaceC1450920nrOC5 = C5();
        C1450610nqt c1450610nqt = interfaceC1450920nrOC5 != null ? (C1450610nqt) interfaceC1450920nrOC5.V51(C1450610nqt.class) : null;
        this.LLJLLL = c1450610nqt;
        if (c1450610nqt != null) {
            c1450610nqt.LJ = true;
        }
        if (z) {
            i3(AFwS273S0000000_29.get$arr$(174));
        }
        i3(AFwS273S0000000_29.get$arr$(176));
    }

    @Override // X.C0FVP
    public void LJJIL() {
        i3(AFwS273S0000000_29.get$arr$(178));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            r7 = this;
            X.19A3 r0 = r7.LLJILJILJ
            android.content.Context r2 = X.C545820Lau.LIZIZ(r0)
            if (r2 == 0) goto La3
            X.0FKr r0 = r7.M5()
            java.lang.String r5 = ""
            if (r0 == 0) goto L26
            X.0tQA r0 = r0.LLZLLIL()
            if (r0 == 0) goto L26
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel r0 = r0.getTextTemplateModel()
            if (r0 == 0) goto L26
            java.lang.String r6 = r0.templateName
            if (r6 != 0) goto L27
        L26:
            r6 = r5
        L27:
            X.0FKr r0 = r7.M5()
            if (r0 == 0) goto L44
            X.0tQA r0 = r0.LLZLLIL()
            if (r0 == 0) goto L44
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel r0 = r0.getTextTemplateModel()
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.templateEffectId
            if (r0 == 0) goto L44
            r5 = r0
        L44:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C1205504nd.LIZ()
            r1.append(r0)
            java.lang.String r0 = "&status_font_mode=light&loading_bg_color=1e1e1e&enable_prefetch=1"
            r1.append(r0)
            java.lang.String r0 = "&template_name="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "&template_id="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r2, r0)
            r0.open()
            X.0mbx r4 = X.C1402910mbx.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r7.D5()
            boolean r1 = r7.U5()
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = r7.T4()
            if (r0 == 0) goto La4
            boolean r0 = X.C0F8Y.LJIIL(r0)
            r2 = 1
            if (r0 != r2) goto La4
        L86:
            r4.getClass()
            X.0LAB r1 = X.C1402910mbx.LIZJ(r3, r1)
            java.lang.String r0 = "template"
            r1.LJ(r0, r6)
            java.lang.String r0 = "template_id"
            r1.LJ(r0, r5)
            java.lang.String r0 = "is_new_text_template"
            r1.LIZ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "click_photo_text_template_l8_popup"
            X.C20684815ws.LJIILLIIL(r0, r1)
        La3:
            return
        La4:
            r2 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194431114z.N5():void");
    }

    @Override // X.C0FVP
    public void Xu() {
        W6(this.LLJJ);
    }

    public final boolean d6() {
        EnumC388580FLk enumC388580FLk;
        if (this.LLJZ) {
            return true;
        }
        C19A3 c19a3 = this.LLJILJILJ;
        return c19a3.mActivity == null || C545820Lau.LJ(c19a3) || (enumC388580FLk = this.LLJJ) == EnumC388580FLk.NONE || enumC388580FLk == EnumC388580FLk.CLOSE;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        pN2().setValue(Boolean.TRUE);
        y7(EnumC388580FLk.CLOSE);
        i3(AFwS273S0000000_29.get$arr$(183));
        TextStickerModel textStickerModelT4 = T4();
        if (textStickerModelT4 != null && textStickerModelT4.getTextTemplateModel().enableTextTemplate) {
            C0FI2 c0fi2LJIJJ = C0FI2.LJIJJ();
            if (c0fi2LJIJJ.LIZIZ.get(textStickerModelT4.getFontModel().fileName) == null) {
                TextFontModel textFontModel = new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16383, null);
                int i = C0FVC.LIZIZ;
                int i2 = C0FVC.LIZJ;
                C0FVC.LIZ = textFontModel;
                C0FVC.LIZIZ = i;
                C0FVC.LIZJ = i2;
            }
        }
    }

    public final void o7() {
        if (this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            m6();
        }
    }

    public final InterfaceC1455860nzM t5() {
        return (InterfaceC1455860nzM) this.LLJLIL.getValue(this, LLLIIII[1]);
    }

    private final void S6() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        i3(new AwS41S0010000_29((interfaceC388390FKrM5 == null || (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) == null || (textStickerModel = c1664680tQALLZLLIL.LIZ) == null || (textTemplateModel = textStickerModel.getTextTemplateModel()) == null) ? false : textTemplateModel.enableTextTemplate, 32));
    }

    private final void m6() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final ArrayList<AnonymousClass1149> arrayList = this.LLJJLIIIJLLLLLLLZ;
        final C0FMR c0fmr = this.LLJJJJJIL;
        this.LLJJIJIIJIL.wg(c0fmr.LIZIZ ? "photo_text_new_text_template" : "tiktok_text_template", "all", 0, new IFetchPanelInfoListener() { // from class: X.114r
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModelD5 = this.LIZ.D5();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                boolean z = c0fmr.LIZIZ;
                c1402910mbx.getClass();
                C1402910mbx.LJI(videoPublishEditModelD5, false, jCurrentTimeMillis2, z);
                this.LIZ.I7();
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                List<EffectCategoryModel> categoryList;
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (!this.LIZ.d6()) {
                    arrayList.clear();
                    C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                    VideoPublishEditModel videoPublishEditModelD5 = this.LIZ.D5();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    boolean z = c0fmr.LIZIZ;
                    c1402910mbx.getClass();
                    C1402910mbx.LJI(videoPublishEditModelD5, true, jCurrentTimeMillis2, z);
                    if (panelInfoModel2 != null && (categoryList = panelInfoModel2.getCategoryList()) != null) {
                        ArrayList<AnonymousClass1149> arrayList2 = arrayList;
                        for (EffectCategoryModel effectCategoryModel : categoryList) {
                            arrayList2.add(new AnonymousClass1149(effectCategoryModel.getName(), effectCategoryModel.getKey()));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.LIZ.i3(new AwS608S0100000_29((ArrayList) arrayList, (ArrayList<AnonymousClass1149>) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                        return;
                    }
                    C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                    VideoPublishEditModel videoPublishEditModelD52 = this.LIZ.D5();
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    boolean z2 = c0fmr.LIZIZ;
                    c1402910mbx2.getClass();
                    C1402910mbx.LJI(videoPublishEditModelD52, false, jCurrentTimeMillis3, z2);
                    this.LIZ.I7();
                }
            }
        });
    }

    public final VideoPublishEditModel E5() {
        if (d6()) {
            return null;
        }
        return D5();
    }

    public final InterfaceC388390FKr M5() {
        C0FWO c0fwo;
        C0FVY c0fvyV5 = v5();
        if (c0fvyV5 == null || (c0fwo = (C0FWO) c0fvyV5.LLIIIZ(EnumC1466150oFx.TEXT)) == null) {
            return null;
        }
        return c0fwo.R4();
    }

    public final void P4() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 == null || (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) == null || (textStickerModel = c1664680tQALLZLLIL.LIZ) == null || (textTemplateModel = textStickerModel.getTextTemplateModel()) == null || !textTemplateModel.enableTextTemplate) {
            R5("screen");
            return;
        }
        InterfaceC388390FKr interfaceC388390FKrM52 = M5();
        if (interfaceC388390FKrM52 != null) {
            interfaceC388390FKrM52.LLZL();
        }
    }

    public final TextStickerModel T4() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 == null || (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) == null) {
            return null;
        }
        return c1664680tQALLZLLIL.LIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJZ = true;
        try {
            C09AE c09ae = this.LLJJIJIL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            Iterator<C09AE> it2 = this.LLJJJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final EnumC388580FLk H5() {
        return this.LLJJ;
    }

    @Override // X.C0FVP
    public void LLZLLLL() {
        K4();
    }

    public final void P6() {
        super.hide();
    }

    @Override // X.C0FVP
    public EnumC388580FLk S4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.C0FVP
    public C0FMR j60() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C194410114e> o2() {
        return this.LLJJIII;
    }

    @Override // X.C0FVP
    public MutableLiveData<Boolean> pN2() {
        return this.LLLI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C114H> w2() {
        return this.LLJJIJI;
    }

    private final void K6(Effect effect) {
        C0FMR c0fmr = this.LLJJJJJIL;
        if (c0fmr.LIZIZ(effect.getEffectId()) != null) {
            return;
        }
        this.LLJJJ.add(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMD(this, effect, c0fmr, null), 3));
    }

    private final void S5(AnonymousClass1150 anonymousClass1150) {
        TextStickerModel textStickerModelT4;
        TextTemplateModel textTemplateModel;
        C0FMO c0fmo;
        boolean z;
        String textStr;
        TextStickerModel textStickerModelT42;
        TextTemplateModel textTemplateModel2;
        TextStickerModel textStickerModelT43;
        TextTemplateModel textTemplateModel3;
        String str;
        C0FMO c0fmoLIZIZ;
        TextStickerModel textStickerModelT44;
        TextTemplateModel textTemplateModel4;
        boolean z2;
        String textStr2;
        EnumC388580FLk enumC388580FLk = anonymousClass1150.LIZIZ;
        EnumC388580FLk enumC388580FLk2 = EnumC388580FLk.ONLY_PANEL;
        if (enumC388580FLk == enumC388580FLk2 && (textStickerModelT44 = T4()) != null && (textTemplateModel4 = textStickerModelT44.getTextTemplateModel()) != null && !textTemplateModel4.enableTextTemplate && !anonymousClass1150.LIZLLL && C0C0P.LIZ()) {
            C0FMO c0fmo2 = C0FIW.LIZ.get("pin_first");
            if (c0fmo2 == null) {
                this.LLLFF = true;
            } else {
                this.LLJJJJJIL.LIZJ(c0fmo2.LIZ.getEffectId(), c0fmo2);
                TextStickerModel textStickerModelT45 = T4();
                if (textStickerModelT45 != null && (textStr2 = textStickerModelT45.getTextStr()) != null && textStr2.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.LLL = new Pair<>(0, 0);
                this.LLJJJJJIL.LIZ = c0fmo2.LIZ.getEffectId();
                L6(this, c0fmo2.LIZ, new Pair(0, 0), c0fmo2.LIZIZ, c0fmo2.LIZJ, c0fmo2.LIZLLL, c0fmo2.LJ, z2, false, true, c0fmo2.LJFF, false);
                i3(AFwS273S0000000_29.get$arr$(181));
                return;
            }
        }
        EnumC388580FLk enumC388580FLk3 = anonymousClass1150.LIZIZ;
        if ((enumC388580FLk3 == enumC388580FLk2 || enumC388580FLk3 == EnumC388580FLk.PANEL_EDITOR) && (textStickerModelT4 = T4()) != null && (textTemplateModel = textStickerModelT4.getTextTemplateModel()) != null && !textTemplateModel.enableTextTemplate && anonymousClass1150.LIZLLL && (c0fmo = C0FIW.LIZ.get("pin_entrance")) != null) {
            this.LLJJJJJIL.LIZJ(c0fmo.LIZ.getEffectId(), c0fmo);
            TextStickerModel textStickerModelT46 = T4();
            if (textStickerModelT46 != null && (textStr = textStickerModelT46.getTextStr()) != null && textStr.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            Pair<Integer, Integer> pair = new Pair<>(0, 0);
            this.LLL = pair;
            u7(pair, c0fmo.LIZ.getEffectId());
            L6(this, c0fmo.LIZ, new Pair(0, 0), c0fmo.LIZIZ, c0fmo.LIZJ, c0fmo.LIZLLL, c0fmo.LJ, z, true, true, c0fmo.LJFF, false);
        }
        if (anonymousClass1150.LIZIZ == enumC388580FLk2 && anonymousClass1150.LJ && (textStickerModelT42 = T4()) != null && (textTemplateModel2 = textStickerModelT42.getTextTemplateModel()) != null && textTemplateModel2.enableTextTemplate && (textStickerModelT43 = T4()) != null && (textTemplateModel3 = textStickerModelT43.getTextTemplateModel()) != null && (str = textTemplateModel3.templateEffectId) != null && (c0fmoLIZIZ = this.LLJJJJJIL.LIZIZ(str)) != null) {
            Pair<Integer, Integer> pair2 = new Pair<>(-1, -1);
            this.LLL = pair2;
            u7(pair2, c0fmoLIZIZ.LIZ.getEffectId());
            i3(AFwS273S0000000_29.get$arr$(182));
        }
    }

    private final void W6(EnumC388580FLk enumC388580FLk) {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        Rect rect;
        if (enumC388580FLk == EnumC388580FLk.ONLY_PANEL) {
            InterfaceC388390FKr interfaceC388390FKrM5 = M5();
            if (interfaceC388390FKrM5 != null && (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) != null && (textStickerModel = c1664680tQALLZLLIL.LIZ) != null) {
                TextTemplateModel textTemplateModel = textStickerModel.getTextTemplateModel();
                if (textTemplateModel != null && !textTemplateModel.enableTextTemplate && !textStickerModel.getForceEffectRender()) {
                    InterfaceC388390FKr interfaceC388390FKrM52 = M5();
                    if (interfaceC388390FKrM52 == null || (rect = interfaceC388390FKrM52.LLZZLLIL()) == null) {
                        rect = new Rect();
                    }
                    i3(new AwS608S0100000_29(rect, 296));
                    if (textStickerModel == null) {
                        return;
                    }
                }
                TextTemplateModel textTemplateModel2 = textStickerModel.getTextTemplateModel();
                if ((textTemplateModel2 != null && textTemplateModel2.enableTextTemplate) || textStickerModel.getForceEffectRender()) {
                    i3(AFwS273S0000000_29.get$arr$(168));
                    return;
                }
                return;
            }
            return;
        }
        i3(AFwS273S0000000_29.get$arr$(169));
    }

    private final void d7(EnumC388580FLk enumC388580FLk) {
        if (enumC388580FLk == EnumC388580FLk.PANEL_EDITOR) {
            i3(AFwS273S0000000_29.get$arr$(170));
        } else {
            i3(AFwS273S0000000_29.get$arr$(171));
        }
        if (enumC388580FLk == EnumC388580FLk.ONLY_PANEL) {
            i3(AFwS273S0000000_29.get$arr$(173));
        } else {
            i3(AFwS273S0000000_29.get$arr$(175));
        }
    }

    private final void k7(EnumC388580FLk enumC388580FLk) {
        InterfaceC388390FKr interfaceC388390FKrM5;
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        String str;
        if (enumC388580FLk != EnumC388580FLk.CLOSE && (interfaceC388390FKrM5 = M5()) != null && (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) != null && (textStickerModel = c1664680tQALLZLLIL.LIZ) != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null && (str = textTemplateModel.templateEffectId) != null) {
            C0FMR c0fmr = this.LLJJJJJIL;
            c0fmr.LIZ = str;
            c0fmr.getClass();
            Pair<Integer, Integer> pair = null;
            try {
                SparseArray<ArrayList<C114D>> sparseArray = c0fmr.LIZJ;
                int size = sparseArray.size();
                int i = 0;
                loop0: while (true) {
                    if (i < size) {
                        int iKeyAt = sparseArray.keyAt(i);
                        int i2 = 0;
                        for (C114D c114d : sparseArray.valueAt(i)) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                if (Intrinsics.LJFF(c114d.LIZ.getEffectId(), str)) {
                                    Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(iKeyAt), Integer.valueOf(i2));
                                    pair = pair2;
                                    i3(new AwS584S0100000_5(pair2, (Pair<Integer, Integer>) 119));
                                    break loop0;
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        i++;
                    } else {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            u7(pair, str);
        }
    }

    @Override // X.C0FVP
    public void LLLLIIIILLL(String str) {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 != null && (c1664680tQALLZLLIL = interfaceC388390FKrM5.LLZLLIL()) != null && (textStickerModel = c1664680tQALLZLLIL.LIZ) != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null && textTemplateModel.isHint) {
            return;
        }
        i3(new AwS56S1000000_5(str, 3));
    }

    public final void O4(String str) {
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 != null) {
            interfaceC388390FKrM5.LLZILL(str);
        }
    }

    public final void R5(String str) {
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 != null) {
            interfaceC388390FKrM5.LLZLL(str);
        }
    }

    @Override // X.C0FVP
    public void Tg0(AnonymousClass1150 anonymousClass1150) {
        ArrayList<AnonymousClass1149> arrayList;
        String strLLZIL;
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        InterfaceC388390FKr interfaceC388390FKrM5;
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL2;
        TextStickerModel textStickerModel2;
        TextTemplateModel textTemplateModel2;
        String str;
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL3;
        TextStickerModel textStickerModel3;
        TextTemplateModel textTemplateModel3;
        TextStickerModel textStickerModelT4 = T4();
        if (textStickerModelT4 != null && !C0F8Y.LJIIL(textStickerModelT4) && textStickerModelT4.getTextTemplateModel().enableTextTemplate) {
            this.LLJJJJJIL = this.LLJJJIL;
            this.LLJJLIIIJLLLLLLLZ = this.LLJJJJLIIL;
        } else {
            this.LLJJJJJIL = this.LLJJJJ;
            this.LLJJLIIIJLLLLLLLZ = this.LLJJL;
        }
        this.LLJJI = anonymousClass1150;
        InterfaceC1453410nvP interfaceC1453410nvPX5 = x5();
        boolean z = false;
        if (interfaceC1453410nvPX5 != null) {
            interfaceC1453410nvPX5.pause(false);
        }
        if (anonymousClass1150.LIZJ) {
            i3(new AwS608S0100000_29(anonymousClass1150, 293));
            return;
        }
        InterfaceC388390FKr interfaceC388390FKrM52 = M5();
        if (interfaceC388390FKrM52 != null && (strLLZIL = interfaceC388390FKrM52.LLZIL()) != null) {
            InterfaceC388390FKr interfaceC388390FKrM53 = M5();
            if (interfaceC388390FKrM53 != null && (c1664680tQALLZLLIL = interfaceC388390FKrM53.LLZLLIL()) != null && (textStickerModel = c1664680tQALLZLLIL.LIZ) != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null && textTemplateModel.enableTextTemplate && (interfaceC388390FKrM5 = M5()) != null && (c1664680tQALLZLLIL2 = interfaceC388390FKrM5.LLZLLIL()) != null && (textStickerModel2 = c1664680tQALLZLLIL2.LIZ) != null && (textTemplateModel2 = textStickerModel2.getTextTemplateModel()) != null && textTemplateModel2.useDefaultText) {
                InterfaceC388390FKr interfaceC388390FKrM54 = M5();
                if (interfaceC388390FKrM54 == null || (c1664680tQALLZLLIL3 = interfaceC388390FKrM54.LLZLLIL()) == null || (textStickerModel3 = c1664680tQALLZLLIL3.LIZ) == null || (textTemplateModel3 = textStickerModel3.getTextTemplateModel()) == null || (str = textTemplateModel3.defaultText) == null) {
                    str = "";
                }
                LLLLIIIILLL(str);
            } else {
                LLLLIIIILLL(strLLZIL);
            }
        }
        EnumC388580FLk enumC388580FLk = this.LLJJ;
        EnumC388580FLk enumC388580FLk2 = EnumC388580FLk.CLOSE;
        if (enumC388580FLk == enumC388580FLk2 && anonymousClass1150.LIZIZ != enumC388580FLk2) {
            z = true;
        }
        EnumC388580FLk enumC388580FLk3 = EnumC388580FLk.ONLY_EDITOR;
        if (enumC388580FLk == enumC388580FLk3) {
            EnumC388580FLk enumC388580FLk4 = anonymousClass1150.LIZIZ;
            EnumC388580FLk enumC388580FLk5 = EnumC388580FLk.ONLY_PANEL;
            if (enumC388580FLk4 == enumC388580FLk5) {
                LJJIL();
                y7(enumC388580FLk5);
                return;
            }
        }
        if (enumC388580FLk == EnumC388580FLk.PANEL_EDITOR) {
            C354270Duj.LIZ(0L, new AwS573S0100000_29(this, 516));
        }
        if (this.LLJJ == anonymousClass1150.LIZIZ) {
            return;
        }
        if (anonymousClass1150.LIZ != 0) {
            i3(new AwS608S0100000_29(anonymousClass1150, 294));
        }
        i3(new AwS584S0100000_5(this, 123));
        i3(new AwS584S0100000_5(this, 125));
        if (this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            m6();
        } else {
            C375830EoP<ArrayList<AnonymousClass1149>> c375830EoP = T2().LJIJ;
            if (c375830EoP != null) {
                arrayList = c375830EoP.LIZ;
            } else {
                arrayList = null;
            }
            if (!Intrinsics.LJFF(arrayList, this.LLJJLIIIJLLLLLLLZ)) {
                i3(new AwS608S0100000_29(this, 295));
            }
        }
        y7(anonymousClass1150.LIZIZ);
        S5(anonymousClass1150);
        if ((!this.LLJJLIIIJLLLLLLLZ.isEmpty()) && this.LLLFFI) {
            C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 144));
        }
        if (anonymousClass1150.LIZIZ == enumC388580FLk3) {
            i3(AFwS273S0000000_29.get$arr$(184));
        }
        super.show();
        if (z) {
            i3(AFwS273S0000000_29.get$arr$(180));
        }
        pN2().setValue(Boolean.FALSE);
        if (this.LLJJ == EnumC388580FLk.ONLY_PANEL) {
            return;
        }
        C354270Duj.LIZ(0L, new AwS573S0100000_29(this, 515));
    }

    public final void Z4(Pair<Integer, Integer> pair) {
        i3(new AwS584S0100000_5(pair, (Pair<Integer, Integer>) 120));
        if (TextTemplateTools.LJIIJJI(pair, this.LLL)) {
            C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 143));
        }
    }

    @Override // X.C0FVP
    public void cu0(EnumC388580FLk enumC388580FLk) {
        y7(enumC388580FLk);
    }

    public final void d5(boolean z) {
        if (z) {
            if (this.LLJJ == EnumC388580FLk.ONLY_PANEL) {
                y7(EnumC388580FLk.PANEL_EDITOR);
            }
        } else {
            if (this.LLJJ != EnumC388580FLk.PANEL_EDITOR) {
                return;
            }
            y7(EnumC388580FLk.ONLY_PANEL);
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final void s7(Pair<Integer, String> pair) {
        this.LLJZIJLIL = pair;
    }

    @Override // X.C0FVP
    public void sw(boolean z) {
        InterfaceC388390FKr interfaceC388390FKrM5 = M5();
        if (interfaceC388390FKrM5 != null) {
            interfaceC388390FKrM5.sw(z);
        }
    }

    public final void y7(EnumC388580FLk enumC388580FLk) {
        k7(enumC388580FLk);
        EnumC388580FLk enumC388580FLk2 = this.LLJJ;
        EnumC388580FLk enumC388580FLk3 = EnumC388580FLk.CLOSE;
        if (enumC388580FLk2 == enumC388580FLk3 && enumC388580FLk != enumC388580FLk3) {
            i3(new AwS584S0100000_5(this, 121));
        }
        this.LLJJ = enumC388580FLk;
        i3(new AwS584S0100000_5(enumC388580FLk, 122));
        W6(enumC388580FLk);
        d7(enumC388580FLk);
        T6();
        W6(enumC388580FLk);
        n7();
        S6();
    }

    public C194431114z(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = EnumC388580FLk.CLOSE;
        this.LLJJIII = AFwS218S0000000_29.get$arr$(237);
        this.LLJJIJI = new AwS573S0100000_29(this, 514);
        this.LLJJIJIIJIL = C1633850scR.LIZ(C0CHQ.LIZ, null);
        this.LLJJJ = new ArrayList();
        C0FMR c0fmr = new C0FMR();
        this.LLJJJIL = c0fmr;
        C0FMR c0fmr2 = new C0FMR();
        c0fmr2.LIZIZ = true;
        this.LLJJJJ = c0fmr2;
        this.LLJJJJJIL = c0fmr;
        this.LLJJJJLIIL = new ArrayList<>();
        this.LLJJL = new ArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = this.LLJJJJLIIL;
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJLILLLLZIIL = new C1466810oH1(this, 7);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLJZIJLIL = new Pair<>(0, "");
        this.LLL = new Pair<>(0, 0);
        this.LLLFZ = new C389000FNa(this);
        this.LLLI = new MutableLiveData<>();
    }

    @Override // X.C0FVP
    public void Gc(String str, boolean z) {
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        boolean zU5 = U5();
        c1402910mbx.getClass();
        C0LAB c0labLIZJ = C1402910mbx.LIZJ(videoPublishEditModelD5, zU5);
        c0labLIZJ.LJ("location", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_new_text_template");
        C20684815ws.LJIILLIIL("enter_text_in_text_editor", c0labLIZJ.LIZ);
    }

    public final void u7(Pair<Integer, Integer> pair, String str) {
        this.LLLF = pair;
        C0FMR c0fmr = this.LLJJJJJIL;
        if (str == null) {
            str = "";
        }
        c0fmr.LIZ = str;
        Xu();
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    public final void k5(final Effect effect, final Pair<Integer, Integer> pair, final boolean z, final boolean z2, final boolean z3) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(C533090KvT.LIZIZ.LIZIZ());
        final String strLJ = TextTemplateTools.LJ(effect);
        mapLJIIJ.put("panel", "text_template_typeface");
        if (strLJ.length() == 0) {
            F4(effect, pair, null, "", z, z2, z3, "");
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.LLJJIJIIJIL.Cg(C1697810uHb.LJ(strLJ), mapLJIIJ, new IFetchEffectListByIdsListener() { // from class: X.0FMS
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                    VideoPublishEditModel videoPublishEditModelD5 = this.LIZ.D5();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    String str = strLJ;
                    c1402910mbx.getClass();
                    C1402910mbx.LIZLLL(jCurrentTimeMillis2, videoPublishEditModelD5, str, "", false, false, false);
                    this.LIZ.Z4(pair);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    final Effect effect2;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect2 = (Effect) C13LP.LJJJLZIJ(0, data)) != null) {
                        final C194431114z c194431114z = this.LIZ;
                        final long j = jCurrentTimeMillis;
                        final String str = strLJ;
                        final Effect effect3 = effect;
                        final Pair<Integer, Integer> pair2 = pair;
                        final boolean z4 = z;
                        final boolean z5 = z2;
                        final boolean z6 = z3;
                        if (c194431114z.LLJJIJIIJIL.LJIIIIZZ(effect2)) {
                            C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                            VideoPublishEditModel videoPublishEditModelD5 = c194431114z.D5();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            c1402910mbx.getClass();
                            C1402910mbx.LIZLLL(jCurrentTimeMillis2, videoPublishEditModelD5, str, "", true, false, true);
                            c194431114z.F4(effect3, pair2, effect2, effect2.getUnzipPath(), z4, z5, z6, "");
                            return;
                        }
                        c194431114z.LLJJIJIIJIL.LIZJ(effect2, new IFetchEffectListener() { // from class: X.0FMT
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect4) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(Effect effect4) {
                                C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                                VideoPublishEditModel videoPublishEditModelD52 = c194431114z.D5();
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                                String str2 = str;
                                c1402910mbx2.getClass();
                                C1402910mbx.LIZLLL(jCurrentTimeMillis3, videoPublishEditModelD52, str2, "", true, false, false);
                                C194431114z c194431114z2 = c194431114z;
                                Effect effect5 = effect3;
                                Pair<Integer, Integer> pair3 = pair2;
                                Effect effect6 = effect2;
                                c194431114z2.F4(effect5, pair3, effect6, effect6.getUnzipPath(), z4, z5, z6, "");
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect4, ExceptionResult exceptionResult) {
                                C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                                VideoPublishEditModel videoPublishEditModelD52 = c194431114z.D5();
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                                String str2 = str;
                                c1402910mbx2.getClass();
                                C1402910mbx.LIZLLL(jCurrentTimeMillis3, videoPublishEditModelD52, str2, "", false, false, false);
                                c194431114z.Z4(pair2);
                            }
                        });
                        return;
                    }
                    this.LIZ.Z4(pair);
                }
            });
        }
    }

    public final C09AE n5(Effect effect, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3) {
        return C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMA(this, effect, pair, z, z2, z3, null), 3);
    }

    @Override // X.C0FVP
    public void rx0(boolean z, long j, String str, String str2, boolean z2) {
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        c1402910mbx.getClass();
        C1402910mbx.LJ(videoPublishEditModelD5, z, j, str, str2, z2);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public final void u6(final Pair<Integer, Integer> pair, final C114D c114d, final boolean z, final boolean z2, final boolean z3) {
        TextStickerModel textStickerModelT4;
        TextTemplateModel textTemplateModel;
        Pair<Integer, Integer> pair2 = this.LLLF;
        if (pair2 != null && pair2.getFirst().intValue() == pair.getFirst().intValue() && pair2.getSecond().intValue() == pair.getSecond().intValue()) {
            return;
        }
        if (Intrinsics.LJFF(this.LLJJJJJIL.LIZ, c114d.LIZ.getEffectId()) && (textStickerModelT4 = T4()) != null && (textTemplateModel = textStickerModelT4.getTextTemplateModel()) != null && textTemplateModel.isHint) {
            return;
        }
        this.LLL = pair;
        C0FMO c0fmoLIZIZ = this.LLJJJJJIL.LIZIZ(c114d.LIZ.getEffectId());
        if (c0fmoLIZIZ != null) {
            L6(this, c0fmoLIZIZ.LIZ, pair, c0fmoLIZIZ.LIZIZ, c0fmoLIZIZ.LIZJ, c0fmoLIZIZ.LIZLLL, c0fmoLIZIZ.LJ, z, z2, z3, c0fmoLIZIZ.LJFF, false);
            return;
        }
        i3(new AwS584S0100000_5(pair, (Pair<Integer, Integer>) 124));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJIJIIJIL.LIZJ(c114d.LIZ, new IFetchEffectListener() { // from class: X.0FMQ
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModelD5 = this.LIZ.D5();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String effectId = c114d.LIZ.getEffectId();
                boolean zLJIIJ = TextTemplateTools.LJIIJ(c114d.LIZ);
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModelD5, effectId, "", true, false, zLJIIJ);
                C0FMO c0fmoLIZIZ2 = this.LIZ.LLJJJJJIL.LIZIZ(effect2.getEffectId());
                if (TextTemplateTools.LJIIJ(effect2)) {
                    if (c0fmoLIZIZ2 == null) {
                        this.LIZ.n5(effect2, pair, z, z2, z3);
                        return;
                    } else {
                        this.LIZ.F4(effect2, pair, c0fmoLIZIZ2.LIZIZ, c0fmoLIZIZ2.LIZJ, z, z2, z3, c0fmoLIZIZ2.LJFF);
                        return;
                    }
                }
                if (c0fmoLIZIZ2 == null) {
                    this.LIZ.k5(effect2, pair, z, z2, z3);
                } else {
                    this.LIZ.F4(effect2, pair, c0fmoLIZIZ2.LIZIZ, c0fmoLIZIZ2.LIZJ, z, z2, z3, "");
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModelD5 = this.LIZ.D5();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String effectId = c114d.LIZ.getEffectId();
                boolean zLJIIJ = TextTemplateTools.LJIIJ(c114d.LIZ);
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModelD5, effectId, "", false, false, zLJIIJ);
                this.LIZ.Z4(pair);
            }
        });
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C0FVP
    public void CM1(boolean z, long j, boolean z2, String str, boolean z3, String str2) {
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        c1402910mbx.getClass();
        C1402910mbx.LIZLLL(j, videoPublishEditModelD5, str, str2, z, z2, z3);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C0FVP
    public void hA2(boolean z, long j, boolean z2, String str, String str2, boolean z3) {
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        c1402910mbx.getClass();
        C1402910mbx.LJIIIIZZ(j, videoPublishEditModelD5, str, str2, z, z2, z3);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C0FVP
    public void FC0(boolean z, long j, boolean z2, boolean z3, String str, String str2, String str3) {
        C1402910mbx c1402910mbx = C1402910mbx.LIZ;
        VideoPublishEditModel videoPublishEditModelD5 = D5();
        c1402910mbx.getClass();
        C1402910mbx.LJII(videoPublishEditModelD5, z, j, z2, z3, str, str2, str3);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public final void F4(Effect effect, Pair<Integer, Integer> pair, Effect effect2, String str, boolean z, boolean z2, boolean z3, String str2) {
        if (d6()) {
            return;
        }
        if (TextTemplateTools.LJIIJ(effect)) {
            this.LLJJIJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMF(this, effect, effect2, str, str2, pair, z, z2, z3, null), 3);
        } else {
            this.LLJJIJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMB(str, effect, this, effect2, pair, z, z2, z3, null), 3);
        }
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }

    public static final void L6(C194431114z c194431114z, Effect effect, Pair pair, Effect effect2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4) {
        String str5;
        int iLLZ;
        String effectId;
        boolean z5;
        TextStickerModel textStickerModelT4;
        String textStr;
        C114D c114d;
        Effect effect3;
        C114D c114d2;
        Effect effect4;
        if (str.length() == 0 && !TextTemplateTools.LJIIJ(effect)) {
            c194431114z.Z4(pair);
            return;
        }
        if (c194431114z.d6()) {
            return;
        }
        C0FMR c0fmr = c194431114z.LLJJJJJIL;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue() + 1;
        ArrayList<C114D> arrayList = c0fmr.LIZJ.get(iIntValue);
        TextFontModel textFontModelLIZ = null;
        if (arrayList != null && (c114d2 = (C114D) C13LP.LJJJLZIJ(iIntValue2, arrayList)) != null && (effect4 = c114d2.LIZ) != null) {
            c194431114z.K6(effect4);
        }
        C0FMR c0fmr2 = c194431114z.LLJJJJJIL;
        int iIntValue3 = ((Number) pair.getFirst()).intValue();
        int iIntValue4 = ((Number) pair.getSecond()).intValue() + 2;
        ArrayList<C114D> arrayList2 = c0fmr2.LIZJ.get(iIntValue3);
        if (arrayList2 != null && (c114d = (C114D) C13LP.LJJJLZIJ(iIntValue4, arrayList2)) != null && (effect3 = c114d.LIZ) != null) {
            c194431114z.K6(effect3);
        }
        if (TextTemplateTools.LJIIJJI(c194431114z.LLL, pair)) {
            AnonymousClass1149 anonymousClass1149 = (AnonymousClass1149) C13LP.LJJJLZIJ(((Number) pair.getFirst()).intValue(), c194431114z.LLJJLIIIJLLLLLLLZ);
            C1402910mbx c1402910mbx = C1402910mbx.LIZ;
            VideoPublishEditModel videoPublishEditModelD5 = c194431114z.D5();
            boolean zU5 = c194431114z.U5();
            String str6 = "";
            if (anonymousClass1149 == null || (str5 = anonymousClass1149.LIZ) == null) {
                str5 = "";
            }
            String name = effect.getName();
            boolean zLJIIJ = TextTemplateTools.LJIIJ(effect);
            c1402910mbx.getClass();
            C1402910mbx.LJFF(videoPublishEditModelD5, str5, name, zU5, z2, z3, zLJIIJ);
            if (TextTemplateTools.LJIIIIZZ(effect)) {
                VideoPublishEditModel videoPublishEditModelD52 = c194431114z.D5();
                boolean zU52 = c194431114z.U5();
                String effectId2 = effect.getEffectId();
                String name2 = effect.getName();
                boolean zLJIIJ2 = TextTemplateTools.LJIIJ(effect);
                C0LAB c0labLIZJ = C1402910mbx.LIZJ(videoPublishEditModelD52, zU52);
                c0labLIZJ.LJ("template", name2);
                c0labLIZJ.LJ("template_id", effectId2);
                c0labLIZJ.LIZ(zLJIIJ2 ? 1 : 0, "is_new_text_template");
                C20684815ws.LJIILLIIL("photo_text_template_l8_popup", c0labLIZJ.LIZ);
            }
            int iIntValue5 = ((Number) pair.getFirst()).intValue();
            if (c194431114z.LLJJJJJIL.LIZ(effect.getEffectId())) {
                iIntValue5 = 0;
            }
            if (effect2 != null) {
                textFontModelLIZ = C363490EMx.LIZ(effect2, str);
            }
            InterfaceC388390FKr interfaceC388390FKrM5 = c194431114z.M5();
            if (interfaceC388390FKrM5 != null) {
                InterfaceC388390FKr interfaceC388390FKrM52 = c194431114z.M5();
                if (interfaceC388390FKrM52 != null) {
                    iLLZ = interfaceC388390FKrM52.LLZ();
                } else {
                    iLLZ = 0;
                }
                String unzipPath = effect.getUnzipPath();
                boolean zLJIIJ3 = TextTemplateTools.LJIIJ(effect);
                if (effect2 == null || (effectId = effect2.getEffectId()) == null) {
                    effectId = "";
                }
                String effectId3 = effect.getEffectId();
                if (effectId3 == null) {
                    effectId3 = "";
                }
                String name3 = effect.getName();
                if (name3 != null) {
                    str6 = name3;
                }
                boolean zLJIIIIZZ = TextTemplateTools.LJIIIIZZ(effect);
                if (z4 && ((textStickerModelT4 = c194431114z.T4()) == null || (textStr = textStickerModelT4.getTextStr()) == null || textStr.length() == 0)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                interfaceC388390FKrM5.LLZLI(true, iLLZ, new TextTemplateModel(unzipPath, true, zLJIIJ3, z5, str2, false, false, false, effectId, str, effectId3, zLJIIIIZZ, z, str6, str3, iIntValue5, null, false, false, false, false, null, str4, z4, TextTemplateTools.LJIIIZ(effect), 0, null, null, 239010016, null), textFontModelLIZ, new AwS214S0300000_5(effect, (Effect) c194431114z, (C194431114z) pair, (Pair<Integer, Integer>) 4));
                return;
            }
            return;
        }
        c194431114z.i3(new AwS584S0100000_5(pair, (Pair<Integer, Integer>) 126));
    }
}
