package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.087z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20673087z<S> {
    public final MutableLiveData<S> LIZ;

    public C20673087z() {
        this.LIZ = new MutableLiveData<>();
    }

    public C20673087z(Object obj) {
        this();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            this.LIZ.setValue(obj);
        } else {
            this.LIZ.postValue(obj);
        }
    }
}
