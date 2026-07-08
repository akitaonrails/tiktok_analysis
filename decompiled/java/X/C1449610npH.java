package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0npH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449610npH {
    public static final C1449610npH LIZ = new C1449610npH();

    public static void LIZ(int i, int i2, final C19EG c19eg, final VideoPublishEditModel videoPublishEditModel) {
        C21566919al c21566919al = new C21566919al(c19eg);
        c21566919al.LIZ(i);
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(i2, new DialogInterface.OnClickListener() { // from class: X.0nXw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AVMusic aVMusic;
                C1449610npH c1449610npH = C1449610npH.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                c1449610npH.getClass();
                C363500EMy.LIZ.getClass();
                C1438850nXv c1438850nXv = C363500EMy.LIZIZ;
                if (c1438850nXv != null) {
                    aVMusic = c1438850nXv.LIZIZ;
                } else {
                    aVMusic = null;
                }
                C1452640nuA.LJII(aVMusic, false, videoPublishEditModel2.creativeModel.musicBuzModel);
                C1403010mc7.LIZ.getBridgeService().LJIIIZ(c19eg, videoPublishEditModel, C1B4F.LJIILL);
            }
        }, false);
        new C21566519ah(c21566919al).LIZLLL();
    }
}
