package com.bytedance.android.live.effect.karaoke.view;

import X.C01GW;
import X.C0U17;
import X.C0U3F;
import X.C19322110iZ;
import X.C19748612Om;
import X.C19EH;
import X.C19MB;
import X.C20484615Do;
import X.C23250099c;
import X.C452501pT;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C764430Tyj;
import X.C764480Tyo;
import X.C764830TzN;
import X.C765700U1w;
import X.C766290U4d;
import X.C786410Ut5;
import X.EnumC764520Tys;
import X.InterfaceC19323110ij;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeContainerDialog extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyHELIOSQyOiQjIip9PiwpPmEYKTctJiQ2CyoiPS46JiA+DSYyJCor";
    public KaraokeViewModel LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ConstraintLayout LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(21));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(22));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(19));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(20));
    public final long LLJ = System.currentTimeMillis();
    public int LLJI = 1;
    public String LLJIJIL = "click_return";
    public final String LLJILJIL = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final KaraokeLibraryFragment MR() {
        return (KaraokeLibraryFragment) this.LLILLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gw9);
        C766290U4d.LIZ(c500980Jkm);
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C0U17 c0u17 = C0U17.LIZ;
        C0U17.LJI(System.currentTimeMillis() - this.LLJ, this.dataChannel);
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(getView());
        if (c20484615DoLIZJ != null) {
            c20484615DoLIZJ.LIZ(this.LLJI);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    public final void NR(long j) {
        int i;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.m1u, MR(), null);
        c19ehLJIIJ.LJIILL(MR());
        KaraokePlayListFragment karaokePlayListFragment = (KaraokePlayListFragment) this.LL.getValue();
        karaokePlayListFragment.getClass();
        if (j == -999) {
            i = 0;
        } else {
            i = 1;
        }
        karaokePlayListFragment.LLILZIL = i;
        c19ehLJIIJ.LIZJ(R.id.m1u, karaokePlayListFragment, "KaraokePlayListFragment");
        c19ehLJIIJ.LJIILL(MR());
        c19ehLJIIJ.LJJI(4097);
        c19ehLJIIJ.LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r6) {
        /*
            r5 = this;
            super.onDismiss(r6)
            X.0U17 r0 = X.C0U17.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r5.dataChannel
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r5.LLJ
            long r2 = r2 - r0
            X.C0U17.LJI(r2, r4)
            java.lang.String r0 = "livesdk_panel_frame_exit_click"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            r3.LJIJJLI(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            if (r0 == 0) goto L62
            boolean r1 = X.C500260Jjc.LJIIZILJ(r0)
            r0 = 1
            if (r1 != r0) goto L62
        L27:
            java.lang.String r2 = "0"
            if (r0 == 0) goto L60
            java.lang.String r1 = "1"
        L2d:
            java.lang.String r0 = "is_anchor"
            r3.LJJII(r1, r0)
            java.lang.String r1 = "start_panel_page"
            java.lang.String r0 = r5.LLJILJIL
            r3.LJJII(r0, r1)
            java.lang.String r1 = "current_panel_page"
            java.lang.String r0 = "karaoke"
            r3.LJJII(r0, r1)
            java.lang.String r0 = "has_slide_close"
            r3.LJJII(r2, r0)
            java.lang.String r0 = "has_return"
            r3.LJJII(r2, r0)
            java.lang.String r1 = "height_ratio"
            java.lang.String r0 = "fixed_7"
            r3.LJJII(r0, r1)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = r5.LLJIJIL
            r3.LJJII(r0, r1)
            r3.LJJIJL()
            java.lang.String r0 = "click_return"
            r5.LLJIJIL = r0
            return
        L60:
            r1 = r2
            goto L2d
        L62:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialog.onDismiss(android.content.DialogInterface):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        EnumC764520Tys enumC764520Tys;
        View decorView;
        FrameLayout frameLayout;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0Tyn
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C764460Tym(this.LL, null), 3);
                        return true;
                    }
                    return false;
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.fy5);
        this.LLILZIL = viewFindViewById;
        ConstraintLayout constraintLayout = null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.m1u);
        this.LLILZLL = viewFindViewById2;
        if (viewFindViewById2 == null) {
            viewFindViewById2 = null;
        }
        C500260Jjc.LJLL(-1, -1, viewFindViewById2);
        this.LLIZ = (ConstraintLayout) view.findViewById(R.id.tsc);
        View view2 = this.LLILZIL;
        if (view2 == null) {
            view2 = null;
        }
        C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 68));
        this.LLILZ = C765700U1w.LIZJ(this.dataChannel);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764480Tyo(this, null), 3);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("default_page");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof EnumC764520Tys) || (enumC764520Tys = (EnumC764520Tys) serializable) == null) {
            enumC764520Tys = EnumC764520Tys.LIBRARY;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764430Tyj(this, enumC764520Tys, null), 3);
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if ((decorView instanceof FrameLayout) && (frameLayout = (FrameLayout) decorView) != null) {
            new C0U3F(frameLayout, this, this.LLILZ);
        }
        C764830TzN c764830TzN = new C764830TzN();
        c764830TzN.LIZLLL = true;
        c764830TzN.LIZ = this;
        c764830TzN.LIZIZ = view;
        c764830TzN.LIZ();
        C19MB c19mb = (C19MB) this.LLIZLLLIL.getValue();
        ConstraintLayout constraintLayout2 = this.LLIZ;
        if (constraintLayout2 != null) {
            constraintLayout = constraintLayout2;
        }
        c19mb.LJII(constraintLayout);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Tyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        }, view.findViewById(R.id.m1u));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS591S0100000_12(this, 69));
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        ConstraintLayout constraintLayout = null;
        if (z) {
            ConstraintLayout constraintLayout2 = this.LLIZ;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            C19748612Om.LIZ(constraintLayout2, null);
            ((C19MB) this.LLIZLLLIL.getValue()).LJIIIZ(R.id.m1u, 4, 0, 4, 0);
            C19MB c19mb = (C19MB) this.LLIZLLLIL.getValue();
            ConstraintLayout constraintLayout3 = this.LLIZ;
            if (constraintLayout3 != null) {
                constraintLayout = constraintLayout3;
            }
            c19mb.LIZIZ(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout4 = this.LLIZ;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        C19748612Om.LIZ(constraintLayout4, null);
        ((C19MB) this.LLIZLLLIL.getValue()).LJIIIZ(R.id.m1u, 4, 0, 4, 0);
        C19MB c19mb2 = (C19MB) this.LLIZLLLIL.getValue();
        ConstraintLayout constraintLayout5 = this.LLIZ;
        if (constraintLayout5 != null) {
            constraintLayout = constraintLayout5;
        }
        c19mb2.LIZIZ(constraintLayout);
    }
}
