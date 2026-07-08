package X;

import java.util.List;

/* JADX INFO: renamed from: X.0KJC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJC extends C1117360fBO implements InterfaceC508520Jww<InterfaceC515600KJy> {
    @Override // X.InterfaceC508520Jww
    public final List<InterfaceC515600KJy> LLILIL() {
        List list = this.LL;
        if (list instanceof List) {
            return list;
        }
        return null;
    }

    @Override // X.InterfaceC508520Jww
    public final void LLIILII(int i) {
        notifyItemChanged(i);
    }
}
