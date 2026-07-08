package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Pcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648830Pcf extends FrameLayout {
    public Function1<? super Boolean, Unit> LL;
    public String LLILLJJLI;
    public C649290PdP LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    public final String getContainerId() {
        return this.LLILLJJLI;
    }

    public final Function1<Boolean, Unit> getOnVisibleChanged() {
        return this.LL;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(C484220Iyq c484220Iyq) {
        if (Intrinsics.LJFF(c484220Iyq.LIZ.optString("eventName"), "close_search_single_page_view")) {
            String strOptString = c484220Iyq.LIZ.optString("reactId");
            if (this.LLILLJJLI.length() > 0 && Intrinsics.LJFF(strOptString, this.LLILLJJLI)) {
                LIZ(null, null, null);
            }
        }
    }

    public final void setContainerId(String str) {
        this.LLILLJJLI = str;
    }

    public final void setOnVisibleChanged(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    public C648830Pcf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = "";
    }

    public final void LIZ(Fragment fragment, DynamicPatch dynamicPatch, Map<String, String> map) {
        if (dynamicPatch == null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            this.LLILLL = null;
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            Function1<? super Boolean, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            C622680Oba.LIZLLL(this);
            return;
        }
        if (this.LLILLL == null) {
            C649290PdP c649290PdP = new C649290PdP(fragment, getContext(), (LifecycleOwner) null, (EnumC648990Pcv) null, 28);
            this.LLILLL = c649290PdP;
            c649290PdP.LIZ(0, new ViewGroup.LayoutParams(-1, -1), this);
        }
        C649290PdP c649290PdP2 = this.LLILLL;
        if (c649290PdP2 != null) {
            c649290PdP2.LJFF(dynamicPatch, map, false, true, false, null);
        }
        C649290PdP c649290PdP3 = this.LLILLL;
        if (c649290PdP3 != null) {
            c649290PdP3.LJ = new C0R4T(this, 2);
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        Function1<? super Boolean, Unit> function12 = this.LL;
        if (function12 != null) {
            function12.invoke(Boolean.TRUE);
        }
        C622680Oba.LIZJ(this);
    }
}
