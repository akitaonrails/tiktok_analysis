package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.livesetting.game.GameFloatWindowMsgStrategySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Udo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776940Udo {
    public static final /* synthetic */ int LJI = 0;
    public DataChannel LIZ;
    public final int LJ;
    public final AtomicLong LIZIZ = new AtomicLong(0);
    public final LinkedList<Long> LIZLLL = new LinkedList<>();
    public int LJFF = -1;
    public C11JF LIZJ = (C11JF) C11NZ.LJJJJL(1, 1, TimeUnit.SECONDS, C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS181S0100000_12(this, 275), new C09JN() { // from class: X.00Rb
        @Override // X.C09JN
        public final void accept(Object obj) {
            C1C7U.LIZ("GameFreeTimeStrategy@4ba0.start$2");
            C20441214yg.LJ("GameSmallMsgStrategy", ((Throwable) obj).getMessage());
            C1C7U.LIZIZ("GameFreeTimeStrategy@4ba0.start$2");
        }
    });

    public C776940Udo(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LJ = 3;
        this.LJ = GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().strategyChatFreeTimeNum;
    }
}
