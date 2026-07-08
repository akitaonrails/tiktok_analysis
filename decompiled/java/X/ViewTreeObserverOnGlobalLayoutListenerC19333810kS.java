package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notification.v2.NotificationResultFragment;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.10kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC19333810kS implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS) {
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l0).getHeight();
        if (height > 0) {
            FundraiserContainerFragment fundraiserContainerFragment = (FundraiserContainerFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1;
            if (height != fundraiserContainerFragment.LLILZLL) {
                fundraiserContainerFragment.LLILZLL = height;
                fundraiserContainerFragment.LLIZ = 0;
                return;
            }
            int i = fundraiserContainerFragment.LLIZ + 1;
            fundraiserContainerFragment.LLIZ = i;
            if (i < 2) {
                return;
            }
            FundraiserContainerViewModel fundraiserContainerViewModel = fundraiserContainerFragment.LLILLJJLI;
            if (fundraiserContainerViewModel != null) {
                fundraiserContainerViewModel.CQ2(height);
            }
            ((FundraiserContainerFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1).OR(height);
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l0).getViewTreeObserver(), ((FundraiserContainerFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1).LLILZIL);
            ((FundraiserContainerFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1).LLILZIL = null;
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS) {
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC19333810kS);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC19333810kS, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1911410zq7.LIZ("PushPermissionFragment", "onGlobalLayout triggered");
        ((PushPermissionBackgroundFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1).LLJJIJIIJIL.LJJLIIIJILLIZJL(Unit.LIZ);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS) {
        Boolean boolValueOf;
        String str;
        LinearLayoutManager linearLayoutManager;
        int top;
        List<T> list;
        int i;
        int i2;
        int i3;
        NotificationResultFragment notificationResultFragment = (NotificationResultFragment) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewTreeObserverOnGlobalLayoutListenerC19333810kS.l1;
        C1901440za2 c1901440za2 = C1901440za2.LIZ;
        c1901440za2.getClass();
        int i4 = C1901440za2.LIZLLL;
        notificationResultFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkRenderStateAndUnreadCount, totalUnreadCount: ");
        sbLIZ.append(i4);
        sbLIZ.append(", bubbleEnable: ");
        C1901500za8 c1901500za8 = notificationResultFragment.LLJILJIL;
        if (c1901500za8 != null) {
            boolValueOf = Boolean.valueOf(c1901500za8.LJIIIIZZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", isRefreshResultBack: ");
        sbLIZ.append(C1901440za2.LJII);
        C1901440za2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C1901440za2.LJII) {
            if (i4 > 0) {
                C1901500za8 c1901500za82 = notificationResultFragment.LLJILJIL;
                if (c1901500za82 != null && c1901500za82.LJIIIIZZ) {
                    if (viewOnAttachStateChangeListenerC20604515jv.getChildCount() > 0) {
                        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                        if ((layoutManager instanceof FixedLinearlayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                            View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(viewOnAttachStateChangeListenerC20604515jv.getChildCount() - 1);
                            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
                            int bottom = childAt.getBottom();
                            if (viewFindViewByPosition != null) {
                                top = viewFindViewByPosition.getTop();
                            } else {
                                top = 0;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("child count: ");
                            sbLIZ2.append(viewOnAttachStateChangeListenerC20604515jv.getChildCount());
                            sbLIZ2.append(", recyclerview height: ");
                            sbLIZ2.append(viewOnAttachStateChangeListenerC20604515jv.getHeight());
                            sbLIZ2.append(", items height: ");
                            sbLIZ2.append(bottom - top);
                            sbLIZ2.append(", lastBottom: ");
                            sbLIZ2.append(childAt.getBottom());
                            C1901440za2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                            if (viewOnAttachStateChangeListenerC20604515jv.getHeight() <= childAt.getBottom()) {
                                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                                C20600915jL value = viewOnAttachStateChangeListenerC20604515jv.getState().LIZIZ.getValue();
                                if (value != null && (list = value.LIZ) != 0 && (i = iFindLastVisibleItemPosition + 1) < list.size()) {
                                    ArrayList arrayList = new ArrayList();
                                    int i5 = 0;
                                    int i6 = 0;
                                    for (Object obj : list) {
                                        int i7 = i5 + 1;
                                        if (i5 >= 0) {
                                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                                            if ((interfaceC1891350zJl instanceof C1900970zZH) && i6 < 20) {
                                                i6++;
                                                if (i5 > iFindLastVisibleItemPosition && !((C1900970zZH) interfaceC1891350zJl).LL.hasRead) {
                                                    arrayList.add(interfaceC1891350zJl);
                                                }
                                            }
                                            i5 = i7;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    if (C866950Xzh.LIZIZ(arrayList)) {
                                        List listSubList = list.subList(0, i);
                                        C1901440za2.LIZ.getClass();
                                        C1901440za2.LIZIZ.clear();
                                        C1901440za2.LJIIJ("exposeAll Already Show Items");
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj2 : listSubList) {
                                            if (obj2 instanceof C1900970zZH) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            C1901440za2.LIZ.LJ(((C1900970zZH) it2.next()).LL);
                                        }
                                        C1901500za8 c1901500za83 = notificationResultFragment.LLJILJIL;
                                        if (c1901500za83 != null) {
                                            C1901440za2 c1901440za22 = C1901440za2.LIZ;
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("Render Full Screen：try to showUnreadBubble, bubbleEnable: ");
                                            sbLIZ3.append(c1901500za83.LJIIIIZZ);
                                            sbLIZ3.append(", bubbleState: ");
                                            sbLIZ3.append(c1901500za83.LJII);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                            c1901440za22.getClass();
                                            C1901440za2.LJIIJ(strLIZIZ);
                                            if (c1901500za83.LJIIIIZZ && C1901440za2.LJII) {
                                                C1901440za2.LJII = false;
                                                C1901440za2.LJIIIIZZ = false;
                                                C1901440za2.LJIIIZ = -1;
                                                Boolean bool = Boolean.FALSE;
                                                C1901440za2.LJI(c1901440za22, null, bool, bool, 1);
                                                if (C1901440za2.LJFF <= 0) {
                                                    C1901440za2.LJIIJ("unread count <= 0, no need to show");
                                                    return;
                                                }
                                                AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(c1901500za83, (C1901500za8) arrayList, (List<? extends InterfaceC1891350zJl>) 39);
                                                if (!C1901460za4.LIZJ) {
                                                    awS429S0200000_28.invoke();
                                                    return;
                                                }
                                                try {
                                                    i2 = C1901440za2.LIZ().getInt(C786410Ut5.j4("cycle_times_%s", Arrays.copyOf(new Object[]{C1901440za2.LIZIZ()}, 1)), 0);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C098200Yq c098200Yq = new C098200Yq(th);
                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                                    if (thM5exceptionOrNullimpl != null) {
                                                        int i8 = C2187451AjH.LIZ;
                                                        C1720106oR.LIZIZ("FloatingBubbleHelper", "getCycleTimes error", thM5exceptionOrNullimpl);
                                                    }
                                                    i2 = 0;
                                                }
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                C1901440za2.LIZ.getClass();
                                                long j = 0;
                                                try {
                                                    j = C1901440za2.LIZ().getLong(C786410Ut5.j4("disable_time_%s", Arrays.copyOf(new Object[]{C1901440za2.LIZIZ()}, 1)), 0L);
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    C098200Yq c098200Yq2 = new C098200Yq(th2);
                                                    C189200o6.m2constructorimpl(c098200Yq2);
                                                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                                    if (thM5exceptionOrNullimpl2 != null) {
                                                        int i9 = C2187451AjH.LIZ;
                                                        C1720106oR.LIZIZ("FloatingBubbleHelper", "getDisableTime error", thM5exceptionOrNullimpl2);
                                                    }
                                                }
                                                long j2 = ((jCurrentTimeMillis - j) / ((long) 60)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                                C1901440za2.LIZ.getClass();
                                                try {
                                                    i3 = C1901440za2.LIZ().getInt(C786410Ut5.j4("show_count_%s", Arrays.copyOf(new Object[]{C1901440za2.LIZIZ()}, 1)), 0);
                                                } catch (Throwable th3) {
                                                    TryCatchGuardChecker.doCheck(th3);
                                                    C098200Yq c098200Yq3 = new C098200Yq(th3);
                                                    C189200o6.m2constructorimpl(c098200Yq3);
                                                    Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                                                    if (thM5exceptionOrNullimpl3 != null) {
                                                        int i10 = C2187451AjH.LIZ;
                                                        C1720106oR.LIZIZ("FloatingBubbleHelper", "getShowCount error", thM5exceptionOrNullimpl3);
                                                    }
                                                    i3 = 0;
                                                }
                                                C1901440za2 c1901440za23 = C1901440za2.LIZ;
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("last cycleTimes: ");
                                                sbLIZ4.append(i2);
                                                sbLIZ4.append(", last disableMinInterval: ");
                                                sbLIZ4.append(j2);
                                                sbLIZ4.append(" min, last showCount: ");
                                                sbLIZ4.append(i3);
                                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                                                c1901440za23.getClass();
                                                C1901440za2.LJIIJ(strLIZIZ2);
                                                int i11 = i3 + 1;
                                                if (i11 > C1901460za4.LIZ().showCount) {
                                                    C1901440za2.LJIIIZ(0);
                                                    C1901440za2.LJIIIIZZ(System.currentTimeMillis());
                                                    C1901440za2.LJII(i2 + 1);
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append("showCount > max showCount: ");
                                                    sbLIZ5.append(C1901460za4.LIZ().showCount);
                                                    sbLIZ5.append(", cannot show bubble, update disableTime and cycleTimes");
                                                    C1901440za2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ5));
                                                    c1901500za83.LJIIIIZZ = false;
                                                    c1901500za83.LJI("exceed_threshold");
                                                    return;
                                                }
                                                if (i2 < C1901460za4.LIZ().cycleTimes && j2 > C1901460za4.LIZ().disableMinInterval) {
                                                    awS429S0200000_28.invoke();
                                                    C1901440za2.LJIIIZ(i11);
                                                    return;
                                                }
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("cycleTimes >= max cycleTimes: $");
                                                sbLIZ6.append(C1901460za4.LIZ().cycleTimes);
                                                sbLIZ6.append(" or disableInterval <= minInterval: ");
                                                sbLIZ6.append(C1901460za4.LIZ().disableMinInterval);
                                                sbLIZ6.append(" min, cannot show bubble");
                                                C1901440za2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ6));
                                                c1901500za83.LJIIIIZZ = false;
                                                c1901500za83.LJI("exceed_threshold");
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                str = "bubbleEnable is false";
            } else {
                str = "totalUnreadCount <= 0";
            }
            c1901440za2.LIZJ(str);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC19333810kS(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
