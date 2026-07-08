package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule$doFirstHoopPreconnect$2", f = "CommerceLandPageRealtimeResourceModule.kt", l = {578}, m = "invokeSuspend")
public final class C1016840cZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceLandPageRealtimeResourceModule LLILLJJLI;
    public final /* synthetic */ AwemeRawAd LLILLL;
    public final /* synthetic */ InterfaceC1040510dBR LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1016840cZG(CommerceLandPageRealtimeResourceModule commerceLandPageRealtimeResourceModule, AwemeRawAd awemeRawAd, InterfaceC1040510dBR interfaceC1040510dBR, String str, InterfaceC1364105Vn<? super C1016840cZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceLandPageRealtimeResourceModule;
        this.LLILLL = awemeRawAd;
        this.LLILZ = interfaceC1040510dBR;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1016840cZG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r5 != null) goto L39;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016840cZG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
