package X;

import X.C1090830eUb;
import X.C1090860eUe;
import X.C1C7U;
import X.InterfaceC1090750eUT;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.slot.barragecontainer.effect.AlphaPlayerBarrageEffect$initHandler$1;
import com.bytedance.android.livesdk.livesetting.level.LiveBarrageReleasePlayerTimeSetting;
import com.bytedance.android.livesdk.model.message.AnimationData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0eUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090860eUe implements InterfaceC1091000eUs {
    public final InterfaceC1090750eUT LIZ;
    public C1090830eUb LIZIZ;
    public AlphaPlayerBarrageEffect$initHandler$1 LIZJ;
    public final long LIZLLL = LiveBarrageReleasePlayerTimeSetting.INSTANCE.getValue();
    public AnimationData LJ;
    public Context LJFF;
    public FrameLayout LJI;

    @Override // X.InterfaceC1091000eUs
    public final void LIZ() {
        AlphaPlayerBarrageEffect$initHandler$1 alphaPlayerBarrageEffect$initHandler$1;
        long j = this.LIZLLL;
        if (j > 0 && this.LIZIZ != null && (alphaPlayerBarrageEffect$initHandler$1 = this.LIZJ) != null) {
            C786410Ut5.LJLJJI(1, j, alphaPlayerBarrageEffect$initHandler$1);
        }
        C1090830eUb c1090830eUb = this.LIZIZ;
        if (c1090830eUb != null) {
            c1090830eUb.LIZJ();
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC1091000eUs
    public final void reset() {
        C1090830eUb c1090830eUb = this.LIZIZ;
        if (c1090830eUb != null) {
            c1090830eUb.LIZ();
        }
        C1090830eUb c1090830eUb2 = this.LIZIZ;
        if (c1090830eUb2 != null) {
            c1090830eUb2.LIZJ();
        }
        this.LIZIZ = null;
        AlphaPlayerBarrageEffect$initHandler$1 alphaPlayerBarrageEffect$initHandler$1 = this.LIZJ;
        if (alphaPlayerBarrageEffect$initHandler$1 != null) {
            alphaPlayerBarrageEffect$initHandler$1.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC1091000eUs
    public final void startPlay() {
        String str;
        C1090830eUb c1090830eUb;
        AnimationData animationData = this.LJ;
        String str2 = null;
        if (animationData != null) {
            str = animationData.geckoChannelName;
            str2 = animationData.fileName;
        } else {
            str = null;
        }
        LIZJ(str, str2);
        AlphaPlayerBarrageEffect$initHandler$1 alphaPlayerBarrageEffect$initHandler$1 = this.LIZJ;
        if (alphaPlayerBarrageEffect$initHandler$1 != null) {
            alphaPlayerBarrageEffect$initHandler$1.removeMessages(1);
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String strLJIIL = C1143780fs0.LJIIL(str, str2);
        if (TextUtils.isEmpty(strLJIIL) || (c1090830eUb = this.LIZIZ) == null) {
            return;
        }
        c1090830eUb.LIZLLL(strLJIIL);
    }

    public C1090860eUe(InterfaceC1090750eUT interfaceC1090750eUT) {
        this.LIZ = interfaceC1090750eUT;
    }

    public final void LIZJ(String str, String str2) {
        if (this.LIZIZ == null) {
            C1090830eUb c1090830eUb = new C1090830eUb(this.LJFF, this.LJI, true);
            this.LIZIZ = c1090830eUb;
            c1090830eUb.LIZIZ();
        }
        C1090830eUb c1090830eUb2 = this.LIZIZ;
        if (c1090830eUb2 != null) {
            c1090830eUb2.LJFF = str;
            c1090830eUb2.LJI = str2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.slot.barragecontainer.effect.AlphaPlayerBarrageEffect$initHandler$1] */
    @Override // X.InterfaceC1091000eUs
    public final void LIZIZ(AnimationData animationData, Context context, FrameLayout frameLayout) {
        this.LJ = animationData;
        this.LJFF = context;
        this.LJI = frameLayout;
        final InterfaceC1090750eUT interfaceC1090750eUT = this.LIZ;
        if (this.LIZJ == null && this.LIZLLL > 0) {
            final Looper mainLooper = Looper.getMainLooper();
            this.LIZJ = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.live.slot.barragecontainer.effect.AlphaPlayerBarrageEffect$initHandler$1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    InterfaceC1090750eUT interfaceC1090750eUT2;
                    C1C7U.LIZ("AlphaPlayerBarrageEffect@54a1.initHandler$1");
                    super.handleMessage(message);
                    if (message.what == 1 && (interfaceC1090750eUT2 = interfaceC1090750eUT) != null && !((SlotBarrageWidget) interfaceC1090750eUT2).z1()) {
                        C1090860eUe c1090860eUe = this;
                        C1090830eUb c1090830eUb = c1090860eUe.LIZIZ;
                        if (c1090830eUb != null) {
                            c1090830eUb.LIZJ();
                        }
                        c1090860eUe.LIZIZ = null;
                    }
                    C1C7U.LIZIZ("AlphaPlayerBarrageEffect@54a1.initHandler$1");
                }
            };
        }
        LIZJ(animationData.geckoChannelName, animationData.fileName);
    }
}
