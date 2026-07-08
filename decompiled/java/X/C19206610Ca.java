package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19206610Ca implements C10DS {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ Function1<Integer, Unit> LIZIZ;
    public final /* synthetic */ C19207010Ce LIZJ;

    @Override // X.C10DS
    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushPermissionDialogRule onNotShow reason: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[JSB]");
        Function1<Integer, Unit> function1 = this.LIZIZ;
        this.LIZJ.getClass();
        function1.invoke(Integer.valueOf(C19207010Ce.LJ(str)));
    }

    @Override // X.C10DS
    public final void onShow(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushPermissionDialogRule onShow popupType: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[JSB]");
    }

    @Override // X.C10DS
    public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushPermissionDialogRule onDismissAfterShown popupType: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(abstractC343940De4);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[JSB]");
        if (this.LIZ != 1 && Intrinsics.LJFF(abstractC343940De4, C10CX.LIZ) && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131833471);
            c1389890mGx.LJIIJJI();
        }
        this.LIZIZ.invoke(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19206610Ca(int i, Function1<? super Integer, Unit> function1, C19207010Ce c19207010Ce) {
        this.LIZ = i;
        this.LIZIZ = function1;
        this.LIZJ = c19207010Ce;
    }
}
