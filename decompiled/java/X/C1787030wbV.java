package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0wbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787030wbV implements InterfaceC560980LzM<Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk>, C1787830wcn> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1788520wdu LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "report_order_fail";
    }

    public C1787030wbV(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1788520wdu;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk> pair, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) throws Exception {
        String str;
        String strValueOf;
        Pair<? extends Pair<? extends Exception, ? extends C1787830wcn>, ? extends EnumC1787180wbk> pair2 = pair;
        Exception first = pair2.getFirst().getFirst();
        EnumC1787180wbk second = pair2.getSecond();
        C1787830wcn second2 = pair2.getFirst().getSecond();
        String string = null;
        switch (C1787040wbW.LIZ[second2.LJ.ordinal()]) {
            case 1:
                str = "203";
                break;
            case 2:
                str = "205";
                break;
            case 3:
                str = "204";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                str = null;
                break;
            default:
                throw new C1954807lC();
        }
        boolean z = first instanceof C1786910wbJ;
        if (z) {
            strValueOf = String.valueOf(((C1786910wbJ) first).getErrorCode());
        } else if (first instanceof C1786680waw) {
            strValueOf = String.valueOf(((C1786680waw) first).getErrorCode());
        } else if (first instanceof C1786940wbM) {
            strValueOf = "2035";
        } else {
            if (!(first instanceof C1787150wbh)) {
                strValueOf = "";
                string = "";
                InterfaceC1786480wac interfaceC1786480wacLJ = this.LIZIZ.LJ();
                C1787020wbU c1787020wbU = C1787020wbU.LIZJ;
                C1787010wbT c1787010wbT = new C1787010wbT(this, second2, first, second, str, strValueOf, string);
                c1787020wbU.getClass();
                interfaceC1786480wacLJ.LIZ(new C1786590wan(c1787020wbU, c1787010wbT));
                throw first;
            }
            strValueOf = "2030";
        }
        if (!z) {
            string = "";
        } else {
            Integer errorSubCode = ((C1786910wbJ) first).getErrorSubCode();
            if (errorSubCode != null) {
                string = errorSubCode.toString();
            }
        }
        InterfaceC1786480wac interfaceC1786480wacLJ2 = this.LIZIZ.LJ();
        C1787020wbU c1787020wbU2 = C1787020wbU.LIZJ;
        C1787010wbT c1787010wbT2 = new C1787010wbT(this, second2, first, second, str, strValueOf, string);
        c1787020wbU2.getClass();
        interfaceC1786480wacLJ2.LIZ(new C1786590wan(c1787020wbU2, c1787010wbT2));
        throw first;
    }
}
