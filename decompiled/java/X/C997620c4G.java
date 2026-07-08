package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c4G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997620c4G implements IAdTranslatableData {
    public final List<InterfaceC997630c4H> LIZ;

    public final C997660c4K LIZ() {
        InterfaceC997630c4H next;
        Iterator<InterfaceC997630c4H> it2 = this.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getType(), "5")) {
                break;
            }
        }
        InterfaceC997630c4H interfaceC997630c4H = next;
        if (interfaceC997630c4H == null || !(interfaceC997630c4H instanceof C997660c4K)) {
            return null;
        }
        return (C997660c4K) interfaceC997630c4H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C997620c4G(List<? extends InterfaceC997630c4H> list) {
        this.LIZ = list;
    }
}
