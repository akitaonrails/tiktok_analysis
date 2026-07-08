package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessageSender;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.Extra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320830Cht {
    public static final AFwS287S0000000_4 LJI = AFwS287S0000000_4.get$arr$(0);
    public final long LIZ;
    public final int LIZIZ;
    public C320810Chr LIZJ = new C320810Chr(null, 16383);
    public final C054G LIZLLL;
    public final C2252331DDr LJ;
    public final C321150CiP LJFF;

    public final C320810Chr LJIILL() {
        C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(54), false);
        this.LIZJ = new C320810Chr("", 16348);
        ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
        C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320540ChQ(this, null));
        C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(55), false);
        return this.LIZJ;
    }

    public static void LJII(C321020CiC c321020CiC) {
        List<Message> list = c321020CiC.LJIIJJI;
        ArrayList arrayList = new ArrayList();
        for (Message message : list) {
            Message message2 = message;
            if (TextUtils.isEmpty(message2.msgId) || TextUtils.equals(message2.msgId, CardStruct.IStatusCode.DEFAULT)) {
                arrayList.add(message);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Message) it2.next()).LIZJ = 9;
        }
    }

    public static void LJIIIZ(C321020CiC c321020CiC) {
        if (c321020CiC.LIZIZ() || c321020CiC.LIZ == 6) {
            ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
            C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320590ChV(c321020CiC, null));
        }
    }

    public final Object LIZ(InterfaceC1364105Vn<? super C320810Chr> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C320810Chr c320810Chr = this.LIZJ;
        if (!c320810Chr.LIZ && TextUtils.isEmpty(c320810Chr.LIZJ)) {
            C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(56), true);
            ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
            C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320820Chs(this, c2252611DEt, null));
        } else {
            C320870Chx.LIZ(new AwS548S0100000_4(this, 2), true);
            C320810Chr c320810Chr2 = this.LIZJ;
            C189200o6.m2constructorimpl(c320810Chr2);
            c2252611DEt.resumeWith(c320810Chr2);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(C321020CiC c321020CiC) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = c321020CiC;
        this.LJFF.LIZ();
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C321030CiD(this, c321020CiC, c259800zU, null), 3);
    }

    public final void LJIIIIZZ(C321020CiC c321020CiC) {
        if (c321020CiC.LIZIZ() || c321020CiC.LIZ == 6) {
            ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
            EnumC320940Ci4 enumC320940Ci4 = EnumC320940Ci4.IMMEDIATE;
            C321780CjQ.LIZ(enumC320940Ci4, AFwS232S0000000_4.get$arr$(5), new C320550ChR(this, null));
            C321780CjQ.LIZ(enumC320940Ci4, AFwS232S0000000_4.get$arr$(5), new C320600ChW(c321020CiC, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C320860Chw
            if (r0 == 0) goto L51
            r6 = r8
            X.0Chw r6 = (X.C320860Chw) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L28
            if (r1 != r4) goto L57
            X.C155000ia.LIZIZ(r2)
        L25:
            X.0Chr r0 = r7.LIZJ
            return r0
        L28:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L36
            goto L5f
        L2c:
            X.C155000ia.LIZIZ(r2)
            r6.LLILZ = r0     // Catch: java.lang.Exception -> L36
            X.0Chr r2 = r7.LJIILL()     // Catch: java.lang.Exception -> L36
            goto L60
        L36:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0Chr r2 = new X.0Chr
            r1 = 0
            r0 = 16383(0x3fff, float:2.2957E-41)
            r2.<init>(r1, r0)
            r7.LIZJ = r2
            X.1DDr r0 = r7.LJ
            r6.LL = r3
            r6.LLILZ = r4
            java.lang.Object r0 = r0.emit(r2, r6)
            if (r0 != r5) goto L25
            return r5
        L51:
            X.0Chw r6 = new X.0Chw
            r6.<init>(r7, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5f:
            return r2
        L60:
            if (r2 != r5) goto L63
            return r5
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320830Cht.LJIILLIIL(X.05Vn):java.lang.Object");
    }

    public C320830Cht(int i, long j) {
        this.LIZ = j;
        this.LIZIZ = i;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LIZLLL = c054gLIZ;
        this.LJ = C09IR.LIZIZ(1, 1, null, 4);
        this.LJFF = new C321150CiP(c054gLIZ);
    }

    public static void LJ(C320830Cht c320830Cht, Message message) {
        message.LIZJ = 6;
        if (message.LJ == 0) {
            message.LJ = System.currentTimeMillis();
            message.LJFF = 0;
        }
        if (message.serverStatus == 2) {
            message.LIZJ = 9;
            message.LJFF = 0;
        }
        message.LJIIIIZZ = System.currentTimeMillis();
    }

    public static void LJFF(C321020CiC c321020CiC, C320810Chr c320810Chr) {
        Message message = c321020CiC.LIZIZ;
        if (message.msgType <= 0) {
            message.msgType = 1;
        }
        message.sender = new MessageSender(1, 0L, 0L, true, "");
        Message message2 = c321020CiC.LIZIZ;
        C320640Cha c320640Cha = c321020CiC.LJIIIIZZ;
        message2.LIZJ = 1;
        if (message2.conversationId.length() == 0) {
            message2.conversationId = c320810Chr.LIZIZ;
        }
        if (TextUtils.isEmpty(message2.sessionId)) {
            message2.sessionId = c320640Cha.LIZIZ;
        }
        if (TextUtils.isEmpty(message2.uuid)) {
            message2.uuid = UUID.randomUUID().toString();
        }
        if (message2.LJ == 0) {
            message2.LJ = System.currentTimeMillis();
        }
    }

    public static void LJI(Message message, C320810Chr c320810Chr) {
        message.LIZJ = 7;
        if (message.conversationId.length() == 0) {
            message.conversationId = c320810Chr.LIZIZ;
        }
        if (message.LJ == 0) {
            message.LJ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:14))(0)|7|(1:(1:(5:15|70|16|65|66)(2:12|13))(1:20))(2:17|(1:19))|21|72|22|(1:(2:25|(1:36)(2:28|(2:30|(2:32|(1:34)))(1:35)))(5:38|(2:41|39)|73|42|(2:44|(1:46))))(5:47|(1:49)|50|(2:52|54)(1:53)|55)|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C321020CiC r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320830Cht.LIZIZ(X.0CiC, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C320640Cha r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C320850Chv
            if (r0 == 0) goto L7d
            r6 = r9
            X.0Chv r6 = (X.C320850Chv) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L83
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.0ChX r2 = X.C320640Cha.LJIIJ
            long r0 = r8.LIZLLL
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            int r0 = r8.LJ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.0D0u r0 = r2.LIZLLL(r0, r1)
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r4) goto L72
            long r0 = r8.LIZLLL
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            int r0 = r8.LJ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.0D0u r3 = r2.LIZLLL(r0, r1)
            if (r3 == 0) goto L22
            X.0ChZ r2 = new X.0ChZ
            r0 = 0
            r2.<init>(r0)
            X.14dG r1 = new X.14dG
            r0 = 2
            r1.<init>(r2, r3, r0)
            r6.LLILLL = r4
            java.lang.Object r0 = X.C09IC.LJI(r1, r6)
            if (r0 != r5) goto L22
            return r5
        L72:
            r0 = 60
            kotlin.jvm.internal.AFwS190S0000000_4 r0 = kotlin.jvm.internal.AFwS190S0000000_4.get$arr$(r0)
            X.C320870Chx.LIZ(r0, r1)
            r4 = 0
            goto L22
        L7d:
            X.0Chv r6 = new X.0Chv
            r6.<init>(r7, r9)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320830Cht.LJIIZILJ(X.0Cha, X.05Vn):java.lang.Object");
    }

    public static void LJIIJ(C320830Cht c320830Cht, List list, C321020CiC c321020CiC) {
        C321240CiY c321240CiYLIZ = c321020CiC.LIZ();
        c320830Cht.getClass();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Message) it2.next()).LIZ());
        }
        ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
        C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320710Chh(arrayList, c321020CiC, c321240CiYLIZ, null));
    }

    public static void LJIILJJIL(C321020CiC c321020CiC, Message message, Message message2) {
        String str;
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleShareMessage receivingMessage");
        String str2 = null;
        if (message != null) {
            str = message.uuid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(' ');
        if (message != null) {
            numValueOf = Integer.valueOf(message.LIZJ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (c321020CiC.LIZIZ.msgType == 6) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C320770Chn(c321020CiC, null), 2);
            String str3 = c321020CiC.LIZIZ.uuid;
            if (message2 != null) {
                str2 = message2.uuid;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                C320640Cha.LJIJ = message2;
            }
        }
    }

    public static void LJIIL(Message message, C321020CiC c321020CiC, int i, C321240CiY c321240CiY) {
        Message messageLIZ = message.LIZ();
        C320870Chx.LIZ(new AwS548S0100000_4(messageLIZ, 6), false);
        ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
        C321780CjQ.LIZ(EnumC320940Ci4.QUEUE, AFwS232S0000000_4.get$arr$(5), new C320690Chf(c321020CiC, messageLIZ, i, c321240CiY, null));
    }

    public final void LIZLLL(C321020CiC c321020CiC, int i, String str, C321240CiY c321240CiY) {
        if (c321020CiC.LIZIZ()) {
            if (c321020CiC.LIZ == 16) {
                c321020CiC.LIZIZ.LIZJ = 3;
            } else {
                Message message = c321020CiC.LIZIZ;
                if (message.LIZJ == 1) {
                    message.LIZJ = 3;
                }
            }
        }
        if (c321020CiC.LIZIZ() || Collections.singletonList(12).contains(Integer.valueOf(c321020CiC.LIZ))) {
            LJIILIIL(this, c321020CiC.LIZIZ, c321020CiC, i, str, c321240CiY, null, 32);
        }
    }

    public static void LJIIJJI(C320830Cht c320830Cht, List list, C321020CiC c321020CiC, boolean z, C321240CiY c321240CiY, int i) {
        C321240CiY c321240CiYLIZ = c321240CiY;
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            c321240CiYLIZ = c321020CiC.LIZ();
        }
        c320830Cht.getClass();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C320870Chx.LIZ(new AwS548S0100000_4((Message) it2.next(), 10), true);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(((Message) it3.next()).LIZ());
        }
        ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
        C321780CjQ.LIZ(EnumC320940Ci4.QUEUE, AFwS232S0000000_4.get$arr$(5), new C320680Che(c321020CiC, arrayList, z2, false, c321240CiYLIZ, null));
    }

    public static void LJIILIIL(C320830Cht c320830Cht, Message message, C321020CiC c321020CiC, int i, String str, C321240CiY c321240CiY, Extra extra, int i2) {
        Extra extra2 = extra;
        C321240CiY c321240CiYLIZ = c321240CiY;
        String str2 = str;
        int i3 = i;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 16) != 0) {
            c321240CiYLIZ = c321020CiC.LIZ();
        }
        if ((i2 & 32) != 0) {
            extra2 = null;
        }
        c320830Cht.getClass();
        Message messageLIZ = message.LIZ();
        ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
        C321780CjQ.LIZ(EnumC320940Ci4.IMMEDIATE, AFwS232S0000000_4.get$arr$(5), new C320670Chd(c321020CiC, messageLIZ, i3, str2, extra2, c321240CiYLIZ, null));
    }
}
