package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996670c2j extends C09AY implements Function2<CommerceInteractionComponent, C609850Nvz, Unit> {
    public C996670c2j() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C609850Nvz c609850Nvz) {
        Object obj;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C609850Nvz c609850Nvz2 = c609850Nvz;
        if (c609850Nvz2 != null && !c609850Nvz2.LIZ) {
            String str = c609850Nvz2.LIZIZ;
            C724270Sb3 c724270Sb3 = commerceInteractionComponent2.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
                InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent2.ip();
                if (interfaceC1008930cMVIp != null) {
                    interfaceC1008930cMVIp.LJIILL(new C988650bpn(EnumC996680c2k.FAVORITE_CLICK.getValue()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoEventDispatchState::FavoriteClick , aweme.aid = ");
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
