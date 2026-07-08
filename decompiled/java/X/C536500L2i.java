package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536500L2i {
    public final Activity LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 357));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 358));

    public C536500L2i(Activity activity) {
        this.LIZ = activity;
    }

    public final void LIZ(int i, String str, String str2, String str3, Function1 function1) {
        if (i != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        if (this.LIZIZ.getValue() != null && ((ViewGroup) this.LIZIZ.getValue()).indexOfChild((View) this.LIZJ.getValue()) > -1) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        try {
            NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!C0LE0.LIZIZ(str3).featuresList.contains("UGC_ASYNC_I2V")) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        if (this.LIZIZ.getValue() == null || ((ViewGroup) this.LIZIZ.getValue()).indexOfChild((View) this.LIZJ.getValue()) <= -1) {
            View view = (View) this.LIZJ.getValue();
            if (view != null) {
                C375780EoK.LIZIZ(view, true);
            }
            ViewGroup viewGroup = (ViewGroup) this.LIZIZ.getValue();
            if (viewGroup != null) {
                viewGroup.addView((View) this.LIZJ.getValue(), new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
        WeakReference weakReference = new WeakReference(this.LIZ);
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJJIZ(str, "", str2, new AwS217S0300000_8(weakReference, (WeakReference<Activity>) this, (C536500L2i) function1, (Function1<? super Boolean, Unit>) 23));
        }
    }
}
