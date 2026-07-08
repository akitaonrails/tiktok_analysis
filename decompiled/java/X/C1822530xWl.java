package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822530xWl {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC1822900xXM) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static InterfaceC1822900xXM LIZIZ(List list) {
        return (InterfaceC1822900xXM) C13LP.LJJJLL(LIZ(list));
    }

    public static C1822350xWT LIZJ(List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1822350xWT) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C1822350xWT)) {
            return null;
        }
        return (C1822350xWT) next;
    }

    public static boolean LIZLLL(InterfaceC1822900xXM interfaceC1822900xXM) {
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() && Intrinsics.LJFF(interfaceC1822900xXM.getKey(), "fill_form")) {
            C490590JLt c490590JLt = C490590JLt.LIZ;
            String schema = interfaceC1822900xXM.getSchema();
            if (schema == null) {
                schema = "";
            }
            c490590JLt.getClass();
            if (!C490590JLt.LJII(schema)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
