package X;

import com.ss.android.ugc.aweme.minis.service.MinisReportServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1395610mQB extends C2217421BqW implements Function2<C1395560mQ6, Throwable, Unit> {
    public C1395610mQB(Object obj) {
        super(2, obj, MinisReportServiceImpl.class, "onInstanceComplete", "onInstanceComplete(Lcom/ss/android/ugc/aweme/minis/report/report/MinisReportInstance;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1395560mQ6 c1395560mQ6, Throwable th) {
        ((MinisReportServiceImpl) this.receiver).LJIIL(c1395560mQ6);
        return Unit.LIZ;
    }
}
