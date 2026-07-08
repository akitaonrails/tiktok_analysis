package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserSettings;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.contacts.impl.bytesync.IMContactInitTask;
import com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactRelatedRequest;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1725106pF {
    void LIZ();

    void LIZIZ();

    void LIZJ();

    int LIZLLL();

    List<IMUser> LJ(String str);

    List<IMUser> LJFF(String str, boolean z);

    EnumC899370ZPz LJI();

    Object LJII(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2, boolean z3);

    Object LJIIIIZZ(int i, int i2, String str, List list, AbstractC23140094w abstractC23140094w);

    IMContactInitTask LJIIIZ();

    IMContactRelatedRequest LJIIJ();

    Object LJIIJJI(List list, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIIL(String str);

    Object LJIILIIL(Long l, InterfaceC1364105Vn<? super IMUserBizInfo> interfaceC1364105Vn);

    Object LJIILJJIL(IMUserSettings iMUserSettings, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    IMUser LJIILL(String str, String str2, boolean z);

    void LJIILLIIL(Long l, boolean z);

    Object LJIIZILJ(Long l, C1364600lcA c1364600lcA);

    Object LJIJ(InterfaceC1364105Vn<? super List<IMUserBaseInfo>> interfaceC1364105Vn);

    void LJIJI(IMUser iMUser);

    List<IMUser> LJIJJ();

    List<IMUser> LJIJJLI();

    String LJIL(IMUser iMUser);

    MAFIMUser LJJ(String str);

    List LJJI();

    Object LJJIFFI(List list, AbstractC23140094w abstractC23140094w);

    AnonymousClass0951 LJJII();

    EnumC899370ZPz LJJIII();

    Object LJJIIJ(int i, InterfaceC1364105Vn<? super Map<String, Double>> interfaceC1364105Vn);

    MAFIMUser LJJIIJZLJL(String str);

    Object LJJIIZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LJJIIZI(List list);
}
