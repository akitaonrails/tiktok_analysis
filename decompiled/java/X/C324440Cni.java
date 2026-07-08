package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324440Cni {
    public static final boolean LIZ(List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
        if (((ArrayList) list).size() != copyOnWriteArrayList.size()) {
            return false;
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(((InterfaceC1583870rJp) ListProtector.get(list, i)).tag(), ((InterfaceC1583870rJp) ListProtector.get(copyOnWriteArrayList, i)).tag())) {
                return false;
            }
        }
        return true;
    }
}
