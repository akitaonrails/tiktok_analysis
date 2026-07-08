package Y;

import X.AbstractC19666311wz;
import X.AbstractC2222531Byl;
import X.C080U;
import X.C09JN;
import X.C0X52;
import X.C13BV;
import X.C15438062q;
import X.C19666111wx;
import X.C19666211wy;
import X.C1C7U;
import X.C20441214yg;
import X.C2175508fh;
import X.C2188811AlT;
import X.C2221941Bxo;
import X.C2222611Byt;
import X.C2222641Byw;
import X.InterfaceC19666511x1;
import com.bytedance.retrofit2.mime.TypedByteArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class AfS167S0200000_34 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS167S0200000_34 afS167S0200000_34, Object obj) {
        AbstractC19666311wz<C2222611Byt, ? extends Exception> c19666211wy;
        C1C7U.LIZ("AbsMessageClient@e08f.get$1");
        C2175508fh c2175508fh = ((C0X52) obj).LIZ;
        if (c2175508fh.LIZJ()) {
            byte[] bytes = ((TypedByteArray) c2175508fh.LJ).getBytes();
            List<C080U> list = c2175508fh.LIZLLL;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C080U c080u : list) {
                arrayList.add(new C2221941Bxo(c080u.LIZ, c080u.LIZIZ));
            }
            C2222641Byw c2222641Byw = new C2222641Byw();
            int i = c2175508fh.LIZIZ;
            C2222611Byt c2222611Byt = c2222641Byw.LIZ;
            c2222611Byt.LIZ = i;
            c2222611Byt.LIZIZ = c2175508fh.LIZJ;
            c2222611Byt.LIZJ = arrayList;
            c2222611Byt.LIZLLL = bytes;
            c19666211wy = new C19666111wx<>(c2222611Byt);
        } else {
            ((AbstractC2222531Byl) afS167S0200000_34.l0).getClass();
            String strLIZIZ = AbstractC2222531Byl.LIZIZ(c2175508fh);
            ((AbstractC2222531Byl) afS167S0200000_34.l0).getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("http post response failed, code: ");
            sbLIZ.append(c2175508fh.LIZIZ);
            sbLIZ.append(". logId: ");
            sbLIZ.append(strLIZIZ);
            C20441214yg.LJ("AbsMessageClient", C2188811AlT.LIZIZ(sbLIZ));
            c19666211wy = new C19666211wy<>(new Exception("response failed"));
        }
        ((InterfaceC19666511x1) afS167S0200000_34.l1).LIZ(c19666211wy);
        C1C7U.LIZIZ("AbsMessageClient@e08f.get$1");
    }

    public static final void accept$1(AfS167S0200000_34 afS167S0200000_34, Object obj) {
        AbstractC19666311wz<C2222611Byt, ? extends Exception> c19666211wy;
        C1C7U.LIZ("AbsMessageClient@e08f.post$1");
        C2175508fh c2175508fh = ((C0X52) obj).LIZ;
        if (c2175508fh.LIZJ()) {
            byte[] bytes = ((TypedByteArray) c2175508fh.LJ).getBytes();
            List<C080U> list = c2175508fh.LIZLLL;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C080U c080u : list) {
                arrayList.add(new C2221941Bxo(c080u.LIZ, c080u.LIZIZ));
            }
            C2222641Byw c2222641Byw = new C2222641Byw();
            int i = c2175508fh.LIZIZ;
            C2222611Byt c2222611Byt = c2222641Byw.LIZ;
            c2222611Byt.LIZ = i;
            c2222611Byt.LIZIZ = c2175508fh.LIZJ;
            c2222611Byt.LIZJ = arrayList;
            c2222611Byt.LIZLLL = bytes;
            c19666211wy = new C19666111wx<>(c2222611Byt);
        } else {
            ((AbstractC2222531Byl) afS167S0200000_34.l0).getClass();
            String strLIZIZ = AbstractC2222531Byl.LIZIZ(c2175508fh);
            ((AbstractC2222531Byl) afS167S0200000_34.l0).getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("http post response failed, code: ");
            sbLIZ.append(c2175508fh.LIZIZ);
            sbLIZ.append(". logId: ");
            sbLIZ.append(strLIZIZ);
            C20441214yg.LJ("AbsMessageClient", C2188811AlT.LIZIZ(sbLIZ));
            c19666211wy = new C19666211wy<>(new Exception("response failed"));
        }
        ((InterfaceC19666511x1) afS167S0200000_34.l1).LIZ(c19666211wy);
        C1C7U.LIZIZ("AbsMessageClient@e08f.post$1");
    }

    public AfS167S0200000_34(AbstractC2222531Byl abstractC2222531Byl, InterfaceC19666511x1 interfaceC19666511x1, int i) {
        this.$t = i;
        this.l0 = abstractC2222531Byl;
        this.l1 = interfaceC19666511x1;
    }
}
