package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.ui;

import X.AbstractC19484711Kz;
import X.C01G7;
import X.C1119170fEJ;
import X.C11NJ;
import X.C11QI;
import X.C1701940uOG;
import X.C19ME;
import X.C19R6;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2329009Aq;
import X.C475510Ikn;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C930940aKi;
import X.C946850akN;
import X.C956970b0h;
import X.InterfaceC954180awC;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardEnlargeFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZzs7LSgpZyE8PCwvLC08KTcoZygmLTY4Zzo6ZgsjPSYwLScjKD03DSsgKD00LQM+KCg+LSs4";
    public C19R6 LLJLLL;
    public C01G7 LLJZ;
    public LiveIconView LLJZIJLIL;
    public final C11NJ LLL = new C11NJ();
    public Bitmap LLLF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable() ? C497740JfY.LJIJI(2131854991) : C497740JfY.LJIJI(2131854020));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJFF = Collections.singletonList(new C758170Tod(R.attr.eny, new ACListenerS150S0100000_15(this, 122)));
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLL.LJ();
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C01G7 c01g7;
        String idStr;
        int size;
        String str;
        List<LinkUser> listLIZLLL;
        C19R6 c19r6;
        String str2;
        super.onViewCreated(view, bundle);
        this.LLJLLL = (C19R6) view.findViewById(R.id.lfy);
        this.LLJZIJLIL = (LiveIconView) view.findViewById(R.id.lr0);
        view.findViewById(R.id.zpi);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        Long lValueOf = null;
        if (dataChannelLJ != null) {
            c01g7 = (C01G7) dataChannelLJ.gg0(C956970b0h.class);
        } else {
            c01g7 = null;
        }
        this.LLJZ = c01g7;
        if (c01g7 != null && (str2 = c01g7.LIZ) != null) {
            this.LLL.LIZ(new C11QI(AbstractC19484711Kz.LJII(new C2329009Aq(this, str2)).LJJIII(3L).LJJ(C1701940uOG.LIZIZ()).LJIIIZ(new AfS184S0100000_15(this, 69))).LJIILL().LJIIZILJ());
        }
        C01G7 c01g72 = this.LLJZ;
        if (c01g72 != null) {
            NoticeboardGuestController.ImageMetaData imageMetaData = c01g72.LIZIZ;
            int i = (int) imageMetaData.width;
            int i2 = (int) imageMetaData.height;
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.es4, getContext());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(iLIZIZ);
            canvas.drawRect(0.0f, 0.0f, i, i2, paint);
            this.LLLF = bitmapCreateBitmap;
            C19R6 c19r62 = this.LLJLLL;
            if (c19r62 != null) {
                C19ME c19me = (C19ME) c19r62.getLayoutParams();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((int) c01g72.LIZIZ.width);
                sbLIZ.append(':');
                sbLIZ.append((int) c01g72.LIZIZ.height);
                c19me.dimensionRatio = C2188811AlT.LIZIZ(sbLIZ);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19r62);
                c19r62.setLayoutParams(c19me);
            }
            Bitmap bitmap = this.LLLF;
            if (bitmap != null && (c19r6 = this.LLJLLL) != null) {
                c19r6.setImageBitmap(bitmap);
            }
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C956970b0h.class, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getOwnerUserId());
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        int iMax = Math.max(size - 1, 0);
        if (iMax > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", str);
        linkedHashMap.put("guest_cnt", String.valueOf(iMax));
        C946850akN.LJIILIIL("livesdk_multi_audience_noticeboard_panel_show", linkedHashMap);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdk, viewGroup, false);
    }
}
