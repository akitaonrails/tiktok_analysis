package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateResult;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl$update$2", f = "DraftFileProviderImpl.kt", l = {}, m = "invokeSuspend")
public final class C821020WIq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MigrateResult LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Uri LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C821020WIq(MigrateResult migrateResult, String str, boolean z, int i, int i2, int i3, String str2, Uri uri, InterfaceC1364105Vn<? super C821020WIq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = migrateResult;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = str2;
        this.LLJ = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C821020WIq c821020WIq = new C821020WIq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c821020WIq.LL = obj;
        return c821020WIq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        InterfaceC332260D0u<MigrateTaskStatus> taskMutableStatus;
        boolean z2;
        InterfaceC332260D0u<MigrateTaskStatus> taskMutableStatus2;
        C1C7U.LIZ("DraftFileProviderImpl@ba82.update$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MigrateResult migrateResult = this.LLILLJJLI;
        String str = this.LLILLL;
        boolean z3 = this.LLILZ;
        int i = this.LLILZIL;
        int i2 = this.LLILZLL;
        int i3 = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        Uri uri = this.LLJ;
        try {
            if (migrateResult != null) {
                IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
                if (iDraftMigrateFlowService != null && (taskMutableStatus2 = iDraftMigrateFlowService.getTaskMutableStatus()) != null) {
                    taskMutableStatus2.setValue(new MigrateTaskStatus.Completed(migrateResult));
                }
            } else {
                if (z3) {
                    z = true;
                } else {
                    z = false;
                }
                MigrateResult migrateResult2 = new MigrateResult(str, z, i, i2, i3, str2, null, null, 0L, 448, null);
                IDraftMigrateFlowService iDraftMigrateFlowService2 = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
                if (iDraftMigrateFlowService2 != null && (taskMutableStatus = iDraftMigrateFlowService2.getTaskMutableStatus()) != null) {
                    taskMutableStatus.setValue(new MigrateTaskStatus.Completed(migrateResult2));
                }
            }
            StringBuilder sb = new StringBuilder("update: ");
            sb.append(uri);
            sb.append(", CODE_DRAFT_MIGRATE_COMPETED,isSuccess = ");
            if (z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            C0WJO.LIZIZ("verify", sb.toString());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFileProviderImpl@ba82.update$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
