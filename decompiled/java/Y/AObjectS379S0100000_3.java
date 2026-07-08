package Y;

import X.AbstractC2098408Jy;
import X.AbstractC714940S2q;
import X.BinderC2410309cT;
import X.C070L;
import X.C070O;
import X.C070Q;
import X.C0C64;
import X.C0CBW;
import X.C1785006yu;
import X.C1938907id;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C823050WQl;
import X.EnumC1779550wPR;
import X.InterfaceC2453409jQ;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.alignpage.AlignPageOpt;
import com.bytedance.crash.Npth;
import com.bytedance.sysoptimizer.ConcurrentCopyThreadInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.legoImp.task.crypto.KeyVersion;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS379S0100000_3 implements Function0 {
    public final int $t;
    public Object l0;

    public static final Object invoke$7(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        return ((InterfaceC2453409jQ) aObjectS379S0100000_3.l0).get();
    }

    public static final Object invoke$8(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        return ((InterfaceC2453409jQ) aObjectS379S0100000_3.l0).get();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return this.l0;
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public AObjectS379S0100000_3(int i) {
        this.$t = i;
        if (7 - i != 0) {
            this.l0 = new InterfaceC2453409jQ() { // from class: X.09jN
                @Override // X.InterfaceC2453409jQ
                public final Object get() {
                    String str;
                    KeyVersion keyVersion = C2452909jL.LIZ().rsaKey.get("global");
                    if (keyVersion == null || (str = keyVersion.key) == null) {
                        str = "";
                    }
                    KeyVersion keyVersion2 = C2452909jL.LIZ().rsaKey.get("global");
                    return new Pair(str, Integer.valueOf(keyVersion2 != null ? keyVersion2.version : 9999));
                }
            };
        } else {
            this.l0 = new InterfaceC2453409jQ() { // from class: X.09jM
                @Override // X.InterfaceC2453409jQ
                public final Object get() {
                    String str;
                    C2452709jJ.LIZ.getClass();
                    String strLIZJ = C2452709jJ.LIZJ();
                    if (strLIZJ == null) {
                        strLIZJ = "global";
                    }
                    KeyVersion keyVersion = C2452909jL.LIZ().rsaKey.get(strLIZJ);
                    if (keyVersion == null || (str = keyVersion.key) == null) {
                        str = "";
                    }
                    KeyVersion keyVersion2 = C2452909jL.LIZ().rsaKey.get(strLIZJ);
                    return new Pair(str, Integer.valueOf(keyVersion2 != null ? keyVersion2.version : 0));
                }
            };
        }
    }

    public static final Object invoke$0(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        PlayerController playerController = (PlayerController) aObjectS379S0100000_3.l0;
        playerController.getClass();
        C070O c070o = new C070O();
        if (C070Q.LIZ()) {
            if (!C0CBW.LIZIZ()) {
                C1785006yu.LIZIZ();
            }
        } else {
            c070o.invoke();
        }
        C823050WQl.LJ().schedule(new ARunnableS103S0100000_3(playerController, 33), ((Number) C070L.LIZLLL.getValue()).longValue(), TimeUnit.MILLISECONDS);
        return null;
    }

    public static final Object invoke$1(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        boolean z;
        if (Build.VERSION.SDK_INT == 30 && Process.is64Bit()) {
            boolean z2 = false;
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ccopy_thread_info_fix", true);
            if ((iLJIJ & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((iLJIJ & 2) != 0) {
                z2 = true;
            }
            if (z || z2) {
                ConcurrentCopyThreadInfo.start((Context) aObjectS379S0100000_3.l0, z, z2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        EnumC1779550wPR enumC1779550wPR = (EnumC1779550wPR) aObjectS379S0100000_3.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAppLaunch(");
        sbLIZ.append(enumC1779550wPR);
        sbLIZ.append("), interval less 1 minute, not run");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        if (AlignPageOpt.is16kb((Context) aObjectS379S0100000_3.l0)) {
            Npth.addTag("is_16kb", "true");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJ(Boolean.TRUE, "is_16kb");
            C20684815ws.LJIILLIIL("tt_16kb_report", c2344009Gk.LIZ);
        } else {
            Npth.addTag("is_16kb", "false");
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJ(Boolean.FALSE, "is_16kb");
            C20684815ws.LJIILLIIL("tt_16kb_report", c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        final int[] iArr = (int[]) aObjectS379S0100000_3.l0;
        return new AbstractC2098408Jy(iArr) { // from class: X.08Jz
            public final int[] LL;
            public int LLILLJJLI;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LLILLJJLI < this.LL.length;
            }

            @Override // X.AbstractC2098408Jy
            public final int nextInt() {
                try {
                    int[] iArr2 = this.LL;
                    int i = this.LLILLJJLI;
                    this.LLILLJJLI = i + 1;
                    return iArr2[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLJJLI--;
                    throw new NoSuchElementException(e.getMessage());
                }
            }

            {
                this.LL = iArr;
            }
        };
    }

    public static final Object invoke$5(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        return new C1938907id((float[]) aObjectS379S0100000_3.l0);
    }

    public static final Object invoke$6(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        ((BinderC2410309cT) aObjectS379S0100000_3.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS379S0100000_3 aObjectS379S0100000_3) {
        AbstractC714940S2q abstractC714940S2q = (AbstractC714940S2q) aObjectS379S0100000_3.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC714940S2q.getClass().getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(abstractC714940S2q.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS379S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
