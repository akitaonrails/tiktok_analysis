package Y;

import X.C09JN;
import X.C1131070fXV;
import X.C1133120fao;
import X.C1133160fas;
import X.C1515210pX5;
import X.C1AF0;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC1133140faq;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class AfS3S0201100_17 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        r8.add(r13);
        r4 = X.C1138630fjh.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r0 = r4.put(java.lang.Long.valueOf(r13.id), r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS3S0201100_17 r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0201100_17.accept$0(Y.AfS3S0201100_17, java.lang.Object):void");
    }

    public static final void accept$1(AfS3S0201100_17 afS3S0201100_17, Object obj) throws JSONException {
        C1C7U.LIZ("LiveGiftAssetsManager@6e36.syncAssetsList$disable$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("Assets Manager", th.getMessage());
        InterfaceC1133140faq interfaceC1133140faq = (InterfaceC1133140faq) afS3S0201100_17.l0;
        if (interfaceC1133140faq != null) {
            interfaceC1133140faq.onFailed();
        }
        C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
        int size = ((List) ((C259800zU) afS3S0201100_17.l1).element).size();
        int i = c1133120faoLIZ.LIZ;
        int i2 = afS3S0201100_17.i2;
        String str = c1133120faoLIZ.LIZIZ;
        C1515210pX5.LIZLLL().getClass();
        C1131070fXV.LIZLLL(0, size, i, i2, str, C1515210pX5.LIZJ(), System.currentTimeMillis() - afS3S0201100_17.j3, "", null, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gift asset list fail ");
        sbLIZ.append(th.getMessage());
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveGiftAssetsManager@6e36.syncAssetsList$disable$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0201100_17(int r2, long r3, X.InterfaceC1133140faq r5, X.C259800zU r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L11
            r0 = r1
            r0.l0 = r5
            r0.l1 = r6
            r0.i2 = r2
            r0.j3 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r6
            r0.l1 = r5
            r0.i2 = r2
            r0.j3 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0201100_17.<init>(int, long, X.0faq, X.00zU, int):void");
    }
}
