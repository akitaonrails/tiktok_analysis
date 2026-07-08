package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0doC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064540doC extends AbstractC1023470cjx {
    public final Aweme LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C1064540doC(Aweme aweme) {
        super(new Object[0]);
        this.LIZ = aweme;
        C1064560doE.LIZ.getClass();
        this.LIZIZ = new C1023630ckD[]{new C1023630ckD<>(C1064560doE.LIZIZ, new AwS595S0100000_16(this, 338))};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJJIIZ(String str) {
        Aweme aweme = this.LIZ;
        if (aweme != null && aweme.isAd()) {
            try {
                switch (str.hashCode()) {
                    case -1678958759:
                        if (str.equals("close_button")) {
                            logAd(C1064550doD.LIZ, this.LIZ.getAwemeRawAd());
                        }
                        break;
                    case -1640319193:
                        if (str.equals("android_system_back")) {
                            logAd(C1064550doD.LIZLLL, this.LIZ.getAwemeRawAd());
                        }
                        break;
                    case 93819220:
                        if (str.equals("blank")) {
                            logAd(C1064550doD.LIZJ, this.LIZ.getAwemeRawAd());
                        }
                        break;
                    case 1089111664:
                        if (str.equals("slide_down")) {
                            logAd(C1064550doD.LIZIZ, this.LIZ.getAwemeRawAd());
                        }
                        break;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
