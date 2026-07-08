package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageKey;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Y9I, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9I implements C0YE6 {
    public final C0YEM LL;
    public final C0Y9J LLILLJJLI;

    @Override // X.C0YE6
    public final void LJIJJLI() {
        this.LL.LJIIJJI().LIZJ(new C914050ZtT(this, 6), null, false, this.LL.LJIIL().LIZJ());
    }

    @Override // X.C0YE6
    public final long LLIIIL() {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIJL();
    }

    @Override // X.C0YE6
    public final void LLLFF() {
        this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava processAllPendingMessageBody");
        if (!this.LL.LJIIZILJ().LIZIZ().LIZJ().LJ()) {
            this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava no pending MessageBody, skip");
            return;
        }
        Iterator it2 = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJ().LIZIZ().iterator();
        while (it2.hasNext()) {
            LIZIZ((C869520Y9e) it2.next(), "_delayed");
        }
        this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJ().clearAll();
        this.LL.LJIIZILJ().LIZIZ().LIZJ().LIZLLL(false);
    }

    public C0Y9I(C0YEM c0yem) {
        this.LL = c0yem;
        this.LLILLJJLI = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
    }

    public static int[] LIZLLL(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) ListProtector.get(list, i)).intValue();
        }
        return iArr;
    }

    @Override // X.C0YE6
    public final C0Y6Q<C0Y9O> LJIIL(final C0Y9U c0y9u) {
        C0Y6Q<List<C869590Y9l>> c0y6qLJJLIL = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJLIL(c0y9u);
        C0YPQ c0ypq = c0y6qLJJLIL.LIZIZ;
        if (c0ypq == null) {
            final List<C869590Y9l> list = c0y6qLJJLIL.LIZ;
            return C865670Xxd.LIZJ(new Object(c0y9u, list) { // from class: X.0Y9O
                public final C0Y9U LIZ;
                public final List<C869590Y9l> LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0Y9O)) {
                        return false;
                    }
                    C0Y9O c0y9o = (C0Y9O) obj;
                    return Intrinsics.LJFF(this.LIZ, c0y9o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y9o.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MessageQueryResult(query=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", messages=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = c0y9u;
                    this.LIZIZ = list;
                }
            });
        }
        return C865670Xxd.LIZIZ(c0ypq);
    }

    @Override // X.C0YE6
    public final Long LJJIFFI(C869590Y9l c869590Y9l) {
        String strLJFF;
        if (!this.LL.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZ || !c869590Y9l.isRecalled() || c869590Y9l.getSender() != this.LL.LJ().LJ().getUid() || (strLJFF = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LIZJ().LJFF(c869590Y9l.getUuid(), "recall_time")) == null) {
            return null;
        }
        try {
            return Long.valueOf(CastLongProtector.parseLong(strLJFF) + this.LL.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZIZ);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0YE6
    public final C0Y6Q<C0Y9N> LJJII(final C0Y9U c0y9u) {
        C0Y6Q<Long> c0y6qLJIILLIIL = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJIILLIIL(c0y9u);
        C0YPQ c0ypq = c0y6qLJIILLIIL.LIZIZ;
        if (c0ypq == null) {
            final long jLongValue = c0y6qLJIILLIIL.LIZ.longValue();
            return C865670Xxd.LIZJ(new Object(c0y9u, jLongValue) { // from class: X.0Y9N
                public final C0Y9U LIZ;
                public final long LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0Y9N)) {
                        return false;
                    }
                    C0Y9N c0y9n = (C0Y9N) obj;
                    return Intrinsics.LJFF(this.LIZ, c0y9n.LIZ) && this.LIZIZ == c0y9n.LIZIZ;
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MessageCountResult(query=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", count=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = c0y9u;
                    this.LIZIZ = jLongValue;
                }
            });
        }
        return C865670Xxd.LIZIZ(c0ypq);
    }

    @Override // X.C0YE6
    public final void LJJIIJ(C869520Y9e c869520Y9e) {
        this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava addPendingMessageBody");
        if (this.LL.isLogin()) {
            this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava process and save in Message table immediately");
            if (this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJ(c869520Y9e.LIZ) != null) {
                return;
            }
            LIZIZ(c869520Y9e, "");
            return;
        }
        this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava save as PendingMessageBody, process later");
        if (this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJ().LIZ(c869520Y9e)) {
            this.LL.LJIIZILJ().LIZIZ().LIZJ().LIZLLL(true);
        }
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJIIZI(String str) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJI(str);
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJJIJIIJIL(List<Long> list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIL(list);
    }

    @Override // X.C0YE6
    public final List LJJIJLIJ(long j) {
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LJ = new C1262204wm(j);
        final C0Y9L c0y9l = C0Y9L.FAIL;
        c0y9k.LJIIJ = new AbstractC1269804y0(c0y9l) { // from class: X.04xz
            public final C0Y9L LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1269704xz) && this.LIZIZ == ((C1269704xz) obj).LIZIZ;
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Equals(status=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1269804y0
            public final AbstractC1261104wb LIZ() {
                return new C1261004wa(this.LIZIZ.getValue());
            }

            {
                this.LIZIZ = c0y9l;
            }
        };
        return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, 5)).LIZ(Collections.emptyList());
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJLJ(String str) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIIJZLJL(str);
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJJLJLI(List<Long> list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIZ(list);
    }

    @Override // X.C0YE6
    public final C869590Y9l LJLIIL(long j) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJ(j);
    }

    @Override // X.C0YE6
    public final long LJLZ(String str) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIFFI(str);
    }

    @Override // X.C0YE6
    public final long LLF(List<Integer> list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIJIIJI(list);
    }

    @Override // X.C0YE6
    public final List LLFII(String str) {
        return (List) this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJZI(20, 0L, str).LIZ(Collections.emptyList());
    }

    @Override // X.C0YE6
    public final void LLIIIILZ(List<C869590Y9l> list) {
        C869660Y9s c869660Y9sLJIIJ = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJIIJ();
        c869660Y9sLJIIJ.getClass();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            c869660Y9sLJIIJ.LJIIIZ((C869590Y9l) it2.next());
        }
    }

    @Override // X.C0YE6
    public final boolean LLIIIZ(long j) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJL(j);
    }

    @Override // X.C0YE6
    public final List<Long> LLIIJI(List<Long> list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJI(list);
    }

    @Override // X.C0YE6
    public final Map<String, List<C0YC6>> LLJJIII(List<String> list) {
        C869870YAn c869870YAnLJII = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJII();
        c869870YAnLJII.getClass();
        HashMap map = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from attchment where ");
                sbLIZ.append(C0YA0.COLUMN_HASH.key);
                sbLIZ.append(" in (");
                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                for (int i = 0; i < list.size(); i++) {
                    sb.append("?");
                    if (i != list.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                interfaceC869470Y8zLJIIJJI = c869870YAnLJII.LIZJ.getProxy().LJIIJJI(sb.toString(), "getAttachmentsMapByMD5", (String[]) list.toArray(new String[0]));
                for (C0YC6 c0yc6 : (ArrayList) C869870YAn.LIZJ(interfaceC869470Y8zLJIIJJI)) {
                    List arrayList = (List) map.get(c0yc6.hash);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(c0yc6.hash, arrayList);
                    }
                    arrayList.add(c0yc6);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c869870YAnLJII.LIZ.LIZLLL().LJIIIZ("IMAttachmentDao getAttachments2 ", e);
                c869870YAnLJII.LIZIZ.LJFF().getEventTracker().LIZLLL("IMAttachmentDao getAttachments2", e);
            }
            c869870YAnLJII.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            c869870YAnLJII.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getAttachmentsMapByMD5");
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c869870YAnLJII.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    @Override // X.C0YE6
    public final void LLJJIJIIJIL(List<String> list) {
        C869870YAn c869870YAnLJII = this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJII();
        c869870YAnLJII.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : (ArrayList) list) {
                if (!str.isEmpty()) {
                    sb.append(",");
                    sb.append('\"');
                    sb.append(str);
                    sb.append('\"');
                }
            }
            String string = sb.toString();
            if (string.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.h);
                sbLIZ.append(string.substring(1));
                sbLIZ.append(")");
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            C870430YCr proxy = c869870YAnLJII.LIZ.LJIIZILJ().LIZIZ().getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("delete from attchment where ");
            sbLIZ2.append(C0YA0.COLUMN_HASH.key);
            sbLIZ2.append(" in ");
            sbLIZ2.append(string);
            boolean zLIZLLL = proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "deleteAttachmentByMD5");
            C868780Y6i c868780Y6iLIZLLL = c869870YAnLJII.LIZ.LIZLLL();
            String strValueOf = String.valueOf(zLIZLLL);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMAttachmentDao delete attachment by md5", strValueOf, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c869870YAnLJII.LIZ.LIZLLL().LJIIIZ("IMAttachmentDao delete attachment by md5 ", e);
            c869870YAnLJII.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMAttachmentDao delete attachment by md5", e);
        }
        c869870YAnLJII.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "deleteAttachmentByMD5");
    }

    public final void LIZIZ(C869520Y9e c869520Y9e, String str) {
        this.LL.LIZLLL().LIZIZ("MessageOperatorModelJava savePendingMessageBody");
        MessageBody messageBodyLIZ = C0Y81.LIZ(this.LL.LIZLLL(), this.LL.LJIIZILJ().LJFF().LIZ(), this.LL.LJIIZILJ().LIZ().LIZJ(), new ByteString(c869520Y9e.LIZIZ), c869520Y9e.LIZLLL, null, "", "MessageOperatorModelJava", C0Y82.UNKNOWN);
        if (messageBodyLIZ != null && messageBodyLIZ.message_type != null && messageBodyLIZ.server_message_id != null) {
            InterfaceC868170Y3z interfaceC868170Y3zLIZJ = this.LL.LJIIZILJ().getDomain().LIZJ();
            List listSingletonList = Collections.singletonList(messageBodyLIZ);
            String str2 = c869520Y9e.LIZJ;
            int i = c869520Y9e.LIZLLL;
            int i2 = c869520Y9e.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c869520Y9e.LJFF);
            sbLIZ.append(str);
            interfaceC868170Y3zLIZJ.LLJJI(i, i2, c869520Y9e.LJI, str2, C2188811AlT.LIZIZ(sbLIZ), listSingletonList);
        }
    }

    @Override // X.C0YE6
    public final void LIZJ(C914120Zta c914120Zta, List list) {
        this.LL.LJIIZILJ().getDomain().LIZJ().LIZJ(c914120Zta, list);
    }

    public final C869590Y9l LJ(C869590Y9l c869590Y9l, boolean z) {
        boolean zLJLIIL;
        C0Y8T c0y8tLIZ;
        if (z) {
            zLJLIIL = this.LLILLJJLI.LJI().LJLILLLLZI(c869590Y9l);
        } else {
            zLJLIIL = this.LLILLJJLI.LJI().LJLIIL(c869590Y9l, true, true);
        }
        if (!zLJLIIL) {
            return null;
        }
        if (this.LLILLJJLI.LJI().LJJIIJ(c869590Y9l.getConversationId()) == c869590Y9l.getIndex() && (c0y8tLIZ = this.LL.LJIIZILJ().LIZLLL().LIZ().LIZ(c869590Y9l.getConversationId())) != null) {
            c0y8tLIZ.setLastShowMessage(c869590Y9l);
            this.LL.LJIIZILJ().LIZLLL().LIZLLL().LJJLI(2, c0y8tLIZ);
        }
        return c869590Y9l;
    }

    @Override // X.C0YE6
    public final void LJIJI(C869590Y9l c869590Y9l, C914150Ztd c914150Ztd) {
        if (!this.LL.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZ) {
            c914150Ztd.LIZIZ(C0YMW.from(C0YIN.LJFF(this.LL, -1015)));
            return;
        }
        C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
        final String uuid = c869590Y9l.getUuid();
        final String conversationId = c869590Y9l.getConversationId();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final C864930XwR c864930XwR = new C864930XwR(c0yem);
        c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<C869590Y9l, C0Y8T>>() { // from class: X.0Xvw
            @Override // X.InterfaceC872410YKh
            public final Pair<C869590Y9l, C0Y8T> LIZ() {
                C869590Y9l c869590Y9lLJJJI;
                if (!c864930XwR.LIZLLL.LJI().LJLI(uuid) || (c869590Y9lLJJJI = c864930XwR.LIZLLL.LJI().LJJJI(uuid)) == null) {
                    return null;
                }
                c869590Y9lLJJJI.setDeleted(0);
                c864930XwR.LJIILL(c869590Y9lLJJJI, C0YUT.AVAILABLE);
                C868200Y4c c868200Y4c = c864930XwR.LIZJ.LJIIZILJ().getDomain().LIZ;
                C0Y3I c0y3i = new C0Y3I("undo delete");
                List<C869590Y9l> listSingletonList = Collections.singletonList(c869590Y9lLJJJI);
                c868200Y4c.getClass();
                c868200Y4c.LJJIIZ(c0y3i, listSingletonList, new HashMap(), 7);
                c864930XwR.LIZLLL.LJIIJJI().LJJJZ(c864930XwR.LIZLLL.LJI().LJJIIJZLJL(conversationId));
                return new Pair<>(c869590Y9lLJJJI, c864930XwR.LIZLLL.LJIIJJI().LIZ(conversationId, true));
            }
        }, new C914020ZtQ(c914150Ztd, c864930XwR, 11), false, c0yem.LJIIL().LIZLLL());
    }

    @Override // X.C0YE6
    public final List LJIL(long j, List list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJIJIL(j, list);
    }

    @Override // X.C0YE6
    public final void LJJIJL(final C869590Y9l c869590Y9l, final InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        this.LL.LIZLLL().LJIIJJI("MessageOperatorModelJavaaddMessage");
        this.LL.LJIIIZ().getClass();
        this.LL.LJIIJJI().LIZJ(new C914040ZtS(this, c869590Y9l, 11), new InterfaceC864800XwE<Pair<C0Y8T, C869590Y9l>>() { // from class: X.0XwZ
            @Override // X.InterfaceC864800XwE
            public final void LIZ(Pair<C0Y8T, C869590Y9l> pair) {
                Pair<C0Y8T, C869590Y9l> pair2 = pair;
                if (pair2 != null) {
                    if (pair2.first != null) {
                        this.LIZJ.LL.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, (C0Y8T) pair2.first);
                    }
                    InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                    if (interfaceC863600XuI2 != null) {
                        interfaceC863600XuI2.onSuccess(c869590Y9l);
                        return;
                    }
                    return;
                }
                c869590Y9l.setMsgStatus(3);
                InterfaceC863600XuI interfaceC863600XuI3 = interfaceC863600XuI;
                if (interfaceC863600XuI3 == null) {
                    return;
                }
                interfaceC863600XuI3.LIZIZ(C0YMW.from(C0YIN.LJFF(this.LIZJ.LL, -3001)));
            }
        }, false, this.LL.LJIIL().LIZJ());
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJIL(long j, String str) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJIL(j, str);
    }

    @Override // X.C0YE6
    public final void LJJJJ(C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
        this.LL.LJIIZILJ().getDomain().LIZ().LLILLL.LJIIZILJ().getDomain().LIZJ().LJJLIIIJILLIZJL(c869590Y9l, c914120Zta);
    }

    @Override // X.C0YE6
    public final List LJJJJLI(String str, long j) {
        if (str != null && !str.isEmpty()) {
            C0Y9K c0y9k = new C0Y9K();
            c0y9k.LIZJ = new C1261404we(str);
            c0y9k.LJIIIIZZ = new C1270104y3(null, false, Long.valueOf(j), true, 39);
            c0y9k.LJIIL = C0Y9W.LIZ();
            return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, 1)).LIZ(Collections.emptyList());
        }
        return Collections.emptyList();
    }

    @Override // X.C0YE6
    public final boolean LJLI(C869590Y9l c869590Y9l, Boolean bool) {
        return C868510Y5h.LIZLLL(this.LL, c869590Y9l, bool);
    }

    @Override // X.C0YE6
    public final void LLI(C0Y3I c0y3i, List<C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            this.LL.LJIIZILJ().getDomain().LIZ.LJJIIJZLJL(c0y3i, Collections.unmodifiableList(list));
        }
    }

    @Override // X.C0YE6
    public final List LLILII(long j, List list) {
        return this.LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJIZL(j, list);
    }

    @Override // X.C0YE6
    public final int LLJJIJIL(long j, long j2) {
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LJI = C1270204y4.LIZ(j, j2, true, true);
        return (int) this.LLILLJJLI.LJI().LJIILLIIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, -1)).LIZ(0L).longValue();
    }

    @Override // X.C0YE6
    public final void LLJJJJLIIL(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        LJJIIJZLJL(c869590Y9l, false, interfaceC863600XuI);
    }

    @Override // X.C0YE6
    public final void LLJLLIL(C0Y3I c0y3i, List<C869590Y9l> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageOperatorModelJava batchUpdateMessageContentPb: ");
        sbLIZ.append(arrayList.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJIIJJI().LIZJ(new C914040ZtS(this, list, 10), new C914020ZtQ(c0y3i, this, 4), false, this.LL.LJIIL().LIZJ());
    }

    @Override // X.C0YE6
    public final void LIZ(final C869590Y9l c869590Y9l, final boolean z, final InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        final C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            c870180YBsLIZ.LIZLLL().getDomain().LIZJ().LJLLI(c869590Y9l);
            c870180YBsLIZ.LIZLLL().LIZLLL().LIZ().LJJLIL(c869590Y9l.getConversationId(), new InterfaceC863600XuI<C0Y8T>() { // from class: X.0Xvr
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    boolean z2;
                    C0Y8T c0y8t2 = c0y8t;
                    if (c0y8t2 != null && c0y8t2.isStranger()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C0YEM c0yem = c870180YBsLIZ.LLILLL;
                    final C864930XwR c864930XwR = new C864930XwR(c0yem, interfaceC863600XuI, z2);
                    final C869590Y9l c869590Y9l2 = c869590Y9l;
                    final boolean z3 = z;
                    C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DeleteMsgHandler delete, isLocal:");
                    sbLIZ.append(z3);
                    sbLIZ.append(", stranger:");
                    sbLIZ.append(c864930XwR.LJ);
                    c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                    if (c869590Y9l2 == null) {
                        c864930XwR.LIZ(C0YIN.LJFF(c0yem, -1015));
                        return;
                    }
                    final String uuid = c869590Y9l2.getUuid();
                    final String conversationId = c869590Y9l2.getConversationId();
                    if (!TextUtils.isEmpty(uuid) && !TextUtils.isEmpty(conversationId)) {
                        if (c864930XwR.LJ) {
                            final String uuid2 = c869590Y9l2.getUuid();
                            final String conversationId2 = c869590Y9l2.getConversationId();
                            c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<Boolean, C0Y8T>>() { // from class: X.0Xvq
                                @Override // X.InterfaceC872410YKh
                                public final Pair<Boolean, C0Y8T> LIZ() throws Throwable {
                                    boolean zLJIIZILJ = c864930XwR.LIZLLL.LJI().LJIIZILJ(uuid2);
                                    c869590Y9l2.setDeleted(1);
                                    if (zLJIIZILJ) {
                                        c864930XwR.LJIILL(c869590Y9l2, C0YUT.DELETED);
                                        c864930XwR.LIZJ.LJIIZILJ().getDomain().LIZ.LJIJI(c869590Y9l2);
                                        C0Y8T c0y8tLJIILIIL = c864930XwR.LJIILIIL(conversationId2);
                                        if (c0y8tLJIILIIL != null && c869590Y9l2.getMsgId() > 0 && !z3) {
                                            C864930XwR c864930XwR2 = c864930XwR;
                                            int inboxType = c0y8tLJIILIIL.getInboxType();
                                            String str = conversationId2;
                                            c864930XwR2.LJIIL(inboxType, c869590Y9l2.getConversationShortId(), c869590Y9l2.getMsgId(), c869590Y9l2.getConversationType(), str);
                                        }
                                    }
                                    C0Y8T c0y8tLJIILIIL2 = c864930XwR.LJIILIIL(conversationId2);
                                    if (c864930XwR.LIZLLL.LJI().LJJIIJZLJL(conversationId2) == null) {
                                        c864930XwR.LIZJ.LIZLLL().LJIIJJI("DeleteMsgHandler, stranger conversation message is empty, delete conversation");
                                        c864930XwR.LIZLLL.LJIIJJI().LJIIIZ(conversationId2);
                                        if (c0y8tLJIILIIL2 != null) {
                                            c0y8tLJIILIIL2.clearLastShowMessage();
                                        }
                                        return new Pair<>(Boolean.valueOf(zLJIIZILJ), c0y8tLJIILIIL2);
                                    }
                                    return new Pair<>(Boolean.valueOf(zLJIIZILJ), c864930XwR.LJIILLIIL(c869590Y9l2, conversationId2, uuid2));
                                }
                            }, new C914020ZtQ(c869590Y9l2, c864930XwR, 9), false, c0yem.LJIIL().LIZLLL());
                            return;
                        } else if (c0yem.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZ) {
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<Boolean, C0Y8T>>() { // from class: X.0Xvp
                                @Override // X.InterfaceC872410YKh
                                public final Pair<Boolean, C0Y8T> LIZ() throws Throwable {
                                    boolean zLJJLIIIJ = c864930XwR.LIZLLL.LJI().LJJLIIIJ(jCurrentTimeMillis, uuid, conversationId, z3);
                                    if (zLJJLIIIJ) {
                                        c869590Y9l2.setDeleted(1);
                                        c864930XwR.LJIILL(c869590Y9l2, C0YUT.DELETED);
                                        c864930XwR.LIZJ.LJIIZILJ().getDomain().LIZ.LJIJI(c869590Y9l2);
                                    }
                                    return new Pair<>(Boolean.valueOf(zLJJLIIIJ), c864930XwR.LJIILLIIL(c869590Y9l2, conversationId, uuid));
                                }
                            }, new InterfaceC864800XwE<Pair<Boolean, C0Y8T>>() { // from class: X.0Xvs
                                @Override // X.InterfaceC864800XwE
                                public final void LIZ(Pair<Boolean, C0Y8T> pair) {
                                    Pair<Boolean, C0Y8T> pair2 = pair;
                                    if (pair2 != null && ((Boolean) pair2.first).booleanValue()) {
                                        c864930XwR.LJIILJJIL((C0Y8T) pair2.second);
                                        c864930XwR.LIZJ(c869590Y9l2);
                                        long j = c864930XwR.LIZJ.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZJ + c864930XwR.LIZJ.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZLLL;
                                        c864930XwR.LJIJ(j, jCurrentTimeMillis, uuid, conversationId);
                                        return;
                                    }
                                    C864930XwR c864930XwR2 = c864930XwR;
                                    c864930XwR2.LIZ(C0YIN.LJFF(c864930XwR2.LIZJ, -3001));
                                }
                            }, false, c0yem.LJIIL().LIZLLL());
                            return;
                        } else {
                            c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<Boolean, C0Y8T>>() { // from class: X.0Xvo
                                @Override // X.InterfaceC872410YKh
                                public final Pair<Boolean, C0Y8T> LIZ() throws Throwable {
                                    boolean zLJIIZILJ = c864930XwR.LIZLLL.LJI().LJIIZILJ(uuid);
                                    c869590Y9l2.setDeleted(1);
                                    if (zLJIIZILJ) {
                                        c864930XwR.LJIILL(c869590Y9l2, C0YUT.DELETED);
                                        c864930XwR.LIZJ.LJIIZILJ().getDomain().LIZ.LJIJI(c869590Y9l2);
                                        C0Y8T c0y8tLJIILIIL = c864930XwR.LJIILIIL(conversationId);
                                        if (c0y8tLJIILIIL != null && c869590Y9l2.getMsgId() > 0 && !z3) {
                                            C864930XwR c864930XwR2 = c864930XwR;
                                            int inboxType = c0y8tLJIILIIL.getInboxType();
                                            String str = conversationId;
                                            c864930XwR2.LJIIL(inboxType, c869590Y9l2.getConversationShortId(), c869590Y9l2.getMsgId(), c869590Y9l2.getConversationType(), str);
                                        }
                                    }
                                    return new Pair<>(Boolean.valueOf(zLJIIZILJ), c864930XwR.LJIILLIIL(c869590Y9l2, conversationId, uuid));
                                }
                            }, new C914020ZtQ(c869590Y9l2, c864930XwR, 7), false, c0yem.LJIIL().LIZLLL());
                            return;
                        }
                    }
                    c864930XwR.LIZ(C0YIN.LJFF(c0yem, -1015));
                }
            });
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C0YMW.from(C0YIN.LJFF(c870180YBsLIZ.LLILLL, -1015)));
        }
    }

    @Override // X.C0YE6
    public final void LJIILL(C0Y3I c0y3i, C0YA6 c0ya6, C914090ZtX c914090ZtX) {
        C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C0YA4(c870180YBsLIZ.LLILLL, c914090ZtX).LJIILJJIL(c0y3i, c0ya6);
    }

    @Override // X.C0YE6
    public final void LJJIIJZLJL(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        this.LL.LJIIZILJ().getDomain().LIZJ().LJJIIJZLJL(c869590Y9l, z, interfaceC863600XuI);
    }

    @Override // X.C0YE6
    public final void LJJIIZ(final C0Y3I c0y3i, C869590Y9l c869590Y9l, final InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        this.LL.LIZLLL().LJIIJJI("MessageOperatorModelJavaupdateMessage");
        this.LL.LJIIJJI().LIZJ(new C914040ZtS(this, c869590Y9l, 12), new InterfaceC864800XwE<C869590Y9l>() { // from class: X.0XwX
            @Override // X.InterfaceC864800XwE
            public final void LIZ(C869590Y9l c869590Y9l2) {
                if (c869590Y9l2 != null) {
                    C868200Y4c c868200Y4c = this.LIZJ.LL.LJIIZILJ().getDomain().LIZ;
                    C0Y9I c0y9i = this.LIZJ;
                    C0Y3I c0y3i2 = c0y3i;
                    c0y9i.getClass();
                    if (c0y3i2 == null) {
                        c0y3i2 = new C0Y3I("MessageOperatorModelJava");
                    }
                    c868200Y4c.LJJIIJZLJL(c0y3i2, Collections.singletonList(c869590Y9l2));
                    InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                    if (interfaceC863600XuI2 != null) {
                        interfaceC863600XuI2.onSuccess(c869590Y9l2);
                        return;
                    }
                    return;
                }
                InterfaceC863600XuI interfaceC863600XuI3 = interfaceC863600XuI;
                if (interfaceC863600XuI3 == null) {
                    return;
                }
                interfaceC863600XuI3.LIZIZ(C0YMW.from(C0YIN.LJFF(this.LIZJ.LL, -3001)));
            }
        }, false, this.LL.LJIIL().LIZJ());
    }

    @Override // X.C0YE6
    public final void LJJIJ(final long j, InterfaceC863600XuI interfaceC863600XuI, final C0Y8T c0y8t) {
        C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final C0Y87 c0y87 = new C0Y87(c0yem, (InterfaceC863600XuI<C869590Y9l>) interfaceC863600XuI);
        C869590Y9l c869590Y9l = c0y87.LJ.get(Long.valueOf(j));
        if (c869590Y9l != null) {
            c0y87.LIZJ(c869590Y9l);
        } else {
            c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<C869590Y9l>() { // from class: X.0Y1t
                @Override // X.InterfaceC872410YKh
                public final C869590Y9l LIZ() {
                    return c0y87.LIZLLL.LJI().LJJJ(j);
                }
            }, new InterfaceC864800XwE<C869590Y9l>() { // from class: X.0Y1r
                @Override // X.InterfaceC864800XwE
                public final void LIZ(C869590Y9l c869590Y9l2) {
                    if (c869590Y9l2 != null) {
                        c0y87.LIZJ(c869590Y9l2);
                    } else {
                        c0y87.LJIIJJI(j, c0y8t);
                    }
                }
            }, false, c0yem.LJIIL().LIZIZ());
        }
    }

    @Override // X.C0YE6
    public final long LJJLL(String str, int[] iArr, long[] jArr) {
        AbstractC1262004wk c1260804wY;
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LIZJ = new C1261404we(str);
        c0y9k.LJIIL = C0Y9W.LIZ();
        final List listLJJLL = C13LQ.LJJLL(new C0Y9L[]{C0Y9L.SUCCESS, C0Y9L.RECEIVED, C0Y9L.TEMPORARY_RECEIVED});
        c0y9k.LJIIJ = new AbstractC1269804y0(listLJJLL) { // from class: X.04xy
            public final List<C0Y9L> LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1269604xy) && Intrinsics.LJFF(this.LIZIZ, ((C1269604xy) obj).LIZIZ);
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AnyOf(statuses=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1269804y0
            public final AbstractC1261104wb LIZ() {
                List<C0Y9L> list = this.LIZIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C0Y9L> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().getValue()));
                }
                return new C1260704wX(arrayList);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = listLJJLL;
            }
        };
        if (iArr.length > 0) {
            c0y9k.LJFF = C0Y9S.LIZ(iArr);
        }
        if (jArr != null && jArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (long j : jArr) {
                arrayList.add(Long.valueOf(j));
            }
            if (arrayList.isEmpty()) {
                c1260804wY = C1262304wn.LIZIZ;
            } else {
                c1260804wY = new C1260804wY(arrayList);
            }
            c0y9k.LJ = c1260804wY;
        }
        return this.LLILLJJLI.LJI().LJIILLIIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, -1)).LIZ(0L).longValue();
    }

    @Override // X.C0YE6
    public final List LJLILLLLZI(String str, long j, String str2) {
        if (str != null && !str.isEmpty()) {
            C0Y9K c0y9k = new C0Y9K();
            c0y9k.LIZJ = new C1261404we(str);
            c0y9k.LJIIIIZZ = C1270204y4.LIZIZ(j, false);
            c0y9k.LJIIL = C0Y9W.LIZ();
            if (!str2.isEmpty()) {
                try {
                    c0y9k.LJ = new C1262204wm(CastLongProtector.parseLong(str2));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_ASC, 1)).LIZ(Collections.emptyList());
        }
        return Collections.emptyList();
    }

    @Override // X.C0YE6
    public final int LJZI(long j, long j2, String str) {
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LIZJ = new C1261404we(str);
        c0y9k.LJI = C1270204y4.LIZ(j, j2, true, true);
        return (int) this.LLILLJJLI.LJI().LJIILLIIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, -1)).LIZ(0L).longValue();
    }

    @Override // X.C0YE6
    public final List LLILLIZIL(int i, String str, List list) {
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LIZJ = new C1261404we(str);
        c0y9k.LJIIL = C0Y9W.LIZ();
        if (list != null && !list.isEmpty()) {
            c0y9k.LJFF = C0Y9S.LIZ(LIZLLL(list));
        }
        return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, i)).LIZ(Collections.emptyList());
    }

    @Override // X.C0YE6
    public final void LJIILLIIL(List<MessageKey> list, int i, InterfaceC863600XuI<Boolean> interfaceC863600XuI, Long l, String str) {
        this.LL.LJIIZILJ().getDomain().LIZJ().LJIILLIIL(list, i, interfaceC863600XuI, l, str);
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LLJILLL(String str, long j, List<Integer> list, List<Integer> list2, List<String> list3, int i) {
        return LJZ(str, j, list, list2, list3, i, 0L, null);
    }

    @Override // X.C0YE6
    public final List LLILZLL(long j, long j2, int i, boolean z, int[] iArr, boolean z2, boolean z3) {
        C0Y9M c0y9m;
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LJI = C1270204y4.LIZ(j, j2, z2, z3);
        c0y9k.LJIIL = C0Y9W.LIZ();
        if (iArr != null && iArr.length > 0) {
            c0y9k.LJFF = C0Y9S.LIZ(iArr);
        }
        C869670Y9t c869670Y9tLIZ = c0y9k.LIZ();
        if (z) {
            c0y9m = C0Y9M.INDEX_DESC;
        } else {
            c0y9m = C0Y9M.INDEX_ASC;
        }
        return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c869670Y9tLIZ, c0y9m, i)).LIZ(Collections.emptyList());
    }

    @Override // X.C0YE6
    public final List LLJJL(long j, int i, boolean z, int[] iArr, boolean z2, boolean z3, long j2) {
        C0Y9M c0y9m;
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LJI = C1270204y4.LIZ(0L, j, z2, z3);
        c0y9k.LJIIIIZZ = C1270204y4.LIZIZ(jCurrentTimeMillis, true);
        c0y9k.LJIIL = C0Y9W.LIZ();
        if (iArr != null && iArr.length > 0) {
            c0y9k.LJFF = C0Y9S.LIZ(iArr);
        }
        C869670Y9t c869670Y9tLIZ = c0y9k.LIZ();
        if (z) {
            c0y9m = C0Y9M.INDEX_DESC;
        } else {
            c0y9m = C0Y9M.INDEX_ASC;
        }
        return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c869670Y9tLIZ, c0y9m, i)).LIZ(Collections.emptyList());
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJZ(String str, long j, List<Integer> list, List<Integer> list2, List<String> list3, int i, long j2, Integer num) {
        C0Y9K c0y9k = new C0Y9K();
        c0y9k.LJIIL = C0Y9W.LIZ();
        if (str != null && !str.isEmpty()) {
            c0y9k.LIZJ = new C1261404we(str);
        }
        if (j > 0) {
            if (j2 > 0) {
                c0y9k.LJIIIIZZ = C1270204y4.LIZ(j, j2, true, true);
            } else {
                c0y9k.LJIIIIZZ = C1270204y4.LIZIZ(j, true);
            }
        }
        C0Y9Q c0y9q = new C0Y9Q();
        if (list != null && !list.isEmpty()) {
            c0y9q.LIZLLL = C13LQ.LJJLJ(LIZLLL(list));
        } else if (list2 != null && !list2.isEmpty()) {
            c0y9q.LIZJ = C13LQ.LJJLJ(LIZLLL(list2));
        }
        if (num != null && num.intValue() > 0) {
            c0y9q.LIZ = Integer.valueOf(num.intValue());
            c0y9q.LIZIZ = false;
        }
        C869720Y9y c869720Y9y = new C869720Y9y(null, null, false, c0y9q.LIZ, c0y9q.LIZIZ, null, c0y9q.LIZJ, c0y9q.LIZLLL);
        if (c869720Y9y.LIZ()) {
            c0y9k.LJFF = c869720Y9y;
        }
        if (list3 != null && !list3.isEmpty()) {
            c0y9k.LJIILIIL = C1908907dn.LIZ(list3);
        }
        return this.LLILLJJLI.LJI().LJJLIL(C0Y9T.LIZ(c0y9k.LIZ(), C0Y9M.ORDER_INDEX_DESC, i)).LIZ(Collections.emptyList());
    }
}
