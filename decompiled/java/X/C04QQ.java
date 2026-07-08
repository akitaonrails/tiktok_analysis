package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageListClipboardService;

/* JADX INFO: renamed from: X.04QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04QQ implements IIMMessageListClipboardService {
    public static final C04QQ LIZIZ = new C04QQ();
    public final /* synthetic */ IIMMessageListClipboardService LIZ;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageListClipboardService
    public final void LIZ(Context context, String str) {
        this.LIZ.LIZ(context, str);
    }

    public C04QQ() {
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageListClipboardService.class);
        if (objPluggableSpiForReal != null) {
            this.LIZ = (IIMMessageListClipboardService) objPluggableSpiForReal;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
