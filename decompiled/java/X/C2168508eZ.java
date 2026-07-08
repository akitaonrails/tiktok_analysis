package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.helper.AlertToneDataFetcher$getConversationSelectedTone$2", f = "AlertToneDataFetcher.kt", l = {142}, m = "invokeSuspend")
public final class C2168508eZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C891050YxT LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168508eZ(C891050YxT c891050YxT, String str, InterfaceC1364105Vn<? super C2168508eZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c891050YxT;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2168508eZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AlertToneDataFetcher@3ccc.getConversationSelectedTone$2");
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
                C891050YxT c891050YxT = this.LLILLJJLI;
                String str2 = this.LLILLL;
                this.LL = 1;
                obj = c891050YxT.LIZJ(str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AlertToneDataFetcher@3ccc.getConversationSelectedTone$2");
                    return objLJFF;
                }
            }
            str = (String) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to get conversation selected tone for: ");
            sbLIZ.append(this.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ);
            str = null;
        }
        C1C7U.LIZIZ("AlertToneDataFetcher@3ccc.getConversationSelectedTone$2");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
