package X;

import Y.ARunnableS81S0200000_12;
import Y.ARunnableS86S0200000_17;
import Y.AfS4S0211000_17;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment;
import com.bytedance.android.livesdk.billboard.broadcast.api.BillboardApi;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.HostBoardUpsertRequest;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: renamed from: X.0eLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085270eLd implements InterfaceC1088170eQJ {
    public final boolean LIZ;
    public final Function0<LiveWidget> LIZIZ;
    public FrameLayout LIZJ;
    public LinearLayout LIZLLL;
    public FrameLayout LJ;
    public C1088150eQH LJFF;
    public View LJI;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public DisplayPosition LJIIIZ;
    public boolean LJIIJ;
    public C201600q6 LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088170eQJ
    public final void LIZ() {
        C201600q6 c201600q6 = (C201600q6) ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.BROADCAST, 0L).getValue();
        if (c201600q6 == null || c201600q6.LIZ.isEmpty()) {
            return;
        }
        int size = c201600q6.LIZ.size();
        List<C2757014x> list = c201600q6.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C2757014x c2757014x : list) {
            HostBoard hostBoard = c2757014x.LIZ;
            if (!hostBoard.nonDeletable && hostBoard.boardInfo == null) {
                arrayList.add(c2757014x);
            }
        }
        if (arrayList.size() != size) {
            if (size == 1) {
                String str = BillboardMultiDeleteConfirmSheetFragment._pnsPageId;
                C01GH.LIZIZ(this.LIZIZ.invoke().context, (C2757014x) ListProtector.get(c201600q6.LIZ, 0), AFwS205S0000000_17.get$arr$(29));
                return;
            } else {
                String str2 = BillboardMultiDeleteConfirmSheetFragment._pnsPageId;
                C01GH.LIZ(this.LIZIZ.invoke().widgetCallback.getFragment().getChildFragmentManager(), c201600q6, null, AFwS205S0000000_17.get$arr$(30));
                return;
            }
        }
        C201600q6 c201600q62 = (C201600q6) ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.BROADCAST, 0L).getValue();
        if (c201600q62 != null) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            List<C2757014x> list2 = c201600q62.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C2757014x> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZ);
            }
            c784440UpuLIZ.LIZIZ(new C260100zX(arrayList2));
            c201600q62.LIZ.clear();
            c201600q62.LIZJ = false;
            LJII(c201600q62, true, 1);
        }
    }

    public final void LJI() {
        C376740Eps c376740Eps;
        LiveWidget liveWidgetInvoke = this.LIZIZ.invoke();
        this.LIZJ = (FrameLayout) liveWidgetInvoke.findViewById(R.id.c0v);
        LinearLayout linearLayout = (LinearLayout) liveWidgetInvoke.findViewById(R.id.yc5);
        FrameLayout frameLayout = (FrameLayout) liveWidgetInvoke.findViewById(R.id.cfj);
        if ((linearLayout instanceof C376740Eps) && (c376740Eps = (C376740Eps) linearLayout) != null) {
            c376740Eps.setDrawSkeletion(!this.LIZ);
        }
        this.LIZLLL = linearLayout;
        this.LJ = frameLayout;
        C1088160eQI c1088160eQI = new C1088160eQI(linearLayout, frameLayout, liveWidgetInvoke.widgetCallback.getFragment());
        FrameLayout frameLayout2 = this.LIZJ;
        if (frameLayout2 != null) {
            this.LJFF = new C1088150eQH(frameLayout2, c1088160eQI, this);
        }
        View view = liveWidgetInvoke.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS81S0200000_12(liveWidgetInvoke, this, 27));
        }
    }

    @Override // X.InterfaceC1088170eQJ
    public final void eu() {
        DataChannel dataChannel = this.LIZIZ.invoke().dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(true, EnumC1083170eIF.LIVE_EVENT_STICKER_WRAPPER_WIDGET));
        }
    }

    @Override // X.InterfaceC1088170eQJ
    public final void qm() {
        DataChannel dataChannel = this.LIZIZ.invoke().dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideTitleLayoutEvent.class, new C1081050eEp(false, EnumC1083170eIF.LIVE_EVENT_STICKER_WRAPPER_WIDGET));
        }
    }

    @Override // X.InterfaceC1088170eQJ
    public final boolean LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1088170eQJ
    public final boolean LIZLLL() {
        return this.LJIIIIZZ;
    }

    public C1085270eLd(Function0 function0, boolean z) {
        this.LIZ = z;
        this.LIZIZ = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088170eQJ
    public final void LIZIZ(int i, int i2) {
        C201600q6 c201600q6 = (C201600q6) ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.BROADCAST, 0L).getValue();
        if (c201600q6 != null) {
            DisplayPosition displayPosition = new DisplayPosition();
            displayPosition.alignment = i;
            displayPosition.marginTop = i2;
            this.LJIIIZ = displayPosition;
            c201600q6.LIZIZ = displayPosition;
            c201600q6.LIZJ = false;
            LJII(c201600q6, false, 1);
        }
        C784440Upu.LIZ().LIZIZ(new C486801v0(i, i2));
    }

    public final void LJ(FrameLayout.LayoutParams layoutParams, DisplayPosition displayPosition) {
        int i;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams2;
        Integer numValueOf;
        if (displayPosition != null && (numValueOf = Integer.valueOf(displayPosition.alignment)) != null) {
            if (numValueOf.intValue() == 0) {
                i = 8388611;
            } else {
                numValueOf.intValue();
                i = 8388613;
            }
        } else {
            i = 8388613;
        }
        layoutParams.gravity = i;
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        int i2 = 0;
        if (displayPosition != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Long.valueOf(displayPosition.marginTop)));
        } else {
            iLIZIZ = 0;
        }
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null && (layoutParams2 = linearLayout.getLayoutParams()) != null) {
            i2 = layoutParams2.height;
        }
        layoutParams.topMargin = iLIZIZ + i2;
    }

    public final void LJFF(C201600q6 c201600q6, int i) {
        Object tag;
        C201600q6 c201600q62;
        LiveMode liveMode;
        C1103880epe c1103880epe;
        FrameLayout.LayoutParams layoutParams;
        View view = this.LJI;
        String strLIZ = null;
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof C201600q6) {
            c201600q62 = (C201600q6) tag;
        } else {
            c201600q62 = null;
        }
        if (c201600q62 != null) {
            List<C2757014x> list = c201600q62.LIZ;
            ArrayList arrayList = new ArrayList();
            for (C2757014x c2757014x : list) {
                C2757014x c2757014x2 = c2757014x;
                List<C2757014x> list2 = c201600q6.LIZ;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<C2757014x> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ.boardId, c2757014x2.LIZ.boardId)) {
                            break;
                        }
                    }
                }
                arrayList.add(c2757014x);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C2757014x) it3.next()).LIZ.boardId);
            }
            if (!arrayList.isEmpty()) {
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C2757014x) it4.next()).LIZ);
                }
                c784440UpuLIZ.LIZIZ(new C201100q1(arrayList3));
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    FrameLayout frameLayout = this.LIZJ;
                    if (frameLayout != null) {
                        C786410Ut5.LJJJJIZL(frameLayout);
                    }
                    this.LJI = null;
                    this.LIZIZ.invoke().hide();
                    return;
                }
                return;
            }
            View view2 = this.LJI;
            if (view2 == null) {
                return;
            }
            C1088150eQH c1088150eQH = this.LJFF;
            if (c1088150eQH != null && !c1088150eQH.LJ) {
                C786410Ut5.Jc(view2, 0.0f);
                C786410Ut5.ed(view2, 0.0f);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    if (layoutParams != null) {
                        LJ(layoutParams, c201600q6.LIZIZ);
                    }
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(view2, layoutParams);
            }
            if ((view2 instanceof C1103880epe) && (c1103880epe = (C1103880epe) view2) != null) {
                c1103880epe.setupData(c201600q6);
            }
            view2.setTag(C201400q4.LIZ(c201600q6));
            return;
        }
        Context context = this.LIZIZ.invoke().context;
        DataChannel dataChannel = this.LIZIZ.invoke().dataChannel;
        C011V c011v = C011V.BROADCAST;
        LiveWidget liveWidgetInvoke = this.LIZIZ.invoke();
        HashMap map = new HashMap();
        DataChannel dataChannel2 = this.LIZIZ.invoke().dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        map.put("live_type", String.valueOf(strLIZ));
        map.put("event_page", "live_take_detail");
        if (C497740JfY.LJIL()) {
            map.put("room_orientation", "portrait");
        } else {
            map.put("room_orientation", "landscape");
        }
        View viewYt0 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).Yt0(new C201700q7(context, c201600q6, c011v, liveWidgetInvoke, dataChannel, map));
        if (viewYt0 == null) {
            return;
        }
        this.LJI = viewYt0;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        LJ(layoutParams3, c201600q6.LIZIZ);
        FrameLayout frameLayout2 = this.LIZJ;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJLL(frameLayout2);
            frameLayout2.addView(viewYt0, layoutParams3);
        }
        viewYt0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 4));
        viewYt0.setTag(C201400q4.LIZ(c201600q6));
        final C1088150eQH c1088150eQH2 = this.LJFF;
        if (c1088150eQH2 != null) {
            final C1103880epe c1103880epe2 = (C1103880epe) viewYt0;
            c1088150eQH2.LIZLLL = c1103880epe2;
            c1103880epe2.setDragTouchBridge(new InterfaceC1088180eQK() { // from class: X.0eQG
                @Override // X.InterfaceC1088180eQK
                public final void LIZ() {
                    c1088150eQH2.getClass();
                }

                @Override // X.InterfaceC1088180eQK
                public final boolean LIZJ() {
                    return c1088150eQH2.LJ;
                }

                @Override // X.InterfaceC1088180eQK
                public final void LIZIZ(MotionEvent motionEvent) {
                    boolean z;
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    return;
                                }
                            } else {
                                c1088150eQH2.LJI = motionEvent.getRawX();
                                c1088150eQH2.LJII = motionEvent.getRawY();
                                C1088150eQH c1088150eQH3 = c1088150eQH2;
                                float fAbs = Math.abs(c1088150eQH3.LJI - c1088150eQH3.LJIIIIZZ);
                                float fAbs2 = Math.abs(c1088150eQH3.LJII - c1088150eQH3.LJIIIZ);
                                float f = c1088150eQH3.LJIIL;
                                if (fAbs <= f && fAbs2 <= f) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                C1088150eQH c1088150eQH4 = c1088150eQH2;
                                if (!c1088150eQH4.LJ && !c1088150eQH4.LJIILL) {
                                    if (!z) {
                                        C1103880epe c1103880epe3 = c1103880epe2;
                                        c1088150eQH4.LJIILL = true;
                                        C786410Ut5.LJLIIL(c1088150eQH4.LJIILIIL, c1088150eQH4.LJIILJJIL, new ARunnableS86S0200000_17(c1088150eQH4, c1103880epe3, 81));
                                        return;
                                    }
                                } else if (!z) {
                                    return;
                                }
                                C1088150eQH c1088150eQH5 = c1088150eQH2;
                                if (!c1088150eQH5.LJIILL) {
                                    return;
                                }
                                c1088150eQH5.LJIILJJIL.removeCallbacksAndMessages(null);
                                c1088150eQH5.LJIILL = false;
                                return;
                            }
                        }
                        c1088150eQH2.LJI = motionEvent.getRawX();
                        c1088150eQH2.LJII = motionEvent.getRawY();
                        c1088150eQH2.LIZ();
                        return;
                    }
                    c1088150eQH2.LJIIIIZZ = motionEvent.getRawX();
                    c1088150eQH2.LJIIIZ = motionEvent.getRawY();
                    c1088150eQH2.LJI = motionEvent.getRawX();
                    c1088150eQH2.LJII = motionEvent.getRawY();
                    C1088150eQH c1088150eQH6 = c1088150eQH2;
                    if (!c1088150eQH6.LJIILL) {
                        return;
                    }
                    c1088150eQH6.LJIILJJIL.removeCallbacksAndMessages(null);
                    c1088150eQH6.LJIILL = false;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
                @Override // X.InterfaceC1088180eQK
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onTouchEvent(android.view.MotionEvent r12) {
                    /*
                        Method dump skipped, instruction units count: 360
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1088140eQG.onTouchEvent(android.view.MotionEvent):void");
                }
            });
        }
        this.LIZIZ.invoke().show();
    }

    public final void LJII(C201600q6 c201600q6, boolean z, int i) {
        int i2;
        Object tag;
        MultiHostBoard multiHostBoardLIZJ;
        C201600q6 c201600q62;
        if (this.LJIIJ) {
            this.LJIIJJI = c201600q6;
            return;
        }
        this.LJII = c201600q6.LIZ();
        this.LJIIIIZZ = c201600q6.LIZIZ();
        if (c201600q6.LIZ.isEmpty()) {
            i2 = 3;
        } else if (this.LJI == null) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long jLJJLIIIJ = 0;
        if (c201600q6.LIZIZ == null && i2 == 1) {
            DisplayPosition displayPosition = this.LJIIIZ;
            if (displayPosition != null) {
                c201600q6.LIZIZ = displayPosition;
            } else {
                DisplayPosition displayPosition2 = new DisplayPosition();
                displayPosition2.alignment = 1;
                displayPosition2.marginTop = 0L;
                c201600q6.LIZIZ = displayPosition2;
            }
        }
        View view = this.LJI;
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if ((tag instanceof C201600q6) && (c201600q62 = (C201600q6) tag) != null) {
            multiHostBoardLIZJ = C201400q4.LIZJ(c201600q62);
        } else {
            multiHostBoardLIZJ = null;
        }
        MultiHostBoard multiHostBoardLIZJ2 = C201400q4.LIZJ(c201600q6);
        if (!this.LIZ && !c201600q6.LIZJ && !Intrinsics.LJFF(multiHostBoardLIZJ, multiHostBoardLIZJ2)) {
            HostBoardUpsertRequest hostBoardUpsertRequest = new HostBoardUpsertRequest();
            DataChannel dataChannel = this.LIZIZ.invoke().dataChannel;
            if (dataChannel != null) {
                jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            }
            hostBoardUpsertRequest.roomId = jLJJLIIIJ;
            hostBoardUpsertRequest.board = multiHostBoardLIZJ2;
            hostBoardUpsertRequest.actionType = i2;
            this.LJIIJ = true;
            C480460Ism.LIZ().getClass();
            ((BillboardApi) C480460Ism.LIZLLL(BillboardApi.class)).update(hostBoardUpsertRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS4S0211000_17(i2, c201600q6, this, z, 0), new AfS4S0211000_17(i, c201600q6, this, z, 1));
            return;
        }
        if (z) {
            LJFF(c201600q6, i2);
        }
        C201600q6 c201600q63 = this.LJIIJJI;
        this.LJIIJJI = null;
        if (c201600q63 != null) {
            LJII(c201600q63, true, 1);
        }
    }
}
