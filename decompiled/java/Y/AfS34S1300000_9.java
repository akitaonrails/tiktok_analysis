package Y;

import X.C09JN;
import X.C1C7U;
import X.C618910OPh;
import X.C785410UrT;
import X.DialogC1389620mGW;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class AfS34S1300000_9 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[Catch: Exception -> 0x0118, TryCatch #0 {Exception -> 0x0118, blocks: (B:3:0x0009, B:5:0x000f, B:6:0x0015, B:8:0x001e, B:9:0x0030, B:11:0x0062, B:12:0x006a, B:14:0x0070, B:16:0x007c, B:17:0x0086, B:20:0x0099, B:22:0x009f, B:23:0x00a2, B:25:0x00ad, B:27:0x00b9, B:30:0x00c8, B:28:0x00c3, B:31:0x0105, B:18:0x0094), top: B:39:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105 A[EDGE_INSN: B:43:0x0105->B:31:0x0105 BREAK  A[LOOP:1: B:24:0x00ab->B:28:0x00c3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS34S1300000_9 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS34S1300000_9.accept$0(Y.AfS34S1300000_9, java.lang.Object):void");
    }

    public static final void accept$1(AfS34S1300000_9 afS34S1300000_9, Object obj) {
        C1C7U.LIZ("BulletinBoardUtils@33ce.openLinkInBulletin$3");
        DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) afS34S1300000_9.l1;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        C618910OPh c618910OPh = C618910OPh.LIZ;
        Context context = (Context) afS34S1300000_9.l2;
        String str = afS34S1300000_9.s0;
        Map map = (Map) afS34S1300000_9.l3;
        c618910OPh.getClass();
        C618910OPh.LJI(context, str, map);
        C1C7U.LIZIZ("BulletinBoardUtils@33ce.openLinkInBulletin$3");
    }

    public AfS34S1300000_9(Context context, DialogC1389620mGW dialogC1389620mGW, String str, Map map, int i) {
        this.$t = i;
        this.l1 = dialogC1389620mGW;
        this.l2 = context;
        this.s0 = str;
        this.l3 = map;
    }
}
