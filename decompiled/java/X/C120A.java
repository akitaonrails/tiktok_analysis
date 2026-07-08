package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.120A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120A extends FrameLayout {
    public C424650Gkx LL;
    public C424630Gkv LLILLJJLI;
    public C427660Gpo LLILLL;
    public TextView LLILZ;
    public TuxTag LLILZIL;
    public C427290GpD LLILZLL;
    public C430490GuN LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public LinearLayout LLJI;
    public SmartImageView LLJIJIL;
    public TextView LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxTag LLJILLL;
    public ConstraintLayout LLJJ;
    public LinearLayout LLJJI;
    public View LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public ViewGroup LLJJJ;
    public FrameLayout LLJJJIL;
    public final C01GW LLJJJJ;

    private final Handler getUiHandler() {
        return (Handler) this.LLJJJJ.getValue();
    }

    public final SmartImageView getAnchorIcon() {
        SmartImageView smartImageView = this.LLJIJIL;
        if (smartImageView != null) {
            return smartImageView;
        }
        return null;
    }

    public final LinearLayout getAnchorLayout() {
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final TextView getAnchorText() {
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final ConstraintLayout getBottomTab() {
        ConstraintLayout constraintLayout = this.LLJJ;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        return null;
    }

    public final View getItemView() {
        View view = this.LLJJIII;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final C427660Gpo getIvOriginMusicCover() {
        C427660Gpo c427660Gpo = this.LLILLL;
        if (c427660Gpo != null) {
            return c427660Gpo;
        }
        return null;
    }

    public final LinearLayout getLeftBottomContent() {
        LinearLayout linearLayout = this.LLJJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final C424650Gkx getMAvatarView() {
        C424650Gkx c424650Gkx = this.LL;
        if (c424650Gkx != null) {
            return c424650Gkx;
        }
        return null;
    }

    public final C424630Gkv getMMusicCoverView() {
        C424630Gkv c424630Gkv = this.LLILLJJLI;
        if (c424630Gkv != null) {
            return c424630Gkv;
        }
        return null;
    }

    public final LinearLayout getPermissionLL() {
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final TuxTag getPermissionTag() {
        TuxTag tuxTag = this.LLJILLL;
        if (tuxTag != null) {
            return tuxTag;
        }
        return null;
    }

    public final C430490GuN getTvDescription() {
        C430490GuN c430490GuN = this.LLIZ;
        if (c430490GuN != null) {
            return c430490GuN;
        }
        return null;
    }

    public final C427290GpD getTvMusic() {
        C427290GpD c427290GpD = this.LLILZLL;
        if (c427290GpD != null) {
            return c427290GpD;
        }
        return null;
    }

    public final TextView getTvName() {
        TextView textView = this.LLILZ;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TuxTag getTvSocialVideoTagged() {
        TuxTag tuxTag = this.LLILZIL;
        if (tuxTag != null) {
            return tuxTag;
        }
        return null;
    }

    public final TuxTextView getTvTitle() {
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getTvToggle() {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final InterfaceC2257101DWa LIZ() {
        String strLIZJ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || currentUser.getAvatarThumb() == null) {
            C1324750kZt.LIZIZ(getMAvatarView(), 2130971789);
        } else {
            C1324750kZt.LJI(getMAvatarView(), currentUser.getAvatarThumb(), (int) C11VU.LIZIZ(49.0f, getContext()), (int) C11VU.LIZIZ(49.0f, getContext()));
        }
        TextView tvName = getTvName();
        if (C0FEA.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = getContext().getResources();
            c1464900oDw.getClass();
            sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources2 = getContext().getResources();
            c1464900oDw2.getClass();
            strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
        }
        tvName.setText(strLIZJ);
        return currentUser;
    }

    public final void LIZJ() {
        C786410Ut5.LJJZZIII(getUiHandler(), new ARunnableS129S0100000_29(this, 89));
    }

    public final float getBottomMarginForCaptionSticker() {
        return getHeight() - getLeftBottomContent().getTop();
    }

    public final void setAnchorIcon(SmartImageView smartImageView) {
        this.LLJIJIL = smartImageView;
    }

    public final void setAnchorLayout(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setAnchorText(TextView textView) {
        this.LLJILJIL = textView;
    }

    public final void setBottomMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getItemView().getLayoutParams();
        layoutParams.bottomMargin = i;
        C786410Ut5.W5(getItemView(), layoutParams);
    }

    public final void setBottomTab(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    public final void setItemView(View view) {
        this.LLJJIII = view;
    }

    public final void setIvOriginMusicCover(C427660Gpo c427660Gpo) {
        this.LLILLL = c427660Gpo;
    }

    public final void setLeftBottomContent(LinearLayout linearLayout) {
        this.LLJJI = linearLayout;
    }

    public final void setMAvatarView(C424650Gkx c424650Gkx) {
        this.LL = c424650Gkx;
    }

    public final void setMMusicCoverView(C424630Gkv c424630Gkv) {
        this.LLILLJJLI = c424630Gkv;
    }

    public final void setPermissionLL(LinearLayout linearLayout) {
        this.LLJILJILJ = linearLayout;
    }

    public final void setPermissionTag(TuxTag tuxTag) {
        this.LLJILLL = tuxTag;
    }

    public final void setTvDescription(C430490GuN c430490GuN) {
        this.LLIZ = c430490GuN;
    }

    public final void setTvMusic(C427290GpD c427290GpD) {
        this.LLILZLL = c427290GpD;
    }

    public final void setTvName(TextView textView) {
        this.LLILZ = textView;
    }

    public final void setTvSocialVideoTagged(TuxTag tuxTag) {
        this.LLILZIL = tuxTag;
    }

    public final void setTvTitle(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvToggle(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public C120A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJJJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(614));
        setItemView(C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.jw, this, false));
        setMAvatarView((C424650Gkx) getItemView().findViewById(R.id.user_avatar));
        getMAvatarView().setBorderColor(R.attr.ee);
        setMMusicCoverView((C424630Gkv) getItemView().findViewById(R.id.otv));
        setIvOriginMusicCover((C427660Gpo) getItemView().findViewById(R.id.ptd));
        setTvName((TextView) getItemView().findViewById(R.id.zym));
        setTvSocialVideoTagged((TuxTag) getItemView().findViewById(R.id.vog));
        setTvMusic((C427290GpD) getItemView().findViewById(R.id.zy8));
        setTvDescription((C430490GuN) getItemView().findViewById(R.id.rq2));
        setTvTitle((TuxTextView) getItemView().findViewById(R.id.rsg));
        setTvToggle((TuxTextView) getItemView().findViewById(R.id.tv_toggle));
        setAnchorLayout((LinearLayout) getItemView().findViewById(R.id.ros));
        setAnchorIcon((SmartImageView) getItemView().findViewById(R.id.b0f));
        setAnchorText((TextView) getItemView().findViewById(R.id.b0_));
        setPermissionTag((TuxTag) getItemView().findViewById(R.id.sh0));
        setLeftBottomContent((LinearLayout) getItemView().findViewById(R.id.sgy));
        this.LLJJIJIIJIL = (TuxIconView) getItemView().findViewById(R.id.hk0);
        this.LLJJIJI = (TuxIconView) getItemView().findViewById(R.id.hko);
        this.LLJJIJIL = (TuxIconView) getItemView().findViewById(R.id.hky);
        this.LLJJJ = (ViewGroup) getItemView().findViewById(R.id.sh1);
        this.LLJJJIL = (FrameLayout) getItemView().findViewById(R.id.ou2);
        addView(getItemView());
        C424650Gkx mAvatarView = getMAvatarView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(mAvatarView);
        mAvatarView.setAlpha(0.5f);
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.5f);
        }
        TuxIconView tuxIconView2 = this.LLJJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 0.5f);
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.5f);
        }
        TuxIconView tuxIconView4 = this.LLJJIJI;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 0.5f);
        }
        C786410Ut5.W4(getAnchorLayout(), 0.5f);
        ViewGroup viewGroup = this.LLJJJ;
        if (viewGroup != null) {
            C786410Ut5.R4(0.5f, viewGroup);
        }
        C786410Ut5.B5(getTvTitle(), 0.5f);
        C430490GuN tvDescription = getTvDescription();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tvDescription);
        tvDescription.setAlpha(0.5f);
        C786410Ut5.B5(getTvToggle(), 0.5f);
        C427290GpD tvMusic = getTvMusic();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tvMusic);
        tvMusic.setAlpha(0.5f);
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 0.5f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, java.lang.String r26, com.ss.android.ugc.aweme.base.model.UrlModel r27, int r28, java.lang.Integer r29) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120A.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, java.lang.Integer):void");
    }
}
