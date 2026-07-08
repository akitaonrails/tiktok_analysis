package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903520zdO extends C1903510zdN {
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;

    @Override // X.C1903510zdN, X.InterfaceC1508640pMU
    public final String T() {
        return "FollowerEntranceVH";
    }

    public final TuxIconDrawable h6() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_two_person_circle;
        return c419910GdJ.LIZ(this.itemView.getContext());
    }

    @Override // X.C1903510zdN
    public final void e6() {
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 != null) {
            multiViewModelN5.LQ2(EnumC1902800zcE.REAL_CELL_CLICK, null);
        }
    }

    public C1903520zdO(View view) {
        super(view);
        this.LLLFF = C452501pT.LIZIZ(new AwS572S0100000_28(view, 945));
        this.LLLFFI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 946));
        this.LLLFZ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 947));
        this.LLLI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 948));
        this.LLLII = C452501pT.LIZIZ(new AwS572S0100000_28(view, 944));
    }

    @Override // X.C1903510zdN, X.AbstractC1903430zdF
    public final /* bridge */ /* synthetic */ void R5(AbstractC895380ZAq abstractC895380ZAq) {
        R5((InboxEntrancePod) abstractC895380ZAq);
    }

    @Override // X.C1903510zdN
    public final void T5(InboxEntrancePod inboxEntrancePod) {
        List<? extends User> list;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntrancePod.entranceCell.uiInfo;
        if (inboxEntranceCellUIInfo != null) {
            list = inboxEntranceCellUIInfo.previewUsers;
        } else {
            list = null;
        }
        if (C0ZC2.LIZ() && list != null && !list.isEmpty()) {
            SmartAvatarImageView smartAvatarImageViewW5 = W5();
            if (smartAvatarImageViewW5 != null) {
                C786410Ut5.o(smartAvatarImageViewW5, 8);
            }
            View view = (View) this.LLLFF.getValue();
            if (view != null) {
                int visibility = view.getVisibility();
                view.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, view);
            }
            if (list.size() >= 2) {
                SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.LLLI.getValue();
                if (smartAvatarImageView != null) {
                    C786410Ut5.o(smartAvatarImageView, 8);
                }
                SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) this.LLLFFI.getValue();
                if (smartAvatarImageView2 != null) {
                    C786410Ut5.o(smartAvatarImageView2, 0);
                }
                SmartAvatarImageView smartAvatarImageView3 = (SmartAvatarImageView) this.LLLFZ.getValue();
                if (smartAvatarImageView3 != null) {
                    C786410Ut5.o(smartAvatarImageView3, 0);
                }
                i6(((User) ListProtector.get(list, 0)).getAvatarThumb(), (SmartAvatarImageView) this.LLLFFI.getValue(), h6());
                i6(((User) ListProtector.get(list, 1)).getAvatarThumb(), (SmartAvatarImageView) this.LLLFZ.getValue(), h6());
                return;
            }
            SmartAvatarImageView smartAvatarImageView4 = (SmartAvatarImageView) this.LLLFFI.getValue();
            if (smartAvatarImageView4 != null) {
                C786410Ut5.o(smartAvatarImageView4, 8);
            }
            SmartAvatarImageView smartAvatarImageView5 = (SmartAvatarImageView) this.LLLFZ.getValue();
            if (smartAvatarImageView5 != null) {
                C786410Ut5.o(smartAvatarImageView5, 8);
            }
            SmartAvatarImageView smartAvatarImageView6 = (SmartAvatarImageView) this.LLLI.getValue();
            if (smartAvatarImageView6 != null) {
                C786410Ut5.o(smartAvatarImageView6, 0);
            }
            i6(((User) ListProtector.get(list, 0)).getAvatarThumb(), (SmartAvatarImageView) this.LLLI.getValue(), h6());
            return;
        }
        SmartAvatarImageView smartAvatarImageViewW52 = W5();
        if (smartAvatarImageViewW52 != null) {
            C786410Ut5.o(smartAvatarImageViewW52, 0);
        }
        View view2 = (View) this.LLLFF.getValue();
        if (view2 != null) {
            int visibility2 = view2.getVisibility();
            view2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, view2);
        }
        super.T5(inboxEntrancePod);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
    @Override // X.C1903510zdN
    /* JADX INFO: renamed from: d6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r19) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903520zdO.R5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod):void");
    }

    public static void i6(UrlModel urlModel, SmartAvatarImageView smartAvatarImageView, TuxIconDrawable tuxIconDrawable) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LIZLLL(EnumC1906770zid.INBOX.getAvatarSceneTag());
        C1910480zoc.LIZ.getClass();
        C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
        C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
        c1331670kl3LJIIIIZZ.LJIL(tuxIconDrawable);
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        C1600630rkr.LIZIZ(c1331670kl3LJIIIIZZ, null, "EntranceNormalVH");
    }

    public final void q6(String str, String str2, TextPaint textPaint, int i) {
        SpannableStringBuilder spannableStringBuilderLIZJ = C0P0O.LIZJ(new SpannableStringBuilder(str), textPaint, i, 1, str2.length(), (int) textPaint.measureText(str2), false);
        TuxTextView tuxTextViewB6 = b6();
        if (tuxTextViewB6 != null) {
            tuxTextViewB6.setText(spannableStringBuilderLIZJ);
        }
    }
}
