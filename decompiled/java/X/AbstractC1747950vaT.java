package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.Map;

/* JADX INFO: renamed from: X.0vaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1747950vaT<T> extends C11DP<T> {
    public final Map<String, Object> LLILLL;
    public final C19465311Dn<JediViewHolder> LLILZ;

    @Override // X.C11DY
    public final void LLLFZ(C19465311Dn c19465311Dn) {
    }

    public abstract void LLLIILIL(C19465311Dn c19465311Dn);

    @Override // X.AbstractC1755430vmX, X.InterfaceC19464411De
    public final C19465311Dn LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1755430vmX
    /* JADX INFO: renamed from: LLLI */
    public final C19465311Dn<JediViewHolder> LIZJ() {
        return this.LLILZ;
    }

    public AbstractC1747950vaT(LifecycleOwner lifecycleOwner, AbstractC339510DSr<T> abstractC339510DSr, InterfaceC19464611Dg interfaceC19464611Dg, Map<String, ? extends Object> map) {
        super(lifecycleOwner, abstractC339510DSr, interfaceC19464611Dg);
        this.LLILLL = map;
        C19465311Dn<JediViewHolder> c19465311Dn = new C19465311Dn<>(lifecycleOwner);
        LLLIILIL(c19465311Dn);
        this.LLILZ = c19465311Dn;
    }
}
