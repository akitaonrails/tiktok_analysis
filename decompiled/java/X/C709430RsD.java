package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709430RsD extends C09AY implements Function0<HomeTabAbility> {
    public final /* synthetic */ TranslationStatusAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709430RsD(TranslationStatusAssem translationStatusAssem) {
        super(0);
        this.LL = translationStatusAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HomeTabAbility invoke() {
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this.LL);
        if (mainActivityScopeLIZLLL != null) {
            return C0DMM.LIZ(mainActivityScopeLIZLLL);
        }
        return null;
    }
}
