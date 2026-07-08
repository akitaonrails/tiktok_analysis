package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.EditorProAIGCChooseResultImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.09mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.EditorProAIGCChooseResultImpl$onChosenResult$1", f = "EditorProAIGCChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C2472509mV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EditorProAIGCChooseResultImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2472509mV(EditorProAIGCChooseResultImpl editorProAIGCChooseResultImpl, String str, String str2, InterfaceC1364105Vn<? super C2472509mV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = editorProAIGCChooseResultImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2472509mV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Pair<String, Long> pairLJI;
        C1C7U.LIZ("EditorProAIGCChooseResultImpl@19a2.onChosenResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditorProAIGCChooseResultImpl editorProAIGCChooseResultImpl = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        editorProAIGCChooseResultImpl.getClass();
        try {
            pairLJI = C2471909mP.LIZ.LJI(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (pairLJI != null) {
            C2259271Dbp c2259271Dbp = new C2259271Dbp(str2);
            String first = pairLJI.getFirst();
            long jLongValue = pairLJI.getSecond().longValue();
            String strEncodeToString = Base64.encodeToString(first.getBytes(Charsets.LIZJ), 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strEncodeToString);
            sbLIZ.append(';');
            sbLIZ.append(jLongValue);
            c2259271Dbp.LJJ(C2188811AlT.LIZIZ(sbLIZ));
            c2259271Dbp.LJIJJLI();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCChooseResultImpl@19a2.onChosenResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
