package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;

/* JADX INFO: renamed from: X.0cJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService", f = "LoadableAutoBackupCampusService.kt", l = {206, 208, 209, 213, 216}, m = "updateCampus")
public final class C1007220cJk extends AbstractC23140094w {
    public Object LL;
    public C338000DMw LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LoadableAutoBackupCampusService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007220cJk(LoadableAutoBackupCampusService loadableAutoBackupCampusService, InterfaceC1364105Vn<? super C1007220cJk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = loadableAutoBackupCampusService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.updateCampus$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.updateCampus$1");
        return objLIZJ;
    }
}
