package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ckk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023960ckk implements InterfaceC1023400cjq<C443120HZe<? extends String, ? extends String, ? extends String>> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC1007800cKg LIZLLL = null;
    public final InterfaceC1023650ckF<?, ?>[] LJ;
    public final String LJFF;
    public final C443120HZe<String, String, String> LJI;

    @Override // X.InterfaceC1023400cjq
    public final InterfaceC1007800cKg LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1023400cjq
    public final String LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1023400cjq
    public final /* bridge */ /* synthetic */ C443120HZe<? extends String, ? extends String, ? extends String> getEventId() {
        return this.LJI;
    }

    @Override // X.InterfaceC1023410cjr
    public final InterfaceC1023650ckF<?, ?>[] getKeys() {
        return this.LJ;
    }

    public C1023960ckk(String str, String str2, String str3, InterfaceC1023650ckF[] interfaceC1023650ckFArr, InterfaceC1023650ckF[] interfaceC1023650ckFArr2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        InterfaceC1023650ckF[] interfaceC1023650ckFArr3 = (InterfaceC1023650ckF[]) C13DL.LJIIIZ(interfaceC1023650ckFArr, interfaceC1023650ckFArr2);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1023650ckF interfaceC1023650ckF : interfaceC1023650ckFArr3) {
            if (!(interfaceC1023650ckF instanceof C1023670ckH)) {
                arrayList.add(interfaceC1023650ckF);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1023650ckF interfaceC1023650ckF2 : interfaceC1023650ckFArr3) {
            if (interfaceC1023650ckF2 instanceof C1023670ckH) {
                arrayList2.add(interfaceC1023650ckF2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(C13LQ.LJJLL(((C1023670ckH) it2.next()).LIZ), arrayList3);
        }
        InterfaceC1023650ckF[] interfaceC1023650ckFArr4 = (InterfaceC1023650ckF[]) arrayList3.toArray(new InterfaceC1023650ckF[0]);
        this.LJ = (InterfaceC1023650ckF[]) ((ArrayList) C13LP.LJLILLLLZI(new C1023670ckH((InterfaceC1023650ckF[]) Arrays.copyOf(interfaceC1023650ckFArr4, interfaceC1023650ckFArr4.length)), arrayList)).toArray(new InterfaceC1023650ckF[0]);
        String str4 = this.LIZIZ;
        this.LJFF = str4;
        this.LJI = new C443120HZe<>(this.LIZ, str4, this.LIZJ);
    }
}
