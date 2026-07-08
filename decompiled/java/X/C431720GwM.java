package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0GwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431720GwM<T> extends WeakReference<T> {
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public C431720GwM(DetailFragmentPanel detailFragmentPanel) {
        super(detailFragmentPanel);
        this.LIZ = detailFragmentPanel.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C431720GwM)) {
            return false;
        }
        T t = get();
        Object obj2 = ((Reference) obj).get();
        if (t == null) {
            if (t != obj2) {
                return false;
            }
            return true;
        }
        return t.equals(obj2);
    }
}
