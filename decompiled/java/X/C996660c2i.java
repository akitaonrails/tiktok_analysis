package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996660c2i extends C09AY implements Function2<CommerceInteractionComponent, C996690c2l, Unit> {
    public C996660c2i() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C996690c2l c996690c2l) {
        String str;
        Object obj;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C996690c2l c996690c2l2 = c996690c2l;
        Object obj2 = null;
        if (c996690c2l2 != null) {
            str = c996690c2l2.LIZ;
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
                interfaceC1008930cMVIp.LJIILL(new C988650bpn(EnumC996680c2k.MUSIC_CLICK.getValue()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoEventDispatchState::MusicClick , aweme.aid = ");
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
