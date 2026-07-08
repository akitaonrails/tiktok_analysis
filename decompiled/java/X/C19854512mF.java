package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.12mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19854512mF implements Comparator<AbstractC19854812mI> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC19854812mI abstractC19854812mI, AbstractC19854812mI abstractC19854812mI2) {
        AbstractC19854812mI abstractC19854812mI3 = abstractC19854812mI;
        AbstractC19854812mI abstractC19854812mI4 = abstractC19854812mI2;
        InterfaceC19854612mG interfaceC19854612mG = (InterfaceC19854612mG) abstractC19854812mI3.iterator();
        InterfaceC19854612mG interfaceC19854612mG2 = (InterfaceC19854612mG) abstractC19854812mI4.iterator();
        while (interfaceC19854612mG.hasNext() && interfaceC19854612mG2.hasNext()) {
            int iCompareTo = Integer.valueOf(interfaceC19854612mG.zza() & 255).compareTo(Integer.valueOf(interfaceC19854612mG2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC19854812mI3.zzb()).compareTo(Integer.valueOf(abstractC19854812mI4.zzb()));
    }
}
