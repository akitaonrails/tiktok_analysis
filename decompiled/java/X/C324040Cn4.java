package X;

import Y.AfS0S1100100_4;
import Y.AfS173S0100000_4;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel$startPolling$1", f = "LiveShareStickerViewModel.kt", l = {132}, m = "invokeSuspend")
public final class C324040Cn4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveShareStickerViewModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324040Cn4(LiveShareStickerViewModel liveShareStickerViewModel, long j, String str, InterfaceC1364105Vn<? super C324040Cn4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveShareStickerViewModel;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324040Cn4 c324040Cn4 = new C324040Cn4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c324040Cn4.LLILLJJLI = obj;
        return c324040Cn4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("LiveShareStickerViewModel@53d1.startPolling$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            LiveShareStickerViewModel liveShareStickerViewModel = this.LLILLL;
            long j = this.LLILZ;
            String str = this.LLILZIL;
            liveShareStickerViewModel.getClass();
            C480460Ism.LIZ().getClass();
            liveShareStickerViewModel.LLILZ.LIZ(((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(String.valueOf(j), "live_share_story").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1100100_4(j, str, liveShareStickerViewModel, 1), new AfS173S0100000_4(liveShareStickerViewModel, 29)));
            long millis = TimeUnit.SECONDS.toMillis(5L);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(millis, this) == objLJFF) {
                C1C7U.LIZIZ("LiveShareStickerViewModel@53d1.startPolling$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveShareStickerViewModel@53d1.startPolling$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
