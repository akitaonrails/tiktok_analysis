package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$restoreAutoCutTemplate$2$2$1", f = "DraftCreativeRestoreHandler.kt", l = {838}, m = "invokeSuspend")
public final class C537660L6u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AutoCutThemeData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537660L6u(String str, AutoCutThemeData autoCutThemeData, InterfaceC1364105Vn<? super C537660L6u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = autoCutThemeData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C537660L6u c537660L6u = new C537660L6u(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c537660L6u.LLILLJJLI = obj;
        return c537660L6u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                AutoCutThemeData autoCutThemeData = this.LLILZ;
                String str2 = autoCutThemeData.musicId;
                String str3 = autoCutThemeData.musicUrl;
                Boolean bool = autoCutThemeData.musicPostUnavailable;
                this.LL = 1;
                if (C570200MXy.LIZ(str, str2, str3, bool, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$2$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
