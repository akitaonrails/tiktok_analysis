package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C228600uS {
    public static final MediatorLiveData LIZ(LiveData liveData) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final C013C c013c = new C013C();
        c013c.element = true;
        mediatorLiveData.addSource(liveData, new Observer() { // from class: X.00uR
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Object value = mediatorLiveData.getValue();
                if (!c013c.element) {
                    if (value == null) {
                        if (obj == null) {
                            return;
                        }
                    } else if (Intrinsics.LJFF(value, obj)) {
                        return;
                    }
                }
                c013c.element = false;
                mediatorLiveData.setValue(obj);
            }
        });
        return mediatorLiveData;
    }
}
