package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.animax.base.bridge.JavaOnlyArray;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXKeyPathListCallback;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1285720jYw {
    public static void LIZ(AnimaXKeyPathListCallback animaXKeyPathListCallback, JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray != null) {
            ArrayList arrayList = new ArrayList();
            javaOnlyArray.asArrayList();
            for (int i = 0; i < javaOnlyArray.size(); i++) {
                if (ListProtector.get(javaOnlyArray, i) instanceof JavaOnlyArray) {
                    arrayList.add(new AnimaXKeyPath((JavaOnlyArray) ListProtector.get(javaOnlyArray, i)));
                }
            }
            animaXKeyPathListCallback.LIZ();
            return;
        }
        new ArrayList();
        animaXKeyPathListCallback.LIZ();
    }
}
