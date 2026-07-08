package X;

import android.graphics.Typeface;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694890RNn extends C09AY implements Function1<String, Typeface> {
    public C694890RNn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Typeface invoke(String str) {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).typeFaceService().getTypefaceByFontName(str);
    }
}
