package X;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19931512yf<K, V> extends AbstractC19931812yi<C19931512yf<K, V>> {
    public K LL;
    public V LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJL(C19927612y2 c19927612y2) {
        return this;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final C19931412ye<K, V> buildPartial() {
        return new C19931412ye<>(this.LL, this.LLILLJJLI);
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final C19931512yf<K, V> mo79clone() {
        return new C19931512yf<>(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // X.InterfaceC19933112yv
    public final Map<C19939112zt, Object> getAllFields() {
        new TreeMap();
        throw null;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        buildPartial();
        throw null;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        throw null;
    }

    @Override // X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        throw null;
    }

    @Override // X.InterfaceC19933112yv
    public final C19927612y2 getUnknownFields() {
        return C19927612y2.LLILLJJLI;
    }

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        throw null;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        buildPartial();
        throw null;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        throw null;
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LLFFF(C19939112zt c19939112zt) {
        throw null;
    }

    @Override // X.InterfaceC19933112yv
    public final Object getField(C19939112zt c19939112zt) {
        throw null;
    }

    @Override // X.InterfaceC19933112yv
    public final boolean hasField(C19939112zt c19939112zt) {
        throw null;
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJIIZILJ(C19939112zt c19939112zt, Object obj) {
        throw null;
    }

    @Override // X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJ(C19939112zt c19939112zt, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19931512yf(Object obj, Object obj2, boolean z, boolean z2) {
        this.LL = obj;
        this.LLILLJJLI = obj2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
