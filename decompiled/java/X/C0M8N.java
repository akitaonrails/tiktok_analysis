package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0M8N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8N extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ C1455260nyO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M8N(C1455260nyO c1455260nyO) {
        super(1);
        this.LL = c1455260nyO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        C0LAB c0lab2 = c0lab;
        VideoPublishEditModel videoPublishEditModel = this.LL.LLLFZ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0lab2);
        VideoPublishEditModel videoPublishEditModel3 = this.LL.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        C1413430msv.LIZLLL(videoPublishEditModel3, c0lab2);
        VideoPublishEditModel videoPublishEditModel4 = this.LL.LLLFZ;
        if (videoPublishEditModel4 != null) {
            videoPublishEditModel2 = videoPublishEditModel4;
        }
        C1413430msv.LJFF(videoPublishEditModel2, c0lab2);
        for (Map.Entry entry : ((LinkedHashMap) this.LL.y).entrySet()) {
            c0lab2.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        return Unit.LIZ;
    }
}
