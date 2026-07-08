package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZU9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZU9 {
    public final C054G LIZ;
    public final C900410ZTz LIZIZ;
    public final C900410ZTz LIZJ;
    public final C2252331DDr LIZLLL;
    public final C2252331DDr LJ;
    public final /* synthetic */ C0ZU2 LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public C0ZU9(C0ZU2 c0zu2, String str, AwS558S0100000_14 awS558S0100000_14) {
        ?? arrayList;
        List<C869590Y9l> listLIZLLL;
        ?? arrayList2;
        List<C869590Y9l> listLIZLLL2;
        this.LJFF = c0zu2;
        this.LIZ = C2296808zG.LIZ(c0zu2.LIZ.getCoroutineContext().plus(C2296908zH.LIZ()));
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        this.LIZLLL = C09IR.LIZ(1, 1, enumC2252401DDy);
        this.LJ = C09IR.LIZ(1, 1, enumC2252401DDy);
        InterfaceC1755906uD interfaceC1755906uD = (InterfaceC1755906uD) awS558S0100000_14.invoke();
        int[] iArr = C0ZU2.LJI;
        if (interfaceC1755906uD != null && (listLIZLLL2 = interfaceC1755906uD.LIZLLL()) != null) {
            arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : listLIZLLL2) {
                if (C13LQ.LJJIJ(c869590Y9l.getMsgType(), C0ZU2.LJI) >= 0) {
                    arrayList.add(c869590Y9l);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LIZIZ = new C900410ZTz(str, iArr, arrayList, EnumC904370Zdr.SHARED_VIDEOS);
        int[] iArr2 = C0ZU2.LJII;
        C0ZU2 c0zu22 = this.LJFF;
        if (interfaceC1755906uD != null) {
            listLIZLLL = interfaceC1755906uD.LIZLLL();
        } else {
            listLIZLLL = null;
        }
        c0zu22.getClass();
        if (listLIZLLL != null) {
            arrayList2 = new ArrayList();
            for (C869590Y9l c869590Y9l2 : listLIZLLL) {
                if (C13LQ.LJJIJ(c869590Y9l2.getMsgType(), C0ZU2.LJII) >= 0) {
                    arrayList2.add(c869590Y9l2);
                }
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        this.LIZJ = new C900410ZTz(str, iArr2, arrayList2, EnumC904370Zdr.PRIVATE_MEDIA);
        C23250099c.LIZLLL(this.LIZ, null, null, new C0ZU7(this, this.LJFF, null), 3);
        C23250099c.LIZLLL(this.LIZ, null, null, new C0ZU8(this, this.LJFF, null), 3);
    }
}
