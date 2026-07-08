package X;

import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0SiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728840SiQ {
    public static final String LIZ(InsertStory insertStory) {
        return C08JS.LIZLLL(C13LP.LLIIII(Collections.singletonList(insertStory)));
    }

    public static final EnumC1596540reG LIZIZ(Long l) {
        EnumC1596540reG next;
        Iterator<EnumC1596540reG> it2 = EnumC1596540reG.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long value = next.getValue();
                if (l != null && value == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1596540reG enumC1596540reG = next;
        if (enumC1596540reG == null) {
            return EnumC1596540reG.UNDEFINED;
        }
        return enumC1596540reG;
    }
}
