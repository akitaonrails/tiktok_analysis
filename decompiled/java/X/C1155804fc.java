package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1155804fc extends C09AY implements Function1<VideoPublishEditModel, List<? extends String>> {
    public final /* synthetic */ Function1<VideoPublishEditModel, Boolean> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1155804fc(String str, Function1 function1) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(VideoPublishEditModel videoPublishEditModel) {
        if (this.LL.invoke(videoPublishEditModel).booleanValue()) {
            return Collections.singletonList(this.LLILLJJLI);
        }
        return C13BV.INSTANCE;
    }
}
