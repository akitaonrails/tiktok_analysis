package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS1S0301000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04DP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DP extends AbstractC2172971A2l<C04DL, C04DO<?>> {
    public C04DT LLILLJJLI;
    public int LLILLL;

    public C04DP() {
        super(new AbstractC339510DSr<C04DL>() { // from class: X.04DR
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C04DL c04dl, C04DL c04dl2) {
                return Intrinsics.LJFF(c04dl, c04dl2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C04DL c04dl, C04DL c04dl2) {
                return Intrinsics.LJFF(c04dl.getClass(), c04dl2.getClass());
            }
        });
        this.LLILLL = -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return LLLFZ(i).getClass().hashCode();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C04DO c04do = (C04DO) viewHolder;
        C04DL c04dlLLLFZ = LLLFZ(i);
        if (c04do != null) {
            c04do.I5(c04dlLLLFZ);
        }
        C04DT c04dt = this.LLILLJJLI;
        if (c04dt != null) {
            c04dt.LIZIZ(c04do.itemView, i, c04dlLLLFZ);
        }
        C786410Ut5.I7(new AjS1S0301000_1(this, c04do, i, c04dlLLLFZ, 5), c04do.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        C04DO<C04DM> c04do;
        if (i == C04DM.class.hashCode()) {
            c04do = new C04DO<C04DM>(viewGroup) { // from class: X.04DN
                {
                    super(new C04HV(viewGroup.getContext()));
                }

                @Override // X.C04DO
                public final void I5(C04DL c04dl) {
                    C04HV c04hv;
                    C04DM c04dm = (C04DM) c04dl;
                    View view = this.itemView;
                    if ((view instanceof C04HV) && (c04hv = (C04HV) view) != null) {
                        C04BX c04bx = c04dm.LIZIZ;
                        c04hv.LIZ(c04bx.LIZIZ, c04bx.LIZJ, c04bx.LIZLLL, c04bx.LJ);
                    }
                }
            };
        } else {
            c04do = new C04DO<C04DM>(viewGroup) { // from class: X.04DN
                {
                    super(new C04HV(viewGroup.getContext()));
                }

                @Override // X.C04DO
                public final void I5(C04DL c04dl) {
                    C04HV c04hv;
                    C04DM c04dm = (C04DM) c04dl;
                    View view = this.itemView;
                    if ((view instanceof C04HV) && (c04hv = (C04HV) view) != null) {
                        C04BX c04bx = c04dm.LIZIZ;
                        c04hv.LIZ(c04bx.LIZIZ, c04bx.LIZJ, c04bx.LIZLLL, c04bx.LJ);
                    }
                }
            };
        }
        try {
            View view = c04do.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c04do.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c04do.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C04DN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c04do.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c04do.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C04DN.class.getName();
        return c04do;
    }
}
