package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1874, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.controller.AuctionBidderInfoController$setData$3", f = "AuctionBidderInfoController.kt", l = {112, 133}, m = "invokeSuspend")
public final class AnonymousClass1874 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public AnonymousClass1873 LLILLJJLI;
    public AnonymousClass1872 LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ List<Integer> LLIZLLLIL;
    public final /* synthetic */ AnonymousClass1873 LLJ;
    public final /* synthetic */ AnonymousClass1872 LLJI;
    public final /* synthetic */ long LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1874(int i, List<Integer> list, AnonymousClass1873 anonymousClass1873, AnonymousClass1872 anonymousClass1872, long j, InterfaceC1364105Vn<? super AnonymousClass1874> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = i;
        this.LLIZLLLIL = list;
        this.LLJ = anonymousClass1873;
        this.LLJI = anonymousClass1872;
        this.LLJIJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1874(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:7:0x001f, B:46:0x00e1, B:43:0x00d3, B:45:0x00d7, B:48:0x00e7, B:11:0x0038), top: B:69:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:26:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:72:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d7 -> B:46:0x00e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1874.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
