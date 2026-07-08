package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.inbox.bulletin.animation.BulletinInputAnimationManagerAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623240OcU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C620650OVz LL;
    public final /* synthetic */ BulletinInputAnimationManagerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623240OcU(BulletinInputAnimationManagerAssem bulletinInputAnimationManagerAssem, C620650OVz c620650OVz) {
        super(0);
        this.LL = c620650OVz;
        this.LLILLJJLI = bulletinInputAnimationManagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        LinearLayout.LayoutParams layoutParams;
        if (this.LL.LIZJ() && (!this.LLILLJJLI.LLJILJIL.isEmpty())) {
            BulletinInputAnimationManagerAssem.bo(this.LLILLJJLI.LLJILJIL);
        }
        this.LLILLJJLI.LLJILJIL.clear();
        if (!this.LLILLJJLI.LLJIJIL.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) this.LLILLJJLI.LLJIJIL).entrySet()) {
                View view = (View) entry.getKey();
                C623320Occ c623320Occ = (C623320Occ) entry.getValue();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.weight = c623320Occ.LIZ;
                    layoutParams.height = c623320Occ.LIZIZ;
                    C786410Ut5.W5(view, layoutParams);
                }
                C786410Ut5.LJLLLLLL(c623320Occ.LIZJ, view);
            }
            ((LinkedHashMap) this.LLILLJJLI.LLJI).clear();
            ((LinkedHashMap) this.LLILLJJLI.LLJIJIL).clear();
        }
        return Unit.LIZ;
    }
}
