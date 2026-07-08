package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;

/* JADX INFO: renamed from: X.0cJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService", f = "LoadableAutoBackupCampusService.kt", l = {144}, m = "getCurrentCampusFromAPI")
public final class C1007190cJh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LoadableAutoBackupCampusService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007190cJh(LoadableAutoBackupCampusService loadableAutoBackupCampusService, InterfaceC1364105Vn<? super C1007190cJh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = loadableAutoBackupCampusService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.getCurrentCampusFromAPI$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.getCurrentCampusFromAPI$1");
        return objLIZ;
    }
}
