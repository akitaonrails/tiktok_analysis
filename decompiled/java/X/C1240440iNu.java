package X;

import Y.AComparatorS38S0000000_19;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240440iNu implements InterfaceC1240700iOK<C1240530iO3> {
    public final Function1<String, C0Y8T> LIZ;
    public final Function1<List<String>, List<C0Y8T>> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C1231704rr LIZLLL;
    public final C01GW LJ;

    public C1240440iNu(int i) {
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(137);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(393);
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(408);
        C1231704rr c1231704rr = new C1231704rr("group_engine", "search", 4);
        this.LIZ = aFwS231S0000000_3;
        this.LIZIZ = aFwS248S0000000_14;
        this.LIZJ = aFwS226S0000000_35;
        this.LIZLLL = c1231704rr;
        this.LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2883));
    }

    @Override // X.InterfaceC1240700iOK
    public final Object LIZIZ(List<? extends C1240530iO3> list, InterfaceC1364105Vn<? super List<? extends C1240530iO3>> interfaceC1364105Vn) {
        return C13LP.LJLLLL(new AComparatorS38S0000000_19(1), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r19, X.InterfaceC1364105Vn<? super java.util.List<X.C316510Cav>> r20) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240440iNu.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1240530iO3 r26, X.InterfaceC1364105Vn<? super X.C316510Cav> r27) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240440iNu.LIZLLL(X.0iO3, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1240700iOK
    public final Object LIZ(List<C1240340iNk> list, C1240770iOR c1240770iOR, C1240760iOQ c1240760iOQ, InterfaceC1364105Vn<? super List<? extends C1240530iO3>> interfaceC1364105Vn) {
        ArrayList arrayList = new ArrayList();
        for (C1240340iNk c1240340iNk : list) {
            if (c1240340iNk.LIZIZ == 1) {
                arrayList.add(c1240340iNk);
            }
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1240340iNk) it2.next()).LIZJ);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C0Y8T c0y8tInvoke = this.LIZ.invoke((String) it3.next());
            if (c0y8tInvoke != null) {
                arrayList3.add(c0y8tInvoke);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C0Y8T) it4.next()).getConversationId());
        }
        List<String> listLLIIII = C13LP.LLIIII(C13LP.LJLLLLLL(arrayList2, C13LP.LLIIJI(arrayList4)));
        List listLJLIL = arrayList3;
        if (!listLLIIII.isEmpty()) {
            List<C0Y8T> listInvoke = this.LIZIZ.invoke(listLLIIII);
            C1231704rr c1231704rr = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" conversationDBDuration ");
            sbLIZ.append(listInvoke);
            C2188811AlT.LIZIZ(sbLIZ);
            c1231704rr.getClass();
            listLJLIL = C13LP.LJLIL(listInvoke, arrayList3);
        }
        List listLIZ = C1240380iNo.LIZ(C1240380iNo.LIZ, C13BV.INSTANCE, listLJLIL, arrayList, EnumC1240620iOC.ACCOUNT);
        C1231704rr c1231704rr2 = this.LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("group count： ");
        sbLIZ2.append(((ArrayList) listLIZ).size());
        C2188811AlT.LIZIZ(sbLIZ2);
        c1231704rr2.getClass();
        return listLIZ;
    }
}
