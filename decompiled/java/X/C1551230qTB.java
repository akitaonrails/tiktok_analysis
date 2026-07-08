package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask$doInBackground$background$1$1", f = "GeckoGlobalInitTask.kt", l = {}, m = "invokeSuspend")
public final class C1551230qTB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1551230qTB(InterfaceC1364105Vn<? super C1551230qTB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1551230qTB(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Keva keva;
        Long l;
        C1C7U.LIZ("GeckoGlobalInitTask@32bd.doInBackground$background$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((Boolean) C303220Bua.LIZIZ.getValue()).booleanValue()) {
            C1551330qTL.LIZ(C1551330qTL.LIZ, false, 0L, C0C4C.LIZ(), 4);
        }
        C1551240qTC.LIZ.getClass();
        if (C1551240qTC.LIZIZ.LIZ("__throttle_global_key__") && (keva = (Keva) C1551240qTC.LIZJ.getValue()) != null) {
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it2 = keva.getAll().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object value = entry.getValue();
                    if ((value instanceof Long) && (l = (Long) value) != null && l.longValue() < System.currentTimeMillis()) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((CharSequence) entry.getKey(), new String[]{"-"}, 0, 6);
                        if (listLJJLIIIJILLIZJL.size() == 2) {
                            String str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                            String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                            C0VSJ c0vsj = new C0VSJ(rootDirectory, str);
                            if (c0vsj.exists() && c0vsj.isDirectory()) {
                                C0VSJ c0vsj2 = new C0VSJ(c0vsj, str2);
                                if (c0vsj2.exists() && c0vsj2.isDirectory()) {
                                    boolean zLIZJ = C1551020qSq.LIZJ(c0vsj2.getAbsolutePath());
                                    if (zLIZJ && C1549140qPo.LIZ().aks.contains(str)) {
                                        Object obj2 = linkedHashMap.get(str);
                                        Object obj3 = obj2;
                                        if (obj2 == null) {
                                            ArrayList arrayList = new ArrayList();
                                            linkedHashMap.put(str, arrayList);
                                            obj3 = arrayList;
                                        }
                                        ((List) obj3).add(str2);
                                    }
                                    C1551780qU4.LJFF(new C1551210qT9(zLIZJ ? 1 : 0, 0, 9, 0L, str, str2));
                                }
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("saved key not the couple of ak and channel: ");
                            sbLIZ.append((String) entry.getKey());
                            C1553130qWF.LIZLLL("SpecificTimeClean", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    C1550730qSN.LIZ.getClass();
                    C1550730qSN.LIZ(str3, list);
                }
            }
        }
        C1550750qSP.LIZ();
        if (!C1957007lY.LIZ.LIZ().getEnabled()) {
            C1551360qTO.LIZ.getClass();
            C1551360qTO.LJIIIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeckoGlobalInitTask@32bd.doInBackground$background$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1551230qTB(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
