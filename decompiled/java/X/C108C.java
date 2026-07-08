package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.108C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108C {
    public static final C108C LIZ = new C108C();
    public static long LIZIZ;

    public static void LIZ(Context context, LifecycleOwner lifecycleOwner, Function0 function0) {
        int i;
        int i2;
        C191880104w.LIZ.getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("privacy_settings_reminder", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1 && C255940A1g.LIZ() > 0) {
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(function0, (Function0<Unit>) 1073);
            if (context == null) {
                awS572S0100000_28.invoke();
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (C255940A1g.LIZ() == 1) {
                i = 2131846625;
            } else {
                i = 2131846622;
            }
            c1397580mTM.LJFF(i);
            if (C255940A1g.LIZ() == 1) {
                i2 = 2131846623;
            } else {
                i2 = 2131846620;
            }
            c1397580mTM.LIZ(i2);
            C985403tE.LIZ(c1397580mTM, new AwS237S0300000_28(context, lifecycleOwner, awS572S0100000_28, 21));
            c1397580mTM.LJII = false;
            c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(438));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        function0.invoke();
        AnonymousClass1072.LIZIZ(LIZIZ);
    }
}
