package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.13Jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19989713Jf {
    public static final void LIZ(int i, int i2, InterfaceC19983313Gt interfaceC19983313Gt) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        int i4 = 0;
        do {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC19983313Gt.LIZJ(i4));
            }
            i3 >>>= 1;
            i4++;
        } while (i4 < 32);
        throw new C1211720hda(arrayList, interfaceC19983313Gt.LJI());
    }
}
