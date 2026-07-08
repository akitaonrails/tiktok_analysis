package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S0201000_2;
import kotlin.jvm.internal.AwS131S0400000_2;
import kotlin.jvm.internal.AwS14S0600000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS93S1200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575820MiC {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 999));

    public static C575830MiD LIZ(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (!C2236608pY.LIZLLL(cls)) {
            for (Field field : (ArrayList) C2236608pY.LIZIZ(cls)) {
                field.setAccessible(true);
                if (!field.isAnnotationPresent(InterfaceC570470MYz.class) && (!C278020Av2.LIZ() || !field.isAnnotationPresent(C040H.class))) {
                    if (!((Boolean) C277590AuL.LIZ.getValue()).booleanValue() || !C08IE.class.isAssignableFrom(field.getType())) {
                        if (!field.getType().isPrimitive() && !field.getType().isEnum() && !Intrinsics.LJFF(field.getType(), cls)) {
                            if (Intrinsics.LJFF(field.getType(), String.class)) {
                                arrayList.add(field);
                            } else if (List.class.isAssignableFrom(field.getType())) {
                                arrayList2.add(field);
                            } else if (field.getType().isArray()) {
                                arrayList3.add(field);
                            } else if (Set.class.isAssignableFrom(field.getType())) {
                                arrayList4.add(field);
                            } else if (Map.class.isAssignableFrom(field.getType())) {
                                arrayList5.add(field);
                            } else if (!LatestUnreadVideoInfo.class.isAssignableFrom(field.getType()) && !C0MND.class.isAssignableFrom(field.getType()) && !StoryNoteDataCollection.class.isAssignableFrom(field.getType())) {
                                arrayList6.add(LIZ(field.getType(), field.getName()));
                            }
                        }
                    }
                }
            }
        }
        return new C575830MiD(cls, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public final void LIZIZ(C575830MiD c575830MiD, Object obj, AwS93S1200000_8 awS93S1200000_8) {
        for (Field field : c575830MiD.LIZJ) {
            try {
                if (field.get(obj) != null) {
                    Object obj2 = field.get(obj);
                    if (obj2 instanceof String) {
                        String str = (String) awS93S1200000_8.invoke(obj2);
                        if (!Intrinsics.LJFF(str, obj2)) {
                            field.set(obj, str);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0M8J.LIZ(th);
            }
        }
        for (Field field2 : c575830MiD.LIZLLL) {
            LIZLLL(field2, (List) field2.get(obj), awS93S1200000_8);
        }
        for (Field field3 : c575830MiD.LJ) {
            if (!field3.getType().getComponentType().isPrimitive()) {
                LIZJ(field3, (Object[]) field3.get(obj), awS93S1200000_8);
            }
        }
        for (Field field4 : c575830MiD.LJFF) {
            LJI(field4, (Set) field4.get(obj), awS93S1200000_8);
        }
        for (Field field5 : c575830MiD.LJI) {
            LJ(field5, (Map) field5.get(obj), awS93S1200000_8);
        }
        for (C575830MiD c575830MiD2 : c575830MiD.LJII) {
            try {
                Field fieldLIZ = C2236608pY.LIZ(c575830MiD.LIZ, c575830MiD2.LIZIZ);
                fieldLIZ.setAccessible(true);
                Object obj3 = fieldLIZ.get(obj);
                if (obj3 != null) {
                    LIZIZ(c575830MiD2, obj3, awS93S1200000_8);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C0M8J.LIZ(th2);
            }
        }
    }

    public final void LIZJ(Field field, Object[] objArr, AwS93S1200000_8 awS93S1200000_8) {
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            int length = objArr.length;
                            for (int i = 0; i < length; i++) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    LJFF(field, obj2, awS93S1200000_8, new AwS129S0201000_2(objArr, awS93S1200000_8, i, 10));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0M8J.LIZ(th);
            }
        }
    }

    public final void LIZLLL(Field field, List list, AwS93S1200000_8 awS93S1200000_8) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                Object obj = list.get(i);
                                if (obj != null) {
                                    LJFF(field, obj, awS93S1200000_8, new AwS129S0201000_2(list, i, awS93S1200000_8, 11));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0M8J.LIZ(th);
            }
        }
    }

    public final void LJ(Field field, Map map, AwS93S1200000_8 awS93S1200000_8) {
        if (map == null) {
            return;
        }
        try {
            if (map.isEmpty()) {
                return;
            }
            for (Object obj : map.keySet()) {
                if (map.get(obj) != null) {
                    if (obj != null) {
                        Iterator it2 = map.entrySet().iterator();
                        ArrayList<Pair> arrayList = new ArrayList();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object obj2 = map.get(key);
                            if (obj2 != null) {
                                LJFF(field, obj2, awS93S1200000_8, new AwS14S0600000_2(obj2, key, entry, awS93S1200000_8, it2, arrayList, 1));
                            }
                        }
                        for (Pair pair : arrayList) {
                            map.put(pair.getFirst(), pair.getSecond());
                        }
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0M8J.LIZ(e);
        }
    }

    public final void LJI(Field field, Set set, AwS93S1200000_8 awS93S1200000_8) {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    ArrayList<Pair> arrayList = new ArrayList();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            for (Object obj : set) {
                                if (obj != null) {
                                    LJFF(field, obj, awS93S1200000_8, new AwS131S0400000_2(obj, set, awS93S1200000_8, arrayList, 5));
                                }
                            }
                            for (Pair pair : arrayList) {
                                set.remove(pair.getFirst());
                                set.add(pair.getSecond());
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0M8J.LIZ(th);
            }
        }
    }

    public final void LJFF(Field field, Object obj, AwS93S1200000_8 awS93S1200000_8, Function0 function0) {
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive()) {
            if (Intrinsics.LJFF(cls, String.class)) {
                function0.invoke();
                return;
            }
            if (List.class.isAssignableFrom(cls)) {
                LIZLLL(field, (List) obj, awS93S1200000_8);
                return;
            }
            if (cls.isArray()) {
                LIZJ(field, (Object[]) obj, awS93S1200000_8);
                return;
            }
            if (Set.class.isAssignableFrom(cls)) {
                LJI(field, (Set) obj, awS93S1200000_8);
            } else if (Map.class.isAssignableFrom(cls)) {
                LJ(field, (Map) obj, awS93S1200000_8);
            } else {
                LIZIZ(LIZ(cls, ""), obj, awS93S1200000_8);
            }
        }
    }
}
