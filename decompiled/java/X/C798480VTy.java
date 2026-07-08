package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798480VTy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C798480VTy(int i, Map map) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r7 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LL
            java.lang.String r2 = "vv_code"
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r0 = "9000"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L18
            java.util.Map<java.lang.Integer, java.lang.String> r0 = X.C798410VTr.LIZ
            int r0 = r7.LLILLJJLI
            X.C798410VTr.LIZIZ(r0)
        L18:
            boolean r0 = X.C1DS1.LIZJ
            if (r0 == 0) goto Lae
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LL
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            if (r0 == 0) goto L2f
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r0 = 9000(0x2328, float:1.2612E-41)
            if (r1 >= r0) goto Lae
        L2f:
            X.01GW r0 = X.C1DS1.LJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L84
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LL
            java.lang.String r0 = "launch_origin_uri"
            java.lang.Object r0 = r1.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 1
            if (r0 == 0) goto L50
            int r0 = r0.length()
            if (r0 != 0) goto Lae
        L50:
            r3 = 3
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2[r5] = r0
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2[r1] = r0
            java.util.List r2 = X.C1697810uHb.LJIIJJI(r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LL
            java.lang.String r0 = "report_end_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb6
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L7a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lae
        L84:
            int r1 = r7.LLILLJJLI
            X.0CBG r0 = X.C0CBG.LAST
            int r0 = r0.getCode()
            if (r1 != r0) goto Lb1
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LL
            java.lang.String r0 = "session_id"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
        L98:
            if (r3 != 0) goto L9e
            java.lang.String r3 = com.bytedance.applog.AppLog.getSessionId()
        L9e:
            X.0Vgt r0 = new X.0Vgt
            X.0Vif r1 = X.EnumC805430Vif.FEED_FORYOU_5VV
            X.0Vgd r2 = X.EnumC804170Vgd.FEED_FORYOU_5VV_ZERO_VV
            r4 = 0
            r6 = 16
            r0.<init>(r1, r2, r3, r4, r6)
            X.C804290Vgp.LIZ(r0)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb1:
            java.lang.String r3 = com.bytedance.applog.AppLog.getSessionId()
            goto L98
        Lb6:
            r0 = -1
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C798480VTy.invoke():java.lang.Object");
    }
}
