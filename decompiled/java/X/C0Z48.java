package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z48, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics$reportReceiveMessage$1", f = "IMMessageAnalytics.kt", l = {911, 918, 976}, m = "invokeSuspend")
public final class C0Z48 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public C0Y8T LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C869590Y9l LLILZLL;
    public final /* synthetic */ C0ZCG LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1493105sv LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z48(C869590Y9l c869590Y9l, C0ZCG c0zcg, int i, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C0Z48> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c869590Y9l;
        this.LLIZ = c0zcg;
        this.LLIZLLLIL = i;
        this.LLJ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z48(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z48.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
