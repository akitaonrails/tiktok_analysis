package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.optimize.UploadPhotoPreprocessManager$clearCache$1", f = "UpLoadPhotoPreprocessManager.kt", l = {}, m = "invokeSuspend")
public final class C2488209p2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2488309p3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488209p2(C2488309p3 c2488309p3, InterfaceC1364105Vn<? super C2488209p2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2488309p3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2488209p2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPhotoPreprocessManager@b7a4.clearCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C2488009p0 c2488009p0 : this.LL.LIZJ) {
            AnonymousClass0957<?> anonymousClass0957 = c2488009p0.LIZLLL;
            if (anonymousClass0957 != null && anonymousClass0957.isCompleted()) {
                C0VSJ c0vsj = new C0VSJ(C2488109p1.LIZ(c2488009p0.LIZJ, false));
                C0VSJ c0vsj2 = new C0VSJ(C2488109p1.LIZ(c2488009p0.LIZJ, true));
                if (c0vsj.exists()) {
                    System.currentTimeMillis();
                    c0vsj.delete();
                    System.currentTimeMillis();
                }
                if (c0vsj2.exists()) {
                    System.currentTimeMillis();
                    c0vsj2.delete();
                    System.currentTimeMillis();
                }
            } else {
                AnonymousClass0957<?> anonymousClass09572 = c2488009p0.LIZLLL;
                if (anonymousClass09572 != null) {
                    anonymousClass09572.LIZIZ(null);
                }
            }
            this.LL.LIZJ.remove(c2488009p0);
            this.LL.LIZLLL.remove(new C2488609p6(c2488009p0.LIZ.LJFF(), c2488009p0.LIZ.modify));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPhotoPreprocessManager@b7a4.clearCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
