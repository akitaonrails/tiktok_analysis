package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122680fJy {
    public final C1122630fJt LIZ;
    public final DataChannel LIZIZ;
    public final Function0<Context> LIZJ;
    public int LJ;
    public Room LJFF;
    public boolean LJIIIZ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public String LJI = "";
    public String LJII = "";
    public C1122710fK1 LJIIIIZZ = new C1122710fK1(0);
    public final C1122860fKG LJIIJ = new C1122860fKG(new C1122910fKL(this));

    public C1122680fJy(C1122630fJt c1122630fJt, DataChannel dataChannel, C1122870fKH c1122870fKH) {
        this.LIZ = c1122630fJt;
        this.LIZIZ = dataChannel;
        this.LIZJ = c1122870fKH;
    }
}
