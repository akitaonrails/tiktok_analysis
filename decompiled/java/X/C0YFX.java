package X;

import com.bytedance.im.core.client.configs.IMCompletenessConfiguration;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YFX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YFX implements C0YGD {
    public final C0YEM LIZ;
    public final Function0<InterfaceC869500Y9c> LIZIZ;
    public final Function0<IMCompletenessConfiguration> LIZJ;
    public final Function0<Long> LIZLLL;

    @Override // X.C0YGD
    public final boolean LIZJ() {
        return this.LIZJ.invoke().isConversationRepairEnabled();
    }

    @Override // X.C0YGD
    public final boolean LIZLLL() {
        return this.LIZJ.invoke().isMessageRepairEnabled();
    }

    public C0YFX(C0YEM c0yem) {
        C0YFY c0yfy = new C0YFY(c0yem);
        C0YFZ c0yfz = new C0YFZ(c0yem);
        C1198704mX c1198704mX = new C1198704mX();
        this.LIZ = c0yem;
        this.LIZIZ = c0yfy;
        this.LIZJ = c0yfz;
        this.LIZLLL = c1198704mX;
    }

    @Override // X.C0YGD
    public final boolean LIZ(String str) {
        if (!this.LIZJ.invoke().isMessageCheckEnabled()) {
            return false;
        }
        long jLJJIJIIJIL = this.LIZIZ.invoke().LJJIJIIJIL(str);
        if (jLJJIJIIJIL <= 0) {
            return true;
        }
        if (this.LIZLLL.invoke().longValue() - jLJJIJIIJIL <= r4.messageCheckInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
            return false;
        }
        return true;
    }

    @Override // X.C0YGD
    public final void LIZIZ(int i) {
        this.LIZIZ.invoke().LJJJJI(i, this.LIZLLL.invoke().longValue());
    }

    @Override // X.C0YGD
    public final boolean LJ(int i) {
        if (!this.LIZJ.invoke().isConversationCheckEnabled()) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "CompletenessFrequencyController", "conv check not enabled", 4);
            return false;
        }
        long jLJJL = this.LIZIZ.invoke().LJJL(i);
        if (jLJJL <= 0) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "CompletenessFrequencyController", "first check", 4);
            return true;
        }
        if (this.LIZLLL.invoke().longValue() - jLJJL <= r8.conversationCheckInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
            return false;
        }
        return true;
    }

    @Override // X.C0YGD
    public final void LJFF(String str) {
        this.LIZIZ.invoke().LJJJJJ(this.LIZLLL.invoke().longValue(), str);
    }
}
