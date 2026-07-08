package X;

import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlotKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ki2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524760Ki2 {
    public static final int LIZ(String str, List list) {
        int i = 0;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                TemplateSlot templateSlot = (TemplateSlot) it2.next();
                if (TemplateSlotKt.getHasMaterialTypeConstraints(templateSlot) && Intrinsics.LJFF(TemplateSlotKt.getMaterialType(templateSlot), str) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }
}
