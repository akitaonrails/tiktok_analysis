package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.base.service.MentionServiceImpl;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.service.IMentionService;
import com.ss.android.ugc.aweme.service.MentionListCellStyle;
import java.util.Map;

/* JADX INFO: renamed from: X.15lH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20612915lH implements IMentionService {
    public static final C20612915lH LIZIZ = new C20612915lH();
    public final /* synthetic */ IMentionService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZ(C19628911qx c19628911qx, C19EG c19eg, ViewGroup viewGroup, String str, String str2, String str3, boolean z) {
        return this.LIZ.LIZ(c19628911qx, c19eg, viewGroup, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1348870lCn LIZIZ(String str, Map map, C1348740lCa c1348740lCa, Fragment fragment, C1163430gNh c1163430gNh) {
        return this.LIZ.LIZIZ(str, map, c1348740lCa, fragment, c1163430gNh);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZJ(C2246331Cw3 c2246331Cw3, UIAssem uIAssem) {
        return this.LIZ.LIZJ(c2246331Cw3, uIAssem);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZLLL(String str, C1356630lPJ c1356630lPJ, UIAssem uIAssem, int i, int i2, String str2) {
        return this.LIZ.LIZLLL(str, c1356630lPJ, uIAssem, i, i2, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final C0P0T LJ(Context context, PointF pointF, String str, String str2, View.OnClickListener onClickListener) {
        return this.LIZ.LJ(context, pointF, str, str2, onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final MentionRecommendResponse LJFF(MentionRecommendQueryRequest mentionRecommendQueryRequest) {
        return this.LIZ.LJFF(mentionRecommendQueryRequest);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final int LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1348870lCn LJII(String str, Map map, InterfaceC20613315lL interfaceC20613315lL, UIAssem uIAssem, C1163430gNh c1163430gNh) {
        return this.LIZ.LJII(str, map, interfaceC20613315lL, uIAssem, c1163430gNh);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC316600Cb4 LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LJIIIZ(InterfaceC20613315lL interfaceC20613315lL, C19EG c19eg, int i, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, MentionListCellStyle mentionListCellStyle) {
        return this.LIZ.LJIIIZ(interfaceC20613315lL, c19eg, i, str, str2, str3, str4, str5, z, bool, mentionListCellStyle);
    }

    public C20612915lH() {
        IMentionService iMentionService;
        Object objLIZ = C04TD.LIZ(IMentionService.class, false);
        if (objLIZ != null) {
            iMentionService = (IMentionService) objLIZ;
        } else {
            if (C04TD.LLIL == null) {
                synchronized (IMentionService.class) {
                    if (C04TD.LLIL == null) {
                        C04TD.LLIL = new MentionServiceImpl();
                    }
                }
            }
            iMentionService = C04TD.LLIL;
        }
        this.LIZ = iMentionService;
    }
}
