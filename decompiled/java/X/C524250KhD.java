package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C524250KhD implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public transient Activity activity;
    public final RecordConfig recordConfig;

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
        return new ACListenerS143S0100000_8(this, 125);
    }

    public C524250KhD(RecordConfig recordConfig) {
        this.recordConfig = recordConfig;
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        this.activity = activity;
    }
}
