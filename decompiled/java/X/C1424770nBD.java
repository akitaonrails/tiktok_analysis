package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424770nBD extends PagerAdapter {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final C19EG LLILLJJLI;
    public final Scene LLILLL;
    public final List<Float> LLILZ;
    public final Function0<TemplateCategoryData> LLILZIL;
    public final InterfaceC1424840nBK LLILZLL;
    public C1419590n2r LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public C1DRG LLJILLL;
    public C16FB LLJJ;
    public boolean LLJJI;
    public List<TemplateCategoryData> LLIZ = C13BV.INSTANCE;
    public final HashMap<String, C1424850nBL> LLIZLLLIL = new HashMap<>();
    public final Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>> LLJ = new LinkedHashMap(C2097608Jq.LJ());
    public int LLJI = -1;
    public final AwS566S0100000_22 LLJJIII = new AwS566S0100000_22(this, 1009);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1008));
    public final C1424810nBH LLJJIJIIJIL = new InterfaceC1424900nBQ() { // from class: X.0nBH
        @Override // X.InterfaceC1424900nBQ
        public final boolean LIZJ(TemplateCategoryData templateCategoryData) {
            return false;
        }

        @Override // X.InterfaceC1424900nBQ
        public final boolean LIZ(TemplateCategoryData templateCategoryData) {
            return C1423570n9H.LIZJ(templateCategoryData);
        }

        @Override // X.InterfaceC1424900nBQ
        public final View LIZIZ(TemplateCategoryData templateCategoryData) {
            if (C1423570n9H.LIZJ(templateCategoryData)) {
                return (View) this.LIZ.LLJJIJI.getValue();
            }
            return null;
        }
    };

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    public final void LJJIJLIJ() {
        this.LLJI = -1;
        this.LLJIJIL = null;
        this.LLJILJIL = 0.0f;
        this.LLJILJILJ = false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        TemplateCategoryData templateCategoryData = (TemplateCategoryData) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (templateCategoryData != null) {
            return templateCategoryData.name;
        }
        return null;
    }

    public final TemplateCategoryData LJJIJIL(int i) {
        return (TemplateCategoryData) C13LP.LJJJLZIJ(i, this.LLIZ);
    }

    public final C1424850nBL LJJIJL(int i) {
        TemplateCategoryData templateCategoryDataLJJIJIL = LJJIJIL(i);
        if (templateCategoryDataLJJIJIL == null) {
            return null;
        }
        return this.LLIZLLLIL.get(templateCategoryDataLJJIJIL.key);
    }

    public final void LJJIZ(boolean z) {
        LJJIJLIJ();
        for (C1424850nBL c1424850nBL : this.LLIZLLLIL.values()) {
            c1424850nBL.LLJLLIL = false;
            c1424850nBL.LJIJJLI(z);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        List<Float> list;
        View frameLayout;
        TemplateCategoryData templateCategoryData = (TemplateCategoryData) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (templateCategoryData == null) {
            templateCategoryData = new TemplateCategoryData("", null, null, false, null);
        }
        String str = templateCategoryData.key;
        if (Intrinsics.LJFF(str, "__debug_panel__")) {
            ITemplateConsumeService iTemplateConsumeService = (ITemplateConsumeService) PluggableExtentionKt.pluggableSpi$default(ITemplateConsumeService.class, false, false, false, 14, null);
            if (iTemplateConsumeService == null || (frameLayout = iTemplateConsumeService.LIZLLL(this.LLILLJJLI)) == null) {
                frameLayout = new FrameLayout(this.LLILLJJLI);
            }
            viewGroup.addView(frameLayout);
            return frameLayout;
        }
        View view = this.LLIZLLLIL.get(str);
        if (view != null && view.getParent() == null) {
            viewGroup.addView(view);
            return view;
        }
        C19EG c19eg = this.LLILLJJLI;
        Scene scene = this.LLILLL;
        if (templateCategoryData.isDefault) {
            list = this.LLILZ;
        } else {
            list = null;
        }
        C1424850nBL c1424850nBL = new C1424850nBL(c19eg, scene, templateCategoryData, list, this.LLILZIL, this.LLJJIJIIJIL, this.LLILZLL);
        C1DRG c1drg = this.LLJILLL;
        if (c1drg != null) {
            c1424850nBL.setDiContainer(c1drg);
        }
        this.LLIZLLLIL.put(str, c1424850nBL);
        viewGroup.addView(c1424850nBL);
        Pair pair = (Pair) ((LinkedHashMap) this.LLJ).get(templateCategoryData);
        if (pair != null) {
            c1424850nBL.LJIIZILJ((List) pair.getSecond(), (C1422890n8B) pair.getFirst());
        }
        if (this.LLJI == i) {
            c1424850nBL.LJIJJ(this.LLJILJILJ, this.LLJIJIL, this.LLJILJIL);
            LJJIJLIJ();
        }
        C16FB c16fb = this.LLJJ;
        if (c16fb != null) {
            C16FB c16fb2 = c1424850nBL.LLJI;
            boolean z = c16fb2.LLLFF;
            C786410Ut5.LJJJLZIJ(c16fb2, c1424850nBL.LLIZLLLIL);
            C16FB c16fb3 = c1424850nBL.LLJI;
            RecyclerView recyclerView = c1424850nBL.LLJ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c16fb3, recyclerView);
            c16fb3.removeView(recyclerView);
            c1424850nBL.LLIZLLLIL.addView(c1424850nBL.LLJ);
            c1424850nBL.LLJ.setOverScrollMode(2);
            c1424850nBL.LLJI = c16fb;
            c1424850nBL.LLJJIJI = true;
            c1424850nBL.LLJJLIIIJLLLLLLLZ.LLJJI = true;
            if (!r0.LLIZ.isEmpty()) {
                c1424850nBL.LLJI.setScrollMode(EnumC481060Itk.REFRESH);
                c1424850nBL.LLJI.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
            }
            if (z) {
                c1424850nBL.LLJJJJLIIL = true;
                c1424850nBL.LLJI.LJ();
            }
        }
        c1424850nBL.setInterceptPlayVideo(this.LLJJIII);
        return c1424850nBL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nBH] */
    public C1424770nBD(C19EG c19eg, C1424590nAv c1424590nAv, List list, C1424610nAx c1424610nAx, InterfaceC1424840nBK interfaceC1424840nBK) {
        this.LLILLJJLI = c19eg;
        this.LLILLL = c1424590nAv;
        this.LLILZ = list;
        this.LLILZIL = c1424610nAx;
        this.LLILZLL = interfaceC1424840nBK;
    }

    public static void LJJIL(C1424770nBD c1424770nBD, int i, C1419590n2r c1419590n2r, float f, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            c1419590n2r = null;
        }
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        c1424770nBD.getClass();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateCategoryPagerAdapterNew startPlayVideo: position = ");
        sbLIZ.append(i);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C1424850nBL c1424850nBLLJJIJL = c1424770nBD.LJJIJL(i);
        if (c1424850nBLLJJIJL == null) {
            c1424770nBD.LLJI = i;
            c1424770nBD.LLJIJIL = c1419590n2r;
            c1424770nBD.LLJILJIL = f;
            c1424770nBD.LLJILJILJ = z;
            return;
        }
        c1424850nBLLJJIJL.LJIJJ(z, c1419590n2r, f);
    }
}
