package X;

import com.bytedance.android.livesdk.livesetting.subscription.LivePCSAnchorTitleAnaliseWithAISetting;
import com.bytedance.android.livesdkapi.host.IHostPCS;

/* JADX INFO: renamed from: X.0fIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121990fIr implements InterfaceC1122010fIt {
    public final C1122020fIu LIZ;

    public static final String LIZ() {
        return LivePCSAnchorTitleAnaliseWithAISetting.INSTANCE.getAndroidScene();
    }

    @Override // X.InterfaceC1122010fIt
    public final C1122020fIu LIZJ() {
        return this.LIZ;
    }

    public C1121990fIr(IHostPCS iHostPCS, C1122000fIs c1122000fIs, C1121790fIX c1121790fIX, String str, String str2) {
        this.LIZ = new C1122020fIu(iHostPCS, c1122000fIs, c1121790fIX, str, str2);
    }
}
