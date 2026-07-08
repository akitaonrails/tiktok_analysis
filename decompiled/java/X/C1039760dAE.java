package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity;
import kotlin.jvm.internal.AwS6S3100000_16;

/* JADX INFO: renamed from: X.0dAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039760dAE extends AbstractC1039820dAK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile C1053550dWT LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1039760dAE.class, "adWebHistoryManager", "getAdWebHistoryManager()Lcom/ss/android/ugc/aweme/history/AdWebHistoryManager;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1053550dWT LIZJ() {
        C1053550dWT c1053550dWT = this.LLILLL;
        if (c1053550dWT == null) {
            synchronized (this) {
                c1053550dWT = this.LLILLL;
                if (c1053550dWT == null) {
                    C1053550dWT c1053550dWT2 = (C1053550dWT) C1807670x8n.LJJJJI();
                    this.LLILLL = c1053550dWT2;
                    return c1053550dWT2;
                }
            }
        }
        return c1053550dWT;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1039810dAJ interfaceC1039810dAJ = (InterfaceC1039810dAJ) xBaseParamModel;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1038790d8f c1038790d8f = C1038790d8f.LIZ;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        c1038790d8f.getClass();
        String strLIZ = C1038790d8f.LIZ(lValueOf);
        AdWebHistoryEntity adWebHistoryEntity = new AdWebHistoryEntity(interfaceC1039810dAJ.getUrl(), interfaceC1039810dAJ.getTitle(), interfaceC1039810dAJ.getIconUrl(), Long.valueOf(jCurrentTimeMillis), strLIZ, null, null, null, null, 0, null);
        C1053550dWT c1053550dWT = this.LLILLL;
        if (c1053550dWT == null) {
            synchronized (this) {
                c1053550dWT = this.LLILLL;
                if (c1053550dWT == null) {
                    c1053550dWT = (C1053550dWT) C1807670x8n.LJJJJI();
                    this.LLILLL = c1053550dWT;
                }
            }
        }
        Boolean bool = Boolean.TRUE;
        c1053550dWT.LJII(adWebHistoryEntity, bool, bool, 2);
        Long l = LIZJ().LIZIZ().LJ;
        String url = interfaceC1039810dAJ.getUrl();
        String iconUrl = interfaceC1039810dAJ.getIconUrl();
        String title = interfaceC1039810dAJ.getTitle();
        C1040580dBY c1040580dBY = new C1040580dBY(new Object[0]);
        C1040750dBp.LIZ.getClass();
        c1040580dBY.log(C1040750dBp.LJJJ, new AwS6S3100000_16(url, iconUrl, title, l, 5));
    }
}
