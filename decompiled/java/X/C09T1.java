package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09T1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$Task$detectException$1", f = "TTSStreamManager.kt", l = {447}, m = "invokeSuspend")
public final class C09T1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09T1(String str, InterfaceC1364105Vn<? super C09T1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09T1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSStreamManager$Task@7dca.detectException$1");
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
            if (AnonymousClass0958.LIZIZ(15000L, this) == objLJFF) {
                C1C7U.LIZIZ("TTSStreamManager$Task@7dca.detectException$1");
                return objLJFF;
            }
        }
        C11YP c11yp = C11YP.LIZIZ;
        String str = C09T7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("more than 10 seconds do not receive callback. message: ");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LJIIIIZZ(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        C09T7.LJ = false;
        C09T7.LIZLLL = 5423;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("more than 10 seconds do not receive callback. message: ");
        sbLIZ2.append(this.LLILLJJLI);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamManager$Task@7dca.detectException$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
