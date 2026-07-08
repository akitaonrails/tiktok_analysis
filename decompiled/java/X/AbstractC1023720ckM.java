package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0ckM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1023720ckM extends AbstractC1023380cjo {
    public final List<InterfaceC665370Q7z> vScopes;

    public AbstractC1023720ckM(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.vScopes = new ArrayList();
    }

    @Override // X.C1023640ckE
    public final C1196804mE getParamContextRetriever(C1023640ckE... c1023640ckEArr) {
        final List<InterfaceC665370Q7z> list = this.vScopes;
        final InterfaceC1092104Ox[] interfaceC1092104OxArr = (InterfaceC1092104Ox[]) Arrays.copyOf(c1023640ckEArr, c1023640ckEArr.length);
        return new C1196804mE(list, interfaceC1092104OxArr) { // from class: X.05qa
            public final List<InterfaceC665370Q7z> LIZJ;

            @Override // X.C1196804mE
            public final <T> T LIZ(Class<T> cls) {
                T t = (T) super.LIZ(cls);
                if (t == null) {
                    List<InterfaceC665370Q7z> list2 = this.LIZJ;
                    if (InterfaceC2753014t.class.isAssignableFrom(cls) && list2 != null) {
                        Iterator<InterfaceC665370Q7z> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(it2.next(), null, cls, null);
                            if (interfaceC1555100qZQLIZIZ == null || (t = (T) interfaceC1555100qZQLIZIZ.getSource()) == null) {
                            }
                        }
                    }
                    return null;
                }
                return t;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                super((InterfaceC1092104Ox[]) Arrays.copyOf(interfaceC1092104OxArr, interfaceC1092104OxArr.length));
                this.LIZJ = list;
            }
        };
    }

    public <T extends AbstractC207072161e> void logWithEvent(T t) {
        Map<String, Object> mapLIZ = getProcessor().LIZ(getParamContextRetriever(new C1023640ckE[0]), new LinkedHashMap(t.LIZLLL()), t.LIZ);
        if (mapLIZ == null) {
            return;
        }
        logInternal(t.LIZ, mapLIZ);
    }

    public void withVScope(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.vScopes.add(interfaceC665370Q7z);
    }

    public <T extends AbstractC207072161e> void logWithEvent(T t, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        Map<String, C2805016t> mapLIZJ = t.LIZJ();
        ArrayList arrayList = new ArrayList(mapLIZJ.size());
        for (final Map.Entry<String, C2805016t> entry : mapLIZJ.entrySet()) {
            arrayList.add(new InterfaceC1023650ckF<Object, Object>(entry) { // from class: X.0ckN
                public final String LIZ;
                public final boolean LIZIZ;

                @Override // X.InterfaceC1023650ckF
                public final Object LIZ(Object obj) {
                    return obj;
                }

                @Override // X.InterfaceC1023650ckF
                public final Function1<C1196804mE, Object> LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1023650ckF
                public final boolean LIZJ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1023650ckF
                public final String getName() {
                    return this.LIZ;
                }

                {
                    this.LIZ = entry.getKey();
                    this.LIZIZ = entry.getValue().LIZ;
                }
            });
        }
        Map<String, Object> params = getParams((InterfaceC1023650ckF<?, ?>[]) arrayList.toArray(new C1023730ckN[0]), new AwS382S0200000_16(t, function2, 76));
        Map<String, String> mapLIZLLL = t.LIZLLL();
        Iterator<Map.Entry<String, C2805016t>> it2 = t.LIZJ().entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (!mapLIZLLL.containsKey(key) && params.get(key) != null) {
                t.LJI(params.get(key), key);
            }
        }
        t.LJIIIIZZ();
    }
}
