package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C301301Et {
    public final HashMap<MutableLiveData<?>, List<Observer<?>>> LIZ = new HashMap<>();
    public final C11NJ LIZIZ = new C11NJ();

    public void LIZIZ() {
        for (Map.Entry<MutableLiveData<?>, List<Observer<?>>> entry : this.LIZ.entrySet()) {
            MutableLiveData<?> key = entry.getKey();
            Iterator<Observer<?>> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                key.removeObserver(it2.next());
            }
        }
        C11NJ c11nj = this.LIZIZ;
        c11nj.dispose();
        c11nj.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void LIZ(MutableLiveData<T> mutableLiveData, Observer<T> observer) {
        mutableLiveData.observeForever(observer);
        HashMap<MutableLiveData<?>, List<Observer<?>>> map = this.LIZ;
        List<Observer<?>> arrayList = map.get(mutableLiveData);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(mutableLiveData, arrayList);
        }
        arrayList.add(observer);
    }
}
