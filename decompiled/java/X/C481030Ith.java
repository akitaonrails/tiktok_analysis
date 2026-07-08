package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ith, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C481030Ith extends C16FB {
    public RecyclerView LLLFZ;
    public Function0<Integer> LLLI;
    public float LLLII;
    public float LLLIIII;
    public final int LLLIIIIL;
    public boolean LLLIIIL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @Override // X.C16FB, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r1 = r10.getAction()
            r3 = 0
            if (r1 == 0) goto Lba
            r2 = 1
            if (r1 == r2) goto L15
            r0 = 2
            if (r1 == r0) goto L2d
            r0 = 3
            if (r1 == r0) goto L15
        L10:
            boolean r0 = super.onInterceptTouchEvent(r10)
            return r0
        L15:
            com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting.INSTANCE
            boolean r0 = r0.isArchOpt()
            if (r0 == 0) goto L10
            boolean r0 = r9.LLLIIIL
            if (r0 == 0) goto L10
            r9.LLLIIIL = r3
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent> r1 = com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.FQ2(r1, r0)
            goto L10
        L2d:
            float r8 = r10.getY()
            float r7 = r10.getX()
            float r0 = r9.LLLII
            float r8 = r8 - r0
            float r0 = r9.LLLIIII
            float r7 = r7 - r0
            int r0 = r9.LLLIIIIL
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb8
            r6 = 1
        L43:
            kotlin.jvm.functions.Function0<java.lang.Integer> r0 = r9.LLLI
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
        L51:
            androidx.recyclerview.widget.RecyclerView r1 = r9.LLLFZ
            if (r1 == 0) goto Lb4
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto Lb4
            r4 = 1
        L5d:
            androidx.recyclerview.widget.RecyclerView r0 = r9.LLLFZ
            if (r0 == 0) goto L64
            r0.canScrollVertically(r2)
        L64:
            com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting.INSTANCE
            boolean r0 = r0.isArchOpt()
            if (r0 == 0) goto Lac
            boolean r0 = r9.LLLIIIL
            if (r0 != 0) goto Lac
            float r1 = java.lang.Math.abs(r8)
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lac
            r9.LLLIIIL = r2
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent> r1 = com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.FQ2(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "abs(dy) > abs(dx): "
            r1.append(r0)
            float r0 = java.lang.Math.abs(r8)
            r1.append(r0)
            java.lang.String r0 = " > "
            r1.append(r0)
            float r0 = java.lang.Math.abs(r7)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiRefreshLayoutV2"
            X.C20441214yg.LIZIZ(r0, r1)
        Lac:
            if (r6 == 0) goto Lb3
            if (r5 != 0) goto Lb3
            if (r4 == 0) goto Lb3
            r3 = 1
        Lb3:
            return r3
        Lb4:
            r4 = 0
            goto L5d
        Lb6:
            r5 = 0
            goto L51
        Lb8:
            r6 = 0
            goto L43
        Lba:
            float r0 = r10.getY()
            r9.LLLII = r0
            float r0 = r10.getX()
            r9.LLLIIII = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481030Ith.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public C481030Ith(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLLIIIIL = ViewConfiguration.get(context).getScaledTouchSlop();
        new Rect();
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
    }
}
