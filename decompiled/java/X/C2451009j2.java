package X;

import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent$actionsBeforeUpdateUI$1$observable$1", f = "HeaderCTAMessageComponent.kt", l = {}, m = "invokeSuspend")
public final class C2451009j2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EventLiveData<FollowStatus>>, Object> {
    public C2451009j2(InterfaceC1364105Vn<? super C2451009j2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2451009j2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeaderCTAMessageComponent@5ff2.actionsBeforeUpdateUI$1$observable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        C1C7U.LIZIZ("HeaderCTAMessageComponent@5ff2.actionsBeforeUpdateUI$1$observable$1");
        return relationObservable;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EventLiveData<FollowStatus>> interfaceC1364105Vn) {
        return new C2451009j2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
