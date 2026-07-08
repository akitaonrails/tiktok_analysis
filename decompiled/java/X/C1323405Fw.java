package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.mute.MuteTheirPostsManager$unmutePosts$1", f = "MuteTheirPostsManager.kt", l = {199}, m = "invokeSuspend")
public final class C1323405Fw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1323405Fw(InterfaceC1364105Vn<? super C1323405Fw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1323405Fw(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.unmutePosts$1");
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
            C1392890mLn c1392890mLn = C1392890mLn.LIZ;
            this.LL = 1;
            c1392890mLn.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1323305Fv(null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.unmutePosts$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.unmutePosts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1323405Fw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
