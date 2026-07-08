package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113110f4X {
    public final Function1<AbstractC1110800f0o<? extends AbstractC1136060ffY>, Unit> LIZ;
    public final Function2<Integer, Integer, Unit> LIZIZ;
    public final int LIZJ;
    public InterfaceC1112060f2q LJ;
    public int LJFF;
    public AbstractC1110800f0o LJI;
    public final BPEAHandler LJIIIZ;
    public final long LJIIJ;
    public final int LJIIJJI;
    public final Queue<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LJIIL;
    public final ArrayList<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LIZLLL = new ArrayList<>();
    public final ArrayList<Pair<ChatMessage, ChatMessage>> LJII = new ArrayList<>();
    public final C11PQ<Pair<ChatMessage, ChatMessage>> LJIIIIZZ = new C11PQ<>();

    public C1113110f4X(C1113220f4i c1113220f4i, C1113180f4e c1113180f4e) {
        this.LIZ = c1113220f4i;
        this.LIZIZ = c1113180f4e;
        this.LIZJ = 200;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIZ = bPEAHandler;
        this.LJIIL = new ArrayDeque(8);
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 253);
        this.LJIIJ = 3000L;
        this.LJIIJJI = 8;
        int i = LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue().showMaxSize;
        this.LIZJ = i;
        if (i <= 0) {
            this.LIZJ = 200;
        }
        C786410Ut5.LJLIIL(3000L, bPEAHandler, aRunnableS117S0100000_17);
    }
}
