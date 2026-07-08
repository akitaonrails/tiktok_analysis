package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1389950mH3 extends C214906198m {
    public static int LLILZ;
    public static final Map LLILZIL = new LinkedHashMap();
    public final View LL;
    public final InterfaceC1365770le3 LLILLJJLI;
    public AbstractC1389960mH4 LLILLL;

    public void LJJIIJ(boolean z) {
    }

    public abstract void LJJIIZ(boolean z);

    public int LJJIJ() {
        return 80;
    }

    public abstract View LJJIJIIJI();

    @Override // X.C214906198m, android.widget.PopupWindow
    public void dismiss() {
        C1389920mH0 c1389920mH0LIZ = this.LLILLJJLI.LIZ();
        if (!c1389920mH0LIZ.LJIIJJI || c1389920mH0LIZ.LJII) {
            c1389920mH0LIZ.LJIIJJI = true;
            if (!c1389920mH0LIZ.LJI) {
                LJJIJIIJIL();
            } else {
                LJJIIZ(false);
                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 133));
            }
        }
    }

    public final void LJJIJIIJIL() {
        Function0<Unit> function0;
        try {
            super.dismiss();
            WeakReference<Function0<Unit>> weakReference = this.LLILLJJLI.LIZ().LJIIIZ;
            if (weakReference != null && (function0 = weakReference.get()) != null) {
                function0.invoke();
            }
            this.LLILLJJLI.LIZ().LJIIJJI = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void show() throws JSONException {
        AbstractC1389950mH3 abstractC1389950mH3;
        String localClassName;
        String tag;
        if (C0BTC.LIZ()) {
            C1389920mH0 c1389920mH0LIZ = this.LLILLJJLI.LIZ();
            CharSequence charSequence = c1389920mH0LIZ.LIZIZ;
            String str = "";
            if (charSequence == null) {
                charSequence = "";
            }
            Integer num = c1389920mH0LIZ.LIZJ;
            int iIntValue = num != null ? num.intValue() : -1;
            JSONObject jSONObject = new JSONObject();
            View contentView = getContentView();
            Activity activityLIZ = C0FNT.LIZ(contentView != null ? contentView.getContext() : null);
            if (activityLIZ == null || (localClassName = activityLIZ.getLocalClassName()) == null) {
                localClassName = "";
            }
            jSONObject.put("page_key", localClassName);
            C1390460mHs.LIZ.getClass();
            jSONObject.put("network_status", C1390460mHs.LIZIZ());
            jSONObject.put("message", charSequence);
            jSONObject.put("icon_res", iIntValue);
            jSONObject.put("has_animation", c1389920mH0LIZ.LJFF);
            jSONObject.put("has_dismiss_animation", c1389920mH0LIZ.LJI);
            jSONObject.put("across_activities", c1389920mH0LIZ.LJII);
            jSONObject.put("toast_class", getClass().getName());
            Fragment fragmentLIZ = C946803n0.LIZ(getContentView());
            jSONObject.put("host_fragment", fragmentLIZ != null ? fragmentLIZ.getClass().getName() : "");
            if (fragmentLIZ != null && (tag = fragmentLIZ.getTag()) != null) {
                str = tag;
            }
            jSONObject.put("fragment_tag", str);
            C793770VBv.LJII("tux_toast_show", null, jSONObject, null);
            C20684815ws.LJIJ("tux_toast_show", jSONObject);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        if (PopupMonitorServiceImpl.LJJJJIZL()) {
            C1390650mIB c1390650mIB = C1390650mIB.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-- on onTuxInternalPopupWindowShow and pending in map, ");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
            c1390650mIB.getClass();
            ((Map) PopupMonitorServiceImpl.LJIILIIL.getValue()).put(Integer.valueOf(hashCode()), 1);
        }
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        try {
            C1389920mH0 c1389920mH0LIZ2 = this.LLILLJJLI.LIZ();
            c1389920mH0LIZ2.LIZ = Long.valueOf(SystemClock.elapsedRealtime() + c1389920mH0LIZ2.LJ);
            showAtLocation(this.LL, LJJIJ(), 0, 0);
            PopupMonitorServiceImpl.LJJJI(this);
            C994003uc.LIZ();
            LJJIIJZLJL(LJJIJIIJI(), c1389920mH0LIZ2.LIZIZ);
            LJJIIJ(c1389920mH0LIZ2.LJFF);
            if (c1389920mH0LIZ2.LJFF) {
                LJJIIZ(true);
            }
            C786410Ut5.LJLIIL(c1389920mH0LIZ2.LJ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 134));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String simpleName = getClass().getSimpleName();
        Map map = LLILZIL;
        Pair pair = (Pair) ((LinkedHashMap) map).get(simpleName);
        if (pair == null) {
            pair = new Pair(null, null);
        }
        Reference reference = (Reference) pair.getFirst();
        Reference reference2 = (Reference) pair.getSecond();
        if (Intrinsics.LJFF(reference != null ? reference.get() : null, this.LL) && reference2 != null && (abstractC1389950mH3 = (AbstractC1389950mH3) reference2.get()) != null && !Intrinsics.LJFF(abstractC1389950mH3, this) && abstractC1389950mH3.isShowing()) {
            abstractC1389950mH3.LJJIJIIJIL();
        }
        map.put(simpleName, new Pair(new WeakReference(this.LL), new WeakReference(this)));
    }

    public final void LJJIJIL(AbstractC1389960mH4 abstractC1389960mH4) {
        C1389920mH0 c1389920mH0LIZ = this.LLILLJJLI.LIZ();
        if (c1389920mH0LIZ.LJIIJJI && !c1389920mH0LIZ.LJII) {
            return;
        }
        this.LLILLL = abstractC1389960mH4;
    }

    public AbstractC1389950mH3(View view, InterfaceC1365770le3 interfaceC1365770le3) {
        this.LL = view;
        this.LLILLJJLI = interfaceC1365770le3;
        setWidth(-1);
        setHeight(-1);
        setInputMethodMode(1);
        setClippingEnabled(false);
    }

    public void LJJIIJZLJL(View view, CharSequence charSequence) {
        view.announceForAccessibility(charSequence);
    }
}
