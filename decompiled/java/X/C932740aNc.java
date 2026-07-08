package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932740aNc extends AbstractC960470b6L<C932510aNF> {
    public final InterfaceC932780aNg LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C445980HeG LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public final void L5(C932510aNF c932510aNF) {
        ImageModel avatarThumb;
        C932770aNf c932770aNf = c932510aNF.LIZ;
        View view = this.itemView;
        view.setId(c932770aNf.LIZ);
        view.getLayoutParams().width = ((this.LLILZIL - (this.LLILZLL * 2)) - (this.LLIZ * 3)) / 4;
        view.setClickable(c932770aNf.LJII);
        C500260Jjc.LJLIIIL(500L, view, new AwS381S0200000_15(this, c932770aNf, 132));
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setId(c932770aNf.LIZIZ);
            c16f5.setText(c932770aNf.LIZJ);
            C786410Ut5.k5(c16f5, c932770aNf.LIZLLL);
        }
        List<GuestInvitePanelResp.ListUser> list = c932510aNF.LIZIZ;
        if (list.isEmpty()) {
            C445980HeG c445980HeG = this.LLILZ;
            if (c445980HeG != null) {
                c445980HeG.setAvatarImages(C13BV.INSTANCE);
            }
            C445980HeG c445980HeG2 = this.LLILZ;
            if (c445980HeG2 != null) {
                int visibility = c445980HeG2.getVisibility();
                c445980HeG2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c445980HeG2);
            }
            LiveIconView liveIconView = this.LLILLJJLI;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                liveIconView2.setId(c932770aNf.LJ);
                liveIconView2.setIcon(c932770aNf.LJFF);
                Drawable drawable = liveIconView2.getDrawable();
                if (drawable != null) {
                    drawable.setAlpha((int) (c932770aNf.LJI * 255));
                    return;
                }
                return;
            }
            return;
        }
        LiveIconView liveIconView3 = this.LLILLJJLI;
        if (liveIconView3 != null) {
            C786410Ut5.LLJJIJIL(liveIconView3, 8);
        }
        C445980HeG c445980HeG3 = this.LLILZ;
        if (c445980HeG3 != null) {
            int visibility2 = c445980HeG3.getVisibility();
            c445980HeG3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c445980HeG3);
        }
        C445980HeG c445980HeG4 = this.LLILZ;
        if (c445980HeG4 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GuestInvitePanelResp.ListUser> it2 = list.iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                arrayList.add(avatarThumb);
            }
            c445980HeG4.setAvatarImages(C13LP.LL(arrayList, 3));
        }
    }

    public C932740aNc(InterfaceC932780aNg interfaceC932780aNg, View view) {
        super(view);
        this.LL = interfaceC932780aNg;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.jxe);
        this.LLILLL = (C16F5) view.findViewById(R.id.text);
        this.LLILZ = (C445980HeG) view.findViewById(R.id.bin);
        this.LLILZIL = C497740JfY.LJIIZILJ();
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        L5((C932510aNF) obj);
    }
}
