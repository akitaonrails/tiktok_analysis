package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandOnlineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0es0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105340es0 {
    public final DataChannel LIZ;
    public final ViewGroup LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final C1091250eVH LJFF;
    public final C1091250eVH LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final C1105380es4 LJIIIZ;
    public final C1105380es4 LJIIJ;
    public List<C1105460esC> LJIIJJI;
    public boolean LJIIL;

    public final void LIZ() {
        C1091250eVH c1091250eVH = this.LJFF;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(false);
            c1091250eVH.setEnableFixedSize(false);
        }
        C1091250eVH c1091250eVH2 = this.LJI;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableSizeChange(false);
            c1091250eVH2.setEnableFixedSize(false);
        }
        C786410Ut5.LLLIILIL(this.LJFF, 8);
        C786410Ut5.LLLIILIL(this.LJI, 8);
        C1105380es4 c1105380es4 = this.LJIIIZ;
        if (c1105380es4 != null) {
            c1105380es4.LJII = null;
        }
        C1105380es4 c1105380es42 = this.LJIIJ;
        if (c1105380es42 != null) {
            c1105380es42.LJII = null;
        }
    }

    public static void LIZIZ(C1091250eVH c1091250eVH) {
        if (c1091250eVH != null) {
            C786410Ut5.LLLIILIL(c1091250eVH, 0);
            if (c1091250eVH != null) {
                c1091250eVH.setEnableSizeChange(true);
                c1091250eVH.setEnableFixedSize(true);
            }
        }
    }

    public C1105340es0(DataChannel dataChannel, ViewGroup viewGroup, boolean z) {
        boolean zLJIIZILJ;
        long ownerUserId;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        Room room;
        this.LIZ = dataChannel;
        this.LIZIZ = viewGroup;
        this.LIZJ = z;
        if (dataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        } else {
            zLJIIZILJ = false;
        }
        this.LIZLLL = !zLJIIZILJ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        this.LJ = ownerUserId;
        C1091250eVH c1091250eVH = (C1091250eVH) viewGroup.findViewById(R.id.iil);
        this.LJFF = c1091250eVH;
        C1091250eVH c1091250eVH2 = (C1091250eVH) viewGroup.findViewById(R.id.iim);
        this.LJI = c1091250eVH2;
        View viewFindViewById = viewGroup.findViewById(R.id.pn6);
        this.LJII = viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.iin);
        this.LJIIIIZZ = viewFindViewById2;
        this.LJIIIZ = new C1105380es4(dataChannel, c1091250eVH, 0);
        this.LJIIJ = new C1105380es4(dataChannel, c1091250eVH2, 1);
        this.LJIIJJI = new ArrayList();
        int dimensionPixelSize = c1091250eVH.getResources().getDimensionPixelSize(R.dimen.ajv);
        C1091250eVH c1091250eVH3 = this.LJFF;
        ViewGroup.LayoutParams layoutParams = c1091250eVH3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
            marginLayoutParams.width = -2;
            C786410Ut5.A6(c1091250eVH3, marginLayoutParams);
        }
        View view = this.LJII;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams5.setMarginEnd(0);
            marginLayoutParams5.rightMargin = 0;
            marginLayoutParams5.width = -2;
            C786410Ut5.W5(view, marginLayoutParams5);
        }
        C1091250eVH c1091250eVH4 = this.LJI;
        ViewGroup.LayoutParams layoutParams3 = c1091250eVH4.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            marginLayoutParams4.setMarginEnd(dimensionPixelSize);
            marginLayoutParams4.width = -2;
            C786410Ut5.A6(c1091250eVH4, marginLayoutParams4);
        }
        View view2 = this.LJIIIIZZ;
        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            marginLayoutParams3.setMarginEnd(0);
            marginLayoutParams3.rightMargin = 0;
            marginLayoutParams3.width = -2;
            C786410Ut5.W5(view2, marginLayoutParams3);
        }
        ViewGroup viewGroup2 = this.LIZIZ;
        ViewGroup.LayoutParams layoutParams5 = viewGroup2.getLayoutParams();
        if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
            marginLayoutParams2.setMarginEnd(dimensionPixelSize);
            C786410Ut5.X5(marginLayoutParams2, viewGroup2);
        }
        if (LiveMainFrameworkExpandOnlineSetting.INSTANCE.enable()) {
            AnonymousClass0126.LIZ(c1091250eVH, 36);
            AnonymousClass0126.LIZ(viewFindViewById, 36);
            AnonymousClass0126.LIZ(c1091250eVH2, 36);
            AnonymousClass0126.LIZ(viewFindViewById2, 36);
            AnonymousClass0126.LIZ(viewGroup, 36);
        }
        LIZ();
    }
}
