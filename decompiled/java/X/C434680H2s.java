package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS5S0201000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434680H2s extends AbstractC2172971A2l<C21376318l7, C430140Gto> {
    public InterfaceC430130Gtn LLILLJJLI;

    public C434680H2s() {
        super(new AbstractC339510DSr<C21376318l7>() { // from class: X.0H2t
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C21376318l7 c21376318l7, C21376318l7 c21376318l72) {
                return Intrinsics.LJFF(c21376318l7, c21376318l72);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C21376318l7 c21376318l7, C21376318l7 c21376318l72) {
                return Intrinsics.LJFF(C21376318l7.class, C21376318l7.class);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C21375718l1 c21375718l1;
        C430140Gto c430140Gto = (C430140Gto) viewHolder;
        C21376318l7 c21376318l7LLLFZ = LLLFZ(i);
        View view = c430140Gto.itemView;
        if ((view instanceof C21375718l1) && (c21375718l1 = (C21375718l1) view) != null) {
            c21375718l1.LIZ(c21376318l7LLLFZ);
        }
        C786410Ut5.I7(new AjS5S0201000_6(this, c430140Gto, i, c21376318l7LLLFZ, 1), c430140Gto.itemView);
        InterfaceC430130Gtn interfaceC430130Gtn = this.LLILLJJLI;
        if (interfaceC430130Gtn != null) {
            interfaceC430130Gtn.LIZ(c430140Gto.itemView, i, c21376318l7LLLFZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final Context context = viewGroup.getContext();
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(context) { // from class: X.0Gto
            {
                super(new C21375718l1(context));
            }
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C430140Gto.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C430140Gto.class.getName();
        return viewHolder;
    }
}
