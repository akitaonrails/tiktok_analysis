package X;

import Y.AObjectS129S0000000_34;
import Y.AObjectS81S0000000_34;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216411Bot {
    public static final Map<Class<?>, Class<?>> LIZ = new LinkedHashMap();
    public static final Map<Class<?>, Pair<Class<?>, Class<?>>> LIZIZ = new LinkedHashMap();
    public static final Map<Class<?>, C443120HZe<Class<?>, Class<?>, Class<?>>> LIZJ = new LinkedHashMap();

    public static Class LIZ(Class cls) {
        for (Map.Entry entry : ((LinkedHashMap) LIZJ).entrySet()) {
            Class cls2 = (Class) entry.getKey();
            C443120HZe c443120HZe = (C443120HZe) entry.getValue();
            if (Intrinsics.LJFF(c443120HZe.getFirst(), cls) || Intrinsics.LJFF(c443120HZe.getSecond(), cls) || Intrinsics.LJFF(c443120HZe.getThird(), cls)) {
                return cls2;
            }
        }
        return null;
    }

    public static void LIZIZ(Class cls, Class cls2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Map<Class<?>, Class<?>> map = LIZ;
        if (map.containsKey(cls)) {
            return;
        }
        map.put(cls, cls2);
        Object objNewInstance = cls2.getConstructor(LiveData.class, Function0.class, Function1.class).newInstance(new MutableLiveData(null), new AObjectS81S0000000_34(7), new AObjectS129S0000000_34(2));
        InterfaceC2216421Bou interfaceC2216421Bou = (InterfaceC2216421Bou) objNewInstance;
        for (Map.Entry<Class<?>, Pair<Class<?>, Class<?>>> entry : ((InterfaceC21368818ju) objNewInstance).LIZJ().entrySet()) {
            LIZIZ.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class<?>, C443120HZe<Class<?>, Class<?>, Class<?>>> entry2 : interfaceC2216421Bou.LJ().entrySet()) {
            LIZJ.put(entry2.getKey(), entry2.getValue());
        }
        List<C2216571Bp9> listLIZ = interfaceC2216421Bou.LIZ();
        ArrayList<C2216571Bp9> arrayList = new ArrayList();
        for (C2216571Bp9 c2216571Bp9 : listLIZ) {
            C2216571Bp9 c2216571Bp92 = c2216571Bp9;
            if (c2216571Bp92.LIZIZ != null && C0FQ0.class.isAssignableFrom(c2216571Bp92.LIZJ)) {
                arrayList.add(c2216571Bp9);
            }
        }
        for (C2216571Bp9 c2216571Bp93 : arrayList) {
            LIZIZ(c2216571Bp93.LIZJ, c2216571Bp93.LIZIZ.get(interfaceC2216421Bou).getClass());
        }
    }
}
