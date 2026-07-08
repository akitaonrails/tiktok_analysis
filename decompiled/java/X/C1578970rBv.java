package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS703S0100000_24;

/* JADX INFO: renamed from: X.0rBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578970rBv extends AbstractC21673619ry<C1579010rBz> {
    public final Context LL;
    public final List<C1562980qm8<?>> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C1578970rBv(Context context) {
        this.LL = context;
    }

    public final void LLLFZ(Collection<? extends C1562980qm8<?>> collection) {
        List listLLIIII = C13LP.LLIIII(collection);
        if (!C19719512Dh.LJI(listLLIIII)) {
            listLLIIII = null;
        }
        ((ArrayList) this.LLILLJJLI).clear();
        if (listLLIIII != null) {
            ((ArrayList) this.LLILLJJLI).addAll(listLLIIII);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String string;
        C1579010rBz c1579010rBz = (C1579010rBz) viewHolder;
        C1562980qm8 c1562980qm8 = (C1562980qm8) ListProtector.get(this.LLILLJJLI, i);
        C786410Ut5.I7(new AbS703S0100000_24(c1562980qm8, 0), c1579010rBz.itemView);
        View view = c1579010rBz.LLILLL;
        if (c1562980qm8.LJI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        TuxTextView tuxTextView = c1579010rBz.LLILLJJLI;
        InterfaceC1557210qcp interfaceC1557210qcp = c1562980qm8.LIZLLL;
        if (interfaceC1557210qcp instanceof C1556510qbh) {
            string = c1579010rBz.itemView.getContext().getString(((C1556510qbh) interfaceC1557210qcp).LIZ);
        } else if (interfaceC1557210qcp instanceof C1555960qao) {
            string = ((C1555960qao) interfaceC1557210qcp).LIZ;
        } else {
            throw new C1954807lC();
        }
        tuxTextView.setText(string);
        c1579010rBz.LLILLJJLI.setTextColorRes(c1562980qm8.LJ.getTintRes());
        TuxIconView tuxIconView = c1579010rBz.LL;
        if (tuxIconView.getHeight() != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1562980qm8.LJFF.LIZ.getHeight()))) || tuxIconView.getWidth() != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1562980qm8.LJFF.LIZ.getWidth())))) {
            TuxIconView tuxIconView2 = c1579010rBz.LL;
            ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1562980qm8.LJFF.LIZ.getHeight())));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1562980qm8.LJFF.LIZ.getWidth())));
                C786410Ut5.W5(tuxIconView2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        InterfaceC1557220qcq interfaceC1557220qcq = c1562980qm8.LIZJ;
        if (Intrinsics.LJFF(interfaceC1557220qcq, C1557230qcr.LIZ)) {
            C786410Ut5.LLLLLLZZ(c1579010rBz.LL, 8);
        } else {
            if (interfaceC1557220qcq instanceof C1556520qbi) {
                C786410Ut5.LLLLLLZZ(c1579010rBz.LL, 0);
                c1579010rBz.LL.setIconRes(((C1556520qbi) interfaceC1557220qcq).LIZ);
                c1579010rBz.LL.setTintColorRes(c1562980qm8.LJ.getTintRes());
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1579010rBz c1579010rBz = new C1579010rBz(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.cnd, viewGroup, false));
        try {
            View view = c1579010rBz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1579010rBz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1579010rBz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1579010rBz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1579010rBz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1579010rBz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1579010rBz.class.getName();
        return c1579010rBz;
    }
}
