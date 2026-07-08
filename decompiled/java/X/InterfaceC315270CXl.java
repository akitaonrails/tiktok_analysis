package X;

import com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateRequest;
import com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse;
import com.ss.android.ugc.aweme.amazon.model.AmazonTokenRemoveResponse;

/* JADX INFO: renamed from: X.0CXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC315270CXl {
    public static final C313200CPm LIZ = C313200CPm.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/ad/amazon/token/generate/")
    Object LIZ(@C040I AmazonTokenGenerateRequest amazonTokenGenerateRequest, InterfaceC1364105Vn<? super AmazonTokenGenerateResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/ad/amazon/token/remove/")
    Object LIZIZ(InterfaceC1364105Vn<? super AmazonTokenRemoveResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/ad/amazon/token/refresh/")
    Object LIZJ(InterfaceC1364105Vn<? super AmazonTokenGenerateResponse> interfaceC1364105Vn);
}
