package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01F3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01F3 {
    public final MutableLiveData<Boolean> LIZ = new MutableLiveData<>();
    public final HashMap<Function0<Unit>, Observer<Boolean>> LIZIZ = new HashMap<>();

    public final void LIZ() {
        Iterator<Map.Entry<Function0<Unit>, Observer<Boolean>>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            this.LIZ.removeObserver(it2.next().getValue());
        }
        this.LIZIZ.clear();
        this.LIZ.setValue(Boolean.FALSE);
    }

    public final boolean LIZIZ() {
        Boolean value = this.LIZ.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final void LIZJ() {
        this.LIZ.setValue(Boolean.FALSE);
    }

    public final void LIZLLL() {
        this.LIZ.postValue(Boolean.TRUE);
    }

    public final void LJ(final Function0<Unit> function0) {
        Observer<Boolean> observer = new Observer<Boolean>() { // from class: X.01F4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    function0.invoke();
                    this.LIZ.removeObserver(this);
                    this.LIZIZ.remove(function0);
                }
            }
        };
        this.LIZIZ.put(function0, observer);
        this.LIZ.observeForever(observer);
    }
}
