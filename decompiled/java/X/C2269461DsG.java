package X;

import android.app.Application;
import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS51S0010000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.1DsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269461DsG extends C09AY implements Function0<C452010Hnz> {
    public C2269461DsG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Hnz] */
    @Override // kotlin.jvm.functions.Function0
    public final C452010Hnz invoke() {
        return new C128L() { // from class: X.0Hnz
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(460));

            @Override // X.C128L
            public final String LIZIZ() {
                return (String) new C452020Ho0().LIZJ.getValue();
            }

            @Override // X.C128L
            public final boolean LIZLLL() {
                int i = new C452020Ho0().LIZIZ;
                return i == 1 || i == 2;
            }

            @Override // X.C128L
            public final C1781980wTM LJFF() {
                return (C1781980wTM) this.LIZ.getValue();
            }

            @Override // X.C128L
            public final boolean LIZJ() {
                C1443030nef.LJII().getClass();
                if (C1443030nef.LJIIIIZZ()) {
                    return false;
                }
                C452020Ho0 c452020Ho0 = new C452020Ho0();
                if (!c452020Ho0.LIZ()) {
                    return false;
                }
                C2354709Kn.LJIJJ((String) c452020Ho0.LIZJ.getValue());
                C451960Hnu.LIZIZ().storeBoolean("key_ending_audio_ready", false);
                Keva kevaLIZIZ = C451960Hnu.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(-1);
                sbLIZ.append('-');
                sbLIZ.append(-1);
                kevaLIZIZ.storeString("key_ending_frame_ready", C2188811AlT.LIZIZ(sbLIZ));
                C451960Hnu.LIZIZ().storeString(C451960Hnu.LIZ("key_ending_effects_path", false), "");
                C451960Hnu.LIZIZ().storeString(C451960Hnu.LIZ("key_ending_effects_path", true), "");
                C451960Hnu.LIZIZ().storeString(C451960Hnu.LIZ("key_user_fingerprint", false), "");
                C451960Hnu.LIZIZ().storeString(C451960Hnu.LIZ("key_user_fingerprint", true), "");
                return true;
            }

            @Override // X.C128L
            public final long LJ() {
                C1443030nef.LJII().getClass();
                if (C1443030nef.LJIIIIZZ()) {
                    return 0L;
                }
                C452020Ho0 c452020Ho0 = new C452020Ho0();
                if (c452020Ho0.LIZ()) {
                    return C2354709Kn.LJIIJ((String) c452020Ho0.LIZJ.getValue());
                }
                return 0L;
            }

            @Override // X.C128L
            public final void LIZ(List<Integer> list, String str, InterfaceC2257101DWa interfaceC2257101DWa, InterfaceC1631630sYr<? super Boolean, ? super List<String>, ? super String, ? super String, Unit> interfaceC1631630sYr, Function1<? super Throwable, Unit> function1) {
                boolean z;
                Application application = C0CHQ.LIZ;
                boolean zLJFF = Intrinsics.LJFF(C0CHQ.LIZ().getAccountService().getCurrentUserID(), interfaceC2257101DWa.getUid());
                C452020Ho0 c452020Ho0 = new C452020Ho0();
                if (2 != c452020Ho0.LIZ && 2 != c452020Ho0.LIZIZ) {
                    z = false;
                } else {
                    z = true;
                }
                if (!c452020Ho0.LIZ()) {
                    if (function1 != null) {
                        function1.invoke(new IllegalStateException("the new ending watermark is not enabled, skip loading ending watermark resources"));
                    }
                } else {
                    C451970Hnv c451970Hnv = new C451970Hnv(application, (String) c452020Ho0.LIZJ.getValue(), list, str, interfaceC2257101DWa, new AwS51S0010000_6(zLJFF, 1), z);
                    C0IE3 c0ie3 = new C0IE3(CoroutineExceptionHandler.LJJLIL, function1, 1);
                    C1DFK c1dfk = c451970Hnv.LJIIIIZZ;
                    C1DFB c1dfb = C0PEM.LIZJ;
                    c1dfk.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(c1dfk, c1dfb).plus(c0ie3)), null, null, new C451950Hnt(c451970Hnv, interfaceC1631630sYr, null), 3);
                }
            }
        };
    }
}
