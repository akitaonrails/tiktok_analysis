package Y;

import X.C0L9R;
import X.C0VSJ;
import X.C1C7U;
import X.C2188811AlT;
import X.C2475009mu;
import X.C2475309mx;
import X.C533730KwV;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS174S0300000_3 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS174S0300000_3 aCallableS174S0300000_3) {
        Bitmap bitmapLJI;
        C1C7U.LIZ("VideoImageMixedHelper@c682.resizeSelectImage$1");
        C533730KwV c533730KwV = C533730KwV.LIZ;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS174S0300000_3.l0;
        c533730KwV.getClass();
        String strLJFF = C533730KwV.LJFF(creativeInfo);
        if (!new C0VSJ(strLJFF).exists()) {
            new C0VSJ(strLJFF).mkdirs();
        }
        for (MediaModel mediaModel : (List) aCallableS174S0300000_3.l1) {
            C533730KwV c533730KwV2 = C533730KwV.LIZ;
            String strLJFF2 = mediaModel.LJFF();
            C0L9R c0l9r = (C0L9R) aCallableS174S0300000_3.l2;
            c533730KwV2.getClass();
            if (C533730KwV.LJIIJ(strLJFF2) && (bitmapLJI = C2475309mx.LJI(c0l9r.width, c0l9r.height, C2475309mx.LIZIZ(strLJFF2), 4, strLJFF2)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJFF);
                sbLIZ.append(C533730KwV.LJIIIIZZ(".png"));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2475009mu.LJFF(50, Bitmap.CompressFormat.PNG, bitmapLJI, new C0VSJ(strLIZIZ));
                C2475309mx.LJ(bitmapLJI);
                if (strLIZIZ != null) {
                    mediaModel.LJIILL(strLIZIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedHelper@c682.resizeSelectImage$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[EDGE_INSN: B:35:0x0096->B:31:0x0096 BREAK  A[LOOP:1: B:26:0x007d->B:37:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS174S0300000_3 r6) {
        /*
            java.lang.String r5 = "BridgeGeckoUpdateListener@90e1.onCheckServerVersionSuccess$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = r6.l0
            X.09ZM r2 = (X.C09ZM) r2
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L24
            java.lang.Object r0 = r6.l1
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L1e
            X.09ZO r0 = r2.LIZ
            r0.LJ()
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1e:
            X.09ZO r0 = r2.LIZ
            r0.LIZJ()
            goto L18
        L24:
            java.lang.Object r1 = r6.l1
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L61
            java.lang.String r0 = r2.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L61
            java.lang.Object r4 = r6.l0
            X.09ZM r4 = (X.C09ZM) r4
            java.util.Iterator r3 = r0.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.geckox.model.UpdatePackage r0 = (com.bytedance.geckox.model.UpdatePackage) r0
            java.lang.String r1 = r0.getChannel()
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
            if (r2 == 0) goto L61
            java.lang.Object r0 = r6.l0
            X.09ZM r0 = (X.C09ZM) r0
            X.09ZO r0 = r0.LIZ
            r0.LIZJ()
            goto L18
        L61:
            java.lang.Object r1 = r6.l2
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L96
            java.lang.Object r0 = r6.l0
            X.09ZM r0 = (X.C09ZM) r0
            java.lang.String r0 = r0.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L96
            java.lang.Object r4 = r6.l0
            X.09ZM r4 = (X.C09ZM) r4
            java.util.Iterator r3 = r0.iterator()
        L7d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r2 = r3.next()
            r0 = r2
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7d
            if (r2 != 0) goto L18
        L96:
            java.lang.Object r0 = r6.l0
            X.09ZM r0 = (X.C09ZM) r0
            X.09ZO r0 = r0.LIZ
            r0.LJFF()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS174S0300000_3.call$1(Y.ACallableS174S0300000_3):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS174S0300000_3(Object obj, CreativeInfo creativeInfo, List<? extends MediaModel> list, C0L9R c0l9r) {
        this.$t = c0l9r;
        this.l0 = obj;
        this.l1 = creativeInfo;
        this.l2 = list;
    }
}
