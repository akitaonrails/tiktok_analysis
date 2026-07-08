package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OpenDialogBoxUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OpenDialogBoxUtil$onResume$1", f = "OpenDialogBoxUtil.kt", l = {157}, m = "invokeSuspend")
public final class C0NFK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OpenDialogBoxUtil LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFK(OpenDialogBoxUtil openDialogBoxUtil, InterfaceC1364105Vn<? super C0NFK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = openDialogBoxUtil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenDialogBoxUtil@be49.onResume$1");
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
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("OpenDialogBoxUtil@be49.onResume$1");
                return objLJFF;
            }
        }
        OpenDialogBoxUtil openDialogBoxUtil = this.LLILLJJLI;
        C0N64 c0n64 = openDialogBoxUtil.LL;
        if (c0n64 == null) {
            c0n64 = null;
        }
        if (!c0n64.LJIIIZ) {
            openDialogBoxUtil.ZI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenDialogBoxUtil@be49.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
