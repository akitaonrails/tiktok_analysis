package X;

import com.ss.android.ugc.aweme.property.AddMusicStickerConfig;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403940mdc {
    public static final AddMusicStickerConfig LIZ = new AddMusicStickerConfig(false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(11));

    public static final boolean LIZ() {
        C19292410dm currentUser;
        return ((AddMusicStickerConfig) LIZIZ.getValue()).creationMusicStickerEnabled && !C0CHQ.LIZ().getAccountService().LIZ() && ((currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser()) == null || currentUser.LIZLLL() != 3);
    }
}
