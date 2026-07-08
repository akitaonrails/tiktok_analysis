package X;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView$startPlay$2", f = "MMKLynxLiveView.kt", l = {897}, m = "invokeSuspend")
public final class C1775560wJ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveRoomStruct LL;
    public LiveRoomStruct LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ MMKLynxLiveView LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775560wJ0(String str, MMKLynxLiveView mMKLynxLiveView, long j, InterfaceC1364105Vn<? super C1775560wJ0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = mMKLynxLiveView;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1775560wJ0 c1775560wJ0 = new C1775560wJ0(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1775560wJ0.LLILZIL = obj;
        return c1775560wJ0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MMKLynxLiveView mMKLynxLiveView;
        long j;
        LiveRoomStruct liveRoomStruct;
        long jLongValue;
        LiveRoomStruct liveRoomStruct2;
        Long lLJIILIIL;
        C1ACD livePlayHelper;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("MMKLynxLiveView@8b4d.startPlay$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        Integer numLJ = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.LLILLL;
                    liveRoomStruct = this.LLILLJJLI;
                    liveRoomStruct2 = this.LL;
                    mMKLynxLiveView = (MMKLynxLiveView) this.LLILZIL;
                    C155000ia.LIZIZ(objLJLIIIL);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJLIIIL);
                C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILZIL, C0PEM.LIZJ, null, new C2370409Qo(this.LLILZLL, null), 2);
                mMKLynxLiveView = this.LLIZ;
                j = this.LLIZLLLIL;
                liveRoomStruct = new LiveRoomStruct();
                String str = mMKLynxLiveView.LLILZIL;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                liveRoomStruct.id = jLongValue;
                this.LLILZIL = mMKLynxLiveView;
                this.LL = liveRoomStruct;
                this.LLILLJJLI = liveRoomStruct;
                this.LLILLL = j;
                this.LLILZ = 1;
                objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("MMKLynxLiveView@8b4d.startPlay$2");
                    return objLJFF;
                }
                liveRoomStruct2 = liveRoomStruct;
            }
            liveRoomStruct.stream_url = (StreamUrlStruct) objLJLIIIL;
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sb = new StringBuilder("MMKLive ");
            sb.append(mMKLynxLiveView.hashCode());
            sb.append(",player ");
            C1AEE c1aee = mMKLynxLiveView.LLJJLIIIJLLLLLLLZ;
            if (c1aee != null && (livePlayHelper = c1aee.getLivePlayHelper()) != null) {
                numLJ = C2286608xc.LJ(livePlayHelper.hashCode());
            }
            sb.append(numLJ);
            String string = sb.toString();
            String str2 = "MyLynxLiveView isAttachedToWindow=" + ((C1AEE) mMKLynxLiveView.mView).isAttachedToWindow();
            c599820Nfo.getClass();
            C599820Nfo.LIZ(string, str2);
            if (((C1AEE) mMKLynxLiveView.mView).isAttachedToWindow()) {
                mMKLynxLiveView.LJJJJJ("trigger play " + SystemClock.elapsedRealtime());
                String str3 = mMKLynxLiveView.LLJLILLLLZIIL;
                if (str3 != null || mMKLynxLiveView.LLJLIL != null) {
                    ((C1AEE) mMKLynxLiveView.mView).setLivePlayerEntranceParam(new C1699360uK6(mMKLynxLiveView.LLJLIL, str3, mMKLynxLiveView.LLJLL, null, false, true, 40));
                }
                mMKLynxLiveView.LLJIJIL = true;
                C1749730vdL c1749730vdL = new C1749730vdL(mMKLynxLiveView.LLJ, liveRoomStruct2, (FrameLayout) mMKLynxLiveView.mView);
                mMKLynxLiveView.LLJILJIL = SystemClock.elapsedRealtime();
                mMKLynxLiveView.LLJJJJLIIL = true;
                ((C1AEE) mMKLynxLiveView.mView).LJ(c1749730vdL);
                mMKLynxLiveView.LJJJ();
            } else {
                mMKLynxLiveView.LLJJJJLIIL = false;
                mMKLynxLiveView.LJJJJJ("not attached");
            }
            C1851070yGn c1851070yGn = mMKLynxLiveView.LLJJL;
            if (c1851070yGn != null) {
                c1851070yGn.LIZ(mMKLynxLiveView.LLIZ);
            }
            mMKLynxLiveView.LLJLLL = C2286608xc.LJFF(SystemClock.elapsedRealtime() - j);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MMKLynxLiveView@8b4d.startPlay$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
