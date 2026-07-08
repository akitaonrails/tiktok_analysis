package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import kotlin.jvm.internal.AwS27S0001000_12;
import kotlin.jvm.internal.AwS41S0301000_12;

/* JADX INFO: renamed from: X.0Uq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784540Uq4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context, LifecycleOwner lifecycleOwner, int i, InterfaceC777420Uea interfaceC777420Uea) {
        if (context != null && lifecycleOwner != null) {
            LIZIZ(context, lifecycleOwner, new AwS27S0001000_12(i, 0), new AwS41S0301000_12(context, lifecycleOwner, interfaceC777420Uea, i, 1));
        }
    }

    public static void LIZIZ(Context context, LifecycleOwner lifecycleOwner, AwS27S0001000_12 awS27S0001000_12, AwS41S0301000_12 awS41S0301000_12) {
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((AbstractC19484711Kz) awS27S0001000_12.invoke(C480460Ism.LIZLLL(LinkReviewApi.class))).LIZLLL(C11RD.LIZ(C11RB.LIZJ(lifecycleOwner, Lifecycle.Event.ON_DESTROY), new C0UO0()))).LIZ(new AfS181S0100000_12(awS41S0301000_12, 211), new C516201zk(context, 229));
    }
}
