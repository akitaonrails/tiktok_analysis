package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0ULK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0ULK extends FrameLayout {
    public boolean LL;
    public final Set<String> LLILLJJLI;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJFF() {
    }

    public final void LJI() {
        ViewGroup viewGroup;
        this.LL = false;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        }
        C0UKC.LJ();
        LJFF();
    }

    public final void setSelect(boolean z) {
        this.LL = z;
    }

    public C0ULK(Context context, int i) {
        super(context);
        C01GW c01gw = C485950J3x.LIZ;
        if (C485950J3x.LIZ(i) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C485950J3x.LIZIZ(context, i, this, true);
        } else {
            C0J3Y.LJFF(C0J3Y.LIZ, i, this, true, null, false, 56);
        }
        InterfaceC2262151DgT interfaceC2262151DgT = new InterfaceC2262151DgT() { // from class: X.0ULL
            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onPostCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onPreCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
            }

            @Override // X.InterfaceC2262151DgT
            public final /* synthetic */ void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
            }

            @Override // X.InterfaceC2262151DgT
            public final void onPostCreate(C0ULM c0ulm, Widget widget) {
                this.LIZ.LLILLJJLI.remove(widget.getClass().getSimpleName());
                C0ULK c0ulk = this.LIZ;
                if (c0ulk.LLILLJJLI.isEmpty()) {
                    c0ulk.LIZJ();
                }
            }

            @Override // X.InterfaceC2262151DgT
            public final void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                this.LIZ.LLILLJJLI.add(widget.getClass().getSimpleName());
            }
        };
        WidgetManager widgetManager = C0UKC.LIZIZ;
        if (widgetManager != null) {
            widgetManager.addWidgetEventListener(interfaceC2262151DgT);
        }
        this.LLILLJJLI = new LinkedHashSet();
    }
}
