package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.0fyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.data.repository.MusicGiftRepository$requestFlow$2", f = "MusicGiftRepository.kt", l = {162}, m = "invokeSuspend")
public final class C1147700fyK<R> extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super AbstractC1147530fy3<? extends R>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C1147700fyK(InterfaceC1364105Vn<? super C1147700fyK> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftRepository@a574.requestFlow$2");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            C1147540fy4 c1147540fy4 = new C1147540fy4((Throwable) this.LLILLL, null, 2);
            this.LLILLJJLI = null;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c1147540fy4, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftRepository@a574.requestFlow$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftRepository@a574.requestFlow$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1147700fyK c1147700fyK = new C1147700fyK(interfaceC1364105Vn);
        c1147700fyK.LLILLJJLI = (InterfaceC346701Wf) obj;
        c1147700fyK.LLILLL = th;
        return c1147700fyK.invokeSuspend(Unit.LIZ);
    }
}
