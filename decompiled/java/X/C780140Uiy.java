package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget$showCardIfNeeded$1", f = "GameRewardsPreviewCardWidget.kt", l = {127, 134, 145, 149, 153}, m = "invokeSuspend")
public final class C780140Uiy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ GameRewardsPreviewCardWidget LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C780140Uiy(GameRewardsPreviewCardWidget gameRewardsPreviewCardWidget, long j, long j2, InterfaceC1364105Vn<? super C780140Uiy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = gameRewardsPreviewCardWidget;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C780140Uiy c780140Uiy = new C780140Uiy(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c780140Uiy.LLILLL = obj;
        return c780140Uiy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780140Uiy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
