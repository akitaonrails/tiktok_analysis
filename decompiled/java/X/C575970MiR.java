package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.router.UploadActionInterceptor$buildExtraParams$2", f = "UploadActionInterceptor.kt", l = {553, 560}, m = "invokeSuspend")
public final class C575970MiR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bundle>, Object> {
    public Object LL;
    public AnonymousClass0957 LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ UploadActionInterceptor LLIZ;
    public final /* synthetic */ Bundle LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Context LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C575970MiR(UploadActionInterceptor uploadActionInterceptor, Bundle bundle, long j, String str, Context context, InterfaceC1364105Vn<? super C575970MiR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = uploadActionInterceptor;
        this.LLIZLLLIL = bundle;
        this.LLJ = j;
        this.LLJI = str;
        this.LLJIJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C575970MiR c575970MiR = new C575970MiR(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c575970MiR.LLILZLL = obj;
        return c575970MiR;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bundle> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:158:0x0338, B:205:0x0319], limit reached: 205 */
    /* JADX WARN: Path cross not found for [B:173:0x0393, B:163:0x0351], limit reached: 205 */
    /* JADX WARN: Path cross not found for [B:173:0x0393, B:165:0x035e], limit reached: 205 */
    /* JADX WARN: Path cross not found for [B:203:0x02f1, B:146:0x02fa], limit reached: 205 */
    /* JADX WARN: Path cross not found for [B:205:0x0319, B:158:0x0338], limit reached: 205 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0319 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x03cd -> B:186:0x03e6). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575970MiR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
