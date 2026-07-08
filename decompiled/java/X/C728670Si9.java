package X;

import X.C0R5K;
import X.InterfaceC728660Si8;

/* JADX INFO: renamed from: X.0Si9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C728670Si9<M extends C0R5K, V extends InterfaceC728660Si8> {
    public M LL;
    public V LLILLJJLI;

    public C728670Si9(M m, V v) {
        if (m != null) {
            if (v != null) {
                this.LL = m;
                this.LLILLJJLI = v;
                return;
            }
            throw new NullPointerException("View can not null");
        }
        throw new NullPointerException("Model can not null");
    }
}
