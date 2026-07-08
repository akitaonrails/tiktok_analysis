package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01cZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakSparkUtil$StreakSparkContextInjectPlugin$handle$context$1$1$1", f = "StreakSparkUtil.kt", l = {79}, m = "invokeSuspend")
public final class C372501cZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ JSONObject LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372501cZ(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C372501cZ c372501cZ = new C372501cZ(this.LLILZIL, this.LLILZ, interfaceC1364105Vn, this.LLILZLL);
        c372501cZ.LLILLL = obj;
        return c372501cZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.json.JSONException {
        /*
            r10 = this;
            java.lang.String r9 = "StreakSparkUtil$StreakSparkContextInjectPlugin@e988.handle$context$1$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L48
            if (r0 != r6) goto L8a
            java.lang.Object r3 = r10.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r10.LLILLL
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            X.C155000ia.LIZIZ(r11)
        L1b:
            kotlin.Pair r11 = (kotlin.Pair) r11
            if (r11 == 0) goto L2c
            java.lang.Object r1 = r11.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r11.getSecond()
            r2.put(r1, r0)
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r3.next()
            X.0957 r0 = (X.AnonymousClass0957) r0
            r10.LLILLL = r2
            r10.LL = r3
            r10.LLILLJJLI = r6
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r7) goto L1b
            X.C1C7U.LIZIZ(r9)
            return r7
        L48:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r8 = r10.LLILLL
            X.01wk r8 = (X.InterfaceC497601wk) r8
            java.util.List<java.lang.String> r1 = r10.LLILZ
            java.lang.String r5 = r10.LLILZIL
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            X.06Eo r2 = new X.06Eo
            r1 = 0
            r2.<init>(r5, r0, r1)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r8, r1, r1, r2, r0)
            r4.add(r0)
            goto L62
        L7d:
            org.json.JSONObject r2 = r10.LLILZLL
            java.util.Iterator r3 = r4.iterator()
            goto L2c
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372501cZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
