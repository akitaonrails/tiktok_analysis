package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0Zib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907310Zib {
    public final InterfaceC907650Zj9 LIZ;
    public final Keva LIZIZ;
    public final InterfaceC874680YTa LIZJ;
    public final C1231704rr LIZLLL;
    public final Function1<C907790ZjN, Unit> LJ;

    public C907310Zib() {
        throw null;
    }

    public C907310Zib(InterfaceC907650Zj9 interfaceC907650Zj9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_search_content_");
        sbLIZ.append((Object) C461720I8s.LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
        C1231704rr c1231704rr = new C1231704rr("update_message", "search", 4);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(470);
        this.LIZ = interfaceC907650Zj9;
        this.LIZIZ = repo;
        this.LIZJ = interfaceC874680YTaLIZ;
        this.LIZLLL = c1231704rr;
        this.LJ = aFwS248S0000000_14;
    }

    public final void LIZ(List<? extends C869590Y9l> list) {
        synchronized (this) {
            try {
                if (this.LIZIZ.getLong("cold_message_create_time_cursor", -1L) == -1) {
                    return;
                }
                C1231704rr c1231704rr = this.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteMessageList size ");
                sbLIZ.append(list.size());
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
                ArrayList arrayList = new ArrayList();
                for (C869590Y9l c869590Y9l : list) {
                    C907280ZiY.LIZ.getClass();
                    if (((ArrayList) C907280ZiY.LIZLLL).contains(Integer.valueOf(c869590Y9l.getMsgType()))) {
                        arrayList.add(c869590Y9l);
                    }
                }
                C1231704rr c1231704rr2 = this.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("deleteMessageList after filter size ");
                sbLIZ2.append(arrayList.size());
                C2188811AlT.LIZIZ(sbLIZ2);
                c1231704rr2.LIZIZ();
                this.LIZ.LJ(LIZIZ(arrayList));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C907840ZjS> LIZIZ(java.util.List<? extends X.C869590Y9l> r21) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907310Zib.LIZIZ(java.util.List):java.util.List");
    }

    public final void LIZJ(List<? extends C869590Y9l> list) {
        synchronized (this) {
            try {
                if (this.LIZIZ.getLong("cold_message_create_time_cursor", -1L) == -1) {
                    this.LIZLLL.LIZIZ();
                    return;
                }
                C1231704rr c1231704rr = this.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insertMessageList size ");
                sbLIZ.append(list.size());
                sbLIZ.append(" list ");
                sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(471), 31));
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
                ArrayList arrayList = new ArrayList();
                for (C869590Y9l c869590Y9l : list) {
                    C907280ZiY.LIZ.getClass();
                    if (((ArrayList) C907280ZiY.LIZLLL).contains(Integer.valueOf(c869590Y9l.getMsgType()))) {
                        arrayList.add(c869590Y9l);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    C907280ZiY.LIZ.getClass();
                    if (C907280ZiY.LIZ((C869590Y9l) obj)) {
                        arrayList2.add(obj);
                    } else {
                        arrayList3.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List<? extends C869590Y9l> list2 = (List) pair.getFirst();
                List<? extends C869590Y9l> list3 = (List) pair.getSecond();
                C1231704rr c1231704rr2 = this.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("messageListToInsertOrUpdate size ");
                sbLIZ2.append(list2.size());
                sbLIZ2.append(" list ");
                sbLIZ2.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(472), 31));
                C2188811AlT.LIZIZ(sbLIZ2);
                c1231704rr2.LIZIZ();
                C1231704rr c1231704rr3 = this.LIZLLL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("messageListToDelete size ");
                sbLIZ3.append(list3.size());
                sbLIZ3.append(" list ");
                sbLIZ3.append(C13LP.LJJLIIIJ(list3, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(473), 31));
                C2188811AlT.LIZIZ(sbLIZ3);
                c1231704rr3.LIZIZ();
                this.LIZ.LJFF(LIZIZ(list2), true);
                this.LIZ.LJ(LIZIZ(list3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
