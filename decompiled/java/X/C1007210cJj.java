package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;

/* JADX INFO: renamed from: X.0cJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService", f = "LoadableAutoBackupCampusService.kt", l = {182, 193, 196}, m = "createCampus")
public final class C1007210cJj extends AbstractC23140094w {
    public Object LL;
    public C338000DMw LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LoadableAutoBackupCampusService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007210cJj(LoadableAutoBackupCampusService loadableAutoBackupCampusService, InterfaceC1364105Vn<? super C1007210cJj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = loadableAutoBackupCampusService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.createCampus$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, null, null, null, this);
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.createCampus$1");
        return objLJII;
    }
}
