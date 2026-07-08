package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectPanelKt$TopAvatarCard$1", f = "ContactSelectPanel.kt", l = {}, m = "invokeSuspend")
public final class C1371905Yn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371905Yn(C013C c013c, Function0<Unit> function0, InterfaceC1364105Vn<? super C1371905Yn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371905Yn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectPanelKt@b0ce.TopAvatarCard$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = this.LL;
        if (!c013c.element) {
            c013c.element = true;
            this.LLILLJJLI.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectPanelKt@b0ce.TopAvatarCard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
