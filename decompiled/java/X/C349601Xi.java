package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.repo.DMSocPubStatusRepositoryImpl$requestInIOThread$1", f = "DMSocPubStatusRepository.kt", l = {40}, m = "invokeSuspend")
public final class C349601Xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2329309At<StoryStatusResponse> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C349601Xi(InterfaceC2329309At<StoryStatusResponse> interfaceC2329309At, List<String> list, InterfaceC1364105Vn<? super C349601Xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2329309At;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C349601Xi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLJIILIIL = obj;
        C1C7U.LIZ("DMSocPubStatusRepositoryImpl@5689.requestInIOThread$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJIILIIL);
            } else {
                C155000ia.LIZIZ(objLJIILIIL);
                List<String> list = this.LLILLL;
                C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                boolean zLIZ = C298480Bmw.LIZ();
                this.LL = 1;
                objLJIILIIL = c1605650rsx.LJIILIIL(strLIZIZ, zLIZ, "[DM]", this);
                if (objLJIILIIL == objLJFF) {
                    C1C7U.LIZIZ("DMSocPubStatusRepositoryImpl@5689.requestInIOThread$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StoryStatusResponse) objLJIILIIL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (this.LLILLJJLI.isDisposed()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMSocPubStatusRepositoryImpl@5689.requestInIOThread$1");
            return unit;
        }
        if (c098200Yq != null) {
            this.LLILLJJLI.onSuccess((StoryStatusResponse) c098200Yq);
        } else {
            C2286608xc.LJ(Log.w("DMNowStatusRepositoryImpl", "requestSocPubStatus: response is null"));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMSocPubStatusRepositoryImpl@5689.requestInIOThread$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
