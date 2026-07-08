package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CS7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoStorageHelperKt$mobTakoDB$1", f = "TakoStorageHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CS7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CS7(Context context, InterfaceC1364105Vn<? super C0CS7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CS7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        int i;
        Object next;
        long length;
        Object next2;
        long length2;
        Object next3;
        long length3;
        C1C7U.LIZ("TakoStorageHelperKt@6d47.mobTakoDB$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((Boolean) C0AXS.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1860520yW2.LIZ.getClass();
            if (jCurrentTimeMillis - C1860520yW2.LJIIL().getLong("mob_database_storage_timestamp", 0L) >= 86400000) {
                String[] strArrDatabaseList = this.LL.databaseList();
                if (strArrDatabaseList.length == 0) {
                    C1862330yYx.LIZIZ(C1862330yYx.LIZ, "databaseList empty");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoStorageHelperKt@6d47.mobTakoDB$1");
                    return unit;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArrDatabaseList) {
                    if (u.LJJIIJZLJL(str, "tako_im_", false)) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    C1862330yYx.LIZIZ(C1862330yYx.LIZ, "takoDBList empty");
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("TakoStorageHelperKt@6d47.mobTakoDB$1");
                    return unit2;
                }
                Context context = this.LL;
                Iterator it2 = arrayList.iterator();
                long length4 = 0;
                while (it2.hasNext()) {
                    length4 += context.getDatabasePath((String) it2.next()).length();
                }
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it3 = arrayList.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        if (u.LJIIZILJ((String) it3.next(), ".db", false) && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tako_im_");
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    if (u.LJJIIJZLJL((String) obj2, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (u.LJIIZILJ((String) next, ".db", false)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String str2 = (String) next;
                if (str2 != null && str2.length() > 0) {
                    length = this.LL.getDatabasePath(str2).length();
                } else {
                    length = 0;
                }
                Iterator it5 = arrayList2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (u.LJIIZILJ((String) next2, ".db-shm", false)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                String str3 = (String) next2;
                if (str3 != null && str3.length() > 0) {
                    length2 = this.LL.getDatabasePath(str3).length();
                } else {
                    length2 = 0;
                }
                Iterator it6 = arrayList2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next3 = it6.next();
                        if (u.LJIIZILJ((String) next3, ".db-wal", false)) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                String str4 = (String) next3;
                if (str4 != null && str4.length() > 0) {
                    length3 = this.LL.getDatabasePath(str4).length();
                } else {
                    length3 = 0;
                }
                C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c1860520yW2.getClass();
                C1860520yW2.LJIIL().storeLong("mob_database_storage_timestamp", jCurrentTimeMillis2);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_storage", length4);
                jSONObject.put("user_count", i);
                jSONObject.put("current_user_db", length);
                jSONObject.put("current_user_shm", length2);
                jSONObject.put("current_user_wal", length3);
                c20235014FoLIZ.LIZIZ("tikbot_perf_db_storage", jSONObject);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("TakoStorageHelperKt@6d47.mobTakoDB$1");
                return unit3;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("TakoStorageHelperKt@6d47.mobTakoDB$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
