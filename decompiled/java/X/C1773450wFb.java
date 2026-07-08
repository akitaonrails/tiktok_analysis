package X;

import Y.ARunnableS126S0100000_26;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabBarCardItem;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem;
import com.ss.android.ugc.aweme.ecommerce.performance.EcMallMemOptConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773450wFb extends AbstractC1773460wFc<C1773710wG1> {
    public final View LLJJIJI;
    public final C20632315oP LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;

    public final void u6() {
        C1773130wF5 c1773130wF5;
        int i = this.LLJJJJ;
        if (i == -1 || i != this.LLJJIJIIJIL.getCurrentItem()) {
            return;
        }
        RecyclerView recyclerViewV6 = v6();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerViewV6 != null ? recyclerViewV6.findViewHolderForAdapterPosition(i) : null;
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof C1773130wF5) || (c1773130wF5 = (C1773130wF5) viewHolderFindViewHolderForAdapterPosition) == null) {
            return;
        }
        c1773130wF5.T5();
        c1773130wF5.S5();
        this.LLJJJJ = -1;
        C6(c1773130wF5);
    }

    public final RecyclerView v6() {
        View childAt = this.LLJJIJIIJIL.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    @Override // X.AbstractC1773460wFc
    public final void b6() {
        T5();
        C1773710wG1 c1773710wG1 = (C1773710wG1) this.LLILLL;
        if (c1773710wG1 == null) {
            return;
        }
        z6(c1773710wG1.LJJIFFI, true);
    }

    @Override // X.AbstractC1773460wFc
    public final void c6() {
        r6();
        C1773710wG1 c1773710wG1 = (C1773710wG1) this.LLILLL;
        if (c1773710wG1 == null) {
            return;
        }
        z6(c1773710wG1.LJJIFFI, false);
    }

    public final void C6(C1773130wF5 c1773130wF5) {
        C1773640wFu c1773640wFu;
        InterfaceC1771900wD6 interfaceC1771900wD6;
        View view = c1773130wF5.itemView;
        if ((view instanceof C1773640wFu) && (c1773640wFu = (C1773640wFu) view) != null && (interfaceC1771900wD6 = (InterfaceC1771900wD6) this.LL.LIZJ().getService(InterfaceC1771900wD6.class)) != null) {
            interfaceC1771900wD6.LJIIIIZZ(c1773640wFu, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6(X.C1773710wG1 r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r4.LLILLJJLI
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO r0 = r5.LJJIIJ
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor r3 = r0.gradientColorDark
        L11:
            if (r3 == 0) goto L4c
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            r2.<init>(r0)
            X.15oP r0 = r4.LLJJIJIIJIL
            int r0 = r0.getHeight()
            if (r0 != 0) goto L42
            X.0wFN r0 = r4.LL
            X.0wEJ r0 = r0.LIZLLL()
            X.0wDh r0 = r0.LJ
            X.18Z6 r0 = r0.getBodyList()
        L31:
            android.graphics.Paint r1 = r2.getPaint()
            android.graphics.LinearGradient r0 = X.C423800Gja.LIZ(r3, r0)
            r1.setShader(r0)
            X.15oP r0 = r4.LLJJIJIIJIL
            r0.setBackground(r2)
            return
        L42:
            X.15oP r0 = r4.LLJJIJIIJIL
            goto L31
        L45:
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO r0 = r5.LJJIIJ
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor r3 = r0.gradientColor
            goto L11
        L4c:
            android.view.View r0 = r4.LLJJIJI
            android.content.Context r0 = r0.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO r0 = r5.LJJIIJ
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.colorDark
            if (r0 == 0) goto L6a
            int r1 = X.C1774710wHd.LIZ(r0)
        L64:
            X.15oP r0 = r4.LLJJIJIIJIL
            r0.setBackgroundColor(r1)
            return
        L6a:
            int r1 = r4.LLJJJ
            goto L64
        L6d:
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO r0 = r5.LJJIIJ
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.color
            if (r0 == 0) goto L7a
            int r1 = X.C1774710wHd.LIZ(r0)
            goto L64
        L7a:
            int r1 = r4.LLJJIJIL
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773450wFb.D6(X.0wG1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    @Override // X.AbstractC1773460wFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.AbstractC1773210wFD r9) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773450wFb.P5(X.0wFD):void");
    }

    public final void w6(int i) {
        boolean z;
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        List<C1772690wEN> list2;
        C1772690wEN c1772690wEN2;
        String str;
        C1774040wGY c1774040wGYLIZJ;
        TabBarCardItem tabBarCardItem;
        List<TabItem> list3;
        TabItem tabItem;
        C1774470wHF c1774470wHF;
        List<TabItem> list4;
        String str2;
        View view;
        View view2;
        C1773710wG1 c1773710wG1 = (C1773710wG1) this.LLILLL;
        if (c1773710wG1 == null) {
            return;
        }
        int i2 = c1773710wG1.LJJIFFI;
        int i3 = ((EcMallMemOptConfig) C1771710wCn.LIZIZ.getValue()).multiTabOffscreenPageLimit;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && i2 == i) {
            if (this.LLJJJJ != i) {
                return;
            }
            C1773130wF5 c1773130wF5Z6 = z6(i, true);
            if (c1773130wF5Z6 == null) {
                Object parent = this.LLJJIJIIJIL.getParent();
                if ((parent instanceof View) && (view2 = (View) parent) != null) {
                    HandlerHook.viewPost(view2, new ARunnableS126S0100000_26(this, 138));
                    return;
                }
                return;
            }
            this.LLJJJJ = -1;
            C6(c1773130wF5Z6);
            return;
        }
        c1773710wG1.LJJII = c1773710wG1.LJJIFFI;
        c1773710wG1.LJJIFFI = i;
        z6(i2, false);
        C1773130wF5 c1773130wF5Z62 = z6(i, true);
        if (z) {
            if (c1773130wF5Z62 == null) {
                this.LLJJJJ = i;
                Object parent2 = this.LLJJIJIIJIL.getParent();
                if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                    HandlerHook.viewPost(view, new ARunnableS126S0100000_26(this, 138));
                }
            } else {
                this.LLJJJJ = -1;
                C6(c1773130wF5Z62);
            }
        } else if (c1773130wF5Z62 != null) {
            C6(c1773130wF5Z62);
        }
        C1774450wHD c1774450wHD = (C1774450wHD) this.LL.LIZJ().getService(C1774450wHD.class);
        if (c1774450wHD != null && i != c1774450wHD.LL.getSelectedPosition()) {
            AbstractC21673619ry adapter = c1774450wHD.LL.getAdapter();
            if ((adapter instanceof C1774470wHF) && (c1774470wHF = (C1774470wHF) adapter) != null && (list4 = c1774470wHF.LLILZ) != null && C13LP.LJJJLZIJ(i, list4) != null) {
                if (c1774450wHD.LL.getSelectedPosition() == -1) {
                    str2 = "default";
                } else {
                    str2 = "slide";
                }
                c1774450wHD.LL.LJ(i, str2, false);
            }
        }
        InterfaceC1772410wDv interfaceC1772410wDvLIZ = C1774010wGV.LIZ(this.LL.LIZJ());
        if (interfaceC1772410wDvLIZ != null) {
            interfaceC1772410wDvLIZ.LJIILIIL(i);
        }
        C1773710wG1 c1773710wG12 = (C1773710wG1) this.LLILLL;
        if (c1773710wG12 != null && (list2 = c1773710wG12.LJJIII) != null && (c1772690wEN2 = (C1772690wEN) C13LP.LJJJLZIJ(i, list2)) != null) {
            c1772690wEN2.LJIIJ = i + 1;
            C1772630wEH c1772630wEHC82 = this.LL.LJIIIZ().c82();
            if (c1772630wEHC82 == null || (c1774040wGYLIZJ = c1772630wEHC82.LIZJ()) == null || (tabBarCardItem = c1774040wGYLIZJ.LJJ) == null || (list3 = tabBarCardItem.data) == null || (tabItem = (TabItem) C13LP.LJJJLZIJ(i, list3)) == null || (str = tabItem.nameEn) == null) {
                str = "";
            }
            c1772690wEN2.LJIIJJI = str;
        }
        C1773710wG1 c1773710wG13 = (C1773710wG1) this.LLILLL;
        if (c1773710wG13 != null && (list = c1773710wG13.LJJIII) != null && (c1772690wEN = (C1772690wEN) C13LP.LJJJLZIJ(i, list)) != null) {
            this.LL.LIZ().LJ("mix_mall_current_tab", C2097608Jq.LJIIIIZZ(new Pair("name_en", c1772690wEN.LJIIJJI), new Pair("index", Integer.valueOf(c1772690wEN.LJIIJ)), new Pair(FollowStatusChangeMethod.PARAM_UID, c1772690wEN.LIZLLL)), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            this.LL.LIZ().LJ("previous_list_name", c1772690wEN.LJIIJJI, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        }
    }

    public C1773450wFb(View view, InterfaceC1773310wFN interfaceC1773310wFN) {
        RecyclerView recyclerViewV6;
        RecyclerView recyclerView;
        Integer num;
        super(view, interfaceC1773310wFN);
        this.LLJJIJI = view;
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.view_page);
        this.LLJJIJIIJIL = c20632315oP;
        this.LLJJIJIL = -657931;
        this.LLJJJ = -16777216;
        this.LLJJJJ = -1;
        try {
            int scaledPagingTouchSlop = ViewConfiguration.get(this.LLILLJJLI).getScaledPagingTouchSlop();
            Field declaredField = C20632315oP.class.getDeclaredField("LLJI");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(c20632315oP);
            if (obj instanceof RecyclerView) {
                recyclerView = (RecyclerView) obj;
            } else {
                recyclerView = null;
            }
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(recyclerView);
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                scaledPagingTouchSlop = num.intValue();
            }
            declaredField2.set(recyclerView, Integer.valueOf((int) (scaledPagingTouchSlop * 3.0f)));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = ((EcMallMemOptConfig) C1771710wCn.LIZIZ.getValue()).multiTabOffscreenPageLimit;
        if (i >= 0 && i > 0 && (recyclerViewV6 = v6()) != null) {
            recyclerViewV6.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0wGX
                @Override // X.InterfaceC21676519sR
                public final void m3(View view2) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view2) {
                    this.LL.u6();
                }
            });
        }
    }

    public final C1773130wF5 z6(int i, boolean z) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1773130wF5 c1773130wF5;
        Set<Function1<Integer, Unit>> scrollListeners;
        Set<Function1<Integer, Unit>> scrollListeners2;
        AbstractC1773460wFc abstractC1773460wFc;
        RecyclerView recyclerViewV6 = v6();
        if (recyclerViewV6 != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerViewV6.findViewHolderForAdapterPosition(i);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if (viewHolderFindViewHolderForAdapterPosition instanceof C1773130wF5) {
            c1773130wF5 = (C1773130wF5) viewHolderFindViewHolderForAdapterPosition;
        } else {
            c1773130wF5 = null;
        }
        if (z) {
            if (c1773130wF5 != null) {
                c1773130wF5.S5();
            }
        } else if (c1773130wF5 != null) {
            int childCount = c1773130wF5.LL.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = c1773130wF5.LL.getChildViewHolder(c1773130wF5.LL.getChildAt(i2));
                if ((childViewHolder instanceof AbstractC1773460wFc) && (abstractC1773460wFc = (AbstractC1773460wFc) childViewHolder) != null) {
                    abstractC1773460wFc.c6();
                }
            }
            AwS605S0100000_26 awS605S0100000_26 = c1773130wF5.LLIZ;
            if (awS605S0100000_26 != null) {
                C1773650wFv c1773650wFv = c1773130wF5.LL;
                if (c1773650wFv != null && (scrollListeners2 = c1773650wFv.getScrollListeners()) != null) {
                    scrollListeners2.remove(awS605S0100000_26);
                }
                C1773640wFu c1773640wFu = (C1773640wFu) c1773130wF5.LLILZLL.getValue();
                if (c1773640wFu != null && (scrollListeners = c1773640wFu.getScrollListeners()) != null) {
                    scrollListeners.remove(awS605S0100000_26);
                    return c1773130wF5;
                }
            }
        }
        return c1773130wF5;
    }
}
