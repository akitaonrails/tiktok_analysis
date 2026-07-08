package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12HI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HI {
    public static final void LIZ(SafeMutableLiveData safeMutableLiveData, Object obj) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            safeMutableLiveData.setValue(obj);
        } else {
            safeMutableLiveData.postValue(obj);
        }
    }
}
