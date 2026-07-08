package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OIU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OIU extends InterfaceC149400hg {
    Object A0(long j, InterfaceC1364105Vn<? super BulletinAccountEditResponse> interfaceC1364105Vn);

    Object LJJIL(long j, BulletinBoardUpdateInfo bulletinBoardUpdateInfo, String str, String str2, String str3, InterfaceC1364105Vn<? super BulletinAccountEditResponse> interfaceC1364105Vn);

    Object LJJLIIIJLLLLLLLZ(long j, int i, String str, String str2, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn);

    Object LJLJL(String str, List<BulletinSetting> list, InterfaceC1364105Vn<? super AbstractC1623806Xk<Unit>> interfaceC1364105Vn);

    Object LLF(String str, InterfaceC1364105Vn<? super BulletinAccountCheckResponse> interfaceC1364105Vn);

    Object LLIIII(boolean z, InterfaceC1364105Vn<? super AbstractC1623806Xk<Unit>> interfaceC1364105Vn);

    void LLIILZL(BulletinBoardUpdateInfo bulletinBoardUpdateInfo);

    Object LLILIL(String str, C0OM6 c0om6, C0ONE c0one, List<EventExtra> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    C11JF LLJ(int i, String str, int i2, C0OIY c0oiy, AwS553S0100000_9 awS553S0100000_9);

    Object LLJIJIL(String str, InterfaceC1364105Vn<? super BulletinSettingList> interfaceC1364105Vn);

    Object LLJJJIL(long j, InterfaceC1364105Vn<? super BulletinCloseResponse> interfaceC1364105Vn);

    Object LLLFF(BulletinBoardUpdateInfo bulletinBoardUpdateInfo, InterfaceC1364105Vn<? super AbstractC1623806Xk<BulletinAccountEditResponse>> interfaceC1364105Vn);

    C11JF LLLLIIIILLL(int i, AwS135S0201000_9 awS135S0201000_9, AwS553S0100000_9 awS553S0100000_9);

    Object LLLLIILL(boolean z, InterfaceC1364105Vn<? super AbstractC1623806Xk<Unit>> interfaceC1364105Vn);

    Object LLLLLLJ(long j, InterfaceC1364105Vn<? super BulletinAccountEditResponse> interfaceC1364105Vn);

    BulletinBoardUpdateInfo LLLLLLL();

    BulletinBoardInfo LLZZJLIL(long j);

    Object i(long j, InterfaceC1364105Vn<? super AbstractC1623806Xk<BulletinHybridResourceResponse>> interfaceC1364105Vn);

    void n(BulletinBoardInfo bulletinBoardInfo);
}
