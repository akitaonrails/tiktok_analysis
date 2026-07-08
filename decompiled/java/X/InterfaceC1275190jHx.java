package X;

import android.view.View;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.0jHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1275190jHx {
    boolean LIZ(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1271970jCl c1271970jCl, RunnableC1275220jI0 runnableC1275220jI0, Map map, int[] iArr, ByteBuffer[] byteBufferArr);

    void LIZIZ(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1271970jCl c1271970jCl, RunnableC1275220jI0 runnableC1275220jI0, Map map, int[] iArr, ByteBuffer[] byteBufferArr);

    InterfaceC1274490jGp LIZJ();

    void LIZLLL(int i, int i2, int i3, int i4, int i5, long j, EnumC1274530jGt enumC1274530jGt, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map, float[] fArr);

    long getLatestRenderCostMs();

    void release();

    void setCornerRadius(float f);

    void setRenderTargetWindow(View view);
}
