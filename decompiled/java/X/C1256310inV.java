package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;

/* JADX INFO: renamed from: X.0inV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256310inV implements InterfaceC20270614Tg {
    public final AvatarComponentView LIZ;

    @Override // X.InterfaceC20270614Tg
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC20270614Tg
    public final void LIZ() {
        this.LIZ.LJI(EnumC1607270rvZ.STORY, EnumC1256840ioM.END_ANIMATION, null);
    }

    @Override // X.InterfaceC20270614Tg
    public final void LIZJ() {
        this.LIZ.LJI(EnumC1607270rvZ.STORY, EnumC1256840ioM.START_ANIMATION, null);
    }

    public C1256310inV(AvatarComponentView avatarComponentView) {
        this.LIZ = avatarComponentView;
    }

    @Override // X.InterfaceC20270614Tg
    public final void LIZIZ(C1294720jnS c1294720jnS) {
        LIZJ();
    }
}
