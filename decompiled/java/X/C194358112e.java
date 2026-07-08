package X;

import android.app.Activity;
import com.bef.effectsdk.message.MessageCenter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.112e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194358112e implements MessageCenter.Listener {
    public final Activity LL;
    public final HashMap<Integer, C194359112f> LLILLJJLI = new HashMap<>();
    public int LLILLL;

    public C194358112e(Activity activity) {
        this.LL = activity;
    }

    public final void LIZ(int i) {
        if (this.LLILLJJLI.get(Integer.valueOf(i)) == null) {
            MessageCenter.addListener(this);
            this.LLILLJJLI.put(Integer.valueOf(i), new C194359112f(0, true, false));
            this.LLILLL = i;
            return;
        }
        for (Map.Entry<Integer, C194359112f> entry : this.LLILLJJLI.entrySet()) {
            if (entry.getKey().intValue() == i && !entry.getValue().LIZIZ) {
                MessageCenter.addListener(this);
                entry.getValue().LIZIZ = true;
                entry.getValue().LIZ = 0;
                this.LLILLL = i;
            }
        }
    }

    public final void LIZIZ(int i) {
        MessageCenter.removeListener(this);
        for (Map.Entry<Integer, C194359112f> entry : this.LLILLJJLI.entrySet()) {
            if (entry.getKey().intValue() == i) {
                entry.getValue().LIZIZ = false;
                entry.getValue().LIZ = 0;
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 81) {
            for (Map.Entry<Integer, C194359112f> entry : this.LLILLJJLI.entrySet()) {
                if (entry.getKey().intValue() == this.LLILLL) {
                    entry.getValue().LIZ++;
                }
            }
            C194359112f c194359112f = this.LLILLJJLI.get(Integer.valueOf(this.LLILLL));
            if (c194359112f != null && c194359112f.LIZ == 3 && !c194359112f.LIZJ) {
                C01TT.LIZLLL(new AwS573S0100000_29(this, 876));
                c194359112f.LIZJ = true;
                this.LLILLJJLI.put(Integer.valueOf(this.LLILLL), c194359112f);
            }
        }
    }
}
