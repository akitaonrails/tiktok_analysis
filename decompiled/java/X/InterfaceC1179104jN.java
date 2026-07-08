package X;

import com.ugc.android.clientai.lang.request.ChatCompletionRequest;
import com.ugc.android.clientai.lang.response.ChatCompletionResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1179104jN {
    Object LIZIZ(ChatCompletionRequest chatCompletionRequest, InterfaceC1364105Vn<? super ChatCompletionResponse> interfaceC1364105Vn);

    Object LIZJ(ChatCompletionRequest chatCompletionRequest);

    Object LJFF(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1);

    void releaseResource();
}
