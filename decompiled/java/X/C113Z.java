package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPanelViewModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.113Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113Z extends ConstraintLayout {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final VideoPublishEditModel LL;
    public final Scene LLILLJJLI;
    public final C113G LLILLL;
    public final C113D LLILZ;
    public final InterfaceC1452170ntP LLILZIL;
    public final InterfaceC1457290o1f LLILZLL;
    public final InterfaceC371480EhO LLIZ;
    public C1749280vcc LLIZLLLIL;
    public FrameLayout LLJ;
    public View LLJI;
    public C19561611g6 LLJIJIL;
    public ViewPager LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxIconView LLJILLL;
    public C113S LLJJ;
    public final C565780MGy LLJJI;
    public final EditEffectVideoModel LLJJIII;
    public final C01GW LLJJIJI;
    public C194387113h LLJJIJIIJIL;
    public final Keva LLJJIJIL;
    public boolean LLJJJ;
    public final int LLJJJIL;
    public InterfaceC361290EEl LLJJJJ;
    public AbstractC194383113d LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public Map<String, String> LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public final C01GW LLJLIL;

    public final void I0() {
        C443120HZe<Integer, Integer, String> value;
        String third;
        boolean z = true;
        if (!(!this.LL.getEffectList().isEmpty()) && ((value = this.LLJJIII.wQ2().getValue()) == null || (third = value.getThird()) == null || third.length() <= 0)) {
            z = false;
        }
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.x5(tuxIconView, z ? 1.0f : 0.4f);
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        (tuxIconView2 != null ? tuxIconView2 : null).setEnabled(z);
    }

    public final AnonymousClass1136 getCurrentPage() {
        C113S c113s = this.LLJJ;
        if (!(c113s instanceof C113S) || c113s == null) {
            return null;
        }
        return c113s.LLILZ;
    }

    public final String getCurrentSelectEffectKey() {
        C443120HZe<Integer, Integer, String> value = this.LLJJIII.wQ2().getValue();
        if (value != null) {
            return value.getThird();
        }
        return null;
    }

    public final EffectPanelViewModel getEffectPanelViewModel() {
        return (EffectPanelViewModel) this.LLJJIJI.getValue();
    }

    public final void h0() {
        List<EffectCategoryModel> categoryList;
        List<EffectCategoryResponse> categoryResponseList;
        C113R c113r;
        AnonymousClass1136 anonymousClass1136;
        C113S c113r2;
        ViewPager viewPager = this.LLJILJIL;
        if (viewPager == null) {
            viewPager = null;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewPager, null);
        viewPager.removeAllViews();
        ViewPager viewPager2 = this.LLJILJIL;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        C19561611g6 c19561611g6 = this.LLJIJIL;
        if (c19561611g6 == null) {
            c19561611g6 = null;
        }
        viewPager2.addOnPageChangeListener(new C19642311t7(c19561611g6));
        ViewPager viewPager3 = this.LLJILJIL;
        if (viewPager3 == null) {
            viewPager3 = null;
        }
        viewPager3.addOnPageChangeListener(new C19774712Yn(this, 13));
        ViewPager viewPager4 = this.LLJILJIL;
        if (viewPager4 == null) {
            viewPager4 = null;
        }
        viewPager4.setOffscreenPageLimit(this.LLILLL.LJIJ);
        C194387113h c194387113h = this.LLJJIJIIJIL;
        final Scene scene = this.LLILLJJLI;
        getContext();
        final C113G c113g = this.LLILLL;
        final C113D c113d = this.LLILZ;
        final InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZIL;
        final VideoPublishEditModel videoPublishEditModel = this.LL;
        InterfaceC371480EhO interfaceC371480EhO = this.LLIZ;
        if (c194387113h != null) {
            EffectChannelResponse effectChannelResponse = c194387113h.LIZIZ;
            if (effectChannelResponse == null || effectChannelResponse.getCategoryResponseList() == null) {
                PanelInfoModel panelInfoModel = c194387113h.LIZ;
                if (panelInfoModel != null && panelInfoModel.getCategoryList() != null) {
                    c113r2 = new C113R(scene, c113g, c113d, interfaceC1452170ntP, videoPublishEditModel, interfaceC371480EhO);
                }
            } else {
                c113r2 = new C113S<EffectCategoryResponse>(scene, c113g, c113d, interfaceC1452170ntP, videoPublishEditModel) { // from class: X.113Q
                    public final Scene LLJIJIL;
                    public final C113G LLJILJIL;
                    public final C113D LLJILJILJ;
                    public final InterfaceC1452170ntP LLJILLL;
                    public final VideoPublishEditModel LLJJ;
                    public final List<Effect> LLJJI;

                    @Override // X.C113S
                    public final void LJJIJIL() {
                        ((ArrayList) this.LLJJI).clear();
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
                        while (it2.hasNext()) {
                            arrayList.addAll(((EffectCategoryResponse) it2.next()).getTotalEffects());
                        }
                        int i = this.LLJILJIL.LJIJI;
                        if (i >= 0) {
                            for (int i2 = 0; i2 < i && i2 < arrayList.size(); i2++) {
                                Effect effect = (Effect) ListProtector.get(arrayList, i2);
                                this.LLJI.getValue().getClass();
                                if (!EffectDownloadController.LJ(effect)) {
                                    ((ArrayList) this.LLJJI).add(effect);
                                }
                            }
                        }
                        ((EffectDownloadController) this.LLJI.getValue()).LJIIJ(this.LLJJI);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final Object LJJI(int i, ViewGroup viewGroup) {
                        View viewLJ;
                        AnonymousClass1136 anonymousClass1135;
                        String key = ((EffectCategoryResponse) ListProtector.get(this.LLILZLL, i)).getKey();
                        AnonymousClass1136 anonymousClass11362 = this.LLILZIL.get(i);
                        if (anonymousClass11362 == null) {
                            if (!C113I.LIZLLL(key) && !C113I.LJFF(key)) {
                                C113E c113e = c113e;
                                C113E c113e2 = new C113E(this.LLJIJIL, viewGroup, (EffectDownloadController) this.LLJI.getValue(), i, key, new ArrayList(((EffectCategoryResponse) ListProtector.get(this.LLILZLL, i)).getTotalEffects()), this.LLJILJIL, this.LLJILJILJ, (RecyclerView.RecycledViewPool) this.LLIZ.getValue(), this.LLJILLL, this.LLJJ, new ArrayList(), null);
                                int i2 = this.LLIZLLLIL;
                                anonymousClass1135 = c113e;
                                if (i2 != 0) {
                                    c113e.LLJLLL = C366700EZg.LIZ(i2);
                                    c113e.LLJZ = new AwS678S0100000_29(this, 10);
                                    anonymousClass1135 = c113e;
                                }
                            } else if (C113I.LJFF(key)) {
                                anonymousClass1135 = new C113T(this.LLJIJIL, viewGroup, this.LLJILJIL, key, new ArrayList(((EffectCategoryResponse) ListProtector.get(this.LLILZLL, i)).getTotalEffects()), this.LLJILJILJ, this.LLJILLL, this.LLJJ, new ArrayList());
                            } else {
                                anonymousClass1135 = new AnonymousClass1135(this.LLJIJIL, viewGroup, key, this.LLJILJIL, this.LLJILJILJ, (RecyclerView.RecycledViewPool) this.LLIZ.getValue());
                            }
                            this.LLILZIL.put(i, anonymousClass1135);
                            viewLJ = anonymousClass1135.LJI();
                        } else {
                            viewLJ = anonymousClass11362.LJ();
                            viewGroup.addView(viewLJ);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("position:");
                        sbLIZ.append(i);
                        viewLJ.setTag(C2188811AlT.LIZIZ(sbLIZ));
                        return viewLJ;
                    }

                    {
                        super(c113g, scene);
                        this.LLJIJIL = scene;
                        this.LLJILJIL = c113g;
                        this.LLJILJILJ = c113d;
                        this.LLJILLL = interfaceC1452170ntP;
                        this.LLJJ = videoPublishEditModel;
                        this.LLJJI = new ArrayList();
                    }
                };
            }
            this.LLJJ = c113r2;
        }
        C113S c113s = this.LLJJ;
        if ((c113s instanceof C113R) && (c113r = (C113R) c113s) != null) {
            List<Effect> defaultEffectList = this.LL.getDefaultEffectList();
            ((ArrayList) c113r.LLJJIII).clear();
            ((ArrayList) c113r.LLJJIII).addAll(defaultEffectList);
            if (c113r.LLILZIL.size() > 0 && (anonymousClass1136 = c113r.LLILZIL.get(0)) != null) {
                anonymousClass1136.LLILLL = c113r.LLJJIII;
            }
        }
        ViewPager viewPager5 = this.LLJILJIL;
        if (viewPager5 == null) {
            viewPager5 = null;
        }
        viewPager5.setAdapter(this.LLJJ);
        C194387113h c194387113h2 = this.LLJJIJIIJIL;
        C113S c113s2 = this.LLJJ;
        if (c194387113h2 != null) {
            EffectChannelResponse effectChannelResponse2 = c194387113h2.LIZIZ;
            if (effectChannelResponse2 != null && (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) != null && (c113s2 instanceof C113Q) && c113s2 != null) {
                c113s2.LJJJI(categoryResponseList);
                if (Unit.LIZ != null) {
                    return;
                }
            }
            PanelInfoModel panelInfoModel2 = c194387113h2.LIZ;
            if (panelInfoModel2 == null || (categoryList = panelInfoModel2.getCategoryList()) == null || !(c113s2 instanceof C113R) || c113s2 == null) {
                return;
            }
            c113s2.LJJJI(categoryList);
        }
    }

    public final void j0() {
        C113E c113e;
        LinearLayoutManager linearLayoutManager;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, "trending02");
        if (iLIZ < 0) {
            return;
        }
        C113S c113s = this.LLJJ;
        AnonymousClass1136 anonymousClass1136LJJIL = (!(c113s instanceof C113S) || c113s == null) ? null : c113s.LJJIL(iLIZ);
        if (!(anonymousClass1136LJJIL instanceof C113E) || (c113e = (C113E) anonymousClass1136LJJIL) == null) {
            return;
        }
        RecyclerView recyclerView = c113e.LLJJIJIIJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            EffectModel effectModel = (EffectModel) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, c113e.LLJJLIIIJLLLLLLLZ);
            if (effectModel != null) {
                ((EffectPanelViewModel) c113e.LLJJL.getValue()).wQ2(iFindFirstVisibleItemPosition, effectModel);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0207 A[EDGE_INSN: B:205:0x0207->B:111:0x0207 BREAK  A[LOOP:9: B:124:0x023d->B:207:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel, java.lang.String, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0() {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113Z.l0():void");
    }

    public final void s0() {
        if (this.LLILLL.LIZ != null) {
            MutableLiveData<C443120HZe<Integer, Integer, String>> mutableLiveDataWQ2 = this.LLJJIII.wQ2();
            String str = this.LLILLL.LIZ.LIZJ;
            if (str == null) {
                str = "";
            }
            mutableLiveDataWQ2.setValue(new C443120HZe<>(-1, 0, str));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EffectPointModel effectPointModel : this.LL.getEffectList()) {
            String key = effectPointModel.getKey();
            if (key != null && key.length() != 0) {
                linkedHashMap.put(effectPointModel.getKey(), "");
            }
        }
        if (this.LLJJJ && Intrinsics.LJFF(this.LLJJIII.AQ2().getValue(), Boolean.FALSE)) {
            this.LLJJIII.AQ2().setValue(Boolean.TRUE);
            C565780MGy c565780MGy = this.LLJJI;
            ((InterfaceC1635410sex) c565780MGy.LIZ.getValue()).rg(new C194380113a(this, linkedHashMap));
            return;
        }
        if (this.LLJJJ) {
            return;
        }
        this.LLJJIII.AQ2().setValue(Boolean.FALSE);
        if (C194381113b.LIZJ(this.LLJJIJIIJIL)) {
            return;
        }
        h0();
        e0(false);
    }

    public final C113G getConfig() {
        return this.LLILLL;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LL;
    }

    public final InterfaceC371480EhO getInterceptorView() {
        return this.LLIZ;
    }

    public final C113D getPanelListener() {
        return this.LLILZ;
    }

    public final Scene getRootScene() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1452170ntP getVeEditor() {
        return this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(boolean z) {
        List<EffectCategoryModel> categoryList;
        List<EffectCategoryResponse> categoryResponseList;
        if (C194381113b.LIZJ(this.LLJJIJIIJIL)) {
            return;
        }
        C194387113h c194387113h = this.LLJJIJIIJIL;
        boolean z2 = false;
        if (c194387113h != null) {
            EffectChannelResponse effectChannelResponse = c194387113h.LIZIZ;
            if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
                Iterator<EffectCategoryResponse> it2 = categoryResponseList.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getKey(), "time")) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (!z && i >= 0) {
                    ArrayList arrayList = new ArrayList(c194387113h.LIZIZ.getCategoryResponseList());
                    ListProtector.remove(arrayList, i);
                    c194387113h.LIZIZ.setCategoryResponseList(arrayList);
                } else {
                    if (i != -1 || !z) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(c194387113h.LIZIZ.getCategoryResponseList());
                    EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                    effectCategoryResponse.setName(C0CHQ.LIZ.getString(2131849531));
                    effectCategoryResponse.setKey("time");
                    arrayList2.add(effectCategoryResponse);
                    c194387113h.LIZIZ.setCategoryResponseList(arrayList2);
                }
            } else {
                PanelInfoModel panelInfoModel = c194387113h.LIZ;
                if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null) {
                    Iterator<EffectCategoryModel> it3 = categoryList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().getKey(), "time")) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (!z && i2 >= 0) {
                        ArrayList arrayList3 = new ArrayList(c194387113h.LIZ.getCategoryList());
                        ListProtector.remove(arrayList3, i2);
                        c194387113h.LIZ.setCategoryList(arrayList3);
                    } else if (i2 == -1 && z) {
                        ArrayList arrayList4 = new ArrayList(c194387113h.LIZ.getCategoryList());
                        EffectCategoryModel effectCategoryModel = new EffectCategoryModel((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (UrlModel) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), z2, (String) (0 == true ? 1 : 0), 1023, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        effectCategoryModel.setName(C0CHQ.LIZ.getString(2131849531));
                        effectCategoryModel.setKey("time");
                        arrayList4.add(effectCategoryModel);
                        c194387113h.LIZ.setCategoryList(arrayList4);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            h0();
            e0(false);
        }
    }

    public final void F0(String str) {
        Integer first;
        AnonymousClass1135 anonymousClass1135;
        int iIntValue = 0;
        if (Intrinsics.LJFF(str, "time")) {
            int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, str);
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                AnonymousClass1136 anonymousClass1136 = c113s.LLILZIL.get(iLIZ);
                if ((anonymousClass1136 instanceof AnonymousClass1135) && (anonymousClass1135 = (AnonymousClass1135) anonymousClass1136) != null) {
                    anonymousClass1135.LJIIJJI(null);
                }
            }
            this.LLJJIII.wQ2().setValue(new C443120HZe<>(Integer.valueOf(iLIZ), 0, ""));
        } else {
            if (str != null) {
                first = Integer.valueOf(C194381113b.LIZ(this.LLJJIJIIJIL, str));
            } else {
                C443120HZe<Integer, Integer, String> value = this.LLJJIII.wQ2().getValue();
                if (value != null) {
                    first = value.getFirst();
                }
            }
            if (first != null) {
                int iIntValue2 = first.intValue();
                C443120HZe<Integer, Integer, String> value2 = this.LLJJIII.wQ2().getValue();
                if (value2 != null) {
                    iIntValue = value2.getSecond().intValue();
                }
                this.LLJJIII.wQ2().setValue(new C443120HZe<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue), ""));
                C113S c113s2 = this.LLJJ;
                if ((c113s2 instanceof C113S) && c113s2 != null) {
                    c113s2.LJJIZ(iIntValue2);
                }
            }
        }
        I0();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(boolean r16) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113Z.e0(boolean):void");
    }

    public final void i0(EffectModel effectModel) {
        AnonymousClass1136 anonymousClass1136LJJIL;
        C113E c113e;
        String str;
        int i;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, "trending02");
        if (iLIZ >= 0) {
            ViewPager viewPager = this.LLJILJIL;
            C113F c113f = null;
            if (viewPager == null) {
                viewPager = null;
            }
            if (viewPager.getCurrentItem() != iLIZ) {
                u0("trending02", false);
            }
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                anonymousClass1136LJJIL = c113s.LJJIL(iLIZ);
            } else {
                anonymousClass1136LJJIL = null;
            }
            if ((anonymousClass1136LJJIL instanceof C113E) && (c113e = (C113E) anonymousClass1136LJJIL) != null && !((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).isEmpty()) {
                boolean z = c113e.LLJILJILJ.LJJIIZI;
                String str2 = "editor_pro_panel";
                if (z) {
                    str = "editor_pro_panel";
                } else {
                    str = "edit_page_panel";
                }
                effectModel.entrancePoint = str;
                if (!z) {
                    str2 = "edit_page_panel";
                }
                effectModel.selectFrom = str2;
                Iterator it2 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((EffectModel) it2.next()).key, effectModel.key)) {
                        if (i2 >= 0) {
                            EffectModel effectModel2 = (EffectModel) C13LP.LJJJLZIJ(i2, c113e.LLJJLIIIJLLLLLLLZ);
                            if (effectModel2 != null) {
                                effectModel2.searchModel = effectModel.searchModel;
                                return;
                            }
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
                EffectSearchModel effectSearchModel = effectModel.searchModel;
                if (effectSearchModel != null) {
                    effectSearchModel.setInsertedFromSearchPanel(Boolean.TRUE);
                }
                EffectModel effectModel3 = (EffectModel) C13LP.LJJJLZIJ(c113e.LLJLIL, c113e.LLJJLIIIJLLLLLLLZ);
                ListProtector.add(c113e.LLJJLIIIJLLLLLLLZ, 0, effectModel);
                C113F c113f2 = c113e.LLJJIJIL;
                if (c113f2 != null) {
                    c113f = c113f2;
                }
                c113f.notifyItemInserted(0);
                if (effectModel3 == null) {
                    return;
                }
                Iterator it3 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((EffectModel) it3.next()).key, effectModel3.key)) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (c113e.LLJLIL == i) {
                    return;
                }
                c113e.LLJLIL = i;
                c113e.LJIIZILJ().wQ2().setValue(new C443120HZe<>(Integer.valueOf(c113e.LLJLIL), 0, effectModel3.key));
            }
        }
    }

    public final void n0(EffectModel effectModel) {
        AnonymousClass1136 anonymousClass1136LJJIL;
        C113E c113e;
        EffectModel effectModel2;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, "trending02");
        if (iLIZ >= 0) {
            ViewPager viewPager = this.LLJILJIL;
            C113F c113f = null;
            if (viewPager == null) {
                viewPager = null;
            }
            if (viewPager.getCurrentItem() != iLIZ) {
                u0("trending02", false);
            }
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                anonymousClass1136LJJIL = c113s.LJJIL(iLIZ);
            } else {
                anonymousClass1136LJJIL = null;
            }
            if ((anonymousClass1136LJJIL instanceof C113E) && (c113e = (C113E) anonymousClass1136LJJIL) != null) {
                Iterator it2 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                int i = 0;
                while (true) {
                    int i2 = -1;
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((EffectModel) it2.next()).key, effectModel.key)) {
                            if (i >= 0) {
                                Iterator it3 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                                int i3 = 0;
                                while (it3.hasNext()) {
                                    if (Intrinsics.LJFF(((EffectModel) it3.next()).key, effectModel.key)) {
                                        if (i3 >= 0 && (effectModel2 = (EffectModel) C13LP.LJJJLZIJ(i3, c113e.LLJJLIIIJLLLLLLLZ)) != null) {
                                            EffectSearchModel effectSearchModel = effectModel2.searchModel;
                                            if (effectSearchModel != null) {
                                                if (!Intrinsics.LJFF(effectSearchModel.getInsertedFromSearchPanel(), Boolean.TRUE)) {
                                                    if (effectModel2 == null) {
                                                        return;
                                                    }
                                                } else {
                                                    EffectModel effectModel3 = (EffectModel) C13LP.LJJJLZIJ(c113e.LLJLIL, c113e.LLJJLIIIJLLLLLLLZ);
                                                    ListProtector.remove(c113e.LLJJLIIIJLLLLLLLZ, i3);
                                                    C113F c113f2 = c113e.LLJJIJIL;
                                                    if (c113f2 != null) {
                                                        c113f = c113f2;
                                                    }
                                                    c113f.notifyItemRemoved(i3);
                                                    if (effectModel3 == null) {
                                                        return;
                                                    }
                                                    Iterator it4 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (!it4.hasNext()) {
                                                            break;
                                                        }
                                                        if (Intrinsics.LJFF(((EffectModel) it4.next()).key, effectModel3.key)) {
                                                            i2 = i4;
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                    if (c113e.LLJLIL == i2) {
                                                        return;
                                                    }
                                                    c113e.LLJLIL = i2;
                                                    c113e.LJIIZILJ().wQ2().setValue(new C443120HZe<>(Integer.valueOf(c113e.LLJLIL), 0, effectModel3.key));
                                                    return;
                                                }
                                            }
                                            effectModel2.searchModel = null;
                                            return;
                                        }
                                        return;
                                    }
                                    i3++;
                                }
                                return;
                            }
                            return;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void p0(List list) {
        AnonymousClass1136 anonymousClass1136LJJIL;
        C113E c113e;
        int i;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, "trending02");
        if (iLIZ >= 0) {
            ViewPager viewPager = this.LLJILJIL;
            if (viewPager == null) {
                viewPager = null;
            }
            if (viewPager.getCurrentItem() != iLIZ) {
                u0("trending02", false);
            }
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                anonymousClass1136LJJIL = c113s.LJJIL(iLIZ);
            } else {
                anonymousClass1136LJJIL = null;
            }
            if ((anonymousClass1136LJJIL instanceof C113E) && (c113e = (C113E) anonymousClass1136LJJIL) != null) {
                List<EffectModel> list2 = c113e.LLJJLIIIJLLLLLLLZ;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list2) {
                    EffectModel effectModel = (EffectModel) obj;
                    if (effectModel.searchModel != null && !list.contains(effectModel.key)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    EffectModel effectModel2 = (EffectModel) C13LP.LJJJLZIJ(c113e.LLJLIL, c113e.LLJJLIIIJLLLLLLLZ);
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        i = -1;
                        if (!it2.hasNext()) {
                            break;
                        }
                        EffectModel effectModel3 = (EffectModel) it2.next();
                        Iterator it3 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(((EffectModel) it3.next()).key, effectModel3.key)) {
                                if (i2 >= 0) {
                                    EffectSearchModel effectSearchModel = effectModel3.searchModel;
                                    if (effectSearchModel != null && Intrinsics.LJFF(effectSearchModel.getInsertedFromSearchPanel(), Boolean.TRUE)) {
                                        ListProtector.remove(c113e.LLJJLIIIJLLLLLLLZ, i2);
                                        C113F c113f = c113e.LLJJIJIL;
                                        if (c113f == null) {
                                            c113f = null;
                                        }
                                        c113f.notifyItemRemoved(i2);
                                    } else {
                                        effectModel3.searchModel = null;
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (effectModel2 != null) {
                        Iterator it4 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(((EffectModel) it4.next()).key, effectModel2.key)) {
                                i = i3;
                                break;
                            }
                            i3++;
                        }
                        if (c113e.LLJLIL != i) {
                            c113e.LLJLIL = i;
                            c113e.LJIIZILJ().wQ2().setValue(new C443120HZe<>(Integer.valueOf(c113e.LLJLIL), 0, effectModel2.key));
                        }
                    }
                }
            }
        }
    }

    public final void setLoadingVisible(boolean z) {
        int i;
        if (this.LLILLL.LIZLLL) {
            if (z) {
                C1749280vcc c1749280vcc = this.LLIZLLLIL;
                if (c1749280vcc != null) {
                    c1749280vcc.LJ();
                }
                i = 0;
            } else {
                i = 8;
            }
            C1749280vcc c1749280vcc2 = this.LLIZLLLIL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, i);
            }
        }
        View view = null;
        if (z) {
            View view2 = this.LLJI;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(4, view);
            return;
        }
        View view3 = this.LLJI;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    public final void z0(EffectModel effectModel) {
        AnonymousClass1136 anonymousClass1136LJJIL;
        C113E c113e;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, "trending02");
        if (iLIZ >= 0) {
            ViewPager viewPager = this.LLJILJIL;
            C113F c113f = null;
            if (viewPager == null) {
                viewPager = null;
            }
            if (viewPager.getCurrentItem() != iLIZ) {
                u0("trending02", false);
            }
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                anonymousClass1136LJJIL = c113s.LJJIL(iLIZ);
            } else {
                anonymousClass1136LJJIL = null;
            }
            if ((anonymousClass1136LJJIL instanceof C113E) && (c113e = (C113E) anonymousClass1136LJJIL) != null) {
                Iterator it2 = ((ArrayList) c113e.LLJJLIIIJLLLLLLLZ).iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((EffectModel) it2.next()).key, effectModel.key)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i2 = c113e.LLJLIL;
                if (i2 != i) {
                    c113e.LLJLIL = i;
                    c113e.LJIIZILJ().wQ2().setValue(new C443120HZe<>(Integer.valueOf(c113e.LLJLIL), 0, effectModel.key));
                    C113F c113f2 = c113e.LLJJIJIL;
                    if (c113f2 == null) {
                        c113f2 = null;
                    }
                    c113f2.notifyItemChanged(i2);
                    C113F c113f3 = c113e.LLJJIJIL;
                    if (c113f3 != null) {
                        c113f = c113f3;
                    }
                    c113f.notifyItemChanged(i);
                    c113e.LJIL();
                }
            }
        }
    }

    public final void B0(String str, String str2) {
        AnonymousClass1135 anonymousClass1135;
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, str2);
        if (Intrinsics.LJFF(str2, "time")) {
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                AnonymousClass1136 anonymousClass1136 = c113s.LLILZIL.get(iLIZ);
                if ((anonymousClass1136 instanceof AnonymousClass1135) && (anonymousClass1135 = (AnonymousClass1135) anonymousClass1136) != null) {
                    anonymousClass1135.LJIIJJI(str);
                    return;
                }
                return;
            }
            return;
        }
        C366400EYc.LIZ.getClass();
        Iterator<String> it2 = C366400EYc.LIZJ.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(str2, it2.next())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        this.LLJJIII.wQ2().setValue(new C443120HZe<>(Integer.valueOf(iLIZ), Integer.valueOf(Math.max(i, -1)), str));
        C113S c113s2 = this.LLJJ;
        if (!(c113s2 instanceof C113S) || c113s2 == null) {
            return;
        }
        c113s2.LJJIZ(iLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel, com.ss.android.ugc.effectmanager.effect.model.EffectLabel, com.ss.ugc.effectplatform.model.DiffEffect, com.ss.ugc.effectplatform.model.TemplateEffectExtra, java.lang.String, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(X.C194387113h r167, java.util.Map<java.lang.String, java.lang.String> r168) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113Z.C0(X.113h, java.util.Map):void");
    }

    public final void u0(String str, boolean z) {
        int iLIZ = C194381113b.LIZ(this.LLJJIJIIJIL, str);
        if (iLIZ >= 0) {
            EffectPanelViewModel effectPanelViewModel = getEffectPanelViewModel();
            effectPanelViewModel.LLILZ = str;
            effectPanelViewModel.LLILLL.clear();
            ViewPager viewPager = null;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectPanelViewModel), C0PEM.LIZ, null, new C592990NNp(effectPanelViewModel, str, null), 2);
            C113S c113s = this.LLJJ;
            if ((c113s instanceof C113S) && c113s != null) {
                c113s.LJJJ(iLIZ);
            }
            ViewPager viewPager2 = this.LLJILJIL;
            if (viewPager2 != null) {
                viewPager = viewPager2;
            }
            viewPager.setCurrentItem(iLIZ, z);
        }
    }

    public /* synthetic */ C113Z(VideoPublishEditModel videoPublishEditModel, Scene scene, Context context, C113G c113g, C113D c113d, InterfaceC1452170ntP interfaceC1452170ntP, InterfaceC1457290o1f interfaceC1457290o1f) {
        this(videoPublishEditModel, scene, context, null, c113g, c113d, interfaceC1452170ntP, interfaceC1457290o1f, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C113Z(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r19, com.bytedance.scene.Scene r20, android.content.Context r21, android.util.AttributeSet r22, X.C113G r23, X.C113D r24, X.InterfaceC1452170ntP r25, X.InterfaceC1457290o1f r26, boolean r27, X.InterfaceC371480EhO r28) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113Z.<init>(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.scene.Scene, android.content.Context, android.util.AttributeSet, X.113G, X.113D, X.0ntP, X.0o1f, boolean, X.0EhO):void");
    }
}
