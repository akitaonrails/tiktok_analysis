package X;

import android.os.Bundle;
import nv7.c0;

/* JADX INFO: renamed from: X.0tBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractActivityC1655510tBN extends AbstractActivityC1674880tgc implements InterfaceC20011613Rq {
    public boolean LLIZ;

    @Override // X.ActivityC214874197g
    public final String LLLLZI() {
        return "video_shoot_page";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        this.LLIZ = false;
        super.finish();
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        this.LLIZ = false;
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1674880tgc
    public final InterfaceC1674890tgd LLLLZLLIL() {
        return c0.LIZ;
    }

    @Override // X.InterfaceC20011613Rq
    public final boolean isRecording() {
        return this.LLIZ;
    }

    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLIZ = true;
    }
}
