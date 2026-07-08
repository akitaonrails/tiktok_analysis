package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisDeprecatedFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;

/* JADX INFO: renamed from: X.1D0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2249001D0w extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C2249001D0w c2249001D0w) {
        int i = C2187451AjH.LIZ;
        MinisDeprecatedFragment minisDeprecatedFragment = (MinisDeprecatedFragment) c2249001D0w.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPressed,55 isWebGoBack:");
        sbLIZ.append(false);
        sbLIZ.append(", minisLoadError:");
        sbLIZ.append(minisDeprecatedFragment.LLIZLLLIL);
        sbLIZ.append(", getKitView:");
        sbLIZ.append((Object) null);
        sbLIZ.append(", webview canGoBack:");
        sbLIZ.append((Object) null);
        C2188811AlT.LIZIZ(sbLIZ);
        minisDeprecatedFragment.SR(EnumC2196901AyW.BACKPRESS);
    }

    public static final void LIZIZ$1(C2249001D0w c2249001D0w) {
        boolean zLJJIII;
        InterfaceC1541990qEH kitView;
        WebKitView webKitView;
        InterfaceC1541990qEH kitView2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        int i = C2187451AjH.LIZ;
        MinisFragment minisFragment = (MinisFragment) c2249001D0w.l0;
        if (minisFragment.LLJLLIL == null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = minisFragment.LLJ) != null) {
            zLJJIII = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII();
        } else {
            zLJJIII = false;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = minisFragment.LLJ;
        Boolean boolValueOf = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView();
        } else {
            kitView = null;
        }
        if (kitView instanceof WebKitView) {
            webKitView = (WebKitView) kitView;
        } else {
            webKitView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPressed,55 isWebGoBack:");
        sbLIZ.append(zLJJIII);
        sbLIZ.append(", minisLoadError:");
        sbLIZ.append(minisFragment.LLJLLIL);
        sbLIZ.append(", getKitView:");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = minisFragment.LLJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
            kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView();
        } else {
            kitView2 = null;
        }
        sbLIZ.append(kitView2);
        sbLIZ.append(", webview canGoBack:");
        if (webKitView != null) {
            boolValueOf = Boolean.valueOf(webKitView.canGoBack());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zLJJIII) {
            minisFragment.SR(EnumC2196901AyW.BACKPRESS, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249001D0w(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
