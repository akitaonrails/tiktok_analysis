package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19245410Qy extends C10R1 {
    public final boolean LLJ;

    @Override // X.C03AM
    public RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        C1150504el.LIZ().LIZLLL("interest_fragment_create_dataholder", false);
        C10R3 c10r3 = new C10R3(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czn, viewGroup, false));
        C1150504el.LIZ().LJI("interest_fragment_create_dataholder", false);
        return c10r3;
    }

    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C10R3) {
            ((C10R3) viewHolder).I5();
        }
    }

    public C19245410Qy(List list, List list2, Function1 function1, C19245810Rc c19245810Rc, C19246210Rg c19246210Rg, Boolean bool) {
        boolean zLIZ;
        super(list, list2, function1, c19245810Rc, c19246210Rg);
        if (bool != null) {
            zLIZ = bool.booleanValue();
        } else {
            zLIZ = C10RL.LIZ();
        }
        this.LLJ = zLIZ;
    }
}
