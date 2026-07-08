package X;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.player.live.lynx.ECLynxLiveView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.live.lynx.ECLynxLiveView$startPlay$1", f = "ECLynxLiveView.kt", l = {472}, m = "invokeSuspend")
public final class C1735820vGu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveRoomStruct LL;
    public LiveRoomStruct LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ECLynxLiveView LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735820vGu(String str, ECLynxLiveView eCLynxLiveView, InterfaceC1364105Vn<? super C1735820vGu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = eCLynxLiveView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1735820vGu c1735820vGu = new C1735820vGu(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1735820vGu.LLILZ = obj;
        return c1735820vGu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final ECLynxLiveView eCLynxLiveView;
        LiveRoomStruct liveRoomStruct;
        long j;
        LiveRoomStruct liveRoomStruct2;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("ECLynxLiveView@9660.startPlay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        Unit unit = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    liveRoomStruct2 = this.LLILLJJLI;
                    liveRoomStruct = this.LL;
                    eCLynxLiveView = (ECLynxLiveView) this.LLILZ;
                    C155000ia.LIZIZ(objLJLIIIL);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJLIIIL);
                C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILZ, C0PEM.LIZJ, null, new C2370609Qq(this.LLILZIL, null), 2);
                eCLynxLiveView = this.LLILZLL;
                liveRoomStruct = new LiveRoomStruct();
                String str = eCLynxLiveView.LLILZ;
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                liveRoomStruct.id = j;
                this.LLILZ = eCLynxLiveView;
                this.LL = liveRoomStruct;
                this.LLILLJJLI = liveRoomStruct;
                this.LLILLL = 1;
                objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("ECLynxLiveView@9660.startPlay$1");
                    return objLJFF;
                }
                liveRoomStruct2 = liveRoomStruct;
            }
            liveRoomStruct2.stream_url = (StreamUrlStruct) objLJLIIIL;
            if (((C1AEE) eCLynxLiveView.mView).isAttachedToWindow()) {
                String str2 = eCLynxLiveView.LLJJIII;
                if (str2 != null || eCLynxLiveView.LLJJI != null) {
                    ((C1AEE) eCLynxLiveView.mView).setLivePlayerEntranceParam(new C1699360uK6(eCLynxLiveView.LLJJI, str2, eCLynxLiveView.LLJJIJI, null, false, true, 40));
                }
                eCLynxLiveView.LLJI = true;
                C1749730vdL c1749730vdL = new C1749730vdL(eCLynxLiveView.LLIZLLLIL, liveRoomStruct, (FrameLayout) eCLynxLiveView.mView);
                eCLynxLiveView.LLJIJIL = SystemClock.elapsedRealtime();
                ((C1AEE) eCLynxLiveView.mView).LJ(c1749730vdL);
                ((C1AEE) eCLynxLiveView.mView).LJIIJ(eCLynxLiveView.LLILZLL, new InterfaceC1699420uKC() { // from class: X.0v0l
                    @Override // X.InterfaceC1699420uKC
                    public final void LIZ(boolean z) {
                        eCLynxLiveView.LJJIJIIJI("switchresolution", C2097608Jq.LJIIJ(new Pair("success", Boolean.valueOf(z))));
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("switchResolution: ");
                        sbLIZ.append(z);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LIZJ(strLIZIZ);
                    }
                });
            }
            C1851070yGn c1851070yGn = eCLynxLiveView.LLJJ;
            if (c1851070yGn != null) {
                c1851070yGn.LIZ(eCLynxLiveView.LLILZLL);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECLynxLiveView@9660.startPlay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
