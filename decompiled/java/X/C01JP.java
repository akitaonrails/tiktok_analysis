package X;

import com.bytedance.android.livesdk.livesetting.clientai.LiveTriggerScaleProduceSettings;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01JP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JP {
    public C11JF LIZ;
    public long LIZIZ;
    public final long LIZJ = LiveTriggerScaleProduceSettings.INSTANCE.delayTime();
    public Function0<Long> LIZLLL;
    public boolean LJ;

    public final void LIZ(long j) {
        if (j <= 0) {
            return;
        }
        C11IB c11ibLJLJJLL = C11NZ.LJLJJLL(j, TimeUnit.SECONDS);
        C11RO c11ro = C11S5.LIZIZ;
        this.LIZ = (C11JF) c11ibLJLJJLL.LJL(c11ro).LJJJLZIJ(c11ro).LJJLJLI(new C516201zk(this, 202));
    }
}
