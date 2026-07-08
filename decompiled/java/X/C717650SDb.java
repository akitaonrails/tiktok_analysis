package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717650SDb extends C09AY implements Function2<VideoAuthorInfoRelationAssem, Integer, Unit> {
    public C717650SDb() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, Integer num) {
        int iIntValue = num.intValue();
        TuxTextView tuxTextView = videoAuthorInfoRelationAssem.LLJZIJLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1AV2 c1av2LIZ = C1AV3.LIZ(3, "Feed", null, "author");
        c1av2LIZ.LJI = true;
        C2180521AVm.LIZLLL(tuxTextView, iIntValue, c1av2LIZ);
        return Unit.LIZ;
    }
}
