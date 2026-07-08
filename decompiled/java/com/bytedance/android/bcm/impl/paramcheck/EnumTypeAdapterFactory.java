package com.bytedance.android.bcm.impl.paramcheck;

import X.C09CT;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09H4;
import X.C09H5;
import X.C09H6;
import X.C09H7;
import X.C09H9;
import X.C1954807lC;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) throws IllegalAccessException {
        Object objValueOf;
        if (!typeToken.getRawType().isEnum()) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] enumConstants = typeToken.getRawType().getEnumConstants();
        if (enumConstants != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : enumConstants) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            for (Object obj2 : arrayList) {
                C09CT c09ct = (C09CT) obj2.getClass().getField(obj2.toString()).getAnnotation(C09CT.class);
                if (c09ct != null) {
                    linkedHashMap.put(obj2, new C09H4(c09ct.value(), C09H5.STRING));
                } else {
                    Field[] declaredFields = obj2.getClass().getDeclaredFields();
                    int length = declaredFields.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Field field = declaredFields[i];
                            C09H9 c09h9 = C09H5.Companion;
                            String name = field.getType().getName();
                            c09h9.getClass();
                            for (C09H5 c09h5 : C09H5.values()) {
                                if (Intrinsics.LJFF(c09h5.getValue(), name)) {
                                    field.setAccessible(true);
                                    C09H9 c09h92 = C09H5.Companion;
                                    String name2 = field.getType().getName();
                                    c09h92.getClass();
                                    for (C09H5 c09h52 : C09H5.values()) {
                                        if (Intrinsics.LJFF(c09h52.getValue(), name2)) {
                                            int i2 = C09H6.LIZ[c09h52.ordinal()];
                                            if (i2 != 1) {
                                                if (i2 != 2) {
                                                    if (i2 != 3) {
                                                        if (i2 != 4) {
                                                            if (i2 == 5) {
                                                                objValueOf = Boolean.valueOf(field.getBoolean(obj2));
                                                            } else {
                                                                throw new C1954807lC();
                                                            }
                                                        } else {
                                                            objValueOf = Double.valueOf(field.getDouble(obj2));
                                                        }
                                                    } else {
                                                        objValueOf = Long.valueOf(field.getLong(obj2));
                                                    }
                                                } else {
                                                    objValueOf = field.get(obj2);
                                                }
                                            } else {
                                                objValueOf = Integer.valueOf(field.getInt(obj2));
                                            }
                                            linkedHashMap.put(obj2, new C09H4(objValueOf, c09h52));
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                            i++;
                        } else {
                            linkedHashMap.put(obj2, new C09H4(obj2.toString(), C09H5.STRING));
                            break;
                        }
                    }
                }
            }
        }
        return new TypeAdapter<T>() { // from class: com.bytedance.android.bcm.impl.paramcheck.EnumTypeAdapterFactory.create.3
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                T t = null;
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                String strLJJJZ = c09cu.LJJJZ();
                for (Map.Entry<T, C09H4> entry : linkedHashMap.entrySet()) {
                    T key = entry.getKey();
                    if (Intrinsics.LJFF(entry.getValue().LIZ.toString(), strLJJJZ)) {
                        t = key;
                    }
                }
                return t;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) throws IOException {
                if (t == null) {
                    c09dl.LJIJJ();
                    return;
                }
                C09H4 c09h4 = linkedHashMap.get(t);
                if (c09h4 == null || c09h4.LIZIZ == null) {
                    return;
                }
                int i3 = C09H7.LIZ[c09h4.LIZIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    return;
                                }
                                c09dl.LJJJJJL(((Boolean) c09h4.LIZ).booleanValue());
                                return;
                            }
                            c09dl.LJJIL(((Double) c09h4.LIZ).doubleValue());
                            return;
                        }
                        c09dl.LJJIZ(((Long) c09h4.LIZ).longValue());
                        return;
                    }
                    c09dl.LJJJJJ((String) c09h4.LIZ);
                    return;
                }
                c09dl.LJJJJ((Number) c09h4.LIZ);
            }
        };
    }
}
