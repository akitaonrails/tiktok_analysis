package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS63S0100000_6;
import java.util.List;
import kotlin.jvm.internal.AwS401S0200000_35;

/* JADX INFO: renamed from: X.0H2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434720H2w extends AbstractC21673619ry<C434750H2z> {
    public final List<C0H30> LL;
    public AwS401S0200000_35 LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C434720H2w(List<? extends C0H30> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float fLIZIZ;
        boolean z;
        int i2;
        int i3;
        C434750H2z c434750H2z = (C434750H2z) viewHolder;
        C0H30 c0h30 = (C0H30) ListProtector.get(this.LL, i);
        float fLIZIZ2 = C418440Gaw.LIZIZ(4);
        boolean z2 = c0h30 instanceof C434740H2y;
        if (z2) {
            fLIZIZ = 0.0f;
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        }
        int i4 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = c0h30 instanceof C434730H2x;
        if (z3) {
            i2 = ((C434730H2x) c0h30).LIZIZ;
        } else if (z2) {
            i2 = ((C434740H2y) c0h30).LIZIZ;
        } else {
            throw new C1954807lC();
        }
        if (z3) {
            i3 = ((C434730H2x) c0h30).LIZJ;
        } else if (z2) {
            i3 = ((C434740H2y) c0h30).LIZJ;
        } else {
            throw new C1954807lC();
        }
        C428030GqP c428030GqP = new C428030GqP(fLIZIZ2, fLIZIZ, i2, i3, C0HEZ.LIZ(R.attr.zc, c434750H2z.itemView.getContext()), z);
        if (z3) {
            c434750H2z.LL.LIZIZ(((C434730H2x) c0h30).LIZ, c428030GqP);
        } else if (z2) {
            c434750H2z.LL.LIZJ(((C434740H2y) c0h30).LIZ, c428030GqP);
        } else {
            throw new C1954807lC();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c434750H2z.itemView.getLayoutParams();
        if (i > 0) {
            i4 = -((int) fLIZIZ2);
        }
        marginLayoutParams.setMarginStart(i4);
        C786410Ut5.I7(new AjS63S0100000_6(this, 3), c434750H2z.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C428020GqO c428020GqO = new C428020GqO(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428020GqO);
        c428020GqO.setLayoutParams(marginLayoutParams);
        C434750H2z c434750H2z = new C434750H2z(c428020GqO);
        try {
            View view = c434750H2z.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c434750H2z.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c434750H2z.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C434750H2z.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c434750H2z.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c434750H2z.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C434750H2z.class.getName();
        return c434750H2z;
    }
}
