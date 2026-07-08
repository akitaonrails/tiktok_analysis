package X;

import Y.ATListenerS441S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500910Jkf extends AbstractC21673619ry<C500930Jkh> {
    public final List<C500920Jkg> LL;
    public boolean LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final int LLILZ = R.layout.g8j;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(71));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(70));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C500930Jkh c500930Jkh = (C500930Jkh) viewHolder;
        C500920Jkg c500920Jkg = (C500920Jkg) ListProtector.get(this.LL, i);
        C16F5 c16f5 = c500930Jkh.LL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(c500920Jkg.LIZ));
        }
        Integer num = c500920Jkg.LIZLLL;
        boolean z = false;
        if (num != null) {
            int iIntValue = num.intValue();
            C16F5 c16f52 = c500930Jkh.LLILZ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(iIntValue));
            }
            C16F5 c16f53 = c500930Jkh.LLILZ;
            if (c16f53 != null) {
                C12ES.LJIILL(0, c16f53);
            }
        }
        if (c500920Jkg.LJ) {
            View view = c500930Jkh.LLILZIL;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            C500260Jjc.LJJLJ(C439101nJ.LIZ(13), c500930Jkh.itemView);
        }
        C20743716Ff c20743716Ff = c500930Jkh.LLILLJJLI;
        if (c20743716Ff != null) {
            C786410Ut5.A7(c20743716Ff, null);
            c20743716Ff.setOnTouchListener(null);
            if (c500920Jkg.LIZIZ.LIZIZ().booleanValue() && this.LLILLJJLI) {
                z = true;
            }
            c20743716Ff.setChecked(z);
            if (this.LLILLJJLI) {
                C786410Ut5.A7(c20743716Ff, new C521680Kd4(c500920Jkg, this, 1));
            } else {
                c20743716Ff.setOnTouchListener(new ATListenerS441S0100000_7(this, 4));
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C500930Jkh c500930Jkh = new C500930Jkh(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZ, viewGroup, false));
        try {
            View view = c500930Jkh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c500930Jkh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c500930Jkh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C500930Jkh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c500930Jkh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c500930Jkh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C500930Jkh.class.getName();
        return c500930Jkh;
    }

    public C500910Jkf(List list, boolean z, Function0 function0) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
    }
}
