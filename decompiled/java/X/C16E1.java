package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.livewindow.api.LiveStreamApi;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.16E1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.WindowLivePlayerCompat$start$3$1", f = "WindowLivePlayerCompat.kt", l = {200}, m = "invokeSuspend")
public final class C16E1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C16E0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C16E0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16E1(C16E0 c16e0, InterfaceC1364105Vn<? super C16E1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c16e0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C16E1(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C16E0 c16e0;
        EnterRoomConfig.RoomsData roomsData;
        StreamUrlStruct streamUrlStruct;
        Object liveStream = obj;
        C1C7U.LIZ("WindowLivePlayerCompat@3896.start$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c16e0 = this.LL;
                    C155000ia.LIZIZ(liveStream);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(liveStream);
                c16e0 = this.LLILLL;
                EnterRoomConfig enterRoomConfig = c16e0.LLILLL;
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    long j = roomsData.roomId;
                    C16E6 c16e6 = LiveStreamApi.LIZ;
                    this.LL = c16e0;
                    this.LLILLJJLI = 1;
                    c16e6.getClass();
                    liveStream = ((LiveStreamApi) C0NSL.LIZ().create(LiveStreamApi.class)).getLiveStream(j, this);
                    if (liveStream == objLJFF) {
                        C1C7U.LIZIZ("WindowLivePlayerCompat@3896.start$3$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("WindowLivePlayerCompat@3896.start$3$1");
                    return unit;
                }
            }
            streamUrlStruct = (StreamUrlStruct) ((BaseResponse) ((C0X52) liveStream).LIZIZ).getData();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (streamUrlStruct == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("WindowLivePlayerCompat@3896.start$3$1");
            return unit2;
        }
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        liveRoomStruct.stream_url = streamUrlStruct;
        c16e0.LLJ = liveRoomStruct;
        if (C948503nH.LIZJ(c16e0.LL)) {
            c16e0.LLJI.LJJIIJZLJL(c16e0.LLILZIL, liveRoomStruct, (FrameLayout) c16e0.LLIZLLLIL.findViewById(R.id.eqx), false, null, "", false, null);
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("WindowLivePlayerCompat@3896.start$3$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
