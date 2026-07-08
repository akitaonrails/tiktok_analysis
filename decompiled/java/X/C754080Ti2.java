package X;

import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ti2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.privacy.setting.prompt.removeoff.RemoveOffPopupManager$tryToShowRemoveOffPopup$1$props$1", f = "RemoveOffPopupManager.kt", l = {}, m = "invokeSuspend")
public final class C754080Ti2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RemoveOffProps>, Object> {
    public C754080Ti2(InterfaceC1364105Vn<? super C754080Ti2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754080Ti2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1$props$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C108O.LIZ.getClass();
        RemoveOffProps removeOffPropsLIZ = C108O.LIZ();
        C1C7U.LIZIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1$props$1");
        return removeOffPropsLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RemoveOffProps> interfaceC1364105Vn) {
        return new C754080Ti2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
