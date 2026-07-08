package X;

import Y.ACListenerS47S0400000_9;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OM2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM2 extends LinearLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public C19631511rN LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;

    public final LinearLayout getBulletinPageBarEntranceAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d1u);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getBulletinPageBarEntranceIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d1v);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C19631511rN getBulletinPageBarEntranceLiveIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d1w);
            this.LL = (C19631511rN) callbackFindViewById;
        }
        return (C19631511rN) callbackFindViewById;
    }

    public final TuxTextView getBulletinPageBarEntranceTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d1y);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        getBulletinPageBarEntranceLiveIconFromXml().LIZIZ();
        C0DTR.LIZIZ(this);
    }

    public C0OM2(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.a8n, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setBulletinPageBarEntranceAreaFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setBulletinPageBarEntranceIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setBulletinPageBarEntranceLiveIconFromXml(C19631511rN c19631511rN) {
        this.LL = c19631511rN;
    }

    public final void setBulletinPageBarEntranceTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public static void LIZIZ(C0OM2 c0om2, BulletinBarEntrance bulletinBarEntrance, BulletinProfileViewModel bulletinProfileViewModel, C0OLV c0olv, boolean z) {
        String str;
        String str2;
        String str3;
        C12ES.LJIILL(0, c0om2);
        TuxImageModel tuxImageModel = bulletinBarEntrance.iconUrlModel;
        Integer numValueOf = null;
        if (tuxImageModel != null && C0OSD.LIZIZ(c0om2.getContext(), tuxImageModel) != null) {
            C12ES.LJIILL(0, c0om2.getBulletinPageBarEntranceIconFromXml());
            C0OSB.LJFF(c0om2.getBulletinPageBarEntranceIconFromXml(), bulletinBarEntrance.iconUrlModel, null);
            c0om2.getBulletinPageBarEntranceLiveIconFromXml().LIZIZ();
            C0DTR.LIZIZ(c0om2.getBulletinPageBarEntranceLiveIconFromXml());
        } else {
            C12ES.LJIILL(0, c0om2.getBulletinPageBarEntranceLiveIconFromXml());
            C0DTR.LIZIZ(c0om2.getBulletinPageBarEntranceIconFromXml());
        }
        C0OSB.LJI(c0om2.getBulletinPageBarEntranceTextFromXml(), bulletinBarEntrance.text);
        c0om2.getBulletinPageBarEntranceAreaFromXml().setBackground(C800330VaR.LIZIZ(c0om2.getContext(), R.drawable.ag2));
        c0om2.getBulletinPageBarEntranceLiveIconFromXml().LIZJ(EnumC21569519bB.LIVE_PREVIEW_LIVING_ICON_NEW);
        c0om2.getBulletinPageBarEntranceLiveIconFromXml().LJFF();
        C786410Ut5.tb(c0om2, new ACListenerS47S0400000_9(c0olv, c0om2, bulletinProfileViewModel, bulletinBarEntrance, 1));
        if (z) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str4 = "";
            if (c0olv == null || (str = c0olv.LLILLJJLI) == null) {
                str = "";
            }
            boolean zTo = bulletinProfileViewModel.To();
            boolean zNl = bulletinProfileViewModel.Nl();
            String strValueOf = String.valueOf(bulletinProfileViewModel.LLILLJJLI);
            boolean zQ11 = bulletinProfileViewModel.q11();
            Map<String, String> trackingMap = bulletinBarEntrance.getTrackingMap();
            c0opq.getClass();
            C0OPQ.LJJIFFI(str, zTo, zNl, strValueOf, zQ11, "show", trackingMap);
            if (c0olv != null) {
                str2 = c0olv.LLILLJJLI;
            } else {
                str2 = null;
            }
            String str5 = "others_homepage";
            if (!Intrinsics.LJFF(str2, "others_homepage")) {
                str5 = "message";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c0olv != null) {
                str3 = c0olv.LLILLJJLI;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            sbLIZ.append("_bb_bar");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str6 = bulletinProfileViewModel.LLILZIL;
            String str7 = bulletinBarEntrance.objectId;
            if (str7 != null) {
                str4 = str7;
            }
            String str8 = bulletinProfileViewModel.LLILZLL;
            if (!bulletinProfileViewModel.To()) {
                numValueOf = Integer.valueOf(bulletinProfileViewModel.LLIZ);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", str5);
            c2344009Gk.LJIIIIZZ("enter_method", strLIZIZ);
            c2344009Gk.LJIIIIZZ("anchor_id", str6);
            c2344009Gk.LJIIIIZZ("room_id", str4);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("request_id", str8);
            if (numValueOf != null) {
                c2344009Gk.LIZJ(numValueOf.intValue(), "follow_status");
                c2344009Gk.LIZJ(numValueOf.intValue(), "initial_follow_status");
            }
            C20684815ws.LJIILLIIL("livesdk_live_show", c2344009Gk.LIZ);
        }
    }
}
