package X;

import com.ss.android.ugc.aweme.services.ExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394680mOg extends C09AY implements Function0<IOpenTextToImageService> {
    public C1394680mOg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IOpenTextToImageService invoke() {
        return ExternalService.INSTANCE.openTextToImageService();
    }
}
