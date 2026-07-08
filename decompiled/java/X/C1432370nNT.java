package X;

import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432370nNT extends AbstractC1437870nWL {
    public final VideoPublishEditModel LIZLLL;
    public final int LJ;
    public final int LJFF;

    @Override // X.InterfaceC1444130ngR
    public final int LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJFF() {
        return this.LJ;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJI() {
        return this.LJFF;
    }

    public C1432370nNT(VideoPublishEditModel videoPublishEditModel) {
        int i;
        float f;
        NowsExtra nowsExtra;
        super(videoPublishEditModel);
        this.LIZLLL = videoPublishEditModel;
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize(videoPublishEditModel);
        if (recordVideoSize != null && recordVideoSize.length == 2) {
            i = recordVideoSize[0];
        } else {
            i = 720;
        }
        this.LJ = i;
        float f2 = i;
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
            f = 0.5625f;
        } else {
            f = 0.75f;
        }
        this.LJFF = (int) (f2 / f);
    }

    @Override // X.AbstractC1437870nWL, X.InterfaceC1444130ngR
    public final int LIZ(boolean z) {
        float f;
        NowsExtra nowsExtra;
        float f2 = this.LJ;
        NowsShootModel nowsShootModel = this.LIZLLL.creativeModel.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
            f = 0.5625f;
        } else {
            f = 0.75f;
        }
        return (int) (f2 / f);
    }

    @Override // X.AbstractC1437870nWL, X.InterfaceC1444130ngR
    public final int LIZIZ(boolean z) {
        return this.LJ;
    }
}
