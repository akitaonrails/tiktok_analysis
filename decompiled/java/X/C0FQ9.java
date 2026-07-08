package X;

import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQ9 {
    public static final void LIZ(PUgcTemplateData pUgcTemplateData, String str) {
        if ((pUgcTemplateData.needHandleAICreate || pUgcTemplateData.aiCreateStylizedI2VCnt > 0 || pUgcTemplateData.aiCreateStylizedFL2VCnt > 0) && !a0.LJJJIL(str)) {
            List<String> list = pUgcTemplateData.hashtags;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (u.LJIJI(it2.next(), str, true)) {
                        return;
                    }
                }
            }
            pUgcTemplateData.hashtags = C13LP.LJLILLLLZI(str, pUgcTemplateData.hashtags);
        }
    }
}
