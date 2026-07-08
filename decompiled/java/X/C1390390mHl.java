package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastService;

/* JADX INFO: renamed from: X.0mHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390390mHl implements CreativeToastService {
    public static final C1390390mHl LIZ = new C1390390mHl();
    public static final IAVPublishPageUIRefactorService LIZIZ = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
    public static final ICreativeSAAService LIZJ = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r4, com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r5, X.C1390360mHi r6) {
        /*
            com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService r0 = X.C1390390mHl.LIZIZ
            r3 = 1
            if (r0 == 0) goto L2f
            boolean r0 = r0.enableToastCenter()
            if (r0 != r3) goto L2f
            com.ss.android.ugc.aweme.services.ICreativeSAAService r2 = X.C1390390mHl.LIZJ
            r1 = 0
            if (r2 == 0) goto L2f
            android.content.Context r0 = r6.LIZLLL
            if (r0 == 0) goto L4b
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
        L18:
            boolean r0 = r2.isPublishScene(r0)
            if (r0 == r3) goto L2c
            android.content.Context r0 = r6.LIZLLL
            if (r0 == 0) goto L26
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)
        L26:
            boolean r0 = r2.isPublishEditScene(r1)
            if (r0 != r3) goto L2f
        L2c:
            r5.isCenterToast(r3)
        L2f:
            X.0mHm r0 = new X.0mHm
            r0.<init>(r4, r5, r6)
            r6.LIZJ = r0
            kotlin.jvm.internal.AwS144S0201000_21 r1 = new kotlin.jvm.internal.AwS144S0201000_21
            r0 = 2
            r1.<init>(r4, r5, r6, r0)
            X.0mGx r0 = r6.LIZ
            if (r0 == 0) goto L43
            r0.LIZJ(r1)
        L43:
            X.0mGw r0 = r6.LIZIZ
            if (r0 == 0) goto L4a
            r0.LIZJ(r1)
        L4a:
            return
        L4b:
            r0 = r1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1390390mHl.LIZ(int, com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder, X.0mHi):void");
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Activity activity, int i, CreativeToastBuilder creativeToastBuilder) {
        C1390360mHi c1390360mHi = new C1390360mHi(activity, creativeToastBuilder);
        LIZ.getClass();
        LIZ(i, creativeToastBuilder, c1390360mHi);
        return c1390360mHi;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Dialog dialog, int i, CreativeToastBuilder creativeToastBuilder) {
        C1390360mHi c1390360mHi = new C1390360mHi(dialog, creativeToastBuilder);
        LIZ.getClass();
        LIZ(i, creativeToastBuilder, c1390360mHi);
        return c1390360mHi;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(View view, int i, CreativeToastBuilder creativeToastBuilder) {
        C1390360mHi c1390360mHi = new C1390360mHi(view, creativeToastBuilder);
        LIZ.getClass();
        LIZ(i, creativeToastBuilder, c1390360mHi);
        return c1390360mHi;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(PopupWindow popupWindow, int i, CreativeToastBuilder creativeToastBuilder) {
        C1390360mHi c1390360mHi = new C1390360mHi(popupWindow, creativeToastBuilder);
        LIZ.getClass();
        LIZ(i, creativeToastBuilder, c1390360mHi);
        return c1390360mHi;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToastService
    public final CreativeToast createToast(Fragment fragment, int i, CreativeToastBuilder creativeToastBuilder) {
        C1390360mHi c1390360mHi = new C1390360mHi(fragment, creativeToastBuilder);
        LIZ.getClass();
        LIZ(i, creativeToastBuilder, c1390360mHi);
        return c1390360mHi;
    }
}
