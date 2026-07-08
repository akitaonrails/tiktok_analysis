package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.staytime.IFcpStayTimeService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708940RrQ {
    public static View LIZ(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            final Context context = view.getContext();
            FrameLayout frameLayout = new FrameLayout(context) { // from class: X.0RrP
                public static final /* synthetic */ int LL = 0;

                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    Integer numValueOf;
                    String str;
                    String str2;
                    Aweme aweme;
                    Map map;
                    IFcpStayTimeService iFcpStayTimeService;
                    Object obj = null;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
                        if (numValueOf.intValue() == 1) {
                            Object tag = getTag(R.id.b0m);
                            if (tag instanceof String) {
                                str = (String) tag;
                            } else {
                                str = null;
                            }
                            Object tag2 = getTag(R.id.b0p);
                            if (tag2 instanceof String) {
                                str2 = (String) tag2;
                            } else {
                                str2 = null;
                            }
                            Object tag3 = getTag(R.id.b0n);
                            if (tag3 instanceof Aweme) {
                                aweme = (Aweme) tag3;
                            } else {
                                aweme = null;
                            }
                            Object tag4 = getTag(R.id.b0o);
                            if (tag4 instanceof Map) {
                                map = (Map) tag4;
                            } else {
                                map = null;
                            }
                            Object tag5 = getTag(R.id.b0l);
                            if (tag5 instanceof Boolean) {
                                obj = tag5;
                            }
                            Integer numValueOf2 = Integer.valueOf(Intrinsics.LJFF(obj, Boolean.TRUE) ? 1 : 0);
                            Activity activityLIZ = C1388190mED.LIZ(getContext());
                            if (activityLIZ != null && (iFcpStayTimeService = (IFcpStayTimeService) PluggableExtentionKt.pluggableSpi$default(IFcpStayTimeService.class, false, false, false, 14, null)) != null) {
                                iFcpStayTimeService.LIZ(activityLIZ, aweme, str, str2, map, numValueOf2);
                            }
                        } else {
                            numValueOf.intValue();
                        }
                    }
                    try {
                        return super.dispatchTouchEvent(motionEvent);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2276411E8h.LIZIZ.LJFF("FeedInterceptTouchLayout::dispatchTouchEvent", e);
                        return false;
                    }
                }
            };
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(frameLayout, layoutParams);
            return frameLayout;
        }
        return view;
    }
}
