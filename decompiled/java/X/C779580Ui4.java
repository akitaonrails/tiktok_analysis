package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.livesetting.game.GameLiveClientInferDebugSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Ui4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779580Ui4 implements InterfaceC774990Uaf {
    public AbstractC1273900jFs LL;
    public final C779650UiB LLILLJJLI;
    public C779570Ui3 LLILLL;
    public final C779590Ui5 LLILZ = new InterfaceC777020Udw() { // from class: X.0Ui5
        @Override // X.InterfaceC777020Udw
        public final void LIZ() {
            Map<String, Object> map = C1338270kvh.LIZ;
        }

        @Override // X.InterfaceC777020Udw
        public final void LIZIZ(long j, long j2, Object... objArr) {
            ByteBuffer byteBuffer;
            Integer num;
            Integer num2;
            Integer num3;
            InterfaceC779640UiA interfaceC779640UiA;
            Map<String, Object> map = C1338270kvh.LIZ;
            C779580Ui4 c779580Ui4 = this.LIZ;
            AbstractC1273900jFs abstractC1273900jFs = c779580Ui4.LL;
            Object objLJJIIZ = C13LQ.LJJIIZ(0, objArr);
            Boolean bool = null;
            if (objLJJIIZ instanceof ByteBuffer) {
                byteBuffer = (ByteBuffer) objLJJIIZ;
            } else {
                byteBuffer = null;
            }
            Object objLJJIIZ2 = C13LQ.LJJIIZ(1, objArr);
            if (objLJJIIZ2 instanceof Integer) {
                num = (Integer) objLJJIIZ2;
            } else {
                num = null;
            }
            Object objLJJIIZ3 = C13LQ.LJJIIZ(2, objArr);
            if (objLJJIIZ3 instanceof Integer) {
                num2 = (Integer) objLJJIIZ3;
            } else {
                num2 = null;
            }
            Object objLJJIIZ4 = C13LQ.LJJIIZ(3, objArr);
            if (objLJJIIZ4 instanceof Integer) {
                num3 = (Integer) objLJJIIZ4;
            } else {
                num3 = null;
            }
            Object objLJJIIZ5 = C13LQ.LJJIIZ(4, objArr);
            if (objLJJIIZ5 instanceof Boolean) {
                bool = (Boolean) objLJJIIZ5;
            }
            if (byteBuffer != null && num != null && num2 != null && num3 != null && bool != null && (interfaceC779640UiA = c779580Ui4.LLILLJJLI.LIZ) != null && interfaceC779640UiA.LIZ()) {
                interfaceC779640UiA.LIZLLL();
                interfaceC779640UiA.LJII();
                interfaceC779640UiA.LIZIZ();
                try {
                    interfaceC779640UiA.LJIIIIZZ(j, j2, byteBuffer, num.intValue(), num2.intValue(), num3.intValue(), abstractC1273900jFs, bool.booleanValue(), GameLiveClientInferDebugSetting.INSTANCE.fusionId(), new InterfaceC204502150i() { // from class: X.0Ui6
                        @Override // X.InterfaceC204502150i
                        public final void LIZ() {
                            Map<String, Object> map2 = C1338270kvh.LIZ;
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ui5] */
    public C779580Ui4(Room room) {
        this.LLILLJJLI = new C779650UiB(room);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZ(AbstractC1273900jFs abstractC1273900jFs) {
        Map<String, Object> map = C1338270kvh.LIZ;
        try {
            C779570Ui3 c779570Ui3 = this.LLILLL;
            if (c779570Ui3 != null) {
                c779570Ui3.LIZLLL(abstractC1273900jFs);
            }
            this.LLILLL = null;
            InterfaceC779640UiA interfaceC779640UiA = this.LLILLJJLI.LIZ;
            if (interfaceC779640UiA != null) {
                interfaceC779640UiA.LJI();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZJ(AbstractC1273900jFs abstractC1273900jFs, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (this.LLILLJJLI.LIZ == null || abstractC1273900jFs == null) {
            return;
        }
        this.LL = abstractC1273900jFs;
        try {
            C779570Ui3 c779570Ui3 = this.LLILLL;
            if (c779570Ui3 != null) {
                c779570Ui3.LIZLLL(abstractC1273900jFs);
            }
            C779570Ui3 c779570Ui32 = new C779570Ui3(this.LLILZ);
            this.LLILLL = c779570Ui32;
            c779570Ui32.LIZJ(abstractC1273900jFs, z);
            C779570Ui3 c779570Ui33 = this.LLILLL;
            if (c779570Ui33 != null) {
                C11JF c11jf = c779570Ui33.LJI;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                c779570Ui33.LJI = (C11JF) C11NZ.LJJJJLI(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJIILIIL(C0J1R.LIZJ(C779570Ui3.class)).LJJLJLI(new AfS181S0100000_12(c779570Ui33, 313));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC774990Uaf
    public final void LIZIZ(boolean z, AbstractC1273900jFs abstractC1273900jFs, boolean z2) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (z) {
            C779570Ui3 c779570Ui3 = this.LLILLL;
            if (c779570Ui3 != null) {
                c779570Ui3.LIZJ.set(true);
                return;
            }
            return;
        }
        LIZJ(abstractC1273900jFs, z2);
    }
}
