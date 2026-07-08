package X;

import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckData;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.00Gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C051400Gq {
    public static final boolean LIZ(MentionCheckResult mentionCheckResult) {
        MentionCheckData mentionCheckData;
        Map<String, Integer> map;
        Collection<Integer> collectionValues;
        Integer num = mentionCheckResult.statusCode;
        if (num == null || num.intValue() != 0 || (mentionCheckData = mentionCheckResult.data) == null || (map = mentionCheckData.permissionResult) == null || (collectionValues = map.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
