package X;

import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.081B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081B implements C081K {
    public Object LIZ;
    public Method LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Method LJ;
    public C081I LJFF;

    @Override // X.C081K
    public final void release() {
        try {
            C2204961BRm.a0(this.LJ, this.LIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbXx39VWzZkHhUoDg==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF.LIZIZ("cpuboost release fail" + th.getMessage());
        }
    }

    @Override // X.C081K
    public final boolean LIZ(long j) {
        return LIZLLL(8, j);
    }

    @Override // X.C081K
    public final boolean LIZIZ(long j) {
        if (!LIZLLL(23, j) && !LIZLLL(4, j)) {
            return false;
        }
        return true;
    }

    @Override // X.C081K
    public final void LIZJ(C081I c081i, Context context) {
        this.LJFF = c081i;
        try {
            Class<?> cls = Class.forName("com.mediatek.perfservice.PerfServiceWrapper");
            try {
                this.LIZ = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ = cls.getConstructor(Context.class).newInstance(context);
            }
            this.LIZIZ = cls.getDeclaredMethod("userRegScn", new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            this.LIZJ = cls.getDeclaredMethod("userRegScnConfig", cls2, cls2, cls2, cls2, cls2, cls2);
            this.LIZLLL = cls.getDeclaredMethod("userEnable", cls2);
            this.LJ = cls.getDeclaredMethod("userResetAll", new Class[0]);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C081I c081i2 = this.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cpuboost init fail: ");
            sbLIZ.append(th2.getMessage());
            c081i2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final boolean LIZLLL(int i, long j) {
        boolean z = false;
        if (j <= 0) {
            return false;
        }
        try {
            int iIntValue = ((Integer) C2204961BRm.a0(this.LIZIZ, this.LIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbXx39VWzZkHhUoDg==", null))).intValue();
            C2204961BRm.a0(this.LIZJ, this.LIZ, new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(i), Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), 0, 0, 0}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbXx39VWzZkHhUoDg==", null));
            C2204961BRm.a0(this.LIZLLL, this.LIZ, new Object[]{Integer.valueOf(iIntValue)}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbXx39VWzZkHhUoDg==", null));
            C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(this, 112));
            z = true;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF.LIZIZ("cpuboost boost fail: " + th.getMessage());
            return z;
        }
    }
}
