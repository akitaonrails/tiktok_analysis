package X;

import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomFixedEntrance;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomFixedEntrance$onViewCreated$1", f = "TakoRightBottomInCellEntrance.kt", l = {}, m = "invokeSuspend")
public final class C709600RsU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoRightBottomFixedEntrance LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709600RsU(TakoRightBottomFixedEntrance takoRightBottomFixedEntrance, InterfaceC1364105Vn<? super C709600RsU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoRightBottomFixedEntrance;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C709600RsU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C709600RsU.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
