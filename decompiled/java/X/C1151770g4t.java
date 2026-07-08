package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.points.GamePointsMgr;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0g4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151770g4t implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZ$0(C1151770g4t c1151770g4t) {
    }

    public static final void LIZ$2(C1151770g4t c1151770g4t) {
    }

    public static final void LIZ$3(C1151770g4t c1151770g4t) {
    }

    public static final void LIZIZ$0(C1151770g4t c1151770g4t, Animatable animatable) {
    }

    public static final void LIZIZ$1(C1151770g4t c1151770g4t, Animatable animatable) {
    }

    public static final void LIZIZ$2(C1151770g4t c1151770g4t, Animatable animatable) {
    }

    public static final void LIZIZ$3(C1151770g4t c1151770g4t, Animatable animatable) {
    }

    public static final void LIZJ$2(C1151770g4t c1151770g4t, int i, int i2, String str) {
    }

    public static final void LIZJ$3(C1151770g4t c1151770g4t, int i, int i2, String str) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
            case 2:
                LIZIZ$2(this, animatable);
                break;
            case 3:
                LIZIZ$3(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
                LIZJ$2(this, i, i2, str);
                break;
            case 3:
                LIZJ$3(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                C20441214yg.LJI("FastGiftView", exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
            case 2:
                LIZLLL$2(this, str, exc);
                break;
            case 3:
                LIZLLL$3(this, str, exc);
                break;
        }
    }

    public static final void LIZ$1(C1151770g4t c1151770g4t) {
        ((C238400w2) c1151770g4t.l0).element = System.currentTimeMillis();
    }

    public C1151770g4t(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZLLL$1(C1151770g4t c1151770g4t, String str, Exception exc) {
        ((GamePointsMgr) c1151770g4t.l1).LLILZ = false;
    }

    public static final void LIZLLL$2(C1151770g4t c1151770g4t, String str, Exception exc) {
        ((C1111140f1M) c1151770g4t.l0).R5((C1110640f0Y) c1151770g4t.l1);
    }

    public static final void LIZLLL$3(C1151770g4t c1151770g4t, String str, Exception exc) {
        ((C1111160f1O) c1151770g4t.l0).R5((C160900jX) c1151770g4t.l1);
    }

    public static final void LIZJ$0(C1151770g4t c1151770g4t, int i, int i2, String str) {
        Room room;
        C20743416Fc c20743416Fc;
        C1123210fKp c1123210fKp = (C1123210fKp) c1151770g4t.l0;
        if (c1123210fKp.LLILZIL && (c20743416Fc = c1123210fKp.LLILZLL) != null) {
            C500260Jjc.LLFFF(c20743416Fc);
        }
        long j = ((Gift) c1151770g4t.l1).id;
        DataChannel dataChannel = ((C1123210fKp) c1151770g4t.l0).LLJ;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C1123080fKc.LIZLLL(false, j, room);
    }

    public static final void LIZJ$1(C1151770g4t c1151770g4t, int i, int i2, String str) {
        GamePointsMgr gamePointsMgr = (GamePointsMgr) c1151770g4t.l1;
        gamePointsMgr.LLILZ = true;
        gamePointsMgr.LLILZIL = System.currentTimeMillis() - ((C238400w2) c1151770g4t.l0).element;
    }
}
