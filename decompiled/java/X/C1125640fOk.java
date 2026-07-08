package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125640fOk extends FrameLayout implements InterfaceC1125550fOb {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public String LLILLJJLI;
    public Function0<Boolean> LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
    }

    public final Function0<Boolean> getShouldBlockClick() {
        return this.LLILLL;
    }

    public final String getShowingUrl() {
        return this.LLILLJJLI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LL;
    }

    public final void setShouldBlockClick(Function0<Boolean> function0) {
        this.LLILLL = function0;
    }

    public final void setShowingUrl(String str) {
        this.LLILLJJLI = str;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public C1125640fOk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
