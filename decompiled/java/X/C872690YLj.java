package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import java.util.List;

/* JADX INFO: renamed from: X.0YLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872690YLj implements InterfaceC1755906uD {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC871600YHe LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1755906uD
    public final void LJIIL() {
        this.LIZLLL.LLLILZJ(false);
    }

    @Override // X.InterfaceC1755906uD
    public final List<C869590Y9l> LIZLLL() {
        return C13LP.LJJJJLI(this.LIZLLL.LJIIIIZZ());
    }

    @Override // X.InterfaceC1755906uD
    public final void LJ() {
        this.LIZLLL.LJJJI();
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIIIIZZ() {
        return this.LIZLLL.LLLII();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJ() {
        this.LIZLLL.LJJIII();
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIILJJIL() {
        return this.LIZLLL.LJIILJJIL();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIJ() {
        return this.LIZLLL.LJIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJJIZ() {
        this.LIZLLL.LJJIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJJJJI() {
        return (this.LIZJ && this.LIZLLL.LJJJJI()) || !this.LIZJ;
    }

    @Override // X.InterfaceC1755906uD
    public final int LJJJJIZL() {
        return this.LIZLLL.LJJJJIZL();
    }

    @Override // X.InterfaceC1755906uD
    public final void refresh() {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Message Model refresh, wrapper=");
            sbLIZ.append(System.identityHashCode(this));
            sbLIZ.append(" sdkModel=");
            sbLIZ.append(System.identityHashCode(this.LIZLLL));
            sbLIZ.append(" cid=");
            sbLIZ.append(this.LIZIZ);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MessageModelImpl ");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(" refresh");
        C2188811AlT.LIZIZ(sbLIZ2);
        C882690Yjz.LJ("MessageModelWrapper");
        this.LJ = true;
        this.LIZLLL.LJII();
    }

    @Override // X.InterfaceC1755906uD
    public final void resume() {
        this.LIZLLL.resume();
    }

    @Override // X.InterfaceC1755906uD
    public final void stop() {
        this.LIZLLL.stop();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIIIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1755906uD
    public final String getConversationId() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZ(C1DW6 c1dw6) {
        this.LIZLLL.LJJJIL(c1dw6);
    }

    @Override // X.InterfaceC1755906uD
    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
        List<C869590Y9l> listLIZLLL = LIZLLL();
        if (this.LIZJ && !this.LIZLLL.LJJJJI()) {
            return C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIJJ(5, this.LIZIZ, C1697810uHb.LJIIJJI(C2286608xc.LJ(-1), C2286608xc.LJ(1), C2286608xc.LJ(15), C2286608xc.LJ(1022), C2286608xc.LJ(1023), C2286608xc.LJ(1026), C2286608xc.LJ(1031), C2286608xc.LJ(1037)));
        }
        return listLIZLLL;
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZJ(long j) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModelImpl ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" refresh with startIndex= ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("MessageModelWrapper");
        this.LJ = true;
        C0ZLD.LIZ.getClass();
        C0ZLD c0zldLIZ = C0ZLE.LIZ();
        if (c0zldLIZ != null && c0zldLIZ.LIZJ()) {
            this.LIZLLL.LJLLLL(j);
        } else {
            this.LIZLLL.LLILLL(j);
        }
    }

    @Override // X.InterfaceC1755906uD
    public final void LJFF(C1DW6 c1dw6) {
        this.LIZLLL.LLJI(c1dw6);
    }

    @Override // X.InterfaceC1755906uD
    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        C0Y8T c0y8tLIZ;
        if (this.LIZLLL.LJIIIIZZ().isEmpty() && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZIZ)) != null && c0y8tLIZ.getLastShowMessage() != null) {
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt.LJIJJ();
            this.LIZLLL.LLLILZ(new C914150Ztd(c2252611DEt, 4));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLJIJ;
        }
        return this.LIZLLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJJI(int i) {
        this.LIZLLL.LJIIJJI(i);
    }

    public C872690YLj(String str, boolean z, boolean z2, C0YHX c0yhx, InterfaceC876320YZi interfaceC876320YZi) {
        this.LIZIZ = str;
        this.LIZJ = z;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MessageModelWrapper", "MessageModelImpl init");
        interfaceC876320YZi.LIZIZ(EnumC883570YlP.ENTER_CHAT_ROOM);
        this.LIZLLL = c0yhx.LIZJ(str, z, z2);
    }
}
