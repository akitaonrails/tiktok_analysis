package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10R0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10R0 extends C10R1 {
    public final boolean LLJ;

    @Override // X.C03AM
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        C1150504el.LIZ().LIZLLL("interest_fragment_create_dataholder", false);
        C10HG c10hg = new C10HG(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czo, viewGroup, false));
        C1150504el.LIZ().LJI("interest_fragment_create_dataholder", false);
        return c10hg;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C10HG) {
            C10HG c10hg = (C10HG) viewHolder;
            NewUserInterestStruct newUserInterestStruct = (NewUserInterestStruct) ListProtector.get(c10hg.LL.LLILLL, c10hg.I5());
            ((TextView) c10hg.itemView.findViewById(R.id.kwu)).setText(newUserInterestStruct.text);
            ((ImageView) c10hg.itemView.findViewById(R.id.kwh)).setSelected(c10hg.LL.LLLIL(newUserInterestStruct));
            if (c10hg.LL.LLJ) {
                int width = c10hg.itemView.findViewById(R.id.kwm).getWidth();
                String str = newUserInterestStruct.cover_url;
                if (str == null) {
                    str = "";
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJIIIIZZ = width;
                c1331670kl3LJIIIZ.LJIIIZ = width;
                c1331670kl3LJIIIZ.LIZLLL(c10hg.itemView.getContext().getClass().getName());
                c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) c10hg.itemView.findViewById(R.id.kwm));
                c1331670kl3LJIIIZ.LJIIL(new C19245910Rd(c10hg.LL.LLILZLL));
            }
        }
    }

    public C10R0(List list, Function1 function1, C19245810Rc c19245810Rc, C19246210Rg c19246210Rg, boolean z) {
        super(list, list, function1, c19245810Rc, c19246210Rg);
        this.LLJ = z;
    }
}
