package X;

import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14oW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20378214oW extends C2217421BqW implements Function0<Boolean> {
    public C20378214oW(Object obj) {
        super(0, obj, C20377814oS.class, "isSymphonyEngineEnable", "isSymphonyEngineEnable()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.receiver.getClass();
        ILinkCoreService iLinkCoreService = (ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class);
        return Boolean.valueOf(C500260Jjc.LJJJI(iLinkCoreService != null ? Boolean.valueOf(iLinkCoreService.Nq1()) : null));
    }
}
