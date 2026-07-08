package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogDiffInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftLogHelper$logSaveWithDiff$1", f = "DraftLogHelper.kt", l = {}, m = "invokeSuspend")
public final class C2393109Zh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ DraftSaveResult LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2393109Zh(AwemeDraft awemeDraft, AwemeDraft awemeDraft2, String str, DraftSaveResult draftSaveResult, List<String> list, boolean z, InterfaceC1364105Vn<? super C2393109Zh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = awemeDraft2;
        this.LLILLL = str;
        this.LLILZ = draftSaveResult;
        this.LLILZIL = list;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2393109Zh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LogDiffInfo logDiffInfoLIZ;
        C1C7U.LIZ("DraftLogHelper@46c6.logSaveWithDiff$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            AwemeDraft awemeDraft = this.LL;
            if (awemeDraft != null) {
                logDiffInfoLIZ = C570240MYc.LIZ(awemeDraft, this.LLILLJJLI);
            } else {
                logDiffInfoLIZ = null;
            }
            C570220MYa.LJIIJJI(this.LLILLL, this.LLILZ, logDiffInfoLIZ, this.LLILZIL, Boolean.valueOf(this.LLILZLL), 8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogHelper", "Log save with diff failed", e);
            C570220MYa.LJIIJJI(this.LLILLL, this.LLILZ, null, this.LLILZIL, Boolean.valueOf(this.LLILZLL), 8);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLogHelper@46c6.logSaveWithDiff$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
