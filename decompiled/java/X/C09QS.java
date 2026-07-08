package X;

import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09QS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.diversion.pdpshare.EcSearchOutOfAppManager$tryRedirectShopPdpToShopSearch$1", f = "EcSearchOutOfAppManager.kt", l = {93, 93}, m = "invokeSuspend")
public final class C09QS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Function2 LLILLJJLI;
    public Object LLILLL;
    public Function0 LLILZ;
    public C259800zU LLILZIL;
    public C259800zU LLILZLL;
    public C557050Lt1 LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Uri LLJILJILJ;
    public final /* synthetic */ Uri LLJILLL;
    public final /* synthetic */ Function2<String, Context, Unit> LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Function0<Unit> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09QS(String str, Uri uri, Uri uri2, Function2<? super String, ? super Context, Unit> function2, String str2, Function0<Unit> function0, InterfaceC1364105Vn<? super C09QS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = str;
        this.LLJILJILJ = uri;
        this.LLJILLL = uri2;
        this.LLJJ = function2;
        this.LLJJI = str2;
        this.LLJJIII = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09QS c09qs = new C09QS(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c09qs.LLJIJIL = obj;
        return c09qs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c7 A[Catch: all -> 0x03fe, CancellationException -> 0x045b, TryCatch #0 {CancellationException -> 0x045b, blocks: (B:109:0x0307, B:114:0x033e, B:116:0x0344, B:118:0x036c, B:120:0x0388, B:122:0x038f, B:123:0x0394, B:113:0x0333, B:131:0x03bc, B:133:0x03c7, B:135:0x03cd, B:138:0x03f8, B:139:0x03fb, B:56:0x01a8, B:58:0x01bd, B:60:0x01c3, B:66:0x01cf, B:82:0x021d, B:70:0x01df, B:71:0x01ee, B:73:0x01f4, B:80:0x020e, B:78:0x020a, B:81:0x0216, B:83:0x0225, B:84:0x0236), top: B:155:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03cd A[Catch: all -> 0x03fe, CancellationException -> 0x045b, TryCatch #0 {CancellationException -> 0x045b, blocks: (B:109:0x0307, B:114:0x033e, B:116:0x0344, B:118:0x036c, B:120:0x0388, B:122:0x038f, B:123:0x0394, B:113:0x0333, B:131:0x03bc, B:133:0x03c7, B:135:0x03cd, B:138:0x03f8, B:139:0x03fb, B:56:0x01a8, B:58:0x01bd, B:60:0x01c3, B:66:0x01cf, B:82:0x021d, B:70:0x01df, B:71:0x01ee, B:73:0x01f4, B:80:0x020e, B:78:0x020a, B:81:0x0216, B:83:0x0225, B:84:0x0236), top: B:155:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b3 A[Catch: all -> 0x03b5, CancellationException -> 0x03f7, TryCatch #2 {CancellationException -> 0x03f7, blocks: (B:91:0x0297, B:93:0x02b3, B:95:0x02b9, B:97:0x02c3, B:98:0x02cc, B:101:0x02d3, B:107:0x02df, B:85:0x025a, B:86:0x0281, B:87:0x0288), top: B:158:0x025a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b9 A[Catch: all -> 0x03b5, CancellationException -> 0x03f7, TryCatch #2 {CancellationException -> 0x03f7, blocks: (B:91:0x0297, B:93:0x02b3, B:95:0x02b9, B:97:0x02c3, B:98:0x02cc, B:101:0x02d3, B:107:0x02df, B:85:0x025a, B:86:0x0281, B:87:0x0288), top: B:158:0x025a }] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v141, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v85, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09QS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
