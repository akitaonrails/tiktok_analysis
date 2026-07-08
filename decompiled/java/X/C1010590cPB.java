package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0cPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1010590cPB extends C1010600cPC {
    public final InterfaceC1010250cOd LLIZLLLIL;

    @Override // X.C1010600cPC
    public InterfaceC1010250cOd LJJ() {
        throw null;
    }

    @Override // X.C1010600cPC
    public void LJJI() {
    }

    @Override // X.C1010600cPC, X.InterfaceC1002830cCf
    public void LJIJI() {
        Set<EnumC1010840cPa> linkedHashSet;
        LJJI();
        int i = C2510609se.LIZ;
        InterfaceC1011430cQX interfaceC1011430cQXVQ0 = vQ0();
        if (interfaceC1011430cQXVQ0 != null) {
            interfaceC1011430cQXVQ0.LIZIZ(EnumC1011130cQ3.ENTER_DETAIL);
        }
        C1004580cFU c1004580cFU = this.LLILZ;
        InterfaceC1010450cOx interfaceC1010450cOx = this.LLILZLL;
        if (interfaceC1010450cOx == null || (linkedHashSet = interfaceC1010450cOx.OG0()) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        c1004580cFU.LIZJ = linkedHashSet;
        InterfaceC1010450cOx interfaceC1010450cOx2 = this.LLILZLL;
        c1004580cFU.LIZIZ = interfaceC1010450cOx2 != null ? interfaceC1010450cOx2.s2() : 0;
        LJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("module beforeEnterDetailPage eventTrackedList = ");
        sbLIZ.append(this.LLILZ.LIZJ);
        sbLIZ.append(" playtims = ");
        sbLIZ.append(this.LLILZ.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1010590cPB(InterfaceC1010250cOd interfaceC1010250cOd) {
        super(interfaceC1010250cOd);
        this.LLIZLLLIL = interfaceC1010250cOd;
    }

    @Override // X.C1010600cPC, X.InterfaceC1002830cCf
    public void LJFF(String str) {
        Set<EnumC1010840cPa> setOG0;
        InterfaceC988260bpA interfaceC988260bpALIZLLL;
        C1004580cFU shareInfo;
        Set<EnumC1010840cPa> setOG02;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (interfaceC988260bpALIZLLL = interfaceC657510PqfLIZLLL.LIZLLL(LJJ().getAweme())) != null && (shareInfo = interfaceC988260bpALIZLLL.getShareInfo()) != null) {
            C1010120cOQ.LJJJJI(this.LLILZ, shareInfo);
            InterfaceC1010450cOx interfaceC1010450cOx = this.LLILZLL;
            if (interfaceC1010450cOx != null && (setOG02 = interfaceC1010450cOx.OG0()) != null) {
                setOG02.addAll(this.LLILZ.LIZJ);
            }
            InterfaceC1010450cOx interfaceC1010450cOx2 = this.LLILZLL;
            if (interfaceC1010450cOx2 != null) {
                interfaceC1010450cOx2.BJ1(shareInfo.LIZIZ);
            }
        }
        InterfaceC1011430cQX interfaceC1011430cQXVQ0 = vQ0();
        if (interfaceC1011430cQXVQ0 != null) {
            interfaceC1011430cQXVQ0.LIZIZ(EnumC1011130cQ3.RETURN_FROM_DETAIL);
        }
        LJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("module returnFromDetailPage eventTrackedList = ");
        InterfaceC1010450cOx interfaceC1010450cOx3 = this.LLILZLL;
        Integer numValueOf = null;
        if (interfaceC1010450cOx3 != null) {
            setOG0 = interfaceC1010450cOx3.OG0();
        } else {
            setOG0 = null;
        }
        sbLIZ.append(setOG0);
        sbLIZ.append(" playtims = ");
        InterfaceC1010450cOx interfaceC1010450cOx4 = this.LLILZLL;
        if (interfaceC1010450cOx4 != null) {
            numValueOf = Integer.valueOf(interfaceC1010450cOx4.s2());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
    }
}
