package X;

import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent$onAwemeChangedAsync$msg$1", f = "IMDetailPageComponent.kt", l = {}, m = "invokeSuspend")
public final class C597090NbP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l>, Object> {
    public final /* synthetic */ IMDetailPageComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597090NbP(IMDetailPageComponent iMDetailPageComponent, InterfaceC1364105Vn<? super C597090NbP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMDetailPageComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597090NbP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9lLJJJ;
        String imMsgId;
        Long lLJIILIIL;
        C1C7U.LIZ("IMDetailPageComponent@9866.onAwemeChangedAsync$msg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme awemeLIZLLL = C729980SkG.LIZLLL(this.LL.So());
        if (awemeLIZLLL != null && (imMsgId = AwemeBizExtKt.getImMsgId(awemeLIZLLL)) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(imMsgId)) != null) {
            c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(lLJIILIIL.longValue());
        } else {
            c869590Y9lLJJJ = null;
        }
        C1C7U.LIZIZ("IMDetailPageComponent@9866.onAwemeChangedAsync$msg$1");
        return c869590Y9lLJJJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
