package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.live.EcLiveView$startPlay$2", f = "EcLiveView.kt", l = {913}, m = "invokeSuspend")
public final class C1735830vGv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveRoomStruct LL;
    public LiveRoomStruct LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1775590wJ3 LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735830vGv(String str, C1775590wJ3 c1775590wJ3, long j, InterfaceC1364105Vn<? super C1735830vGv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = c1775590wJ3;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1735830vGv c1735830vGv = new C1735830vGv(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1735830vGv.LLILZIL = obj;
        return c1735830vGv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1775590wJ3 c1775590wJ3;
        long j;
        LiveRoomStruct liveRoomStruct;
        long jLongValue;
        LiveRoomStruct liveRoomStruct2;
        Long lLJIILIIL;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("EcLiveView@af7c.startPlay$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.LLILLL;
                    liveRoomStruct = this.LLILLJJLI;
                    liveRoomStruct2 = this.LL;
                    c1775590wJ3 = (C1775590wJ3) this.LLILZIL;
                    C155000ia.LIZIZ(objLJLIIIL);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJLIIIL);
                C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILZIL, C0PEM.LIZJ, null, new C2370209Qm(this.LLILZLL, null), 2);
                c1775590wJ3 = this.LLIZ;
                j = this.LLIZLLLIL;
                liveRoomStruct = new LiveRoomStruct();
                String str = c1775590wJ3.LLJJI;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                liveRoomStruct.id = jLongValue;
                this.LLILZIL = c1775590wJ3;
                this.LL = liveRoomStruct;
                this.LLILLJJLI = liveRoomStruct;
                this.LLILLL = j;
                this.LLILZ = 1;
                objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("EcLiveView@af7c.startPlay$2");
                    return objLJFF;
                }
                liveRoomStruct2 = liveRoomStruct;
            }
            liveRoomStruct.stream_url = (StreamUrlStruct) objLJLIIIL;
            if (c1775590wJ3.isAttachedToWindow()) {
                c1775590wJ3.LJIJJ("trigger play " + SystemClock.elapsedRealtime());
                String str2 = c1775590wJ3.LLLFF;
                if (str2 != null || c1775590wJ3.LLLF != null) {
                    c1775590wJ3.setLivePlayerEntranceParam(new C1699360uK6(c1775590wJ3.LLLF, str2, c1775590wJ3.LLLFFI, null, false, true, 40));
                }
                c1775590wJ3.LLJJJIL = true;
                C1749730vdL c1749730vdL = new C1749730vdL(c1775590wJ3.LLJJIJIL, liveRoomStruct2, c1775590wJ3);
                c1775590wJ3.LLJJJJ = SystemClock.elapsedRealtime();
                c1775590wJ3.LLJZ = true;
                c1775590wJ3.LJ(c1749730vdL);
                c1775590wJ3.LJIIZILJ();
            } else {
                c1775590wJ3.LLJZ = false;
                c1775590wJ3.LJIJJ("not attached");
            }
            C1851070yGn c1851070yGn = c1775590wJ3.LLJZIJLIL;
            if (c1851070yGn != null) {
                c1851070yGn.LIZ(c1775590wJ3.LLJJIJI);
            }
            c1775590wJ3.LLLI = C2286608xc.LJFF(SystemClock.elapsedRealtime() - j);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcLiveView@af7c.startPlay$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
