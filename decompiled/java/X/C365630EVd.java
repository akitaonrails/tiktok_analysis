package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditorProResPreloadComponent$startLoadResTask$1", f = "EditorProResPreloadComponent.kt", l = {80}, m = "invokeSuspend")
public final class C365630EVd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C365620EVc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365630EVd(C365620EVc c365620EVc, InterfaceC1364105Vn<? super C365630EVd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c365620EVc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365630EVd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProResPreloadComponent@3076.startLoadResTask$1");
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
            System.currentTimeMillis();
            C365620EVc c365620EVc = this.LLILLJJLI;
            this.LL = 1;
            if (c365620EVc.W1(this) == objLJFF) {
                C1C7U.LIZIZ("EditorProResPreloadComponent@3076.startLoadResTask$1");
                return objLJFF;
            }
        }
        C365730EVn.LIZJ(C365730EVn.LIZ, null, null, true, 3);
        this.LLILLJJLI.W2();
        System.currentTimeMillis();
        this.LLILLJJLI.LLILZIL = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProResPreloadComponent@3076.startLoadResTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
