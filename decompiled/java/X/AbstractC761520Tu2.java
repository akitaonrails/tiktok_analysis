package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC761520Tu2 {
    public final View LIZ;
    public final RunnableC781530UlD LIZIZ;
    public final LinearLayoutManager LIZJ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public AbstractC761520Tu2(int i, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        this.LIZ = viewTd;
        this.LIZIZ = (RunnableC781530UlD) viewTd.findViewById(R.id.mwy);
        this.LIZJ = new LinearLayoutManager(viewGroup.getContext(), 0, false);
    }
}
