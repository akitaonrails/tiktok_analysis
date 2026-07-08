package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.analytics.InternalVideoShareAnalytics$sendShareVideoToChat$1", f = "InternalVideoShareAnalytics.kt", l = {1116}, m = "invokeSuspend")
public final class C1364600lcA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2344009Gk LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public Object LLJILJILJ;
    public IMContact LLJILLL;
    public Object LLJJ;
    public Object LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final /* synthetic */ SharePackage LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ List<IMContact> LLJJJIL;
    public final /* synthetic */ long LLJJJJ;
    public final /* synthetic */ int LLJJJJJIL;
    public final /* synthetic */ InterfaceC1493105sv LLJJJJLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1364600lcA(SharePackage sharePackage, String str, List<? extends IMContact> list, long j, int i, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1364600lcA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJJIJIL = sharePackage;
        this.LLJJJ = str;
        this.LLJJJIL = list;
        this.LLJJJJ = j;
        this.LLJJJJJIL = i;
        this.LLJJJJLIIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364600lcA(this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x023a -> B:121:0x02b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x026b -> B:128:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x027b -> B:128:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x027d -> B:128:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02ae -> B:128:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0223 -> B:122:0x02bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:92:0x022a
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
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364600lcA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
