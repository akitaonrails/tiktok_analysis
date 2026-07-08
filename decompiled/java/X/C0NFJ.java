package X;

import android.content.Context;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$doShowAllMessageFromDB$1$1$2$2", f = "IntelligencePushHelper.kt", l = {}, m = "invokeSuspend")
public final class C0NFJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFJ(long j, Context context, String str, int i, InterfaceC1364105Vn<? super C0NFJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IntelligencePushHelper@722a.doShowAllMessageFromDB$1$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C609620Nvc.LIZ.getClass();
        C609620Nvc.LIZJ().storeString(String.valueOf(this.LL), "1");
        MessageShowHandler.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IntelligencePushHelper@722a.doShowAllMessageFromDB$1$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
