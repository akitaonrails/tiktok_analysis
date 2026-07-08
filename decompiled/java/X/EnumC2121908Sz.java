package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2121908Sz implements C08TC {
    public static final AtomicReference LL;
    public static final /* synthetic */ EnumC2121908Sz[] LLILLJJLI;
    public static final EnumC2121908Sz zza;

    static {
        EnumC2121908Sz enumC2121908Sz = new EnumC2121908Sz();
        zza = enumC2121908Sz;
        LLILLJJLI = new EnumC2121908Sz[]{enumC2121908Sz};
        LL = new AtomicReference(null);
    }

    public static EnumC2121908Sz[] values() {
        return (EnumC2121908Sz[]) LLILLJJLI.clone();
    }

    @Override // X.C08TC
    public final InterfaceC2424509el zza() {
        return (InterfaceC2424509el) LL.get();
    }

    public final void zzb(InterfaceC2424509el interfaceC2424509el) {
        LL.set(interfaceC2424509el);
    }
}
