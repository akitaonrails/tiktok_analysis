package X;

import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820800WHu extends C09AY implements Function0<Boolean> {
    public C820800WHu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((ApplogAllowKeysModel) ApplogAllowKeysExp.LJFF.getValue()).enable);
    }
}
