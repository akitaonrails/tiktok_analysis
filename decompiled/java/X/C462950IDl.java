package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462950IDl implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;

    public static final void LIZ$3(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$0(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$2(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    public C462950IDl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C21647019ng) ((Pair) c462950IDl.l0).getFirst()).LJI(true);
    }

    public static final void LIZ$1(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LJLLLLLL(8, ((C459250Hzf) c462950IDl.l0).mView);
    }

    public static final void LIZ$2(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
        C786410Ut5.LLLLZLL((TuxTextView) c462950IDl.l0, 8);
    }

    public static final void LIZIZ$3(C462950IDl c462950IDl, InterfaceC1844880y6o interfaceC1844880y6o) {
        float value = interfaceC1844880y6o.getValue();
        View view = ((RepostInteractPanel) c462950IDl.l0).getView();
        if (view != null) {
            C441580HTg.LIZ((int) value, view);
        }
    }
}
