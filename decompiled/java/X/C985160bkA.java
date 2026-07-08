package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0bkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985160bkA extends C0J8P<C985150bk9, C985170bkB> {
    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C985150bk9 c985150bk9) {
        ((TextView) ((C985170bkB) viewHolder).LL.getValue()).setText(c985150bk9.LIZ);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C985170bkB(C786410Ut5.Td(layoutInflater, R.layout.h59, viewGroup, false));
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C985150bk9 c985150bk9, List list) {
        C985170bkB c985170bkB = (C985170bkB) viewHolder;
        C985150bk9 c985150bk92 = c985150bk9;
        if (list.size() <= 0) {
            LIZJ(c985170bkB, c985150bk92);
        } else {
            ((TextView) c985170bkB.LL.getValue()).setText(c985150bk92.LIZ);
        }
    }
}
