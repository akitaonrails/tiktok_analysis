package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl$showRemoveOffPopup$1$props$1", f = "PrivacyServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C751180TdM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RemoveOffProps>, Object> {
    public C751180TdM(InterfaceC1364105Vn<? super C751180TdM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751180TdM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RemoveOffProps removeOffPropsLJIJJ;
        C1C7U.LIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1$props$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService != null) {
            removeOffPropsLJIJJ = iPrivacySettingAPIService.LJIJJ();
        } else {
            removeOffPropsLJIJJ = null;
        }
        C1C7U.LIZIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1$props$1");
        return removeOffPropsLJIJJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RemoveOffProps> interfaceC1364105Vn) {
        return new C751180TdM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
