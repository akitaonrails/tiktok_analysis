package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EL3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EL3 extends AbstractC371450EhL<C0EL8> {
    public final boolean LIZLLL;
    public final C0EL6 LJ;
    public final C362910EKr LJFF;
    public final C365910EWf LJI;
    public final C0E48 LJII;
    public final C0EL7 LJIIIIZZ = new C0EL7();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    @Override // X.AbstractC371450EhL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C0EL8> r13) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EL3.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC371450EhL
    public final void LJ(VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModel = this.LJIIIIZZ.LIZIZ;
        if (nLEModel != null) {
            videoPublishEditModel.setNleModel(nLEModel);
            videoPublishEditModel.setNleDataChange(false);
        }
        String str = this.LJIIIIZZ.LIZ;
        if (str != null) {
            videoPublishEditModel.setNleData(str);
        }
        C0F1Z c0f1z = C0F1Z.LIZ;
        C0E48 c0e48 = this.LJII;
        c0f1z.getClass();
        C0F1Z.LJFF(videoPublishEditModel, c0e48, false, false);
    }

    public C0EL3(C0EI6 c0ei6, boolean z) {
        this.LIZLLL = z;
        this.LJ = (C0EL6) c0ei6.LIZ(C0EL6.class);
        this.LJFF = (C362910EKr) c0ei6.LIZ(C362910EKr.class);
        this.LJI = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
        this.LJII = (C0E48) c0ei6.LIZ(C0E48.class);
    }
}
