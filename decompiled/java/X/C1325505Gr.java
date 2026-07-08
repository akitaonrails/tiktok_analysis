package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtCreationPanelKt$SocialThoughtCreationPanel$4$1", f = "SocialThoughtCreationPanel.kt", l = {}, m = "invokeSuspend")
public final class C1325505Gr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ ThoughtInfo LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1325505Gr(Function1<? super Integer, Unit> function1, ThoughtInfo thoughtInfo, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1325505Gr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = thoughtInfo;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325505Gr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int length;
        String str;
        C1C7U.LIZ("SocialThoughtCreationPanelKt@90c9.SocialThoughtCreationPanel$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLL.getValue().booleanValue()) {
            Function1<Integer, Unit> function1 = this.LL;
            ThoughtInfo thoughtInfo = this.LLILLJJLI;
            if (thoughtInfo != null && (str = thoughtInfo.textContent) != null) {
                length = str.length();
            } else {
                length = 0;
            }
            function1.invoke(C2286608xc.LJ(length));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtCreationPanelKt@90c9.SocialThoughtCreationPanel$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
