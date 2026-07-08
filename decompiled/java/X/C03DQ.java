package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DQ extends AbstractC2172971A2l<String, C03DR> {
    public Function1<? super Integer, Unit> LLILLJJLI;

    public C03DQ() {
        super(new AbstractC339510DSr<String>() { // from class: X.03DS
            @Override // X.AbstractC339510DSr
            public final /* bridge */ /* synthetic */ boolean LIZ(String str, String str2) {
                return true;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(String str, String str2) {
                return Intrinsics.LJFF(str, str2);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C03DR c03dr = (C03DR) viewHolder;
        c03dr.LLILLJJLI.setText(LLLFZ(i));
        c03dr.LLILLJJLI.requestLayout();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03DR c03dr = new C03DR(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cor, viewGroup, false), this.LLILLJJLI);
        try {
            View view = c03dr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03dr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03dr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03DR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03dr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03dr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03DR.class.getName();
        return c03dr;
    }
}
