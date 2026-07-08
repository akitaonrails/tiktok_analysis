package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0luY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376000luY {
    public static void LIZ(List list) {
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() instanceof C1377760lxO) {
                if (i2 != -1) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2, list);
                    if ((objLJJJLZIJ instanceof C1377760lxO) && objLJJJLZIJ != null) {
                        Iterator it3 = list.iterator();
                        boolean zEnable = true;
                        boolean zEnable2 = true;
                        int i3 = -1;
                        boolean zEnable3 = true;
                        while (it3.hasNext()) {
                            int i4 = i + 1;
                            InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) it3.next();
                            if (Intrinsics.LJFF(interfaceC1370310llN.key(), "duet")) {
                                zEnable3 = interfaceC1370310llN.enable();
                                i3 = i;
                            }
                            if (Intrinsics.LJFF(interfaceC1370310llN.key(), "stitch")) {
                                zEnable2 = interfaceC1370310llN.enable();
                            }
                            if (Intrinsics.LJFF(interfaceC1370310llN.key(), "create_sticker")) {
                                zEnable = interfaceC1370310llN.enable();
                            }
                            i = i4;
                        }
                        if (zEnable && !zEnable3 && !zEnable2) {
                            list.remove(objLJJJLZIJ);
                            ListProtector.add(list, i3, objLJJJLZIJ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            i2++;
        }
    }

    public static void LIZIZ(List list) {
        Iterator it2 = list.iterator();
        Object obj = null;
        int i = 2;
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            int i4 = i2 + 1;
            InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) it2.next();
            if (Intrinsics.LJFF(interfaceC1370310llN.key(), "live_photo") && interfaceC1370310llN.enable()) {
                obj = interfaceC1370310llN;
            }
            if ((Intrinsics.LJFF(interfaceC1370310llN.key(), "duet") || Intrinsics.LJFF(interfaceC1370310llN.key(), "stitch")) && !interfaceC1370310llN.enable()) {
                i--;
                if (i3 == 0) {
                    i3 = i2;
                }
            }
            i2 = i4;
        }
        if (obj != null && i == 0) {
            list.remove(obj);
            ListProtector.add(list, i3, obj);
        }
    }
}
