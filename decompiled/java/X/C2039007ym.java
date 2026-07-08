package X;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2039007ym {
    public static void LIZ(Object obj, List list) {
        try {
            Field fieldExactField = Reflect.on(obj).exactField("dexElements", new Class[0]);
            fieldExactField.setAccessible(true);
            Object[] objArr = (Object[]) fieldExactField.get(obj);
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Iterator it2 = list.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    String string = objArr[i].toString();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('\"');
                    if (u.LJIIZILJ(string, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(objArr[i]);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("modifyClassLoaderPathList: retain=");
                sbLIZ2.append(z);
                sbLIZ2.append(" ,");
                sbLIZ2.append(objArr[i]);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (arrayList.size() > 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr2[i2] = arrayList.get(i2);
                }
                fieldExactField.set(obj, objArr2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
