package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0P4P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4P implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
        }
    }

    public C0P4P(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(C0P4P c0p4p, View view, boolean z) {
        ((BulletinEditAssem) c0p4p.l0).op().LLJIJIL = z;
    }

    public static final void onFocusChange$1(C0P4P c0p4p, View view, boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) ((View) c0p4p.l0).findViewById(R.id.d32);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    public static final void onFocusChange$2(C0P4P c0p4p, View view, boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) ((View) c0p4p.l0).findViewById(R.id.ppy);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }
}
