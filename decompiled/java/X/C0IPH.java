package X;

import Y.ACListenerS142S0100000_7;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IPH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPH extends AbstractC21673619ry<C0IPJ> {
    public final List<C0IPI> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public C0IPH(List<C0IPI> list) {
        this.LL = new ArrayList(list);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        C0IPJ c0ipj = (C0IPJ) viewHolder;
        C0IPI c0ipi = (C0IPI) ListProtector.get(this.LL, i);
        c0ipj.LL.setImageDrawable(c0ipi.LIZ);
        c0ipj.LLILLJJLI.setText(c0ipi.LIZIZ);
        C16F5 c16f5 = c0ipj.LLILLL;
        int i3 = 8;
        if (!a0.LJJJIL(c0ipi.LIZJ)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, c16f5);
        c0ipj.LLILLL.setText(c0ipi.LIZJ);
        String str = c0ipi.LIZLLL;
        String str2 = c0ipi.LJ;
        Function0<Unit> function0 = c0ipi.LJFF;
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2) && function0 != null) {
            z = true;
        } else {
            z = false;
        }
        C16F5 c16f52 = c0ipj.LLILZ;
        if (z) {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, c16f52);
        if (!z) {
            c0ipj.LLILZ.setText("");
            c0ipj.LLILZ.setMovementMethod(null);
            C786410Ut5.l8(c0ipj.LLILZ, null);
        } else if (str != null && str2 != null && function0 != null) {
            C16F5 c16f53 = c0ipj.LLILZ;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append(' ');
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            C786410Ut5.q2(spannableStringBuilder, new C511601z0(c16f53, function0, 0), length, spannableStringBuilder.length(), 33);
            c16f53.setText(spannableStringBuilder);
            c0ipj.LLILZ.setLinksClickable(true);
            c0ipj.LLILZ.setMovementMethod(LinkMovementMethod.getInstance());
            c0ipj.LLILZ.setHighlightColor(0);
            C786410Ut5.l8(c0ipj.LLILZ, null);
        }
        if (c0ipi.LJI) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(c0ipi, 24), c0ipj.itemView);
        } else {
            C786410Ut5.I7(null, c0ipj.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0IPJ c0ipj = new C0IPJ(C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.h69, viewGroup, false));
        try {
            View view = c0ipj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ipj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ipj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0IPJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ipj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ipj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0IPJ.class.getName();
        return c0ipj;
    }
}
