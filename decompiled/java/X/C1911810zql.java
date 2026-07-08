package X;

import Y.ACListenerS52S0201000_28;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0zql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911810zql extends AbstractC683590Qrd<C1911800zqk> {
    public final InterfaceC1911830zqn LL;

    public C1911810zql(InterfaceC1911830zqn interfaceC1911830zqn) {
        super(false);
        this.LL = interfaceC1911830zqn;
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<C1911800zqk> data = getData();
        if (data != null && (viewHolder instanceof C1911820zqm)) {
            C1911820zqm c1911820zqm = (C1911820zqm) viewHolder;
            C1911800zqk c1911800zqk = (C1911800zqk) ListProtector.get(data, i);
            boolean zLJIIJ = ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ();
            c1911820zqm.LLILLJJLI.setText(c1911820zqm.itemView.getContext().getString(c1911800zqk.LIZIZ));
            if (c1911800zqk.LIZ == zLJIIJ) {
                C786410Ut5.S4(1.0f, c1911820zqm.LLILLJJLI);
                C786410Ut5.LJZI(0, c1911820zqm.LLILLL);
            } else {
                C786410Ut5.S4(0.5f, c1911820zqm.LLILLJJLI);
                C786410Ut5.LJZI(8, c1911820zqm.LLILLL);
            }
            C786410Ut5.I7(new ACListenerS52S0201000_28(this, i, data, 4), c1911820zqm.itemView);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        return new C1911820zqm(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fiy, viewGroup, false));
    }
}
