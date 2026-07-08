package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C1926307gb extends C2217421BqW implements Function0<C12872051y> {
    public C1926307gb(C1924607gK c1924607gK) {
        super(0, c1924607gK, C1924607gK.class, "getUnixTime", "getUnixTime-VsxL81w()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C12872051y invoke() {
        this.receiver.getClass();
        return new C12872051y(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
