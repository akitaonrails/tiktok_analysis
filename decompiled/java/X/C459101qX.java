package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.controller.PcsVideoPlayerViewController$resetPlaybackProgress$1$1", f = "PcsVideoPlayerViewController.kt", l = {173}, m = "invokeSuspend")
public final class C459101qX extends C09AX implements Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C459101qX(InterfaceC1364105Vn<? super C459101qX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C459101qX c459101qX = new C459101qX(interfaceC1364105Vn);
        c459101qX.LLILLJJLI = obj;
        return c459101qX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0N0Y c0n0y;
        C1C7U.LIZ("PcsVideoPlayerViewController@65f8.resetPlaybackProgress$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c0n0y = (C0N0Y) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0n0y = (C0N0Y) this.LLILLJJLI;
            c0n0y.seek(0.0f);
            this.LLILLJJLI = c0n0y;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.resetPlaybackProgress$1$1");
                return objLJFF;
            }
        }
        c0n0y.LJJIIZI();
        c0n0y.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.resetPlaybackProgress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0N0Y c0n0y, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0n0y, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
