package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0xpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel$updateData$1", f = "LiveReplayListBBViewModel.kt", l = {61}, m = "invokeSuspend")
public final class C1834050xpL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public LiveReplayListBBViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveReplayListBBViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834050xpL(LiveReplayListBBViewModel liveReplayListBBViewModel, InterfaceC1364105Vn<? super C1834050xpL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplayListBBViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1834050xpL(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        LiveReplayListBBViewModel liveReplayListBBViewModel;
        int i;
        AnchorReplayInfoData anchorReplayInfoData;
        RoomReplay next;
        C1C7U.LIZ("LiveReplayListBBViewModel@d256.updateData$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    liveReplayListBBViewModel = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                liveReplayListBBViewModel = this.LLILLL;
                C1833900xp6 c1833900xp6 = liveReplayListBBViewModel.LL.LLILLL;
                int i3 = liveReplayListBBViewModel.LLILZIL;
                if (i3 == 5) {
                    i = 1;
                } else {
                    i = 0;
                }
                String str = liveReplayListBBViewModel.LLILLJJLI;
                this.LL = liveReplayListBBViewModel;
                this.LLILLJJLI = 1;
                obj = ((LiveReplayApi) c1833900xp6.LL.LL.getValue()).getReplayVideoInfosFromBB(i, str, i3, Boolean.TRUE, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplayListBBViewModel@d256.updateData$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            c098200Yq = null;
            if (c470590Icr != null) {
                anchorReplayInfoData = (AnchorReplayInfoData) c470590Icr.data;
            } else {
                anchorReplayInfoData = null;
            }
            if (anchorReplayInfoData == null) {
                C20600815jK<ITEM> c20600815jK = liveReplayListBBViewModel.state;
                if (c20600815jK != 0) {
                    c20600815jK.LJFF(null);
                }
                liveReplayListBBViewModel.setState(AFwS269S0000000_27.get$arr$(363));
                c098200Yq = Unit.LIZ;
            } else if (anchorReplayInfoData.replays.isEmpty()) {
                C20600815jK<ITEM> c20600815jK2 = liveReplayListBBViewModel.state;
                if (c20600815jK2 != 0) {
                    c20600815jK2.LJFF(null);
                }
                liveReplayListBBViewModel.setState(AFwS269S0000000_27.get$arr$(364));
                c098200Yq = Unit.LIZ;
            } else {
                Iterator<RoomReplay> it2 = anchorReplayInfoData.replays.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.id, liveReplayListBBViewModel.LLILLJJLI)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next == null) {
                    C20600815jK<ITEM> c20600815jK3 = liveReplayListBBViewModel.state;
                    if (c20600815jK3 != 0) {
                        c20600815jK3.LJFF(null);
                    }
                    liveReplayListBBViewModel.setState(AFwS269S0000000_27.get$arr$(365));
                    c098200Yq = Unit.LIZ;
                } else {
                    List listVQ2 = LiveReplayListBBViewModel.vQ2(anchorReplayInfoData.replays, liveReplayListBBViewModel.LLILLL, liveReplayListBBViewModel.LLILZ);
                    C20600815jK<ITEM> c20600815jK4 = liveReplayListBBViewModel.state;
                    if (c20600815jK4 != 0) {
                        c20600815jK4.LJIIJJI(listVQ2, null);
                        c098200Yq = Unit.LIZ;
                    }
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("LiveReplayListBBViewModel@d256.updateData$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
