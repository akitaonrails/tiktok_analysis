package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* JADX INFO: renamed from: X.09r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500809r4 implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
        }
    }

    public C2500809r4(Context context, int i) {
        this.$t = i;
        this.l0 = context;
    }

    public static final void onAccountResult$0(C2500809r4 c2500809r4, int i, boolean z, int i2, User user) {
        Context context = (Context) c2500809r4.l0;
        AwemeRedBadgerManager.LLILLL.getClass();
        AwemeRedBadgerManager.LIZIZ(context);
    }

    public static final void onAccountResult$1(C2500809r4 c2500809r4, int i, boolean z, int i2, User user) {
        Context context = (Context) c2500809r4.l0;
        AwemeRedBadgerManager.LLILLL.getClass();
        AwemeRedBadgerManager.LIZIZ(context);
    }
}
