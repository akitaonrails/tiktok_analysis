package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.animax.base.bridge.JavaOnlyArray;
import com.lynx.animax.property.AnimaXPropertyCallback;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1285730jYx {
    public static void LIZ(AnimaXPropertyCallback animaXPropertyCallback, JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray != null && !javaOnlyArray.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            javaOnlyArray.asArrayList();
            for (int i = 0; i < javaOnlyArray.size(); i++) {
                Object obj = ListProtector.get(javaOnlyArray, i);
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            animaXPropertyCallback.LIZJ();
            return;
        }
        animaXPropertyCallback.onSuccess();
    }
}
