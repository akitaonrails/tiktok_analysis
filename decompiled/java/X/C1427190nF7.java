package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0nF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427190nF7 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final C1214930hil LLILLL;
    public final TuxTextView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1427190nF7 LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eo6, viewGroup, false);
        int i = R.id.lbw;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.lbw, viewTd);
        if (tuxIconView != null) {
            i = R.id.nj0;
            if (C1616006Uk.LIZ(R.id.nj0, viewTd) != null) {
                i = R.id.u84;
                C1214930hil c1214930hil = (C1214930hil) C1616006Uk.LIZ(R.id.u84, viewTd);
                if (c1214930hil != null) {
                    i = R.id.tv_title;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.tv_title, viewTd);
                    if (tuxTextView != null) {
                        return new C1427190nF7((ConstraintLayout) viewTd, tuxIconView, c1214930hil, tuxTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public C1427190nF7(ConstraintLayout constraintLayout, TuxIconView tuxIconView, C1214930hil c1214930hil, TuxTextView tuxTextView) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = c1214930hil;
        this.LLILZ = tuxTextView;
    }
}
