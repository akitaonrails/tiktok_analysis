package X;

import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.0jGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1274490jGp {
    int LJII(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, Runnable runnable, int i5, Map map);

    void LJJIIJ();

    boolean LJJLIIIIJ();

    Handler LJJLIIIJJI();

    void LJLLJ(boolean z);

    boolean LJLLLLLL();

    int LLI(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j, RunnableC1275220jI0 runnableC1275220jI0, int i3, C1271970jCl c1271970jCl, Map map);

    int LLIILZL(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map);

    int LLILLL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, int i4, long j, Runnable runnable, C1271970jCl c1271970jCl, int i5, Map map);

    long getLatestRenderCostMs();

    void release();

    void setCornerRadius(float f);

    void setEnable(boolean z);
}
