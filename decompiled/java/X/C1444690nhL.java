package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1444690nhL extends C2217421BqW implements Function1<UploadAuthKeyConfig, Unit> {
    public final /* synthetic */ Function1<UploadAuthKeyConfig, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1444690nhL(Function1<? super UploadAuthKeyConfig, Unit> function1) {
        super(1, C1449605lu.class, "innerOnSuccess", "requestAuthKey$innerOnSuccess(Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/publish/model/UploadAuthKeyConfig;)V", 0);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UploadAuthKeyConfig uploadAuthKeyConfig) {
        Function1<UploadAuthKeyConfig, Unit> function1 = this.LL;
        C1444650nhH c1444650nhH = C1444650nhH.LIZ;
        function1.invoke(uploadAuthKeyConfig);
        return Unit.LIZ;
    }
}
