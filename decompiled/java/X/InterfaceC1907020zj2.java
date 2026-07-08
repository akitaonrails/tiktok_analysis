package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0zj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1907020zj2 {
    HashMap<String, String> D1();

    void LJJIL();

    EnumC1906770zid LJJLIIIJLJLI();

    void LLD(EnumC1154130g8h enumC1154130g8h);

    C1360500lVY LLILLL(List list, Integer num, MusNotice musNotice, String str);

    int Q4();

    C1905130zfz S0();

    void a4();

    View.OnLongClickListener c2();

    boolean c3(String str);

    String getAccountType();

    Fragment getCurFragment();

    String getEnterFrom();

    String getEnterMethod();

    List<InterfaceC1906920zis> getInterceptors();

    String getPageName();

    EnumC1906270zhp getScenario();

    String getTabName();

    String i0();

    boolean i3();

    void l5(String str, String str2, BaseNotice baseNotice, boolean z, C1242270iQr c1242270iQr);

    void q(View view);

    void s4(User user, String str, String str2, String str3);

    InterfaceC1907310zjV u0();

    void v(int i);

    String v5();

    void x5(TuxTextView tuxTextView, List list, Integer num, MusNotice musNotice, String str);
}
