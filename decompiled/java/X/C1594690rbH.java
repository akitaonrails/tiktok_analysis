package X;

import com.ss.android.ugc.aweme.ab.RefreshDuplicateConfig;
import com.ss.android.ugc.aweme.feed.data.ConsumeData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594690rbH extends C09AY implements Function0<C603820NmG<String, ConsumeData>> {
    public C1594690rbH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C603820NmG<String, ConsumeData> invoke() {
        int i = ((RefreshDuplicateConfig) C1594710rbJ.LIZIZ.getValue()).recordCount;
        if (i <= 0) {
            i = 1;
        }
        return new C603820NmG<>(i);
    }
}
