package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997570c4B implements IAdTranslationData {
    public final List<InterfaceC997580c4C> LIZ;

    public final C997600c4E LIZ() {
        InterfaceC997580c4C next;
        Iterator<InterfaceC997580c4C> it2 = this.LIZ.iterator();
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
        InterfaceC997580c4C interfaceC997580c4C = next;
        if (interfaceC997580c4C == null || !(interfaceC997580c4C instanceof C997600c4E)) {
            return null;
        }
        return (C997600c4E) interfaceC997580c4C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C997570c4B(List<? extends InterfaceC997580c4C> list) {
        this.LIZ = list;
    }
}
