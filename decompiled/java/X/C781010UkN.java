package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteRepeatRequestSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781010UkN implements C0UU4 {
    public final Room LIZ;
    public final Fragment LIZIZ;
    public final View LIZJ;
    public final Context LIZLLL;
    public final DataChannel LJ;
    public DialogInterface LJFF;
    public final C781020UkO LJI = new C781020UkO();
    public long LJII;

    public final void LIZ() {
        Creator creator;
        if (DeleteRepeatRequestSetting.INSTANCE.disable() || !((creator = this.LIZ.creator) == null || creator.roomContinue == 0)) {
            int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
            if (value <= 0) {
                this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, null);
            } else {
                HandlerHook.viewPostDelay(this.LIZJ, new ARunnableS112S0100000_12(this, 52), TimeUnit.SECONDS.toMillis(value));
            }
        }
    }

    public final void LIZIZ() {
        DialogInterface dialogInterface = this.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (Intrinsics.LJFF(this.LJ.gg0(C781120UkY.class), Boolean.TRUE)) {
            return;
        }
        if (C500260Jjc.LJJJIL(this.LJ)) {
            C0U4R c0u4r = new C0U4R();
            c0u4r.LIZLLL = 2131842637;
            c0u4r.LIZJ = "pm_liveTryMode_tryModePage_shareToast";
            c0u4r.LJFF = true;
            c0u4r.LJII = this.LJ;
            C766270U4b.LJIIJ(c0u4r);
            return;
        }
        C786170Ush c786170Ush = new C786170Ush(this, 2);
        C781020UkO c781020UkO = this.LJI;
        if (!(!((ArrayList) c781020UkO.LIZ).isEmpty()) && !(!((ArrayList) c781020UkO.LIZIZ).isEmpty())) {
            this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, c786170Ush);
        } else {
            c786170Ush.run();
            this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, null);
        }
    }

    public C781010UkN(Room room, Fragment fragment, View view, Context context, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = fragment;
        this.LIZJ = view;
        this.LIZLLL = context;
        this.LJ = dataChannel;
    }
}
