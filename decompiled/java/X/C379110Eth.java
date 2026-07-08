package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379110Eth extends AbstractC2255721DQs<InterfaceC379300Eu0> implements InterfaceC379300Eu0, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C376260Ep6 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379160Etm.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379250Etv.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379270Etx.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379180Eto.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379060Etc.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376280Ep8.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379280Ety.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);
    public boolean LLJILJILJ;

    public InterfaceC379300Eu0 W1() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C379110Eth.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C379110Eth.class, "rootApi", "getRootApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelRootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C379110Eth.class, "modelSelectApi", "getModelSelectApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/modelselect/EPAIGCModelSelectApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C379110Eth.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/topbar/EPAICreateTopBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C379110Eth.class, "configApi", "getConfigApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/configurations/EPAIGCConfigurationApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C379110Eth.class, "editTextApi", "getEditTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C379110Eth.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/preview/EPAIGCPreviewApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C379110Eth.class, "styleSelectApi", "getStyleSelectApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/styleselect/EPAIGCStyleSelectApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C379110Eth.class, "promptRephraserApi", "getPromptRephraserApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/promptrephraser/EPAICreatePromptRephraserApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C379110Eth.class, "editorProAIGCResultsPanelApi", "getEditorProAIGCResultsPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
        LLJJ = 8;
    }

    private final void B3() {
        LifecycleCoroutineScope lifecycleScope;
        Scene scene = this.LL.mParentScene;
        if (scene == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(scene)) == null) {
            O3(null);
        } else {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C379150Etl(this, null), 3);
        }
    }

    private final C379120Eti G2() {
        return (C379120Eti) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    private final InterfaceC379280Ety T2() {
        return (InterfaceC379280Ety) this.LLJIJIL.getValue(this, LLJILLL[8]);
    }

    private final InterfaceC379160Etm W2() {
        return (InterfaceC379160Etm) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    private final InterfaceC379180Eto X1() {
        return (InterfaceC379180Eto) this.LLIZ.getValue(this, LLJILLL[4]);
    }

    private final InterfaceC379090Etf Z1() {
        return (InterfaceC379090Etf) this.LLIZLLLIL.getValue(this, LLJILLL[5]);
    }

    private final InterfaceC376280Ep8 c3() {
        return (InterfaceC376280Ep8) this.LLJI.getValue(this, LLJILLL[7]);
    }

    private final InterfaceC379270Etx i3() {
        return (InterfaceC379270Etx) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    private final InterfaceC377410Eqx o2() {
        return (InterfaceC377410Eqx) this.LLJILJIL.getValue(this, LLJILLL[9]);
    }

    private final InterfaceC379250Etv w2() {
        return (InterfaceC379250Etv) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    public final InterfaceC379060Etc H2() {
        return (InterfaceC379060Etc) this.LLJ.getValue(this, LLJILLL[6]);
    }

    @Override // X.InterfaceC379300Eu0
    public void a7() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        v3();
        q3();
        m3();
        E3();
    }

    private final void E3() {
        i3().zU0(null);
        i3().Vc1(true);
        i3().Fm2(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3() {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379110Eth.m3():void");
    }

    private final void q3() {
        Object next;
        String str = G2().LJII().LIZIZ;
        if (str == null) {
            return;
        }
        Iterator it2 = C379350Eu5.LIZ(this.LL.requireSceneContext()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(((C379430EuD) next).LIZIZ, str)) {
                    break;
                }
            }
        }
        C379430EuD c379430EuD = (C379430EuD) next;
        if (c379430EuD != null) {
            T2().cX0(c379430EuD);
        }
    }

    private final void v3() {
        C0EEF c0eef;
        if (c3().IR1() != null) {
            return;
        }
        C379130Etj c379130EtjLJII = G2().LJII();
        StylePrompt stylePrompt = c379130EtjLJII.LJIIL;
        if (stylePrompt != null) {
            String str = c379130EtjLJII.LJIILIIL;
            if (str == null) {
                str = "";
            }
            String str2 = c379130EtjLJII.LJIILJJIL;
            if (str2 == null) {
                str2 = "";
            }
            c0eef = new C0EEF(stylePrompt, str, str2, c379130EtjLJII.LJIILL);
        } else {
            c0eef = new C0EEF(new StylePrompt("", ""), "", "", null);
        }
        c3().tK(c0eef);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void O3(List<C379170Etn> list) {
        String str;
        String str2;
        String str3;
        StylePrompt stylePrompt;
        String str4;
        String str5;
        Integer num;
        EnumC378720Et4 enumC378720Et4N7 = i3().N7();
        C0EEF c0eefIR1 = c3().IR1();
        C379430EuD c379430EuDH92 = T2().H92();
        Pair<String, String> pairQM2 = X1().qM2();
        String first = pairQM2.getFirst();
        String second = pairQM2.getSecond();
        Pair<String, Boolean> pairDW = W2().DW();
        String first2 = pairDW.getFirst();
        boolean zBooleanValue = pairDW.getSecond().booleanValue();
        C379140Etk c379140Etk = C379140Etk.LIZ;
        String strName = enumC378720Et4N7.name();
        C380190EvR c380190EvRNN2 = w2().NN2(EnumC378720Et4.TEXT_TO_IMAGE_CREATION);
        if (c380190EvRNN2 != null) {
            str = c380190EvRNN2.LIZJ;
        } else {
            str = null;
        }
        C380190EvR c380190EvRNN22 = w2().NN2(EnumC378720Et4.TEXT_TO_VIDEO_CREATION);
        if (c380190EvRNN22 != null) {
            str2 = c380190EvRNN22.LIZJ;
        } else {
            str2 = null;
        }
        if (c379430EuDH92 != null) {
            str3 = c379430EuDH92.LIZIZ;
        } else {
            str3 = null;
        }
        int iB40 = X1().B40();
        String promptText = Z1().getPromptText();
        if (c0eefIR1 != null) {
            stylePrompt = c0eefIR1.LIZ;
            str4 = c0eefIR1.LIZIZ;
            str5 = c0eefIR1.LIZJ;
            num = c0eefIR1.LIZLLL;
        } else {
            stylePrompt = null;
            str4 = null;
            str5 = null;
            num = null;
        }
        Integer numValueOf = Integer.valueOf(X1().WO0());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (first2.length() <= 0) {
            first2 = null;
        }
        String str6 = str3;
        C379130Etj c379130Etj = new C379130Etj(strName, str6, Integer.valueOf(iB40), str2, str, (Integer) null, first, (Integer) null, second, promptText, (String) null, stylePrompt, str4, str5, num, (Integer) null, numValueOf, list, first2, Boolean.valueOf(zBooleanValue), (Boolean) null, 2165408);
        c379140Etk.getClass();
        String str7 = c379130Etj.LIZ;
        if (str7 != null) {
            Keva kevaLIZLLL = C379140Etk.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ep_ai_create_panel_ui_type_");
            sbLIZ.append(C379140Etk.LIZJ());
            kevaLIZLLL.storeString(C2188811AlT.LIZIZ(sbLIZ), str7);
        } else {
            Keva kevaLIZLLL2 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ep_ai_create_panel_ui_type_");
            sbLIZ2.append(C379140Etk.LIZJ());
            kevaLIZLLL2.erase(C2188811AlT.LIZIZ(sbLIZ2));
        }
        String str8 = c379130Etj.LIZIZ;
        if (str8 != null) {
            Keva kevaLIZLLL3 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ep_ai_create_model_prompt_rephraser_key_");
            sbLIZ3.append(C379140Etk.LIZJ());
            kevaLIZLLL3.storeString(C2188811AlT.LIZIZ(sbLIZ3), str8);
        } else {
            Keva kevaLIZLLL4 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ep_ai_create_model_prompt_rephraser_key_");
            sbLIZ4.append(C379140Etk.LIZJ());
            kevaLIZLLL4.erase(C2188811AlT.LIZIZ(sbLIZ4));
        }
        Integer num2 = c379130Etj.LIZJ;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            Keva kevaLIZLLL5 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("ep_ai_create_model_prompt_source_");
            sbLIZ5.append(C379140Etk.LIZJ());
            kevaLIZLLL5.storeInt(C2188811AlT.LIZIZ(sbLIZ5), iIntValue);
        } else {
            Keva kevaLIZLLL6 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("ep_ai_create_model_prompt_source_");
            sbLIZ6.append(C379140Etk.LIZJ());
            kevaLIZLLL6.erase(C2188811AlT.LIZIZ(sbLIZ6));
        }
        String str9 = c379130Etj.LJIIJ;
        if (str9 != null) {
            Keva kevaLIZLLL7 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("ep_ai_create_last_prompt_state_");
            sbLIZ7.append(C379140Etk.LIZJ());
            kevaLIZLLL7.storeString(C2188811AlT.LIZIZ(sbLIZ7), str9);
        } else {
            Keva kevaLIZLLL8 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("ep_ai_create_last_prompt_state_");
            sbLIZ8.append(C379140Etk.LIZJ());
            kevaLIZLLL8.erase(C2188811AlT.LIZIZ(sbLIZ8));
        }
        String str10 = c379130Etj.LIZLLL;
        if (str10 != null) {
            Keva kevaLIZLLL9 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("ep_ai_create_model_req_key_video_");
            sbLIZ9.append(C379140Etk.LIZJ());
            kevaLIZLLL9.storeString(C2188811AlT.LIZIZ(sbLIZ9), str10);
        } else {
            Keva kevaLIZLLL10 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("ep_ai_create_model_req_key_video_");
            sbLIZ10.append(C379140Etk.LIZJ());
            kevaLIZLLL10.erase(C2188811AlT.LIZIZ(sbLIZ10));
        }
        String str11 = c379130Etj.LJ;
        if (str11 != null) {
            Keva kevaLIZLLL11 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("ep_ai_create_model_req_key_image_");
            sbLIZ11.append(C379140Etk.LIZJ());
            kevaLIZLLL11.storeString(C2188811AlT.LIZIZ(sbLIZ11), str11);
        } else {
            Keva kevaLIZLLL12 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("ep_ai_create_model_req_key_image_");
            sbLIZ12.append(C379140Etk.LIZJ());
            kevaLIZLLL12.erase(C2188811AlT.LIZIZ(sbLIZ12));
        }
        Integer num3 = c379130Etj.LJFF;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            Keva kevaLIZLLL13 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("ep_ai_create_aspect_ratio_state_image_");
            sbLIZ13.append(C379140Etk.LIZJ());
            kevaLIZLLL13.storeInt(C2188811AlT.LIZIZ(sbLIZ13), iIntValue2);
        } else {
            Keva kevaLIZLLL14 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("ep_ai_create_aspect_ratio_state_image_");
            sbLIZ14.append(C379140Etk.LIZJ());
            kevaLIZLLL14.erase(C2188811AlT.LIZIZ(sbLIZ14));
        }
        String str12 = c379130Etj.LJI;
        if (str12 != null) {
            Keva kevaLIZLLL15 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("ep_ai_create_aspect_ratio_value_image_");
            sbLIZ15.append(C379140Etk.LIZJ());
            kevaLIZLLL15.storeString(C2188811AlT.LIZIZ(sbLIZ15), str12);
        } else {
            Keva kevaLIZLLL16 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("ep_ai_create_aspect_ratio_value_image_");
            sbLIZ16.append(C379140Etk.LIZJ());
            kevaLIZLLL16.erase(C2188811AlT.LIZIZ(sbLIZ16));
        }
        Integer num4 = c379130Etj.LJII;
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            Keva kevaLIZLLL17 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("ep_ai_create_aspect_ratio_state_video_");
            sbLIZ17.append(C379140Etk.LIZJ());
            kevaLIZLLL17.storeInt(C2188811AlT.LIZIZ(sbLIZ17), iIntValue3);
        } else {
            Keva kevaLIZLLL18 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("ep_ai_create_aspect_ratio_state_video_");
            sbLIZ18.append(C379140Etk.LIZJ());
            kevaLIZLLL18.erase(C2188811AlT.LIZIZ(sbLIZ18));
        }
        String str13 = c379130Etj.LJIIIIZZ;
        if (str13 != null) {
            Keva kevaLIZLLL19 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append("ep_ai_create_aspect_ratio_value_video_");
            sbLIZ19.append(C379140Etk.LIZJ());
            kevaLIZLLL19.storeString(C2188811AlT.LIZIZ(sbLIZ19), str13);
        } else {
            Keva kevaLIZLLL20 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append("ep_ai_create_aspect_ratio_value_video_");
            sbLIZ20.append(C379140Etk.LIZJ());
            kevaLIZLLL20.erase(C2188811AlT.LIZIZ(sbLIZ20));
        }
        StylePrompt stylePrompt2 = c379130Etj.LJIIL;
        if (stylePrompt2 != null) {
            Keva kevaLIZLLL21 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("ep_ai_create_style_prompt_state_");
            sbLIZ21.append(C379140Etk.LIZJ());
            kevaLIZLLL21.storeString(C2188811AlT.LIZIZ(sbLIZ21), stylePrompt2.defaultPrompt);
            Keva kevaLIZLLL22 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("ep_ai_create_style_prompt_state_i2i_");
            sbLIZ22.append(C379140Etk.LIZJ());
            kevaLIZLLL22.storeString(C2188811AlT.LIZIZ(sbLIZ22), stylePrompt2.i2iPrompt);
        } else {
            Keva kevaLIZLLL23 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
            sbLIZ23.append("ep_ai_create_style_prompt_state_");
            sbLIZ23.append(C379140Etk.LIZJ());
            kevaLIZLLL23.erase(C2188811AlT.LIZIZ(sbLIZ23));
            Keva kevaLIZLLL24 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ24 = C2188811AlT.LIZ();
            sbLIZ24.append("ep_ai_create_style_prompt_state_i2i_");
            sbLIZ24.append(C379140Etk.LIZJ());
            kevaLIZLLL24.erase(C2188811AlT.LIZIZ(sbLIZ24));
        }
        String str14 = c379130Etj.LJIILIIL;
        if (str14 != null) {
            Keva kevaLIZLLL25 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ25 = C2188811AlT.LIZ();
            sbLIZ25.append("ep_ai_create_style_effect_id_state_");
            sbLIZ25.append(C379140Etk.LIZJ());
            kevaLIZLLL25.storeString(C2188811AlT.LIZIZ(sbLIZ25), str14);
        } else {
            Keva kevaLIZLLL26 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ26 = C2188811AlT.LIZ();
            sbLIZ26.append("ep_ai_create_style_effect_id_state_");
            sbLIZ26.append(C379140Etk.LIZJ());
            kevaLIZLLL26.erase(C2188811AlT.LIZIZ(sbLIZ26));
        }
        String str15 = c379130Etj.LJIILJJIL;
        if (str15 != null) {
            Keva kevaLIZLLL27 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ27 = C2188811AlT.LIZ();
            sbLIZ27.append("ep_ai_create_style_name_state_");
            sbLIZ27.append(C379140Etk.LIZJ());
            kevaLIZLLL27.storeString(C2188811AlT.LIZIZ(sbLIZ27), str15);
        } else {
            Keva kevaLIZLLL28 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ28 = C2188811AlT.LIZ();
            sbLIZ28.append("ep_ai_create_style_name_state_");
            sbLIZ28.append(C379140Etk.LIZJ());
            kevaLIZLLL28.erase(C2188811AlT.LIZIZ(sbLIZ28));
        }
        Integer num5 = c379130Etj.LJIILL;
        if (num5 != null) {
            int iIntValue4 = num5.intValue();
            Keva kevaLIZLLL29 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ29 = C2188811AlT.LIZ();
            sbLIZ29.append("ep_ai_create_style_position_state_");
            sbLIZ29.append(C379140Etk.LIZJ());
            kevaLIZLLL29.storeInt(C2188811AlT.LIZIZ(sbLIZ29), iIntValue4);
        } else {
            Keva kevaLIZLLL30 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ30 = C2188811AlT.LIZ();
            sbLIZ30.append("ep_ai_create_style_position_state_");
            sbLIZ30.append(C379140Etk.LIZJ());
            kevaLIZLLL30.erase(C2188811AlT.LIZIZ(sbLIZ30));
        }
        Integer num6 = c379130Etj.LJIILLIIL;
        if (num6 != null) {
            int iIntValue5 = num6.intValue();
            Keva kevaLIZLLL31 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ31 = C2188811AlT.LIZ();
            sbLIZ31.append("ep_ai_create_duration_state_");
            sbLIZ31.append(C379140Etk.LIZJ());
            kevaLIZLLL31.storeInt(C2188811AlT.LIZIZ(sbLIZ31), iIntValue5);
        } else {
            Keva kevaLIZLLL32 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ32 = C2188811AlT.LIZ();
            sbLIZ32.append("ep_ai_create_duration_state_");
            sbLIZ32.append(C379140Etk.LIZJ());
            kevaLIZLLL32.erase(C2188811AlT.LIZIZ(sbLIZ32));
        }
        Integer num7 = c379130Etj.LJIIZILJ;
        if (num7 != null) {
            int iIntValue6 = num7.intValue();
            Keva kevaLIZLLL33 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ33 = C2188811AlT.LIZ();
            sbLIZ33.append("ep_ai_create_duration_value_");
            sbLIZ33.append(C379140Etk.LIZJ());
            kevaLIZLLL33.storeInt(C2188811AlT.LIZIZ(sbLIZ33), iIntValue6);
        } else {
            Keva kevaLIZLLL34 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ34 = C2188811AlT.LIZ();
            sbLIZ34.append("ep_ai_create_duration_value_");
            sbLIZ34.append(C379140Etk.LIZJ());
            kevaLIZLLL34.erase(C2188811AlT.LIZIZ(sbLIZ34));
        }
        List<C379170Etn> list2 = c379130Etj.LJIJ;
        if (list2 != null) {
            Keva kevaLIZLLL35 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ35 = C2188811AlT.LIZ();
            sbLIZ35.append("ep_ai_create_selected_image_state_");
            sbLIZ35.append(C379140Etk.LIZJ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ35);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C379170Etn> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            kevaLIZLLL35.storeStringArray(strLIZIZ, (String[]) arrayList.toArray(new String[0]));
            C379140Etk.LIZ.getClass();
            Keva kevaLIZLLL36 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ36 = C2188811AlT.LIZ();
            sbLIZ36.append("ep_ai_create_selected_media_type_state_");
            sbLIZ36.append(C379140Etk.LIZJ());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ36);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C379170Etn> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ.name());
            }
            kevaLIZLLL36.storeStringArray(strLIZIZ2, (String[]) arrayList2.toArray(new String[0]));
        } else {
            Keva kevaLIZLLL37 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ37 = C2188811AlT.LIZ();
            sbLIZ37.append("ep_ai_create_selected_image_state_");
            sbLIZ37.append(C379140Etk.LIZJ());
            kevaLIZLLL37.erase(C2188811AlT.LIZIZ(sbLIZ37));
            Keva kevaLIZLLL38 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ38 = C2188811AlT.LIZ();
            sbLIZ38.append("ep_ai_create_selected_media_type_state_");
            sbLIZ38.append(C379140Etk.LIZJ());
            kevaLIZLLL38.erase(C2188811AlT.LIZIZ(sbLIZ38));
        }
        String str16 = c379130Etj.LJIJI;
        if (str16 != null) {
            C379140Etk.LIZ.getClass();
            Keva kevaLIZLLL39 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ39 = C2188811AlT.LIZ();
            sbLIZ39.append("ep_ai_create_selected_image_source_");
            sbLIZ39.append(C379140Etk.LIZJ());
            kevaLIZLLL39.storeString(C2188811AlT.LIZIZ(sbLIZ39), str16);
        } else {
            Keva kevaLIZLLL40 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ40 = C2188811AlT.LIZ();
            sbLIZ40.append("ep_ai_create_selected_image_source_");
            sbLIZ40.append(C379140Etk.LIZJ());
            kevaLIZLLL40.erase(C2188811AlT.LIZIZ(sbLIZ40));
        }
        Boolean bool = c379130Etj.LJIJJ;
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            C379140Etk.LIZ.getClass();
            Keva kevaLIZLLL41 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ41 = C2188811AlT.LIZ();
            sbLIZ41.append("ep_ai_create_selected_image_ai_");
            sbLIZ41.append(C379140Etk.LIZJ());
            kevaLIZLLL41.storeInt(C2188811AlT.LIZIZ(sbLIZ41), zBooleanValue2 ? 1 : 0);
        } else {
            Keva kevaLIZLLL42 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ42 = C2188811AlT.LIZ();
            sbLIZ42.append("ep_ai_create_selected_image_ai_");
            sbLIZ42.append(C379140Etk.LIZJ());
            kevaLIZLLL42.erase(C2188811AlT.LIZIZ(sbLIZ42));
        }
        Boolean bool2 = c379130Etj.LJIJJLI;
        if (bool2 != null) {
            boolean zBooleanValue3 = bool2.booleanValue();
            C379140Etk.LIZ.getClass();
            Keva kevaLIZLLL43 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ43 = C2188811AlT.LIZ();
            sbLIZ43.append("ep_ai_create_selected_image_magic_");
            sbLIZ43.append(C379140Etk.LIZJ());
            kevaLIZLLL43.storeInt(C2188811AlT.LIZIZ(sbLIZ43), zBooleanValue3 ? 1 : 0);
        } else {
            Keva kevaLIZLLL44 = C379140Etk.LIZLLL();
            StringBuilder sbLIZ44 = C2188811AlT.LIZ();
            sbLIZ44.append("ep_ai_create_selected_image_magic_");
            sbLIZ44.append(C379140Etk.LIZJ());
            kevaLIZLLL44.erase(C2188811AlT.LIZIZ(sbLIZ44));
        }
        if (W2().IR()) {
            C379140Etk.LIZ.getClass();
            C379140Etk.LIZ();
        }
    }

    @Override // X.InterfaceC379300Eu0
    public void Z0(EnumC379210Etr enumC379210Etr) {
        if (W2().sz1()) {
            return;
        }
        int i = C379200Etq.LIZIZ[enumC379210Etr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                B3();
                return;
            }
            throw new C1954807lC();
        }
        List<C379170Etn> list = G2().LLJJJIL.LJIJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C379170Etn> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            H2().Bb1(arrayList);
        }
        C379140Etk.LIZ.getClass();
        C379140Etk.LIZ();
        B3();
    }

    public C379110Eth(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        this.LL = c376260Ep6;
        this.LLILLJJLI = c1drg;
    }

    private final C380190EvR H3(List<C380190EvR> list, boolean z, String str) {
        EnumC378720Et4 enumC378720Et4;
        ArrayList arrayList = new ArrayList();
        for (C380190EvR c380190EvR : list) {
            if (c380190EvR.LJI == z) {
                arrayList.add(c380190EvR);
            }
        }
        Object obj = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (str != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((C380190EvR) next).LIZJ, str)) {
                    obj = next;
                    break;
                }
            }
            C380190EvR c380190EvR2 = (C380190EvR) obj;
            if (c380190EvR2 != null) {
                return c380190EvR2;
            }
        }
        if (z) {
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
        } else {
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
        }
        C369780Eee.LIZ.getClass();
        C380190EvR c380190EvRLIZJ = C369780Eee.LIZJ(enumC378720Et4, list);
        if (c380190EvRLIZJ == null) {
            return (C380190EvR) C13LP.LJJJLL(arrayList);
        }
        return c380190EvRLIZJ;
    }
}
