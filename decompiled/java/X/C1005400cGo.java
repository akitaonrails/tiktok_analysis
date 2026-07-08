package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.profile.business.ur.school.datasource.CommitSchoolInfoAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService$updateSchoolInfo$2", f = "LoadableAutoBackupCampusService.kt", l = {255}, m = "invokeSuspend")
public final class C1005400cGo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ LoadableAutoBackupCampusService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005400cGo(int i, String str, Integer num, String str2, String str3, LoadableAutoBackupCampusService loadableAutoBackupCampusService, InterfaceC1364105Vn<? super C1005400cGo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = num;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = loadableAutoBackupCampusService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005400cGo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadableAutoBackupCampusService@ea34.updateSchoolInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1227904rF c1227904rF = C1227904rF.LIZ;
            CommitSchoolInfoAPI.CommitSchoolInfo commitSchoolInfo = new CommitSchoolInfoAPI.CommitSchoolInfo(C2286608xc.LJ(this.LLILLJJLI), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(commitSchoolInfo);
            if (strLJI != null) {
                CommitSchoolInfoAPI commitSchoolInfoAPI = (CommitSchoolInfoAPI) this.LLIZ.LIZJ.getValue();
                this.LL = 1;
                obj = commitSchoolInfoAPI.updateSchoolInfo(strLJI, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.updateSchoolInfo$2");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("LoadableAutoBackupCampusService@ea34.updateSchoolInfo$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
