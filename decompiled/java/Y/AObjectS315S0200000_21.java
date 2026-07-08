package Y;

import X.C1348730lCZ;
import X.C1355460lNQ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397660mTU;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C735370Ssx;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS315S0200000_21 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS315S0200000_21 aObjectS315S0200000_21, Object obj) {
        String string;
        String str;
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS315S0200000_21.l0;
        GiftStruct giftStruct = (GiftStruct) aObjectS315S0200000_21.l1;
        keyboardDialogFragment.getClass();
        ((C1397660mTU) obj).LIZJ = true;
        C19EG c19eg = keyboardDialogFragment.LLLLLLIL;
        if (c19eg != null) {
            C1355460lNQ.LIZ(keyboardDialogFragment.LLLLLLIL, giftStruct.diamondCount, keyboardDialogFragment.LLLLIILL, c19eg.getSupportFragmentManager());
        }
        Aweme aweme = keyboardDialogFragment.LLLIZZ;
        Object objValueOf = "";
        if (keyboardDialogFragment.getArguments() == null) {
            string = "";
        } else {
            string = keyboardDialogFragment.getArguments().getString("enterFrom");
        }
        GiftStruct value = keyboardDialogFragment.LLLLIILL.wQ2().getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        C1348730lCZ c1348730lCZ = keyboardDialogFragment.LLLLII;
        if (c1348730lCZ == null) {
            str = "";
        } else {
            str = c1348730lCZ.LLJJLIIIJLLLLLLLZ;
        }
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        if (value != null) {
            objValueOf = Long.valueOf(value.id);
        }
        c2344009Gk.LJ(objValueOf, "gift_id");
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        C20684815ws.LJIILLIIL("click_comment_recharge_popup", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS315S0200000_21 aObjectS315S0200000_21, Object obj) {
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS315S0200000_21.l0;
        View view = (View) aObjectS315S0200000_21.l1;
        GiftViewModel giftViewModel = keyboardDialogFragment.LLLLIILL;
        if (giftViewModel != null) {
            giftViewModel.wQ2().postValue(null);
        }
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131858206);
            c1389890mGx.LJI(R.attr.a04);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public AObjectS315S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
