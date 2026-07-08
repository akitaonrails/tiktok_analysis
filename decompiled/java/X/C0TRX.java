package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TRX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRX extends AbstractC21673619ry<C0TRY> {
    public final Function1<String, Unit> LL;
    public List<C0TRZ> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0TRX(AwS606S0100000_27 awS606S0100000_27) {
        this.LL = awS606S0100000_27;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLJI;
        C0TRY c0try = (C0TRY) viewHolder;
        C0TRZ c0trz = (C0TRZ) ListProtector.get(this.LLILLJJLI, i);
        Object value = C746760TRa.LIZ().LJIIIIZZ().getValue();
        C127K c127k = c0try.LL;
        c127k.setTitle(c0trz.LIZ);
        if (c0trz.LIZJ) {
            strLJI = C20642515q3.LJI(2131828800);
        } else {
            strLJI = "";
        }
        c127k.setSubtitle(strLJI);
        AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(c127k.getContext());
        anonymousClass1278.LJIILJJIL(Intrinsics.LJFF(c0trz.LIZIZ, value));
        anonymousClass1278.LJIILLIIL(new C785920UsI(this, c0trz, 3));
        c127k.setAccessory(anonymousClass1278);
        if (i == 0) {
            c0try.LL.LJ(true, false);
        } else if (i == getItemCount() - 1) {
            c0try.LL.LJ(false, true);
            C426750GoL.LJIIIZ(c0try.LL, null, 0, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 21);
        } else {
            c0try.LL.LJ(false, false);
            C426750GoL.LJIIIZ(c0try.LL, null, 0, null, 0, false, 21);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TRY c0try = new C0TRY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bb4, viewGroup, false));
        try {
            View view = c0try.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0try.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0try.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TRY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0try.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0try.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TRY.class.getName();
        return c0try;
    }
}
