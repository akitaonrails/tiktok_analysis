package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkScenario;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import mf.a;

/* JADX INFO: renamed from: X.11l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19592611l6 extends AbstractC19588311kP<AttributionLinkStickerModel> {
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final Aweme LLILZIL;
    public final C705930RmZ LLILZLL;
    public C1664680tQA<AttributionLinkStickerModel> LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public TuxTextView LLJ;
    public final C01GW LLJI;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 126);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final InterfaceC19578611iq getStickerClickListener() {
        return (InterfaceC19578611iq) this.LLJI.getValue();
    }

    public final Aweme getAweme() {
        return this.LLILZIL;
    }

    public final C705930RmZ getInteractStickerParams() {
        return this.LLILZLL;
    }

    public final void LIZIZ(String str) {
        C786410Ut5.Sd(R.layout.d1w, C786410Ut5.ne(getContext()), this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        this.LLJ = tuxTextView;
        if (str != null && tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        String title;
        this.LLILZ = interactStickerStruct;
        AttributionLinkStickerStruct attributionLinkStickerStruct = interactStickerStruct.getAttributionLinkStickerStruct();
        if (attributionLinkStickerStruct != null) {
            title = attributionLinkStickerStruct.getTitle();
        } else {
            title = null;
        }
        LIZIZ(title);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        String str;
        String str2;
        String str3;
        String idStr;
        Music music;
        C0R60 c0r60;
        C0R60 c0r602;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            AttributionLinkStickerStruct attributionLinkStickerStruct = getStruct().getAttributionLinkStickerStruct();
            int i2 = 1;
            if (attributionLinkStickerStruct != null && attributionLinkStickerStruct.getScenario() == AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_MUSIC.getValue()) {
                str = "music";
            } else {
                str = "link";
            }
            AttributionLinkStickerStruct attributionLinkStickerStruct2 = getStruct().getAttributionLinkStickerStruct();
            if (attributionLinkStickerStruct2 == null || attributionLinkStickerStruct2.getShareFormat() != AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE.getValue()) {
                i2 = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            C705930RmZ c705930RmZ = this.LLILZLL;
            String title = null;
            if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
                str2 = c0r602.LIZ;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            C705930RmZ c705930RmZ2 = this.LLILZLL;
            if (c705930RmZ2 != null && (c0r60 = c705930RmZ2.LJIIZILJ) != null) {
                str3 = c0r60.LIZLLL;
            } else {
                str3 = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", str3);
            c2344009Gk.LJIIIIZZ("channel", str);
            c2344009Gk.LIZJ(i2, "is_photo");
            Aweme aweme = this.LLILZIL;
            if (aweme != null && (music = aweme.getMusic()) != null) {
                idStr = music.getIdStr();
            } else {
                idStr = null;
            }
            c2344009Gk.LJIIIIZZ("music_id", idStr);
            AttributionLinkStickerStruct attributionLinkStickerStruct3 = getStruct().getAttributionLinkStickerStruct();
            if (attributionLinkStickerStruct3 != null) {
                title = attributionLinkStickerStruct3.getTitle();
            }
            c2344009Gk.LJIIIIZZ("shared_dsp", title);
            C20684815ws.LJIILLIIL("link_share_show", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19592611l6(Context context, C19591211ks c19591211ks, Aweme aweme, C705930RmZ c705930RmZ, int i) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLILZIL = aweme;
        this.LLILZLL = c705930RmZ;
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 712));
    }
}
