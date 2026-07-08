package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: renamed from: X.01Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C304101Fv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GuestShowdownAnchorViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C304101Fv(GuestShowdownAnchorViewModel guestShowdownAnchorViewModel, long j, int i, int i2) {
        super(0);
        this.LL = guestShowdownAnchorViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<GuestShowdownConfig> mutableLiveData = this.LL.LLILZIL;
        GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
        long j = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        guestShowdownConfig.duration = j;
        guestShowdownConfig.loserNum = i;
        guestShowdownConfig.winnerNum = i2;
        mutableLiveData.setValue(guestShowdownConfig);
        return Unit.LIZ;
    }
}
