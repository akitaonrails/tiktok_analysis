package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BLG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLG {
    public final String LIZ;
    public boolean LJ;
    public volatile C1BLC LJFF;
    public final C14C4 LIZIZ = new C14C4(new C14C3() { // from class: X.1BLI
        @Override // X.C14C3
        public final void LIZ() {
            C1BLG c1blg = this.LIZ;
            C1BLC c1blc = c1blg.LJFF;
            if (c1blc != null) {
                C1BLQ.LIZIZ(c1blc, 3, null);
                c1blc.LJIIIZ = C1BLH.TIMEOUT;
                c1blg.LIZIZ.LIZ();
                C1BLL.LJ().LIZ(c1blc);
            }
        }
    });
    public final C1BL8 LIZJ = new C1BL8();
    public final C1BLA LIZLLL = new C1BLA(this);
    public volatile int LJI = -1;

    public final void LIZLLL() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind: ");
        C1BLC c1blc = this.LJFF;
        if (c1blc == null || (str = c1blc.LIZ) == null) {
            str = "null";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ.LIZ();
        this.LJ = false;
        this.LJFF = null;
        C1BLL c1bllLJ = C1BLL.LJ();
        synchronized (c1bllLJ) {
            c1bllLJ.LLIZ = System.currentTimeMillis();
            c1bllLJ.LLILZLL = null;
        }
        c1bllLJ.LJIILJJIL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BLI] */
    public C1BLG(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C1BLC c1blc) {
        C1BLC c1blc2 = this.LJFF;
        if (c1blc2 == null) {
            LIZIZ(c1blc);
        } else if (c1blc.LJIIIIZZ >= c1blc2.LJIIIIZZ) {
            c1blc2.LIZ(11, c1blc2.LJIIIIZZ, null);
            c1blc2.LJI = c1blc.LJI;
            c1blc2.LJFF = c1blc.LJFF;
            c1blc2.LIZLLL = c1blc.LIZLLL;
        }
        C1BL8.LIZ(0, this.LJFF);
        C1BLC c1blc3 = this.LJFF;
        if (c1blc3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) AabPluginServiceImpl.LJII).iterator();
        while (it2.hasNext()) {
            try {
                ((C1BLD) it2.next()).LIZIZ(c1blc3.LIZIZ, c1blc3.LJFF);
                arrayList.add(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZIZ(C1BLC c1blc) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cur: ");
        C1BLC c1blc2 = this.LJFF;
        if (c1blc2 == null || (obj = c1blc2.LJIIIZ) == null) {
            obj = "null";
        }
        sbLIZ.append(obj);
        sbLIZ.append(" -> bind: ");
        sbLIZ.append(c1blc.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c1blc.LJIIIZ = C1BLH.PENDING;
        this.LJFF = c1blc;
        this.LJI = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x0353, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0010, B:11:0x0018, B:12:0x001d, B:13:0x001f, B:15:0x002f, B:16:0x0031, B:18:0x0037, B:19:0x0039, B:20:0x0048, B:21:0x004b, B:23:0x0053, B:24:0x005c, B:25:0x0063, B:27:0x0067, B:28:0x0077, B:30:0x007d, B:33:0x0091, B:34:0x0095, B:35:0x009c, B:37:0x00a0, B:39:0x00b3, B:41:0x00b9, B:42:0x00bc, B:43:0x00d4, B:44:0x00ef, B:46:0x00f5, B:49:0x010d, B:50:0x0111, B:51:0x0119, B:53:0x0124, B:54:0x0129, B:56:0x012f, B:57:0x0134, B:58:0x013c, B:60:0x0140, B:62:0x0146, B:63:0x014b, B:64:0x0156, B:65:0x0166, B:67:0x016c, B:70:0x018b, B:71:0x018f, B:72:0x0197, B:74:0x019c, B:76:0x01b2, B:78:0x01ba, B:82:0x01dc, B:83:0x01ea, B:79:0x01c9, B:81:0x01cf, B:84:0x01ee, B:86:0x01f2, B:88:0x01f8, B:90:0x01fe, B:92:0x020a, B:94:0x0212, B:96:0x0216, B:99:0x0220, B:101:0x0228, B:98:0x021e, B:109:0x0249, B:111:0x024d, B:103:0x0233, B:105:0x0237, B:106:0x023e, B:108:0x0242, B:112:0x0253, B:114:0x025e, B:124:0x0272, B:125:0x0275, B:126:0x027d, B:128:0x0282, B:130:0x0288, B:132:0x028e, B:134:0x0292, B:136:0x029c, B:143:0x02b2, B:144:0x02b7, B:146:0x02bb, B:148:0x02bf, B:149:0x02c5, B:137:0x02a0, B:139:0x02a4, B:141:0x02aa, B:150:0x02c8, B:151:0x02d0, B:153:0x02e1, B:154:0x02ee, B:155:0x02fb, B:157:0x0301, B:160:0x0318, B:161:0x031c, B:163:0x0322, B:164:0x0326, B:166:0x032c, B:169:0x033a, B:170:0x033f, B:31:0x0083, B:158:0x0307, B:68:0x0172, B:47:0x00fb), top: B:185:0x0001, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(X.C1BLM r15) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BLG.LIZJ(X.1BLM):void");
    }
}
