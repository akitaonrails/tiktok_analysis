package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Xix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856570Xix implements InterfaceC856560Xiw {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(363));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(362));

    @Override // X.InterfaceC856560Xiw
    public final C1455410nyd LIZ() {
        return (C1455410nyd) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC856560Xiw
    public final C1455340nyW LIZJ() {
        return (C1455340nyW) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC856560Xiw
    public final Collection<Integer> LIZIZ() {
        return Collections.singletonList(Integer.valueOf(R.layout.c9y));
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.mIsFromDraft) {
            return true;
        }
        return false;
    }
}
