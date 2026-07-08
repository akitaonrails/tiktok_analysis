package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS90S0110000_2;
import njp.a;

/* JADX INFO: renamed from: X.05zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$notifyMsgDislikeFeedback$1$7", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C1536605zw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536605zw(Context context, InterfaceC1364105Vn<? super C1536605zw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536605zw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context contextLIZIZ = this.LL;
        if (contextLIZIZ == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1$7");
            return unit;
        }
        C888370Yt9.LIZ.getClass();
        C1503105uX.LIZ(new AwS90S0110000_2(contextLIZIZ, true, 4));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1$7");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
