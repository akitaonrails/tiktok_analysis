package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01mY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$notifyMsgLikeFeedback$1$2$2$1", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C434401mY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C434401mY(InterfaceC1364105Vn<? super C434401mY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434401mY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Fragment fragmentLIZLLL;
        String string;
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.notifyMsgLikeFeedback$1$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL()) != null) {
            Context context = fragmentLIZLLL.getContext();
            if (context != null) {
                string = context.getString(2131846297);
            } else {
                string = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgLikeFeedback$1$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C434401mY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
