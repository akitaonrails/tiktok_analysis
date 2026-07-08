package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745260TLg extends AbstractC21673619ry<C745270TLh> {
    public final Context LL;
    public final boolean LLILLJJLI;
    public final List<C745220TLc> LLILLL = new ArrayList();
    public Integer LLILZ;
    public C745220TLc LLILZIL;
    public Function1<? super C745220TLc, Unit> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(List<C745220TLc> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
        this.LLILZ = null;
        this.LLILZIL = null;
        notifyDataSetChanged();
    }

    public final void LLLI(C745220TLc c745220TLc) {
        int iIndexOf = ((ArrayList) this.LLILLL).indexOf(c745220TLc);
        Integer num = this.LLILZ;
        if ((num == null || iIndexOf != num.intValue()) && iIndexOf >= 0) {
            Integer num2 = this.LLILZ;
            this.LLILZ = Integer.valueOf(iIndexOf);
            this.LLILZIL = c745220TLc;
            notifyItemChanged(iIndexOf);
            if (num2 != null) {
                notifyItemChanged(num2.intValue());
            }
            Function1<? super C745220TLc, Unit> function1 = this.LLILZLL;
            if (function1 != null) {
                function1.invoke(c745220TLc);
            }
        }
    }

    public C745260TLg(Context context, boolean z) {
        this.LL = context;
        this.LLILLJJLI = z;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String quantityString;
        C745270TLh c745270TLh = (C745270TLh) viewHolder;
        TextView textView = c745270TLh.LL;
        C745220TLc c745220TLc = (C745220TLc) ListProtector.get(this.LLILLL, i);
        Context context = this.LL;
        long j = c745220TLc.LIZ;
        boolean z = true;
        if (j == -1) {
            quantityString = context.getString(2131842784);
        } else if (j < 60) {
            Resources resources = context.getResources();
            int i2 = (int) c745220TLc.LIZ;
            quantityString = resources.getQuantityString(2131755580, i2, Integer.valueOf(i2));
        } else {
            int i3 = (int) (j / ((long) 60));
            quantityString = context.getResources().getQuantityString(2131755579, i3, Integer.valueOf(i3));
        }
        textView.setText(quantityString);
        RadioButton radioButton = c745270TLh.LLILLJJLI;
        Integer num = this.LLILZ;
        if (num == null || i != num.intValue()) {
            z = false;
        }
        radioButton.setChecked(z);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745270TLh c745270TLh = new C745270TLh(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gsq, viewGroup, false));
        try {
            View view = c745270TLh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745270TLh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745270TLh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745270TLh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745270TLh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745270TLh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745270TLh.class.getName();
        return c745270TLh;
    }
}
