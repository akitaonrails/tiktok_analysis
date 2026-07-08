package X;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.CreateInfoRequest;

/* JADX INFO: renamed from: X.0UPP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.CreateInfoCache$preRequest$2$1", f = "CreateInfoCache.kt", l = {171}, m = "invokeSuspend")
public final class C0UPP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0UPM>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UPP(String str, boolean z, InterfaceC1364105Vn<? super C0UPP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UPP c0upp = new C0UPP(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0upp.LLILLJJLI = obj;
        return c0upp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long j;
        int i;
        boolean z;
        RoomCreateInfo roomCreateInfo;
        C1C7U.LIZ("CreateInfoCache@cc22.preRequest$2$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                boolean z2 = this.LLILZ;
                boolean z3 = false;
                try {
                    if (str.length() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        j = CastLongProtector.parseLong(str);
                    } else {
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    j = 0;
                }
                try {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApiKt broadcastRoomApiKtLIZIZ = C01QD.LIZ().LIZIZ();
                CreateInfoRequest createInfoRequest = new CreateInfoRequest();
                createInfoRequest.lastTimeHashtagId = 0L;
                HashMap<String, String> mapLIZ = C0USY.LIZ.LIZ();
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                }
                createInfoRequest.bannerShowStats = mapLIZ;
                HashMap<String, String> mapLIZ2 = C0USY.LIZIZ.LIZ();
                if (mapLIZ2 == null) {
                    mapLIZ2 = new HashMap<>();
                }
                createInfoRequest.bannerClickStats = mapLIZ2;
                HashMap<String, String> mapLIZ3 = C0USY.LIZJ.LIZ();
                if (mapLIZ3 == null) {
                    mapLIZ3 = new HashMap<>();
                }
                createInfoRequest.bannerCloseStats = mapLIZ3;
                createInfoRequest.isTeen = C781270Ukn.LJIIL().isNeedProtectMinor();
                createInfoRequest.inviterId = j;
                createInfoRequest.hasEnteredTryMode = InterfaceC772600USk.zf.LIZIZ().booleanValue();
                if (z2) {
                    i = 6;
                } else {
                    i = 0;
                }
                createInfoRequest.clientBannerType = i;
                if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && C500260Jjc.LJJIFFI(InterfaceC772600USk.If.LIZIZ()) && C474650IjP.LIZ()) {
                    z3 = true;
                }
                createInfoRequest.firstOpenGoLivePage = z3;
                this.LL = 1;
                obj = broadcastRoomApiKtLIZIZ.getRoomCreateInfo(createInfoRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CreateInfoCache@cc22.preRequest$2$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null) {
                roomCreateInfo = (RoomCreateInfo) c470590Icr.data;
            } else {
                roomCreateInfo = null;
            }
            c098200Yq = new C0UPM(SystemClock.elapsedRealtime(), null, roomCreateInfo);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C0UPM(SystemClock.elapsedRealtime(), thM5exceptionOrNullimpl, null);
        }
        C1C7U.LIZIZ("CreateInfoCache@cc22.preRequest$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0UPM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
