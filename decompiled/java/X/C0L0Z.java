package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0L0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.livephoto.mediaswitch.LivePhotoHandler$applyMode$1$2$result$1", f = "LivePhotoHandler.kt", l = {55}, m = "invokeSuspend")
public final class C0L0Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>>, Object> {
    public int LL;

    public C0L0Z(InterfaceC1364105Vn<? super C0L0Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L0Z(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("LivePhotoHandler@5cb5.applyMode$1$2$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C536200L1e c536200L1e = C536200L1e.LIZ;
            this.LL = 1;
            objLIZ = c536200L1e.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LivePhotoHandler@5cb5.applyMode$1$2$result$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("LivePhotoHandler@5cb5.applyMode$1$2$result$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Effect>> interfaceC1364105Vn) {
        return new C0L0Z(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
