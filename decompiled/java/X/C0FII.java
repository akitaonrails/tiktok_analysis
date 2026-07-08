package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FII, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FII extends C388270FKf {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final C0FK0 LIZLLL;
    public final Context LJ;
    public final C1664680tQA<TextStickerModel> LJFF;
    public final C0FF8 LJI;
    public final LifecycleOwner LJII;
    public final AbstractC388140FJs LJIIIIZZ;
    public boolean LJIIIZ;
    public final InterfaceC1635410sex LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJIIL;

    public final C387890FIt LJIIJ() {
        return (C387890FIt) this.LJIIL.getValue();
    }

    public final void LJIIJJI() {
        this.LJFF.LIZ(new C2217371BqR() { // from class: X.0FAR
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextTemplateModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextTemplateModel((TextTemplateModel) obj2);
            }
        }).LJIIIZ(this.LJII, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1056));
        this.LJFF.LIZ(new C2217371BqR() { // from class: X.0FIM
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FEv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextFontModel) obj).fileName;
            }
        }).LJIIIZ(this.LJII, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1057));
        this.LIZJ.LJ(new AwS584S0100000_5(this, 1058), C13LE.LIZ(C0FHG.class));
        this.LJFF.LIZ(new C2217371BqR() { // from class: X.0FIN
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FIR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextFontModel) obj).enableBgColor);
            }
        }).LJIIIZ(this.LJII, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1059));
        this.LJFF.LIZ(new C2217371BqR() { // from class: X.0FIL
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FHo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextFontModel) obj).enableMaskBlurLightColor);
            }
        }).LJIIIZ(this.LJII, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1054));
        this.LIZJ.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FIS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZJ;
            }
        }).LJIIIZ(this.LIZJ.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1055));
    }

    public final void LJIILL() {
        TextFontModel fontModel;
        SubTemplateStyle subTemplateStyle;
        this.LIZJ.LJIILJJIL = this.LJFF.LIZ.getMode() == 5 ? this.LIZJ.LJIILJJIL : this.LJFF.LIZ.getMode();
        if (C0F8Y.LJIIIZ(this.LJFF.LIZ)) {
            SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(C0FAS.LIZ(this.LJFF.LIZ), this.LJFF.LIZ.getCompatModel().getSubTemplates());
            if (subTemplateInfo == null || (subTemplateStyle = subTemplateInfo.style) == null || (fontModel = subTemplateStyle.fontModel) == null) {
                fontModel = new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 15359, null);
            }
        } else {
            fontModel = this.LJFF.LIZ.getFontModel();
        }
        if (!C0F8Y.LJIIL(this.LJFF.LIZ) && (fontModel.fontId.length() == 0 || fontModel.fontName.length() == 0 || fontModel.fileName.length() == 0 || fontModel.localPath.length() == 0)) {
            LJIJ();
            return;
        }
        C0FI2.LJIJJ().LJJJIL(2, fontModel.fileName);
        TextFontStyleData textFontStyleDataLJIILIIL = C0FI2.LJIILIIL(2);
        if (textFontStyleDataLJIILIIL != null) {
            LJIILIIL(textFontStyleDataLJIILIIL, false);
        }
        LJIIJ().LJII(C0FAS.LJ(this.LJFF.LIZ.getTextTemplateModel(), C0FAS.LIZ(this.LJFF.LIZ)));
    }

    public static C0FI2 LJIIIZ() {
        if (!LJIIL()) {
            return C0FI2.LJIJJ();
        }
        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextEditFontListAbility -> force use text font panel, hasRequestLanguageTextFont() = ");
        sbLIZ.append(((Keva) C0FIF.LIZ.getValue()).getBoolean("key_has_request_language_text_font", false));
        C201955140j.LIZJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
        return C0FI2.LJIJJLI("textfont");
    }

    public static boolean LJIIL() {
        return C0FJL.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_font_by_language_opt", true, false) && !((Keva) C0FIF.LIZ.getValue()).getBoolean("key_has_request_language_text_font", false);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        boolean z;
        C0FMO c0fmo;
        C0FMO c0fmo2;
        LJIILL();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_font_by_language_opt", true, false) && this.LJIIJJI) {
            this.LJIIJJI = false;
        } else if (LJIIL()) {
            LJIIJ().LJ(LJIILJJIL(C0FI2.LJIJJLI("textfont").LJIJ()));
        } else {
            LJIIJ().LIZLLL(LJIILJJIL(C0FI2.LJIJJ().LJIJ()));
        }
        LJIIJJI();
        if (!this.LIZJ.LJIIIZ.LIZJ || C444960Hcc.LIZIZ()) {
            return;
        }
        boolean zLIZ = C0FIH.LIZ();
        boolean zLIZ2 = C0C0P.LIZ();
        if (zLIZ && (c0fmo2 = C0FIW.LIZ.get("pin_entrance")) != null && C2354709Kn.LIZIZ(c0fmo2.LIZJ)) {
            LJIIJ().LLJIJIL.LIZ(C0FIW.LIZJ);
            z = true;
        } else {
            z = false;
        }
        if ((!zLIZ2 || ((c0fmo = C0FIW.LIZ.get("pin_first")) != null && C2354709Kn.LIZIZ(c0fmo.LIZJ))) && (!zLIZ || z)) {
            return;
        }
        int size = C0FIW.LIZ.size();
        C0FF8 c0ff8 = this.LJI;
        final InterfaceC388160FJu interfaceC388160FJuLJIIJ = c0ff8 != null ? c0ff8.LJIIJ() : null;
        if (size < 2) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJIIJ.LJI("tiktok_new_text_template_new_entrance", false, new IFetchEffectChannelListener() { // from class: X.0FIJ
                public final /* synthetic */ String LIZJ = "tiktok_new_text_template_new_entrance";

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC388160FJu interfaceC388160FJu = interfaceC388160FJuLJIIJ;
                    if (interfaceC388160FJu != null) {
                        interfaceC388160FJu.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, this.LIZJ, false);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    List<Effect> all_category_effects;
                    List<Effect> all_category_effects2;
                    String str;
                    String str2;
                    boolean z2;
                    boolean z3;
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 != null) {
                        all_category_effects = effectChannelResponse2.getAll_category_effects();
                    } else {
                        all_category_effects = null;
                    }
                    if (all_category_effects != null && !all_category_effects.isEmpty()) {
                        if (effectChannelResponse2 != null && (all_category_effects2 = effectChannelResponse2.getAll_category_effects()) != null) {
                            C0FII c0fii = this;
                            for (Effect effect : all_category_effects2) {
                                List<String> tags = effect.getTags();
                                if (tags != null && (str = (String) ListProtector.get(tags, 0)) != null) {
                                    try {
                                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
                                        Pair pair = new Pair(listLJJLIIIJILLIZJL.get(0), listLJJLIIIJILLIZJL.get(1));
                                        String str3 = (String) pair.getFirst();
                                        String str4 = (String) pair.getSecond();
                                        List<String> url_list = effect.getIcon_url().getUrl_list();
                                        if (url_list == null || (str2 = (String) C13LP.LJJJLL(url_list)) == null) {
                                            str2 = "";
                                        }
                                        if (C0FIH.LIZ() && Intrinsics.LJFF(str3, "pin_entrance")) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (C0C0P.LIZ() && Intrinsics.LJFF(str3, "pin_first")) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z2 && str2.length() > 0) {
                                            c0fii.LJIIIIZZ(effect, str4, str3, str2, new AwS584S0100000_5(c0fii, 1060));
                                        } else if (z3) {
                                            c0fii.LJIIIIZZ(effect, str4, str3, str2, null);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C098200Yq c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        C189200o6.m1boximpl(c098200Yq);
                                    }
                                }
                            }
                        }
                        InterfaceC388160FJu interfaceC388160FJu = interfaceC388160FJuLJIIJ;
                        if (interfaceC388160FJu != null) {
                            interfaceC388160FJu.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, this.LIZJ, true);
                            return;
                        }
                        return;
                    }
                    InterfaceC388160FJu interfaceC388160FJu2 = interfaceC388160FJuLJIIJ;
                    if (interfaceC388160FJu2 != null) {
                        interfaceC388160FJu2.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, this.LIZJ, false);
                    }
                }
            });
        }
    }

    public final void LJIJ() {
        C0FI2.LJIJJ().LJJJJ(2);
        List<TextFontStyleData> listLJIJ = LJIIIZ().LJIJ();
        if (!((ArrayList) listLJIJ).isEmpty()) {
            this.LJIIIZ = true;
            C387890FIt c387890FItLJIIJ = LJIIJ();
            String str = ((TextFontStyleData) C13LP.LJJJJZI(listLJIJ)).fontName;
            for (C387880FIs c387880FIs : (ArrayList) c387890FItLJIIJ.LLILZ) {
                if (c387880FIs.getFontData().fontName.equals(str)) {
                    c387880FIs.performClick();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData> LJIILJJIL(java.util.List<? extends com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData> r11) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FII.LJIILJJIL(java.util.List):java.util.List");
    }

    public final void LJIJI(String str) {
        C0FI2.LJIJJ().LJJJIL(2, str);
        LJIIJ().LJII(false);
    }

    public final void LJIILIIL(TextFontStyleData textFontStyleData, boolean z) {
        String panel;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        int i;
        C0FF8 c0ff8;
        C0FGR c0fgrLIZJ;
        C0FGR c0fgrLIZJ2;
        if (z && this.LJFF.LIZ.getTextTemplateModel().enableTextTemplate && System.currentTimeMillis() - this.LIZJ.LJIIL.LJII.invoke().longValue() < 600 && this.LIZJ.LJIIL.LJII.invoke().longValue() != 0) {
            return;
        }
        String effectId = textFontStyleData.LJ.getEffectId();
        String resource_id = textFontStyleData.LJ.getResource_id();
        Effect effect = textFontStyleData.LJ;
        String str2 = "";
        if (effect == null || (panel = effect.getPanel()) == null) {
            panel = "";
        }
        String str3 = textFontStyleData.fontName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleData.title;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = textFontStyleData.fileName;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = textFontStyleData.LIZ;
        if (str6 != null) {
            str2 = str6;
        }
        if (textFontStyleData.enableBgColor == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (textFontStyleData.enableMaskBlurLightColor == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        TextFontModel textFontModel = new TextFontModel(effectId, resource_id, panel, null, str3, str4, 28, 0, str5, str2, z2, z3, false, 0, 12424, null);
        if (Intrinsics.LJFF(textFontStyleData.fileName, this.LJFF.LIZ.getFontModel().fileName)) {
            str = this.LJFF.LIZ.getFontModel().fontCategoryId;
        } else {
            str = textFontModel.fontCategoryId;
        }
        if (this.LJFF.LIZ.getTextTemplateModel().enableTextTemplate && C0FAS.LJ(this.LJFF.LIZ.getTextTemplateModel(), C0FAS.LIZ(this.LJFF.LIZ))) {
            z4 = true;
        } else {
            z4 = false;
        }
        TextStickerModel textStickerModel = this.LJFF.LIZ;
        TextFontModel textFontModelLIZLLL = C0F8Y.LIZLLL(textStickerModel, C0FAS.LIZ(textStickerModel));
        if (z && Intrinsics.LJFF(textFontModel.fontId, textFontModelLIZLLL.fontId) && !z4) {
            return;
        }
        if (this.LJFF.LIZ.getFontModel().fontId.length() == 0) {
            C0FF8 c0ff82 = this.LJI;
            if (c0ff82 != null && c0ff82.LIZLLL()) {
                i = 50;
            } else if (C0F8Y.LJIIIIZZ(this.LJFF.LIZ)) {
                i = 22;
            } else {
                i = 28;
            }
        } else {
            i = this.LJFF.LIZ.getFontModel().fontSize;
        }
        String str7 = null;
        if (z) {
            TextStickerModel textStickerModel2 = this.LJFF.LIZ;
            if (textStickerModel2.getTextTemplateModel().isGroupTextTemplates) {
                List<Boolean> useDefaultFonts = textStickerModel2.getTextTemplateModel().editState.getUseDefaultFonts();
                if (useDefaultFonts.isEmpty() && C19719512Dh.LJI(useDefaultFonts)) {
                    Boolean bool = Boolean.TRUE;
                    ListProtector.add(useDefaultFonts, 0, bool);
                    ListProtector.add(useDefaultFonts, 1, bool);
                }
                Boolean bool2 = (Boolean) C13LP.LJJJLZIJ(textStickerModel2.getCompatModel().getSelectSlotIndex(), useDefaultFonts);
                if (bool2 != null) {
                    bool2.booleanValue();
                    if (C19719512Dh.LJI(useDefaultFonts)) {
                        ListProtector.set(useDefaultFonts, textStickerModel2.getCompatModel().getSelectSlotIndex(), Boolean.FALSE);
                    }
                }
            } else {
                textStickerModel2.getTextTemplateModel().useDefaultFont = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ.LJIIL.LJII.invoke().longValue();
            if (!this.LJFF.LIZ.getTextTemplateModel().enableTextTemplate && jCurrentTimeMillis > 200 && this.LIZJ.LJIIL.LJII.invoke().longValue() != 0) {
                this.LJFF.LIZ.getTextTemplateModel().editedFont = true;
            }
        }
        this.LJFF.LIZLLL(new C0FAQ(textFontModel, this, str, i, z), true);
        TextFontStyleData textFontStyleData2 = (TextFontStyleData) C13LP.LJJJLL(LJIIIZ().LJIJ());
        if (textFontStyleData2 != null) {
            str7 = textFontStyleData2.fontName;
        }
        String str8 = this.LJFF.LIZ.getFontModel().fontTitle;
        if (str8.length() == 0) {
            return;
        }
        if (z && (!this.LJIIIZ || !Intrinsics.LJFF(str8, str7))) {
            C0FF8 c0ff83 = this.LJI;
            if (c0ff83 != null && (c0fgrLIZJ2 = c0ff83.LIZJ()) != null) {
                c0fgrLIZJ2.LJIIIIZZ(this.LJFF.LIZ, "trending");
            }
            if (!this.LJIIIZ && (c0ff8 = this.LJI) != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                c0fgrLIZJ.LJIIJ(this.LJFF.LIZ);
            }
        }
        this.LJIIIZ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FII(ViewGroup viewGroup, C388200FJy c388200FJy, C0FK0 c0fk0) {
        C387890FIt c387890FItLJIIJ;
        super(c388200FJy);
        Context context = viewGroup.getContext();
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = c0fk0;
        this.LJ = context;
        this.LJFF = c388200FJy.LJ;
        this.LJI = c388200FJy.LJFF;
        this.LJII = c388200FJy.LIZLLL;
        this.LJIIIIZZ = (AbstractC388140FJs) LJII(C13LE.LIZ(AbstractC388140FJs.class));
        this.LJIIJ = C1633850scR.LIZ(C0CHQ.LIZ, null);
        this.LJIIJJI = true;
        this.LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1324));
        if (LJIIL()) {
            C201955140j.LIZJ(C1465490oEt.LIZIZ, "TextEditFontListAbility -> getFontSelectLayout() -> needForceUseTextFontPanel");
            C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI("textfont");
            List<TextFontStyleData> listLJIILJJIL = LJIILJJIL(c0fi2LJIJJLI.LJIJ());
            LJIIJ().LJ(LJIILJJIL(listLJIILJJIL));
            if (((ArrayList) listLJIILJJIL).isEmpty()) {
                c0fi2LJIJJLI.LJIIIIZZ = new C0FIB() { // from class: X.0FIO
                    @Override // X.C0FIB
                    public final void accept(Object obj) {
                        C0CNO.LIZLLL(0L, new AwS406S0200000_5(this.LIZ, (C0FII) obj, (List<TextFontStyleData>) 143));
                    }
                };
            }
            C0FI2.LJIJJ().LJJIL(context, Boolean.valueOf(!C298130BmN.LIZ()));
            c387890FItLJIIJ = LJIIJ();
        } else {
            List<TextFontStyleData> listLJIILJJIL2 = LJIILJJIL(C0FI2.LJIJJ().LJIJ());
            LJIIJ().LIZLLL(listLJIILJJIL2);
            if (((ArrayList) listLJIILJJIL2).isEmpty()) {
                C0FI2.LJIJJ().LJIIIIZZ = new C0FIB() { // from class: X.0FIP
                    @Override // X.C0FIB
                    public final void accept(Object obj) {
                        C0CNO.LIZLLL(0L, new AwS406S0200000_5(this.LIZ, (C0FII) obj, (List<TextFontStyleData>) 144));
                    }
                };
            }
            c387890FItLJIIJ = LJIIJ();
        }
        viewGroup.addView(c387890FItLJIIJ);
        LJIIJ().setClickFontStyleListener(new InterfaceC387930FIx() { // from class: X.0FAV
            @Override // X.InterfaceC387930FIx
            public final void LIZ(TextFontStyleData textFontStyleData) {
                if (textFontStyleData == null) {
                    return;
                }
                C0FI2.LJIJJ().LJJJIL(2, textFontStyleData.fileName);
                this.LIZ.LJIILIIL(textFontStyleData, true);
            }
        });
        LJIIJ().setOnFontShowListener(new C0FIT() { // from class: X.0FIQ
            @Override // X.C0FIT
            public final void LIZ(String str, String str2) {
                C0FGR c0fgrLIZJ;
                C0FF8 c0ff8 = this.LIZ.LJI;
                if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                    c0fgrLIZJ.LJIIIZ(str, "trending", str2);
                }
            }
        });
        LJIILL();
        LJIIJJI();
        C196909122h.LIZ().LJI("fallbackfont", true, new IFetchEffectChannelListener() { // from class: X.05iR
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    Effect effect = (Effect) C13LP.LJJJLZIJ(0, effectChannelResponse2.getAllCategoryEffects());
                    if (effect == null) {
                        C391040FUw.LIZ.getClass();
                        C391040FUw.LIZLLL("");
                        C391040FUw.LJ("");
                    } else {
                        C391040FUw c391040FUw = C391040FUw.LIZ;
                        String sdkExtra = effect.getSdkExtra();
                        c391040FUw.getClass();
                        C391040FUw.LIZLLL(sdkExtra);
                        C391040FUw.LJ(effect.getUnzipPath());
                    }
                }
            }
        });
    }

    public final void LJIIIIZZ(final Effect effect, final String str, final String str2, final String str3, final AwS584S0100000_5 awS584S0100000_5) {
        final InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        C0FF8 c0ff8 = this.LJI;
        if (c0ff8 != null) {
            interfaceC388160FJuLJIIJ = c0ff8.LJIIJ();
        } else {
            interfaceC388160FJuLJIIJ = null;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJIIJ.LIZIZ(str, null, new IFetchEffectListener() { // from class: X.0FIZ
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect2) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect2) {
                final InterfaceC388160FJu interfaceC388160FJuLJIIJ2;
                final Effect effect3 = effect2;
                if (effect3 != null) {
                    final C0FII c0fii = this.LIZ;
                    final String str4 = str2;
                    final String str5 = str3;
                    final Function1<C0FMO, Unit> function1 = awS584S0100000_5;
                    InterfaceC388160FJu interfaceC388160FJu = interfaceC388160FJuLJIIJ;
                    long j = jCurrentTimeMillis;
                    String str6 = str;
                    Effect effect4 = effect;
                    if (TextTemplateTools.LJIIJ(effect3)) {
                        c0fii.getClass();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C387740FIe(c0fii, effect3, str4, str5, function1, null), 3);
                    } else {
                        c0fii.getClass();
                        final InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
                        String strLJ = TextTemplateTools.LJ(effect3);
                        if (strLJ.length() == 0) {
                            c0fii.getClass();
                            C0FII.LJIILLIIL(effect3, null, "", str4, str5, function1, "");
                        } else {
                            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(C533090KvT.LIZIZ.LIZIZ());
                            final long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C0FF8 c0ff82 = c0fii.LJI;
                            if (c0ff82 != null) {
                                interfaceC388160FJuLJIIJ2 = c0ff82.LJIIJ();
                            } else {
                                interfaceC388160FJuLJIIJ2 = null;
                            }
                            mapLJIIJ.put("panel", "text_template_typeface");
                            interfaceC1635410sexLIZ.Cg(C1697810uHb.LJ(strLJ), mapLJIIJ, new IFetchEffectListByIdsListener() { // from class: X.0FIj
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    InterfaceC388160FJu interfaceC388160FJu2 = interfaceC388160FJuLJIIJ2;
                                    if (interfaceC388160FJu2 != null) {
                                        interfaceC388160FJu2.LIZ(false, System.currentTimeMillis() - jCurrentTimeMillis2, "", false, str4);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(EffectListResponse effectListResponse) {
                                    List<Effect> data;
                                    final Effect effect5;
                                    EffectListResponse effectListResponse2 = effectListResponse;
                                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect5 = (Effect) C13LP.LJJJLZIJ(0, data)) != null) {
                                        InterfaceC1635410sex interfaceC1635410sex = interfaceC1635410sexLIZ;
                                        final C0FII c0fii2 = c0fii;
                                        final Effect effect6 = effect3;
                                        final String str7 = str4;
                                        final String str8 = str5;
                                        final Function1<C0FMO, Unit> function12 = function1;
                                        final InterfaceC388160FJu interfaceC388160FJu2 = interfaceC388160FJuLJIIJ2;
                                        final long j2 = jCurrentTimeMillis2;
                                        if (interfaceC1635410sex.LJIIIIZZ(effect5)) {
                                            String unzipPath = effect5.getUnzipPath();
                                            c0fii2.getClass();
                                            C0FII.LJIILLIIL(effect6, effect5, unzipPath, str7, str8, function12, "");
                                            if (interfaceC388160FJu2 != null) {
                                                interfaceC388160FJu2.LIZ(true, System.currentTimeMillis() - j2, effect5.getEffectId(), true, str7);
                                                return;
                                            }
                                            return;
                                        }
                                        interfaceC1635410sex.LIZJ(effect5, new IFetchEffectListener() { // from class: X.0FIk
                                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                            public final void onStart(Effect effect7) {
                                            }

                                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                            public final void onSuccess(Effect effect7) {
                                                C0FII c0fii3 = c0fii2;
                                                Effect effect8 = effect6;
                                                Effect effect9 = effect5;
                                                String unzipPath2 = effect9.getUnzipPath();
                                                String str9 = str7;
                                                String str10 = str8;
                                                Function1<C0FMO, Unit> function13 = function12;
                                                c0fii3.getClass();
                                                C0FII.LJIILLIIL(effect8, effect9, unzipPath2, str9, str10, function13, "");
                                                InterfaceC388160FJu interfaceC388160FJu3 = interfaceC388160FJu2;
                                                if (interfaceC388160FJu3 != null) {
                                                    interfaceC388160FJu3.LIZ(true, System.currentTimeMillis() - j2, effect5.getEffectId(), false, str7);
                                                }
                                            }

                                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                            public final void onFail(Effect effect7, ExceptionResult exceptionResult) {
                                                InterfaceC388160FJu interfaceC388160FJu3 = interfaceC388160FJu2;
                                                if (interfaceC388160FJu3 != null) {
                                                    interfaceC388160FJu3.LIZ(false, System.currentTimeMillis() - j2, effect5.getEffectId(), false, str7);
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    }
                    if (interfaceC388160FJu != null) {
                        interfaceC388160FJu.LIZLLL(true, System.currentTimeMillis() - j, str6, str4, TextTemplateTools.LJIIJ(effect4));
                    }
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                InterfaceC388160FJu interfaceC388160FJu = interfaceC388160FJuLJIIJ;
                if (interfaceC388160FJu != null) {
                    interfaceC388160FJu.LIZLLL(false, System.currentTimeMillis() - jCurrentTimeMillis, str, str2, TextTemplateTools.LJIIJ(effect));
                }
            }
        });
    }

    public static void LJIILLIIL(Effect effect, Effect effect2, String str, String str2, String str3, Function1 function1, String str4) {
        if (TextTemplateTools.LJIIJ(effect)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C387700FIa(effect, effect2, str, str4, str2, str3, function1, null), 3);
        } else {
            if (str.length() == 0) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C387710FIb(str, effect, effect2, str2, str3, function1, null), 3);
        }
    }
}
