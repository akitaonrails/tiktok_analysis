package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P4S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4S implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onDismiss$12(this, dialogInterface);
                break;
        }
    }

    public C0P4S(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C0P4S c0p4s, DialogInterface dialogInterface) {
        ((BulletinBaseCell) c0p4s.l0).X5().LL.getOperator().refresh();
    }

    public static final void onDismiss$1(C0P4S c0p4s, DialogInterface dialogInterface) {
        C0OPQ c0opq = C0OPQ.LIZ;
        String str = ((BulletinBoardEditAssem) c0p4s.l0).Jo().LLILZLL;
        c0opq.getClass();
        C0OPQ.LJIILLIIL(2, str, null, null);
    }

    public static final void onDismiss$10(C0P4S c0p4s, DialogInterface dialogInterface) {
        if (!((C013C) c0p4s.l0).element) {
            C625130OfX.LJ(C625130OfX.LIZ, "click_offline_mode_toast", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, "offline_video_intro", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "cancel_toast", null, null, null, -32772, 122879);
        }
    }

    public static final void onDismiss$11(C0P4S c0p4s, DialogInterface dialogInterface) {
        Activity activity = (Activity) ((WeakReference) c0p4s.l0).get();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void onDismiss$12(C0P4S c0p4s, DialogInterface dialogInterface) {
        String str;
        C604680Nne c604680Nne = (C604680Nne) c0p4s.l0;
        Map<String, Object> map = c604680Nne.LIZ;
        if (c604680Nne.LIZLLL) {
            str = "turn_on";
        } else {
            str = "close";
        }
        map.put("quit_type", str);
        map.put("stay_time", Long.valueOf(System.currentTimeMillis() - c604680Nne.LIZIZ));
        C1421105hJ.LIZJ("livesdk_tiktokec_stay_page", map);
        ((C604680Nne) c0p4s.l0).LIZ("exit_page_auto_post_guide");
    }

    public static final void onDismiss$2(C0P4S c0p4s, DialogInterface dialogInterface) {
        ((DialogInterface.OnDismissListener) c0p4s.l0).onDismiss(dialogInterface);
    }

    public static final void onDismiss$3(C0P4S c0p4s, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C632310Or7) {
            HashMap map = new HashMap();
            map.put("button_name", "get_started_from_pop_up");
            map.put("page", "pop_up");
            C20684815ws.LJIILLIIL("music_fan_spotlight_button_click", map);
        } else {
            HashMap map2 = new HashMap();
            map2.put("button_name", "close_pop_up");
            map2.put("page", "pop_up");
            C20684815ws.LJIILLIIL("music_fan_spotlight_button_click", map2);
        }
        ((C20656615sK) c0p4s.l0).LIZ();
    }

    public static final void onDismiss$4(C0P4S c0p4s, DialogInterface dialogInterface) {
        ((OfflineModeSheetComponent) c0p4s.l0).bo().OQ2(false);
        OfflineModeManagerVM offlineModeManagerVMBo = ((OfflineModeSheetComponent) c0p4s.l0).bo();
        offlineModeManagerVMBo.LLILZ = true;
        offlineModeManagerVMBo.FQ2(null);
        ((OfflineModeSheetComponent) c0p4s.l0).LLILLJJLI = null;
    }

    public static final void onDismiss$5(C0P4S c0p4s, DialogInterface dialogInterface) {
        Function2<Boolean, Boolean, Unit> function2 = ((C606820Nr6) c0p4s.l0).LLILLL;
        if (function2 != null) {
            function2.invoke(null, Boolean.TRUE);
        }
    }

    public static final void onDismiss$6(C0P4S c0p4s, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) c0p4s.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$7(C0P4S c0p4s, DialogInterface dialogInterface) {
        ((MusicFavoriteButtonAssem) c0p4s.l0).LLJJLIIIJLLLLLLLZ = false;
    }

    public static final void onDismiss$8(C0P4S c0p4s, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = ((C634520Oug) c0p4s.l0).LLILLJJLI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$9(C0P4S c0p4s, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = ((C634500Oue) c0p4s.l0).LLILLJJLI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
