package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0s24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611300s24 {
    public final Context LIZ;
    public final SecretRepliesRecordParam LIZIZ;

    public final void LIZIZ() {
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = this.LIZIZ.getSecretRepliesResponseStickerStruct();
        Long baseAwemeId = secretRepliesResponseStickerStruct != null ? secretRepliesResponseStickerStruct.getBaseAwemeId() : null;
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct2 = this.LIZIZ.getSecretRepliesResponseStickerStruct();
        String questionText = secretRepliesResponseStickerStruct2 != null ? secretRepliesResponseStickerStruct2.getQuestionText() : null;
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct3 = this.LIZIZ.getSecretRepliesResponseStickerStruct();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("SecretRepliesRecord", new C1611290s23(this, "view_list_secret_reply", new SecretRepliesRecordParam(null, new SecretRepliesResponseStickerStruct(baseAwemeId, questionText, secretRepliesResponseStickerStruct3 != null ? secretRepliesResponseStickerStruct3.getResponseText() : null))));
    }

    public final void LIZ(String str) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("SecretRepliesRecord", new C1611290s23(this, str, new SecretRepliesRecordParam(new SecretRepliesStickerStruct(this.LIZ.getString(2131847219)), null)));
    }

    public C1611300s24(Context context, SecretRepliesRecordParam secretRepliesRecordParam) {
        this.LIZ = context;
        this.LIZIZ = secretRepliesRecordParam;
    }
}
