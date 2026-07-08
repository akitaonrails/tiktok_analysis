package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;

/* JADX INFO: renamed from: X.0cJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService", f = "LoadableAutoBackupCampusService.kt", l = {225, 228, 229}, m = "deleteCampus")
public final class C1007200cJi extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LoadableAutoBackupCampusService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007200cJi(LoadableAutoBackupCampusService loadableAutoBackupCampusService, InterfaceC1364105Vn<? super C1007200cJi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = loadableAutoBackupCampusService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.deleteCampus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.deleteCampus$1");
        return objLJ;
    }
}
