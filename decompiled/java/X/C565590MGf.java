package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import jg5.AvS180S0000000_8;
import jg5.AvS181S0000000_22;
import jg5.AvS182S0000000_25;
import jg5.AvS540S0100000_8;
import jg5.AvS542S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S0400000_25;

/* JADX INFO: renamed from: X.0MGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565590MGf extends C09AY implements Function1<C1DRF, Unit> {
    public final /* synthetic */ Function1<C1DRF, Unit> LL;
    public final /* synthetic */ TikTokCameraBaseGroupScene LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ C1453870nw9<EnumC1641390sob> LLILZ;
    public final /* synthetic */ C564140MAq LLILZIL;
    public final /* synthetic */ C1645380sv2 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565590MGf(AwS120S0400000_25 awS120S0400000_25, TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene, ShortVideoContext shortVideoContext, C1453870nw9 c1453870nw9, C564140MAq c564140MAq, C1645380sv2 c1645380sv2) {
        super(1);
        this.LL = awS120S0400000_25;
        this.LLILLJJLI = tikTokCameraBaseGroupScene;
        this.LLILLL = shortVideoContext;
        this.LLILZ = c1453870nw9;
        this.LLILZIL = c564140MAq;
        this.LLILZLL = c1645380sv2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1DRF c1drf) {
        C1DRF c1drf2 = c1drf;
        c1drf2.LJFF(C19GS.class, null, new AvS540S0100000_8(this.LLILLJJLI, 65));
        c1drf2.LJFF(C19EG.class, null, new AvS540S0100000_8(this.LLILLJJLI, 70));
        c1drf2.LJFF(Activity.class, null, new AvS540S0100000_8(this.LLILLJJLI, 74));
        c1drf2.LJFF(Context.class, null, new AvS540S0100000_8(this.LLILLJJLI, 76));
        c1drf2.LJFF(Context.class, "applicationContext", new AvS540S0100000_8(this.LLILLJJLI, 92));
        c1drf2.LJFF(ShortVideoContext.class, null, new AvS540S0100000_8(this.LLILLL, 78));
        c1drf2.LJFF(BaseActivity.class, null, new AvS540S0100000_8(this.LLILLJJLI, 81));
        c1drf2.LJFF(ViewModelProvider.class, null, new AvS540S0100000_8(this.LLILLJJLI, 82));
        c1drf2.LJFF(C1659660tI4.class, null, new AvS540S0100000_8(this.LLILLJJLI, 84));
        c1drf2.LJFF(C565610MGh.class, null, new AvS180S0000000_8(6));
        c1drf2.LJFF(C580090Mp5.class, null, new AvS180S0000000_8(9));
        c1drf2.LJFF(InterfaceC1449160noY.class, null, new AvS542S0100000_25(this.LLILLL, 24));
        c1drf2.LJFF(InterfaceC1625220sOW.class, null, new AvS542S0100000_25(this.LLILLL, 26));
        c1drf2.LJFF(InterfaceC1628180sTI.class, null, new AvS182S0000000_25(7));
        c1drf2.LJFF(InterfaceC1630220sWa.class, null, new AvS181S0000000_22(15));
        c1drf2.LJFF(InterfaceC1623070sL3.class, null, new AvS180S0000000_8(12));
        c1drf2.LJFF(C1453870nw9.class, null, new AvS540S0100000_8(this.LLILZ, 103));
        c1drf2.LJFF(String.class, "sessionId", new AvS540S0100000_8(this.LLILLL, 93));
        c1drf2.LJFF(C564140MAq.class, null, new AvS540S0100000_8(this.LLILZIL, 105));
        c1drf2.LJFF(InterfaceC1622160sJa.class, null, new AvS182S0000000_25(8));
        c1drf2.LJFF(C1645380sv2.class, "lazyBeautyFilter", new AvS540S0100000_8(this.LLILZLL, 96));
        c1drf2.LJFF(C1655630tBZ.class, null, new AvS180S0000000_8(13));
        c1drf2.LJFF(C565600MGg.class, null, new AvS180S0000000_8(5));
        this.LL.invoke(c1drf2);
        return Unit.LIZ;
    }
}
