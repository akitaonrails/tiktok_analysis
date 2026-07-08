package X;

import android.content.res.Configuration;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.Record;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.1994, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1994 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(Record record, Scene scene, Configuration configuration, int i, InterfaceC214796194g<Scene> interfaceC214796194g) {
        boolean z;
        C214913198t c214913198t;
        Integer num;
        if (scene.mView != null && ((z = scene instanceof AnonymousClass1995))) {
            WeakHashMap<Scene, C214913198t> weakHashMap = C214909198p.LIZ;
            if (weakHashMap.size() == 0 || (c214913198t = weakHashMap.get(scene)) == null || (num = c214913198t.LIZ) == null || configuration.equals(record.LLILLL)) {
                return false;
            }
            Configuration configuration2 = record.LLILLL;
            if (configuration2 != null) {
                int iDiff = configuration2.diff(configuration);
                C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Configuration has been changed, raw diff ");
                sbLIZ.append(iDiff);
                c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ));
                int i2 = iDiff & (-536870913);
                if (i != 0) {
                    i2 &= i;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("clean diff not include in configurationChangesAllowList, result diff ");
                    sbLIZ2.append(i2);
                    c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ2));
                }
                String strLIZ = C466350IQn.LIZ(i2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Configuration has been changed, diff ");
                sbLIZ3.append(strLIZ);
                c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ3));
                if ((num.intValue() & i2) != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Configuration has been changed, Scene has suitable configChanges, so dispatch onConfigurationChanged to ");
                    sbLIZ4.append(scene.toString());
                    c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ4));
                    if (z) {
                        ((AnonymousClass1995) scene).onConfigurationChanged(configuration);
                        if (C214909198p.LIZ(record.mScene)) {
                            record.LLILLL = new Configuration(configuration);
                        }
                        return false;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Impossible, Scene don't implement ActivityCompatibleBehavior but have configChanges ");
                    sbLIZ5.append(scene.toString());
                    throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ5));
                }
                if (TextUtils.isEmpty(strLIZ)) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Configuration has been changed, skip because unknown diff ");
                    sbLIZ6.append(i2);
                    c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ6));
                    if (z) {
                        ((AnonymousClass1995) scene).onConfigurationChanged(configuration);
                        if (C214909198p.LIZ(record.mScene)) {
                            record.LLILLL = new Configuration(configuration);
                        }
                        return false;
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("Impossible, Scene don't implement ActivityCompatibleBehavior but have configChanges ");
                    sbLIZ7.append(scene.toString());
                    throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ7));
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("Configuration has been changed, recreate ");
                sbLIZ8.append(scene.toString());
                c21494919Ad.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ8));
            } else {
                C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("Scene previous Configuration not found, recreate ");
                sbLIZ9.append(scene.toString());
                c21494919Ad2.LIZIZ("OnWindowFocusChangedScheduler", C2188811AlT.LIZIZ(sbLIZ9));
            }
            interfaceC214796194g.LIZ(scene);
            return true;
        }
        return false;
    }
}
