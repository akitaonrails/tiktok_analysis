package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08VU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachVideoPlayTimer$startTimer$1", f = "OutreachVideoPlayTimer.kt", l = {208}, m = "invokeSuspend")
public final class C08VU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ JSONObject LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VU(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08VU c08vu = new C08VU(this.LLILZLL, interfaceC1364105Vn, this.LLIZ);
        c08vu.LLILZIL = obj;
        return c08vu;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x007e, B:26:0x0081, B:28:0x0087, B:10:0x003a, B:12:0x0040, B:14:0x0048, B:17:0x0057, B:22:0x006d, B:31:0x00be, B:9:0x002f), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x007e, B:26:0x0081, B:28:0x0087, B:10:0x003a, B:12:0x0040, B:14:0x0048, B:17:0x0057, B:22:0x006d, B:31:0x00be, B:9:0x002f), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:26:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:26:0x0081). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
