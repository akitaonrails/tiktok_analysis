package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.C09JN;
import X.C0KVU;
import X.C1103530ep5;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11NJ;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C19490011Na;
import X.C19GN;
import X.C20441214yg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915110ZvB;
import X.C920460a3o;
import X.C923650a8x;
import X.C924810aAp;
import X.C924930aB1;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreviewPanelOptimizeConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatGoLiveFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zzk8HELIOSISYpKicyPGshKCY9ZiI5LDwnZhMjICw2Cy0tPQg8BCw6LAkhKSIhLCEn";
    public C16FS LLILLJJLI;
    public C16FS LLILLL;
    public C16F5 LLILZ;
    public C19GN LLILZIL;
    public Integer LLILZLL;
    public C923650a8x LLIZ;
    public long LLJ;
    public boolean LLJILJIL;
    public final /* synthetic */ C1103530ep5 LL = new C1103530ep5();
    public boolean LLIZLLLIL = true;
    public String LLJI = "outside";
    public String LLJIJIL = "is_cancel";

    public final void NR() {
        this.LLIZLLLIL = true;
        C924810aAp.LJ().LJIIJJI(true);
        C19GN c19gn = this.LLILZIL;
        if (c19gn != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        C920460a3o.LJIIIZ(true);
        C920460a3o.LJFF("voiceChatGuestGoLive");
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16FS MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j2w) : null;
            this.LLILLJJLI = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.djg);
        c500980Jkm.LIZJ = R.style.aji;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.7f;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJIILIIL = 3;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C923650a8x c923650a8x;
        super.onDestroy();
        C20441214yg.LIZIZ("VoiceChatGoLiveFragment", "onDestroy");
        ((C11NJ) this.LL.LIZ.getValue()).dispose();
        if (this.LLIZLLLIL && (c923650a8x = this.LLIZ) != null) {
            c923650a8x.LLJLLIL = true;
            c923650a8x.LJJJLIIL();
        }
        Integer num = this.LLILZLL;
        C924930aB1.LIZIZ((num == null || num.intValue() != 1) ? "invite" : "apply", null, 0L, false, true, false, this.LLJI, this.LLJIJIL, System.currentTimeMillis() - this.LLJ, Boolean.FALSE);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILJIL) {
            this.LLJILJIL = false;
            C915110ZvB.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Integer num;
        super.onStart();
        if (MultiGuestPreviewPanelOptimizeConfigSetting.INSTANCE.enableShake() && (num = this.LLILZLL) != null && num.intValue() == 1) {
            this.LLJILJIL = true;
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
                C915110ZvB.LIZ();
                this.LLJILJIL = false;
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C16FS c16fsMR = MR();
        if (c16fsMR != null) {
            C786410Ut5.h8(c16fsMR, new ACListenerS150S0100000_15(this, 286));
        }
        View viewFindViewById = this.LLILLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.e1v);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (C16FS) viewFindViewById;
        }
        C16FS c16fs = (C16FS) viewFindViewById;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 287));
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
        if (roomLJJLIIIIJ != null) {
            View view3 = this.LLILZ;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.ew0);
                }
                this.LLILZ = (C16F5) viewFindViewById2;
                view3 = viewFindViewById2;
            }
            ((TextView) view3).setText(C497740JfY.LJIJI(2131853872));
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(C497740JfY.LJIJJ(2131853873, C0KVU.LIZ(roomLJJLIIIIJ.getOwner())));
            }
            View viewFindViewById3 = view.findViewById(R.id.viewer_ic);
            if (viewFindViewById3 != null) {
                C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_interaction_normal_2", "ttlive_voice_chat_go_live_viewer.png");
            }
        }
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(6).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS184S0100000_15(this, 198), new C09JN() { // from class: X.00Kp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("VoiceChatGoLiveFragment@4cb.initialCountDown$2");
                C1C7U.LIZIZ("VoiceChatGoLiveFragment@4cb.initialCountDown$2");
            }
        }));
        this.LLJ = System.currentTimeMillis();
        Integer num = this.LLILZLL;
        if (num != null && num.intValue() == 1) {
            str = "guest_apply_anchor";
        } else {
            str = "anchor_invite_guest";
        }
        C924930aB1.LIZ(str, CardStruct.IStatusCode.DEFAULT, false);
    }
}
