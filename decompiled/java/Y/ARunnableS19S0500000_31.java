package Y;

import X.C09AJ;
import X.C1529880puk;
import X.C1537480q70;
import X.C15DF;
import X.C15DO;
import X.C167R;
import X.C167Z;
import X.C1C7U;
import X.C20358014lG;
import X.C20361214lm;
import X.C20421714vX;
import X.C20421814vY;
import X.C2193108iX;
import X.C259800zU;
import X.C786410Ut5;
import X.C976480bWA;
import X.C978440bZK;
import X.InterfaceC20422114vb;
import X.InterfaceC634840OvC;
import X.TextureViewSurfaceTextureListenerC1288630jdd;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaAnimationTimingSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS19S0500000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws Throwable {
        C15DO c15do = (C15DO) this.l0;
        long j = c15do.LIZ;
        if (j < 1000000) {
            C15DF c15df = (C15DF) this.l1;
            long j2 = c15do.LIZ;
            long j3 = ((C976480bWA) this.l4).LIZIZ;
            LiveMatchEnigmaAnimationTimingSettings liveMatchEnigmaAnimationTimingSettings = LiveMatchEnigmaAnimationTimingSettings.INSTANCE;
            c15df.LJFF(true, j2, j3, liveMatchEnigmaAnimationTimingSettings.getScoreAnimationDuration(liveMatchEnigmaAnimationTimingSettings.getScrollAnimationThreshold()), new AwS432S0200000_31((C15DF) this.l1, (ConstraintLayout) this.l3, 88));
            return;
        }
        C15DF c15df2 = (C15DF) this.l1;
        TuxTextView tuxTextView = c15df2.LLJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C978440bZK.LIZIZ(c15df2.LLJJJJ, j, ((C15DO) this.l2).LIZ, false, c15df2.LLJJIJIL));
        }
        View view = ((C15DF) this.l1).LLJLILLLLZIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = ((C15DF) this.l1).LLJLLIL;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd, 8);
        }
        C15DF c15df3 = (C15DF) this.l1;
        c15df3.LLLIZZ = true;
        c15df3.LJJIJIIJIL();
        C786410Ut5.LL(8, (ConstraintLayout) this.l3);
    }

    public final void LIZ$1() {
        C20361214lm c20361214lm = new C20361214lm(((InterfaceC20422114vb) this.l0).getGameplayId(), ((InterfaceC20422114vb) this.l0).getParams(), ((InterfaceC20422114vb) this.l0).getStateId().longValue(), C20358014lG.LIZ(), (PlayRule) this.l1);
        PlayRule playRule = (PlayRule) this.l1;
        C259800zU c259800zU = (C259800zU) this.l3;
        C20421814vY c20421814vY = (C20421814vY) this.l2;
        C20421714vX c20421714vX = new C20421714vX(c259800zU, c20421814vY, c20361214lm, (InterfaceC20422114vb) this.l0, (PlayRule) this.l4);
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = c20421814vY.IBridgeSdkContext;
        String containerID = interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null;
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        playRule.LJJIIZ(c20361214lm, c20421714vX, c1537480q70LIZIZ != null ? (C2193108iX) c1537480q70LIZIZ.LJFF(C2193108iX.class) : null);
    }

    public static final void run$0(ARunnableS19S0500000_31 aRunnableS19S0500000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.playRollingAnimationForTeamMatchIfNeeded$1");
        try {
            aRunnableS19S0500000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.playRollingAnimationForTeamMatchIfNeeded$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(ARunnableS19S0500000_31 aRunnableS19S0500000_31) {
        boolean zLIZ;
        C1C7U.LIZ("UploadImageForGameMethod@ea49.handle$2$1$1");
        try {
            try {
                C09AJ c09aj = (C09AJ) aRunnableS19S0500000_31.l0;
                C167R c167r = (C167R) aRunnableS19S0500000_31.l1;
                String str = c167r.LLILZIL;
                if (str == null) {
                    str = null;
                }
                c09aj.onNext(c167r.LIZJ(str, (byte[]) aRunnableS19S0500000_31.l2, (String) ((C259800zU) aRunnableS19S0500000_31.l3).element, (C167Z) aRunnableS19S0500000_31.l4));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((C09AJ) aRunnableS19S0500000_31.l0).onError(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadImageForGameMethod@ea49.handle$2$1$1");
    }

    public static final void run$2(ARunnableS19S0500000_31 aRunnableS19S0500000_31) {
        boolean zLIZ;
        C1C7U.LIZ("OpenGameplaySettingPageMethod@6aaf.handle$1$1$1");
        try {
            aRunnableS19S0500000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenGameplaySettingPageMethod@6aaf.handle$1$1$1");
    }

    public ARunnableS19S0500000_31(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
