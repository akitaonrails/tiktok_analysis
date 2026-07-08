package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MJV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJV implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public Activity albumActivity;
    public final AIGCPictureHandler handler;
    public final String shootWay;

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
        return R.layout.cyl;
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
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return new ACListenerS143S0100000_8(this, 117);
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        this.albumActivity = activity;
        this.handler.setFinishFlowCallback(new AwS552S0100000_8(this, 888));
    }

    public C0MJV(AIGCPictureHandler aIGCPictureHandler, String str) {
        this.handler = aIGCPictureHandler;
        this.shootWay = str;
    }
}
