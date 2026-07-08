package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.IPublishVoiceInputService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uPK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi.PublishVoiceInputService$scheduleBindOnIo$1", f = "PublishVoiceInputService.kt", l = {}, m = "invokeSuspend")
public final class C1702600uPK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1702600uPK(InterfaceC1364105Vn<? super C1702600uPK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702600uPK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishVoiceInputService@1539.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C1702620uPM.LIZJ != null) {
                Unit unit = Unit.LIZ;
                C1702620uPM.LJ = false;
                C1C7U.LIZIZ("PublishVoiceInputService@1539.scheduleBindOnIo$1");
                return unit;
            }
            C1702620uPM.LIZ.getClass();
            IPublishVoiceInputService iPublishVoiceInputServiceLIZIZ = C1702620uPM.LIZIZ();
            if (iPublishVoiceInputServiceLIZIZ != C1702620uPM.LIZLLL()) {
                C1702620uPM.LIZJ = iPublishVoiceInputServiceLIZIZ;
            }
            C1702620uPM.LJ = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PublishVoiceInputService@1539.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1702620uPM.LJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1702600uPK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
