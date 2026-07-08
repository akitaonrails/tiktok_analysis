package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl$update$1", f = "DraftFileProviderImpl.kt", l = {}, m = "invokeSuspend")
public final class C821030WIr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftMigrateState LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C821030WIr(DraftMigrateState draftMigrateState, String str, long j, int i, int i2, int i3, String str2, InterfaceC1364105Vn<? super C821030WIr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftMigrateState;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C821030WIr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u<MigrateTaskStatus> taskMutableStatus;
        C1C7U.LIZ("DraftFileProviderImpl@ba82.update$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftMigrateState draftMigrateState = this.LL;
        if (draftMigrateState != null) {
            String str = this.LLILLJJLI;
            long j = this.LLILLL;
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            String str2 = this.LLIZ;
            try {
                if (draftMigrateState == DraftMigrateState.MIGRATED && C123100dR.LIZ(str)) {
                    C0WJA c0wja = C0WJA.LIZ;
                    C821050WIt c821050WIt = C821050WIt.LIZ;
                    Application applicationLIZ = C1BWL.LIZ();
                    c821050WIt.getClass();
                    C0VSJ c0vsj = new C0VSJ(C821050WIt.LIZIZ(applicationLIZ, str));
                    c0wja.getClass();
                    C0WJA.LIZLLL(c0vsj);
                }
                IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null);
                if (iDraftMigrateStateService != null) {
                    iDraftMigrateStateService.updateDraftMigrateState(str, draftMigrateState);
                }
                MigrateDraftStateInfo migrateDraftStateInfo = new MigrateDraftStateInfo(str, C2286608xc.LJFF(j), draftMigrateState, C2286608xc.LJ(i));
                IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
                if (iDraftMigrateFlowService != null && (taskMutableStatus = iDraftMigrateFlowService.getTaskMutableStatus()) != null) {
                    taskMutableStatus.setValue(new MigrateTaskStatus.Progress(migrateDraftStateInfo, i2, i3, str2));
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFileProviderImpl@ba82.update$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
