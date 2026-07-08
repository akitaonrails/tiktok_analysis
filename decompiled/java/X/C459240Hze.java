package X;

import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459240Hze implements InterfaceC1891350zJl {
    public final SocialAvatarStickerStruct LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C459240Hze(SocialAvatarStickerStruct socialAvatarStickerStruct) {
        this.LL = socialAvatarStickerStruct;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
