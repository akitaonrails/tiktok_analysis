package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCountDownForAllExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01IT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IT extends C01IS {
    public boolean LJIJ;
    public long LJIJI;

    @Override // X.C01IS
    public final String LJIIIIZZ() {
        return "CountDownForAllV2GuestModel";
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C01IT(DataChannel dataChannel) {
        super(dataChannel);
        C356801a2<SeiAppData> c356801a2 = this.LJIILLIIL;
        C5185020h c5185020h = new C5185020h(this, 32);
        synchronized (c356801a2) {
            if (!c356801a2.LIZ()) {
                return;
            }
            if (C19719512Dh.LJFF(2, c5185020h) && c356801a2.LIZLLL.putIfAbsent(c5185020h, "cfa") == null) {
                c356801a2.LIZIZ.put("cfa", SeiCountDownForAllExtra.class);
            }
        }
    }

    @Override // X.C01IS, X.InterfaceC213600s2
    public final void LIZIZ(CountdownForAllContent countdownForAllContent) {
        super.LIZIZ(countdownForAllContent);
        this.LJIJI = countdownForAllContent.playId;
    }
}
