package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;

/* JADX INFO: renamed from: X.0M5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC562730M5f implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public String LL;
    public String LLILLJJLI;

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
    }

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public abstract /* synthetic */ View.OnClickListener getClickListener();

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public abstract /* synthetic */ int layoutRes();

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
    public abstract /* synthetic */ void setAlbumActivity(Activity activity);

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    public final String getCreationID() {
        return this.LL;
    }

    public final String getShootWay() {
        return this.LLILLJJLI;
    }

    public AbstractC562730M5f(EnterStoryParam enterStoryParam) {
    }

    public final void setCreationID(String str) {
        this.LL = str;
    }

    public final void setShootWay(String str) {
        this.LLILLJJLI = str;
    }

    public final void injectMobParam(String str, String str2) {
        this.LLILLJJLI = str;
        this.LL = str2;
    }
}
