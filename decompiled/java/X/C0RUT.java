package X;

import com.bytedance.assem.arch.core.UIAssem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RUT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RUT<T extends UIAssem> extends C0RUV<T> implements C0RTK {
    public final /* synthetic */ C0RTE LLILZIL = new C0RTE();
    public final /* synthetic */ C0RTD LLILZLL = new C0RTD();
    public transient List<C0RUV<? extends AbstractC738140SxQ>> LLIZ = new ArrayList();

    @Override // X.C0RTK
    public final void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LLILZIL.Zf(map);
    }

    @Override // X.C0RTK
    public final Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LLILZIL.LL;
    }

    @Override // X.C0RUV
    public List<T> LIZJ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        return (List) new C0RUU(this, map).invoke();
    }

    @Override // X.C0RUV
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public void LIZLLL(T t, Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        t.setConfig(this);
        t.assemTagInternal = this.LLILLJJLI;
        HashMap<AbstractC1155604fa<?>, C0RTG<?>> map2 = this.LLILZIL.LL;
        if (!map2.isEmpty()) {
            t.Zf(map2);
        }
        t.vmMapping.putAll(this.LLILZLL.LIZ);
    }
}
