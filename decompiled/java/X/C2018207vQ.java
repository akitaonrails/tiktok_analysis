package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SignUpVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2018207vQ extends C2217421BqW implements Function1<C07W3, Unit> {
    public C2018207vQ(Object obj) {
        super(1, obj, SignUpVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/SignUpCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07W3 c07w3) {
        C07W3 c07w32 = c07w3;
        this.receiver.getClass();
        if (c07w32 instanceof C07W2) {
            Activity activityLIZ = C1388190mED.LIZ(((C07W2) c07w32).LIZ);
            if (activityLIZ != null) {
                C0XPD.LIZIZ(activityLIZ, "settings_page", "click_setting", null, new C2501709rD(activityLIZ, 0));
                C2018307vR.LIZ.getClass();
                C2018307vR.LIZ("settings_page", "click_setting");
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
