package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCenterVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2019107vZ extends C2217421BqW implements Function1<InterfaceC1874007Vq, Unit> {
    public C2019107vZ(Object obj) {
        super(1, obj, PrivacyCenterVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/PrivacyCenterCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1874007Vq interfaceC1874007Vq) {
        Activity activityLIZ;
        InterfaceC1874007Vq interfaceC1874007Vq2 = interfaceC1874007Vq;
        this.receiver.getClass();
        if (interfaceC1874007Vq2 instanceof C1873907Vp) {
            Context context = ((C1873907Vp) interfaceC1874007Vq2).LIZ;
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C0TTZ.LIZ.getClass();
                C0TTZ.LIZIZ(activityLIZ);
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
