package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper$parallelDownloadTasks$2", f = "ReplaceDownloadHelper.kt", l = {556, 566, 576, 586}, m = "invokeSuspend")
public final class C1403005eO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1403205eQ>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Aweme LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ C14DL LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C1510705vl LLJIJIL;
    public final /* synthetic */ Context LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1403005eO(Aweme aweme, C14DL c14dl, String str, List<String> list, String str2, C1510705vl c1510705vl, Context context, InterfaceC1364105Vn<? super C1403005eO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = aweme;
        this.LLIZ = c14dl;
        this.LLIZLLLIL = str;
        this.LLJ = list;
        this.LLJI = str2;
        this.LLJIJIL = c1510705vl;
        this.LLJILJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1403005eO c1403005eO = new C1403005eO(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1403005eO.LLILZIL = obj;
        return c1403005eO;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|2|(1:97)|(1:(1:(1:(1:(8:8|101|76|77|82|(1:(1:85))(1:88)|86|87)(2:9|10))(13:11|62|63|66|(1:(1:69)(1:70))(1:71)|99|72|(2:74|75)|77|82|(0)(0)|86|87))(19:12|93|46|47|52|(1:(1:55)(1:56))(1:57)|58|(2:60|61)|63|66|(0)(0)|99|72|(0)|77|82|(0)(0)|86|87))(3:13|95|23))(6:14|(1:16)(1:18)|17|91|19|(2:21|22))|24|29|(1:(1:32)(3:33|(1:39)|40))(1:41)|89|42|(2:44|45)|47|52|(0)(0)|58|(0)|63|66|(0)(0)|99|72|(0)|77|82|(0)(0)|86|87) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:0|2|97|(1:(1:(1:(1:(8:8|101|76|77|82|(1:(1:85))(1:88)|86|87)(2:9|10))(13:11|62|63|66|(1:(1:69)(1:70))(1:71)|99|72|(2:74|75)|77|82|(0)(0)|86|87))(19:12|93|46|47|52|(1:(1:55)(1:56))(1:57)|58|(2:60|61)|63|66|(0)(0)|99|72|(0)|77|82|(0)(0)|86|87))(3:13|95|23))(6:14|(1:16)(1:18)|17|91|19|(2:21|22))|24|29|(1:(1:32)(3:33|(1:39)|40))(1:41)|89|42|(2:44|45)|47|52|(0)(0)|58|(0)|63|66|(0)(0)|99|72|(0)|77|82|(0)(0)|86|87) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0172, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [X.04l4] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.04l4] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.04l4] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.04l4] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403005eO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1403205eQ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
