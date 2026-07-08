package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C228000uM {
    public static final MediatorLiveData LIZ(LiveData liveData, MutableLiveData mutableLiveData) {
        return LIZJ(C1697810uHb.LJIIJJI(liveData, mutableLiveData), AnonymousClass0207.get$arr$(169));
    }

    public static final MediatorLiveData LIZJ(final List list, final Function1 function1) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((LiveData) it2.next()).getValue());
        }
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(function1.invoke(arrayList));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            final LiveData liveData = (LiveData) it3.next();
            mediatorLiveData.addSource(liveData, new Observer() { // from class: X.00uN
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Object value;
                    List<LiveData<?>> list2 = list;
                    LiveData<?> liveData2 = liveData;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (LiveData<?> liveData3 : list2) {
                        if (Intrinsics.LJFF(liveData2, liveData3)) {
                            value = obj;
                        } else {
                            value = liveData3.getValue();
                        }
                        arrayList2.add(value);
                    }
                    T tInvoke = function1.invoke(arrayList2);
                    if (!Intrinsics.LJFF(mediatorLiveData.getValue(), tInvoke)) {
                        mediatorLiveData.setValue(tInvoke);
                    }
                }
            });
        }
        return mediatorLiveData;
    }

    public static final MediatorLiveData LIZLLL(MutableLiveData mutableLiveData, Function1 function1) {
        return LIZJ(Collections.singletonList(mutableLiveData), new C5183020f(function1, (Function1<? super Long, Object>) 352));
    }

    public static final MediatorLiveData LIZIZ(LiveData liveData, MutableLiveData mutableLiveData, LiveData liveData2) {
        return LIZJ(C1697810uHb.LJIIJJI(liveData, mutableLiveData, liveData2), AnonymousClass0207.get$arr$(170));
    }
}
