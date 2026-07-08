package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765940w3U {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(554));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(555));
    public final AtomicInteger LIZJ = new AtomicInteger(LSPassThroughRecordSizeConfig.DEFAULT);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Object obj, String str) {
        if (obj == null) {
            LIZIZ(str, new C1E5G<Boolean, Boolean>() { // from class: X.0w3Z
            });
            return;
        }
        if (obj instanceof Number) {
            final Number number = (Number) obj;
            LIZIZ(str, new C1E5G<Number, Number>(number) { // from class: X.0w3Y
                {
                    super(number, number);
                }
            });
            return;
        }
        if (obj instanceof Boolean) {
            final Boolean bool = (Boolean) obj;
            LIZIZ(str, new C1E5G<Boolean, Boolean>(bool) { // from class: X.0w3X
                {
                    super(bool, bool);
                }
            });
            return;
        }
        if (obj instanceof String) {
            final String str2 = (String) obj;
            LIZIZ(str, new C1E5G<String, String>(str2) { // from class: X.0w3a
                {
                    super(str2, str2);
                }
            });
            return;
        }
        final ReadableArray readableArray = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (obj instanceof List) {
            final List list = (List) obj;
            LIZIZ(str, new C1E5G<List<?>, ReadableArray>(list, readableArray) { // from class: X.0w3W
                public final List<?> LJI;
                public final ReadableArray LJII;

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZ(Object obj2) {
                    ReadableArray readableArray2 = (ReadableArray) obj2;
                    if (readableArray2 == null) {
                        return null;
                    }
                    return readableArray2.asArrayList();
                }

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZIZ(Object obj2) {
                    List list2 = (List) obj2;
                    if (list2 == null) {
                        return null;
                    }
                    return JavaOnlyArray.from(list2);
                }

                {
                    super(list, readableArray);
                    this.LJI = list;
                    this.LJII = readableArray;
                }
            });
            return;
        }
        if (obj instanceof Map) {
            final Map map = (Map) obj;
            final Object[] objArr4 = objArr3 == true ? 1 : 0;
            LIZIZ(str, new C1E5G<Map<?, ?>, ReadableMap>(map, objArr4) { // from class: X.0w3V
                public final Map<?, ?> LJI;
                public final ReadableMap LJII;

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZ(Object obj2) {
                    ReadableMap readableMap = (ReadableMap) obj2;
                    if (readableMap == null) {
                        return null;
                    }
                    return readableMap.asHashMap();
                }

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZIZ(Object obj2) {
                    Map map2 = (Map) obj2;
                    if (map2 == null) {
                        return null;
                    }
                    return JavaOnlyMap.from(map2);
                }

                {
                    super(map, objArr4);
                    this.LJI = map;
                    this.LJII = objArr4;
                }
            });
        } else if (obj instanceof ReadableArray) {
            final ReadableArray readableArray2 = (ReadableArray) obj;
            final Object[] objArr5 = objArr2 == true ? 1 : 0;
            LIZIZ(str, new C1E5G<List<?>, ReadableArray>(objArr5, readableArray2) { // from class: X.0w3W
                public final List<?> LJI;
                public final ReadableArray LJII;

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZ(Object obj2) {
                    ReadableArray readableArray22 = (ReadableArray) obj2;
                    if (readableArray22 == null) {
                        return null;
                    }
                    return readableArray22.asArrayList();
                }

                @Override // X.C1E5G, X.C1E5H
                public final Object LIZIZ(Object obj2) {
                    List list2 = (List) obj2;
                    if (list2 == null) {
                        return null;
                    }
                    return JavaOnlyArray.from(list2);
                }

                {
                    super(objArr5, readableArray2);
                    this.LJI = objArr5;
                    this.LJII = readableArray2;
                }
            });
        } else {
            if (obj instanceof ReadableMap) {
                final ReadableMap readableMap = (ReadableMap) obj;
                final Object[] objArr6 = objArr == true ? 1 : 0;
                LIZIZ(str, new C1E5G<Map<?, ?>, ReadableMap>(objArr6, readableMap) { // from class: X.0w3V
                    public final Map<?, ?> LJI;
                    public final ReadableMap LJII;

                    @Override // X.C1E5G, X.C1E5H
                    public final Object LIZ(Object obj2) {
                        ReadableMap readableMap2 = (ReadableMap) obj2;
                        if (readableMap2 == null) {
                            return null;
                        }
                        return readableMap2.asHashMap();
                    }

                    @Override // X.C1E5G, X.C1E5H
                    public final Object LIZIZ(Object obj2) {
                        Map map2 = (Map) obj2;
                        if (map2 == null) {
                            return null;
                        }
                        return JavaOnlyMap.from(map2);
                    }

                    {
                        super(objArr6, readableMap);
                        this.LJI = objArr6;
                        this.LJII = readableMap;
                    }
                });
                return;
            }
            throw new IllegalArgumentException("value type is not supported, you should use setData(key: String, value: PageStateContextData) ");
        }
    }

    public final void LIZIZ(String str, C1E5G c1e5g) {
        Object value;
        C1E5H<?, ?> c1e5h = (C1E5H) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
        ((ConcurrentHashMap) this.LIZ.getValue()).put(str, c1e5g);
        if ((c1e5h == null || !c1e5g.LIZJ(c1e5h)) && concurrentHashMap != null) {
            synchronized (concurrentHashMap) {
                try {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Object obj : concurrentHashMap.values()) {
                        if (obj instanceof IPageStateContextCallback) {
                            IPageStateContextCallback iPageStateContextCallback = (IPageStateContextCallback) obj;
                            if (c1e5h != null) {
                                value = c1e5h.LIZJ.getValue();
                            } else {
                                value = null;
                            }
                            iPageStateContextCallback.invoke(value, c1e5g.LIZJ.getValue());
                        } else if ((obj instanceof LynxView) && !linkedHashSet.contains(obj)) {
                            ((LynxView) obj).sendGlobalEvent("PageStateContextDataChange", JavaOnlyArray.of(JavaOnlyMap.from(C2097908Jt.LIZJ(new Pair(str, c1e5g.LIZLLL.getValue())))));
                            linkedHashSet.add(obj);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
