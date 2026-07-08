package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938920aXa extends C09AY implements Function1<C490701vd, Unit> {
    public final /* synthetic */ C938900aXY LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C938920aXa(C938900aXY c938900aXY, int i, boolean z) {
        super(1);
        this.LL = c938900aXY;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C490701vd c490701vd) {
        UserState userStateLJII;
        UserState userState;
        C490701vd c490701vd2 = c490701vd;
        if (!(c490701vd2.LLILZ instanceof C1623706Xj) && (userStateLJII = this.LL.LJII(c490701vd2)) != null) {
            C938900aXY c938900aXY = this.LL;
            int i = this.LLILLJJLI;
            boolean z = this.LLILLL;
            int i2 = 2;
            if (i == 3) {
                if (!z) {
                    i2 = userStateLJII.audioMuted;
                }
                userState = new UserState(null, "", null, 0L, 0, i2, 0, 0, 0, 0, 0L);
            } else {
                if (!z) {
                    i2 = userStateLJII.videoMuted;
                }
                userState = new UserState(null, "", null, 0L, 0, 0, i2, 0, 0, 0, 0L);
            }
            c938900aXY.LJI(userStateLJII, userState);
        }
        return Unit.LIZ;
    }
}
