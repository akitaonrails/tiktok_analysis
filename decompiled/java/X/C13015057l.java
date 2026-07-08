package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.TemporaryRequestApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.settings.popup.ActivityStatusGuidePopupAckUtils$ack$2", f = "ActivityStatusGuidePopupAckUtils.kt", l = {40}, m = "invokeSuspend")
public final class C13015057l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13015057l(String str, InterfaceC1364105Vn<? super C13015057l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13015057l(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusGuidePopupAckUtils@226f.ack$2");
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
            TemporaryRequestApi.LIZ.getClass();
            TemporaryRequestApi value = C13016057m.LIZIZ.getValue();
            if (value != null) {
                String str = this.LLILLJJLI;
                this.LL = 1;
                if (value.LIZ(null, str, this) == objLJFF) {
                    C1C7U.LIZIZ("ActivityStatusGuidePopupAckUtils@226f.ack$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusGuidePopupAckUtils@226f.ack$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
