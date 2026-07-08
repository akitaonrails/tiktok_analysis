package X;

import com.bytedance.android.live.liveinteract.api.event.GuestSettingChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924310aA1 {
    public static final /* synthetic */ int LJI = 0;
    public final DataChannel LIZ;
    public C924340aA4 LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(93));
    public final C11NJ LIZLLL = new C11NJ();
    public final List<Function0<Unit>> LJ = new ArrayList();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);

    static {
        new C924330aA3();
    }

    public final void LIZIZ() {
        this.LJFF.compareAndSet(true, false);
        Function0 function0 = (Function0) C19719612Di.LJJIIZI(this.LJ);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C924310aA1(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        dataChannel.CQ2(GuestSettingChangeEvent.class, this, new AwS594S0100000_15(this, 318));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C924340aA4 r8) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924310aA1.LIZ(X.0aA4):void");
    }
}
