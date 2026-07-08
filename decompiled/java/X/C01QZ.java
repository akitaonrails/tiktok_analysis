package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTaskAnimUtils$messageShowAnimation$1", f = "AsyncTaskAnimUtils.kt", l = {}, m = "invokeSuspend")
public final class C01QZ extends C09AX implements InterfaceC1631620sYq<Float, Float, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Float>>, Object> {
    public /* synthetic */ float LL;
    public /* synthetic */ float LLILLJJLI;

    public C01QZ(InterfaceC1364105Vn<? super C01QZ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskAnimUtils@8dc0.messageShowAnimation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(C2286608xc.LIZLLL(this.LL), C2286608xc.LIZLLL(this.LLILLJJLI));
        C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.messageShowAnimation$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Float f, Float f2, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Float>> interfaceC1364105Vn) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        C01QZ c01qz = new C01QZ(interfaceC1364105Vn);
        c01qz.LL = fFloatValue;
        c01qz.LLILLJJLI = fFloatValue2;
        return c01qz.invokeSuspend(Unit.LIZ);
    }
}
