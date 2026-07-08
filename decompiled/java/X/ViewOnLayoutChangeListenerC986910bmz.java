package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiHostRefreshAnchorPos;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnLayoutChangeListenerC986910bmz implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC986910bmz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC986910bmz viewOnLayoutChangeListenerC986910bmz, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986910bmz);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach, doOnLayout, view.height=");
        sbLIZ.append(((C946630ak1) viewOnLayoutChangeListenerC986910bmz.l0).getHeight());
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = (DataChannel) viewOnLayoutChangeListenerC986910bmz.l1;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiHostRefreshAnchorPos.class);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC986910bmz viewOnLayoutChangeListenerC986910bmz, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC986910bmz);
        int width = (int) (view.getWidth() * C933980aPc.LIZJ(((C940420aa0) viewOnLayoutChangeListenerC986910bmz.l0).LLILZLL));
        int i9 = (int) (width * 0.375f);
        ImageView imageView = (ImageView) ((ViewGroup) viewOnLayoutChangeListenerC986910bmz.l1).findViewById(R.id.h23);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ff1);
        }
        View viewFindViewById = ((ViewGroup) viewOnLayoutChangeListenerC986910bmz.l1).findViewById(R.id.h23);
        if (viewFindViewById != null) {
            C933980aPc.LJIIZILJ(width, width, viewFindViewById);
        }
        View viewFindViewById2 = ((ViewGroup) viewOnLayoutChangeListenerC986910bmz.l1).findViewById(R.id.h34);
        if (viewFindViewById2 != null) {
            C933980aPc.LJIIZILJ(i9, i9, viewFindViewById2);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC986910bmz viewOnLayoutChangeListenerC986910bmz, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String layoutBusinessType;
        boolean z;
        int width;
        Integer num;
        Integer num2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        if (i != i5 || i3 != i7) {
            InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLIZ.LJJJJZ()) != null) {
                layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
            } else {
                layoutBusinessType = null;
            }
            if (!Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType()) && !Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT_FIX.getBusinessType()) && !Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType()) && !Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.ZOOM_PANEL.getBusinessType())) {
                z = false;
            } else {
                z = true;
            }
            List<View> bottomViewsSortedByPriority = ((C939710aYr) viewOnLayoutChangeListenerC986910bmz.l0).getBottomViewsSortedByPriority();
            if (!z) {
                C939710aYr c939710aYr = (C939710aYr) viewOnLayoutChangeListenerC986910bmz.l0;
                Iterator<View> it2 = bottomViewsSortedByPriority.iterator();
                while (it2.hasNext()) {
                    c939710aYr.LJJIJL(it2.next(), null);
                }
                return;
            }
            if (!((C08J9) viewOnLayoutChangeListenerC986910bmz.l1).LIZ()) {
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LJI("MultiGuestV3GuestMask", "onLayoutChange return as methodLimiter");
                return;
            }
            int width2 = ((C939710aYr) viewOnLayoutChangeListenerC986910bmz.l0).getNickNameFromXml().getWidth();
            Iterator<View> it3 = bottomViewsSortedByPriority.iterator();
            int iIntValue = width2;
            while (it3.hasNext()) {
                Object tag = it3.next().getTag(R.id.hig);
                if ((tag instanceof Integer) && (num2 = (Integer) tag) != null) {
                    iIntValue -= num2.intValue();
                }
            }
            if (width2 > 0 && iIntValue <= C939710aYr.LLLLIILL) {
                C939710aYr c939710aYr2 = (C939710aYr) viewOnLayoutChangeListenerC986910bmz.l0;
                for (View view2 : bottomViewsSortedByPriority) {
                    Object tag2 = view2.getTag(R.id.hig);
                    if ((tag2 instanceof Integer) && (num = (Integer) tag2) != null && num.intValue() > 0) {
                        width = num.intValue();
                    } else {
                        width = view2.getWidth();
                    }
                    if (width2 < C939710aYr.LLLLIILL && width > 0) {
                        c939710aYr2.LJJIJL(view2, Integer.valueOf(width));
                        width2 += width;
                    } else {
                        c939710aYr2.LJJIJL(view2, null);
                    }
                }
                return;
            }
            C939710aYr c939710aYr3 = (C939710aYr) viewOnLayoutChangeListenerC986910bmz.l0;
            Iterator<View> it4 = bottomViewsSortedByPriority.iterator();
            while (it4.hasNext()) {
                c939710aYr3.LJJIJL(it4.next(), null);
            }
        }
    }
}
