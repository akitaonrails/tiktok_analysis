package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19489911Mz implements InterfaceC420801kM {
    public static final EnumC19489911Mz LL;
    public static final /* synthetic */ EnumC19489911Mz[] LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return true;
    }

    static {
        EnumC19489911Mz enumC19489911Mz = new EnumC19489911Mz();
        LL = enumC19489911Mz;
        LLILLJJLI = new EnumC19489911Mz[]{enumC19489911Mz};
    }

    public static EnumC19489911Mz[] values() {
        return (EnumC19489911Mz[]) LLILLJJLI.clone();
    }

    public static void LIZJ(AtomicReference atomicReference) {
        InterfaceC420801kM interfaceC420801kM;
        Object obj = atomicReference.get();
        EnumC19489911Mz enumC19489911Mz = LL;
        if (obj != enumC19489911Mz && (interfaceC420801kM = (InterfaceC420801kM) atomicReference.getAndSet(enumC19489911Mz)) != enumC19489911Mz && interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public static EnumC19489911Mz valueOf(String str) {
        return (EnumC19489911Mz) C08FF.LIZ(EnumC19489911Mz.class, str);
    }
}
