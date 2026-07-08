package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0Icy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C470660Icy extends AbstractC471430IeD {
    @Override // X.AbstractC471430IeD
    public int LLLLIILL(int i) {
        if (i == 1) {
            return R.layout.gqc;
        }
        if (i == 1001) {
            return R.layout.hre;
        }
        if (i == 1005) {
            return R.layout.hqt;
        }
        if (i != 1006) {
            return -8888;
        }
        return R.layout.gdw;
    }

    public C470660Icy(Map<Integer, InterfaceC468510IYv> map) {
        super(map);
    }

    @Override // X.AbstractC471420IeC
    public final RecyclerView.ViewHolder LLLIIIIL(int i, ViewGroup viewGroup) {
        switch (i) {
            case -1091576149:
                return new C470640Icw(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3m, viewGroup, false), this.LLILLJJLI);
            case -1091576148:
                return new C470950IdR(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gde, viewGroup, false), this.LLILLJJLI);
            default:
                return super.LLLIIIIL(i, viewGroup);
        }
    }
}
