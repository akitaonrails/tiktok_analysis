package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996650c2h extends C09AY implements Function2<CommerceInteractionComponent, C291001Au<? extends C586100Mym>, Unit> {
    public C996650c2h() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C291001Au<? extends C586100Mym> c291001Au) {
        C586100Mym c586100Mym;
        String aid;
        Object obj;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C291001Au<? extends C586100Mym> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c586100Mym = (C586100Mym) c291001Au2.LIZ) != null && !c586100Mym.LIZIZ) {
            Aweme aweme = c586100Mym.LIZ;
            Object obj2 = null;
            if (aweme != null) {
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
                    interfaceC1008930cMVIp.LJIILL(new C988650bpn(EnumC996680c2k.LIKE_CLICK.getValue()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoEventDispatchState::LikeClick , aweme.aid = ");
                C724270Sb3 c724270Sb32 = commerceInteractionComponent2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                sbLIZ.append(((VideoItemParams) obj2).getAweme().getAid());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return Unit.LIZ;
    }
}
