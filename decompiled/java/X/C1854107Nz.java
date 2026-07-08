package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1854107Nz extends C09AY implements Function0<Boolean> {
    public C1854107Nz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((Number) C07O1.LIZ.getValue()).longValue() > Mp4ScreenVideoLoadTimeout.CONTROL);
    }
}
