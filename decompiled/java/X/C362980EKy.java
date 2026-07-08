package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362980EKy extends AbstractC371450EhL<C0EL0> {
    public final C365910EWf LIZLLL;
    public final C01GW LJ;
    public final C0EL1 LJFF;

    public C362980EKy(C0EI6 c0ei6) {
        this.LIZLLL = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
        c0ei6.LIZ(C0ELI.class);
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(c0ei6, 1283));
        this.LJFF = new C0EL1();
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // X.AbstractC371450EhL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C0EL0> r21) {
        /*
            Method dump skipped, instruction units count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362980EKy.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC371450EhL
    public final void LJ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel = this.LJFF.LIZ;
        if (musicBuzModel != null) {
            videoPublishEditModel.creativeModel.musicBuzModel = musicBuzModel;
        }
        videoPublishEditModel.getEditorProModel().setShowMultiMusicEntrance(this.LJFF.LIZIZ);
    }
}
