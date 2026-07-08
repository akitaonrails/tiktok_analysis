package Y;

import X.C1000960c9e;
import X.C1001030c9l;
import X.C1018070cbF;
import X.C1023640ckE;
import X.C13EA;
import X.EnumC1018180cbQ;
import X.EnumC1030740cvg;
import X.InterfaceC315390CXx;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS359S0100000_16 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS359S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS359S0100000_16 r4, java.lang.Object r5) {
        /*
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            X.0ckE r5 = (X.C1023640ckE) r5
            X.0cbZ r0 = X.C1018270cbZ.LIZ
            r0.getClass()
            X.0cBd r4 = X.C1018270cbZ.LIZIZ
            if (r1 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto L2e
            java.lang.String r3 = r0.getUrlKey()
            boolean r2 = X.C1030680cva.LJFF(r1)
            java.lang.String r1 = r0.getFileHash()
            r0 = 1
            java.lang.String r0 = X.C1030680cva.LJIIIIZZ(r3, r1, r2, r0)
            if (r0 != 0) goto L30
        L2e:
            java.lang.String r0 = ""
        L30:
            r5.withParam(r4, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS359S0100000_16.invoke$0(Y.AObjectS359S0100000_16, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        ((C1023640ckE) obj).withParam(C1018070cbF.LJIIJJI, (EnumC1018180cbQ) aObjectS359S0100000_16.l0);
        return null;
    }

    public static final Object invoke$2(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        ((C1023640ckE) obj).withParam(C1018070cbF.LJIIJJI, (EnumC1018180cbQ) aObjectS359S0100000_16.l0);
        return null;
    }

    public static final Object invoke$3(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        ((C1023640ckE) obj).withParam(C1018070cbF.LJIIL, (EnumC1030740cvg) aObjectS359S0100000_16.l0);
        return null;
    }

    public static final Object invoke$4(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        Aweme aweme = (Aweme) aObjectS359S0100000_16.l0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C1018070cbF.LJIIL, EnumC1030740cvg.FILTER_WITH_SAME_AWEME);
        c1023640ckE.withParam(C1018070cbF.LJIILL, aweme.getAwemeRawAd().getCreativeIdStr());
        return null;
    }

    public static final Object invoke$5(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        return ((C13EA) aObjectS359S0100000_16.l0).LJ(((Integer) obj).intValue());
    }

    public static final Object invoke$6(AObjectS359S0100000_16 aObjectS359S0100000_16, Object obj) {
        Aweme aweme;
        C1000960c9e c1000960c9e = (C1000960c9e) aObjectS359S0100000_16.l0;
        InterfaceC315390CXx interfaceC315390CXx = (InterfaceC315390CXx) obj;
        c1000960c9e.getClass();
        if ((interfaceC315390CXx instanceof C1001030c9l) && (aweme = c1000960c9e.LLJILLL) != null && aweme.getAid() != null) {
            C1001030c9l c1001030c9l = (C1001030c9l) interfaceC315390CXx;
            if (c1000960c9e.LLJILLL.getAid().equals(c1001030c9l.LIZ)) {
                HandlerHook.viewPost(c1000960c9e, new ARunnableS85S0200000_16(c1000960c9e, c1001030c9l, 44));
            }
        }
        return Unit.LIZ;
    }
}
