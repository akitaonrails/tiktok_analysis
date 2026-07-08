package X;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl$update$4", f = "DraftFileProviderImpl.kt", l = {}, m = "invokeSuspend")
public final class C821010WIp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ContentValues LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C821010WIp(Map<String, String> map, Uri uri, String str, ContentValues contentValues, InterfaceC1364105Vn<? super C821010WIp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = uri;
        this.LLILZ = str;
        this.LLILZIL = contentValues;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C821010WIp c821010WIp = new C821010WIp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c821010WIp.LL = obj;
        return c821010WIp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u<MigrateTaskStatus> taskMutableStatus;
        C1C7U.LIZ("DraftFileProviderImpl@ba82.update$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> map = this.LLILLJJLI;
        Uri uri = this.LLILLL;
        String str = this.LLILZ;
        ContentValues contentValues = this.LLILZIL;
        try {
            IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null);
            if (iDraftMigrateStateService != null) {
                IDraftMigrateStateService.DefaultImpls.updateDraftMigrateInfos$default(iDraftMigrateStateService, map, false, 2, null);
            }
            IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
            if (iDraftMigrateFlowService != null && (taskMutableStatus = iDraftMigrateFlowService.getTaskMutableStatus()) != null) {
                taskMutableStatus.setValue(MigrateTaskStatus.Started.INSTANCE);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update: ");
            sbLIZ.append(uri);
            sbLIZ.append(", selection = ");
            sbLIZ.append(str);
            sbLIZ.append(", values = ");
            sbLIZ.append(contentValues);
            C0WJO.LIZJ("verify", C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFileProviderImpl@ba82.update$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
