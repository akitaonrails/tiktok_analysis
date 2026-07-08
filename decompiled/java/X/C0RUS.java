package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RUS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUS extends C0RUV<AbstractC738140SxQ> implements C0RTL {
    public AbstractC738140SxQ LLILZIL;

    @Override // X.C0RUV
    public final List<AbstractC738140SxQ> LIZJ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        List<AbstractC738140SxQ> listSingletonList;
        AbstractC738140SxQ abstractC738140SxQ = this.LLILZIL;
        if (abstractC738140SxQ == null || (listSingletonList = Collections.singletonList(abstractC738140SxQ)) == null) {
            return super.LIZJ(map);
        }
        return listSingletonList;
    }
}
