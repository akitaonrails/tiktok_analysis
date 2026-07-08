package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarBusinessAbilityImpl;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aTC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936200aTC extends AbstractC1529700puS {
    public final AvatarBusinessAbilityImpl LIZ;
    public final Avatar LIZIZ;
    public boolean LIZJ;

    @Override // X.AbstractC1529700puS
    public final void LIZJ() {
        C09AJ<C935950aSn> c09aj = this.LIZ.LLIZLLLIL;
        if (c09aj != null) {
            c09aj.onNext(new C935950aSn(this.LIZIZ, EnumC935940aSm.STATE_SUCCESS, 100, this.LIZJ));
        }
        this.LIZ.LLJI.remove(Long.valueOf(this.LIZIZ.avatarId));
    }

    @Override // X.AbstractC1529700puS
    public final void LIZ(int i) {
        C09AJ<C935950aSn> c09aj = this.LIZ.LLIZLLLIL;
        if (c09aj != null) {
            c09aj.onNext(new C935950aSn(this.LIZIZ, EnumC935940aSm.STATE_FAILED, 0, this.LIZJ));
        }
        this.LIZ.LLJI.remove(Long.valueOf(this.LIZIZ.avatarId));
    }

    @Override // X.AbstractC1529700puS
    public final void LIZIZ(int i) {
        C09AJ<C935950aSn> c09aj = this.LIZ.LLIZLLLIL;
        if (c09aj != null) {
            c09aj.onNext(new C935950aSn(this.LIZIZ, EnumC935940aSm.STATE_PROGRESS, i, this.LIZJ));
        }
    }

    public C936200aTC(AvatarBusinessAbilityImpl avatarBusinessAbilityImpl, Avatar avatar, boolean z) {
        this.LIZ = avatarBusinessAbilityImpl;
        this.LIZIZ = avatar;
        this.LIZJ = z;
    }
}
