package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0beh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.utils.GameResourceManager$1", f = "GameResourceManager.kt", l = {45}, m = "invokeSuspend")
public final class C981770beh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C981770beh(InterfaceC1364105Vn<? super C981770beh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981770beh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameResourceManager@a046.<init>$1");
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
            C985690bl1 c985690bl1 = C985690bl1.LIZ;
            c985690bl1.getClass();
            String str = C985690bl1.LIZIZ;
            this.LL = 1;
            obj = c985690bl1.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GameResourceManager@a046.<init>$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C985690bl1 c985690bl12 = C985690bl1.LIZ;
            int i2 = C985690bl1.LIZLLL;
            c985690bl12.getClass();
            C985690bl1.LJ |= i2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameResourceManager@a046.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C981770beh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
