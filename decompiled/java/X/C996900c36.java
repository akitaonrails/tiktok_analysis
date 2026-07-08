package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996900c36 extends C09AY implements Function2<CommerceInteractionComponent, C688620Qzk, Unit> {
    public C996900c36() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C688620Qzk c688620Qzk) {
        String str;
        Object obj;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C688620Qzk c688620Qzk2 = c688620Qzk;
        Object obj2 = null;
        if (c688620Qzk2 != null) {
            str = c688620Qzk2.LIZ;
        } else {
            str = null;
        }
        C724270Sb3 c724270Sb3 = commerceInteractionComponent2.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent2.ip();
            if (interfaceC1008930cMVIp != null) {
                interfaceC1008930cMVIp.LJIILL(C996910c37.LIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoEventDispatchState::Share , awemeId = ");
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
