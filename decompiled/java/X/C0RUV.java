package X;

import X.AbstractC738140SxQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RUV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RUV<T extends AbstractC738140SxQ> {
    public C13IQ<? extends T> LL;
    public String LLILLJJLI;
    public transient List<C634030Ott> LLILLL = new ArrayList();
    public Map<String, Object> LLILZ = new LinkedHashMap();

    public final AbstractC738410Sxr LIZ() {
        return null;
    }

    public final List<T> LIZIZ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        List<T> listLIZJ = LIZJ(map);
        Iterator<T> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            LIZLLL(it2.next(), map);
        }
        return listLIZJ;
    }

    public List<T> LIZJ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        C13IQ<? extends T> c13iq = this.LL;
        if (c13iq != null) {
            return Collections.singletonList(C09R7.LIZ(c13iq).newInstance());
        }
        "Type of this assemble is null, have you forget to set type? For example: \nassemble {\n    uiContentAssem {\n       type = YourAssemType::class\n    }\n}".toString();
        throw new IllegalArgumentException("Type of this assemble is null, have you forget to set type? For example: \nassemble {\n    uiContentAssem {\n       type = YourAssemType::class\n    }\n}");
    }

    public void LIZLLL(T t, Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        t.setConfig(this);
        t.assemTagInternal = this.LLILLJJLI;
    }

    public final void LJ(Object obj, String str) {
        this.LLILZ.put(str, obj);
    }
}
