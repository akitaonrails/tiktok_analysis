package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081920eGE {
    public final View LIZ;
    public final DataChannel LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJIIIIZZ;
    public final ArrayList<Integer> LJIIJJI;
    public final ArrayList<Integer> LJIIL;
    public final ArrayList<String> LJIILIIL;
    public final ArrayList<String> LJIILJJIL;
    public final ArrayList<String> LJIILL;
    public final ArrayList<Integer> LJIILLIIL;
    public final HashMap<Integer, View> LJIIZILJ;
    public final HashMap<View, Integer> LJIJ;
    public ViewOnLayoutChangeListenerC1151610g4d LJIJI;
    public ViewOnLayoutChangeListenerC1151610g4d LJIJJ;
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(66));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(65));

    public final void LIZJ() {
        for (View view : this.LJIJ.keySet()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                C19ME c19me = (C19ME) layoutParams;
                Integer num = this.LJIJ.get(view);
                c19me.matchConstraintMaxWidth = num != null ? num.intValue() : 0;
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    public final void LJFF() {
        int i;
        int i2;
        int iIntValue;
        if (this.LJIIIIZZ) {
            return;
        }
        if (C497740JfY.LJJ()) {
            i = this.LJFF;
            i2 = this.LJ;
        } else {
            i = this.LJ;
            i2 = this.LJFF;
        }
        int i3 = i - i2;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (i3 <= 0) {
            return;
        }
        int iLIZIZ = LIZIZ(R.id.v97);
        int i4 = 0;
        if (iLIZIZ <= ((Number) this.LJIIIZ.getValue()).intValue() || this.LJII.get()) {
            iIntValue = 0;
        } else {
            iIntValue = iLIZIZ - ((Number) this.LJIIIZ.getValue()).intValue();
            i3 -= iIntValue;
            LJ(R.id.v97, ((Number) this.LJIIIZ.getValue()).intValue());
            this.LJII.set(true);
        }
        if (this.LJI.get()) {
            return;
        }
        if (i3 <= 0) {
            LIZLLL(iIntValue, 0, true, true);
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (Integer num : this.LJIIJJI) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iLIZIZ2 = LIZIZ(num.intValue());
            Map<String, Object> map2 = C1338270kvh.LIZ;
            if (iLIZIZ2 > i6) {
                i6 = iLIZIZ2;
            }
            if (iLIZIZ2 < i5) {
                i5 = iLIZIZ2;
            }
            i7 = i8;
        }
        Map<String, Object> map3 = C1338270kvh.LIZ;
        int iMax = Math.max(i5, i6 / 2);
        if (iMax <= 0 || iMax >= C497740JfY.LJIIZILJ()) {
            return;
        }
        LIZLLL(iIntValue, iMax, true, true);
        for (Integer num2 : this.LJIIJJI) {
            int i9 = i4 + 1;
            if (i4 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iIntValue2 = num2.intValue();
            ListProtector.get(this.LJIILJJIL, i4);
            LJ(iIntValue2, iMax);
            i4 = i9;
        }
        this.LJI.set(true);
    }

    public final int LIZIZ(int i) {
        View viewFindViewById;
        if (this.LJIIZILJ.containsKey(Integer.valueOf(i))) {
            View view = this.LJIIZILJ.get(Integer.valueOf(i));
            if (view == null) {
                return 0;
            }
            return view.getWidth();
        }
        View view2 = this.LIZ;
        if (view2 == null || (viewFindViewById = view2.findViewById(i)) == null) {
            return 0;
        }
        if (viewFindViewById.getWidth() > 0) {
            this.LJIIZILJ.put(Integer.valueOf(i), viewFindViewById);
        }
        return viewFindViewById.getWidth();
    }

    public C1081920eGE(View view, DataChannel dataChannel) {
        View viewFindViewById;
        int left;
        Integer numValueOf = Integer.valueOf(R.id.sqk);
        Integer numValueOf2 = Integer.valueOf(R.id.sql);
        Integer numValueOf3 = Integer.valueOf(R.id.ba7);
        this.LJIIJJI = C1697810uHb.LJ(numValueOf, numValueOf2, numValueOf3);
        this.LJIIL = C1697810uHb.LJ(numValueOf, numValueOf2, numValueOf3, Integer.valueOf(R.id.oay), Integer.valueOf(R.id.s8h), Integer.valueOf(R.id.s8a));
        this.LJIILIIL = C1697810uHb.LJ("rank_1", "rank_2", "online_audience", "mic_room_info", "programmed_live_user_info", "programmed_live_online_audience");
        this.LJIILJJIL = C1697810uHb.LJ("rank_1", "rank_2", "online_audience");
        this.LJIILL = C1697810uHb.LJ("short_touch", "wish_list");
        this.LJIILLIIL = C1697810uHb.LJ(Integer.valueOf(R.id.v97), Integer.valueOf(R.id.wish_list_container));
        this.LJIIZILJ = new HashMap<>();
        this.LJIJ = new HashMap<>();
        this.LIZ = view;
        this.LIZIZ = dataChannel;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.btd);
        } else {
            viewFindViewById = null;
        }
        this.LIZJ = viewFindViewById;
        View viewFindViewById2 = view != null ? view.findViewById(R.id.btk) : null;
        this.LIZLLL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            left = viewFindViewById2.getLeft();
        } else {
            left = 0;
        }
        this.LJFF = left;
        this.LJ = viewFindViewById != null ? viewFindViewById.getLeft() : 0;
    }

    public final String LIZ(List<Integer> list, List<String> list2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Integer num : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (LIZIZ(num.intValue()) > 0 && i < list2.size()) {
                    sb.append((String) ListProtector.get(list2, i));
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (a0.LJJIJIL(sb, ",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void LJ(int i, int i2) {
        View view = this.LJIIZILJ.get(Integer.valueOf(i));
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                if (!this.LJIJ.containsKey(view)) {
                    this.LJIJ.put(view, Integer.valueOf(((C19ME) layoutParams).matchConstraintMaxWidth));
                }
                ((C19ME) layoutParams).matchConstraintMaxWidth = i2;
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    public final void LIZLLL(int i, int i2, boolean z, boolean z2) {
        Room room;
        int iX70;
        DataChannel dataChannel = this.LIZIZ;
        Long lValueOf = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
        if (iShortTouchService != null) {
            iX70 = iShortTouchService.X70();
        } else {
            iX70 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_top_second_area_overlap");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(LIZ(this.LJIIL, this.LJIILIIL), "ids_of_left_views");
        c474500IjALIZ.LJJII(LIZ(this.LJIILLIIL, this.LJIILL), "ids_of_right_views");
        if (z) {
            c474500IjALIZ.LJJII(LIZ(this.LJIIJJI, this.LJIILJJIL), "ids_of_left_views_be_optimized");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iX70), "short_touch_item_count");
        c474500IjALIZ.LJJII(Boolean.valueOf(!InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()), "is_show_public_screen");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_optimized");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "is_compression");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "limited_length_for_short_touch");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "limited_length_for_left_views");
        c474500IjALIZ.LIZ();
    }
}
