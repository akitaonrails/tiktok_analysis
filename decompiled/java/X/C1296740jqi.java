package X;

import com.ss.android.ugc.aweme.service.profilerec.model.ProfileRecResponse;

/* JADX INFO: renamed from: X.0jqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296740jqi {
    public final EnumC1286380ja0 LIZ;
    public final ProfileRecResponse LIZIZ;

    public C1296740jqi() {
        this((EnumC1286380ja0) null, 3);
    }

    public /* synthetic */ C1296740jqi(EnumC1286380ja0 enumC1286380ja0, int i) {
        this((i & 1) != 0 ? EnumC1286380ja0.NOT_START : enumC1286380ja0, (i & 2) != 0 ? new ProfileRecResponse(null) : null);
    }

    public C1296740jqi(EnumC1286380ja0 enumC1286380ja0, ProfileRecResponse profileRecResponse) {
        this.LIZ = enumC1286380ja0;
        this.LIZIZ = profileRecResponse;
    }
}
