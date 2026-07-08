package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.lang.Enum;

/* JADX INFO: renamed from: X.17zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21213417zw<W, VM extends ViewModel, T extends Enum<T>> extends AbstractC21213317zv<W, VM, T> {
    public final /* synthetic */ AnonymousClass1809 LLILZIL = new AnonymousClass1809();
    public String LLILZLL = "-1";

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        AnonymousClass1809 anonymousClass1809 = this.LLILZIL;
        anonymousClass1809.LIZ = 0L;
        anonymousClass1809.LIZIZ = true;
    }

    public static String LJJII(Room room) {
        User owner;
        FollowInfo followInfo;
        String string;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
            return "-1";
        }
        return string;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onCreate(Bundle bundle) {
        AnonymousClass1809 anonymousClass1809 = this.LLILZIL;
        anonymousClass1809.getClass();
        anonymousClass1809.LIZ = System.currentTimeMillis();
    }
}
