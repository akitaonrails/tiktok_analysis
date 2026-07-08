package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C909403gy extends C09AY implements Function2<C03XW, JSONObject, Unit> {
    public final /* synthetic */ C897703f5 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C912503hT LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909403gy(C897703f5 c897703f5, boolean z, C912503hT c912503hT, C906803gY c906803gY, Function1 function1, Context context) {
        super(2);
        this.LL = c897703f5;
        this.LLILLJJLI = z;
        this.LLILLL = c912503hT;
        this.LLILZ = c906803gY;
        this.LLILZIL = function1;
        this.LLILZLL = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C03XW r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "handleErrorCodeAction "
            r1.append(r0)
            r1.append(r9)
            r0 = 32
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            X.03XW r0 = X.C03XW.ON_CLOSE
            if (r9 != r0) goto L2f
            X.03f5 r0 = r8.LL
            X.03hF r0 = r0.LJIILJJIL
            if (r0 == 0) goto L2f
            r0.LIZIZ()
        L2f:
            boolean r0 = r8.LLILLJJLI
            if (r0 == 0) goto L72
            X.03hT r0 = r8.LLILLL
            if (r0 == 0) goto L72
            r7 = 0
            if (r10 == 0) goto L69
            java.lang.String r0 = "action_type"
            java.lang.String r1 = r10.optString(r0)
        L40:
            X.03on r0 = X.EnumC957903on.OPEN_SCHEMA
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6b
            X.03gi r0 = X.C907803gi.LIZ
            r0.getClass()
            X.01wk r1 = X.C907803gi.LJ()
            X.03gz r2 = new X.03gz
            X.03hT r3 = r8.LLILLL
            android.content.Context r4 = r8.LLILZLL
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.LLILZ
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r6 = r8.LLILZIL
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r7, r7, r2, r0)
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            r1 = r7
            goto L40
        L6b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper.LIZIZ = r7
        L72:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.LLILZ
            r0.invoke()
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r8.LLILZIL
            if (r1 == 0) goto L66
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909403gy.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
