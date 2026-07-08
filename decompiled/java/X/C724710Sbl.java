package X;

import Y.AObserverS176S0200000_11;
import android.os.Looper;
import androidx.lifecycle.CompatMediatorLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C724710Sbl {
    public final C724710Sbl LIZ;
    public final Map<C634030Ott, InterfaceC723730SaB> LIZIZ;
    public final Map<C634030Ott, MutableLiveData<? extends InterfaceC447510Hgj>> LIZJ;

    public C724710Sbl() {
        this(null);
    }

    public C724710Sbl(C724710Sbl c724710Sbl) {
        this.LIZ = c724710Sbl;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
    }

    public final <DATA extends InterfaceC447510Hgj> DATA LIZ(Class<? extends InterfaceC724720Sbm<DATA>> cls, String str) {
        DATA data;
        C634030Ott c634030Ott = new C634030Ott(cls, str);
        for (C724710Sbl c724710Sbl = this; c724710Sbl != null; c724710Sbl = c724710Sbl.LIZ) {
            if (c724710Sbl.LIZJ.containsKey(c634030Ott)) {
                LiveData liveData = (LiveData) ((LinkedHashMap) c724710Sbl.LIZJ).get(c634030Ott);
                if (liveData != null) {
                    data = (DATA) liveData.getValue();
                } else {
                    data = null;
                }
                if (!(data instanceof InterfaceC447510Hgj)) {
                    return null;
                }
                return data;
            }
        }
        return null;
    }

    public final <SERVICE extends InterfaceC724720Sbm<?>> SERVICE LIZIZ(Class<SERVICE> cls, String str) {
        C634030Ott c634030Ott = new C634030Ott(cls, str);
        for (C724710Sbl c724710Sbl = this; c724710Sbl != null; c724710Sbl = c724710Sbl.LIZ) {
            if (c724710Sbl.LIZIZ.containsKey(c634030Ott)) {
                return (SERVICE) ((LinkedHashMap) c724710Sbl.LIZIZ).get(c634030Ott);
            }
        }
        return null;
    }

    public final <SERVICE extends InterfaceC723730SaB> SERVICE LIZJ(Class<SERVICE> cls, String str) {
        C634030Ott c634030Ott = new C634030Ott(cls, str);
        for (C724710Sbl c724710Sbl = this; c724710Sbl != null; c724710Sbl = c724710Sbl.LIZ) {
            if (c724710Sbl.LIZIZ.containsKey(c634030Ott)) {
                return (SERVICE) ((LinkedHashMap) c724710Sbl.LIZIZ).get(c634030Ott);
            }
        }
        return null;
    }

    public final void LIZLLL(Class<?> cls, InterfaceC723730SaB interfaceC723730SaB) {
        if (!Intrinsics.LJFF(cls, InterfaceC723730SaB.class) && !Intrinsics.LJFF(cls, InterfaceC724720Sbm.class)) {
            C634030Ott c634030Ott = new C634030Ott(cls, interfaceC723730SaB.LIZ());
            if (this.LIZIZ.containsKey(c634030Ott) && interfaceC723730SaB != ((LinkedHashMap) this.LIZIZ).get(c634030Ott)) {
                if (!C725080ScM.LIZ) {
                    this.LIZIZ.remove(c634030Ott);
                    this.LIZJ.remove(c634030Ott);
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("(service=");
                        sbLIZ.append(cls);
                        sbLIZ.append(", serviceKey =");
                        sbLIZ.append(interfaceC723730SaB.LIZ());
                        sbLIZ.append(") has been already registered on service store. the service real instance is ");
                        sbLIZ.append(interfaceC723730SaB);
                        sbLIZ.append(", the registered service real instance is ");
                        sbLIZ.append(((LinkedHashMap) this.LIZIZ).get(c634030Ott));
                        sbLIZ.append(", currentMap info is ");
                        sbLIZ.append(this.LIZIZ);
                        interfaceC723720SaA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new IllegalStateException());
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("(service=");
                    sbLIZ2.append(cls);
                    sbLIZ2.append(", serviceKey =");
                    sbLIZ2.append(interfaceC723730SaB.LIZ());
                    sbLIZ2.append(") has been already registered on service store. the service real instance is ");
                    sbLIZ2.append(interfaceC723730SaB);
                    sbLIZ2.append(", the registered service real instance is ");
                    sbLIZ2.append(((LinkedHashMap) this.LIZIZ).get(c634030Ott));
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            this.LIZIZ.put(c634030Ott, interfaceC723730SaB);
            if (interfaceC723730SaB instanceof InterfaceC724720Sbm) {
                InterfaceC447510Hgj interfaceC447510HgjLt = ((InterfaceC724720Sbm) interfaceC723730SaB).lt();
                LiveData mutableLiveData = (LiveData) ((LinkedHashMap) this.LIZJ).get(c634030Ott);
                if (mutableLiveData == null) {
                    mutableLiveData = new MutableLiveData();
                    this.LIZJ.put(c634030Ott, (MutableLiveData<? extends InterfaceC447510Hgj>) mutableLiveData);
                }
                if (mutableLiveData.getValue() == null) {
                    if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        mutableLiveData.setValue(interfaceC447510HgjLt);
                        return;
                    } else {
                        mutableLiveData.postValue(interfaceC447510HgjLt);
                        return;
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('{');
        sbLIZ3.append(cls);
        sbLIZ3.append(" - ");
        sbLIZ3.append(interfaceC723730SaB);
        sbLIZ3.append("}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJ(Class<?> cls, InterfaceC723730SaB interfaceC723730SaB) {
        C634030Ott c634030Ott = new C634030Ott(cls, interfaceC723730SaB.LIZ());
        this.LIZIZ.remove(c634030Ott);
        if (interfaceC723730SaB instanceof InterfaceC724720Sbm) {
            this.LIZJ.remove(c634030Ott);
        }
    }

    public final void LJI(Class cls, Function1 function1) {
        InterfaceC723730SaB interfaceC723730SaB;
        Object obj = null;
        C634030Ott c634030Ott = new C634030Ott(cls, null);
        for (C724710Sbl c724710Sbl = this; c724710Sbl != null; c724710Sbl = c724710Sbl.LIZ) {
            if (c724710Sbl.LIZIZ.containsKey(c634030Ott)) {
                Map<C634030Ott, MutableLiveData<? extends InterfaceC447510Hgj>> map = c724710Sbl.LIZJ;
                if (map.containsKey(c634030Ott)) {
                    Object mutableLiveData = ((LinkedHashMap) map).get(c634030Ott);
                    if (mutableLiveData == null) {
                        mutableLiveData = new MutableLiveData();
                        map.put(c634030Ott, (MutableLiveData<? extends InterfaceC447510Hgj>) mutableLiveData);
                    }
                    LiveData liveData = (LiveData) mutableLiveData;
                    Object value = liveData.getValue();
                    if (value == null && (interfaceC723730SaB = (InterfaceC723730SaB) ((LinkedHashMap) c724710Sbl.LIZIZ).get(c634030Ott)) != null && (interfaceC723730SaB instanceof InterfaceC724720Sbm)) {
                        value = ((InterfaceC724720Sbm) interfaceC723730SaB).lt();
                    }
                    if (value instanceof InterfaceC447510Hgj) {
                        obj = value;
                    }
                    Object objInvoke = function1.invoke(obj);
                    if (value != null && !value.equals(objInvoke)) {
                        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                            if (objInvoke != null && (mutableLiveData instanceof MutableLiveData)) {
                                liveData.setValue(objInvoke);
                                return;
                            }
                            return;
                        }
                        if (!(mutableLiveData instanceof MutableLiveData)) {
                            return;
                        }
                        liveData.postValue(objInvoke);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void LJFF(LifecycleOwner lifecycleOwner, Class cls, Function1 function1, Function1 function12) {
        CompatMediatorLiveData compatMediatorLiveData;
        C634030Ott c634030Ott = new C634030Ott(cls, null);
        for (C724710Sbl c724710Sbl = this; c724710Sbl != null; c724710Sbl = c724710Sbl.LIZ) {
            if (c724710Sbl.LIZIZ.containsKey(c634030Ott)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) c724710Sbl.LIZJ;
                LiveData mutableLiveData = (LiveData) linkedHashMap.get(c634030Ott);
                if (linkedHashMap.containsKey(c634030Ott) && mutableLiveData == null) {
                    mutableLiveData = new MutableLiveData();
                    linkedHashMap.put(c634030Ott, mutableLiveData);
                }
                if ((mutableLiveData instanceof LiveData) && mutableLiveData != null) {
                    if (mutableLiveData.isInitialized()) {
                        compatMediatorLiveData = new CompatMediatorLiveData(function1.invoke(mutableLiveData.getValue()));
                    } else {
                        compatMediatorLiveData = new CompatMediatorLiveData();
                    }
                    compatMediatorLiveData.addSource(mutableLiveData, new AObserverS176S0200000_11(compatMediatorLiveData, function1, 0));
                    compatMediatorLiveData.observe(lifecycleOwner, new C513601zK(function12, 35));
                    return;
                }
                return;
            }
        }
    }
}
