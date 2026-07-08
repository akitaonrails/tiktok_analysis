package X;

import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500270Jjd<T> implements Observer<T> {
    public final Function1<T, Unit> LL;
    public final boolean LLILLJJLI;
    public final NextLiveData<T> LLILLL;
    public final int LLILZ;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        if (!this.LLILLJJLI && this.LLILZ >= this.LLILLL.getMLatestVersion$live_datachannel_release()) {
            return;
        }
        this.LL.invoke(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C500270Jjd(Function1<? super T, Unit> function1, boolean z, NextLiveData<T> nextLiveData) {
        this.LL = function1;
        this.LLILLJJLI = z;
        this.LLILLL = nextLiveData;
        this.LLILZ = nextLiveData.getMLatestVersion$live_datachannel_release();
    }
}
