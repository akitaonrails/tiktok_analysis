package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664800tQM extends C09AY implements Function1<C1680570tpn, InterfaceC1680560tpm> {

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ AbstractC1664490tPr LL;
    public final /* synthetic */ AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> LLILLJJLI;
    public final /* synthetic */ ACTION LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;LX/0tQP<TAPI_COMPONENT;TSTATE;TACTION;>;TACTION;III)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1664800tQM(AbstractC1664490tPr abstractC1664490tPr, AbstractC1664830tQP abstractC1664830tQP, Object obj, int i, int i2, int i3) {
        super(1);
        this.LL = abstractC1664490tPr;
        this.LLILLJJLI = abstractC1664830tQP;
        this.LLILLL = obj;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1680560tpm invoke(C1680570tpn c1680570tpn) {
        this.LL.LLJJIJIIJIL = this.LLILLJJLI.G2();
        this.LL.LLJJIJIL = this.LLILLL;
        AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> abstractC1664830tQP = this.LLILLJJLI;
        Scene sceneFindSceneByTag = abstractC1664830tQP.LLILLL.findSceneByTag(abstractC1664830tQP.LLILZ);
        if (sceneFindSceneByTag != null) {
            this.LLILLJJLI.LLILLL.remove(sceneFindSceneByTag);
        }
        int i = this.LLILZ;
        if (!this.LLILLJJLI.LLILLL.isAdded(this.LL)) {
            if (i != 0) {
                AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> abstractC1664830tQP2 = this.LLILLJJLI;
                abstractC1664830tQP2.LLILLL.add(this.LLILZIL, this.LL, abstractC1664830tQP2.LLILZ, i);
            } else {
                AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> abstractC1664830tQP3 = this.LLILLJJLI;
                abstractC1664830tQP3.LLILLL.add(this.LLILZIL, this.LL, abstractC1664830tQP3.LLILZ);
            }
            this.LL.LLLLIILL();
        } else if (!this.LLILLJJLI.LLILLL.isShowing(this.LL)) {
            if (i != 0) {
                this.LLILLJJLI.LLILLL.show(this.LL, i);
            } else {
                this.LLILLJJLI.LLILLL.show(this.LL);
            }
            this.LL.LLLLIILL();
        }
        final AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> abstractC1664830tQP4 = this.LLILLJJLI;
        final AbstractC1664490tPr abstractC1664490tPr = this.LL;
        final int i2 = this.LLILZLL;
        return new InterfaceC1680560tpm() { // from class: X.0tQN
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                if (abstractC1664830tQP4.LLILLL.isAdded(abstractC1664490tPr)) {
                    if (abstractC1664830tQP4.LLILLL.isShowing(abstractC1664490tPr)) {
                        AbstractC1664490tPr abstractC1664490tPr2 = abstractC1664490tPr;
                        abstractC1664490tPr2.LLJJJ = false;
                        abstractC1664490tPr2.onHide();
                    }
                    int i3 = i2;
                    if (i3 != 0) {
                        abstractC1664830tQP4.LLILLL.hide(abstractC1664490tPr, i3);
                    } else {
                        abstractC1664830tQP4.LLILLL.hide(abstractC1664490tPr);
                    }
                }
            }
        };
    }
}
