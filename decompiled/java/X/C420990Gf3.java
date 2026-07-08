package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C420990Gf3 extends RecyclerView.ViewHolder {
    public final /* synthetic */ C12W6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420990Gf3(C12W6 c12w6, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cye, viewGroup, false));
        this.LL = c12w6;
        ((C0GSY) this.itemView.findViewById(R.id.afh)).setBgColor(ColorProtector.parseColor("#FFFFFF"));
    }
}
