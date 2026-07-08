package X;

import android.content.Context;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C187900nt {
    public final DataChannel LIZ;
    public InterfaceC188100nv LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(457));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(458));
    public final C01GW LJ = C452501pT.LIZIZ(new C5182020e(this, 533));

    public C187900nt(Context context, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        if (this.LIZIZ == null) {
            this.LIZIZ = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).xI2(context, dataChannel);
        }
    }
}
