package X;

import Y.AObserverS209S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361240EEg extends C0FC9<C361340EEq, C361300EEm> {
    public final C19EG LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C01GW LLJJL;
    public final long LLJJLIIIJLLLLLLLZ;
    public C113Z LLJL;
    public C351720Dqc LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public String LLJLLIL;
    public InterfaceC361310EEn LLJLLL;
    public long LLJZ;
    public InterfaceC361290EEl LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public C364270EPx LLLFF;
    public NLETrackSlot LLLFFI;
    public final C01GW LLLFZ;
    public final C361260EEi LLLI;
    public final C361280EEk LLLII;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJLJLL() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361240EEg.LLLLLJLJLL():void");
    }

    public final void LLLLLL() {
        C0E48 c0e48LIZIZ;
        C351720Dqc c351720Dqc;
        NLETrackSlot nLETrackSlotLIZJ;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF1;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E55 player;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEResourceNode effectSDKFilter;
        String resourceId;
        NLEResourceNode effectSDKEffect;
        String resourceId2;
        int i = C359110E6b.LIZ[LLLLILI().LIZ.LIZJ.LIZ.ordinal()];
        if (i == 1) {
            this.LLJLL = false;
            NLETrackSlot nLETrackSlot = this.LLLFFI;
            if (nLETrackSlot == null || !C351220Dpo.LLLLIL(nLETrackSlot)) {
                C355570Dwp c355570Dwp = (C355570Dwp) this.LLL.getValue();
                if (c355570Dwp != null) {
                    c355570Dwp.LIZ(this.LLLFFI, true);
                }
            } else {
                NLETrackSlot nLETrackSlot2 = this.LLLFFI;
                if (nLETrackSlot2 != null && (c351720Dqc = this.LLJLIL) != null) {
                    C0E48 c0e48 = c351720Dqc.LJFF;
                    NLEModel nLEModelLJI = c0e48 != null ? C350870DpF.LJI(c0e48) : c351720Dqc.LIZIZ;
                    if (nLEModelLJI != null && (nLETrackSlotLIZJ = C350700Doy.LIZJ(nLEModelLJI, nLETrackSlot2)) != null) {
                        String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot2);
                        if (strLJIIZILJ == null) {
                            strLJIIZILJ = "";
                        }
                        c351720Dqc.LJ.LJ(new C350650Dot(nLETrackSlotLIZJ, strLJIIZILJ), EnumC356070Dxd.COMMIT);
                        C351510DqH.LIZ.getClass();
                        C351510DqH.LJIIIIZZ(nLEModelLJI);
                        C351510DqH.LJIIJJI(nLEModelLJI, NLETrackType.EFFECT, "");
                        NLEEditor nLEEditorLIZIZ = c351720Dqc.LIZIZ();
                        if (nLEEditorLIZIZ != null) {
                            nLEEditorLIZIZ.commit();
                        }
                        C0E48 c0e482 = c351720Dqc.LJFF;
                        if ((c0e482 != null && (iNLEMediaSessionF1 = c0e482.f1()) != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) || (playerApi = c351720Dqc.LIZLLL) != null) {
                            playerApi.pause();
                        }
                    }
                }
            }
            if (this.LLLFFI != null && (c0e48LIZIZ = LIZIZ()) != null) {
                c0e48LIZIZ.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
            }
            this.LLLFFI = null;
            LLLLIL().LIZLLL.invoke(null);
            return;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        this.LLJLL = false;
        C0E48 c0e48LIZIZ2 = LIZIZ();
        if (c0e48LIZIZ2 != null && (nLETrackSlotLLLLLLIL = c0e48LIZIZ2.LLLLLLIL()) != null) {
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlotLLLLLLIL.getVideoEffects();
            ArrayList arrayList = new ArrayList();
            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                String extra = nLEVideoEffect.getExtra("editor_pro_effect_category");
                if (extra != null && !a0.LJJJIL(extra)) {
                    arrayList.add(nLEVideoEffect);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLESegmentEffect segment = ((NLEVideoEffect) it2.next()).getSegment();
                if (segment != null && (effectSDKEffect = segment.getEffectSDKEffect()) != null && (resourceId2 = effectSDKEffect.getResourceId()) != null) {
                    arrayList2.add(resourceId2);
                }
            }
            VecNLEFilterSPtr filters = nLETrackSlotLLLLLLIL.getFilters();
            ArrayList arrayList3 = new ArrayList();
            for (NLEFilter nLEFilter : filters) {
                String extra2 = nLEFilter.getExtra("editor_pro_effect_category");
                if (extra2 != null && !a0.LJJJIL(extra2)) {
                    arrayList3.add(nLEFilter);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                NLESegmentFilter segment2 = ((NLEFilter) it3.next()).getSegment();
                if (segment2 != null && (effectSDKFilter = segment2.getEffectSDKFilter()) != null && (resourceId = effectSDKFilter.getResourceId()) != null) {
                    arrayList4.add(resourceId);
                }
            }
            for (String str : (ArrayList) C13LP.LJLIL(arrayList4, arrayList2)) {
                C0E48 c0e48LIZIZ3 = LIZIZ();
                if (c0e48LIZIZ3 != null && (interfaceC351350Dq1LLFII = c0e48LIZIZ3.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LLIIJI(nLETrackSlotLLLLLLIL, new C350460Doa(str, "", "", "", -1L, -1L, false, 0, "{}", null, ""), EnumC356070Dxd.COMMIT);
                }
            }
            nLETrackSlotLLLLLLIL.removeExtraWithKey("is_editorpro_effect");
            C0E48 c0e48LIZIZ4 = LIZIZ();
            if (c0e48LIZIZ4 != null && (player = c0e48LIZIZ4.getPlayer()) != null) {
                player.pause(false);
            }
        }
        LLLLIL().LIZLLL.invoke(null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLILLLLZIIL = false;
        C364270EPx c364270EPx = this.LLLFF;
        if (c364270EPx != null) {
            ((EditEffectVideoModel) this.LLLF.getValue()).BQ2().setValue(c364270EPx);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0EEi] */
    public C361240EEg(C19EG c19eg, C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJJIL = c19eg;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 511));
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        this.LLJZ = System.currentTimeMillis();
        this.LLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(148));
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(147));
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 510));
        this.LLLI = new InterfaceC371480EhO() { // from class: X.0EEi
            @Override // X.InterfaceC371480EhO
            public final boolean LIZIZ(Effect effect) {
                String extra;
                String extra2 = effect.getExtra();
                if (extra2 != null && extra2.length() != 0 && (extra = effect.getExtra()) != null && a0.LJJIIZI(extra, "video_anim_type\":", false)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC371480EhO
            public final C370420Efg LIZ(Scene scene, ViewGroup viewGroup, C113G c113g, C113D c113d) {
                return new C370420Efg(scene, viewGroup, c113g, c113d);
            }
        };
        this.LLLII = new C361280EEk(this);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C113Z c113z;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        ViewGroup viewGroup;
        C361260EEi c361260EEi;
        super.onViewCreated(view, bundle);
        this.LLLFF = ((EditEffectVideoModel) this.LLLF.getValue()).BQ2().getValue();
        String str = null;
        this.LLJZIJLIL = (InterfaceC361290EEl) this.LLJJJJLIIL.LJIIL(null, InterfaceC361290EEl.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C361250EEh(this, null), 3);
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        if (videoPublishEditModelLLLLLJIL != null) {
            Scene scene = this;
            while (true) {
                if (scene instanceof C372480Ej0) {
                    break;
                }
                scene = scene.mParentScene;
                if (scene == null) {
                    scene = this;
                    break;
                }
            }
            Context contextRequireSceneContext = requireSceneContext();
            C113G c113g = LLLLILI().LIZ.LIZ;
            C361280EEk c361280EEk = this.LLLII;
            InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
            if (((Boolean) this.LLLFZ.getValue()).booleanValue()) {
                c361260EEi = this.LLLI;
            } else {
                c361260EEi = null;
            }
            c113z = new C113Z(videoPublishEditModelLLLLLJIL, scene, contextRequireSceneContext, null, c113g, c361280EEk, null, accountService, true, c361260EEi);
        } else {
            c113z = null;
        }
        this.LLJL = c113z;
        if (c113z != null && (view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(c113z);
        }
        this.LLJZ = System.currentTimeMillis();
        if (LLLLILI().LIZ.LIZJ.LIZ == EnumC359100E6a.GLOBAL_EFFECT && LLLLILI().LIZ.LIZJ.LIZIZ == EnumC356350Dy5.REPLACE) {
            C0E48 c0e48LIZIZ = LIZIZ();
            if (c0e48LIZIZ != null) {
                nLETrackSlotLLLLLLIL = c0e48LIZIZ.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            this.LLLFFI = nLETrackSlotLLLLLLIL;
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, new AObserverS209S0100000_5(this, 60));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EEr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 419));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EEs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJIIJ;
            }
        }, new AwS584S0100000_5(this, 420));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EEt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 421));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EEu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJII;
            }
        }, new AwS584S0100000_5(this, 422));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EEp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJIIIIZZ;
            }
        }, new AwS584S0100000_5(this, 417));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EEo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C361340EEq) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 418));
        C0E48 c0e48LIZIZ2 = LIZIZ();
        if (c0e48LIZIZ2 != null && C350660Dou.LIZIZ(C350870DpF.LJI(c0e48LIZIZ2))) {
            EditModelProvider.Companion.getClass();
            if (C0E1T.LIZ().getVideoAnimController$tools_camera_edit_release() == null) {
                str = null;
                C0E1T.LIZ().setVideoAnimController$tools_camera_edit_release(new C351720Dqc(this.LLJJJJJIL, null, null, null, new C351140Dpg(c0e48LIZIZ2), c0e48LIZIZ2, true));
            }
            this.LLJLIL = C0E1T.LIZ().getVideoAnimController$tools_camera_edit_release();
        }
        if (((Boolean) this.LLLFZ.getValue()).booleanValue()) {
            this.LLJLLL = (InterfaceC361310EEn) this.LLJJJJLIIL.LJIIL(str, InterfaceC361310EEn.class);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, LLLLILI().LIZ.LJFF));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        frameLayout.setBackground(c384050F3z.LIZ(requireSceneContext()));
        return frameLayout;
    }
}
