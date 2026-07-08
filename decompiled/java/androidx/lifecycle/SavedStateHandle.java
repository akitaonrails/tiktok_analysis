package androidx.lifecycle;

import X.C05YD;
import X.C09IC;
import X.C13DA;
import X.C15442062u;
import X.C197076128s;
import X.C1BNE;
import X.C20643086v;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC197061128d;
import X.InterfaceC332260D0u;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateHandle {
    public static final Companion Companion = new Companion();
    public C197076128s impl;
    public final Map<String, SavingStateLiveData<?>> liveDatas;

    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    public final Set<String> keys() {
        C197076128s c197076128s = this.impl;
        return C15442062u.LJIIIZ(C15442062u.LJIIIZ(((LinkedHashMap) c197076128s.LIZ).keySet(), ((LinkedHashMap) c197076128s.LIZIZ).keySet()), this.liveDatas.keySet());
    }

    public final InterfaceC197061128d savedStateProvider() {
        return this.impl.LJ;
    }

    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new C197076128s(C2097608Jq.LJ());
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Companion {
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            List<Class<? extends Object>> list = C20643086v.LIZ;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    if (((Class) it2.next()).isInstance(obj)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            Object obj;
            if (bundle == null) {
                bundle = bundle2;
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
            }
            bundle.setClassLoader(SavedStateHandle.class.getClassLoader());
            C13DA c13da = new C13DA(bundle.size());
            for (String str : bundle.keySet()) {
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                c13da.put(str, obj);
            }
            return new SavedStateHandle(c13da.build());
        }
    }

    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        public SavedStateHandle handle;
        public String key;

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            C197076128s c197076128s;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (c197076128s = savedStateHandle.impl) != null) {
                c197076128s.LIZIZ(this.key, t);
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            this.key = str;
            this.handle = savedStateHandle;
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        this.liveDatas = new LinkedHashMap();
        this.impl = new C197076128s(map);
    }

    public final void clearSavedStateProvider(String str) {
        this.impl.LIZIZ.remove(str);
    }

    public final boolean contains(String str) {
        return this.impl.LIZ.containsKey(str);
    }

    public final <T> T get(String str) {
        T t;
        C197076128s c197076128s = this.impl;
        c197076128s.getClass();
        try {
            InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) c197076128s.LIZLLL).get(str);
            if (interfaceC332260D0u == null || (t = (T) interfaceC332260D0u.getValue()) == null) {
                return (T) ((LinkedHashMap) c197076128s.LIZ).get(str);
            }
            return t;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            c197076128s.LIZ.remove(str);
            c197076128s.LIZJ.remove(str);
            c197076128s.LIZLLL.remove(str);
            return null;
        }
    }

    public final <T> MutableLiveData<T> getLiveData(String str) {
        return getLiveDataInternal(str, false, null);
    }

    public final <T> T remove(String str) {
        C197076128s c197076128s = this.impl;
        T t = (T) c197076128s.LIZ.remove(str);
        c197076128s.LIZJ.remove(str);
        c197076128s.LIZLLL.remove(str);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(str);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t;
    }

    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        return getLiveDataInternal(str, true, t);
    }

    public final <T> InterfaceC332260D0u<T> getMutableStateFlow(String str, T t) {
        if (!this.liveDatas.containsKey(str)) {
            return this.impl.LIZ(str, t);
        }
        String strCreateMutuallyExclusiveErrorMessage = SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str);
        strCreateMutuallyExclusiveErrorMessage.toString();
        throw new IllegalArgumentException(strCreateMutuallyExclusiveErrorMessage);
    }

    public final <T> C05YD<T> getStateFlow(String str, T t) {
        if (this.impl.LIZLLL.containsKey(str)) {
            return C09IC.LIZIZ(this.impl.LIZ(str, t));
        }
        C197076128s c197076128s = this.impl;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c197076128s.LIZJ;
        Object objLIZ = linkedHashMap.get(str);
        if (objLIZ == null) {
            if (!c197076128s.LIZ.containsKey(str)) {
                c197076128s.LIZ.put(str, t);
            }
            objLIZ = C1BNE.LIZ(((LinkedHashMap) c197076128s.LIZ).get(str));
            linkedHashMap.put(str, objLIZ);
        }
        return C09IC.LIZIZ((InterfaceC332260D0u) objLIZ);
    }

    public final <T> void set(String str, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
            if ((savingStateLiveData2 instanceof MutableLiveData) && (savingStateLiveData = savingStateLiveData2) != null) {
                savingStateLiveData.setValue(t);
            }
            this.impl.LIZIZ(str, t);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't put value with type ");
        sbLIZ.append(t.getClass());
        sbLIZ.append(" into saved state");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void setSavedStateProvider(String str, InterfaceC197061128d interfaceC197061128d) {
        this.impl.LIZIZ.put(str, interfaceC197061128d);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        if (!this.impl.LIZLLL.containsKey(str)) {
            Map<String, SavingStateLiveData<?>> map = this.liveDatas;
            SavingStateLiveData<?> savingStateLiveData = map.get(str);
            if (savingStateLiveData == null) {
                if (this.impl.LIZ.containsKey(str)) {
                    savingStateLiveData = new SavingStateLiveData<>(this, str, ((LinkedHashMap) this.impl.LIZ).get(str));
                } else if (z) {
                    this.impl.LIZ.put(str, t);
                    savingStateLiveData = new SavingStateLiveData<>(this, str, t);
                } else {
                    savingStateLiveData = new SavingStateLiveData<>(this, str);
                }
                map.put(str, savingStateLiveData);
            }
            return savingStateLiveData;
        }
        String strCreateMutuallyExclusiveErrorMessage = SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str);
        strCreateMutuallyExclusiveErrorMessage.toString();
        throw new IllegalArgumentException(strCreateMutuallyExclusiveErrorMessage);
    }
}
