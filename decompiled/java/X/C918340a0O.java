package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918340a0O extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1103320eok LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C918340a0O(C1103320eok c1103320eok) {
        super(1);
        this.LL = c1103320eok;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        User owner;
        String str2 = str;
        Room room = this.LL.LL;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        String strLIZ = C0KVU.LIZ(owner);
        if (!TextUtils.isEmpty(str2)) {
            C766270U4b.LJIIJJI(str2);
        } else {
            Room room2 = this.LL.LL;
            if (room2 != null && room2.getOwner() != null && !TextUtils.isEmpty(strLIZ)) {
                C766270U4b.LJIIIZ(C500260Jjc.LJ(this.LL.LLILZLL), C497740JfY.LJIJJ(2131844551, strLIZ));
            }
        }
        return Unit.LIZ;
    }
}
