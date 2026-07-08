package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessAssem;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19331910k9 extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C19331910k9 c19331910k9) {
        ((GoPasswordlessAssem) c19331910k9.l0).Go();
    }

    public static final void LIZIZ$1(C19331910k9 c19331910k9) {
        C19299010eq c19299010eqLJI;
        C10WS c10wsMR;
        MutableLiveData<Unit> mutableLiveDataBJ;
        C10UK c10uk = (C10UK) ((PNSAgeGateContainerFragment) c19331910k9.l0).LLIZLLLIL.getValue();
        if (c10uk != null) {
            c10uk.onEvent("RegQuitAttempt");
        }
        C10WT c10wt = (C10WT) ((PNSAgeGateContainerFragment) c19331910k9.l0).LLIZ.getValue();
        if (c10wt != null && (c19299010eqLJI = c10wt.LJI()) != null && Intrinsics.LJFF(c19299010eqLJI.canQuit, Boolean.TRUE) && (c10wsMR = ((PNSAgeGateContainerFragment) c19331910k9.l0).MR()) != null && (mutableLiveDataBJ = c10wsMR.bJ()) != null) {
            mutableLiveDataBJ.postValue(Unit.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19331910k9(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
