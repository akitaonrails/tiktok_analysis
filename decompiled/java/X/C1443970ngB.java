package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0ngB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443970ngB {
    public static final C1443970ngB LIZ = new C1443970ngB();

    public static final String LIZ(int i) {
        int iMaxCreatorDuetOrStitchVideoTime = (int) ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime();
        switch (i) {
            case 1:
                return C20642515q3.LIZ().getString(2131829828, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            case 2:
                return C20642515q3.LIZ().getString(2131830048, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            case 3:
                return C20642515q3.LIZ().getString(2131858105, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            case 4:
                return C20642515q3.LIZ().getString(2131847852, Integer.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            case 5:
                return C20642515q3.LIZ().getString(2131845576, String.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            case 6:
                return C20642515q3.LIZ().getString(2131846009, String.valueOf(iMaxCreatorDuetOrStitchVideoTime / C538540LAe.LLJJJIL));
            default:
                return "";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZIZ(String str) {
        switch (str.hashCode()) {
            case -1528451439:
                if (!str.equals("share_to_story")) {
                    return 0;
                }
                return 4;
            case -892243791:
                if (!str.equals("stitch")) {
                    return 0;
                }
                return 2;
            case 3094784:
                if (!str.equals("duet")) {
                    return 0;
                }
                return 1;
            case 1296492712:
                if (!str.equals("allow_ai_remix")) {
                    return 0;
                }
                return 6;
            case 1325896954:
                if (!str.equals("create_sticker")) {
                    return 0;
                }
                return 3;
            case 1458418560:
                if (!str.equals("content_reuse_permission")) {
                    return 0;
                }
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean LIZJ(int i) {
        if (i > ((int) ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime())) {
            return true;
        }
        return false;
    }
}
