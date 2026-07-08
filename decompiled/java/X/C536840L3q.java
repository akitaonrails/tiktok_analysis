package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleChallengeId$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C536840L3q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EditConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536840L3q(EditConfig editConfig, InterfaceC1364105Vn<? super C536840L3q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = editConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536840L3q(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("EditServiceImpl@7fc6.handleChallengeId$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            EditConfig editConfig = this.LL;
            List<String> challengeIds = editConfig.getChallengeIds();
            if (challengeIds != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(challengeIds, 10));
                for (String str : challengeIds) {
                    arrayList.add(C194463116f.LIZJ(str, false));
                }
            } else {
                arrayList = null;
            }
            editConfig.setChallenges(arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditServiceImpl@7fc6.handleChallengeId$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
