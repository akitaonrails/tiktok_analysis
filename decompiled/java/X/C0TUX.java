package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0TUX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUX extends AbstractC21673619ry<C0TUY> {
    public final Context LL;
    public final InterfaceC747540TUa LLILLJJLI;
    public ArrayList<C747580TUe> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        ArrayList<C747580TUe> arrayList = this.LLILLL;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public C0TUX(Context context, InterfaceC747540TUa interfaceC747540TUa) {
        this.LL = context;
        this.LLILLJJLI = interfaceC747540TUa;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C0TUY c0tuy = (C0TUY) viewHolder;
        if (getItemCount() != 0) {
            C747580TUe c747580TUe = (C747580TUe) ListProtector.get(this.LLILLL, i);
            c0tuy.LL.setTitle(c747580TUe.LIZIZ.LIZJ());
            AnonymousClass1278 anonymousClass1278 = c0tuy.LLILLJJLI;
            if (anonymousClass1278 != null) {
                anonymousClass1278.LJIILJJIL(c747580TUe.LIZ);
                anonymousClass1278.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0TUZ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        InterfaceC747540TUa interfaceC747540TUa = this.LL.LLILLJJLI;
                        if (interfaceC747540TUa != null) {
                            interfaceC747540TUa.LLJL(i);
                        }
                    }
                });
            }
            if (i == 0) {
                c0tuy.LL.LJ(true, false);
                C426750GoL.LJIIIZ(c0tuy.LL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 0, false, 21);
            } else if (i == getItemCount() - 1) {
                c0tuy.LL.LJ(false, true);
                C426750GoL.LJIIIZ(c0tuy.LL, null, 0, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 21);
            } else {
                c0tuy.LL.LJ(false, false);
                C426750GoL.LJIIIZ(c0tuy.LL, null, 0, null, 0, false, 21);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TUY c0tuy = new C0TUY(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.f73, viewGroup, false));
        try {
            View view = c0tuy.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tuy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tuy.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TUY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tuy.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tuy.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TUY.class.getName();
        return c0tuy;
    }
}
