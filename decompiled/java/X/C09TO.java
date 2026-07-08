package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09TO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.impl.TTSStreamImpl$activeThread$1", f = "TTSStreamImpl.kt", l = {262}, m = "invokeSuspend")
public final class C09TO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09TR LLILLJJLI;
    public final /* synthetic */ C09TS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09TO(C09TR c09tr, C09TS c09ts, InterfaceC1364105Vn<? super C09TO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09tr;
        this.LLILLL = c09ts;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09TO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSStreamImpl@3dd.activeThread$1");
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
            C09TR c09tr = this.LLILLJJLI;
            C09TS c09ts = this.LLILLL;
            this.LL = 1;
            if (c09tr.LIZJ(c09ts, this) == objLJFF) {
                C1C7U.LIZIZ("TTSStreamImpl@3dd.activeThread$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamImpl@3dd.activeThread$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
