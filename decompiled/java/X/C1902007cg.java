package X;

import java.util.Map;

/* JADX INFO: renamed from: X.07cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902007cg implements Map.Entry<String, InterfaceC1406105et>, C03W4 {
    public final String LL;
    public final InterfaceC1406105et LLILLJJLI;

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ InterfaceC1406105et setValue(InterfaceC1406105et interfaceC1406105et) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ InterfaceC1406105et getValue() {
        return this.LLILLJJLI;
    }

    public C1902007cg(String str, InterfaceC1406105et interfaceC1406105et) {
        this.LL = str;
        this.LLILLJJLI = interfaceC1406105et;
    }
}
