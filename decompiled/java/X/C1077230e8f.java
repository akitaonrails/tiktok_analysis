package X;

import android.app.Dialog;
import android.view.View;
import com.ss.android.ugc.aweme.multi.maker.FriendsV3MusicTitleAnchorMaker;

/* JADX INFO: renamed from: X.0e8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077230e8f extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1077230e8f c1077230e8f, View view) {
        if (view != null) {
            ((FriendsV3MusicTitleAnchorMaker) c1077230e8f.l0).LJJJLL(view, (C2344009Gk) c1077230e8f.l1);
            if (((FriendsV3MusicTitleAnchorMaker) c1077230e8f.l0).LJIJI()) {
                C786410Ut5.LIZIZ((Dialog) c1077230e8f.l2);
            }
        }
    }

    public static final void LIZ$1(C1077230e8f c1077230e8f, View view) {
        if (view != null) {
            ((AbstractC1066890drz) c1077230e8f.l0).LJJJLL(view, (C2344009Gk) c1077230e8f.l1);
            if (((AbstractC1066890drz) c1077230e8f.l0).LJIJI()) {
                C786410Ut5.LIZIZ((Dialog) c1077230e8f.l2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077230e8f(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
