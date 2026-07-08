package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21374218km extends RecyclerView.ViewHolder {
    public final C21374118kl LL;
    public C21148717pV LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final ViewGroup LLILZIL;
    public final ImageView LLILZLL;
    public final TextView LLIZ;
    public final ImageView LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final LiveIconView LLJIJIL;
    public final TuxIconView LLJILJIL;
    public final View LLJILJILJ;

    public final InterfaceC21374518kp I5() {
        return (InterfaceC21374518kp) this.LLILZ.getValue();
    }

    public final void S5() {
        Boolean boolLIZIZ = InterfaceC1106030et7.C8.LIZIZ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = boolLIZIZ.booleanValue() ? R.raw.icon_speaker_x_mark_ltr : R.raw.icon_speaker_2_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
        this.LLJILJIL.setTuxIcon(c419910GdJ);
    }

    public final void N5() {
        InterfaceC21374418ko interfaceC21374418ko;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playThisItem, curPosition: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", curAwemeWrapper: ");
        C21148717pV c21148717pV = this.LLILLJJLI;
        sbLIZ.append(c21148717pV != null ? c21148717pV.LIZ : null);
        sbLIZ.append(", gameVideoPlayHelper: ");
        sbLIZ.append(I5());
        C20441214yg.LIZIZ("VideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        C21148717pV c21148717pV2 = this.LLILLJJLI;
        if (c21148717pV2 == null || (interfaceC21374418ko = c21148717pV2.LIZ) == null) {
            return;
        }
        InterfaceC21374518kp interfaceC21374518kpI5 = I5();
        if (interfaceC21374518kpI5 != null) {
            interfaceC21374518kpI5.LJIIIZ(interfaceC21374418ko);
        }
        InterfaceC21374518kp interfaceC21374518kpI52 = I5();
        if (interfaceC21374518kpI52 != null) {
            interfaceC21374518kpI52.LIZIZ(getAbsoluteAdapterPosition());
        }
        InterfaceC21374518kp interfaceC21374518kpI53 = I5();
        if (interfaceC21374518kpI53 != null) {
            interfaceC21374518kpI53.play();
        }
        InterfaceC21374518kp interfaceC21374518kpI54 = I5();
        if (interfaceC21374518kpI54 != null) {
            interfaceC21374518kpI54.LIZ(InterfaceC1106030et7.C8.LIZIZ().booleanValue());
        }
        S5();
        C786410Ut5.LLLLLLZZ(this.LLJILJIL, 0);
    }

    public final void R5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopThisItem, curPosition: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", gameVideoPlayHelper: ");
        sbLIZ.append(I5());
        C20441214yg.LIZIZ("VideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC21374518kp interfaceC21374518kpI5 = I5();
        if (interfaceC21374518kpI5 != null) {
            interfaceC21374518kpI5.pause();
        }
    }

    public final boolean isPlaying() {
        InterfaceC21374518kp interfaceC21374518kpI5 = I5();
        if (interfaceC21374518kpI5 != null) {
            return interfaceC21374518kpI5.isPlaying();
        }
        return false;
    }

    public static final void P5(TextView textView) {
        if (C497740JfY.LJJ()) {
            if (textView != null) {
                textView.setGravity(5);
                if (textView != null) {
                    textView.setLayoutDirection(1);
                    textView.setTextDirection(1);
                    return;
                }
                return;
            }
            return;
        }
        if (textView == null) {
            return;
        }
        textView.setGravity(3);
        if (textView == null) {
            return;
        }
        textView.setLayoutDirection(0);
        textView.setTextDirection(0);
    }

    public C21374218km(View view, C21374118kl c21374118kl) {
        super(view);
        this.LL = c21374118kl;
        this.LLILLL = -1;
        this.LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 673));
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.video_view_container);
        this.LLILZLL = (ImageView) view.findViewById(R.id.isc);
        this.LLIZ = (TextView) view.findViewById(R.id.zgf);
        this.LLIZLLLIL = (ImageView) view.findViewById(R.id.l8e);
        this.LLJ = (TextView) view.findViewById(R.id.z9o);
        this.LLJI = (TextView) view.findViewById(R.id.ztw);
        this.LLJIJIL = (LiveIconView) view.findViewById(R.id.jvr);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.jum);
        this.LLJILJILJ = view.findViewById(R.id.ir8);
    }

    public final void L5(int i, C21148717pV c21148717pV) {
        InterfaceC21374418ko interfaceC21374418ko;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderClick, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", curAwemeWrapper: ");
        sbLIZ.append(c21148717pV.LIZ);
        C20441214yg.LIZIZ("VideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC331230Cyf interfaceC331230CyfK31 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).K31();
        if (interfaceC331230CyfK31 == null) {
            return;
        }
        interfaceC331230CyfK31.LIZ(this.LL.LL, this.itemView.getContext(), c21148717pV.LIZ, this.LL.LLLFZ());
        C21148717pV c21148717pV2 = this.LLILLJJLI;
        if (c21148717pV2 != null && (interfaceC21374418ko = c21148717pV2.LIZ) != null) {
            Map<String, String> logExtra = interfaceC21374418ko.getLogExtra();
            HashMap map = new HashMap();
            map.put("anchor_id", interfaceC21374418ko.LJIIJ());
            String str = logExtra.get("tag_name");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            map.put("game_name", str);
            map.put("page_type", "bottombar_feed");
            String str3 = logExtra.get("bottombar_content_type");
            if (str3 == null) {
                str3 = "";
            }
            map.put("bottom_bar_type", str3);
            String str4 = logExtra.get("bottombar_content");
            if (str4 == null) {
                str4 = "";
            }
            map.put("bottombar_content", str4);
            String str5 = logExtra.get("related_from_request_id");
            if (str5 == null) {
                str5 = "";
            }
            map.put("related_from_request_id", str5);
            String str6 = logExtra.get("related_from_video_id");
            if (str6 == null) {
                str6 = "";
            }
            map.put("related_from_video_id", str6);
            map.put("btn_name", "video");
            String str7 = logExtra.get("bottombar_content_tag");
            if (str7 != null) {
                str2 = str7;
            }
            map.put("bottombar_content_tag", str2);
            map.put("is_live", CardStruct.IStatusCode.DEFAULT);
            map.put("item_id", interfaceC21374418ko.getAwemeId());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_click");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }
}
