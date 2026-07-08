package X;

import com.bytedance.pitaya.api.bean.PTYError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146290fw3 extends C09AY implements Function1<C1126390fPx, Unit> {
    public final /* synthetic */ C1324720kZq LL;
    public final /* synthetic */ C1146270fw1 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1146290fw3(C1324720kZq c1324720kZq, C1146270fw1 c1146270fw1, float f, Function1<? super Integer, Unit> function1) {
        super(1);
        this.LL = c1324720kZq;
        this.LLILLJJLI = c1146270fw1;
        this.LLILLL = f;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1126390fPx c1126390fPx) {
        float fLIZIZ;
        C1126390fPx c1126390fPx2 = c1126390fPx;
        C118300cf c118300cf = new C118300cf();
        int width = this.LL.getWidth();
        c118300cf.element = width;
        if (this.LLILLJJLI.LLJJ && width < 10) {
            c118300cf.element = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        }
        float f = c118300cf.element;
        if (this.LLILLJJLI.LLJJ) {
            fLIZIZ = this.LLILLL * f;
        } else {
            fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        }
        C1146270fw1 c1146270fw1 = this.LLILLJJLI;
        c1126390fPx2.LIZJ = C1697810uHb.LJIIJJI(this.LL, c1146270fw1.LLIZ, c1146270fw1.LLILZ);
        C1126390fPx.LIZIZ(c1126390fPx2, f, fLIZIZ, new C5185020h(new C020W((Function1) this.LLILZ, (Function1<? super Integer, Unit>) c118300cf, (C118300cf) 106), (Function1<? super PTYError, Unit>) 8));
        C1126390fPx.LIZIZ(c1126390fPx2, f, fLIZIZ, new C5185020h((Function1) null, (Function1<? super PTYError, Unit>) 7));
        c1126390fPx2.LIZLLL = 433L;
        c1126390fPx2.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }
}
