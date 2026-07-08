package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C681290Qnv extends C2217421BqW implements Function0<Boolean> {
    public C681290Qnv(Object obj) {
        super(0, obj, ChooseSearchMusicFragment.class, "getKeyboardVisibility", "getKeyboardVisibility()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zIsVisible;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        ChooseSearchMusicFragment chooseSearchMusicFragment = (ChooseSearchMusicFragment) this.receiver;
        if (Build.VERSION.SDK_INT >= 30) {
            C19EG activity = chooseSearchMusicFragment.getActivity();
            zIsVisible = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null) ? false : rootWindowInsets.isVisible(WindowInsets.Type.ime());
        } else {
            zIsVisible = chooseSearchMusicFragment.PR().getState().LLILZ;
        }
        return Boolean.valueOf(zIsVisible);
    }
}
