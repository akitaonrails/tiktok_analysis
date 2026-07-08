package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.063n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$writeToImageProduct$2$3$writeRes$1", f = "C2PAAIGCManager.kt", l = {944}, m = "invokeSuspend")
public final class C15461063n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ C15464063q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15461063n(String str, JSONObject jSONObject, List<String> list, C15464063q c15464063q, InterfaceC1364105Vn<? super C15461063n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
        this.LLILZ = list;
        this.LLILZIL = c15464063q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15461063n(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.writeToImageProduct$2$3$writeRes$1");
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
            String str = this.LLILLJJLI;
            JSONObject jSONObject = this.LLILLL;
            List<String> list = this.LLILZ;
            C15464063q c15464063q = this.LLILZIL;
            this.LL = 1;
            c140d.getClass();
            obj = C140D.LJJIZ(str, jSONObject, null, list, c15464063q, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeToImageProduct$2$3$writeRes$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeToImageProduct$2$3$writeRes$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
