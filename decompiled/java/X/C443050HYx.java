package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.AiMojiBannerEntranceViewHolder$4", f = "AiMojiBannerEntranceViewHolder.kt", l = {106}, m = "invokeSuspend")
public final class C443050HYx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C443060HYy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443050HYx(C443060HYy c443060HYy, InterfaceC1364105Vn<? super C443050HYx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c443060HYy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443050HYx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AiMojiBannerEntranceViewHolder@7ccf.<init>$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SocialAvatarFeature socialAvatarFeatureLIZ = SocialAvatarFeature.LIZ.LIZ();
            if (socialAvatarFeatureLIZ != null) {
                if (C960203pA.LIZIZ(this.LLILLJJLI.itemView.getContext())) {
                    str = "social_avatar_reaction_dark";
                } else {
                    str = "social_avatar_reaction_light";
                }
                this.LL = 1;
                obj = socialAvatarFeatureLIZ.LIZJ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AiMojiBannerEntranceViewHolder@7ccf.<init>$4");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiMojiBannerEntranceViewHolder@7ccf.<init>$4");
            return unit;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            C443060HYy c443060HYy = this.LLILLJJLI;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            C1332130kln.LIZJ(c1331670kl3LJIIIZ, C06TB.STABLE_STICKER);
            c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) c443060HYy.itemView.findViewById(R.id.nl0));
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiMojiBannerEntranceViewHolder@7ccf.<init>$4");
        return unit2;
    }
}
