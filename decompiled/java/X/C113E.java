package X;

import Y.ACListenerS163S0100000_29;
import Y.AObjectS239S0100000_3;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS48S0110000_29;
import Y.AsS55S0100000_29;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0201000_29;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.113E, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113E extends AnonymousClass1136 implements InterfaceC19347710mh {
    public final Scene LLIZLLLIL;
    public final ViewGroup LLJ;
    public final EffectDownloadController LLJI;
    public final int LLJIJIL;
    public List<Effect> LLJILJIL;
    public final C113G LLJILJILJ;
    public final C113D LLJILLL;
    public final RecyclerView.RecycledViewPool LLJJ;
    public final InterfaceC1452170ntP LLJJI;
    public final VideoPublishEditModel LLJJIII;
    public final InterfaceC371480EhO LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public C113F LLJJIJIL;
    public C1749280vcc LLJJJ;
    public TuxTextView LLJJJIL;
    public View LLJJJJ;
    public InterfaceC361290EEl LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final List<EffectModel> LLJJLIIIJLLLLLLLZ;
    public final ArrayList<EffectPointModel> LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public Boolean LLJLLIL;
    public int LLJLLL;
    public InterfaceC1631620sYq<? super RecyclerView, ? super Integer, ? super Integer, Unit> LLJZ;
    public C194356112c LLJZIJLIL;
    public C194358112e LLL;
    public Function0<Unit> LLLF;
    public final C01GW LLLFF;
    public final C377010EqJ LLLFFI;
    public final C01GW LLLFZ;
    public int LLLI;
    public int LLLII;
    public boolean LLLIIII;
    public final String LLLIIIIL;

    @Override // X.AnonymousClass1136
    public final int LIZIZ() {
        return this.LLJILJIL.size();
    }

    @Override // X.AnonymousClass1136
    public final void LJFF() {
        if (!this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            return;
        }
        LJIIJ();
    }

    @Override // X.AnonymousClass1136
    public final View LJI() {
        C19A3 c19a3;
        C1DRG c1drg;
        RecyclerView.RecycledViewPool recycledViewPool;
        this.LLILZ = C786410Ut5.Td(C786410Ut5.ne(this.LLJ.getContext()), R.layout.by8, this.LLJ, false);
        RecyclerView recyclerView = (RecyclerView) LJ().findViewById(R.id.t11);
        this.LLJJIJIIJIL = recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnScrollListener(new AsS55S0100000_29(this, 9));
        this.LLJJJ = (C1749280vcc) LJ().findViewById(R.id.pyh);
        TuxTextView tuxTextView = (TuxTextView) LJ().findViewById(R.id.tf4);
        this.LLJJJIL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS163S0100000_29(this, 282));
        this.LLJJJJ = LJ().findViewById(R.id.q1n);
        if (this.LLJILJIL.isEmpty()) {
            C1749280vcc c1749280vcc = this.LLJJJ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            c1749280vcc.LJ();
            LJIILL(false);
        }
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LLJILJILJ.LJIILJJIL, 1, C545820Lau.LIZIZ(this.LLIZLLLIL), false);
        RecyclerView recyclerView2 = this.LLJJIJIIJIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemViewCacheSize(this.LLJILJILJ.LJIILJJIL);
        wrapGridLayoutManager.mRecycleChildrenOnDetach = true;
        if (!LJIILIIL(false) && (recycledViewPool = this.LLJJ) != null) {
            RecyclerView recyclerView3 = this.LLJJIJIIJIL;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.setRecycledViewPool(recycledViewPool);
        }
        RecyclerView recyclerView4 = this.LLJJIJIIJIL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(wrapGridLayoutManager);
        int iLIZIZ = C1415610mwR.LIZIZ();
        C113G c113g = this.LLJILJILJ;
        int i = (iLIZIZ - ((c113g.LJJ + c113g.LJIL) * c113g.LJIILJJIL)) / 2;
        RecyclerView recyclerView5 = this.LLJJIJIIJIL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        C426750GoL.LJIIL(recyclerView5, Integer.valueOf(i), Integer.valueOf(this.LLJLLL), Integer.valueOf(i), 0, 16);
        RecyclerView recyclerView6 = this.LLJJIJIIJIL;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.setClipToPadding(false);
        RecyclerView recyclerView7 = this.LLJJIJIIJIL;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
        RecyclerView recyclerView8 = this.LLJJIJIIJIL;
        RecyclerView recyclerView9 = recyclerView8 == null ? null : recyclerView8;
        Scene scene = this.LLIZLLLIL;
        if (recyclerView8 == null) {
            recyclerView8 = null;
        }
        recyclerView9.addOnItemTouchListener(new C113K(scene, recyclerView8, this.LLJILJILJ.LIZJ));
        if (C113I.LIZLLL(this.LL)) {
            this.LLILZIL = true;
        }
        this.LLJZIJLIL = new C194356112c();
        this.LLL = new C194358112e(this.LLIZLLLIL.requireActivity());
        C113G c113g2 = this.LLJILJILJ;
        boolean z = c113g2.LIZJ ? c113g2.LJJIJLIJ || !(C113I.LJ(this.LL) || this.LLILZIL) : false;
        C113D c113d = this.LLJILLL;
        C113G c113g3 = this.LLJILJILJ;
        C113F c113f = new C113F(z, c113d, c113g3, this.LLJI, c113g3.LJJIJIL, new AwS608S0100000_29(this, 767), new AwS643S0100000_29(this, 143));
        this.LLJJIJIL = c113f;
        c113f.LLJ = new C113J() { // from class: X.113C
            @Override // X.C113J
            public final boolean LIZJ() {
                C194373112t c194373112t;
                C113E c113e = this.LIZ;
                return (c113e.LLJILJILJ.LIZIZ && ((c194373112t = (C194373112t) ((LiveData) c113e.LJIIZILJ().LLILZ.getValue()).getValue()) == null || c194373112t.LIZJ)) ? false : true;
            }

            @Override // X.C113J
            public final boolean LIZLLL() {
                C113E c113e = this.LIZ;
                return c113e.LLIZ && !Intrinsics.LJFF(c113e.LLJLLIL, Boolean.FALSE);
            }

            @Override // X.C113J
            public final String LJI() {
                C443120HZe<Integer, Integer, String> value = this.LIZ.LJIIZILJ().wQ2().getValue();
                if (value != null) {
                    return value.getThird();
                }
                return null;
            }

            @Override // X.C113J
            public final int LIZ(int i2) {
                return i2 - this.LIZ.LIZJ().LLLI();
            }

            @Override // X.C113J
            public final Effect LJ(int i2) {
                return (Effect) ListProtector.get(this.LIZ.LLJILJIL, i2);
            }

            @Override // X.C113J
            public final boolean LJFF(String str) {
                InterfaceC361290EEl interfaceC361290EEl;
                C113E c113e = this.LIZ;
                if (!c113e.LLJILJILJ.LJJIJLIJ || (interfaceC361290EEl = c113e.LLJJJJJIL) == null || !interfaceC361290EEl.Ar1("editingeffect", Collections.singletonList(str))) {
                    return false;
                }
                return true;
            }

            @Override // X.C113J
            public final void LIZIZ(int i2, EffectModel effectModel) {
                String str;
                String str2;
                EffectModel effectModel2;
                EffectModel effectModel3;
                C113E c113e = this.LIZ;
                if (Intrinsics.LJFF(c113e.LL, "visual")) {
                    C113F c113f2 = c113e.LLJJIJIL;
                    if (c113f2 == null) {
                        c113f2 = null;
                    }
                    List<EffectModel> data = c113f2.getData();
                    if (data != null && (effectModel3 = (EffectModel) C13LP.LJJJLZIJ(0, data)) != null) {
                        str = effectModel3.name;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "Fake3D")) {
                        C113F c113f3 = c113e.LLJJIJIL;
                        if (c113f3 == null) {
                            c113f3 = null;
                        }
                        List<EffectModel> data2 = c113f3.getData();
                        if (data2 != null && (effectModel2 = (EffectModel) C13LP.LJJJLZIJ(1, data2)) != null) {
                            str2 = effectModel2.name;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "SoulScale")) {
                            return;
                        }
                    }
                }
                C113E c113e2 = this.LIZ;
                AwS110S0201000_29 awS110S0201000_29 = new AwS110S0201000_29(c113e2, effectModel, i2, 7);
                c113e2.getClass();
                if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                    Activity activity = c113e2.LLIZLLLIL.mActivity;
                    String enterFrom = c113e2.LLJJIII.getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    C0XPD.LIZIZ(activity, "video_edit_page", enterFrom, null, new C19774812Yo(awS110S0201000_29, 4));
                    return;
                }
                awS110S0201000_29.invoke(Boolean.FALSE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
            
                r3 = r4.element;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02ad  */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v1, types: [T] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
            @Override // X.C113J
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJII(int r13, int r14, com.ss.android.ugc.aweme.effect.EffectModel r15) {
                /*
                    Method dump skipped, instruction units count: 939
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C113C.LJII(int, int, com.ss.android.ugc.aweme.effect.EffectModel):boolean");
            }
        };
        c113f.setLoadMoreListener(new AwS573S0100000_29(this, 1039));
        C113F c113f2 = this.LLJJIJIL;
        if (c113f2 == null) {
            c113f2 = null;
        }
        c113f2.setLoadErrorText(2131857690);
        C113F c113f3 = this.LLJJIJIL;
        if (c113f3 == null) {
            c113f3 = null;
        }
        this.LLILZLL = new AnonymousClass1134(this, c113f3);
        if (this.LLIZ) {
            LJFF();
        }
        this.LLJI.LJFF.add(this);
        ((LiveEvent) LJIIZILJ().LLILZIL.getValue()).LJII(this.LLIZLLLIL, Lifecycle.State.RESUMED, new AObjectS239S0100000_3(this, 3));
        C113G c113g4 = this.LLJILJILJ;
        if (c113g4.LIZ == null && c113g4.LIZIZ) {
            LJIIZILJ().vQ2().LIZLLL().observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 239));
            ((LiveData) LJIIZILJ().LLILZ.getValue()).observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 240));
            LJIIZILJ().zQ2().observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 241));
        }
        Scene scene2 = this.LLIZLLLIL;
        if ((scene2 instanceof C19A3) && (c19a3 = (C19A3) scene2) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
            this.LLJJJJJIL = (InterfaceC361290EEl) c1drg.LJIIL(null, InterfaceC361290EEl.class);
        }
        View viewLJ = LJ();
        this.LLJ.addView(viewLJ);
        this.LLILZ = viewLJ;
        return viewLJ;
    }

    @Override // X.AnonymousClass1136
    public final void LJIIIIZZ() {
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        if (tuxTextView.getVisibility() == 0) {
            LJIILL(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    @Override // X.AnonymousClass1136
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113E.LJIIJ():void");
    }

    public final void LJIIJJI() {
        EffectModel effectModel = (EffectModel) C13LP.LJJJLZIJ(0, this.LLJJLIIIJLLLLLLLZ);
        if (effectModel != null && effectModel.isEnabled && (!this.LLJILJIL.isEmpty())) {
            EffectDownloadController effectDownloadController = this.LLJI;
            Effect effect = (Effect) ListProtector.get(this.LLJILJIL, 0);
            effectDownloadController.getClass();
            if (EffectDownloadController.LJ(effect)) {
                this.LLJILJILJ.LJJII = false;
                C113D c113d = this.LLJILLL;
                if (c113d != null) {
                    c113d.LIZLLL(effectModel, this.LLJIJIL, true);
                }
            }
        }
    }

    public final EditEffectVideoModel LJIIZILJ() {
        return (EditEffectVideoModel) this.LLJJJJLIIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02bc, code lost:
    
        r4 = ((java.util.ArrayList) r12.LLJJLIIIJLLLLLLLZ).iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c9, code lost:
    
        if (r4.hasNext() == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cb, code lost:
    
        r1 = (com.ss.android.ugc.aweme.effect.EffectModel) r4.next();
        r0 = r1.resourceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d3, code lost:
    
        if (r0 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d9, code lost:
    
        if (r0.length() == 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02db, code lost:
    
        r1 = r1.resourceId;
        r0 = LJIIZILJ().wQ2().getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02eb, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ed, code lost:
    
        r0 = r0.getThird();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r0) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02f7, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02f8, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0310, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0312, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        r4.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012d, code lost:
    
        r7.add(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113E.LJIJJ():void");
    }

    public final String LJIJJLI() {
        if (!(!this.LLJL.isEmpty())) {
            return null;
        }
        EffectPointModel effectPointModel = (EffectPointModel) C13LP.LJJLIIIJJI(this.LLJL);
        LJIIZILJ().vQ2().LIZLLL().setValue(C0EYM.LIZLLL(effectPointModel.getIndex(), effectPointModel.getUiStartPoint(), effectPointModel.getUuid()));
        return effectPointModel.getKey();
    }

    public final void LJIL() {
        RecyclerView recyclerView = this.LLJJIJIIJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(this.LLJLIL, 0);
    }

    public final EnumC1429610nJ1 LJJ() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLEResType resourceType;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJI;
        if (interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || sortedSlots.size() != 1 || (resourceType = sortedSlots.get(0).getMainSegment().getResource().getResourceType()) == null) {
            return null;
        }
        int i = C384060F4a.LIZIZ[resourceType.ordinal()];
        if (i == 1) {
            return EnumC1429610nJ1.EDIT_EFFECT_SERVER;
        }
        if (i == 2) {
            return EnumC1429610nJ1.EDIT_EFFECT_CLIENT;
        }
        return null;
    }

    @Override // X.AnonymousClass1136
    public final C113G LIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AnonymousClass1136
    public final String LIZLLL() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC19347710mh
    public final void Iz(Effect effect) {
        String str;
        if (effect != null) {
            int iIndexOf = this.LLJILJIL.indexOf(effect);
            EffectModel effectModel = (EffectModel) C13LP.LJJJLZIJ(iIndexOf, this.LLJJLIIIJLLLLLLLZ);
            C113F c113f = null;
            if (effectModel != null) {
                str = effectModel.key;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, effect.getEffectId())) {
                Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
                iIndexOf = 0;
                while (it2.hasNext()) {
                    if (!Intrinsics.LJFF(((EffectModel) it2.next()).key, effect.getEffectId())) {
                        iIndexOf++;
                    }
                }
                return;
            }
            if (iIndexOf >= 0) {
                C113F c113f2 = this.LLJJIJIL;
                if (c113f2 != null) {
                    c113f = c113f2;
                }
                c113f.LLLI(iIndexOf, 32);
            }
        }
    }

    @Override // X.AnonymousClass1136
    public final void LJIIIZ(boolean z) {
        super.LJIIIZ(z);
        if (z && C113L.LIZ()) {
            LJIILL(true);
        }
        LJIILJJIL(z);
    }

    public final void LJIIL(List<? extends Effect> list) {
        ArrayList arrayList = new ArrayList();
        int i = this.LLJILJILJ.LJIJI;
        if (i >= 0) {
            for (int i2 = 0; i2 < i && i2 < list.size(); i2++) {
                Effect effect = (Effect) ListProtector.get(list, i2);
                this.LLJI.getClass();
                if (!EffectDownloadController.LJ(effect)) {
                    arrayList.add(effect);
                }
            }
        }
        this.LLJI.LJIIJ(arrayList);
    }

    public final boolean LJIILIIL(boolean z) {
        String third;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "effects_panel_supports_paging_data_fetch", true, false)) {
            return true;
        }
        if (z) {
            if (this.LLJILJILJ.LJJIIZI && !C113I.LIZ(this.LL)) {
                return true;
            }
            return false;
        }
        if (this.LLJILJILJ.LJJIIZI && !C113I.LIZ(this.LL)) {
            C443120HZe<Integer, Integer, String> value = LJIIZILJ().wQ2().getValue();
            if (value == null || (third = value.getThird()) == null || third.length() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILJJIL(final boolean z) {
        if (!Intrinsics.LJFF(this.LLJLLIL, Boolean.valueOf(z)) && this.LLJJIJIIJIL != null) {
            this.LLJLLIL = Boolean.valueOf(z);
            RecyclerView recyclerView = this.LLJJIJIIJIL;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView3 = this.LLJJIJIIJIL;
                if (recyclerView3 != null) {
                    recyclerView2 = recyclerView3;
                }
                HandlerHook.viewPost(recyclerView2, new ARunnableS48S0110000_29(this, z, 3));
                return;
            }
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.1133
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C113E c113e = this.LL;
                    RecyclerView recyclerView4 = c113e.LLJJIJIIJIL;
                    if (recyclerView4 == null) {
                        recyclerView4 = null;
                    }
                    HandlerHook.viewPost(recyclerView4, new ARunnableS48S0110000_29(c113e, z, 3));
                }
            });
        }
    }

    public final void LJIILL(boolean z) {
        String str;
        if (!this.LLIZ && C113L.LIZ()) {
            return;
        }
        C113F c113f = null;
        if (z && LJIILIIL(true) && (true ^ ((ArrayList) this.LLJJLIIIJLLLLLLLZ).isEmpty()) && !C113I.LIZ(this.LL)) {
            C113F c113f2 = this.LLJJIJIL;
            if (c113f2 != null) {
                c113f = c113f2;
            }
            c113f.notifyDataSetChanged();
            return;
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        C1749280vcc c1749280vcc = this.LLJJJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C366400EYc c366400EYc = C366400EYc.LIZ;
        String str2 = this.LL;
        c366400EYc.getClass();
        if (!C366400EYc.LIZJ(str2)) {
            str = this.LL;
        } else {
            str = "video_anim";
        }
        C389580FPg c389580FPg = new C389580FPg(this, str, z);
        AwS178S1100000_29 awS178S1100000_29 = new AwS178S1100000_29(this, str, 9);
        if (C113I.LIZ(this.LL)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLIZLLLIL), null, null, new C2381409Uu(this, c389580FPg, awS178S1100000_29, null), 3);
        } else {
            LJIILLIIL(str, awS178S1100000_29, c389580FPg);
        }
    }

    public final void LJIJ(String str) {
        C113F c113f = null;
        TuxTextView tuxTextView = null;
        if (((ArrayList) this.LLJJLIIIJLLLLLLLZ).isEmpty()) {
            C1749280vcc c1749280vcc = this.LLJJJ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
            View view = this.LLJJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView2 = this.LLJJJIL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C1627000sRO.LIZIZ(LJ().getContext(), true);
            C113D c113d = this.LLJILLL;
            if (c113d != null) {
                c113d.LJIILIIL(str, false);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJJ;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        C113F c113f2 = this.LLJJIJIL;
        if (c113f2 != null) {
            c113f = c113f2;
        }
        c113f.showLoadMoreError();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // X.InterfaceC19347710mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vs(com.ss.android.ugc.effectmanager.effect.model.Effect r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113E.Vs(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    @Override // X.InterfaceC19347710mh
    public final void g(Effect effect) {
        String str;
        int iIndexOf = this.LLJILJIL.indexOf(effect);
        EffectModel effectModel = (EffectModel) C13LP.LJJJLZIJ(iIndexOf, this.LLJJLIIIJLLLLLLLZ);
        C113F c113f = null;
        if (effectModel != null) {
            str = effectModel.key;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, effect.getEffectId())) {
            Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
            iIndexOf = 0;
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(((EffectModel) it2.next()).key, effect.getEffectId())) {
                    iIndexOf++;
                }
            }
            return;
        }
        if (iIndexOf >= 0) {
            C113F c113f2 = this.LLJJIJIL;
            if (c113f2 != null) {
                c113f = c113f2;
            }
            c113f.LLLI(iIndexOf, 8);
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void zf(Effect effect, int i) {
        String str;
        int iIndexOf = this.LLJILJIL.indexOf(effect);
        EffectModel effectModel = (EffectModel) C13LP.LJJJLZIJ(iIndexOf, this.LLJJLIIIJLLLLLLLZ);
        RecyclerView recyclerView = null;
        if (effectModel != null) {
            str = effectModel.key;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, effect.getEffectId())) {
            Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
            iIndexOf = 0;
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(((EffectModel) it2.next()).key, effect.getEffectId())) {
                    iIndexOf++;
                }
            }
            return;
        }
        if (iIndexOf >= 0) {
            C113F c113f = this.LLJJIJIL;
            if (c113f == null) {
                c113f = null;
            }
            c113f.LLLI(iIndexOf, 9);
            RecyclerView recyclerView2 = this.LLJJIJIIJIL;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iIndexOf);
            if (viewHolderFindViewHolderForAdapterPosition instanceof C113H) {
                ((C113H) viewHolderFindViewHolderForAdapterPosition).S5(i, iIndexOf);
            }
        }
    }

    public final void LJIILLIIL(String str, Function0 function0, Function2 function2) {
        int i;
        Map mapLIZJ;
        if (LJIILIIL(false)) {
            i = 40;
        } else {
            i = 10000;
        }
        final C113O c113o = (C113O) this.LLLFZ.getValue();
        final String str2 = this.LL;
        int i2 = this.LLLI;
        int i3 = this.LLLII;
        final C2381709Ux c2381709Ux = new C2381709Ux(this, function2, function0);
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(function0, (Function0<Unit>) 766);
        c113o.getClass();
        if (!Intrinsics.LJFF(str, "trending02")) {
            mapLIZJ = null;
        } else {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("creation_mode", "1"));
        }
        C565780MGy c565780MGy = (C565780MGy) c113o.LIZIZ.getValue();
        ((InterfaceC1635410sex) c565780MGy.LIZ.getValue()).sg("editingeffect", str, i, i2, i3, mapLIZJ, new IFetchCategoryEffectListener() { // from class: X.113V
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                awS608S0100000_29.invoke(exceptionResult);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                ArrayList arrayList;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                int creation_mode_count = 0;
                if (categoryPageModel2 != null) {
                    CategoryEffectModel category_effects = categoryPageModel2.getCategory_effects();
                    if (category_effects != null) {
                        String str3 = str2;
                        C113O c113o2 = c113o;
                        InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, Integer, Unit> interfaceC1631630sYr = c2381709Ux;
                        List<Effect> effects = category_effects.getEffects();
                        switch (str3.hashCode()) {
                            case -510575962:
                                if (str3.equals("combo_video_anim")) {
                                    arrayList = new ArrayList();
                                    for (Effect effect : effects) {
                                        C366400EYc.LIZ.getClass();
                                        C1446130njf.LIZ.getClass();
                                        if (Intrinsics.LJFF(C1446130njf.LJFF(effect, "video_anim_type"), "combo_video_anim")) {
                                            arrayList.add(effect);
                                        }
                                    }
                                    effects = arrayList;
                                }
                                break;
                            case 41552559:
                                if (str3.equals("in_video_anim")) {
                                    arrayList = new ArrayList();
                                    for (Effect effect2 : effects) {
                                        C366400EYc.LIZ.getClass();
                                        C1446130njf.LIZ.getClass();
                                        if (Intrinsics.LJFF(C1446130njf.LJFF(effect2, "video_anim_type"), "in_video_anim")) {
                                            arrayList.add(effect2);
                                        }
                                    }
                                    effects = arrayList;
                                }
                                break;
                            case 522495463:
                                if (str3.equals("trending02") && !C1428470nHB.LJLJLJ(c113o2.LIZ)) {
                                    CategoryPageModel.Extra extra = categoryPageModel2.getExtra();
                                    if (extra != null) {
                                        creation_mode_count = extra.getCreation_mode_count();
                                    }
                                    if (creation_mode_count < effects.size()) {
                                        effects = C13LP.LJJJJIZL(effects, creation_mode_count);
                                    }
                                }
                                break;
                            case 1307747558:
                                if (str3.equals("out_video_anim")) {
                                    arrayList = new ArrayList();
                                    for (Effect effect3 : effects) {
                                        C366400EYc.LIZ.getClass();
                                        C1446130njf.LIZ.getClass();
                                        if (Intrinsics.LJFF(C1446130njf.LJFF(effect3, "video_anim_type"), "out_video_anim")) {
                                            arrayList.add(effect3);
                                        }
                                    }
                                    effects = arrayList;
                                }
                                break;
                        }
                        interfaceC1631630sYr.invoke(effects, Boolean.valueOf(category_effects.getHasMore()), Integer.valueOf(category_effects.getCursor()), Integer.valueOf(category_effects.getSortingPosition()));
                        return;
                    }
                    return;
                }
                c2381709Ux.invoke(null, Boolean.FALSE, 0, 0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(int r13, java.lang.String r14, java.util.List r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113E.LJIJI(int, java.lang.String, java.util.List, boolean):void");
    }

    public C113E(Scene scene, ViewGroup viewGroup, EffectDownloadController effectDownloadController, int i, String str, List<Effect> list, C113G c113g, C113D c113d, RecyclerView.RecycledViewPool recycledViewPool, InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, List<Effect> list2, InterfaceC371480EhO interfaceC371480EhO) {
        int i2;
        super(c113g, str, list2);
        this.LLIZLLLIL = scene;
        this.LLJ = viewGroup;
        this.LLJI = effectDownloadController;
        this.LLJIJIL = i;
        this.LLJILJIL = list;
        this.LLJILJILJ = c113g;
        this.LLJILLL = c113d;
        this.LLJJ = recycledViewPool;
        this.LLJJI = interfaceC1452170ntP;
        this.LLJJIII = videoPublishEditModel;
        this.LLJJIJI = interfaceC371480EhO;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1035));
        this.LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1034));
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJL = new ArrayList<>();
        this.LLJLIL = -1;
        this.LLJLL = true;
        this.LLLFF = C452501pT.LIZ(EnumC452301pR.NONE, new AwS573S0100000_29(this, 1032));
        this.LLLFFI = new C377010EqJ(new LinkedHashSet());
        this.LLLFZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1033));
        if (C113I.LJ(str)) {
            i2 = 2131833751;
        } else if (C113I.LIZIZ(str)) {
            i2 = 2131837472;
        } else {
            i2 = 2131833514;
        }
        this.LLLIIIIL = scene.getString(i2);
    }
}
