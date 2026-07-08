package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0Uq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784550Uq5 {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo r7, android.content.Context r8, androidx.lifecycle.LifecycleOwner r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784550Uq5.LIZ(com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo, android.content.Context, androidx.lifecycle.LifecycleOwner):void");
    }

    public static final void LIZIZ(Context context, LifecycleOwner lifecycleOwner, EnumC784580Uq8 enumC784580Uq8, InterfaceC777420Uea interfaceC777420Uea) {
        if (enumC784580Uq8 != null) {
            int i = enumC784580Uq8.type;
            new AwS378S0200000_12(context, lifecycleOwner, 77);
            C784540Uq4.LIZ(context, lifecycleOwner, i, interfaceC777420Uea);
        } else {
            try {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
