package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0heE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212120heE extends C09AY implements Function1<AnchorCommonStruct, CharSequence> {
    public C1212120heE() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(AnchorCommonStruct anchorCommonStruct) {
        return anchorCommonStruct.getId();
    }
}
