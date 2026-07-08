package X;

import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.10Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19232210Lw extends C728670Si9<C1380110m1B, C10M0> implements InterfaceC1526205yG {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        M m = this.LL;
        if (((CommonResponse) ((AbstractC728630Si5) m).LLILLJJLI).statusCode == 0 && ((CommonResponse) ((AbstractC728630Si5) m).LLILLJJLI).result) {
            V v = this.LLILLJJLI;
            if (v != 0) {
                ((C10M0) v).LJJJ();
            }
            C1440005kM.LIZ(new IEvent() { // from class: X.0Szl
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            return;
        }
        if (this.LLILLJJLI != 0) {
            C0XIR c0xir = new C0XIR(((CommonResponse) ((AbstractC728630Si5) this.LL).LLILLJJLI).statusCode);
            c0xir.setErrorMsg(((CommonResponse) ((AbstractC728630Si5) this.LL).LLILLJJLI).statusMsg);
            ((C10M0) this.LLILLJJLI).LJJ(c0xir);
        }
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        V v = this.LLILLJJLI;
        if (v != 0) {
            ((C10M0) v).LJJ(exc);
        }
    }

    public C19232210Lw(C1380110m1B c1380110m1B, C10M0 c10m0) {
        super(c1380110m1B, c10m0);
        ((AbstractC728630Si5) this.LL).LIZ(this);
    }
}
