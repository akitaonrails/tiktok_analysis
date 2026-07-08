package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.103s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191850103s extends AbstractC191841103j {
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ = R.layout.bdg;

    @Override // X.AbstractC191841103j
    public final int LJFF() {
        return this.LJ;
    }

    public C191850103s(int i, int i2) {
        this.LIZJ = i;
        this.LIZLLL = i2;
    }

    @Override // X.InterfaceC191837103f
    public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
        View view = c191838103g.itemView;
        ((TextView) view.findViewById(R.id.pyn)).setText(view.getContext().getString(this.LIZJ));
        ((TextView) view.findViewById(R.id.pym)).setText(view.getContext().getString(this.LIZLLL));
    }
}
