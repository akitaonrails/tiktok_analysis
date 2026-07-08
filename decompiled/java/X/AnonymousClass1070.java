package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import java.util.Collections;

/* JADX INFO: renamed from: X.1070, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1070 {
    public static final AnonymousClass1070 LIZ = new AnonymousClass1070();
    public static final C103L LIZIZ;
    public static final C103L LIZJ;

    static {
        C103N c103n = new C103N(2131858195);
        int i = 0;
        C104A[] c104aArr = new C104A[1];
        String str = "video_view_history";
        int i2 = 4;
        C107O c107o = new C107O(str, str, i2, i);
        c107o.LIZ = "video_view_history_item";
        c107o.LJIIJJI = 1;
        c107o.LJIIL = 2;
        c107o.LJ = new C103N(2131858197);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        c107o.LJFF = new C103N((iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJII()) ? 2131858196 : 2131849022);
        c104aArr[0] = c107o;
        LIZIZ = new C103L("video_view_history", c103n, 0, null, Collections.singletonList(C191853103v.LIZIZ(c104aArr)), 44);
        C103N c103n2 = new C103N(2131845517);
        String str2 = "profile_view_history";
        C107O c107o2 = new C107O(str2, str2, i2, i);
        c107o2.LIZ = "profile_view_history_item";
        c107o2.LJIIJJI = 1;
        c107o2.LJIIL = 2;
        c107o2.LJ = new C103N(2131845518);
        c107o2.LJFF = new C103N(2131845520);
        LIZJ = new C103L("profile_view_history", c103n2, 0, null, Collections.singletonList(c107o2), 44);
    }
}
