package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0qEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541940qEC extends ConstraintLayout implements InterfaceC1059280dfi {
    public final AttributeSet LL;
    public final int LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public InterfaceC1541990qEH LLIZ;
    public SparkContext LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public InterfaceC1542250qEh LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.InterfaceC1059280dfi
    public final void close() {
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() throws JSONException {
        C1530030puz.LIZIZ("SparkCustomView", "refresh", this.LLIZLLLIL);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.refresh();
        }
    }

    public final AttributeSet getAttrs() {
        return this.LL;
    }

    public final int getDefStyleAttr() {
        return this.LLILLJJLI;
    }

    public final boolean getKeepAlive() {
        return this.LLILZIL;
    }

    public final InterfaceC1541990qEH getKitView() {
        return this.LLIZ;
    }

    public final int getOptimization() {
        return this.LLILZ;
    }

    public final SparkContext getSparkContext() {
        return this.LLIZLLLIL;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LLILZLL;
    }

    public final long getViewCreatedTime() {
        return this.LLILLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541940qEC(Context context) {
        super(context, null, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL = null;
        this.LLILLJJLI = 0;
        this.LLILLL = jCurrentTimeMillis;
        this.LLILZ = 0;
        this.LLILZIL = false;
        C786410Ut5.Sd(R.layout.f_l, C786410Ut5.ne(context), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(com.bytedance.hybrid.spark.SparkContext r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541940qEC.e0(com.bytedance.hybrid.spark.SparkContext):void");
    }

    public final void setKeepAlive(boolean z) {
        this.LLILZIL = z;
    }

    public final void setKitView(InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LLIZ = interfaceC1541990qEH;
    }

    public final void setOptimization(int i) {
        this.LLILZ = i;
    }

    public final void setSparkContext(SparkContext sparkContext) {
        this.LLIZLLLIL = sparkContext;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LLILZLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public final void setViewCreatedTime(long j) {
        this.LLILLL = j;
    }
}
