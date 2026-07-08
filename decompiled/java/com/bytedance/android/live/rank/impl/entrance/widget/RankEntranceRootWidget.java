package com.bytedance.android.live.rank.impl.entrance.widget;

import X.C1091250eVH;
import X.InterfaceC1842760y3O;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class RankEntranceRootWidget extends PerformProcessWidget implements InterfaceC1842760y3O {
    public C1091250eVH LL;
    public int LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h3x;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    @Override // X.InterfaceC1842760y3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJLIIIJJIZ() {
        /*
            r7 = this;
            int r0 = r7.LLILLJJLI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r2.intValue()
            r5 = 1
            r4 = 0
            if (r0 <= 0) goto L89
            r0 = 1
        Lf:
            r1 = 0
            if (r0 != 0) goto L20
            X.0eVH r0 = r7.LL
            if (r0 == 0) goto L7a
            int r0 = r0.getMeasuredWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L7a
        L20:
            int r6 = r2.intValue()
            if (r6 <= 0) goto L8d
            X.0eVH r2 = r7.LL
            if (r2 == 0) goto L77
            r0 = 2131387621(0x7f0a64e5, float:1.8395734E38)
            android.view.View r3 = r2.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L78
            android.view.View r2 = r3.getChildAt(r4)
        L39:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L75
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L75
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L75
            r2 = 1
        L48:
            if (r3 == 0) goto L4e
            android.view.View r1 = r3.getChildAt(r5)
        L4e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L73
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L73
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L73
        L5c:
            if (r2 == 0) goto L8c
            if (r5 == 0) goto L8c
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r6 = r6 - r0
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r6 = r6 - r0
            if (r6 < 0) goto L8b
            return r6
        L73:
            r5 = 0
            goto L5c
        L75:
            r2 = 0
            goto L48
        L77:
            r3 = r1
        L78:
            r2 = r1
            goto L39
        L7a:
            X.0eVH r0 = r7.LL
            if (r0 == 0) goto L8d
            int r0 = r0.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L8d
            goto L20
        L89:
            r0 = 0
            goto Lf
        L8b:
            return r4
        L8c:
            return r6
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceRootWidget.LJJLIIIJJIZ():int");
    }

    @Override // X.InterfaceC1842760y3O
    public final C1091250eVH C0() {
        return this.LL;
    }

    @Override // X.InterfaceC1842760y3O
    public final RecyclableWidgetManager m1() {
        return this.subWidgetManager;
    }

    @Override // X.InterfaceC1842760y3O
    public final void LLZZLLIL(RankEntranceWidget rankEntranceWidget) {
        show();
        this.subWidgetManager.load(R.id.sqo, (Widget) rankEntranceWidget, false);
    }

    @Override // X.InterfaceC1842760y3O
    public final void j(RankEntranceWidget rankEntranceWidget) {
        show();
        this.subWidgetManager.load(R.id.sqn, (Widget) rankEntranceWidget, false);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1091250eVH c1091250eVH = (C1091250eVH) this.contentView;
        this.LL = c1091250eVH;
        c1091250eVH.setOnPreMeasureListener(new AwS631S0100000_17(this, 3));
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1091250eVH c1091250eVH = this.LL;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
        enableSubWidgetManager();
        new RankEntranceManager(this.widgetCallback.getFragment(), this.dataChannel, this);
    }
}
