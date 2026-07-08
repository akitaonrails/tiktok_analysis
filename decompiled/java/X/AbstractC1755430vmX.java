package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediViewHolder;

/* JADX INFO: renamed from: X.0vmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1755430vmX extends C11DY {
    public final C19465311Dn<JediViewHolder> LL;

    @Override // X.InterfaceC19464411De
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public C19465311Dn<JediViewHolder> LIZJ() {
        return this.LL;
    }

    public AbstractC1755430vmX(LifecycleOwner lifecycleOwner) {
        C19465311Dn<JediViewHolder> c19465311Dn = new C19465311Dn<>(lifecycleOwner);
        LLLFZ(c19465311Dn);
        this.LL = c19465311Dn;
    }
}
