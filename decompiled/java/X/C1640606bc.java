package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.push.DMPushInlineMsgProtocol$DMPushInlineMsgHandler$createActionClickHandler$1$onClickAction$1$callBack$1$1", f = "DMPushInlineMsgProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1640606bc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640606bc(String str, InterfaceC1364105Vn<? super C1640606bc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640606bc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJJLIIIJ;
        C1C7U.LIZ("DMPushInlineMsgProtocol$DMPushInlineMsgHandler@7187.createActionClickHandler$1$onClickAction$1$callBack$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C19296410eQ c19296410eQ = C19296410eQ.LIZIZ;
            if (C06NU.LIZ()) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("im_push", this.LL), ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = this.LL;
            }
            c19296410eQ.batchSetPushSettingItems(strLJJLIIIJ, 1, false, null, null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMPushInlineMsgProtocol$DMPushInlineMsgHandler@7187.createActionClickHandler$1$onClickAction$1$callBack$1$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DMPushInlineMsgProtocol$DMPushInlineMsgHandler@7187.createActionClickHandler$1$onClickAction$1$callBack$1$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
