package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C310001Ic extends C09AY implements Function2<Boolean, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ CountDownForAllV2AnchorWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C310001Ic(boolean z, CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = countDownForAllV2AnchorWidget;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel;
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
        C946050aj5 c946050aj5LIZ;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        if (this.LL && (countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LLILLJJLI.LL) != null && (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) != null && !zBooleanValue && (c946050aj5LIZ = c310701Ij.LIZ()) != null) {
            c946050aj5LIZ.LIZJ(iIntValue);
        }
        return Unit.LIZ;
    }
}
