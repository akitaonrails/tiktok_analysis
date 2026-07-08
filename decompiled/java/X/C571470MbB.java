package X;

import Y.ARunnableS17S0400000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571470MbB implements InterfaceC1449840npe {
    public final /* synthetic */ VideoPublishEditModel LIZ;
    public final /* synthetic */ C1463670oBx LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ Intent LIZLLL;
    public final /* synthetic */ NLEEditor LJ;

    @Override // X.InterfaceC1449840npe
    public final void onSuccess() {
        C371410EhH.LIZIZ(new ARunnableS17S0400000_8(this, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, 6));
    }

    @Override // X.InterfaceC1449840npe
    public final void onFailure() {
        C371410EhH.LIZIZ(new ARunnableS77S0200000_8(this, this.LIZJ, this.LIZLLL, 36));
    }

    public final void LIZ(Intent intent) {
        this.LJ.done();
        this.LIZ.setNleData(this.LJ.store());
        C1428470nHB.LLIIZ(intent, this.LIZ);
        C1660680tJi.LIZ().LJIIJ(this.LIZJ, intent);
        C201955140j.LJIILJJIL(C0MAY.LIZIZ, "DraftEditHelper after openVideoPublishPage");
    }

    public C571470MbB(Context context, Intent intent, NLEEditor nLEEditor, C1463670oBx c1463670oBx, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c1463670oBx;
        this.LIZJ = context;
        this.LIZLLL = intent;
        this.LJ = nLEEditor;
    }
}
