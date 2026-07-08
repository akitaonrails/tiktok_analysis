package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQR {
    public static final List<C0KQI> LIZ = C1697810uHb.LJIIJJI(new C0KQI() { // from class: X.0KQM
        @Override // X.C0KQI
        public final void LIZJ(C0KQK c0kqk) {
            Exception exc = c0kqk.LJFF;
            if (exc == null) {
                C766270U4b.LIZLLL(2131851936);
                return;
            }
            if (exc instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) exc;
                Map<String, Object> map = C1338270kvh.LIZ;
                switch (c501470JlZ.getErrorCode()) {
                    case 41155:
                        C0KQI.LJI(c501470JlZ, 2131844529);
                        break;
                    case 4005192:
                    case 4005208:
                    case 4005209:
                    case 4025002:
                    case 4054002:
                        LIZ(c0kqk, C497740JfY.LJIJI(2131855795), c501470JlZ.getPrompt(), "", new C0KQU());
                        break;
                    case 4005256:
                    case 4005257:
                        C0KQI.LJI(c501470JlZ, 2131843092);
                        break;
                    case 4054001:
                        break;
                    case 4054003:
                    case 4054005:
                    case 4054006:
                        C0KQI.LJI(c501470JlZ, 2131851936);
                        break;
                    case 4054004:
                        C0KQI.LJI(c501470JlZ, 2131841279);
                        break;
                    default:
                        C501540Jlg.LIZLLL(c0kqk.LIZ, c0kqk.LJFF, 2131851936);
                        break;
                }
                return;
            }
            C766270U4b.LIZLLL(2131843092);
        }

        @Override // X.C0KQI
        public final boolean LIZLLL(C0KQK c0kqk) {
            if (c0kqk.LIZIZ == 1) {
                return true;
            }
            return false;
        }
    }, new C0KQN());
}
