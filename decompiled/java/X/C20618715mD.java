package X;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20618715mD extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ EditShareSelectFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20618715mD(EditShareSelectFragment editShareSelectFragment, String str, String str2) {
        super(2);
        this.LL = editShareSelectFragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        int friendCount;
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        Integer num2;
        bool.booleanValue();
        C0I0B c0i0b = C0I0B.LJFF;
        User currentUser = ((C1400340mXo) c0i0b.LIZ()).getCurrentUser();
        int i = 0;
        if (currentUser != null) {
            friendCount = currentUser.getFriendCount();
        } else {
            friendCount = 0;
        }
        int size = this.LL.SR().getState().LL.size();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LL.SR().LLJIJIL;
        c0i0b.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.put("enter_from", str);
        c13da.put("enter_method", str2);
        c13da.put("muf_cnt", String.valueOf(friendCount));
        c13da.put("possible_send_user_cnt", String.valueOf(size));
        if (str3 != null) {
            c13da.put("scenario", str3);
        }
        C20684815ws.LJIILLIIL("camera_dm_share_panel_show", c13da.build());
        if (C19508111Tz.LIZ()) {
            EditShareSelectFragment editShareSelectFragment = this.LL;
            if (editShareSelectFragment.LLJJJJJIL) {
                if (size > 0) {
                    i = 12;
                }
                editShareSelectFragment.LLJJJ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i + 224 + (size * 56)))));
                EditShareSelectFragment editShareSelectFragment2 = this.LL;
                if (editShareSelectFragment2.LLJL && (num2 = editShareSelectFragment2.LLJJJ) != null) {
                    editShareSelectFragment2.LLJJJ = Integer.valueOf(num2.intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                }
                EditShareSelectFragment editShareSelectFragment3 = this.LL;
                if (editShareSelectFragment3.LLJLILLLLZIIL && (num = editShareSelectFragment3.LLJJJ) != null) {
                    editShareSelectFragment3.LLJJJ = Integer.valueOf(num.intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
                }
                ConstraintLayout constraintLayout = this.LL.LLJ;
                if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                    layoutParams.height = this.LL.LLJJJ.intValue();
                }
            }
        }
        return Unit.LIZ;
    }
}
