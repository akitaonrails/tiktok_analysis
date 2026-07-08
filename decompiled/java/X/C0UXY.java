package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UXY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UXY {
    public static final View LIZ(List<? extends EnumC1102750enp> list, Context context, DataChannel dataChannel, Fragment fragment) {
        LinearLayout.LayoutParams layoutParams;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enuLJ;
        Pair pair;
        int i;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enuLJ2;
        if (list.isEmpty() || context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        float f = 16;
        linearLayout.setPadding((int) C497740JfY.LIZIZ(f), 0, (int) C497740JfY.LIZIZ(f), 0);
        ArrayList<View> arrayList = new ArrayList();
        Iterator<? extends EnumC1102750enp> it2 = list.iterator();
        while (it2.hasNext()) {
            int i2 = C0UXW.LIZ[it2.next().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                pair = new Pair(null, null);
                            } else {
                                pair = new Pair(Integer.valueOf(R.attr.e6l), new C779700UiG());
                            }
                        } else {
                            pair = new Pair(Integer.valueOf(R.attr.e0w), new C774840UaQ(fragment));
                        }
                    } else {
                        pair = new Pair(Integer.valueOf(R.attr.e3u), new C0UR2(fragment));
                    }
                } else {
                    Integer numValueOf = Integer.valueOf(R.attr.e4e);
                    InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
                    if (interfaceC1088880eRSMn1 != null) {
                        interfaceViewOnClickListenerC1102800enuLJ2 = interfaceC1088880eRSMn1.LJ(dataChannel, "MIRROR_CAMERA");
                    } else {
                        interfaceViewOnClickListenerC1102800enuLJ2 = null;
                    }
                    if (!(interfaceViewOnClickListenerC1102800enuLJ2 instanceof C0UXZ)) {
                        interfaceViewOnClickListenerC1102800enuLJ2 = null;
                    }
                    pair = new Pair(numValueOf, interfaceViewOnClickListenerC1102800enuLJ2);
                }
            } else {
                Integer numValueOf2 = Integer.valueOf(R.attr.d0v);
                InterfaceC1088880eRS interfaceC1088880eRSMn12 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
                if (interfaceC1088880eRSMn12 != null) {
                    interfaceViewOnClickListenerC1102800enuLJ = interfaceC1088880eRSMn12.LJ(dataChannel, "REVERSE_CAMERA");
                } else {
                    interfaceViewOnClickListenerC1102800enuLJ = null;
                }
                if (!(interfaceViewOnClickListenerC1102800enuLJ instanceof C0UXZ)) {
                    interfaceViewOnClickListenerC1102800enuLJ = null;
                }
                pair = new Pair(numValueOf2, interfaceViewOnClickListenerC1102800enuLJ);
            }
            Integer num = (Integer) pair.getFirst();
            C0UXZ c0uxz = (C0UXZ) pair.getSecond();
            if (num != null) {
                num.intValue();
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(num.intValue(), context);
                int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJIIIIZZ(context));
                if (LiveHostSettingsUIConfig.v2()) {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(context));
                    i = R.layout.h6x;
                } else {
                    i = R.layout.h6w;
                }
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, linearLayout, false);
                LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.lkw);
                if (liveIconView != null) {
                    liveIconView.setIcon(c20743516FdLIZLLL);
                    liveIconView.setIconTint(iLIZIZ);
                }
                if (c0uxz != null) {
                    c0uxz.LIZIZ(dataChannel, fragment, new C499640Jic(viewTd, liveIconView, null, null, null, null, null, null, null, 508));
                }
                arrayList.add(viewTd);
            }
        }
        if (arrayList.size() >= 4) {
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    View view = (View) obj;
                    if (i3 > 0) {
                        Space space = new Space(context);
                        C786410Ut5.f6(space, new LinearLayout.LayoutParams(0, -1, 1.0f));
                        linearLayout.addView(space);
                    }
                    linearLayout.addView(view);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            for (View view2 : arrayList) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.gravity = 1;
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(view2, layoutParams);
                LinearLayout linearLayout2 = new LinearLayout(context);
                C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout2.setGravity(1);
                linearLayout2.setOrientation(0);
                linearLayout2.addView(view2);
                linearLayout.addView(linearLayout2);
            }
        }
        return linearLayout;
    }
}
