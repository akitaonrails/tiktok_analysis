package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot$scheduleAutoRetry$1", f = "StoreStickerCardProtocol.kt", l = {860}, m = "invokeSuspend")
public final class C314880CVy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ StoreStickerCardReusedUISlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314880CVy(long j, StoreStickerCardReusedUISlot storeStickerCardReusedUISlot, InterfaceC1364105Vn<? super C314880CVy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = storeStickerCardReusedUISlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314880CVy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreStickerCardReusedUISlot@d4f2.scheduleAutoRetry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("StoreStickerCardReusedUISlot@d4f2.scheduleAutoRetry$1");
                return objLJFF;
            }
        }
        this.LLILLL.sp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreStickerCardReusedUISlot@d4f2.scheduleAutoRetry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
