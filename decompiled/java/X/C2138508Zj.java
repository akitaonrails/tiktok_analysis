package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audio.AudioManagerWrapper$updateCurrentAudioDevices$1", f = "AudioManagerWrapper.kt", l = {}, m = "invokeSuspend")
public final class C2138508Zj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C2138508Zj(InterfaceC1364105Vn<? super C2138508Zj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2138508Zj c2138508Zj = new C2138508Zj(interfaceC1364105Vn);
        c2138508Zj.LL = obj;
        return c2138508Zj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioManagerWrapper@bcf0.updateCurrentAudioDevices$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        synchronized (this.LL) {
            try {
                C2138608Zk.LIZIZ = C2138608Zk.LIZJ.getDevices(2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioManagerWrapper@bcf0.updateCurrentAudioDevices$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
