package Y;

import X.C0K1Z;
import X.C417410GYh;
import X.C495870JcX;
import X.C495980Jci;
import X.C510590K0r;
import X.EnumC495860JcW;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS13S1400000_7 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final void onClick$0(ACListenerS13S1400000_7 aCListenerS13S1400000_7, View view) {
        String str;
        Context context;
        C417410GYh c417410GYh = (C417410GYh) aCListenerS13S1400000_7.l1;
        if (c417410GYh != null && ViewTreeLifecycleOwner.get(c417410GYh) != null) {
            SOVBriefInfo sOVBriefInfo = (SOVBriefInfo) aCListenerS13S1400000_7.l2;
            C417410GYh c417410GYh2 = (C417410GYh) aCListenerS13S1400000_7.l1;
            C510590K0r c510590K0r = (C510590K0r) aCListenerS13S1400000_7.l3;
            Long l = (Long) aCListenerS13S1400000_7.l4;
            String str2 = aCListenerS13S1400000_7.s0;
            if (sOVBriefInfo != null && (str = sOVBriefInfo.awemeId) != null) {
                if (c417410GYh2 == null || (context = c417410GYh2.getContext()) == null) {
                    context = c510590K0r.itemView.getContext();
                }
                C0K1Z.LIZ.getClass();
                C0K1Z.LIZIZ(context, l, str, str2);
            }
        }
    }

    public static final void onClick$1(ACListenerS13S1400000_7 aCListenerS13S1400000_7, View view) {
        C495870JcX.LIZ((C495980Jci) aCListenerS13S1400000_7.l1, (EnumC495860JcW) aCListenerS13S1400000_7.l2, aCListenerS13S1400000_7.s0, (Map) aCListenerS13S1400000_7.l3);
        ((View.OnClickListener) aCListenerS13S1400000_7.l4).onClick(view);
    }

    public ACListenerS13S1400000_7(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.s0 = str;
    }
}
