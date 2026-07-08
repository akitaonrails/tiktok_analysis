package X;

import com.bytedance.im.core.proto.MessageKey;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS6S0201100_14;

/* JADX INFO: renamed from: X.0XuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863650XuN implements InterfaceC868170Y3z {
    public static final Set<Integer> LLJ = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(C0YMR.GET_MESSAGES_BY_USER.getValue()), Integer.valueOf(C0YMR.GET_MESSAGES_BY_CONVERSATION_WITH_RANGE.getValue()), Integer.valueOf(C0YMR.GET_MESSAGES_BY_USER_INIT_V2.getValue()), Integer.valueOf(C0YMR.GET_MESSAGES_BY_USER_COMBO.getValue()), Integer.valueOf(C0YMR.SEND_MESSAGE.getValue()), Integer.valueOf(C0YMR.ACK_MESSAGE.getValue()), Integer.valueOf(C0YMR.NEW_MSG_NOTIFY.getValue()), Integer.valueOf(C0YMR.GET_CONVERSATIONS_CHECK_INFO_V2.getValue()), Integer.valueOf(C0YMR.GET_MESSAGES_CHECK_INFO_V2.getValue()), Integer.valueOf(C0YMR.CREATE_CONVERSATION_V2.getValue()), Integer.valueOf(C0YMR.RECALL_MESSAGE.getValue()), Integer.valueOf(C0YMR.ADD_CONVERSATION_PARTICIPANTS.getValue()), Integer.valueOf(C0YMR.REMOVE_CONVERSATION_PARTICIPANTS.getValue()), Integer.valueOf(C0YMR.UPDATE_CONVERSATION_PARTICIPANT.getValue()), Integer.valueOf(C0YMR.DISSOLVE_CONVERSATION.getValue()), Integer.valueOf(C0YMR.LEAVE_CONVERSATION.getValue()), Integer.valueOf(C0YMR.GET_MEDIA_STATUS.getValue()), Integer.valueOf(C0YMR.GET_MEDIA_UPLOAD_CONFIG.getValue()), Integer.valueOf(C0YMR.BATCH_GET_MESSAGES.getValue()), Integer.valueOf(C0YMR.MARK_CONVERSATION_READ_V3.getValue())});
    public final C0YEM LL;
    public final InterfaceC864330XvT LLILLJJLI;
    public final C870860YEi LLILLL;
    public final InterfaceC863850Xuh LLILZ;
    public final InterfaceC863630XuL LLILZIL;
    public final InterfaceC497601wk LLILZLL;
    public final C0YGO LLIZ;
    public final int[] LLIZLLLIL = {0, 1, 4, 5};

    @Override // X.InterfaceC868170Y3z
    public final void LIZIZ() {
        C868780Y6i.LJ(this.LL.LIZLLL(), "IMUseCaseCenter", "on logout", 4);
        this.LLILLJJLI.clear();
        this.LLILZIL.clear();
        this.LLILZIL.LJIIL().LIZ();
        C0YGT c0ygt = this.LLIZ.LJFF;
        c0ygt.LIZ.clear();
        c0ygt.LIZIZ.clear();
        c0ygt.LIZJ.clear();
        this.LLILZIL.LJJ().stop();
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862390XsL(this, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIJ() {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862360XsI(this, null), 3);
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C863690XuR(this, null), 2);
        if (this.LL.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZ) {
            C0Y3S c0y3sLJIILIIL = this.LLILZIL.LJIILIIL();
            C23250099c.LIZLLL(c0y3sLJIILIIL.LIZ.LIZJ(), c0y3sLJIILIIL.LIZ.LJIIIIZZ().LIZIZ(), null, new C864220XvI(c0y3sLJIILIIL, null), 2);
            C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
            c870180YBsLIZ.getClass();
            C0YEM c0yem = c870180YBsLIZ.LLILLL;
            c0yem.LJIIJJI().LIZJ(new C914050ZtT(new C864930XwR(c0yem), 10), null, false, c0yem.LJIIL().LIZLLL());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJ() {
        this.LLILZIL.LJIIL().LJJ();
        C868780Y6i.LJ(this.LL.LIZLLL(), "IMUseCaseCenter", "IMUseCaseClient# switchToForeground", 4);
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862970XtH(this, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJIJIIJI() {
        this.LLILZIL.LJIIL().LJJIJIIJI();
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862380XsK(this, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLLLLL() {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862950XtF(this, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLFZ() {
        C868780Y6i.LJ(this.LL.LIZLLL(), "IMUseCaseCenter", "IMUseCaseClient# onNetworkRecovered", 4);
        this.LLILZIL.LJIIL().LIZLLL();
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862960XtG(this, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLI() {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C863680XuQ(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C862370XsJ
            if (r0 == 0) goto L61
            r4 = r6
            X.0XsJ r4 = (X.C862370XsJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L67
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0XuL r0 = r5.LLILZIL
            X.0XvV r0 = r0.LJ()
            X.0XuT r1 = new X.0XuT
            r1.<init>(r0)
            X.0Xuh r0 = r5.LLILZ
            r0.LIZLLL(r1)
            X.0XuL r0 = r5.LLILZIL
            X.0Y4D r0 = r0.LJFF()
            X.0XuS r1 = new X.0XuS
            r1.<init>(r0)
            X.0Xuh r0 = r5.LLILZ
            r0.LIZLLL(r1)
            X.0YEM r0 = r5.LL
            X.0Y6i r3 = r0.LIZLLL()
            java.lang.String r2 = "Retry commands initialized successfully"
            r1 = 4
            java.lang.String r0 = "IMUseCaseCenter"
            X.C868780Y6i.LJ(r3, r0, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.C155000ia.LIZIZ(r3)
            X.0Xuh r0 = r5.LLILZ
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJ(r4)
            if (r0 != r2) goto L22
            return r2
        L61:
            X.0XsJ r4 = new X.0XsJ
            r4.<init>(r5, r6)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863650XuN.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIZILJ(long j) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C863780Xua(this, j, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJJ(int i) {
        this.LLIZ.LJFF(i);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLI(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getUuid() == null) {
            C868780Y6i.LJ(this.LL.LIZLLL(), "IMUseCaseCenter", "IMUseCaseClient#stopMessageSending msg.uuid is NULL", 4);
        } else {
            this.LLILZIL.LJIIL().LIZJ(c869590Y9l.getUuid());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLJ(C0YL9 c0yl9) {
        if (!this.LL.LJIIIZ().LJJJJZ.LIZ) {
            if (c0yl9.LJ) {
                C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862600Xsg(this, c0yl9, null), 2);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862610Xsh(false, this, c0yl9, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final boolean LLJLIL(int i) {
        if (this.LLIZ.LJFF.LIZ.get(i) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJZ(List<? extends C869590Y9l> list) {
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C863620XuK(this, list, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLF(C0Y8F c0y8f) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862580Xse(this, c0y8f, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LIZJ(C914120Zta c914120Zta, List list) {
        C864180XvE c864180XvELIZLLL = this.LL.LJIIZILJ().LJFF().LIZLLL();
        c864180XvELIZLLL.LIZIZ.put(EnumC863790Xub.SEND_MSG, 0);
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C863670XuP(this, list, false, c914120Zta, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJ(long j, String str) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862400XsM(this, j, str, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJJL(int i, boolean z) {
        C0YGO c0ygo = this.LLIZ;
        if (z) {
            c0ygo.LJFF.LIZJ.put(i, Long.valueOf(System.currentTimeMillis()));
        } else {
            c0ygo.getClass();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJLIIIJILLIZJL(C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
        C868780Y6i.LJ(this.LL.LIZLLL(), "RecallMsgFeature", "IMUseCaseClient#recallSentMessage", 4);
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862440XsQ(this, c869590Y9l, c914120Zta, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final Object LJJLIIIJJIZ(boolean z, InterfaceC1364105Vn<? super C0Y40> interfaceC1364105Vn) {
        return this.LLILZIL.LJIILJJIL().LIZJ(z, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLJI(C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862510XsX(this, c873240YNm, interfaceC867020Xzo, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLILLLL(Long l, String str) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862420XsO(this, str, l, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIZ(String str, byte[] bArr) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C864310XvR(this, str, bArr, null, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final List<C0YNC> LLILIL(String str, List<? extends C869590Y9l> list) {
        return this.LLILZIL.LJJ().LIZIZ(str, list);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJIJIL(String str, InterfaceC867020Xzo interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862480XsU(this, str, true, interfaceC867020Xzo, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJLIIIJLLLLLLLZ(List<String> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C863480Xu6(this, list, interfaceC863600XuI, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLIIL(List list, C914150Ztd c914150Ztd) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862460XsS(this, list, c914150Ztd, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJIIJZLJL(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        boolean z2;
        if (!this.LL.isLogin()) {
            C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "IMUseCaseCenter", "sendMessage not login", 4);
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "sendMessage not login";
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        if (!z && !this.LL.LJIIIZ().LJJLIIIJ.LIZIZ) {
            z2 = false;
        } else {
            z2 = true;
        }
        C864180XvE c864180XvELIZLLL = this.LL.LJIIZILJ().LJFF().LIZLLL();
        c864180XvELIZLLL.LIZIZ.put(EnumC863790Xub.SEND_MSG, 0);
        this.LL.LJIIZILJ().getDomain().LIZIZ.LJIIIIZZ(c869590Y9l.getUuid());
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C863660XuO(this, c869590Y9l, interfaceC863600XuI, z2, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJLI(String str, boolean z, InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862490XsV(this, str, z, interfaceC867020Xzo, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLFFF(int i, long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862450XsR(this, i, j, interfaceC863600XuI, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIII(C869590Y9l c869590Y9l, String str, AwS6S0201100_14 awS6S0201100_14) {
        C868780Y6i.LJ(this.LL.LIZLLL(), "RecallMsgFeature", "IMUseCaseClient#recallReceivedMessage", 4);
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862430XsP(this, c869590Y9l, str, awS6S0201100_14, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJJ(long j, C914150Ztd c914150Ztd, C0Y8T c0y8t) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C863870Xuj(this, c0y8t, j, c914150Ztd, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJZ(String str, long j, C862540Xsa c862540Xsa, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862520XsY(this, str, j, c862540Xsa, interfaceC867020Xzo, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final Object LLFF(List list, boolean z, Map map, C0YMP c0ymp) {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getByUser without buffer calls ");
        sbLIZ.append(list);
        sbLIZ.append(" with reason ");
        sbLIZ.append(4);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMUseCaseCenter", C2188811AlT.LIZIZ(sbLIZ), 4);
        return this.LLILZIL.LJIIZILJ().LIZIZ(list, map, new AwS593S0100000_14(this, 308), c0ymp);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJILJIL(String str, List<Long> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862500XsW(this, str, list, map, interfaceC867020Xzo, null), 3);
    }

    public C863650XuN(C0YEM c0yem, InterfaceC864330XvT interfaceC864330XvT, C870860YEi c870860YEi, InterfaceC863850Xuh interfaceC863850Xuh, InterfaceC863630XuL interfaceC863630XuL) {
        this.LL = c0yem;
        this.LLILLJJLI = interfaceC864330XvT;
        this.LLILLL = c870860YEi;
        this.LLILZ = interfaceC863850Xuh;
        this.LLILZIL = interfaceC863630XuL;
        this.LLILZLL = c0yem.LIZJ();
        this.LLIZ = new C0YGO(c0yem, interfaceC863630XuL.LJIIZILJ(), new AwS593S0100000_14(this, 306));
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIILLIIL(List<MessageKey> list, int i, InterfaceC863600XuI<Boolean> interfaceC863600XuI, Long l, String str) {
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862470XsT(this, list, i, interfaceC863600XuI, l, str, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJZ(String str, long j, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862530XsZ(this, str, j, i, map, interfaceC867020Xzo, null), 3);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIJLIL(int i, int i2, C0YK7 c0yk7, Map map, boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getByUser calls ");
        sbLIZ.append(i);
        sbLIZ.append(" with reason ");
        sbLIZ.append(i2);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMUseCaseCenter", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LL.LJIILL().LIZ.LIZIZ.LIZ) {
            C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862770Xsx(this, i, i2, map, c0yk7, z, null), 2);
        } else {
            C23250099c.LIZLLL(this.LLILZLL, null, null, new C863640XuM(this, i, i2, map, null), 3);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJI(int i, int i2, long j, String str, String str2, List list) {
        C23250099c.LIZLLL(this.LLILZLL, this.LL.LJIIIIZZ().LIZIZ(), null, new C862590Xsf(this, list, str, i, "", str2, j, i2, null), 2);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIIZ(int i, List list, String str, Map map, String str2, String str3, String str4, String str5, String str6, Boolean bool, C913700Zsu c913700Zsu) {
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C862410XsN(this, i, list, str, map, str2, str3, str4, str5, str6, bool, c913700Zsu, null), 3);
    }
}
