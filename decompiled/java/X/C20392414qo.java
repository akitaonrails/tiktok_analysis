package X;

import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20392414qo extends C0GSL {
    public final BasePlaybookViewModel LL;
    public final Context LLILLJJLI;
    public final DataChannel LLILLL;
    public final LiveSheetFragment LLILZ;
    public final boolean LLILZIL;
    public Playbook LLILZLL;
    public boolean LLIZ;
    public C197039127h LLIZLLLIL;
    public C197039127h LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;
    public final C11NJ LLJILJILJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJILJILJ.LJ();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleOwner viewLifecycleOwner;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        MutableLiveData<C20379114of> mutableLiveData2;
        super.onAttachedToWindow();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.hgj, this, true);
        this.LLIZLLLIL = (C197039127h) viewTd.findViewById(R.id.t1x);
        this.LLJ = (C197039127h) viewTd.findViewById(R.id.t65);
        this.LLJI = (TuxTextView) viewTd.findViewById(R.id.view_more_playbook_button);
        this.LLJIJIL = (TuxTextView) viewTd.findViewById(R.id.j2x);
        this.LLJILJIL = (C197039127h) viewTd.findViewById(R.id.view_more_playbook_primary_button);
        LiveSheetFragment liveSheetFragment = this.LLILZ;
        if (liveSheetFragment != null && (viewLifecycleOwner = liveSheetFragment.getViewLifecycleOwner()) != null) {
            BasePlaybookViewModel basePlaybookViewModel = this.LL;
            if (basePlaybookViewModel != null && (mutableLiveData2 = basePlaybookViewModel.LLILLL) != null) {
                mutableLiveData2.observe(viewLifecycleOwner, new AObserverS233S0100000_31(this, 23));
            }
            BasePlaybookViewModel basePlaybookViewModel2 = this.LL;
            if (basePlaybookViewModel2 != null && (mutableLiveData = basePlaybookViewModel2.LLILLJJLI) != null) {
                mutableLiveData.observe(viewLifecycleOwner, new AObserverS233S0100000_31(this, 24));
            }
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS165S0100000_31(this, 106));
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 107));
        }
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS165S0100000_31(this, 108));
        }
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS165S0100000_31(this, 109));
        }
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS165S0100000_31(this, 110));
        }
    }

    public final void LIZ(boolean z) {
        PlaybookContent playbookContent;
        PlaybookContent playbookContent2;
        if (!this.LLIZ) {
            C500260Jjc.LJLJLJ(this.LLJILJIL, true);
            return;
        }
        Playbook playbook = this.LLILZLL;
        if (playbook != null && (((playbookContent = playbook.content) != null && playbookContent.contentStatus == 3) || ((playbookContent2 = playbook.content) != null && playbookContent2.contentStatus == 0))) {
            C197039127h c197039127h = this.LLIZLLLIL;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 1.0f);
            }
            C500260Jjc.LJLJLJ(this.LLJI, this.LLILZIL);
            C500260Jjc.LJLJLJ(this.LLJIJIL, !this.LLILZIL);
            if (z) {
                C500260Jjc.LJLJLJ(this.LLJ, true);
                C500260Jjc.LJLJLJ(this.LLIZLLLIL, false);
                return;
            } else {
                C500260Jjc.LJLJLJ(this.LLIZLLLIL, true);
                C500260Jjc.LJLJLJ(this.LLJ, false);
                return;
            }
        }
        C500260Jjc.LJLJLJ(this.LLJI, true);
        C500260Jjc.LJLJLJ(this.LLIZLLLIL, true);
        C197039127h c197039127h2 = this.LLIZLLLIL;
        if (c197039127h2 == null) {
            return;
        }
        C786410Ut5.w5(c197039127h2, 0.5f);
    }

    public C20392414qo(PlaybookAnchorViewModel playbookAnchorViewModel, final Context context, DataChannel dataChannel, PlaybookAnchorDetailDialog playbookAnchorDetailDialog, boolean z) {
        new FrameLayout(context) { // from class: X.0GSL
        };
        this.LL = playbookAnchorViewModel;
        this.LLILLJJLI = context;
        this.LLILLL = dataChannel;
        this.LLILZ = playbookAnchorDetailDialog;
        this.LLILZIL = z;
        this.LLJILJILJ = new C11NJ();
    }
}
