package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509480pNq {
    public static AbstractC1509490pNr LIZ(String str) {
        if (str != null) {
            return AbstractC1509490pNr.LJII.get(str);
        }
        return null;
    }

    public static void LIZIZ(AbstractC1509490pNr abstractC1509490pNr, String str) {
        String nickname;
        User author;
        ConcurrentHashMap<String, AbstractC1509490pNr> concurrentHashMap = AbstractC1509490pNr.LJII;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, abstractC1509490pNr);
        AbstractC1509490pNr.LJIIIZ++;
        int i = AbstractC1509490pNr.LJIIIIZZ + 1;
        AbstractC1509490pNr.LJIIIIZZ = i;
        abstractC1509490pNr.LIZIZ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putCache putIndex:");
        sbLIZ.append(AbstractC1509490pNr.LJIIIIZZ);
        sbLIZ.append(" putCount:");
        sbLIZ.append(AbstractC1509490pNr.LJIIIZ);
        sbLIZ.append(" importantCount:");
        sbLIZ.append(0);
        sbLIZ.append(" cache:");
        sbLIZ.append(concurrentHashMap.size());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(' ');
        Aweme awemeLIZ = abstractC1509490pNr.LIZ();
        if (awemeLIZ != null && (author = awemeLIZ.getAuthor()) != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = AbstractC1509490pNr.LJIIIZ;
        int i3 = AbstractC1509490pNr.LJIIJ;
        if (i2 > AbstractC1509490pNr.LJIIJJI + i3) {
            int i4 = AbstractC1509490pNr.LJIIIIZZ - i3;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, AbstractC1509490pNr> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().LIZIZ < i4) {
                    entry.getValue().getClass();
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC1509490pNr.LJII.remove(it2.next());
                AbstractC1509490pNr.LJIIIZ--;
            }
        }
    }
}
