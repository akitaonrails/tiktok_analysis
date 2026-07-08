package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel$syncCommentToDmSettingFromServer$1", f = "NotificationFragmentV2ViewModel.kt", l = {198}, m = "invokeSuspend")
public final class C05RZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05RZ(InterfaceC1364105Vn<? super C05RZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05RZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NotificationFragmentV2ViewModel@a7ac.syncCommentToDmSettingFromServer$1");
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
            IMContactApi.LIZ.getClass();
            InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
            EnumC1725606pK enumC1725606pK = EnumC1725606pK.COMMENT_TO_DM;
            this.LL = 1;
            if (interfaceC15516065qLIZJ.LIZIZ(enumC1725606pK, null, null, this) == objLJFF) {
                C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.syncCommentToDmSettingFromServer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.syncCommentToDmSettingFromServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05RZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
