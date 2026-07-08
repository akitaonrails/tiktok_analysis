package X;

import com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem$sendEventToFE$1$1", f = "BaseKeyboardMonitorAssem.kt", l = {55}, m = "invokeSuspend")
public final class C669950QPp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseKeyboardMonitorAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669950QPp(BaseKeyboardMonitorAssem baseKeyboardMonitorAssem, boolean z, Integer num, InterfaceC1364105Vn<? super C669950QPp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseKeyboardMonitorAssem;
        this.LLILLL = z;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669950QPp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("BaseKeyboardMonitorAssem@620c.sendEventToFE$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BaseKeyboardMonitorAssem@620c.sendEventToFE$1$1");
                return objLJFF;
            }
        }
        C649290PdP c649290PdPA0 = this.LLILLJJLI.bo().a0();
        if (c649290PdPA0 != null) {
            BaseKeyboardMonitorAssem baseKeyboardMonitorAssem = this.LLILLJJLI;
            boolean z = this.LLILLL;
            Integer num = this.LLILZ;
            baseKeyboardMonitorAssem.getClass();
            BaseKeyboardMonitorAssem.fo(z, num, c649290PdPA0);
        } else {
            BaseKeyboardMonitorAssem baseKeyboardMonitorAssem2 = this.LLILLJJLI;
            EnumC669960QPq enumC669960QPq = EnumC669960QPq.SPARK_RETRY_FAILED;
            baseKeyboardMonitorAssem2.getClass();
            BaseKeyboardMonitorAssem.m309do(enumC669960QPq);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseKeyboardMonitorAssem@620c.sendEventToFE$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
