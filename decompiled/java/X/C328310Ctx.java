package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.widget.NextLiveData;

/* JADX INFO: renamed from: X.0Ctx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C328310Ctx<T> implements Observer<T> {
    public final int LL;
    public final Observer<T> LLILLJJLI;
    public final boolean LLILLL;
    public final /* synthetic */ NextLiveData LLILZ;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        if (!this.LLILLL && this.LL >= this.LLILZ.mLatestVersion) {
            return;
        }
        this.LLILLJJLI.onChanged(t);
    }

    public C328310Ctx(NextLiveData nextLiveData, int i, Observer<T> observer, boolean z) {
        this.LLILZ = nextLiveData;
        this.LL = i;
        this.LLILLJJLI = observer;
        this.LLILLL = z;
    }
}
