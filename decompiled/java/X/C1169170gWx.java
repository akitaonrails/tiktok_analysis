package X;

import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1169170gWx extends C2217421BqW implements Function0<Unit> {
    public C1169170gWx(Object obj) {
        super(0, obj, MixVideosDialog.class, "checkLoginAndToggleFavorite", "checkLoginAndToggleFavorite()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixVideosDialog mixVideosDialog = (MixVideosDialog) this.receiver;
        mixVideosDialog.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            mixVideosDialog.oD2();
        } else {
            C0XPD.LIZJ(mixVideosDialog, "playlist", "playlist_panel", null, new C1208960hZ8(mixVideosDialog, 0));
        }
        return Unit.LIZ;
    }
}
