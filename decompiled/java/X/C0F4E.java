package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F4E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.EditRootScene$initObserver$3$clickAutoCutAction$1$1$1", f = "EditRootScene.kt", l = {3605}, m = "invokeSuspend")
public final class C0F4E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1455260nyO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F4E(C1455260nyO c1455260nyO, InterfaceC1364105Vn<? super C0F4E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1455260nyO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F4E(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditRootScene@37d3.initObserver$3$clickAutoCutAction$1$1$1");
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
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("EditRootScene@37d3.initObserver$3$clickAutoCutAction$1$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.isVisible()) {
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (!videoPublishEditModel.isRestoreFromSaveInstance()) {
                this.LLILLJJLI.LLLLZLLIL(true);
                this.LLILLJJLI.LLZZZZ = true;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditRootScene@37d3.initObserver$3$clickAutoCutAction$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
