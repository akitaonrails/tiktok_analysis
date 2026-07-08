package X;

import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.aweme.search.pages.result.common.copyrightmute.core.communicate.SearchCopyrightMuteServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P1P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P1P extends C09AY implements Function0<ISearchCopyrightMuteService> {
    public C0P1P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ISearchCopyrightMuteService invoke() {
        return SearchCopyrightMuteServiceImpl.LJI();
    }
}
