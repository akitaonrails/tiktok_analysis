package Y;

import X.C13LP;
import X.C204615154r;
import X.C20578915fn;
import X.InterfaceC20579515ft;
import android.view.View;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ACListenerS62S0101000_31 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS62S0101000_31 aCListenerS62S0101000_31, View view) {
        EditProfileBadgeModel editProfileBadgeModel;
        ((C20578915fn) aCListenerS62S0101000_31.l0).LLILZ = Integer.valueOf(aCListenerS62S0101000_31.i1);
        C20578915fn c20578915fn = (C20578915fn) aCListenerS62S0101000_31.l0;
        InterfaceC20579515ft interfaceC20579515ft = c20578915fn.LL;
        List<EditProfileBadgeModel> list = c20578915fn.LLILLJJLI;
        if (list != null) {
            editProfileBadgeModel = (EditProfileBadgeModel) C13LP.LJJJLZIJ(aCListenerS62S0101000_31.i1, list);
        } else {
            editProfileBadgeModel = null;
        }
        interfaceC20579515ft.ah(editProfileBadgeModel);
        ((C20578915fn) aCListenerS62S0101000_31.l0).notifyDataSetChanged();
    }

    public static final void onClick$1(ACListenerS62S0101000_31 aCListenerS62S0101000_31, View view) {
        ((C204615154r) aCListenerS62S0101000_31.l0).LJIIIZ(aCListenerS62S0101000_31.i1);
    }

    public ACListenerS62S0101000_31(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
