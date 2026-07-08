package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.159d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$showCardIfNeeded$1$4$job$1", f = "EcLiveProductCard.kt", l = {278}, m = "invokeSuspend")
public final class C204731159d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C212206182q LLILZLL;
    public final /* synthetic */ LiveRoomStruct LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204731159d(C212206182q c212206182q, LiveRoomStruct liveRoomStruct, int i, long j, InterfaceC1364105Vn<? super C204731159d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c212206182q;
        this.LLIZ = liveRoomStruct;
        this.LLIZLLLIL = i;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204731159d(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204731159d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
