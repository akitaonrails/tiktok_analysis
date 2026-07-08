package X;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS92S1000000_7;
import wh6.AbS188S0400000_7;

/* JADX INFO: renamed from: X.0K3V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0K3V extends RecyclerView.ViewHolder {
    public void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
    }

    public C0K3V(View view) {
        super(view);
    }

    public final void P5(User user) {
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://user/profile").buildUpon().appendQueryParameter("uid", String.valueOf(user.getId()));
        String secUid = user.getSecUid();
        secUid.toString();
        C0K54.LIZ().LJ(this.itemView.getContext(), builderAppendQueryParameter.appendQueryParameter("sec_user_id", secUid).appendQueryParameter("enter_from", "sub_only_space").build().toString(), C2097608Jq.LJ());
    }

    public static void T5(SpaceCommentItem spaceCommentItem, TextView textView) {
        SpannableStringBuilder spannableStringBuilderLIZ = C510740K1g.LIZ(spaceCommentItem.text, 51, AFwS237S0000000_7.get$arr$(312));
        for (AtWithIndex atWithIndex : spaceCommentItem.atList) {
            int i = (int) atWithIndex.startIndex;
            int i2 = (int) atWithIndex.endIndex;
            if (i >= 0 && i2 <= spaceCommentItem.text.length() && i2 > i) {
                C510740K1g.LIZLLL(spannableStringBuilderLIZ, i, i2, 52, false, 33);
            }
        }
        textView.setText(spannableStringBuilderLIZ);
    }

    public static void S5(C0K3W c0k3w, List list, User user) {
        boolean z;
        Object c098200Yq;
        int i;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.R0(c0k3w, 8);
            return;
        }
        C786410Ut5.R0(c0k3w, 0);
        if (user == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        C0K77 c0k77LIZ = C0K3W.LIZ();
        if (c0k77LIZ != null) {
            c0k77LIZ.LJJIII(c0k3w.LL, bool);
        }
        C0K77 c0k77LIZ2 = C0K3W.LIZ();
        if (c0k77LIZ2 != null) {
            c0k77LIZ2.LJJJIL(c0k3w.LL);
        }
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c0k3w, 824);
        View view = c0k3w.LL;
        C0K77 c0k77LIZ3 = C0K3W.LIZ();
        if (view != null && c0k77LIZ3 != null) {
            ViewGroup.LayoutParams layoutParams = c0k3w.getLayoutParams();
            if (layoutParams != null && (i = layoutParams.height) > 0 && i != c0k3w.LLILLJJLI) {
                c0k3w.LLILLJJLI = i;
                try {
                    c0k77LIZ3.LJIILLIIL(i, view);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            try {
                c0k77LIZ3.LJI(view, list, user, awS551S0100000_7, null, false);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                C786410Ut5.R0(c0k3w, 8);
                return;
            }
            return;
        }
        C786410Ut5.R0(c0k3w, 8);
    }

    public final void L5(View view, User user, SpacePost spacePost, C0K3Y c0k3y) {
        if (user == null || view == null) {
            return;
        }
        C786410Ut5.I7(new AbS188S0400000_7(this, user, c0k3y, spacePost, 2), view);
    }

    public final void N5(View view, User user, SpacePost spacePost, C0K3Y c0k3y) {
        if (user == null || view == null) {
            return;
        }
        C786410Ut5.I7(new AbS188S0400000_7(this, user, c0k3y, spacePost, 3), view);
    }

    public static void R5(TextView textView, String str, String str2, String str3, int i, int i2) {
        int i3;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
        C442901nv c442901nv = new C442901nv(textView, colorDrawable, new AwS92S1000000_7(str, 18));
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        SpannableStringBuilder spannableStringBuilderLIZ = C510740K1g.LIZ("", Integer.valueOf(i), new C0K3X(c442901nv, c118300cf, str2, c118300cf2, str3));
        int i4 = c118300cf.element;
        if (i4 >= 0 && (i3 = c118300cf2.element) > i4) {
            C510740K1g.LIZLLL(spannableStringBuilderLIZ, i4, i3, i2, false, 33);
        }
        textView.setText(spannableStringBuilderLIZ);
    }
}
