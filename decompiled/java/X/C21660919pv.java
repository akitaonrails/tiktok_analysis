package X;

import Y.ACListenerS97S0300000_33;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21660919pv extends AbstractC21673619ry<C21661119px> {
    public final List<C21661419q0> LL;
    public final Context LLILLJJLI;
    public final InterfaceC21661319pz LLILLL;
    public final InterfaceC21661219py LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C21661119px c21661119px = (C21661119px) viewHolder;
        final C21661419q0 c21661419q0 = (C21661419q0) ListProtector.get(this.LL, i);
        ((View) c21661119px.LL.getValue()).setTag(c21661419q0.LIZ);
        ((View) c21661119px.LL.getValue()).setContentDescription(c21661419q0.LIZ.getKey());
        ((TuxIconView) c21661119px.LL.getValue()).setIconRes(c21661419q0.LIZ.getCheckedIconRes());
        TuxIconView tuxIconView = (TuxIconView) c21661119px.LL.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = c21661419q0.LIZ.getCheckedIconRes();
        if (Intrinsics.LJFF(c21661419q0.LIZ.getKey(), EnumC1377930lxf.SAVE_LOCAL.getKey())) {
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1q);
        }
        tuxIconView.setTuxIcon(c419910GdJ);
        ((CompoundButton) c21661119px.LLILLJJLI.getValue()).setChecked(c21661419q0.LIZIZ);
        ((TextView) c21661119px.LLILLL.getValue()).setText(c21661419q0.LIZ.getLabel());
        CompoundButton compoundButton = (CompoundButton) c21661119px.LLILLJJLI.getValue();
        CompoundButton.OnCheckedChangeListener c786760Ute = new CompoundButton.OnCheckedChangeListener() { // from class: X.19pw
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                this.LL.LLILLL.dx(c21661419q0.LIZ, (C21458918yR) c21661119px.LLILLJJLI.getValue());
            }
        };
        if (C1848410yCV.LIZ) {
            c786760Ute = new C786760Ute(c786760Ute);
        }
        compoundButton.setOnCheckedChangeListener(c786760Ute);
        C786410Ut5.I7(new ACListenerS97S0300000_33(this, c21661419q0, c21661119px, 4), c21661119px.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21661119px c21661119px = new C21661119px(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.f8d, viewGroup, false));
        try {
            View view = c21661119px.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21661119px.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21661119px.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21661119px.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21661119px.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21661119px.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21661119px.class.getName();
        return c21661119px;
    }

    public C21660919pv(List<C21661419q0> list, Context context, InterfaceC21661319pz interfaceC21661319pz, InterfaceC21661219py interfaceC21661219py) {
        this.LL = list;
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC21661319pz;
        this.LLILZ = interfaceC21661219py;
    }
}
