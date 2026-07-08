package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.insertion.communicate.ClickSugAbility;

/* JADX INFO: renamed from: X.0PUV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        ClickSugAbility clickSugAbility;
        if (view != null && C07F4.LIZ() && (clickSugAbility = (ClickSugAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ClickSugAbility.class, null)) != null) {
            clickSugAbility.Ua(view);
        }
    }

    public static final void LIZIZ(Aweme aweme, View view, C653660PkS c653660PkS, EnumC645610PTz enumC645610PTz, boolean z, boolean z2) {
        if (view == null || !C07F4.LIZ()) {
            return;
        }
        try {
            ClickSugAbility clickSugAbility = (ClickSugAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ClickSugAbility.class, null);
            if (clickSugAbility != null) {
                clickSugAbility.n61(aweme, view, c653660PkS, enumC645610PTz, z, z2);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
