package X;

import Y.AfS181S0100000_12;
import android.os.Handler;
import com.bytedance.android.live.copyrightreview.CountDownApi;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0THQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THQ {
    public final long LIZ;
    public final long LIZIZ;
    public final DataChannel LIZJ;
    public boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(8));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 19));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 21));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 20));

    public final void LIZ() {
        if (DataChannelGlobal.LLILZ.gg0(C930940aKi.class) != null) {
            if (Intrinsics.LJFF(this.LIZJ.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                C464950ILd.LJI.getClass();
                C464950ILd.LJ(null, 0);
            } else if (this.LJII.getValue() != null) {
                ((Runnable) this.LJII.getValue()).run();
            }
        }
    }

    public final void LIZIZ(long j) {
        C786410Ut5.LJLIIL(j, (Handler) this.LJ.getValue(), (Runnable) this.LJFF.getValue());
    }

    public final void LIZJ(int i) {
        this.LIZLLL = true;
        C480460Ism.LIZ().getClass();
        ((CountDownApi) C480460Ism.LIZLLL(CountDownApi.class)).countDown(this.LIZ, this.LIZIZ, i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00Ke
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CopyrightPerceptionHelper@cea1.sentConfirmRequest$1");
                C1C7U.LIZIZ("CopyrightPerceptionHelper@cea1.sentConfirmRequest$1");
            }
        }, new AfS181S0100000_12(this, 19));
    }

    public C0THQ(long j, long j2, DataChannel dataChannel) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = dataChannel;
    }
}
