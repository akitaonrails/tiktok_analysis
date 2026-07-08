package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC706770Rnv {
    void LIZ(Aweme aweme);

    void LIZIZ(Boolean bool, String str, String str2);

    boolean LIZJ(Aweme aweme, String str);

    C0RQI LIZLLL(String str, String str2);

    Map LJ(C0SR4 c0sr4);

    boolean LJFF(Fragment fragment);

    boolean LJI(C2189821An6 c2189821An6, C0RF0 c0rf0);

    Object LJII(InterfaceC691450RAh interfaceC691450RAh, EnumC706640Rni enumC706640Rni);

    View LJIIIIZZ(EnumC706640Rni enumC706640Rni, Context context, ViewGroup viewGroup, Fragment fragment, BaseFeedPageParams baseFeedPageParams);

    void LJIIIZ(C0SZ8 c0sz8, C0RQI c0rqi);

    boolean LJIIJ(Fragment fragment);

    void LJIIJJI(C0SZ8 c0sz8, String str);

    int LJIIL(Context context);

    void LJIILIIL(String str, UserStory userStory, String str2, String str3);

    int LJIILJJIL(C19EG c19eg);

    int LJIILL();

    boolean LJIILLIIL(String str);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJIIZILJ();

    boolean LJIJ(int i);

    boolean LJIJI(Object obj);

    PriorityProtocol LJIJJ();

    String LJIJJLI();

    C0RMZ LJIL();

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJJ();

    void LJJI(String str);

    List<C13IQ<? extends AbstractC738140SxQ>> LJJIFFI();

    Aweme LJJII(Fragment fragment, Aweme aweme);

    C13IQ<? extends AbstractC738140SxQ> LJJIII();

    InterfaceC1370310llN LJJIIJ(Fragment fragment, Aweme aweme, String str);

    boolean LJJIIJZLJL(Fragment fragment);

    String LJJIIZ(C0SZ8 c0sz8, Context context);
}
