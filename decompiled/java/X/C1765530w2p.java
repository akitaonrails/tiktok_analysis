package X;

import Y.ARunnableS105S0100000_5;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1765530w2p extends AbstractC1585810rMx implements InterfaceC1761370vw7, InterfaceC1763180vz2, InterfaceC1765420w2e, InterfaceC21650419oE {
    public final View LL;
    public final List<AbstractC1763110vyv> LLILLJJLI;
    public final InterfaceC1765560w2s LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final C1765550w2r[] LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.InterfaceC21650419oE
    public void gA(int i) {
    }

    @Override // X.InterfaceC21650419oE
    public void kG(float f, int i) {
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
    }

    @Override // X.InterfaceC21650419oE
    public void xP(int i) {
    }

    @Override // X.InterfaceC1761370vw7
    public void LJFF() {
        ViewGroup viewGroup;
        ViewParent parent = this.LL.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
    }

    public void LJJJ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (LJJIZ(this.LLIZLLLIL)) {
            C1765550w2r[] c1765550w2rArr = this.LLJI;
            int i = this.LLIZLLLIL;
            C1765550w2r c1765550w2r = c1765550w2rArr[i];
            if (!c1765550w2r.LIZIZ && i != this.LLJ) {
                c1765550w2r.LIZIZ = true;
                InterfaceC1765560w2s interfaceC1765560w2s = this.LLILLL;
                if (interfaceC1765560w2s != null) {
                    interfaceC1765560w2s.onShow(i);
                }
                if (this.LLILZIL == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("photo_search_indicator_tool_tips");
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                    sbLIZ.append(iAccountDependencyService.isLogin() ? iAccountDependencyService.getUserId() : "FAKE_USER");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!((Keva) this.LLJILJIL.getValue()).getBoolean(strLIZIZ, false)) {
                        ((Keva) this.LLJILJIL.getValue()).storeBoolean(strLIZIZ, true);
                        HandlerHook.viewPost(this.LL, new ARunnableS105S0100000_5(this, 126));
                    }
                }
            }
        }
        LJJIL(this.LLIZLLLIL);
    }

    public void hide() {
        C786410Ut5.LJLLLLLL(8, this.LL);
    }

    public void show() {
        C786410Ut5.LJLLLLLL(0, this.LL);
    }

    @Override // X.InterfaceC1765420w2e
    public final void LJIJJLI(float f) {
        if (this.LLILZ || this.LLILZIL == 2) {
            if (f > 1.0f) {
                hide();
            } else if (LJJIZ(this.LLJ)) {
                show();
            } else {
                hide();
            }
        }
    }

    public void LJJIJIIJIL(FrameLayout frameLayout) {
        if (this.LLILZ) {
            View view = this.LL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), 80);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
            C786410Ut5.W5(view, layoutParams);
        } else {
            View view2 = this.LL;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388613);
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51));
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            C786410Ut5.W5(view2, layoutParams2);
        }
        frameLayout.addView(this.LL);
    }

    public final void LJJIL(int i) {
        if (i < 0) {
            this.LLJ = 0;
            return;
        }
        int i2 = this.LLILZLL;
        if (i >= i2) {
            this.LLJ = i2 - 1;
        } else {
            this.LLJ = i;
        }
    }

    public final boolean LJJIZ(int i) {
        if (i < 0 || i > this.LLILZLL - 1) {
            return false;
        }
        if (((AbstractC1763110vyv) ListProtector.get(this.LLILLJJLI, i)).LIZIZ() != EnumC1761790vwn.PHOTO && ((AbstractC1763110vyv) ListProtector.get(this.LLILLJJLI, i)).LIZIZ() != EnumC1761790vwn.PHOTO_INFO) {
            return false;
        }
        if (this.LLJIJIL && i >= this.LLILZLL - 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1761370vw7
    public void onPageSelected(int i) {
        this.LLIZLLLIL = i;
        if (this.LLIZ) {
            this.LLIZ = false;
            LJJJ();
            LJJIL(i);
        }
        if (LJJIZ(i)) {
            show();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        C786410Ut5.T4(this.LL, f);
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        LJJIJIIJIL(frameLayout);
        C786410Ut5.I7(new AjS70S0100000_26(this, 96), this.LL);
    }

    @Override // X.InterfaceC1763180vz2
    public void LJIIJJI(RectF rectF, int i) {
        C1765550w2r c1765550w2r = this.LLJI[i];
        c1765550w2r.LIZ = true;
        c1765550w2r.LIZJ = rectF;
    }

    @Override // X.AbstractC1585810rMx
    public void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1765530w2p(View view, List<? extends AbstractC1763110vyv> list, InterfaceC1765560w2s interfaceC1765560w2s, boolean z, int i) {
        this.LL = view;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1765560w2s;
        this.LLILZ = z;
        this.LLILZIL = i;
        int size = ((ArrayList) list).size();
        this.LLILZLL = size;
        this.LLIZ = true;
        this.LLJ = -1;
        C1765550w2r[] c1765550w2rArr = new C1765550w2r[size];
        for (int i2 = 0; i2 < size; i2++) {
            c1765550w2rArr[i2] = new C1765550w2r();
        }
        this.LLJI = c1765550w2rArr;
        this.LLJILJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(506));
    }
}
