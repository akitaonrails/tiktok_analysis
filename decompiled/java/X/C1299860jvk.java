package X;

import com.lynx.tasm.LynxEngine;
import com.lynx.tasm.TemplateBundle;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.0jvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299860jvk {
    public final Map<TemplateBundle, LinkedList<LynxEngine>> LIZ = new HashMap();

    public final synchronized LinkedList<LynxEngine> LIZ(TemplateBundle templateBundle) {
        if (templateBundle == null) {
            return new LinkedList<>();
        }
        LinkedList<LynxEngine> linkedList = (LinkedList) ((HashMap) this.LIZ).get(templateBundle);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            ((HashMap) this.LIZ).put(templateBundle, linkedList);
            templateBundle.LLIZLLLIL = new C1299850jvj(this, linkedList, templateBundle);
        }
        return linkedList;
    }
}
