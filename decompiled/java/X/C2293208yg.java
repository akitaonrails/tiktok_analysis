package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.task.PublishCoverPreLoadTask$runTask$1", f = "PublishCoverPreLoadTask.kt", l = {23}, m = "invokeSuspend")
public final class C2293208yg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C2293208yg(InterfaceC1364105Vn<? super C2293208yg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2293208yg(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishCoverPreLoadTask@33ef.runTask$1");
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
            C2292908yd c2292908yd = new C2292908yd();
            this.LL = 1;
            obj = c2292908yd.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PublishCoverPreLoadTask@33ef.runTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PublishCoverPreLoadTask@33ef.runTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C2293208yg(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
