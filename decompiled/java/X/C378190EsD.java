package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0EsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378190EsD {
    public static AICreateStylizedType LIZ(int i) {
        AICreateStylizedType next;
        Iterator<AICreateStylizedType> it2 = AICreateStylizedType.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICreateStylizedType aICreateStylizedType = next;
        if (aICreateStylizedType == null) {
            return AICreateStylizedType.NONE;
        }
        return aICreateStylizedType;
    }
}
