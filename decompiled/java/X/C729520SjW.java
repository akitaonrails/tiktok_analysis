package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729520SjW {
    public static void LIZ(final InterfaceC729560Sja interfaceC729560Sja, final VideoItemParams videoItemParams) {
        final String str;
        int i = C2187451AjH.LIZ;
        final String str2 = videoItemParams.mEventType;
        C0XQ7.LJ();
        final String strLIZJ = C729510SjV.LIZJ(videoItemParams.getAweme(), C0XQ7.LIZ.LJIIJ().getCurUserId());
        if (videoItemParams.getAweme().getIsTikTokStory()) {
            str = "show_on_story";
        } else {
            str = "show_on_video";
        }
        ((InterfaceC1618460sDc) C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(311)).getValue()).LJIIIIZZ("show", "story_page");
        C197039127h c197039127hCh = interfaceC729560Sja.Ch();
        if (c197039127hCh != null) {
            C786410Ut5.U8(c197039127hCh, new View.OnClickListener(strLIZJ, str2, str, interfaceC729560Sja) { // from class: X.0SjZ
                public final /* synthetic */ String LLILLJJLI;
                public final /* synthetic */ String LLILLL;
                public final /* synthetic */ InterfaceC729560Sja LLILZ;

                {
                    this.LLILLJJLI = str2;
                    this.LLILLL = str;
                    this.LLILZ = interfaceC729560Sja;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Context context = view.getContext();
                    Aweme aweme = this.LL.getAweme();
                    String str3 = this.LLILLJJLI;
                    String str4 = this.LLILLL;
                    this.LLILZ.v5();
                    C729510SjV.LJJJJJ(context, aweme, str3, str4, new C729570Sjb(false), 2);
                }
            });
        }
    }

    public static void LIZIZ(InterfaceC729560Sja interfaceC729560Sja, View view) {
        interfaceC729560Sja.R4((C197039127h) view.findViewById(R.id.afa));
        C197039127h c197039127hCh = interfaceC729560Sja.Ch();
        if (c197039127hCh != null) {
            ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c197039127hCh, EnumC700430Rdh.POSITIVE);
        }
    }
}
