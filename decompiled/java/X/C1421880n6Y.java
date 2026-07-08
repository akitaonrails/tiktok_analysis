package X;

import Y.ACallableS421S0100000_14;
import Y.ACallableS66S1100000_14;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0n6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421880n6Y implements InterfaceC1421890n6Z {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;

    @Override // X.InterfaceC1421890n6Z
    public final void LIZ(List<C2492609pk> list) {
        String string;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        C19EG c19egLIZLLL = C19221910Hx.LIZLLL(C1388190mED.LIZIZ(this.LIZ), false);
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                string = ((C2492609pk) ListProtector.get(list, 0)).LIZJ;
            } else {
                string = this.LIZ.getString(2131833529);
            }
            C15O7.LIZIZ(new ACallableS66S1100000_14(c19egLIZLLL, string, 1), C15O7.LJIIIIZZ, null);
            LIZIZ(true);
            return;
        }
        C15O7.LIZIZ(new ACallableS421S0100000_14(c19egLIZLLL, 1), C15O7.LJIIIIZZ, null);
        LIZIZ(false);
    }

    public final void LIZIZ(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", this.LIZIZ.getEnterFrom());
        c0lab.LJ("shoot_way", this.LIZIZ.mShootWay);
        c0lab.LJ("prop_list", this.LIZIZ.getStickerID());
        c0lab.LJ("prop_selected_from", this.LIZIZ.getPropSource());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZIZ));
        if (z) {
            str = "succeed";
        } else {
            str = "failed";
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C0CHQ.LIZ().LIZJ().LJIIIIZZ("prop_pic_toast_show", c0lab.LIZ);
    }

    public C1421880n6Y(Context context, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = context;
        this.LIZIZ = videoPublishEditModel;
    }
}
