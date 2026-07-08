package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem$onBind$1$1", f = "RegenerateAssem.kt", l = {}, m = "invokeSuspend")
public final class C21288718Sv extends C09AX implements Function2<InterfaceC1157570gEF<? extends C909930Zmp>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ RegenerateAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21288718Sv(C869590Y9l c869590Y9l, RegenerateAssem regenerateAssem, InterfaceC1364105Vn<? super C21288718Sv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = regenerateAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21288718Sv c21288718Sv = new C21288718Sv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c21288718Sv.LL = obj;
        return c21288718Sv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long index;
        C1C7U.LIZ("RegenerateAssem@34fe.onBind$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) this.LL;
        if (!(interfaceC1157570gEF instanceof C1157450gE3)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RegenerateAssem@34fe.onBind$1$1");
            return unit;
        }
        C869590Y9l c869590Y9l = ((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ;
        if (c869590Y9l != null) {
            index = c869590Y9l.getIndex();
        } else {
            index = 0;
        }
        if (this.LLILLJJLI.getIndex() < index) {
            RegenerateAssem regenerateAssem = this.LLILLL;
            AnonymousClass0956 anonymousClass0956 = regenerateAssem.LLLFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            regenerateAssem.LLLFF = null;
            this.LLILLL.zp(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RegenerateAssem@34fe.onBind$1$1");
            return unit2;
        }
        C18U8.LIZ.getClass();
        if (C18U8.LIZ() - this.LLILLJJLI.getCreatedAt() > ((long) C342380DbY.LIZ().retryEnableIntervalInHours) * 3600000) {
            RegenerateAssem regenerateAssem2 = this.LLILLL;
            AnonymousClass0956 anonymousClass09562 = regenerateAssem2.LLLFF;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            regenerateAssem2.LLLFF = null;
            this.LLILLL.zp(false);
        } else {
            this.LLILLL.zp(true);
            RegenerateAssem regenerateAssem3 = this.LLILLL;
            C869590Y9l c869590Y9l2 = this.LLILLJJLI;
            AnonymousClass0956 anonymousClass09563 = regenerateAssem3.LLLFF;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            regenerateAssem3.LLLFF = null;
            regenerateAssem3.LLLFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(regenerateAssem3), null, null, new C21288618Su(c869590Y9l2, regenerateAssem3, null), 3);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RegenerateAssem@34fe.onBind$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends C909930Zmp> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
