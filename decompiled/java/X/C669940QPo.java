package X;

import com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem$sendEventToFE$1", f = "BaseKeyboardMonitorAssem.kt", l = {}, m = "invokeSuspend")
public final class C669940QPo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseKeyboardMonitorAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669940QPo(BaseKeyboardMonitorAssem baseKeyboardMonitorAssem, boolean z, Integer num, InterfaceC1364105Vn<? super C669940QPo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseKeyboardMonitorAssem;
        this.LLILLL = z;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C669940QPo c669940QPo = new C669940QPo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c669940QPo.LL = obj;
        return c669940QPo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("BaseKeyboardMonitorAssem@620c.sendEventToFE$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C649290PdP c649290PdPA0 = this.LLILLJJLI.bo().a0();
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI.LLILLJJLI = null;
        if (c649290PdPA0 != null) {
            BaseKeyboardMonitorAssem baseKeyboardMonitorAssem = this.LLILLJJLI;
            boolean z = this.LLILLL;
            Integer num = this.LLILZ;
            baseKeyboardMonitorAssem.getClass();
            BaseKeyboardMonitorAssem.fo(z, num, c649290PdPA0);
        } else {
            BaseKeyboardMonitorAssem baseKeyboardMonitorAssem2 = this.LLILLJJLI;
            EnumC669960QPq enumC669960QPq = EnumC669960QPq.SPARK_NOT_FOUND;
            baseKeyboardMonitorAssem2.getClass();
            BaseKeyboardMonitorAssem.m309do(enumC669960QPq);
            BaseKeyboardMonitorAssem baseKeyboardMonitorAssem3 = this.LLILLJJLI;
            baseKeyboardMonitorAssem3.LLILLJJLI = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C669950QPp(baseKeyboardMonitorAssem3, this.LLILLL, this.LLILZ, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseKeyboardMonitorAssem@620c.sendEventToFE$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
