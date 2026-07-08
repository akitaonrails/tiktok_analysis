package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent;
import com.ss.android.ugc.aweme.socialavatar.view.ChoosePhotoActivityLauncher;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarPhotoDetectResultItem;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462920IDi implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
        }
    }

    public C462920IDi(LiveSfvPostContentComponent liveSfvPostContentComponent, int i) {
        this.$t = i;
        this.l0 = liveSfvPostContentComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C462920IDi(InterfaceC20236714Gf interfaceC20236714Gf, InterfaceC20236714Gf<? super Pair<String, String>> interfaceC20236714Gf2, ChoosePhotoActivityLauncher choosePhotoActivityLauncher) {
        this.$t = choosePhotoActivityLauncher;
        this.l0 = interfaceC20236714Gf;
    }

    public static final void onActivityResult$0(C462920IDi c462920IDi, int i, int i2, Intent intent) {
        SocialAvatarPhotoDetectResultItem socialAvatarPhotoDetectResultItem;
        if (!((InterfaceC20236714Gf) c462920IDi.l0).isActive()) {
            return;
        }
        if (i == 24532 && i2 == -1) {
            if (intent == null) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c462920IDi.l0;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (socialAvatarPhotoDetectResultItem = (SocialAvatarPhotoDetectResultItem) extras.getParcelable("aimoji_album_photo_detect_result")) != null) {
                    String str = socialAvatarPhotoDetectResultItem.originalImagePath;
                    String str2 = socialAvatarPhotoDetectResultItem.fileLocalUriPath;
                    InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c462920IDi.l0;
                    if (str != null && str2 != null) {
                        Pair pair = new Pair(str, str2);
                        C189200o6.m2constructorimpl(pair);
                        interfaceC20236714Gf2.resumeWith(pair);
                        if (Unit.LIZ != null) {
                            return;
                        }
                    }
                    InterfaceC20236714Gf interfaceC20236714Gf3 = (InterfaceC20236714Gf) c462920IDi.l0;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf3.resumeWith(null);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            InterfaceC20236714Gf interfaceC20236714Gf4 = (InterfaceC20236714Gf) c462920IDi.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf4.resumeWith(null);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf5 = (InterfaceC20236714Gf) c462920IDi.l0;
        C098200Yq c098200Yq = new C098200Yq(new RuntimeException());
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf5.resumeWith(c098200Yq);
    }

    public static final void onActivityResult$1(C462920IDi c462920IDi, int i, int i2, Intent intent) {
        C19EG c19egLIZ;
        if (i == 1000 && i2 == -1 && (c19egLIZ = C724240Sb0.LIZ((LiveSfvPostContentComponent) c462920IDi.l0)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131855481);
            c1389890mGx.LJIIJJI();
        }
    }
}
