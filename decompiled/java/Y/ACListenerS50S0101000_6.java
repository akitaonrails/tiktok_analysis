package Y;

import X.C0WZX;
import X.C1376750lvl;
import X.C19EG;
import X.C2204961BRm;
import X.C434710H2v;
import X.C434850H3j;
import X.C444020Hb6;
import X.C451030HmP;
import X.C453310Hq5;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkFullFragment;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS50S0101000_6 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS50S0101000_6 aCListenerS50S0101000_6, View view) {
        C453310Hq5 c453310Hq5 = (C453310Hq5) aCListenerS50S0101000_6.l0;
        c453310Hq5.LL.invoke((C451030HmP) ListProtector.get(c453310Hq5.LLILLJJLI, aCListenerS50S0101000_6.i1), Integer.valueOf(aCListenerS50S0101000_6.i1));
    }

    public static final void onClick$1(ACListenerS50S0101000_6 aCListenerS50S0101000_6, View view) {
        C434850H3j c434850H3j = (C434850H3j) aCListenerS50S0101000_6.l0;
        c434850H3j.LL.LIZ((C1376750lvl) ListProtector.get(c434850H3j.LLILLJJLI, aCListenerS50S0101000_6.i1));
    }

    public static final void onClick$2(ACListenerS50S0101000_6 aCListenerS50S0101000_6, View view) {
        C19EG activity = ((ErrorCodeSdkFullFragment) aCListenerS50S0101000_6.l0).getActivity();
        if (activity != null) {
            C2204961BRm.LLJJJ(activity, aCListenerS50S0101000_6.i1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA2SBlSkA2VnCN0AQ9yqu6S+dg/9rYt36gtgeXi9m3jB+1040751ZhkHYl", null));
        }
        C19EG activity2 = ((ErrorCodeSdkFullFragment) aCListenerS50S0101000_6.l0).getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public static final void onClick$3(ACListenerS50S0101000_6 aCListenerS50S0101000_6, View view) {
        ((C444020Hb6) aCListenerS50S0101000_6.l0).LLILLJJLI.invoke(Integer.valueOf(aCListenerS50S0101000_6.i1));
    }

    public static final void onClick$4(ACListenerS50S0101000_6 aCListenerS50S0101000_6, View view) {
        ((C434710H2v) aCListenerS50S0101000_6.l0).LL.invoke(Integer.valueOf(aCListenerS50S0101000_6.i1));
    }

    public ACListenerS50S0101000_6(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
