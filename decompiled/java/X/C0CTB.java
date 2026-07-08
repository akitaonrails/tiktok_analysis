package X;

import com.ss.android.ugc.tools.common.mob.AiTraceItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.common.mob.AiChatTrace$log$1", f = "AiChatTrace.kt", l = {95}, m = "invokeSuspend")
public final class C0CTB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C0D8I LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTB(String str, String str2, String str3, String str4, String str5, long j, C0D8I c0d8i, Map<String, String> map, InterfaceC1364105Vn<? super C0CTB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = j;
        this.LLIZLLLIL = c0d8i;
        this.LLJ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatTrace@b54b.log$1");
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
            C0CTD c0ctd = C0CTD.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            String str5 = this.LLILZLL;
            long j = this.LLIZ;
            String value = this.LLIZLLLIL.getValue();
            Map<String, String> map = this.LLJ;
            CopyOnWriteArrayList<AiTraceItem> copyOnWriteArrayList = C0CTD.LIZJ;
            copyOnWriteArrayList.add(new AiTraceItem(str, str2, str3, str4, str5, j, value, map));
            if (copyOnWriteArrayList.size() >= C0C64.LJIILLIIL().LJIJ(31744, 1, "ai_imagine_max_upload_trace_count", true)) {
                ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
                copyOnWriteArrayList.clear();
                this.LL = 1;
                if (c0ctd.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("AiChatTrace@b54b.log$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatTrace@b54b.log$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
