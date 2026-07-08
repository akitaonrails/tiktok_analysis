package X;

import android.view.MotionEvent;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0t2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1649820t2C extends C05YF {
    public static final C1649830t2D LJJJLIIL = new Object() { // from class: X.0t2D
    };

    boolean EZ0();

    void Hn(int i, boolean z);

    C385670FAf<Boolean> JR0();

    void Qb(RetakeVideoContext retakeVideoContext);

    void Rk(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair);

    void T5();

    void U22(MotionEvent motionEvent);

    void V2(boolean z);

    void W9(boolean z);

    void YY1(boolean z);

    void ZG(MotionEvent motionEvent, float f, float f2);

    void dd(boolean z);

    void hF2(boolean z, boolean z2);

    void qd(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe);

    void so(int i);

    void tq2(boolean z, boolean z2);

    void tv(int i);

    LiveEvent<Unit> v32();

    void vr(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair);

    void zc(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe);
}
