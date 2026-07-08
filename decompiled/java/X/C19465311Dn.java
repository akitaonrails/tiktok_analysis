package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.JediInvisibleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.widget.Widget;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.11Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19465311Dn<VH extends JediViewHolder> extends C19464111Db<VH> {
    public final LifecycleOwner LJ;
    public final C19465411Do LJFF;

    public C19465311Dn(LifecycleOwner lifecycleOwner) {
        JediViewHolderProxyHost jediViewHolderProxyHostLIZ;
        C19465511Dp c19465511Dp;
        this.LJ = lifecycleOwner;
        if (lifecycleOwner instanceof Fragment) {
            String str = JediViewHolderProxyHost._pnsPageId;
            JediViewHolderProxyHost jediViewHolderProxyHostLIZ2 = C19465611Dq.LIZ((Fragment) lifecycleOwner, null);
            Lifecycle lifecycle = jediViewHolderProxyHostLIZ2.getLifecycle();
            c19465511Dp = (C19465511Dp) ((WeakHashMap) jediViewHolderProxyHostLIZ2.LLILLJJLI).get(lifecycle);
            if (c19465511Dp == null) {
                c19465511Dp = new C19465511Dp(lifecycle, jediViewHolderProxyHostLIZ2);
                ((WeakHashMap) jediViewHolderProxyHostLIZ2.LLILLJJLI).put(lifecycle, c19465511Dp);
            }
        } else if (lifecycleOwner instanceof C19EG) {
            String str2 = JediViewHolderProxyHost._pnsPageId;
            JediViewHolderProxyHost jediViewHolderProxyHostLIZ3 = C19465611Dq.LIZ(null, (C19EG) lifecycleOwner);
            Lifecycle lifecycle2 = jediViewHolderProxyHostLIZ3.getLifecycle();
            c19465511Dp = (C19465511Dp) ((WeakHashMap) jediViewHolderProxyHostLIZ3.LLILLJJLI).get(lifecycle2);
            if (c19465511Dp == null) {
                c19465511Dp = new C19465511Dp(lifecycle2, jediViewHolderProxyHostLIZ3);
                ((WeakHashMap) jediViewHolderProxyHostLIZ3.LLILLJJLI).put(lifecycle2, c19465511Dp);
            }
        } else if (lifecycleOwner instanceof Widget) {
            Widget widget = (Widget) lifecycleOwner;
            Lifecycle lifecycle3 = widget.getLifecycle();
            String str3 = JediViewHolderProxyHost._pnsPageId;
            Object objLIZJ = widget.LIZJ();
            if (objLIZJ instanceof Fragment) {
                jediViewHolderProxyHostLIZ = C19465611Dq.LIZ((Fragment) objLIZJ, null);
            } else if (objLIZJ instanceof C19EG) {
                jediViewHolderProxyHostLIZ = C19465611Dq.LIZ(null, (C19EG) objLIZJ);
            } else {
                throw new IllegalStateException();
            }
            c19465511Dp = (C19465511Dp) ((WeakHashMap) jediViewHolderProxyHostLIZ.LLILLJJLI).get(lifecycle3);
            if (c19465511Dp == null) {
                c19465511Dp = new C19465511Dp(lifecycle3, jediViewHolderProxyHostLIZ);
                ((WeakHashMap) jediViewHolderProxyHostLIZ.LLILLJJLI).put(lifecycle3, c19465511Dp);
            }
        } else {
            if (lifecycleOwner instanceof JediViewHolder) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("JediViewHolder:");
                sbLIZ.append(lifecycleOwner);
                sbLIZ.append(" is not support for now");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("owner:");
            sbLIZ2.append(lifecycleOwner);
            sbLIZ2.append(" is not in support list ([FragmentActivity, Fragment, Widget])");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJFF = new C19465411Do(c19465511Dp);
    }

    @Override // X.C19464111Db
    public final void LIZJ(C11EV c11ev) {
        JediViewHolder jediViewHolder = (JediViewHolder) c11ev;
        jediViewHolder.LLILZ = this.LJ;
        jediViewHolder.LLILZIL = this.LJFF;
        jediViewHolder.U5();
    }

    @Override // X.C19464111Db
    public final C11EV LIZLLL(ViewGroup viewGroup) {
        return new JediInvisibleViewHolder(viewGroup);
    }

    @Override // X.C19464111Db
    public final C11EV LJI(int i) {
        C19464511Df c19464511Df = this.LIZLLL.LIZJ;
        RecyclerView.ViewHolder viewHolder = null;
        if (c19464511Df == null) {
            return null;
        }
        List list = (List) ((SparseArray) c19464511Df.LIZ.getValue()).get(i);
        if (list != null && (!list.isEmpty())) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.remove(list, list.size() - 1);
            if (viewHolder2 instanceof Object) {
                viewHolder = viewHolder2;
            }
        }
        return (C11EV) viewHolder;
    }
}
