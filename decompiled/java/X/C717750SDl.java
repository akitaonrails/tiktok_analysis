package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717750SDl extends C09AY implements Function2<VideoAuthorInfoRelationAssem, Pair<? extends String, ? extends String>, Unit> {
    public C717750SDl() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, Pair<? extends String, ? extends String> pair) {
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        Pair<? extends String, ? extends String> pair2 = pair;
        if (pair2 != null) {
            Context context = videoAuthorInfoRelationAssem2.getContext();
            String first = pair2.getFirst();
            String second = pair2.getSecond();
            TuxTextView tuxTextView = videoAuthorInfoRelationAssem2.LLJZIJLIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C1908030zkf.LJI(context, first, second, tuxTextView);
        }
        return Unit.LIZ;
    }
}
