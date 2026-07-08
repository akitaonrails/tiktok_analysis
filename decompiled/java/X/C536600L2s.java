package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0L2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536600L2s implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public Activity activity;
    public final EditorProRecordVideoContext editorProRecordInfo;

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
        return R.layout.c1w;
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
        return new ACListenerS143S0100000_8(this, 121);
    }

    public C536600L2s(EditorProRecordVideoContext editorProRecordVideoContext) {
        this.editorProRecordInfo = editorProRecordVideoContext;
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        this.activity = activity;
    }
}
