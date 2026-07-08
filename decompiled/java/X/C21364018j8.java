package X;

import android.content.Intent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C21364018j8 extends C2217421BqW implements Function1<Intent, C21364318jB> {
    public C21364018j8(InterfaceC21363918j7 interfaceC21363918j7) {
        super(1, interfaceC21363918j7, InterfaceC21363918j7.class, "handleResponse", "handleResponse(Landroid/content/Intent;)Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/MediaSelectionResultData;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C21364318jB invoke(Intent intent) {
        return ((InterfaceC21363918j7) this.receiver).LIZ(intent);
    }
}
