package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.1EQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EQ6 extends C09AY implements Function0<C1368250li3> {
    public C1EQ6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0li3] */
    @Override // kotlin.jvm.functions.Function0
    public final C1368250li3 invoke() {
        return new InterfaceC1369310ljl() { // from class: X.0li3
            @Override // X.InterfaceC1369310ljl
            public final String LJ(String str) {
                try {
                    if (C805520Vio.LIZIZ.contains(str)) {
                        return "recent link share";
                    }
                    if (C805520Vio.LIZ.contains(str)) {
                        return "recent share";
                    }
                    if (C805520Vio.LIZJ.contains(str)) {
                        return "recent send to";
                    }
                    return "recent chat";
                } catch (ArrayIndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "recent chat";
                }
            }

            @Override // X.InterfaceC1369310ljl
            public final void LJFF(Context context, Bundle bundle) {
                if (!((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin()) {
                    C0XPD.LIZIZ(C1388190mED.LIZ(context), "chat_list", "button", null, null);
                } else {
                    String str = RelationSelectActivity._pnsPageId;
                    C334250D8l.LIZ(context, bundle);
                }
            }

            @Override // X.InterfaceC1369310ljl
            public final C1381810m3v LJI(InterfaceC328360Cu2 interfaceC328360Cu2, InterfaceC1368140lhs interfaceC1368140lhs) {
                C1368260li4 c1368260li4 = new C1368260li4(1, false);
                c1368260li4.LJI = true;
                c1368260li4.LJJIIZ = true;
                c1368260li4.LJIIJJI = true;
                c1368260li4.LJIIJ = true;
                c1368260li4.LJIIL = false;
                c1368260li4.LJFF = true;
                c1368260li4.LJIL = false;
                c1368260li4.LJII = true;
                c1368260li4.LJIJJ = false;
                C1381810m3v c1381810m3v = new C1381810m3v(c1368260li4);
                c1381810m3v.LLILLJJLI = interfaceC328360Cu2;
                c1381810m3v.LLJIJIL = interfaceC1368140lhs;
                return c1381810m3v;
            }

            @Override // X.InterfaceC1369310ljl
            public final C1381810m3v LIZ(C1369220ljc c1369220ljc, C1369220ljc c1369220ljc2, C1368260li4 c1368260li4) {
                C1381810m3v c1381810m3v = new C1381810m3v(c1368260li4);
                c1381810m3v.LLILLJJLI = c1369220ljc;
                c1381810m3v.LLJIJIL = c1369220ljc2;
                return c1381810m3v;
            }

            @Override // X.InterfaceC1369310ljl
            public final C1381810m3v LIZIZ(InterfaceC328360Cu2 interfaceC328360Cu2, InterfaceC1368140lhs interfaceC1368140lhs, boolean z) {
                C1368260li4 c1368260li4 = new C1368260li4(3, false);
                c1368260li4.LJIJJ = true;
                c1368260li4.LJJI = true;
                c1368260li4.LJIIJ = z;
                c1368260li4.LJFF = false;
                c1368260li4.LJIIL = !z;
                c1368260li4.LJII = false;
                c1368260li4.LJI = false;
                c1368260li4.LJIL = false;
                c1368260li4.LJJIIJ = 100;
                c1368260li4.LJJIJIIJI = true;
                C1381810m3v c1381810m3v = new C1381810m3v(c1368260li4);
                c1381810m3v.LLILLJJLI = interfaceC328360Cu2;
                c1381810m3v.LLJIJIL = interfaceC1368140lhs;
                return c1381810m3v;
            }

            @Override // X.InterfaceC1369310ljl
            public final void LIZJ(InterfaceC1368280li6 interfaceC1368280li6, C1368290li7 c1368290li7, boolean z) {
                C1368260li4 c1368260li4 = new C1368260li4(c1368290li7.LIZ, c1368290li7.LIZIZ);
                c1368260li4.LJ = true;
                c1368260li4.LJFF = c1368290li7.LIZJ;
                c1368260li4.LJI = false;
                C1381840m3y c1381840m3y = new C1381840m3y(c1368260li4);
                AbstractC1381820m3w.LJII(c1381840m3y, new C1510805vm(interfaceC1368280li6, z), new AwS600S0100000_21(interfaceC1368280li6, 294));
                c1381840m3y.LIZLLL();
            }

            @Override // X.InterfaceC1369310ljl
            public final void LIZLLL(int i, InterfaceC1368280li6 interfaceC1368280li6, C1368290li7 c1368290li7) {
                C1381840m3y c1381840m3y;
                if (c1368290li7 == null) {
                    C1368260li4 c1368260li4 = new C1368260li4(1, false);
                    c1368260li4.LJ = false;
                    c1368260li4.LJFF = true;
                    c1368260li4.LJI = true;
                    c1381840m3y = new C1381840m3y(c1368260li4);
                } else {
                    C1368260li4 c1368260li42 = new C1368260li4(c1368290li7.LIZ, c1368290li7.LIZIZ);
                    c1368260li42.LJ = true;
                    c1368260li42.LJFF = c1368290li7.LIZJ;
                    c1368260li42.LJI = false;
                    c1381840m3y = new C1381840m3y(c1368260li42);
                }
                AbstractC1381820m3w.LJII(c1381840m3y, new C1512905w7(i, interfaceC1368280li6), new AwS600S0100000_21(interfaceC1368280li6, 295));
                c1381840m3y.LIZLLL();
            }
        };
    }
}
