package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0csk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028920csk implements InterfaceC1028660csK<C443120HZe<? extends String, ? extends String, ? extends String>> {
    public final InterfaceC1023690ckJ<?, ?>[] LIZ;
    public final String LIZIZ;
    public final C443120HZe<String, String, String> LIZJ;

    @Override // X.InterfaceC1028660csK
    public final /* bridge */ /* synthetic */ C443120HZe getEventId() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1028660csK
    public final String getEventName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1028900csi
    public final InterfaceC1023690ckJ<?, ?>[] getKeys() {
        return this.LIZ;
    }

    public C1028920csk(String str, String str2, InterfaceC1023690ckJ[] interfaceC1023690ckJArr) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1023690ckJ interfaceC1023690ckJ : interfaceC1023690ckJArr) {
            if (!(interfaceC1023690ckJ instanceof C1028980csq)) {
                arrayList.add(interfaceC1023690ckJ);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1023690ckJ interfaceC1023690ckJ2 : interfaceC1023690ckJArr) {
            if (interfaceC1023690ckJ2 instanceof C1028980csq) {
                arrayList2.add(interfaceC1023690ckJ2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(C13LQ.LJJLL(((C1028980csq) it2.next()).LIZJ), arrayList3);
        }
        InterfaceC1023690ckJ[] interfaceC1023690ckJArr2 = (InterfaceC1023690ckJ[]) arrayList3.toArray(new InterfaceC1023690ckJ[0]);
        this.LIZ = (InterfaceC1023690ckJ[]) ((ArrayList) C13LP.LJLILLLLZI(new C1028980csq((InterfaceC1023690ckJ[]) Arrays.copyOf(interfaceC1023690ckJArr2, interfaceC1023690ckJArr2.length)), arrayList)).toArray(new InterfaceC1023690ckJ[0]);
        this.LIZIZ = str;
        this.LIZJ = new C443120HZe<>("draw_ad", str, str2);
    }
}
