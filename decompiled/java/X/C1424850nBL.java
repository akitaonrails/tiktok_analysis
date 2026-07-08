package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS21S0101000_10;
import Y.ARunnableS41S0110000_22;
import Y.ARunnableS73S0200000_4;
import Y.AsS49S0100000_22;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS671S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0nBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424850nBL extends FrameLayout {
    public static final /* synthetic */ int LLLFFI = 0;
    public final C19EG LL;
    public final Scene LLILLJJLI;
    public final TemplateCategoryData LLILLL;
    public final Function0<TemplateCategoryData> LLILZ;
    public final InterfaceC1424900nBQ LLILZIL;
    public final InterfaceC1424840nBK LLILZLL;
    public final View LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final RecyclerView LLJ;
    public C16FB LLJI;
    public final TuxSkeletonLayout LLJIJIL;
    public final TuxSkeletonLayout LLJILJIL;
    public final View LLJILJILJ;
    public final TuxIconView LLJILLL;
    public final ViewGroup LLJJ;
    public final View LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public final List<Float> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public final float LLJJJJ;
    public C1232704s1 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final StaggeredGridLayoutManager LLJJL;
    public final C1424920nBS LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public float LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public Function0<Boolean> LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public final C1424860nBM LLLF;
    public boolean LLLFF;

    public final void LJIL() {
        this.LLJJJJLIIL = false;
        this.LLJI.setRefreshing(false);
    }

    private final List<Integer> getCurPageItemPositions() {
        int[] iArrLJIJ = this.LLJJL.LJIJ(null);
        int iMin = Math.min(iArrLJIJ[0], iArrLJIJ[1]);
        int iMin2 = Math.min(iMin + 5, this.LLJJLIIIJLLLLLLLZ.getItemCount() - 1);
        return iMin > iMin2 ? C13BV.INSTANCE : C13LP.LLIIII(new IntRange(iMin, iMin2));
    }

    private final TuxSkeletonLayout getLoadingView() {
        return this.LLJLIL ? this.LLJILJIL : this.LLJIJIL;
    }

    private final int getNewPlayTemplateIndexIfNeededForStaggeredLayout() {
        return this.LLJJJJJIL.LIZ;
    }

    public final void LJIIIIZZ() {
        Integer numLJJJJLL;
        InterfaceC1424900nBQ interfaceC1424900nBQ = this.LLILZIL;
        if (interfaceC1424900nBQ == null || !interfaceC1424900nBQ.LIZJ(this.LLILLL) || (numLJJJJLL = C13LQ.LJJJJLL(this.LLJJL.LJIJ(null))) == null) {
            return;
        }
        int iIntValue = numLJJJJLL.intValue();
        Integer numLJJJJJL = C13LQ.LJJJJJL(this.LLJJL.LJIJJ(null));
        if (numLJJJJJL != null) {
            int iIntValue2 = numLJJJJJL.intValue();
            int iMax = Math.max(iIntValue, 0);
            int iMin = Math.min(iIntValue2, this.LLJJLIIIJLLLLLLLZ.getItemCount() - 1);
            if (iMax > iMin || this.LLL <= 0) {
                return;
            }
            C1424920nBS c1424920nBS = this.LLJJLIIIJLLLLLLLZ;
            IntRange intRange = new IntRange(iMax, iMin);
            c1424920nBS.getClass();
            int i = iMax < 0 ? 0 : iMax;
            int i2 = intRange.LLILLJJLI + 1;
            int size = c1424920nBS.LLIZ.size();
            if (i2 > size) {
                i2 = size;
            }
            List<C1419590n2r> listSubList = c1424920nBS.LLIZ.subList(i, i2);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C1419590n2r c1419590n2r : listSubList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1419590n2r c1419590n2r2 = c1419590n2r;
                int i5 = i3 + iMax;
                if (LJFF(this.LLJJL.findViewByPosition(i5))) {
                    arrayList.add(new C1422430n7R(i5, c1419590n2r2, this.LLILLL, i5 < this.LLL));
                }
                i3 = i4;
            }
            this.LLILZLL.LJII(arrayList, this.LLL);
        }
    }

    public final void LJIIIZ() {
        C1419590n2r c1419590n2rLLLFZ;
        if (this.LLJJIII == 0 || (c1419590n2rLLLFZ = this.LLJJLIIIJLLLLLLLZ.LLLFZ(this.LLJLILLLLZIIL)) == null) {
            return;
        }
        this.LLILZLL.LIZLLL(this.LLJLILLLLZIIL, c1419590n2rLLLFZ, this.LLILLL, System.currentTimeMillis() - this.LLJJIII);
        this.LLJJIII = 0L;
    }

    public final void LJIJ() {
        if (C545820Lau.LIZLLL(this.LL, this.LLILLJJLI)) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(this.LL);
        c1389880mGw.LJIIIIZZ(2131850006);
        c1389880mGw.LJ(R.raw.icon_exclamation_mark_circle);
        c1389880mGw.LJI(R.attr.a1h);
        c1389880mGw.LIZLLL(3000L);
        c1389880mGw.LJIIJ();
    }

    public final void LIZ() {
        if (getLoadingView().getVisibility() == 0) {
            this.LLILZLL.LIZIZ(this.LLILLL);
        }
        getLoadingView().setLoading(false);
        C786410Ut5.LLLZL(getLoadingView(), 8);
    }

    public final void LJIILIIL() {
        int newPlayTemplateIndexIfNeededForStaggeredLayout = getNewPlayTemplateIndexIfNeededForStaggeredLayout();
        if (newPlayTemplateIndexIfNeededForStaggeredLayout >= 0) {
            int i = this.LLJLILLLLZIIL;
            if (newPlayTemplateIndexIfNeededForStaggeredLayout == i) {
                LJIILLIIL(this.LLJLL, i, true);
            } else {
                LJIJJLI(false);
                LJIILLIIL(0.0f, newPlayTemplateIndexIfNeededForStaggeredLayout, false);
            }
        }
    }

    public final void LJIJI() {
        if (getLoadingView().getVisibility() == 8) {
            this.LLILZLL.LJIIIZ(this.LLILLL);
        }
        C786410Ut5.LLLZL(getLoadingView(), 0);
        getLoadingView().setLoading(true);
        C786410Ut5.LJLZ(8, this.LLJJ);
    }

    public final TemplateCategoryData getCategoryData() {
        return this.LLILLL;
    }

    public final Function0<Boolean> getInterceptPlayVideo() {
        return this.LLJZ;
    }

    public static boolean LJFF(View view) {
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getLocalVisibleRect(rect) || rect.height() != view.getHeight() || rect.width() != view.getWidth()) {
            return false;
        }
        return true;
    }

    public final C1425080nBi LIZIZ(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLJ.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            viewHolderFindViewHolderForAdapterPosition = (C1425080nBi) ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ.LLJJ).get(Integer.valueOf(i));
        }
        if (viewHolderFindViewHolderForAdapterPosition instanceof C1425080nBi) {
            return (C1425080nBi) viewHolderFindViewHolderForAdapterPosition;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Integer> LIZJ(java.util.List<java.lang.Integer> r22) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424850nBL.LIZJ(java.util.List):java.util.List");
    }

    public final Rect LIZLLL(C1419590n2r c1419590n2r) {
        C1425080nBi c1425080nBi;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLJ.findViewHolderForAdapterPosition(this.LLJJLIIIJLLLLLLLZ.LLLI(c1419590n2r));
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof C1425080nBi) || (c1425080nBi = (C1425080nBi) viewHolderFindViewHolderForAdapterPosition) == null) {
            return null;
        }
        return C420010GdT.LIZ(c1425080nBi.LLILZ);
    }

    public final boolean LJI(View view) {
        int height = view.getHeight();
        if (height <= 0 || view.getBottom() <= 0 || (Math.min(this.LLJ.getHeight(), view.getBottom()) - Math.max(0, view.getTop())) / height <= 0.6f) {
            return false;
        }
        return true;
    }

    public final void LJII(boolean z) {
        Integer numLJJJJLL = C13LQ.LJJJJLL(this.LLJJL.LJIJ(null));
        if (numLJJJJLL != null) {
            int iIntValue = numLJJJJLL.intValue();
            Integer numLJJJJJL = C13LQ.LJJJJJL(this.LLJJL.LJIJJ(null));
            if (numLJJJJJL != null) {
                int iIntValue2 = numLJJJJJL.intValue();
                int iMax = Math.max(iIntValue, 0);
                int iMin = Math.min(iIntValue2, this.LLJJLIIIJLLLLLLLZ.getItemCount() - 1);
                if (iMax > iMin || iMax > iMin) {
                    return;
                }
                while (true) {
                    C1419590n2r c1419590n2rLLLFZ = this.LLJJLIIIJLLLLLLLZ.LLLFZ(iMax);
                    if (c1419590n2rLLLFZ != null && LJFF(this.LLJJL.findViewByPosition(iMax))) {
                        this.LLILZLL.LJFF(iMax, c1419590n2rLLLFZ, this.LLILLL, z);
                    }
                    if (iMax != iMin) {
                        iMax++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void LJIIJJI(C1423010n8N c1423010n8N) {
        TemplateCategoryData templateCategoryData;
        C1422880n8A c1422880n8A;
        EnumC1423060n8S enumC1423060n8S;
        C1422880n8A c1422880n8A2;
        C1422880n8A c1422880n8A3;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView onFetchTemplatesError: ");
        EnumC1423060n8S enumC1423060n8S2 = null;
        if (c1423010n8N != null) {
            templateCategoryData = c1423010n8N.LIZ;
        } else {
            templateCategoryData = null;
        }
        sbLIZ.append(templateCategoryData);
        sbLIZ.append(" - ");
        if (c1423010n8N != null) {
            c1422880n8A = c1423010n8N.LIZIZ;
        } else {
            c1422880n8A = null;
        }
        sbLIZ.append(c1422880n8A);
        sbLIZ.append(", isRefreshing = ");
        sbLIZ.append(this.LLJJJJLIIL);
        sbLIZ.append(", isUseOutsideRefreshLayout = ");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", layout.isRefreshing = ");
        sbLIZ.append(this.LLJI.LLLFF);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (c1423010n8N != null && (c1422880n8A3 = c1423010n8N.LIZIZ) != null) {
            enumC1423060n8S = c1422880n8A3.LIZ;
        } else {
            enumC1423060n8S = null;
        }
        if (enumC1423060n8S == EnumC1423060n8S.LOAD_MORE_TEMPLATES_ERROR) {
            C1424920nBS c1424920nBS = this.LLJJLIIIJLLLLLLLZ;
            c1424920nBS.LLJ = false;
            boolean z = c1424920nBS.LLJI;
            if (!c1424920nBS.LLJJI && z) {
                c1424920nBS.LLJI = false;
                c1424920nBS.notifyItemChanged(c1424920nBS.LLIZ.size());
            }
            if (Intrinsics.LJFF(c1423010n8N.LIZ, c1423010n8N.LIZJ) && z && !c1423010n8N.LIZLLL) {
                C19EG c19eg = this.LL;
                if (!C545820Lau.LIZLLL(c19eg, this.LLILLJJLI)) {
                    C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
                    c1389880mGw.LJIIIIZZ(2131850002);
                    c1389880mGw.LJ(R.raw.icon_exclamation_mark_circle);
                    c1389880mGw.LJI(R.attr.a1h);
                    c1389880mGw.LIZLLL(3000L);
                    c1389880mGw.LJIIJ();
                    return;
                }
                return;
            }
            return;
        }
        if (c1423010n8N != null && (c1422880n8A2 = c1423010n8N.LIZIZ) != null) {
            enumC1423060n8S2 = c1422880n8A2.LIZ;
        }
        if (enumC1423060n8S2 == EnumC1423060n8S.REFRESH_SAME) {
            LJIL();
            return;
        }
        boolean z2 = this.LLJJIJI;
        if (z2) {
            if (this.LLJJJJLIIL && this.LLJI.LLLFF && c1423010n8N != null && c1423010n8N.LIZIZ != null) {
                LJIL();
                if (!c1423010n8N.LIZLLL) {
                    LJIJ();
                    return;
                }
                return;
            }
        } else if (this.LLJI.LLLFF && c1423010n8N != null && c1423010n8N.LIZIZ != null) {
            LJIL();
            if (!c1423010n8N.LIZLLL) {
                LJIJ();
                return;
            }
            return;
        }
        int i = 8;
        if (c1423010n8N != null && c1423010n8N.LIZIZ != null) {
            if (!z2) {
                this.LLJJJJLIIL = false;
                C786410Ut5.LLZZJLIL(this.LLJI, 8);
            }
            LIZ();
            TuxIconView tuxIconView = this.LLJILLL;
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            tuxIconView.setImageDrawable(c0hti.LIZ(tuxIconView.getContext()));
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            int iLIZIZ = ((rect.bottom - rect.top) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(198))) >> 1;
            TuxIconView tuxIconView2 = this.LLJILLL;
            if (iLIZIZ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))) {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i);
            C426750GoL.LJIIIZ(this.LLJILJILJ, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
            C786410Ut5.LJLLLLLL(0, this.LLJILJILJ);
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
        LJIJI();
    }

    public final void LJIILJJIL(boolean z) {
        Integer numLJJI;
        Function0<Boolean> function0 = this.LLJZ;
        if ((function0 != null && function0.invoke().booleanValue()) || this.LLJJLIIIJLLLLLLLZ.LLIZ.isEmpty()) {
            return;
        }
        int[] iArrLJIJ = this.LLJJL.LJIJ(null);
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            numLJJI = C13LQ.LJJJJI(iArrLJIJ);
        } else {
            numLJJI = C13LQ.LJJI(iArrLJIJ);
        }
        if (numLJJI == null) {
            return;
        }
        int iIntValue = numLJJI.intValue();
        if (LJIILL(this, iIntValue, 0.0f, z, 2)) {
            return;
        }
        LJIILL(this, iIntValue + 2, 0.0f, z, 2);
    }

    public final void LJIJJLI(boolean z) {
        String title;
        CutsameDataItem cutsameDataItem;
        Asset asset;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView stopPlayCurTemplate: curPlayIndex = ");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append(" - ");
        C1419590n2r c1419590n2rLLLFZ = this.LLJJLIIIJLLLLLLLZ.LLLFZ(this.LLJLILLLLZIIL);
        String str = null;
        if (c1419590n2rLLLFZ != null && (asset = c1419590n2rLLLFZ.LIZ) != null) {
            title = asset.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        sbLIZ.append(", holder = ");
        sbLIZ.append(LIZIZ(this.LLJLILLLLZIIL));
        sbLIZ.append(" - ");
        C1425080nBi c1425080nBiLIZIZ = LIZIZ(this.LLJLILLLLZIIL);
        if (c1425080nBiLIZIZ != null && (cutsameDataItem = c1425080nBiLIZIZ.LLJJ) != null) {
            str = cutsameDataItem.title;
        }
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C1425080nBi c1425080nBiLIZIZ2 = LIZIZ(this.LLJLILLLLZIIL);
        if (c1425080nBiLIZIZ2 != null) {
            c1425080nBiLIZIZ2.V5(z);
        }
        LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJJ(boolean r25) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424850nBL.LJJ(boolean):void");
    }

    public final void setCurTemplate(C1419590n2r c1419590n2r) {
        int iLLLI = this.LLJJLIIIJLLLLLLLZ.LLLI(c1419590n2r);
        int[] iArrLJIILL = this.LLJJL.LJIILL(null);
        int[] iArrLJIJ = this.LLJJL.LJIJ(null);
        int i = iArrLJIJ[0];
        if (iLLLI != i || iArrLJIILL[0] != i) {
            int i2 = iArrLJIJ[1];
            if (iLLLI == i2 && iArrLJIILL[1] == i2) {
                return;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.LLJJL;
            if (iLLLI % 2 == 1) {
                iLLLI--;
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(iLLLI, 0);
            HandlerHook.viewPost(this.LLJ, new ARunnableS122S0100000_22(this, 116));
        }
    }

    public final void setCurTemplateWhenInnerSelect(int i) {
        if (!((Boolean) C283140B7w.LIZ.getValue()).booleanValue()) {
            return;
        }
        this.LLJZIJLIL = true;
        this.LLJ.smoothScrollToPosition(i);
    }

    public final void setDiContainer(C1DRG c1drg) {
        C1424920nBS c1424920nBS = this.LLJJLIIIJLLLLLLLZ;
        c1424920nBS.LLJILJILJ = c1drg;
        c1424920nBS.notifyDataSetChanged();
    }

    public final void setInterceptPlayVideo(Function0<Boolean> function0) {
        this.LLJZ = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r14, java.lang.String r15) {
        /*
            r13 = this;
            int r0 = r13.LLJLILLLLZIIL
            X.0nBi r3 = r13.LIZIZ(r0)
            r9 = 0
            if (r3 == 0) goto L82
            boolean r0 = X.C299160Bo2.LIZ()
            if (r0 == 0) goto L68
            X.0nBp r0 = r3.P5()
            if (r0 == 0) goto L65
            long r0 = r0.LJIIL()
        L1a:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.0nBp r0 = r3.P5()
            if (r0 == 0) goto L62
            long r0 = r0.getDurationMs()
        L28:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r0)
        L31:
            X.0nBK r1 = r13.LLILZLL
            int r5 = r13.LLJLILLLLZIIL
            X.0nBS r0 = r13.LLJJLIIIJLLLLLLLZ
            X.0n2r r12 = r0.LLLFZ(r5)
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r6 = r13.LLILLL
            if (r3 == 0) goto L5f
            java.lang.Object r0 = r3.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            java.lang.Object r0 = r3.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
        L53:
            X.0n7c r2 = new X.0n7c
            r11 = 0
            r4 = r15
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12)
            r1.F1(r2)
            return
        L5f:
            r7 = 0
            goto L53
        L62:
            r0 = 0
            goto L28
        L65:
            r0 = 0
            goto L1a
        L68:
            X.0nBq r3 = r3.LLJJIJIIJIL
            if (r3 == 0) goto L82
            long r0 = r3.getCurrentPosition()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r3.getVideoDuration()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r0)
            goto L31
        L82:
            r3 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424850nBL.LJIIJ(int, java.lang.String):void");
    }

    public final void LJIIL(int i, boolean z) {
        if (!this.LLJLLL) {
            C1424920nBS c1424920nBS = this.LLJJLIIIJLLLLLLLZ;
            if (!c1424920nBS.LLJI && c1424920nBS.LLIZLLLIL && i >= ((int) C12ES.LIZJ(70.0f, this.LL))) {
                C1424920nBS c1424920nBS2 = this.LLJJLIIIJLLLLLLLZ;
                if (!c1424920nBS2.LLJJI && !c1424920nBS2.LLJI) {
                    c1424920nBS2.LLJI = true;
                    c1424920nBS2.notifyItemChanged(c1424920nBS2.LLIZ.size());
                }
                this.LLJLLL = true;
            }
        }
        if (i == 0 && z && this.LLJLLL) {
            this.LLJLLL = false;
            C1424920nBS c1424920nBS3 = this.LLJJLIIIJLLLLLLLZ;
            if (!c1424920nBS3.LLJ) {
                c1424920nBS3.LLJ = true;
                this.LLILZLL.LIZ(false);
            }
        }
    }

    public final void LJIIZILJ(List<C1419590n2r> list, C1422890n8B c1422890n8B) {
        boolean z;
        Integer num;
        View viewLIZIZ;
        ViewGroup viewGroup;
        InterfaceC1424900nBQ interfaceC1424900nBQ = this.LLILZIL;
        if (interfaceC1424900nBQ != null && interfaceC1424900nBQ.LIZ(this.LLILLL)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (list.isEmpty()) {
                LJIL();
                LIZ();
                if (!this.LLJJIJI) {
                    this.LLJJJJLIIL = false;
                    C786410Ut5.LLZZJLIL(this.LLJI, 8);
                }
                C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
                InterfaceC1424900nBQ interfaceC1424900nBQ2 = this.LLILZIL;
                if (interfaceC1424900nBQ2 != null && (viewLIZIZ = interfaceC1424900nBQ2.LIZIZ(this.LLILLL)) != null) {
                    try {
                        C786410Ut5.LJLLLLLL(4, viewLIZIZ);
                        ViewParent parent = viewLIZIZ.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            C786410Ut5.LJJJLZIJ(viewLIZIZ, viewGroup);
                        }
                        C786410Ut5.LJJJJI(this.LLJJ);
                        this.LLJJ.addView(viewLIZIZ);
                        HandlerHook.viewPost(this, new ARunnableS73S0200000_4(viewLIZIZ, this, 40));
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJIIIZ(C1398350mUb.LIZIZ, "TemplateListView", "onFetchTemplatesEmpty add empty view error", e);
                    }
                }
                C786410Ut5.LJLZ(0, this.LLJJ);
                this.LLJJLIIIJLLLLLLLZ.LLLII(list, c1422890n8B);
                C786410Ut5.LLIZLLLIL(this.LLJ, 8);
                return;
            }
            C786410Ut5.LJLZ(8, this.LLJJ);
            C786410Ut5.LLIZLLLIL(this.LLJ, 0);
        }
        if (!list.isEmpty()) {
            C786410Ut5.LLZZJLIL(this.LLJI, 0);
            LIZ();
            C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
            if (this.LLJJLIIIJLLLLLLLZ.LLIZ.isEmpty()) {
                this.LLJI.setScrollMode(EnumC481060Itk.REFRESH);
                this.LLJI.setOverScrollMode(EnumC19356710o9.ALWAYS);
            }
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView setTemplateList: category = ");
        sbLIZ.append(this.LLILLL.name);
        sbLIZ.append(": layout.isRefreshing = ");
        sbLIZ.append(this.LLJI.LLLFF);
        sbLIZ.append(", templateList.size = ");
        sbLIZ.append(list.size());
        sbLIZ.append(", useCache = ");
        sbLIZ.append(c1422890n8B.LIZJ);
        sbLIZ.append(", isRefreshing = ");
        sbLIZ.append(this.LLJJJJLIIL);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJIJI || this.LLJJJJLIIL) {
            LJIL();
        }
        boolean zLIZ = C1423860n9k.LIZ(list, this.LLJJLIIIJLLLLLLLZ.LLIZ);
        if (!zLIZ && (!C299160Bo2.LIZ() || c1422890n8B.LIZLLL <= this.LLJLILLLLZIIL)) {
            LJIJJLI(false);
            this.LLJLILLLLZIIL = -1;
            this.LLJLL = 0.0f;
        }
        C1424920nBS c1424920nBS = this.LLJJLIIIJLLLLLLLZ;
        if (!c1424920nBS.LLJJI && c1424920nBS.LLJI) {
            c1424920nBS.LLJI = false;
            c1424920nBS.notifyItemChanged(c1424920nBS.LLIZ.size());
        }
        this.LLJJLIIIJLLLLLLLZ.LLLII(list, c1422890n8B);
        if (this.LLL <= 0 && (!list.isEmpty())) {
            HandlerHook.viewPost(this, new ARunnableS110S0100000_10(this, 161));
        }
        if (C1423570n9H.LIZJ(this.LLILLL) && (num = c1422890n8B.LJII) != null) {
            HandlerHook.viewPost(this.LLJ, new ARunnableS21S0101000_10(num.intValue(), this, 10));
            c1422890n8B.LJII = null;
        }
        if (this.LLJLLIL) {
            this.LLJLLIL = false;
            HandlerHook.viewPost(this, new ARunnableS41S0110000_22(this, zLIZ, 10));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), null, null, new C641680PEw(this, null), 3);
    }

    public final boolean LJ(int i, View view, boolean z) {
        float height = view.getHeight() * this.LLJJJJ;
        if (z) {
            if (i - view.getTop() >= height) {
                return true;
            }
            return false;
        }
        if (view.getBottom() - i >= height) {
            return true;
        }
        return false;
    }

    public final boolean LJIILLIIL(float f, int i, boolean z) {
        String title;
        C1425080nBi c1425080nBiLIZIZ;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        Asset asset;
        Function0<Boolean> function0 = this.LLJZ;
        boolean z2 = false;
        if ((function0 == null || !function0.invoke().booleanValue()) && !this.LLLFF && !this.LLJJLIIIJLLLLLLLZ.LLIZ.isEmpty()) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateListView playItemVideo: index = ");
            sbLIZ.append(i);
            sbLIZ.append(", template = ");
            C1419590n2r c1419590n2rLLLFZ = this.LLJJLIIIJLLLLLLLZ.LLLFZ(i);
            if (c1419590n2rLLLFZ != null && (asset = c1419590n2rLLLFZ.LIZ) != null) {
                title = asset.getTitle();
            } else {
                title = null;
            }
            sbLIZ.append(title);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            C1425080nBi c1425080nBiLIZIZ2 = LIZIZ(i);
            if (c1425080nBiLIZIZ2 != null) {
                this.LLJLILLLLZIIL = i;
                c1425080nBiLIZIZ2.LLJJJ = this.LLLF;
                c1425080nBiLIZIZ2.S5(f, z);
                z2 = true;
            }
            int i2 = this.LLJLILLLLZIIL + 1;
            View viewFindViewByPosition = this.LLJJL.findViewByPosition(i2);
            if (viewFindViewByPosition != null && LJI(viewFindViewByPosition) && (c1425080nBiLIZIZ = LIZIZ(i2)) != null) {
                if (C299160Bo2.LIZ()) {
                    C1484970okJ c1484970okJN5 = c1425080nBiLIZIZ.N5();
                    if (c1484970okJN5 != null && (interfaceC1425150nBpP5 = c1425080nBiLIZIZ.P5()) != null) {
                        interfaceC1425150nBpP5.LJIILIIL(c1484970okJN5);
                        return z2;
                    }
                } else {
                    CutsameDataItem cutsameDataItem = c1425080nBiLIZIZ.LLJJ;
                    if (cutsameDataItem != null) {
                        Video videoLIZ = C1419160n2A.LIZ(cutsameDataItem);
                        C1425160nBq c1425160nBq = c1425080nBiLIZIZ.LLJJIJIIJIL;
                        if (c1425160nBq != null) {
                            c1425160nBq.preloadVideo(videoLIZ, 819200);
                            return z2;
                        }
                    }
                }
            }
        }
        return z2;
    }

    public final void LJIJJ(boolean z, C1419590n2r c1419590n2r, float f) {
        String title;
        Asset asset;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView startPlayTemplate: ");
        String title2 = null;
        if (c1419590n2r != null && (asset = c1419590n2r.LIZ) != null) {
            title = asset.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        sbLIZ.append(", seekProgress = ");
        sbLIZ.append(f);
        sbLIZ.append(", isFromLoadMoreTemplates: ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (c1419590n2r != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TemplateListView startPlayTemplate: ");
            Asset asset2 = c1419590n2r.LIZ;
            if (asset2 != null) {
                title2 = asset2.getTitle();
            }
            sbLIZ2.append(title2);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
            int iLLLI = this.LLJJLIIIJLLLLLLLZ.LLLI(c1419590n2r);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TemplateListView playTemplate: template = ");
            sbLIZ3.append(c1419590n2r.LIZ.getTitle());
            sbLIZ3.append(", pos = ");
            sbLIZ3.append(iLLLI);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
            LJIJJLI(false);
            if ((true ^ this.LLJJLIIIJLLLLLLLZ.LLIZ.isEmpty()) && !LJIILL(this, iLLLI, f, false, 4)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("TemplateListView playTemplate: template = ");
                sbLIZ4.append(c1419590n2r.LIZ.getTitle());
                sbLIZ4.append(", pos = ");
                sbLIZ4.append(iLLLI);
                sbLIZ4.append(", invisible");
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ4));
                LJIILJJIL(false);
                return;
            }
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ.getItemCount() > 0) {
            HandlerHook.viewPost(this, new ARunnableS41S0110000_22(this, z, 11));
        } else {
            this.LLJLLIL = true;
        }
    }

    public static boolean LJIILL(C1424850nBL c1424850nBL, int i, float f, boolean z, int i2) {
        String title;
        Asset asset;
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        View viewFindViewByPosition = c1424850nBL.LLJJL.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView playItemVideoIfVisible: index = ");
        sbLIZ.append(i);
        sbLIZ.append(", template = ");
        C1419590n2r c1419590n2rLLLFZ = c1424850nBL.LLJJLIIIJLLLLLLLZ.LLLFZ(i);
        if (c1419590n2rLLLFZ != null && (asset = c1419590n2rLLLFZ.LIZ) != null) {
            title = asset.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (!c1424850nBL.LJI(viewFindViewByPosition)) {
            return false;
        }
        return c1424850nBL.LJIILLIIL(f, i, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0nBM] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0nBO] */
    public C1424850nBL(C19EG c19eg, Scene scene, TemplateCategoryData templateCategoryData, List<Float> list, Function0<TemplateCategoryData> function0, InterfaceC1424900nBQ interfaceC1424900nBQ, InterfaceC1424840nBK interfaceC1424840nBK) {
        float fFloatValue;
        super(c19eg);
        List<Float> list2 = list;
        this.LL = c19eg;
        this.LLILLJJLI = scene;
        this.LLILLL = templateCategoryData;
        this.LLILZ = function0;
        this.LLILZIL = interfaceC1424900nBQ;
        this.LLILZLL = interfaceC1424840nBK;
        View viewSd = C786410Ut5.Sd(R.layout.f862ss, C786410Ut5.ne(C1425570nCV.LIZIZ.LJFF(scene.requireSceneContext())), this);
        this.LLIZ = viewSd;
        this.LLIZLLLIL = (ViewGroup) viewSd.findViewById(R.id.eu1);
        RecyclerView recyclerView = (RecyclerView) viewSd.findViewById(R.id.t0q);
        this.LLJ = recyclerView;
        this.LLJI = (C16FB) viewSd.findViewById(R.id.wsd);
        this.LLJIJIL = (TuxSkeletonLayout) viewSd.findViewById(R.id.nmp);
        this.LLJILJIL = (TuxSkeletonLayout) viewSd.findViewById(R.id.nmr);
        View viewFindViewById = viewSd.findViewById(R.id.hbe);
        this.LLJILJILJ = viewFindViewById;
        this.LLJILLL = (TuxIconView) viewFindViewById.findViewById(R.id.jxe);
        this.LLJJ = (ViewGroup) viewSd.findViewById(R.id.h2t);
        View viewFindViewById2 = viewSd.findViewById(R.id.tec);
        this.LLJJI = viewFindViewById2;
        C11VU.LIZIZ(20.0f, c19eg);
        if (list2 == null) {
            if (C1425070nBh.LIZJ.nextInt(2) == 0) {
                list2 = C1425070nBh.LIZ;
            } else {
                list2 = C1425070nBh.LIZIZ;
            }
        }
        this.LLJJIJIIJIL = list2;
        this.LLJJIJIL = true;
        C01GW c01gw = C0A01.LIZ;
        if (((Number) c01gw.getValue()).floatValue() > 0.0f && ((Number) c01gw.getValue()).floatValue() < 1.0f) {
            fFloatValue = ((Number) c01gw.getValue()).floatValue();
        } else {
            fFloatValue = 0.33f;
        }
        this.LLJJJJ = fFloatValue;
        this.LLJJJJJIL = new C1232704s1();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.LLJJL = staggeredGridLayoutManager;
        C1424920nBS c1424920nBS = new C1424920nBS(c19eg, scene, list2, new C1424870nBN(this), templateCategoryData, new InterfaceC1424890nBP() { // from class: X.0nBO
            @Override // X.InterfaceC1424890nBP
            public final void LIZ(boolean z) {
                this.LIZ.LLILZLL.LIZ(true);
            }

            @Override // X.InterfaceC1424890nBP
            public final void LIZJ(int i, C1419590n2r c1419590n2r) {
                this.LIZ.LLILZLL.LIZJ(i, c1419590n2r);
            }

            @Override // X.InterfaceC1424890nBP
            public final void LJ(C1419590n2r c1419590n2r, boolean z) {
                this.LIZ.LLILZLL.LJ(c1419590n2r, z);
            }

            @Override // X.InterfaceC1424890nBP
            public final void LJI(C1419590n2r c1419590n2r, SmartImageView smartImageView, int i, float f, Bitmap bitmap) {
                if (C299160Bo2.LIZ()) {
                    this.LIZ.LJIJJLI(false);
                }
                this.LIZ.LLILZLL.LJI(c1419590n2r, smartImageView, i, f, bitmap);
                if (!C299160Bo2.LIZ()) {
                    this.LIZ.LJIJJLI(false);
                }
            }
        });
        this.LLJJLIIIJLLLLLLLZ = c1424920nBS;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1021));
        this.LLJL = c01gwLIZIZ;
        this.LLJLIL = ((Boolean) C0BOL.LIZ.getValue()).booleanValue();
        this.LLLF = new InterfaceC1425290nC3() { // from class: X.0nBM
            @Override // X.InterfaceC1425250nBz
            public final void LJL(boolean z) {
            }

            @Override // X.InterfaceC1425250nBz
            public final void onVideoSizeChanged(int i, int i2) {
            }

            public final void LIZLLL() {
                this.LIZ.LLJJIII = System.currentTimeMillis();
                C1424850nBL c1424850nBL = this.LIZ;
                if (C1424850nBL.LJIILL(c1424850nBL, c1424850nBL.LLJLILLLLZIIL + 1, 0.0f, false, 6)) {
                    return;
                }
                this.LIZ.LJIILJJIL(false);
            }

            @Override // X.InterfaceC1425250nBz
            public final void LIZIZ(InterfaceC1425020nBc interfaceC1425020nBc) {
                String id;
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderFirstFrame: ");
                sbLIZ.append(this.LIZ.LLJLILLLLZIIL);
                sbLIZ.append(" sourceId=");
                if (interfaceC1425020nBc != null) {
                    id = interfaceC1425020nBc.getId();
                } else {
                    id = null;
                }
                sbLIZ.append(id);
                C201955140j.LIZLLL(c1398350mUb, "TemplateListView", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LLJJIII = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1425250nBz
            public final void LIZJ(InterfaceC1425330nC7 interfaceC1425330nC7) {
                Integer numValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayFailed: ");
                sbLIZ.append(this.LIZ.LLJLILLLLZIIL);
                sbLIZ.append(" - ");
                if (interfaceC1425330nC7 != null) {
                    numValueOf = Integer.valueOf(interfaceC1425330nC7.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                LIZLLL();
            }

            @Override // X.InterfaceC1425250nBz
            public final void onPlayCompleted(String str) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayCompleted: ");
                sbLIZ.append(this.LIZ.LLJLILLLLZIIL);
                sbLIZ.append(" sourceId=");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c1398350mUb, "TemplateListView", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJIIJ(4, str);
                this.LIZ.LJIIIZ();
                LIZLLL();
            }

            @Override // X.InterfaceC1425250nBz
            public final void onPlayPause(String str) {
                this.LIZ.LJIIJ(2, str);
            }

            @Override // X.InterfaceC1425250nBz
            public final void onPlayStop(String str) {
                this.LIZ.LJIIJ(3, str);
            }

            @Override // X.InterfaceC1425250nBz
            public final void onResumePlay(String str) {
                this.LIZ.LJIIJ(1, str);
            }

            @Override // X.InterfaceC1425290nC3
            public final void LIZ(InterfaceC1425020nBc interfaceC1425020nBc, boolean z) {
                String id;
                if (!z) {
                    C1424850nBL c1424850nBL = this.LIZ;
                    if (interfaceC1425020nBc != null) {
                        id = interfaceC1425020nBc.getId();
                    } else {
                        id = null;
                    }
                    c1424850nBL.LJIIJ(0, id);
                }
            }
        };
        AsS49S0100000_22 asS49S0100000_22 = new AsS49S0100000_22(this, 7);
        if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotationY(180.0f);
        }
        this.LLJI.setOnRefreshListener(new AwS566S0100000_22(this, 1020));
        this.LLJI.setOnScrollChangeListener(new AwS671S0100000_22(this, 8));
        staggeredGridLayoutManager.LJJIL(0);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(c1424920nBS);
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(asS49S0100000_22);
        C786410Ut5.I7(new C1466570oGd(this, 30), viewFindViewById2);
        List<Float> list3 = C1425070nBh.LIZ;
        C1425070nBh.LIZ(getLoadingView(), this.LLJLIL, this.LLJJIJIIJIL);
        LJIJI();
    }
}
