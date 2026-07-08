package X;

import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734410SrP extends C09AY implements Function2<CommerceInteractionComponent, C734360SrK, Unit> {
    public C734410SrP() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CommerceInteractionComponent commerceInteractionComponent, C734360SrK c734360SrK) {
        String str;
        Object obj;
        Object obj2;
        ILikeEffectService iLikeEffectService;
        Object obj3;
        CommerceInteractionComponent commerceInteractionComponent2 = commerceInteractionComponent;
        C734360SrK c734360SrK2 = c734360SrK;
        Object obj4 = null;
        if (c734360SrK2 != null) {
            str = c734360SrK2.LIZ;
        } else {
            str = null;
        }
        C724270Sb3 c724270Sb3 = commerceInteractionComponent2.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid()) && c734360SrK2 != null && c734360SrK2.LIZIZ) {
            InterfaceC1008930cMV interfaceC1008930cMVIp = commerceInteractionComponent2.ip();
            if (interfaceC1008930cMVIp != null) {
                interfaceC1008930cMVIp.LJIILL(C734430SrR.LIZ);
            }
            C724270Sb3 c724270Sb32 = commerceInteractionComponent2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (C1017070cZd.LJZL(((VideoItemParams) obj2).getAweme()) && (iLikeEffectService = (ILikeEffectService) commerceInteractionComponent2.LLLFFI.getValue()) != null && iLikeEffectService.LJIILLIIL()) {
                C724270Sb3 c724270Sb33 = commerceInteractionComponent2.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                C734390SrN.LIZ.getClass();
                ILikeEffectService iLikeEffectServiceLIZ = C734390SrN.LIZ();
                if (iLikeEffectServiceLIZ != null) {
                    iLikeEffectServiceLIZ.LJIIJJI(aweme, "is_playing");
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoEventDispatchState::DoubleDiggEvent , aweme.aid = ");
            C724270Sb3 c724270Sb34 = commerceInteractionComponent2.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            }
            sbLIZ.append(((VideoItemParams) obj4).getAweme().getAid());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }
}
