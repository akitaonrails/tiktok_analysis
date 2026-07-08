package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationEdit$beginUpdateProgressTask$1", f = "StickerDurationEdit.kt", l = {311}, m = "invokeSuspend")
public final class C390620FTg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19656611vQ LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390620FTg(C19656611vQ c19656611vQ, C118300cf c118300cf, InterfaceC1364105Vn<? super C390620FTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19656611vQ;
        this.LLILLL = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390620FTg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLLL;
        long jMf;
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        C1C7U.LIZ("StickerDurationEdit@208b.beginUpdateProgressTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            InterfaceC386690FEd interfaceC386690FEdLIZIZ = this.LLILLJJLI.LLILZIL.LIZIZ();
            if (interfaceC386690FEdLIZIZ != null) {
                iLLL = interfaceC386690FEdLIZIZ.LLL();
            } else {
                iLLL = 0;
            }
            C118300cf c118300cf = this.LLILLL;
            if (iLLL != c118300cf.element) {
                c118300cf.element = iLLL;
            }
            if (iLLL >= 0) {
                C19657311vX c19657311vX = this.LLILLJJLI.LLJIJIL;
                C19657311vX c19657311vX2 = null;
                if (c19657311vX == null) {
                    c19657311vX = null;
                }
                c19657311vX.getMultiVideoVideoModel().LLILLL.setValue(C2286608xc.LJFF(iLLL));
                InterfaceC386690FEd interfaceC386690FEdLIZIZ2 = this.LLILLJJLI.LLILZIL.LIZIZ();
                if (interfaceC386690FEdLIZIZ2 != null && (interfaceC1452170ntPLJII = interfaceC386690FEdLIZIZ2.LJII()) != null) {
                    jMf = interfaceC1452170ntPLJII.mf(iLLL);
                } else {
                    jMf = 0;
                }
                C19657311vX c19657311vX3 = this.LLILLJJLI.LLJIJIL;
                if (c19657311vX3 != null) {
                    c19657311vX2 = c19657311vX3;
                }
                c19657311vX2.getMultiVideoVideoModel().LLILLL.setValue(C2286608xc.LJFF(jMf));
            }
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(36L, this) != objLJFF);
        C1C7U.LIZIZ("StickerDurationEdit@208b.beginUpdateProgressTask$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
