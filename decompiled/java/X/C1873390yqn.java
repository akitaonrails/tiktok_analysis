package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873390yqn extends AbstractC1873350yqj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        boolean zBooleanValue;
        InterfaceC1873380yqm interfaceC1873380yqm = (InterfaceC1873380yqm) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL == null) {
            C2382909Vj.LIZ(completionBlock, 0, "activity ref is released!", null, 4);
            return;
        }
        String title = interfaceC1873380yqm.getTitle();
        String notes = interfaceC1873380yqm.getNotes();
        long jLongValue = interfaceC1873380yqm.getStartDate().longValue();
        long jLongValue2 = interfaceC1873380yqm.getEndDate().longValue();
        String repeatFrequency = interfaceC1873380yqm.getRepeatFrequency();
        int iIntValue = interfaceC1873380yqm.getRepeatInterval().intValue();
        int iIntValue2 = interfaceC1873380yqm.getRepeatCount().intValue();
        Boolean allDay = interfaceC1873380yqm.getAllDay();
        if (allDay != null) {
            zBooleanValue = allDay.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1906210zhj c1906210zhj = new C1906210zhj(title, notes, jLongValue, jLongValue2, repeatFrequency, iIntValue, iIntValue2, zBooleanValue, interfaceC1873380yqm.getDaysOfTheWeek());
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 == null || interfaceC634840OvC2.getContext() == null) {
            return;
        }
        if (C1906200zhi.LIZ(new C1906200zhi(), c1906210zhj, activityLIZLLL)) {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1873360yqk.class, null), "");
        } else {
            completionBlock.onFailure(0, "System calendar app is not installed", null);
        }
    }
}
