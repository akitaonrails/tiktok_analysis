package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10R4, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10R4 extends C03AM {
    public final List<C19246810Rm> LLILLJJLI;
    public final String LLILLL;
    public final Function1<Integer, Unit> LLILZ;
    public final LinkedHashSet<String> LLILZIL;

    @Override // X.C03AM
    public final int LLLFZ() {
        return this.LLILLJJLI.size();
    }

    @Override // X.C03AM
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        int i;
        C10MV.LIZ.getClass();
        if (C10MV.LIZ()) {
            i = R.layout.czp;
        } else {
            i = R.layout.czm;
        }
        return new C10R6(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false));
    }

    @Override // X.C03AM
    public final AbstractC1216180hkm LLLII(ViewGroup viewGroup) {
        int i = C1216170hkl.LL;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLILLL;
        if (str3 != null) {
            str2 = str3;
        }
        C1216170hkl c1216170hklLIZ = C1214200hha.LIZ(viewGroup, str, str2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1216170hklLIZ.itemView.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) C12ES.LIZJ(28.0f, c1216170hklLIZ.itemView.getContext());
        C786410Ut5.W5(c1216170hklLIZ.itemView, marginLayoutParams);
        return c1216170hklLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C10R6) {
            C10R6 c10r6 = (C10R6) viewHolder;
            C19246810Rm c19246810Rm = (C19246810Rm) ListProtector.get(this.LLILLJJLI, i - 1);
            c10r6.LLILZLL = c19246810Rm;
            c10r6.LLILLL.setSelected(C13LP.LJJJJ(c19246810Rm.LIZ, c10r6.LLIZ.LLILZIL));
            c10r6.LLILZ.setText(c19246810Rm.LIZIZ);
            c10r6.LLILZIL.setText(c19246810Rm.LIZJ);
            C10MV.LIZ.getClass();
            if (C10MV.LIZ()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c10r6.itemView.getLayoutParams();
                int iI5 = c10r6.I5();
                if (iI5 <= 1) {
                    marginLayoutParams.topMargin = (int) C12ES.LIZJ(8.0f, c10r6.itemView.getContext());
                } else {
                    marginLayoutParams.topMargin = (int) C12ES.LIZJ(8.0f, c10r6.itemView.getContext());
                }
                if (iI5 % 2 == 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    marginLayoutParams.leftMargin = (int) C12ES.LIZJ(8.0f, c10r6.itemView.getContext());
                }
                if (C1697810uHb.LJIIJJI("ar", "he", "iw", "ur").contains(C786410Ut5.t2(Locale.getDefault())) && ((Number) C0AL4.LIZ.getValue()).intValue() == 1) {
                    c10r6.LLILZIL.setTextDirection(4);
                    c10r6.LLILZIL.setTextAlignment(5);
                    c10r6.LLILZIL.setGravity(8388611);
                    c10r6.LLILZ.setTextDirection(4);
                    c10r6.LLILZ.setTextAlignment(5);
                    c10r6.LLILZ.setGravity(8388611);
                } else {
                    c10r6.LLILZIL.setTextDirection(3);
                }
                C786410Ut5.W5(c10r6.itemView, marginLayoutParams);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c10r6.itemView.getLayoutParams();
            int iI52 = c10r6.I5();
            if (iI52 <= 1) {
                marginLayoutParams2.topMargin = 0;
            } else {
                marginLayoutParams2.topMargin = -((int) C12ES.LIZJ(8.0f, c10r6.itemView.getContext()));
            }
            if (iI52 % 2 == 0) {
                marginLayoutParams2.leftMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = -((int) C12ES.LIZJ(0.0f, c10r6.itemView.getContext()));
            }
            C786410Ut5.W5(c10r6.itemView, marginLayoutParams2);
        }
    }

    public C10R4(List list, String str, String str2, AwS607S0100000_28 awS607S0100000_28) {
        super(str);
        this.LLILLJJLI = list;
        this.LLILLL = str2;
        this.LLILZ = awS607S0100000_28;
        this.LLILZIL = new LinkedHashSet<>();
    }
}
