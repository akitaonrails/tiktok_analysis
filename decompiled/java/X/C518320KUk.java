package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0KUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518320KUk extends C09AY implements Function0<C11NZ<C470590Icr<SMBPreviewResponse.ResponseData>>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518320KUk(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<C470590Icr<SMBPreviewResponse.ResponseData>> invoke() {
        C480460Ism.LIZ().getClass();
        return ((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getServicePlusPreview(this.LL, this.LLILLJJLI);
    }
}
