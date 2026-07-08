package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialCreationMediaPickerScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563830M9l {
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C562690M5b LIZ(com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r40, java.lang.String r41, androidx.lifecycle.ViewModelStore r42, final X.C563530M8h r43) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C563830M9l.LIZ(com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam, java.lang.String, androidx.lifecycle.ViewModelStore, X.0M8h):X.0M5b");
    }

    public static SocialCreationMediaPickerScene LIZIZ(C19EG c19eg, Bundle bundle, EnterStoryParam enterStoryParam, String str, Long l, Long l2, Boolean bool, C0M8Q c0m8q, int i) {
        Boolean bool2 = bool;
        Long l3 = l;
        C0M8Q c0m8q2 = null;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            l3 = null;
        }
        if ((i & 16) != 0) {
            l2 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) == 0) {
            c0m8q2 = c0m8q;
        }
        C562690M5b c562690M5bLIZ = LIZ(enterStoryParam, str, c19eg.getViewModelStore(), new C563530M8h(c19eg.getApplication(), c19eg, c19eg, new AwS552S0100000_8(c19eg, 832)));
        EnterStoryParam enterStoryParam2 = c562690M5bLIZ.LIZ;
        SocialMediaPickerViewModel socialMediaPickerViewModel = c562690M5bLIZ.LIZIZ;
        socialMediaPickerViewModel.LLJ = c0m8q2;
        if (l2 != null) {
            C0LJI c0lji = new C0LJI(c562690M5bLIZ.LIZ.getShootWay(), c562690M5bLIZ.LIZ.getEnterFrom(), l3, l2.longValue(), Intrinsics.LJFF(bool2, Boolean.TRUE));
            socialMediaPickerViewModel.LLILZIL.pB(c0lji);
            socialMediaPickerViewModel.LLJJL = c0lji;
        }
        SocialCreationMediaPickerScene socialCreationMediaPickerScene = new SocialCreationMediaPickerScene(enterStoryParam2, socialMediaPickerViewModel);
        if (bundle == null) {
            bundle = new Bundle();
        }
        socialCreationMediaPickerScene.mArguments = bundle;
        return socialCreationMediaPickerScene;
    }
}
