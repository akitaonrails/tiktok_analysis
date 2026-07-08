package X;

import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI;
import com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams;
import com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS57S0010000_14;

/* JADX INFO: renamed from: X.0Ys5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887710Ys5 extends C883710Yld {
    public static final C01GW<C887710Ys5> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(373));

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZJ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view) {
        C887690Ys3.LIZ.getClass();
        final boolean z = C12859051l.LIZ().getBoolean("inbox_entrance_stick_to_top", false);
        int i = R.raw.icon_pin;
        int i2 = 2131837256;
        if (view != null) {
            IInboxLongPressMenuPopoverHelper.LIZ.getClass();
            IInboxLongPressMenuPopoverHelper iInboxLongPressMenuPopoverHelperLIZ = C887700Ys4.LIZ();
            if (iInboxLongPressMenuPopoverHelperLIZ != null) {
                if (!z) {
                    i2 = 2131837255;
                }
                String string = c19eg.getString(i2);
                if (z) {
                    i = R.raw.icon_pin_slash;
                }
                iInboxLongPressMenuPopoverHelperLIZ.LIZ(c19eg, Collections.singletonList(Collections.singletonList(new C443090HZb(string, new AwS57S0010000_14(z, 1), i, null, 0, null, 0, false, false, null, 952))), view);
                return;
            }
            return;
        }
        C1247530iZL c1247530iZL = new C1247530iZL();
        if (!z) {
            i2 = 2131837255;
        }
        c1247530iZL.LIZIZ(i2);
        if (z) {
            i = R.raw.icon_pin_fill;
        }
        c1247530iZL.LIZJ(i);
        c1247530iZL.LIZJ = 0;
        c1247530iZL.LJ = new View.OnClickListener() { // from class: X.0Ydj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C12859051l.LIZ().storeBoolean("inbox_entrance_stick_to_top", !z);
                C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
            }
        };
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJII(2131837247);
        c1390850mIV.LJFF(Collections.singletonList(c1247530iZL));
        c1390850mIV.LIZLLL(R.string.f1_);
        c1390850mIV.LIZJ().show(c19eg.getSupportFragmentManager(), "IMSessionLongPressHelper");
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        IMMessageRequestAPI.LIZ.getClass();
        IMMessageRequestAPI value = C887720Ys6.LIZIZ.getValue();
        if (value != null) {
            value.LIZ(c19eg, new MessageRequestPageNavParams(SystemClock.uptimeMillis(), "", null));
        }
        if (C289910BXx.LIZ()) {
            view.setLongClickable(false);
            Object context = view.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2191008iC(view, null), 2);
            }
        }
        C20684815ws.onEventV3("im_click_stranger_message");
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LIZ(interfaceC888500YtM, c19eg, view, map);
    }
}
