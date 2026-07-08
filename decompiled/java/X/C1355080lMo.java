package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355080lMo implements InterfaceC1366490lfD {
    public final /* synthetic */ C1355090lMp LIZ;

    @Override // X.InterfaceC1366490lfD
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
    }

    @Override // X.InterfaceC1366490lfD
    public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
    }

    @Override // X.InterfaceC1366490lfD
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1366490lfD
    public final void LJ(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1366490lfD
    public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
    }

    public C1355080lMo(C1345650l7b c1345650l7b) {
        this.LIZ = c1345650l7b;
    }

    @Override // X.InterfaceC1366490lfD
    public final void LJI(Context context, BaseSharePackage baseSharePackage) {
        String string = baseSharePackage.extras.getString("share_platform", "");
        if (string != null) {
            a0.LJJJIL(string);
        }
    }

    @Override // X.InterfaceC1361850lXj
    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
        C1355090lMp c1355090lMp;
        if (z && (c1355090lMp = this.LIZ) != null) {
            c1355090lMp.LIZ(interfaceC1369790lkX, true, baseSharePackage, context);
        }
    }

    @Override // X.InterfaceC1361850lXj
    public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
