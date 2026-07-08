package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168860gWS {
    public static final TuxSheet LIZ(Context context, String str, String str2, Aweme aweme, String str3, String str4, String str5, C1169150gWv c1169150gWv, final Function0<Unit> function0, String str6) {
        String mixName;
        int i;
        PlayListInfo playListInfo;
        final IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        C1169090gWp c1169090gWp = MixVideosDialog.LLLFZ;
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || (mixName = playListInfo.getMixName()) == null) {
            mixName = "";
        }
        c1169090gWp.getClass();
        Bundle bundle = new Bundle();
        if (C0C0X.LIZ() == 0) {
            C786410Ut5.LJJIZ(bundle, "key_positioned_aweme", aweme);
        } else {
            C1169100gWq.LIZIZ = aweme;
        }
        C786410Ut5.LJJJI("key_mix_id", str2, bundle);
        C786410Ut5.LJJJI("key_mix_name", mixName, bundle);
        C786410Ut5.LJJJI("key_mix_uid", str3, bundle);
        C786410Ut5.LJJJI("key_mix_secuid", str4, bundle);
        C786410Ut5.LJJJI("enter_from", mixName, bundle);
        C786410Ut5.LJJJI("key_mix_dialog_enter_from", str, bundle);
        C786410Ut5.LJJJI("key_video_from", str5, bundle);
        C786410Ut5.LJJIZ(bundle, "key_search_params", c1169150gWv);
        C786410Ut5.LJJJI("playlist_session_id", str6, bundle);
        final MixVideosDialog mixVideosDialog = new MixVideosDialog();
        mixVideosDialog.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = mixVideosDialog;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLJ()) {
            i = 2;
        } else {
            i = 1;
        }
        c1390920mIc.LJIIIIZZ(i);
        int iLIZ = (int) (((double) C497820Jfg.LIZ(context)) * MixVideosDialog.LLLII);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0gWV
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iMixFeedService.LJJI(false);
                MixVideosDialog mixVideosDialog2 = mixVideosDialog;
                mixVideosDialog2.getClass();
                new DialogInterfaceOnDismissListenerC1208810hYt(mixVideosDialog2, 1).onDismiss(dialogInterface);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
        mixVideosDialog.LLJJIJIIJIL = tuxSheet;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            iMixFeedService.LJJI(true);
            C05FZ c05fz = C05FZ.LIZ;
            C2097608Jq.LJ();
            c05fz.getClass();
            if (C1321305Fb.LIZ()) {
                C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_dialog_show");
            }
            tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "MixVideosDialog");
        }
        return tuxSheet;
    }
}
