package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452810HpH extends C09AY implements Function0<Boolean> {
    public C452810HpH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MutableLiveData mutableLiveDataLJJIII = ComplianceServiceProvider.LJI().LJJIII();
        return Boolean.valueOf(mutableLiveDataLJJIII != null ? Intrinsics.LJFF(mutableLiveDataLJJIII.getValue(), Boolean.FALSE) : false);
    }
}
