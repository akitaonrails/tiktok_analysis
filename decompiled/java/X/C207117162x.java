package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.162x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207117162x extends C09AY implements Function0<C207136163q> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207117162x(C207118162y c207118162y) {
        super(0);
        this.LL = c207118162y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C207136163q invoke() {
        List listLJIILJJIL;
        Fragment fragment;
        C19EG activity;
        VideoItemParams videoItemParams = this.LL.LJI;
        if (videoItemParams == null || (fragment = videoItemParams.fragment) == null || (activity = fragment.getActivity()) == null || !C0SXG.LIZ(activity)) {
            C163Z[] c163zArr = new C163Z[4];
            c163zArr[0] = C294320BgE.LIZ() ? this.LL.LJIIJ : this.LL.LJIIIZ;
            C207118162y c207118162y = this.LL;
            c163zArr[1] = c207118162y.LJIIJJI;
            c163zArr[2] = c207118162y.LJIILIIL;
            c163zArr[3] = new C207112162s();
            listLJIILJJIL = C1697810uHb.LJIILJJIL(c163zArr);
            C207118162y c207118162y2 = this.LL;
            if (C281430B1h.LIZ()) {
                listLJIILJJIL.add(c207118162y2.LJIIL);
            }
            if (C299170Bo3.LIZJ()) {
                listLJIILJJIL.add(c207118162y2.LJIILJJIL);
            }
        } else {
            listLJIILJJIL = Collections.singletonList(this.LL.LJIILIIL);
        }
        return new C207136163q(new ArrayList(listLJIILJJIL));
    }
}
