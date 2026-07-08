package X;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C228700uT<T> implements Observer {
    public final /* synthetic */ MediatorLiveData<Object> LL;
    public final /* synthetic */ C013C LLILLJJLI;

    public C228700uT(MediatorLiveData<Object> mediatorLiveData, C013C c013c) {
        this.LL = mediatorLiveData;
        this.LLILLJJLI = c013c;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object value = this.LL.getValue();
        if (!this.LLILLJJLI.element) {
            if (value == null) {
                if (obj == null) {
                    return;
                }
            } else if (Intrinsics.LJFF(value, obj)) {
                return;
            }
        }
        this.LLILLJJLI.element = false;
        this.LL.setValue(obj);
    }
}
