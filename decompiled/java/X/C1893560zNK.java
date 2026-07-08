package X;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893560zNK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1893560zNK(Context context, Integer num, String str, String str2, String str3, Map map, Function1 function1, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = map;
        this.LLIZLLLIL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r9 = this;
            X.0zNM r0 = X.C1893580zNM.LIZ
            r0.getClass()
            X.C1893580zNM.LJFF()
            boolean r0 = r9.LL
            if (r0 == 0) goto L3e
            X.0sFe r2 = X.C1619720sFe.LIZ
            r1 = 0
            X.0z0O r0 = r2.LIZ(r1)
            X.0zRP r0 = (X.AbstractC1896090zRP) r0
            if (r0 == 0) goto L1d
            boolean r0 = r0.LJJIJIL()
            if (r0 != 0) goto L3e
        L1d:
            X.0z0O r0 = r2.LIZ(r1)
            X.0zRP r0 = (X.AbstractC1896090zRP) r0
            if (r0 == 0) goto L3b
            java.lang.Integer r4 = r9.LLILLJJLI
            X.07kc r1 = new X.07kc
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r9.LLIZLLLIL
            android.content.Context r3 = r9.LLILLL
            java.lang.String r5 = r9.LLILZ
            java.lang.String r6 = r9.LLILZIL
            java.lang.String r7 = r9.LLILZLL
            java.util.Map<java.lang.String, java.lang.String> r8 = r9.LLIZ
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.LJJIJLIJ(r4, r1)
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            android.content.Context r6 = r9.LLILLL
            java.lang.Integer r5 = r9.LLILLJJLI
            java.lang.String r4 = r9.LLILZ
            java.lang.String r3 = r9.LLILZIL
            java.lang.String r2 = r9.LLILZLL
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.LLIZ
            X.0zNL r1 = new X.0zNL
            r1.<init>(r4, r3)
            java.lang.String r0 = X.C1893580zNM.LIZLLL(r5, r4, r3, r2, r0)
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r6, r0)
            r0.withCallback(r1)
            r0.open()
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1893560zNK.invoke():java.lang.Object");
    }
}
