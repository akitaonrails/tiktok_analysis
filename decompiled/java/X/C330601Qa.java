package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTaskAnimUtils$showAnimationFlow$result$1", f = "AsyncTaskAnimUtils.kt", l = {}, m = "invokeSuspend")
public final class C330601Qa extends C09AX implements InterfaceC1631620sYq<Float, Float, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Float>>, Object> {
    public /* synthetic */ float LL;
    public /* synthetic */ float LLILLJJLI;

    public C330601Qa(InterfaceC1364105Vn<? super C330601Qa> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(C2286608xc.LIZLLL(this.LL), C2286608xc.LIZLLL(this.LLILLJJLI));
        C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$result$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Float f, Float f2, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Float>> interfaceC1364105Vn) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        C330601Qa c330601Qa = new C330601Qa(interfaceC1364105Vn);
        c330601Qa.LL = fFloatValue;
        c330601Qa.LLILLJJLI = fFloatValue2;
        return c330601Qa.invokeSuspend(Unit.LIZ);
    }
}
