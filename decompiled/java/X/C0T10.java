package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T10, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T10 extends C09AY implements Function0<IPlayButtonAbility> {
    public final /* synthetic */ PlayButtonComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T10(PlayButtonComponentTemp playButtonComponentTemp) {
        super(0);
        this.LL = playButtonComponentTemp;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IPlayButtonAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        Fragment fragment = this.LL.LL.getFragment();
        if (fragment == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) == null) {
            return null;
        }
        return C1558520qew.LIZ(interfaceC665370Q7zLJ, IPlayButtonAbility.class, null);
    }
}
