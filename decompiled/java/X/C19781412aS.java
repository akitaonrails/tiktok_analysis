package X;

import com.google.android.gms.measurement.internal.zzba;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19781412aS implements Iterator<String> {
    public final Iterator<String> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.LL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public C19781412aS(zzba zzbaVar) {
        this.LL = zzbaVar.zza.keySet().iterator();
    }
}
