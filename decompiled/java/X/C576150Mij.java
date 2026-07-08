package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS20S0401000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS70S0500000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576150Mij<T, R extends Annotation> {
    public final Class<T> LIZ;
    public final Class<R> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, LSPassThroughRecordSizeConfig.DEFAULT));

    public final C576170Mil LIZ(Class<?> cls, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (!C2236608pY.LIZLLL(cls)) {
            for (Field field : (ArrayList) C2236608pY.LIZIZ(cls)) {
                field.setAccessible(true);
                if (!this.LIZJ || field.isAnnotationPresent(this.LIZIZ)) {
                    if (!field.isAnnotationPresent(InterfaceC570470MYz.class) && (this.LIZLLL || !C278020Av2.LIZ() || !field.isAnnotationPresent(C040H.class))) {
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
        }
        return new C576170Mil(cls, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public final void LIZIZ(T t, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        LIZJ((C576170Mil) this.LJ.getValue(), t, interfaceC576180Mim);
    }

    public final void LIZJ(C576170Mil c576170Mil, Object obj, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        Annotation annotation;
        for (Field field : c576170Mil.LIZJ) {
            try {
                if (field.get(obj) != null && (annotation = field.getAnnotation(this.LIZIZ)) != null) {
                    interfaceC576180Mim.LJ(field, obj, annotation);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2236608pY.LIZJ(th);
            }
        }
        for (Field field2 : c576170Mil.LIZLLL) {
            LJ(field2, (List) field2.get(obj), field2.getAnnotation(this.LIZIZ), interfaceC576180Mim);
        }
        for (Field field3 : c576170Mil.LJ) {
            if (!field3.getType().getComponentType().isPrimitive()) {
                LIZLLL(field3, (Object[]) field3.get(obj), field3.getAnnotation(this.LIZIZ), interfaceC576180Mim);
            }
        }
        for (Field field4 : c576170Mil.LJFF) {
            LJII(field4, (Set) field4.get(obj), field4.getAnnotation(this.LIZIZ), interfaceC576180Mim);
        }
        for (Field field5 : c576170Mil.LJI) {
            LJFF(field5, (Map) field5.get(obj), field5.getAnnotation(this.LIZIZ), interfaceC576180Mim);
        }
        for (C576170Mil c576170Mil2 : c576170Mil.LJII) {
            try {
                Field fieldLIZ = C2236608pY.LIZ(c576170Mil.LIZ, c576170Mil2.LIZIZ);
                fieldLIZ.setAccessible(true);
                Object obj2 = fieldLIZ.get(obj);
                if (obj2 != null) {
                    LIZJ(c576170Mil2, obj2, interfaceC576180Mim);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C2236608pY.LIZJ(th2);
            }
        }
    }

    public C576150Mij(Class<T> cls, Class<R> cls2, boolean z, boolean z2) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    public final void LIZLLL(Field field, Object[] objArr, R r, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            int length = objArr.length;
                            for (int i = 0; i < length; i++) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    LJI(field, obj2, r, interfaceC576180Mim, new AwS20S0401000_8((InterfaceC576180Mim) interfaceC576180Mim, (InterfaceC576180Mim<int>) field, (Field) objArr, (Object[]) i, (int) r, 1));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2236608pY.LIZJ(th);
            }
        }
    }

    public final void LJ(Field field, List<?> list, R r, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator<?> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                Object obj = list.get(i);
                                if (obj != null) {
                                    LJI(field, obj, r, interfaceC576180Mim, new AwS20S0401000_8((InterfaceC576180Mim) interfaceC576180Mim, (InterfaceC576180Mim<int>) field, (Field) list, (List<?>) i, (int) r, 2));
                                }
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2236608pY.LIZJ(th);
            }
        }
    }

    public final void LJFF(Field field, Map<?, ?> map, R r, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        if (map == null) {
            return;
        }
        try {
            if (map.isEmpty()) {
                return;
            }
            for (T t : map.keySet()) {
                if (map.get(t) != null) {
                    if (t != null) {
                        for (T t2 : map.keySet()) {
                            Object obj = map.get(t2);
                            if (obj != null) {
                                LJI(field, obj, r, interfaceC576180Mim, new AwS70S0500000_8((InterfaceC576180Mim) interfaceC576180Mim, (InterfaceC576180Mim<int>) field, (Field) map, (Map<?, ?>) t2, (Object) r, 1));
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2236608pY.LIZJ(e);
        }
    }

    public final void LJII(Field field, Set<?> set, R r, InterfaceC576180Mim<R> interfaceC576180Mim) throws Throwable {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            ArrayList<Pair> arrayList = new ArrayList();
                            for (T t : set) {
                                if (t != null) {
                                    LJI(field, t, r, interfaceC576180Mim, new C576160Mik(interfaceC576180Mim, field, set, t, r, arrayList));
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
                C2236608pY.LIZJ(th);
            }
        }
    }

    public final void LJI(Field field, Object obj, R r, InterfaceC576180Mim<R> interfaceC576180Mim, Function0<Unit> function0) throws Throwable {
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive()) {
            if (Intrinsics.LJFF(cls, String.class)) {
                if (r != null) {
                    function0.invoke();
                }
            } else {
                if (List.class.isAssignableFrom(cls)) {
                    LJ(field, (List) obj, r, interfaceC576180Mim);
                    return;
                }
                if (cls.isArray()) {
                    LIZLLL(field, (Object[]) obj, r, interfaceC576180Mim);
                    return;
                }
                if (Set.class.isAssignableFrom(cls)) {
                    LJII(field, (Set) obj, r, interfaceC576180Mim);
                } else if (Map.class.isAssignableFrom(cls)) {
                    LJFF(field, (Map) obj, r, interfaceC576180Mim);
                } else {
                    LIZJ(LIZ(cls, ""), obj, interfaceC576180Mim);
                }
            }
        }
    }
}
