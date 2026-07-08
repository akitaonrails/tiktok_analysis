package X;

import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC20647615qs("social_avatar_effect_avatar_generation_prompt")
public final class C442570HXb extends AbstractC20659615so<TuxPanel> {
    public final C19EG LL;
    public final EnumC439790HMj LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(578));

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        SocialAvatarEffectPopupService socialAvatarEffectPopupService = (SocialAvatarEffectPopupService) this.LLILLL.getValue();
        if (socialAvatarEffectPopupService != null) {
            return socialAvatarEffectPopupService.LIZLLL(this.LLILLJJLI);
        }
        return null;
    }

    public C442570HXb(C19EG c19eg, EnumC439790HMj enumC439790HMj) {
        this.LL = c19eg;
        this.LLILLJJLI = enumC439790HMj;
    }
}
