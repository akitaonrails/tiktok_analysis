package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Srj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734610Srj extends C09AY implements Function2<CommerceInteractionComponent, C1209980ham, Unit> {
    public C734610Srj() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C1209980ham c1209980ham) {
        String aid;
        Object obj;
        Aweme aweme;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C1209980ham c1209980ham2 = c1209980ham;
        Object obj2 = null;
        if (c1209980ham2 != null && (aweme = c1209980ham2.LIZJ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C724270Sb3 c724270Sb3 = commerceInteractionComponent2.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(aid, ((VideoItemParams) obj).getAweme().getAid())) {
            InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent2.ip();
            if (interfaceC1008930cMVIp != null) {
                interfaceC1008930cMVIp.LJIILL(C734620Srk.LIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoEventDispatchState::Comment , aweme.aid = ");
            C724270Sb3 c724270Sb32 = commerceInteractionComponent2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            sbLIZ.append(((VideoItemParams) obj2).getAweme().getAid());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }
}
