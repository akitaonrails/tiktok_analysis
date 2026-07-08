package X;

import com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.anchor.EditorProAnchorGuideActivity$changeState$1", f = "EditorProAnchorGuideActivity.kt", l = {296}, m = "invokeSuspend")
public final class C592910NNh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditorProAnchorGuideActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592910NNh(EditorProAnchorGuideActivity editorProAnchorGuideActivity, InterfaceC1364105Vn<? super C592910NNh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = editorProAnchorGuideActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592910NNh c592910NNh = new C592910NNh(this.LLILLL, interfaceC1364105Vn);
        c592910NNh.LLILLJJLI = obj;
        return c592910NNh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("EditorProAnchorGuideActivity@1b4c.changeState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(60000L, this) == objLJFF) {
                C1C7U.LIZIZ("EditorProAnchorGuideActivity@1b4c.changeState$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            this.LLILLL.LLLLZI(C592920NNi.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAnchorGuideActivity@1b4c.changeState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
