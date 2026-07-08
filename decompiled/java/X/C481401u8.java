package X;

import com.bytedance.android.livesdk.model.Board;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C481401u8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C481701uB());

    public static void LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C1152620g6G.LIZLLL((Board) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C481301u7(arrayList, null), 3);
    }

    public static AbstractC481901uD LIZIZ(Board board) {
        AbstractC481901uD abstractC481901uDLIZJ = LIZJ(board);
        if (abstractC481901uDLIZJ instanceof C481501u9) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01X3(((C481501u9) abstractC481901uDLIZJ).LIZ, null), 3);
        }
        return abstractC481901uDLIZJ;
    }

    public static AbstractC481901uD LIZJ(Board board) {
        Object next;
        Board boardLIZ = board.LIZ();
        final int iLIZ = (int) board.dslVersion;
        if (iLIZ == 0) {
            iLIZ = 20000;
        }
        int iLIZJ = C1152620g6G.LIZJ();
        while (iLIZ < iLIZJ) {
            Iterator it2 = ((List) LIZ.getValue()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((InterfaceC482101uF) next).LIZJ() == iLIZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC482101uF interfaceC482101uF = (InterfaceC482101uF) next;
            if (interfaceC482101uF == null) {
                return new AbstractC481901uD(iLIZ) { // from class: X.01uA
                    public final int LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C481601uA) && this.LIZ == ((C481601uA) obj).LIZ;
                    }

                    public final int hashCode() {
                        return this.LIZ;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NoPath(stuckAtVersion=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = iLIZ;
                    }
                };
            }
            try {
                boardLIZ = interfaceC482101uF.LIZIZ(boardLIZ);
                iLIZ = interfaceC482101uF.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new C482001uE(interfaceC482101uF.LIZJ(), interfaceC482101uF.LIZ(), e);
            }
        }
        return new C481501u9(boardLIZ);
    }
}
