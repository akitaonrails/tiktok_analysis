package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import njp.a;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor.HighlightCollection;

/* JADX INFO: renamed from: X.0xp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel$readCache$2", f = "LiveReplayListViewModel.kt", l = {45}, m = "invokeSuspend")
public final class C1833890xp5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveReplayListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833890xp5(LiveReplayListViewModel liveReplayListViewModel, InterfaceC1364105Vn<? super C1833890xp5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveReplayListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1833890xp5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        HighlightCollection highlightCollection;
        C1C7U.LIZ("LiveReplayListViewModel@885a.readCache$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1833900xp6 c1833900xp6 = this.LLILLJJLI.LL.LLILLL;
            this.LL = 1;
            c1833900xp6.getClass();
            obj = C2355009Kq.LJIILIIL(7, AnchorReplayInfoData.class, "live_reply_list_response");
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveReplayListViewModel@885a.readCache$2");
                return objLJFF;
            }
        }
        AnchorReplayInfoData anchorReplayInfoData = (AnchorReplayInfoData) obj;
        if (anchorReplayInfoData != null && !anchorReplayInfoData.replays.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readCacheSuccess: ");
            sbLIZ.append(anchorReplayInfoData.replays.size());
            C20441214yg.LIZIZ("LiveReplayListViewModel", C2188811AlT.LIZIZ(sbLIZ));
            LiveReplayListViewModel liveReplayListViewModel = this.LLILLJJLI;
            List<RoomReplay> list = anchorReplayInfoData.replays;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (RoomReplay roomReplay : list) {
                AnchorFragmentListResult anchorFragmentListResult = roomReplay.anchorFragmentListResult;
                if (anchorFragmentListResult == null || (arrayList = anchorFragmentListResult.fragmentList) == null) {
                    arrayList = new ArrayList();
                }
                AnchorFragmentListResult anchorFragmentListResult2 = roomReplay.anchorFragmentListResult;
                if (anchorFragmentListResult2 == null || (highlightCollection = anchorFragmentListResult2.highlightCollection) == null) {
                    highlightCollection = new HighlightCollection();
                }
                arrayList2.add(new C1833770xot(roomReplay, arrayList, highlightCollection));
            }
            liveReplayListViewModel.listAddAll(arrayList2);
            C1623606Xi c1623606Xi = new C1623606Xi(new C626160OhC(false, anchorReplayInfoData.hasMore));
            LiveReplayListViewModel liveReplayListViewModel2 = this.LLILLJJLI;
            liveReplayListViewModel2.setState(new AwS236S0300000_27(liveReplayListViewModel2, (LiveReplayListViewModel) c1623606Xi, (C1623606Xi<C626160OhC>) anchorReplayInfoData, (AnchorReplayInfoData) 27));
        } else {
            C20441214yg.LIZIZ("LiveReplayListViewModel", "readCacheFail");
            this.LLILLJJLI.setState(AFwS269S0000000_27.get$arr$(368));
            this.LLILLJJLI.manualListRefresh();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayListViewModel@885a.readCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
