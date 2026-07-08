package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0lP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareDMAssem$panelModelCallback$2$1$onLoadComplete$1", f = "MixStudioShareDMAssem.kt", l = {}, m = "invokeSuspend")
public final class C1356530lP9 extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, Object> {
    public final /* synthetic */ List<IMContact> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1356530lP9(List<? extends IMContact> list, InterfaceC1364105Vn<? super C1356530lP9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356530lP9(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AbstractC595720NYc> listLIZ;
        C1C7U.LIZ("MixStudioShareDMAssem@5d55.panelModelCallback$2$1$onLoadComplete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IActiveStatusObserverProducer.LIZ.getClass();
        IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
        if (iActiveStatusObserverProducerLIZ == null || (listLIZ = iActiveStatusObserverProducerLIZ.LIZ(this.LL)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("MixStudioShareDMAssem@5d55.panelModelCallback$2$1$onLoadComplete$1");
        return listLIZ;
    }
}
