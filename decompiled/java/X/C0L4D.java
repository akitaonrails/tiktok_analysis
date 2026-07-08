package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;

/* JADX INFO: renamed from: X.0L4D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4D implements InterfaceC1637970sj5 {
    @Override // X.InterfaceC1637970sj5
    public final Intent LIZ(C19EG c19eg, Intent intent) {
        intent.setClass(c19eg, VECutVideoActivity.class);
        return intent;
    }

    @Override // X.InterfaceC1637970sj5
    public final Intent LIZIZ(Activity activity, Bundle bundle, int i) {
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i);
        return intent;
    }
}
