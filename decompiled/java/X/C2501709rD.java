package X;

import Y.ARunnableS103S0100000_3;
import android.app.Activity;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501709rD implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C2501709rD c2501709rD) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
        }
    }

    public static final void LIZ$0(C2501709rD c2501709rD) {
        C1440005kM.LIZ(new IEvent() { // from class: X.07yE
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
        C2487409ou.LIZLLL(500L, new ARunnableS103S0100000_3((Activity) c2501709rD.l0, 124));
    }

    public static final void LIZ$1(C2501709rD c2501709rD) {
        ((Function1) c2501709rD.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZIZ$1(C2501709rD c2501709rD) {
        ((Function1) c2501709rD.l0).invoke(Boolean.TRUE);
    }

    public C2501709rD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
