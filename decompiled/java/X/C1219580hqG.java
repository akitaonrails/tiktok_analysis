package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219580hqG implements InterfaceC867020Xzo<C0YAE> {
    public final /* synthetic */ ManageAdminViewModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Context LIZJ;

    @Override // X.InterfaceC867020Xzo
    public final void LIZ(C868810Y6l<C0YAE> c868810Y6l) {
        ArrayList arrayList = new ArrayList(this.LIZ.getState().LL);
        String str = this.LIZIZ;
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C1218270ho9) it2.next()).LL.getUid(), str)) {
                if (i != -1) {
                    C0Z6P.LIZIZ.LIZ(this.LIZ.vQ2().LL, c868810Y6l.LIZJ, 0);
                    ListProtector.remove(arrayList, i);
                    if (Intrinsics.LJFF(this.LIZIZ, C461720I8s.LIZIZ())) {
                        this.LIZ.setState(new AwS385S0200000_19(this.LIZJ, arrayList, 145));
                    } else {
                        this.LIZ.setState(new AwS385S0200000_19(this.LIZJ, arrayList, 146));
                    }
                    C1528205ya.LIZJ.LJII("admin_remove_button", C0Z9N.ORDINARY.getValue(), Collections.singletonList(this.LIZIZ), this.LIZ.vQ2().LL, C0I0B.LJFF.LIZIZ());
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.InterfaceC867020Xzo
    public final void LIZIZ(C0Y00 c0y00) {
        C742250T9r c742250T9r = c0y00.LIZIZ;
        C0YMW c0ymw = c0y00.LIZ;
        C0Z6P.LIZIZ.LIZ(this.LIZ.vQ2().LL, c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
        if (c0ymw != null) {
            c0ymw.getStatusMsg();
        }
        this.LIZ.setState(new AwS598S0100000_19(this.LIZJ, 882));
    }

    public C1219580hqG(Context context, ManageAdminViewModel manageAdminViewModel, String str) {
        this.LIZ = manageAdminViewModel;
        this.LIZIZ = str;
        this.LIZJ = context;
    }
}
