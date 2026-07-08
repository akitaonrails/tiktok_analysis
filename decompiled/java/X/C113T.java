package X;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPanelViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.113T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113T extends AnonymousClass1136 {
    public final Scene LLIZLLLIL;
    public final ViewGroup LLJ;
    public final C113G LLJI;
    public final List<Effect> LLJIJIL;
    public final C113D LLJILJIL;
    public final InterfaceC1452170ntP LLJILJILJ;
    public final VideoPublishEditModel LLJILLL;
    public C19YA LLJJ;
    public C0MS4 LLJJI;
    public C113R LLJJIII;
    public final List<EffectCategoryResponse> LLJJIJI;
    public final List<EffectCategoryModel> LLJJIJIIJIL;
    public final EditEffectVideoModel LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // X.AnonymousClass1136
    public final String LIZLLL() {
        return "";
    }

    @Override // X.AnonymousClass1136
    public final int LIZIZ() {
        if (this.LLJJIII instanceof C113Q) {
            return this.LLJIJIL.size();
        }
        int size = ((ArrayList) this.LLJJIJIIJIL).size();
        int iLJJIJLIJ = 0;
        for (int i = 0; i < size; i++) {
            C113R c113r = this.LLJJIII;
            iLJJIJLIJ += c113r != null ? c113r.LJJIJLIJ(i) : 0;
        }
        return iLJJIJLIJ;
    }

    @Override // X.AnonymousClass1136
    public final void LJFF() {
        boolean z = false;
        boolean z2 = (this.LLJJIII instanceof C113R) && (((ArrayList) this.LLJJIJIIJIL).isEmpty() ^ true);
        if ((this.LLJJIII instanceof C113Q) && (!((ArrayList) this.LLJJIJI).isEmpty())) {
            z = true;
        }
        if (z2 || z) {
            return;
        }
        C113R c113r = this.LLJJIII;
        if (c113r instanceof C113R) {
            ((ArrayList) this.LLJJIJI).clear();
            ((ArrayList) this.LLJJIJIIJIL).clear();
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel((String) null, (String) null, (String) null, (UrlModel) null, (UrlModel) null, (List) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
            effectCategoryModel.setName("In");
            effectCategoryModel.setKey("in_video_anim");
            ((ArrayList) this.LLJJIJIIJIL).add(effectCategoryModel);
            if (this.LLJI.LJJIIZI || !C1413470msz.LIZ()) {
                EffectCategoryModel effectCategoryModel2 = new EffectCategoryModel((String) null, (String) null, (String) null, (UrlModel) null, (UrlModel) null, (List) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
                effectCategoryModel2.setName("Out");
                effectCategoryModel2.setKey("out_video_anim");
                EffectCategoryModel effectCategoryModel3 = new EffectCategoryModel((String) null, (String) null, (String) null, (UrlModel) null, (UrlModel) null, (List) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
                effectCategoryModel3.setName("Combo");
                effectCategoryModel3.setKey("combo_video_anim");
                ((ArrayList) this.LLJJIJIIJIL).add(effectCategoryModel2);
                ((ArrayList) this.LLJJIJIIJIL).add(effectCategoryModel3);
            }
        } else if (c113r instanceof C113Q) {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponse.setName("In");
            effectCategoryResponse.setKey("in_video_anim");
            List<Effect> list = this.LLJIJIL;
            ArrayList arrayList = new ArrayList();
            for (Effect effect : list) {
                C366400EYc.LIZ.getClass();
                C1446130njf.LIZ.getClass();
                if (Intrinsics.LJFF(C1446130njf.LJFF(effect, "video_anim_type"), "in_video_anim")) {
                    arrayList.add(effect);
                }
            }
            effectCategoryResponse.setTotalEffects(arrayList);
            EffectCategoryResponse effectCategoryResponse2 = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponse2.setName("Out");
            effectCategoryResponse2.setKey("out_video_anim");
            List<Effect> list2 = this.LLJIJIL;
            ArrayList arrayList2 = new ArrayList();
            for (Effect effect2 : list2) {
                C366400EYc.LIZ.getClass();
                C1446130njf.LIZ.getClass();
                if (Intrinsics.LJFF(C1446130njf.LJFF(effect2, "video_anim_type"), "out_video_anim")) {
                    arrayList2.add(effect2);
                }
            }
            effectCategoryResponse2.setTotalEffects(arrayList2);
            EffectCategoryResponse effectCategoryResponse3 = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponse3.setName("Combo");
            effectCategoryResponse3.setKey("combo_video_anim");
            List<Effect> list3 = this.LLJIJIL;
            ArrayList arrayList3 = new ArrayList();
            for (Effect effect3 : list3) {
                C366400EYc.LIZ.getClass();
                C1446130njf.LIZ.getClass();
                if (Intrinsics.LJFF(C1446130njf.LJFF(effect3, "video_anim_type"), "combo_video_anim")) {
                    arrayList3.add(effect3);
                }
            }
            effectCategoryResponse3.setTotalEffects(arrayList3);
            ((ArrayList) this.LLJJIJIIJIL).clear();
            ((ArrayList) this.LLJJIJI).clear();
            ((ArrayList) this.LLJJIJI).add(effectCategoryResponse);
            ((ArrayList) this.LLJJIJI).add(effectCategoryResponse2);
            ((ArrayList) this.LLJJIJI).add(effectCategoryResponse3);
        }
        C113R c113r2 = this.LLJJIII;
        if (c113r2 instanceof C113R) {
            if (c113r2 != null) {
                c113r2.LJJJI(this.LLJJIJIIJIL);
            }
            List<EffectCategoryModel> list4 = this.LLJJIJIIJIL;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (EffectCategoryModel effectCategoryModel4 : (ArrayList) list4) {
                arrayList4.add(new C113W(effectCategoryModel4.getName(), effectCategoryModel4.getKey()));
            }
            LJIIL(arrayList4);
            return;
        }
        if (c113r2 instanceof C113Q) {
            if (c113r2 != null) {
                c113r2.LJJJI(this.LLJJIJI);
            }
            List<EffectCategoryResponse> list5 = this.LLJJIJI;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            for (EffectCategoryResponse effectCategoryResponse4 : (ArrayList) list5) {
                arrayList5.add(new C113W(effectCategoryResponse4.getName(), effectCategoryResponse4.getKey()));
            }
            LJIIL(arrayList5);
        }
    }

    @Override // X.AnonymousClass1136
    public final View LJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLILZ = C786410Ut5.Td(C786410Ut5.ne(this.LLJ.getContext()), R.layout.by1, this.LLJ, false);
        C19YA c19ya = (C19YA) LJ().findViewById(R.id.b3s);
        if (c19ya == null) {
            c19ya = null;
        } else if (!this.LLJI.LJJIIZI && C1413470msz.LIZ()) {
            int visibility = c19ya.getVisibility();
            c19ya.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c19ya);
        }
        this.LLJJ = c19ya;
        this.LLJJI = (C0MS4) LJ().findViewById(R.id.b3x);
        Scene scene = this.LLIZLLLIL;
        this.LLJ.getContext();
        C113R c113r = new C113R(scene, this.LLJI, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, null);
        this.LLJJIII = c113r;
        c113r.LLJ = new AwS678S0100000_29(this, 9);
        if (this.LLJI.LJJIIZI || (C1413470msz.LIZ > 0 && !C1413470msz.LIZ())) {
            c113r.LLIZLLLIL = 44;
        }
        C0MS4 c0ms4 = this.LLJJI;
        if (c0ms4 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0ms4, null);
            c0ms4.removeAllViews();
        }
        C0MS4 c0ms42 = this.LLJJI;
        if (c0ms42 != null) {
            c0ms42.setNoScroll(true);
        }
        C0MS4 c0ms43 = this.LLJJI;
        if (c0ms43 != null) {
            c0ms43.setAdapter(this.LLJJIII);
        }
        C0MS4 c0ms44 = this.LLJJI;
        if (c0ms44 != null) {
            c0ms44.addOnPageChangeListener(new C19774712Yn(this, 12));
        }
        C19YA c19ya2 = this.LLJJ;
        if (c19ya2 != null) {
            ViewGroup.LayoutParams layoutParams = c19ya2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLIZIZ = C1415610mwR.LIZIZ();
                C113G c113g = this.LLJI;
                marginLayoutParams.setMarginStart(((iLIZIZ - ((c113g.LJJ + c113g.LJIL) * c113g.LJIILJJIL)) / 2) + C366700EZg.LIZ(17.0d));
            }
            c19ya2.removeAllTabs();
            c19ya2.setHideIndicatorView(true);
            c19ya2.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.113U
                @Override // X.InterfaceC19561911g9
                public final void LIZ(C12H3 c12h3) {
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZIZ(C12H3 c12h3) {
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZJ(C12H3 c12h3, boolean z) {
                    EffectCategoryResponse effectCategoryResponse;
                    String key;
                    EffectCategoryModel effectCategoryModel;
                    C0MS4 c0ms45;
                    if (c12h3 != null) {
                        int i = c12h3.LIZLLL;
                        C113T c113t = this.LIZ;
                        if (!z && (c0ms45 = c113t.LLJJI) != null) {
                            c0ms45.setCurrentItem(i, true);
                        }
                        C113R c113r2 = c113t.LLJJIII;
                        if (!(c113r2 instanceof C113R) ? !(c113r2 instanceof C113Q) || (effectCategoryResponse = (EffectCategoryResponse) C13LP.LJJJLZIJ(i, c113t.LLJJIJI)) == null || (key = effectCategoryResponse.getKey()) == null : (effectCategoryModel = (EffectCategoryModel) C13LP.LJJJLZIJ(i, c113t.LLJJIJIIJIL)) == null || (key = effectCategoryModel.getKey()) == null) {
                            key = "";
                        }
                        if (c113t.LLJI.LJJIIZI || (C1413470msz.LIZ > 0 && !C1413470msz.LIZ())) {
                            C1413450msx c1413450msx = C1413450msx.LIZ;
                            VideoPublishEditModel videoPublishEditModel = c113t.LLJILLL;
                            c1413450msx.getClass();
                            String strLJFF = C1413450msx.LJFF(key);
                            C113G c113g2 = c113t.LLJI;
                            C1413450msx.LJIIIIZZ(videoPublishEditModel, strLJFF, c113g2.LJJIIZI, 1, c113g2.LJJIJ);
                        }
                        EffectPanelViewModel effectPanelViewModel = (EffectPanelViewModel) c113t.LLJJJ.getValue();
                        effectPanelViewModel.LLILZIL = key;
                        effectPanelViewModel.LLILLL.clear();
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectPanelViewModel), C0PEM.LIZ, null, new C592990NNp(effectPanelViewModel, key, null), 2);
                    }
                }
            });
        }
        if (this.LLIZ) {
            LJFF();
        }
        View viewLJ = LJ();
        this.LLJ.addView(viewLJ);
        this.LLILZ = viewLJ;
        return viewLJ;
    }

    @Override // X.AnonymousClass1136
    public final void LJIIJ() {
        int iIntValue;
        C0MS4 c0ms4;
        C443120HZe<Integer, Integer, String> value = this.LLJJIJIL.wQ2().getValue();
        if (value != null && (iIntValue = value.getSecond().intValue()) >= 0 && ((c0ms4 = this.LLJJI) == null || iIntValue != c0ms4.getCurrentItem())) {
            C19YA c19ya = this.LLJJ;
            if (c19ya != null) {
                c19ya.selectTab(c19ya.getTabAt(iIntValue));
            }
            C0MS4 c0ms42 = this.LLJJI;
            if (c0ms42 != null) {
                c0ms42.setCurrentItem(iIntValue, true);
            }
        }
        C0MS4 c0ms43 = this.LLJJI;
        if (c0ms43 != null) {
            int currentItem = c0ms43.getCurrentItem();
            C113R c113r = this.LLJJIII;
            if (c113r != null) {
                c113r.LJJJIL(currentItem);
            }
        }
    }

    public final int LJIIJJI() {
        C443120HZe<Integer, Integer, String> value = this.LLJJIJIL.wQ2().getValue();
        return Math.max(0, value != null ? value.getSecond().intValue() : 0);
    }

    @Override // X.AnonymousClass1136
    public final C113G LIZ() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0hhB, android.view.View] */
    public final void LJIIL(List<C113W> list) {
        C12H3 c12h3NewTab;
        boolean z;
        int iLJIIJJI = LJIIJJI();
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            AttributeSet attributeSet = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = ((C113W) next).LIZ;
                    ?? r1 = new ConstraintLayout(this.LLJ.getContext(), attributeSet, i) { // from class: X.0hhB
                        public final TuxTextView LL;
                        public final View LLILLJJLI;
                        public final C01GW LLILLL;
                        public final C01GW LLILZ;

                        private final Integer getSelectedTextColor() {
                            return (Integer) this.LLILLL.getValue();
                        }

                        private final Integer getUnselectedTextColor() {
                            return (Integer) this.LLILZ.getValue();
                        }

                        @Override // android.view.View
                        public void setSelected(boolean z2) {
                            super.setSelected(z2);
                            if (z2) {
                                Integer selectedTextColor = getSelectedTextColor();
                                if (selectedTextColor != null) {
                                    this.LL.setTextColor(selectedTextColor.intValue());
                                }
                                C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
                                return;
                            }
                            Integer unselectedTextColor = getUnselectedTextColor();
                            if (unselectedTextColor != null) {
                                this.LL.setTextColor(unselectedTextColor.intValue());
                            }
                            C786410Ut5.LJLLLLLL(4, this.LLILLJJLI);
                        }

                        public final void setTabText(String str2) {
                            this.LL.setText(str2);
                        }

                        {
                            super(context, attributeSet, i);
                            this.LLILLL = C452501pT.LIZIZ(new AwS420S0200000_19(this, context, 182));
                            this.LLILZ = C452501pT.LIZIZ(new AwS420S0200000_19(this, context, 183));
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.by2, this, true);
                            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.b3r);
                            this.LL = tuxTextView;
                            Integer unselectedTextColor = getUnselectedTextColor();
                            if (unselectedTextColor != null) {
                                tuxTextView.setTextColor(unselectedTextColor.intValue());
                            }
                            tuxTextView.setTuxFont(72);
                            this.LLILLJJLI = viewTd.findViewById(R.id.b3q);
                        }
                    };
                    r1.setTabText(str);
                    C19YA c19ya = this.LLJJ;
                    if (c19ya != null && (c12h3NewTab = c19ya.newTab()) != null) {
                        c12h3NewTab.LJFF = false;
                        c12h3NewTab.LJ = r1;
                        c12h3NewTab.LIZIZ();
                        C19YA c19ya2 = this.LLJJ;
                        if (c19ya2 != null) {
                            if (i2 == iLJIIJJI) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c19ya2.addTab(c12h3NewTab, z);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (iLJIIJJI < arrayList.size()) {
                    this.LLJJIJIL.BQ2().setValue(new C364270EPx(iLJIIJJI, ((C113W) ListProtector.get(list, iLJIIJJI)).LIZIZ, null));
                    C113D c113d = this.LLJILJIL;
                    if (c113d != null) {
                        c113d.LJIJJ(new C364270EPx(iLJIIJJI, ((C113W) ListProtector.get(list, iLJIIJJI)).LIZIZ, null));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C113T(Scene scene, ViewGroup viewGroup, C113G c113g, String str, List<? extends Effect> list, C113D c113d, InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, List<Effect> list2) {
        super(c113g, str, list2);
        this.LLIZLLLIL = scene;
        this.LLJ = viewGroup;
        this.LLJI = c113g;
        this.LLJIJIL = list;
        this.LLJILJIL = c113d;
        this.LLJILJILJ = interfaceC1452170ntP;
        this.LLJILLL = videoPublishEditModel;
        this.LLJJIJI = new ArrayList();
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = (EditEffectVideoModel) C1659630tI1.LJIIIIZZ(scene, null, null, 6).get(EditEffectVideoModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1040));
    }
}
