package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS21S2200000_14;
import kotlin.jvm.internal.AwS9S3300000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.AIGroupShotSender$initiateProcess$2$onSuccess$1", f = "AIGroupShotSender.kt", l = {177, 201}, m = "invokeSuspend")
public final class C912020ZqC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AbstractC912050ZqF LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C912060ZqG LLILZIL;
    public Function1 LLILZLL;
    public EnumC900350ZTt LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public AwS21S2200000_14 LLJI;
    public AwS9S3300000_14 LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final /* synthetic */ AbstractC912050ZqF LLJILLL;
    public final /* synthetic */ List<String> LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ C912060ZqG LLJJIJI;
    public final /* synthetic */ Function1<String, String> LLJJIJIIJIL;
    public final /* synthetic */ EnumC900350ZTt LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C912020ZqC(AbstractC912050ZqF abstractC912050ZqF, List<String> list, String str, String str2, C912060ZqG c912060ZqG, Function1<? super String, String> function1, EnumC900350ZTt enumC900350ZTt, InterfaceC1364105Vn<? super C912020ZqC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILLL = abstractC912050ZqF;
        this.LLJJ = list;
        this.LLJJI = str;
        this.LLJJIII = str2;
        this.LLJJIJI = c912060ZqG;
        this.LLJJIJIIJIL = function1;
        this.LLJJIJIL = enumC900350ZTt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912020ZqC(this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:118:0x029d, B:121:0x02a2], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:121:0x02a2, B:118:0x029d], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:63:0x01bb, B:66:0x01c0], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:66:0x01c0, B:63:0x01bb], limit reached: 190 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029d A[Catch: Exception -> 0x02b1, TryCatch #9 {Exception -> 0x02b1, blocks: (B:111:0x0276, B:115:0x0288, B:116:0x028e, B:118:0x029d, B:124:0x02a7, B:125:0x02ac), top: B:166:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a7 A[Catch: Exception -> 0x02b1, TryCatch #9 {Exception -> 0x02b1, blocks: (B:111:0x0276, B:115:0x0288, B:116:0x028e, B:118:0x029d, B:124:0x02a7, B:125:0x02ac), top: B:166:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ac A[Catch: Exception -> 0x02b1, TRY_LEAVE, TryCatch #9 {Exception -> 0x02b1, blocks: (B:111:0x0276, B:115:0x0288, B:116:0x028e, B:118:0x029d, B:124:0x02a7, B:125:0x02ac), top: B:166:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:56:0x0194, B:60:0x01a6, B:61:0x01ac, B:63:0x01bb, B:69:0x01c5, B:70:0x01ca), top: B:148:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:56:0x0194, B:60:0x01a6, B:61:0x01ac, B:63:0x01bb, B:69:0x01c5, B:70:0x01ca), top: B:148:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca A[Catch: Exception -> 0x01cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cf, blocks: (B:56:0x0194, B:60:0x01a6, B:61:0x01ac, B:63:0x01bb, B:69:0x01c5, B:70:0x01ca), top: B:148:0x0194 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02a7 -> B:15:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02ac -> B:15:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01c5 -> B:15:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ca -> B:15:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d6 -> B:15:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:107:0x026b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912020ZqC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
