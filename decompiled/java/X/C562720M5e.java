package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562720M5e extends AbstractC562730M5f {
    public static final int $stable = 8;
    public Function0<Unit> finallyDo;
    public final EnterStoryParam param;

    @Override // X.AbstractC562730M5f, X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.el4;
    }

    @Override // X.AbstractC562730M5f, X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
    }

    @Override // X.AbstractC562730M5f, X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return new ACListenerS143S0100000_8(this, 123);
    }

    public C562720M5e(EnterStoryParam enterStoryParam) {
        super(enterStoryParam);
        this.param = enterStoryParam;
    }

    public final void setFinallyDo(Function0<Unit> function0) {
        this.finallyDo = function0;
    }
}
