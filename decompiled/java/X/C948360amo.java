package X;

import Y.ARunnableS26S0101000_15;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0amo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C948360amo extends AbstractC2172971A2l<C948400ams, C948380amq> {
    public final String LLILLJJLI;
    public final InterfaceC930220aJY LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public InterfaceC948410amt LLIZLLLIL;
    public final C01GW LLJ;

    public final int LLLIIIIL() {
        int i = this.LLILZLL;
        return (i < 0 || i >= getItemCount()) ? this.LLILLL.getPanelLayoutType() : LLLFZ(i).LIZIZ;
    }

    public int LLLIILIL() {
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int iLIZIZ = (int) C497740JfY.LIZIZ(80.0f);
        int iLIZ = C439101nJ.LIZ(72) * getItemCount();
        int itemCount = getItemCount() - 1;
        if ((iLJIIZILJ - (C439101nJ.LIZ(16) * 2)) - iLIZ <= 0 || itemCount <= 0) {
            return (int) ((iLJIIZILJ - ((int) C497740JfY.LIZIZ(16.0f))) % iLIZIZ != 0 ? C497740JfY.LIZIZ(8.0f) : C497740JfY.LIZIZ(4.0f));
        }
        return ((iLJIIZILJ - (C439101nJ.LIZ(16) * 2)) - iLIZ) / itemCount;
    }

    public /* synthetic */ C948360amo(InterfaceC930220aJY interfaceC930220aJY) {
        this("setting_panel", interfaceC930220aJY);
    }

    public C948380amq LLLILZLLLI(ViewGroup viewGroup) {
        View viewTd;
        if (Intrinsics.LJFF(this.LLILLJJLI, "setting_panel")) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h_y, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h_z, viewGroup, false);
        }
        return new C948380amq(viewTd);
    }

    public final void LLLJ(int i) {
        try {
            if (this.LLILZLL != i) {
                int itemCount = getItemCount();
                int i2 = this.LLILZLL;
                if (i2 >= 0 && i2 < itemCount) {
                    this.LLILZIL = i2;
                    this.LLILZ = this.LLILLL.LJII(LLLFZ(i2).LIZIZ) - 1;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILZLL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLJIL(int r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 < 0) goto L28
            int r0 = r3.getItemCount()
            if (r4 >= r0) goto L28
            java.lang.Object r0 = r3.LLLFZ(r4)
            X.0ams r0 = (X.C948400ams) r0
            X.0act r1 = X.C942210act.LIZ
            int r0 = r0.LIZIZ
            r1.getClass()
            java.util.List r0 = X.C942210act.LJI(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            r1 = 1
        L21:
            int r0 = r3.LLILZLL
            if (r0 != r4) goto L2a
            if (r1 == 0) goto L2a
            return r2
        L28:
            r1 = 0
            goto L21
        L2a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C948360amo.LLLJIL(int):boolean");
    }

    public final void LLLJL(int i) {
        Iterator it2 = this.LL.LJFF.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((C948400ams) it2.next()).LIZIZ == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = this.LLILZLL;
        if (i2 != i3) {
            LLLJ(i2);
            if (i3 >= 0 && i3 < getItemCount()) {
                notifyItemChanged(i3);
            }
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
        }
    }

    public C948360amo(String str, InterfaceC930220aJY interfaceC930220aJY) {
        super(new AbstractC339510DSr<C948400ams>() { // from class: X.0amr
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C948400ams c948400ams, C948400ams c948400ams2) {
                return Intrinsics.LJFF(c948400ams, c948400ams2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C948400ams c948400ams, C948400ams c948400ams2) {
                C948400ams c948400ams3 = c948400ams;
                C948400ams c948400ams4 = c948400ams2;
                if (c948400ams3.LIZ == c948400ams4.LIZ && c948400ams3.LIZIZ == c948400ams4.LIZIZ) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC930220aJY;
        this.LLILZLL = 1;
        this.LLIZ = -1;
        this.LLJ = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(353));
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIL, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C948380amq c948380amq, int i) {
        int iIntValue;
        InterfaceC948410amt interfaceC948410amt;
        int iIntValue2;
        C948400ams c948400amsLLLFZ = LLLFZ(i);
        c948380amq.LLILLL.setText(c948400amsLLLFZ.LIZJ);
        c948380amq.LLILLJJLI.setImageResource(c948400amsLLLFZ.LIZLLL);
        if (C934890aR5.LIZ()) {
            C500260Jjc.LJLL(C439101nJ.LIZ(64), C439101nJ.LIZ(102), c948380amq.LLILLJJLI);
        }
        if (c948400amsLLLFZ.LIZ) {
            C16F5 c16f5 = c948380amq.LLILLL;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, c948380amq.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            c16f5.setTextColor(iIntValue2);
            C786410Ut5.V4(c948380amq.LLILLJJLI, 1.0f);
        } else {
            C16F5 c16f52 = c948380amq.LLILLL;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezy, c948380amq.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            c16f52.setTextColor(iIntValue);
            C786410Ut5.V4(c948380amq.LLILLJJLI, 0.34f);
        }
        if (C934890aR5.LIZ() && LLLJIL(i)) {
            C948400ams c948400amsLLLFZ2 = LLLFZ(i);
            C786410Ut5.LLJJJJ(c948380amq.LLILLL, 8);
            int iLJII = this.LLILLL.LJII(c948400amsLLLFZ2.LIZIZ) - 1;
            View view = c948380amq.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C16F5 c16f53 = c948380amq.LLILZLL;
            if (c16f53 != null) {
                c16f53.setText(String.valueOf(iLJII));
            }
            if (this.LLILZIL != i && (interfaceC948410amt = this.LLIZLLLIL) != null) {
                interfaceC948410amt.LIZ(this.LLILZ, iLJII);
            }
        } else {
            C786410Ut5.LLJJJJ(c948380amq.LLILLL, 0);
            View view2 = c948380amq.LLILZIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        if (this.LLIZ == i) {
            View view3 = c948380amq.LLILZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            c948380amq.LLILLJJLI.setBackgroundResource(((Number) this.LLJ.getValue()).intValue());
            HandlerHook.viewPost(c948380amq.LLILLL, new ARunnableS26S0101000_15(R.style.a9h, c948380amq, 4));
        } else if (this.LLILZLL == i) {
            View view4 = c948380amq.LLILZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(4, view4);
            }
            c948380amq.LLILLJJLI.setBackgroundResource(((Number) this.LLJ.getValue()).intValue());
            HandlerHook.viewPost(c948380amq.LLILLL, new ARunnableS26S0101000_15(R.style.a9h, c948380amq, 4));
        } else {
            View view5 = c948380amq.LLILZ;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(4, view5);
            }
            if (C934890aR5.LIZ()) {
                c948380amq.LLILLJJLI.setBackgroundResource(R.drawable.f69);
            } else {
                c948380amq.LLILLJJLI.setBackgroundResource(0);
            }
            HandlerHook.viewPost(c948380amq.LLILLL, new ARunnableS26S0101000_15(R.style.a9g, c948380amq, 4));
        }
        C500260Jjc.LJLIIIL(500L, c948380amq.itemView, new AwS381S0200000_15(this, c948380amq, 118));
        View view6 = c948380amq.LLILZIL;
        if (view6 != null) {
            C500260Jjc.LJLIIIL(500L, view6, new AwS381S0200000_15(this, c948380amq, 119));
        }
        ViewGroup.LayoutParams layoutParams = c948380amq.LLILLL.getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.y6(c948380amq.LLILLL, layoutParams);
        c948380amq.LLILLL.requestLayout();
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C948380amq c948380amqLLLILZLLLI = LLLILZLLLI(viewGroup);
        if (c948380amqLLLILZLLLI != null) {
            try {
                View view = c948380amqLLLILZLLLI.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c948380amqLLLILZLLLI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c948380amqLLLILZLLLI.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C948380amq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c948380amqLLLILZLLLI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c948380amqLLLILZLLLI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C948380amq.class.getName();
        return c948380amqLLLILZLLLI;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLILZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C948380amq c948380amq, int i, List<? extends Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(c948380amq, i);
            return;
        }
        Iterator<? extends Object> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), 1)) {
                View view = c948380amq.LLILZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(4, view);
                }
            } else {
                onBindViewHolder(c948380amq, i);
            }
        }
    }
}
