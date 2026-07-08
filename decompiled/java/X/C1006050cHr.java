package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0cHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService$getCampus$2", f = "LoadableAutoBackupCampusService.kt", l = {}, m = "invokeSuspend")
public final class C1006050cHr extends C09AX implements InterfaceC1631620sYq<C338000DMw, C338000DMw, InterfaceC1364105Vn<? super C338000DMw>, Object> {
    public /* synthetic */ C338000DMw LL;
    public /* synthetic */ C338000DMw LLILLJJLI;

    public C1006050cHr(InterfaceC1364105Vn<? super C1006050cHr> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.getCampus$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C338000DMw c338000DMw = this.LL;
        C338000DMw c338000DMw2 = this.LLILLJJLI;
        if (c338000DMw2 != null) {
            c338000DMw = c338000DMw2;
        }
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.getCampus$2");
        return c338000DMw;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C338000DMw c338000DMw, C338000DMw c338000DMw2, InterfaceC1364105Vn<? super C338000DMw> interfaceC1364105Vn) {
        C1006050cHr c1006050cHr = new C1006050cHr(interfaceC1364105Vn);
        c1006050cHr.LL = c338000DMw;
        c1006050cHr.LLILLJJLI = c338000DMw2;
        return c1006050cHr.invokeSuspend(Unit.LIZ);
    }
}
