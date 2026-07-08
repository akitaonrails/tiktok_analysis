package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0L0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535990L0j implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public final ShortVideoContext LL;
    public CreativeDialogWrapper LLILLJJLI;
    public C19EG activity;
    public boolean enableClick = true;

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
    }

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.cyk;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needFullSpan() {
        return false;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needGray() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public void onRecoverFromGray() {
        this.enableClick = true;
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
        this.enableClick = false;
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    public final void dismissProgressDialog() {
        CreativeDialogWrapper creativeDialogWrapper = this.LLILLJJLI;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return new ACListenerS143S0100000_8(this, 118);
    }

    public final void showProgressDialog() {
        if (this.LLILLJJLI == null) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            C19EG c19eg = this.activity;
            if (c19eg == null) {
                return;
            }
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            this.LLILLJJLI = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19eg, 1001, creativeLoadingDialogBuilder);
        }
        C01GW c01gw = C283680B9y.LIZ;
        if (((Number) c01gw.getValue()).longValue() == -1 || ((Boolean) C536120L0w.LIZ.getValue()).booleanValue()) {
            CreativeDialogWrapper creativeDialogWrapper = this.LLILLJJLI;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.show();
                return;
            }
            return;
        }
        CreativeDialogWrapper creativeDialogWrapper2 = this.LLILLJJLI;
        if (creativeDialogWrapper2 != null) {
            creativeDialogWrapper2.delayShow(((Number) c01gw.getValue()).longValue());
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return this.LL;
    }

    public C535990L0j(ShortVideoContext shortVideoContext) {
        this.LL = shortVideoContext;
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        C19EG c19eg;
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        this.activity = c19eg;
    }
}
