package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0lZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1362700lZ6 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public abstract void LLJILJILJ(LifecycleOwner lifecycleOwner, List list);

    public abstract List<IMContact> LLLFZ();

    public abstract void LLLI(SharePanelViewModel sharePanelViewModel);

    public abstract void refresh();
}
