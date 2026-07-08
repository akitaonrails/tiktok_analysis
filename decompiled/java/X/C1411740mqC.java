package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411740mqC {
    public static final List<InterfaceC420801kM> LIZ(VideoPublishEditModel videoPublishEditModel, RecommendDescRequestBody recommendDescRequestBody, RecommendDescRequestBody recommendDescRequestBody2, long j, long j2, int i, boolean z, Function1<? super RecommendDescResponse, Unit> function1, Function1<? super EnumC1411090mp9, Unit> function12, Function1<? super RecommendDescResponse, Unit> function13, Function1<? super EnumC1411090mp9, Unit> function14) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C1411720mqA().LIZ(videoPublishEditModel, recommendDescRequestBody, j, j2, i, function1, function12));
        }
        arrayList.add(new C1411720mqA().LIZ(videoPublishEditModel, recommendDescRequestBody2, j, j2, i, function13, function14));
        return arrayList;
    }
}
