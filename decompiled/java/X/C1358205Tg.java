package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.CustomizeStyleTemplatesKt$CustomizeStyleTemplates$4$1", f = "CustomizeStyleTemplates.kt", l = {181}, m = "invokeSuspend")
public final class C1358205Tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358205Tg(String str, C1690080u58 c1690080u58, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1358205Tg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1690080u58;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358205Tg(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$4$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILLJJLI;
        boolean z = false;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            if (str != null && str.length() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            i2 = i ^ 1;
            if (i2 != 0 && !this.LLILZIL.getValue().booleanValue()) {
                C1690080u58 c1690080u58 = this.LLILZ;
                this.LL = i2;
                this.LLILLJJLI = 1;
                C1687100u0K c1687100u0K = C1690080u58.LJIL;
                if (c1690080u58.LJIIJ(0, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$4$1");
                    return objLJFF;
                }
            }
        }
        C05P0<Boolean> c05p0 = this.LLILZIL;
        if (i2 != 0) {
            z = true;
        }
        c05p0.setValue(Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
