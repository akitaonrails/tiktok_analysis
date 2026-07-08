package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Pbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648330Pbr extends FrameLayout {
    public final int LL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;
    public List<Function1<View, Unit>> LLILLL;

    public View getHybirdContainerView() {
        return getChildAt(0);
    }

    public final void setDebugTag(String str) {
    }

    public final int getContainerType$search_release() {
        return this.LL;
    }

    public int getHybirdType() {
        return this.LL;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LLILLJJLI;
    }

    public final List<Function1<View, Unit>> getViewOnAddListeners() {
        return this.LLILLL;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        for (Function1<View, Unit> function1 : this.LLILLL) {
            if (view != null) {
                function1.invoke(view);
            }
        }
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public final void setViewOnAddListeners(List<Function1<View, Unit>> list) {
        this.LLILLL = list;
    }

    public C648330Pbr(Context context, int i) {
        super(context);
        this.LL = i;
        this.LLILLL = new ArrayList();
        if (i == 1) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        }
    }
}
