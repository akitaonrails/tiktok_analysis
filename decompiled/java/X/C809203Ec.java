package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.HalfPageUserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import poa.a0;

/* JADX INFO: renamed from: X.03Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C809203Ec extends AbstractC2172971A2l<C809503Ef, C809303Ed> {
    public final OrderSubmitAssemViewModel LLILLJJLI;
    public boolean LLILLL;
    public final HashMap<Integer, a0> LLILZ;
    public final /* synthetic */ HalfPageUserTrustCell LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C809203Ec(HalfPageUserTrustCell halfPageUserTrustCell, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        super(new AbstractC339510DSr<C809503Ef>() { // from class: X.03Ee
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C809503Ef c809503Ef, C809503Ef c809503Ef2) {
                return Intrinsics.LJFF(c809503Ef, c809503Ef2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C809503Ef c809503Ef, C809503Ef c809503Ef2) {
                return Intrinsics.LJFF(C809503Ef.class, C809503Ef.class);
            }
        });
        this.LLILZIL = halfPageUserTrustCell;
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILZ = new HashMap<>();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a0 a0Var;
        List<UserTrustItemDescriptionChunk> list;
        C809303Ed c809303Ed = (C809303Ed) viewHolder;
        C809503Ef c809503EfLLLFZ = LLLFZ(i);
        if (this.LLILZ.get(Integer.valueOf(i)) == null && (list = c809503EfLLLFZ.LIZIZ) != null) {
            HalfPageUserTrustCell halfPageUserTrustCell = this.LLILZIL;
            a0 a0Var2 = new a0(list, R.attr.a1j, new AwS580S0100000_1(this, 109));
            c809303Ed.LL.setLayoutManager(new LinearLayoutManager(halfPageUserTrustCell.itemView.getContext()));
            c809303Ed.LL.addItemDecoration(new C819603Ic(16));
            c809303Ed.LL.setAdapter(a0Var2);
            this.LLILZ.put(Integer.valueOf(i), a0Var2);
        }
        C0H1U.LJIIL(c809303Ed.LLILLJJLI, c809503EfLLLFZ.LIZ, true);
        a0 a0Var3 = this.LLILZ.get(Integer.valueOf(i));
        if (a0Var3 != null) {
            a0.LLLIIIIL(a0Var3, this.LLILLJJLI.n, this.LLILLL, 8);
        }
        List<UserTrustItemDescriptionChunk> list2 = c809503EfLLLFZ.LIZIZ;
        if (list2 != null && (a0Var = this.LLILZ.get(Integer.valueOf(i))) != null) {
            a0Var.LLILLJJLI = list2;
            a0Var.LLLI(list2);
        }
        if (c809503EfLLLFZ.LIZJ) {
            C786410Ut5.LJLLLLLL(0, c809303Ed.LLILLL);
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), c809303Ed.LLILZ);
        } else {
            C786410Ut5.LJLLLLLL(8, c809303Ed.LLILLL);
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), c809303Ed.LLILZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        C809303Ed c809303Ed = new C809303Ed(C03XA.LIZJ(context, R.layout.an1, viewGroup, false));
        try {
            View view = c809303Ed.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c809303Ed.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c809303Ed.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C809303Ed.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c809303Ed.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c809303Ed.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C809303Ed.class.getName();
        return c809303Ed;
    }
}
