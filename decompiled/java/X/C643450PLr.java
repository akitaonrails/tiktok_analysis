package X;

import Y.ARunnableS21S0101000_10;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0PLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643450PLr extends AbstractC643470PLt implements InterfaceC1212360hec<Aweme>, InterfaceC645470PTl<AbstractC661100PwS>, InterfaceC1255930imt, InterfaceC666290QBn {
    public int LLJ;
    public C643480PLu LLJI;
    public final String LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public C0P7W LLJILLL;
    public boolean LLJJ;

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ boolean B1(C0PN0 c0pn0) {
        return false;
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void IK(int[] iArr) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void Js(List list) {
    }

    @Override // X.AbstractC643470PLt
    public final C645140PSe LJJJJ() {
        C645140PSe c645140PSe = this.LLILZIL;
        return c645140PSe != null ? c645140PSe : new C645140PSe(this, this.LLJIJIL, this.LL, this, this.LLJILJILJ);
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void LLLZZIL(List list) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void V1(int i, Object obj) {
    }

    @Override // X.AbstractC739960T0w
    public final void initPanel() {
    }

    @Override // X.InterfaceC1255930imt
    public final void w(int i, List list) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.InterfaceC645470PTl
    public final /* synthetic */ void zt(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.AbstractC643470PLt
    public final RecyclerView.LayoutManager xj0() {
        return new WrapGridLayoutManager(C1616640sAg.LIZ(null), 1, getContext(), false);
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
        if (isViewValid() && !this.LLJILJIL) {
            this.LLJI.setRefreshing(true);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        if (isViewValid()) {
            if (this.LLILZIL.getItemCount() == 0) {
                this.LLJI.setRefreshing(false);
            } else {
                this.LLJI.setRefreshing(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    @Override // X.AbstractC643470PLt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0DXR LJJJJJ() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643450PLr.LJJJJJ():X.0DXR");
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (isViewValid()) {
            this.LLJI.setRefreshing(false);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        if (isViewValid()) {
            this.LLILZIL.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC645470PTl
    public final void Tr(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null) {
            isViewValid();
        }
    }

    @Override // X.InterfaceC666290QBn
    public final void Uh(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LLJI.setRefreshing(false);
        if (this.LLJJ) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.activity);
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LLILZIL.showLoadMoreError();
    }

    @Override // X.InterfaceC1255930imt
    public final void Y1(int i) {
        if (isViewValid()) {
            this.LLILZIL.notifyItemRemoved(i);
            if (i != 0) {
                C645140PSe c645140PSe = this.LLILZIL;
                Boolean bool = Boolean.FALSE;
                c645140PSe.notifyItemChanged(i, bool);
                this.LLILZIL.notifyItemChanged(i + 1, bool);
                this.LLILZIL.notifyItemChanged(i + 2, bool);
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LLJI.setRefreshing(false);
        if (!this.LLJILJIL) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.activity);
            c1233040iBy.LIZIZ(R.string.l6n);
            c1233040iBy.LIZLLL();
        }
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof WrapGridLayoutManager) {
                ((GridLayoutManager) layoutManager).LJIJ(C1616640sAg.LIZ(null));
                this.LLILZ.invalidateItemDecorations();
            }
        }
    }

    public C643450PLr(InterfaceC659300PtY interfaceC659300PtY, InterfaceC683650Qrj interfaceC683650Qrj) {
        super(interfaceC659300PtY, interfaceC683650Qrj);
        this.LLJIJIL = "search_result";
        this.LLJILJILJ = 9;
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        this.LLJI.setRefreshing(false);
        this.LLJJ = true;
        this.LLILZIL.setShowFooter(true);
        this.LLILZIL.setData(list);
        if (z) {
            this.LLILZIL.resetLoadMoreState();
        } else {
            this.LLILZIL.showLoadMoreEmpty();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        this.LLJI.setRefreshing(false);
        this.LLILZIL.setDataAfterLoadMore(list);
        if (z) {
            this.LLILZIL.resetLoadMoreState();
        } else {
            this.LLILZIL.showLoadMoreEmpty();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (!z && !this.LLJILJIL) {
            if (getUserVisibleHint() && this.activity != null) {
                C1233040iBy c1233040iBy = new C1233040iBy(this.activity);
                c1233040iBy.LIZIZ(2131830409);
                c1233040iBy.LIZLLL();
                HandlerHook.viewPost(this.LLILZ, new ARunnableS21S0101000_10(this, 9));
            }
        } else {
            this.LLILZIL.setDataAfterLoadLatest(list);
            if (!this.LLJILJIL && isActive()) {
                HandlerHook.viewPost(this.LLILZ, new ARunnableS21S0101000_10(this, 9));
            }
        }
        this.LLJI.setRefreshing(false);
    }

    @Override // X.AbstractC643470PLt, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJI = new C643480PLu((C21609119hZ) view.findViewById(R.id.t25));
    }

    @Override // X.AbstractC643470PLt
    public final void LJJJJJL(C737030Svd c737030Svd, int i, Aweme aweme, long j) {
        Taco tacoLIZIZ;
        String identifier;
        super.LJJJJJL(c737030Svd, i + this.LLJ, aweme, j);
        Fragment fragment = getFragment();
        if (fragment == null || fragment.isDetached() || (tacoLIZIZ = C0PCE.LIZIZ(fragment)) == null) {
            return;
        }
        C0P74 c0p74 = tacoLIZIZ.LIZLLL().get(19);
        if (c0p74 instanceof C641550PEj) {
            final C641550PEj c641550PEj = (C641550PEj) c0p74;
            final String aid = aweme.getAid();
            c641550PEj.getClass();
            if (aid != null && aid.length() != 0) {
                ((LiveData) c641550PEj.LLILLL.getValue()).setValue(0);
                RecyclerView recyclerView = c641550PEj.LLILLJJLI;
                if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                    c641550PEj.LIZIZ(aid, true);
                } else {
                    recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0PEm
                        public final /* synthetic */ boolean LLILLL = true;

                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            view.removeOnLayoutChangeListener(this);
                            c641550PEj.LIZIZ(aid, this.LLILLL);
                        }
                    });
                }
            }
            C0P7W c0p7w = this.LLJILLL;
            if (c0p7w != null) {
                identifier = c0p7w.getIdentifier();
            } else {
                identifier = "";
            }
            String strLIZ = C0P7S.LIZ(identifier, aweme.getAid());
            C661510Px7 c661510Px7 = C661510Px7.LIZ;
            boolean z = !c737030Svd.LJIIIZ;
            long j2 = c737030Svd.LJIIIIZZ;
            c661510Px7.getClass();
            C661510Px7.LIZJ(j, j2, aweme, strLIZ, z);
        }
    }
}
