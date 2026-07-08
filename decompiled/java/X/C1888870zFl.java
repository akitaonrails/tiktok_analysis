package X;

import Y.ACListenerS25S0301000_28;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888870zFl extends AbstractC21673619ry<C1888880zFm> {
    public final List<LocationObject> LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public int LLIZ = -1;
    public final int LLIZLLLIL = R.layout.gq_;
    public InterfaceC1888890zFn LLJ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<LocationObject> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strValueOf;
        boolean z;
        C1888880zFm c1888880zFm = (C1888880zFm) viewHolder;
        List<LocationObject> list = this.LL;
        if (list != null) {
            boolean z2 = false;
            if (!this.LLILZ || (i != 0 && Intrinsics.LJFF(((LocationObject) ListProtector.get(list, i)).LIZIZ(), ((LocationObject) ListProtector.get(list, i - 1)).LIZIZ()))) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(((LocationObject) ListProtector.get(list, i)).name.charAt(0));
            }
            c1888880zFm.LLILLJJLI.setText(((LocationObject) ListProtector.get(list, i)).name);
            if (!Intrinsics.LJFF(strValueOf, "")) {
                C786410Ut5.LLJJJJLIIL(c1888880zFm.LL, 0);
                c1888880zFm.LL.setText(strValueOf);
            } else {
                C786410Ut5.LLJJJJLIIL(c1888880zFm.LL, 8);
            }
            if (this.LLILLJJLI == this.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            C786410Ut5.LLJJJJLIIL(c1888880zFm.LLILLJJLI, 0);
            if (z) {
                C20744016Fi c20744016Fi = c1888880zFm.LLILZ;
                int visibility = c20744016Fi.getVisibility();
                c20744016Fi.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c20744016Fi);
                C786410Ut5.LLJJJJJIL(c1888880zFm.LLILLL, 8);
            } else {
                C786410Ut5.LLJJJJJIL(c1888880zFm.LLILLL, 0);
                C20744016Fi c20744016Fi2 = c1888880zFm.LLILZ;
                int visibility2 = c20744016Fi2.getVisibility();
                c20744016Fi2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c20744016Fi2);
            }
            C20744016Fi c20744016Fi3 = c1888880zFm.LLILZ;
            if (i == this.LLIZ) {
                z2 = true;
            }
            c20744016Fi3.setChecked(z2);
            C786410Ut5.I7(new ACListenerS25S0301000_28(this, c1888880zFm, list, i, 1), c1888880zFm.itemView);
            if (this.LLILLJJLI == this.LLILLL && this.LLIZ == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((LocationObject) ListProtector.get(list, i)).LIZ());
                sbLIZ.append(", ");
                sbLIZ.append(this.LLILZLL);
                if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), this.LLILZIL)) {
                    this.LLIZ = i;
                    c1888880zFm.LLILZ.setChecked(true);
                    InterfaceC1888890zFn interfaceC1888890zFn = this.LLJ;
                    if (interfaceC1888890zFn != null) {
                        interfaceC1888890zFn.LIZ((LocationObject) ListProtector.get(list, i));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1888880zFm c1888880zFm = new C1888880zFm(C786410Ut5.Sd(this.LLIZLLLIL, C786410Ut5.ne(viewGroup.getContext()), null));
        try {
            View view = c1888880zFm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1888880zFm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1888880zFm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1888880zFm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1888880zFm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1888880zFm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1888880zFm.class.getName();
        return c1888880zFm;
    }

    public C1888870zFl(int i, int i2, List list, String str, String str2, boolean z) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }
}
