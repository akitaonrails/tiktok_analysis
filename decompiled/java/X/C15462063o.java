package X;

import com.ss.android.ugc.aweme.ITTC2PAService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$writeTransCodeProduct$1$ingredient$1", f = "C2PAAIGCManager.kt", l = {1069}, m = "invokeSuspend")
public final class C15462063o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ ITTC2PAService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15462063o(ITTC2PAService iTTC2PAService, String str, InterfaceC1364105Vn<? super C15462063o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iTTC2PAService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15462063o(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.writeTransCodeProduct$1$ingredient$1");
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
            C140D c140d = C140D.LIZ;
            ITTC2PAService iTTC2PAService = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = C140D.LJJIJIL(c140d, iTTC2PAService, str, null, this, 12);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeTransCodeProduct$1$ingredient$1");
                return objLJFF;
            }
        }
        Object first = ((Pair) obj).getFirst();
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeTransCodeProduct$1$ingredient$1");
        return first;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
