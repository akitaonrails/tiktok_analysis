package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361280EEk implements C113D {
    public boolean LIZ;
    public final /* synthetic */ C361240EEg LIZIZ;

    @Override // X.C113D
    public final void LIZ() {
    }

    @Override // X.C113D
    public final boolean LJ(int i) {
        return true;
    }

    @Override // X.C113D
    public final boolean LJII(int i, int i2) {
        return true;
    }

    @Override // X.C113D
    public final void LJIILJJIL(EffectModel effectModel) {
    }

    @Override // X.C113D
    public final boolean LJIILL(EffectModel effectModel) {
        return true;
    }

    @Override // X.C113D
    public final void LJIJJLI(String str, List<? extends EffectPointModel> list) {
    }

    @Override // X.C113D
    public final void LJIL(int i, EffectModel effectModel) {
    }

    @Override // X.C113D
    public final boolean LJJ(EffectModel effectModel) {
        return true;
    }

    @Override // X.C113D
    public final void LIZIZ() {
        C0E55 player;
        C0E48 c0e48LIZIZ = this.LIZIZ.LIZIZ();
        boolean z = false;
        if (c0e48LIZIZ != null && (player = c0e48LIZIZ.getPlayer()) != null) {
            player.pause(false);
        }
        this.LIZIZ.LLLLLJLJLL();
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        if (videoPublishEditModelLLLLLJIL != null) {
            C355570Dwp c355570Dwp = (C355570Dwp) this.LIZIZ.LLL.getValue();
            if (c355570Dwp != null && !c355570Dwp.LIZJ) {
                z = true;
            }
            C361680EFy.LJJIJ(videoPublishEditModelLLLLLJIL, "effect", true, z);
        }
    }

    @Override // X.C113D
    public final boolean LJFF() {
        InterfaceC361310EEn interfaceC361310EEn;
        InterfaceC361310EEn interfaceC361310EEn2;
        this.LIZIZ.LLLLLJLJLL();
        InterfaceC361310EEn interfaceC361310EEn3 = this.LIZIZ.LLJLLL;
        if ((interfaceC361310EEn3 == null || !interfaceC361310EEn3.L5()) && (interfaceC361310EEn = this.LIZIZ.LLJLLL) != null && interfaceC361310EEn.mo24if() && (interfaceC361310EEn2 = this.LIZIZ.LLJLLL) != null) {
            interfaceC361310EEn2.ir1();
        }
        return true;
    }

    @Override // X.C113D
    public final void LJIIIIZZ() {
        this.LIZIZ.LLLLIL().LIZJ.invoke();
    }

    @Override // X.C113D
    public final void LJIIIZ() {
        C0E48 c0e48LIZIZ = this.LIZIZ.LIZIZ();
        if (c0e48LIZIZ != null) {
            c0e48LIZIZ.S7().LIZIZ(Unit.LIZ, "editing_effect_panel_unselect_effect_event", false);
        }
    }

    @Override // X.C113D
    public final boolean LJIIL() {
        return !Intrinsics.LJFF(this.LIZIZ.LLLLILI().LIZ.LJIIIZ, Boolean.TRUE);
    }

    @Override // X.C113D
    public final void LJIILLIIL() {
        this.LIZIZ.LLLLLL();
        C0E48 c0e48LIZIZ = this.LIZIZ.LIZIZ();
        if (c0e48LIZIZ != null) {
            c0e48LIZIZ.S7().LIZIZ(Unit.LIZ, "editing_effect_panel_unselect_effect_event", false);
        }
    }

    public C361280EEk(C361240EEg c361240EEg) {
        this.LIZIZ = c361240EEg;
    }

    @Override // X.C113D
    public final boolean LIZJ(EffectModel effectModel) {
        this.LIZIZ.LLLLLL();
        return true;
    }

    @Override // X.C113D
    public final void LJIIJJI(String str) {
        this.LIZIZ.LLJLLIL = str;
    }

    @Override // X.C113D
    public final void LJIIZILJ(EffectModel effectModel) {
        this.LIZIZ.LLLLIL().LIZLLL.invoke(effectModel.key);
        C0E48 c0e48LIZIZ = this.LIZIZ.LIZIZ();
        if (c0e48LIZIZ != null) {
            C350870DpF.LJIIIZ(c0e48LIZIZ, "editing_effect_panel_select_effect_event", new C361410EEx(effectModel.designerId, effectModel.designerEncryptedId, effectModel.source));
        }
    }

    @Override // X.C113D
    public final boolean LJIJ(String str) {
        if (this.LIZIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && Intrinsics.LJFF(this.LIZIZ.LLJLLIL, str)) {
            return true;
        }
        return false;
    }

    @Override // X.C113D
    public final void LJIJJ(C364270EPx c364270EPx) {
        if (C113I.LJFF(c364270EPx.LIZIZ)) {
            C0E12 c0e12 = C363750ENx.LIZ;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            C0E12 c0e122 = C363750ENx.LIZ;
            c0e122.getClass();
            c0e122.LIZ.storeString("time_open_animation_tab", strValueOf);
            if (C351230Dpp.LJ(null)) {
                C0EFE c0efe = C0EFE.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
                C0E48 c0e48LIZIZ = this.LIZIZ.LIZIZ();
                EnumC362430EIv enumC362430EIv = EnumC362430EIv.SHOW;
                c0efe.getClass();
                C0EFE.LIZ(videoPublishEditModelLLLLLJIL, c0e48LIZIZ, enumC362430EIv);
                return;
            }
            return;
        }
        InterfaceC361310EEn interfaceC361310EEn = this.LIZIZ.LLJLLL;
        if (interfaceC361310EEn == null) {
            return;
        }
        interfaceC361310EEn.fn1(false);
    }

    @Override // X.C113D
    public final void LJI(int i, EffectModel effectModel) {
        boolean z;
        boolean z2;
        NLETrack nLETrackPt;
        String strLJFF = effectModel.category;
        String str = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        C366400EYc.LIZ.getClass();
        if (C366400EYc.LIZJ(strLJFF)) {
            C1413450msx.LIZ.getClass();
            strLJFF = C1413450msx.LJFF(strLJFF);
        } else if (C113I.LJFF(strLJFF)) {
            C1413450msx c1413450msx = C1413450msx.LIZ;
            String str2 = effectModel.videoAnimType;
            if (str2 != null) {
                str = str2;
            }
            c1413450msx.getClass();
            strLJFF = C1413450msx.LJFF(str);
        }
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        if (videoPublishEditModelLLLLLJIL != null) {
            C361240EEg c361240EEg = this.LIZIZ;
            C1413450msx c1413450msx2 = C1413450msx.LIZ;
            String str3 = effectModel.key;
            C355570Dwp c355570Dwp = (C355570Dwp) c361240EEg.LLL.getValue();
            if (c355570Dwp != null && !c355570Dwp.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf = Integer.valueOf(effectModel.source);
            String str4 = effectModel.designerId;
            String str5 = c361240EEg.LLLLILI().LIZ.LIZIZ;
            String str6 = effectModel.recommendReason;
            String str7 = effectModel.recommendRuleTags;
            C1413460msy c1413460msy = new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel));
            C0E48 c0e48LIZIZ = c361240EEg.LIZIZ();
            if (c0e48LIZIZ != null && (nLETrackPt = c0e48LIZIZ.Pt()) != null && nLETrackPt.getMainTrack()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1413450msx.LJIIZILJ(c1413450msx2, videoPublishEditModelLLLLLJIL, str3, strLJFF, i, z, true, null, numValueOf, str4, effectModel, str5, str6, str7, c1413460msy, !z2, 64);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C113D
    public final void LJIILIIL(String str, boolean z) {
        String extra;
        NLESegment mainSegment;
        C0EU6 c0eu6;
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C361240EEg c361240EEg = this.LIZIZ;
        long j = jCurrentTimeMillis - c361240EEg.LLJJLIIIJLLLLLLLZ;
        C0ECU c0ecu = (C0ECU) c361240EEg.LLJJL.getValue();
        if (c0ecu != null && (c0eu6 = c0ecu.LLIZLLLIL) != null) {
            c0eu6.LIZIZ(j);
        }
        if (z) {
            C361240EEg c361240EEg2 = this.LIZIZ;
            String extra2 = null;
            NLETrackSlot nLETrackSlotLLLLLLIL = null;
            extra2 = null;
            if (c361240EEg2.LLLLILI().LIZ.LIZJ.LIZ == EnumC359100E6a.SEGMENT_EFFECT) {
                C0E48 c0e48LIZIZ = c361240EEg2.LIZIZ();
                if (c0e48LIZIZ != null) {
                    nLETrackSlotLLLLLLIL = c0e48LIZIZ.LLLLLLIL();
                }
                Pair pairLIZJ = C356600DyU.LIZJ(nLETrackSlotLLLLLLIL);
                if (pairLIZJ != null) {
                    String str2 = (String) pairLIZJ.getFirst();
                    String str3 = (String) pairLIZJ.getSecond();
                    C113Z c113z = c361240EEg2.LLJL;
                    if (c113z != null) {
                        c113z.u0(str3, false);
                    }
                    if (Intrinsics.LJFF(str3, str)) {
                        C113Z c113z2 = c361240EEg2.LLJL;
                        if (c113z2 != null) {
                            c113z2.B0(str2, str3);
                        }
                        c361240EEg2.LLLLIL().LIZLLL.invoke(str2);
                        return;
                    }
                    return;
                }
                return;
            }
            String str4 = c361240EEg2.LLLLILI().LIZ.LIZJ.LIZJ;
            NLETrackSlot nLETrackSlot = c361240EEg2.LLLFFI;
            if (nLETrackSlot == null || (extra = nLETrackSlot.getExtra("editor_pro_effect_category")) == null || extra.length() == 0) {
                NLETrackSlot nLETrackSlot2 = c361240EEg2.LLLFFI;
                if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null) {
                    extra2 = mainSegment.getExtra("nleExtraEffectCategory");
                }
                extra = extra2;
            }
            if (!C123100dR.LIZ(str4) || !C123100dR.LIZ(extra)) {
                return;
            }
            C113Z c113z3 = c361240EEg2.LLJL;
            if (c113z3 != null) {
                c113z3.u0(extra, false);
            }
            if (!Intrinsics.LJFF(extra, str)) {
                return;
            }
            C113Z c113z4 = c361240EEg2.LLJL;
            if (c113z4 != null) {
                c113z4.B0(str4, extra);
            }
            c361240EEg2.LLLLIL().LIZLLL.invoke(str4);
        }
    }

    @Override // X.C113D
    public final List<EffectModel> LJIJI(int i, String str) {
        return this.LIZIZ.LLLLIL().LJ.invoke(Integer.valueOf(i), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    @Override // X.C113D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.effect.EffectModel r35, int r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361280EEk.LIZLLL(com.ss.android.ugc.aweme.effect.EffectModel, int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.19YA] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // X.C113D
    public final void LJIIJ(EffectModel effectModel, String str, boolean z, EffectSearchModel effectSearchModel) {
        C113Z c113z;
        ?? LJFF;
        String str2;
        String str3;
        NLETrack nLETrackPt;
        Context contextRequireSceneContext = this.LIZIZ.requireSceneContext();
        if (contextRequireSceneContext != null) {
            new C0ZDN(contextRequireSceneContext).LIZ(0);
        }
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        if (videoPublishEditModelLLLLLJIL != null) {
            C361240EEg c361240EEg = this.LIZIZ;
            if (C113I.LIZ(str)) {
                str = "collection";
            }
            C1413450msx c1413450msx = C1413450msx.LIZ;
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLLLLLJIL, c361240EEg.LIZIZ(), new Pair(-1, -1));
            c0labLJFF.LJ("effect_entrance_position", videoPublishEditModelLLLLLJIL.creativeModel.effectEntrancePosition);
            c0labLJFF.LJ("tab_name", str);
            String str4 = "1";
            c0labLJFF.LJ("is_editor_pro", "1");
            if (c361240EEg.LLLLILI().LIZ.LIZJ.LIZ == EnumC359100E6a.SEGMENT_EFFECT) {
                C0E48 c0e48LIZIZ = c361240EEg.LIZIZ();
                if (c0e48LIZIZ != null && (nLETrackPt = c0e48LIZIZ.Pt()) != null && nLETrackPt.getMainTrack()) {
                    str2 = "editor_pro_clip_select";
                } else {
                    str2 = "editor_pro_clip_select_pip";
                }
            } else {
                str2 = "click_ep_effect_panel";
            }
            c0labLJFF.LJ("enter_method", str2);
            c0labLJFF.LJ("enter_from", "editor_pro_page");
            c0labLJFF.LJ("carousel_open", CardStruct.IStatusCode.DEFAULT);
            c1413450msx.getClass();
            c0labLJFF.LJ("prop_id", effectModel.key);
            if (videoPublishEditModelLLLLLJIL.creativeModel.aigcMetadataModel.isAigcEffect) {
                try {
                    JSONObject jSONObject = new JSONObject(videoPublishEditModelLLLLLJIL.creativeModel.aigcMetadataModel.currentEffectSdkExtra);
                    if (jSONObject.optString("AIType").length() > 0) {
                        if (!Intrinsics.LJFF(jSONObject.optString("IsAIGC"), "true")) {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c0labLJFF.LJ("is_ai_prop", str4);
                        c0labLJFF.LJ("ai_prop_type", jSONObject.optString("AIType"));
                        c0labLJFF.LJ("ai_prop_model_name", jSONObject.optString("AIModelName"));
                        c0labLJFF.LJ("sub_ai_prop_type", jSONObject.optString("AIGCSubType"));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c0labLJFF.LJ("editorpro_click_from", videoPublishEditModelLLLLLJIL.getEditorProModel().getClickFrom());
            if (effectSearchModel != null) {
                c0labLJFF.LJ("search_id", effectSearchModel.getSearchId());
                c0labLJFF.LJ("editing_effect_search_from", effectSearchModel.getSearchFrom());
                c0labLJFF.LJ("search_keyword", effectSearchModel.getSearchKeyword());
                c0labLJFF.LJ("search_result_id", effectSearchModel.getSearchResultId());
                c0labLJFF.LJ("search_universal_rank", effectSearchModel.getSearchUniversalRank());
                c0labLJFF.LJ("creator_search_info", effectSearchModel.getCreatorSearchInfo());
            }
            if (z) {
                str3 = "prop_save";
            } else {
                str3 = "prop_cancel_save";
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ(str3, c0labLJFF.LIZ);
        }
        if (z && (c113z = this.LIZIZ.LLJL) != null) {
            C19561611g6 c19561611g6 = c113z.LLJIJIL;
            ?? r3 = c19561611g6;
            if (c19561611g6 == null) {
                r3 = 0;
            }
            InterfaceC361400EEw interfaceC361400EEw = c113z.LLILLL.LJJIL;
            if (interfaceC361400EEw == null) {
                LJFF = 0;
            } else if (interfaceC361400EEw instanceof C364090EPf) {
                LJFF = Intrinsics.LJFF(((C364090EPf) interfaceC361400EEw).LIZJ, EnumC361420EEy.SEARCH_HEAD.getTypeVal());
            } else {
                throw new C1954807lC();
            }
            C12H3 tabAt = r3.getTabAt(LJFF);
            if (tabAt != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tabAt.LJ, "rotation", 0.0f, 14.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tabAt.LJ, "rotation", 14.0f, -10.0f);
                objectAnimatorOfFloat2.setDuration(250L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tabAt.LJ, "rotation", -10.0f, 6.0f);
                objectAnimatorOfFloat3.setDuration(200L);
                objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tabAt.LJ, "rotation", 6.0f, 0.0f);
                objectAnimatorOfFloat4.setDuration(150L);
                objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LIZLLL());
                animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet.start();
            }
        }
    }
}
