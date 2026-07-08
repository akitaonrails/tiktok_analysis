package X;

import Y.ARunnableS86S0200000_17;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectMessagePreloadTimeoutSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0fmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140290fmN extends AbstractC1140540fmm {
    public C1140290fmN(AbstractC1140540fmm abstractC1140540fmm) {
        super(abstractC1140540fmm);
    }

    @Override // X.AbstractC1140540fmm
    public final void LIZ(final AbstractC1140580fmq abstractC1140580fmq, C1139900flk c1139900flk) {
        C786410Ut5.LJLIIL(((long) LiveGiftEffectMessagePreloadTimeoutSetting.INSTANCE.getValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C783270Uo1.LIZJ(), new ARunnableS86S0200000_17(c1139900flk, abstractC1140580fmq, 64));
        AbstractC1140540fmm abstractC1140540fmm = this.LIZ;
        if (abstractC1140540fmm != null) {
            abstractC1140540fmm.LIZ(new AbstractC1140580fmq(abstractC1140580fmq) { // from class: X.0fmX
                @Override // X.AbstractC1140580fmq
                public final void LIZ(C1139900flk c1139900flk2) {
                    if (c1139900flk2 != null) {
                        c1139900flk2.LJII = false;
                    }
                    AbstractC1140580fmq abstractC1140580fmq2 = this.LIZ;
                    if (abstractC1140580fmq2 != null) {
                        abstractC1140580fmq2.LIZ(c1139900flk2);
                    }
                }
            }, c1139900flk);
        }
    }
}
