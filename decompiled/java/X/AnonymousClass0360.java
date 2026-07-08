package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0360, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0360 {
    public static final AnonymousClass0360 LIZ = new AnonymousClass0360();
    public static final ArrayList<String> LIZIZ;
    public static final ArrayList<String> LIZJ;
    public static final ArrayList<String> LIZLLL;
    public static final ArrayList<String> LJ;
    public static final ArrayList<String> LJFF;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("shipping_address");
        arrayList.add("shop_orders_new");
        arrayList.add("platform_promotion");
        arrayList.add("order_summary");
        arrayList.add("payment_methods");
        LIZIZ = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("shipping_address");
        arrayList2.add("payment_methods");
        arrayList2.add("shop_orders_new");
        arrayList2.add("platform_promotion");
        arrayList2.add("order_summary");
        LIZJ = arrayList2;
        LIZLLL = new ArrayList<>();
        LJ = new ArrayList<>();
        LJFF = new ArrayList<>();
    }

    public static void LIZ(Context context, List list) {
        int size = list.size();
        ArrayList<String> arrayList = LIZLLL;
        if (size != arrayList.size()) {
            arrayList.clear();
            arrayList.addAll(list);
            C1323720kYE.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(arrayList), "key_pre_handler_layout_list");
            return;
        }
        boolean z = false;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ArrayList<String> arrayList2 = LIZLLL;
                if (i >= arrayList2.size() || !Intrinsics.LJFF(obj, ListProtector.get(arrayList2, i))) {
                    z = true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (z) {
            ArrayList<String> arrayList3 = LIZLLL;
            arrayList3.clear();
            arrayList3.addAll(list);
            C1323720kYE.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(arrayList3), "key_pre_handler_layout_list");
        }
    }

    public static void LIZIZ(Context context, EnumC969503qf enumC969503qf) {
        String str;
        Type type;
        ArrayList arrayList;
        LJ.clear();
        Object objLIZ = C1323720kYE.LIZ(context).LIZ("key_pre_handler_layout_list");
        if (objLIZ instanceof String) {
            str = (String) objLIZ;
        } else {
            str = null;
        }
        if (str != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(ArrayList.class, C13JX.LIZ(c13jwLJII)));
                } else {
                    type = new TypeToken<ArrayList<String>>() { // from class: X.0361
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof ArrayList)) {
                    objFromJson = null;
                }
                arrayList = (ArrayList) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            LIZLLL.addAll(arrayList);
            LJ.addAll(arrayList);
            return;
        }
        int i = AnonymousClass0362.LIZ[enumC969503qf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                LJ.addAll(LIZIZ);
                return;
            } else {
                LJ.addAll(LIZJ);
                return;
            }
        }
        LJ.addAll(LIZIZ);
    }

    public final void LIZJ(Context context, List<String> list) {
        synchronized (this) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                ArrayList<String> arrayList = LJFF;
                if (arrayList.isEmpty()) {
                    LIZ.getClass();
                    LIZ(context, list);
                }
                arrayList.clear();
                arrayList.addAll(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
