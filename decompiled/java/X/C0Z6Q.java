package X;

import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6Q implements InterfaceC867020Xzo<C0YAE> {
    public final /* synthetic */ GroupDetailViewModel LIZ;
    public final /* synthetic */ Function0<Unit> LIZIZ;

    @Override // X.InterfaceC867020Xzo
    public final void LIZ(C868810Y6l<C0YAE> c868810Y6l) {
        C0Z6P.LIZIZ.LIZ(this.LIZ.wQ2(), c868810Y6l.LIZJ, 0);
        Function0<Unit> function0 = this.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC867020Xzo
    public final void LIZIZ(C0Y00 c0y00) {
        C742250T9r c742250T9r = c0y00.LIZIZ;
        C0YMW c0ymw = c0y00.LIZ;
        C0Z6P.LIZIZ.LIZ(this.LIZ.wQ2(), c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    public C0Z6Q(GroupDetailViewModel groupDetailViewModel, Function0<Unit> function0) {
        this.LIZ = groupDetailViewModel;
        this.LIZIZ = function0;
    }
}
