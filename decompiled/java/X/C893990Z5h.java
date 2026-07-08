package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;

/* JADX INFO: renamed from: X.0Z5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893990Z5h implements InterfaceC867020Xzo<String> {
    public final /* synthetic */ C0Y8T LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC867020Xzo
    public final void LIZ(C868810Y6l<String> c868810Y6l) throws Throwable {
        C894010Z5j.LIZIZ.LIZ(this.LIZ, c868810Y6l.LIZJ, 0);
        Activity activity = this.LIZIZ;
        if (activity != null) {
            C2204961BRm.LJIILIIL(activity, 2097, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqqqQyXibIdNQBMtbS4OCaxpNdOWQDCnm/TJaw/GsPnM4=", null));
            activity.finish();
        }
        C1440005kM.LIZ(new C0HYH());
    }

    @Override // X.InterfaceC867020Xzo
    public final void LIZIZ(C0Y00 c0y00) {
        C742250T9r c742250T9r = c0y00.LIZIZ;
        C0YMW c0ymw = c0y00.LIZ;
        C1440005kM.LIZ(new C893940Z5c(false));
        C894010Z5j.LIZIZ.LIZ(this.LIZ, c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    public C893990Z5h(C0Y8T c0y8t, Activity activity) {
        this.LIZ = c0y8t;
        this.LIZIZ = activity;
    }
}
