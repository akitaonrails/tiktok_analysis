package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.util.Map;
import kotlin.jvm.internal.AwS138S1100000_24;

/* JADX INFO: renamed from: X.0rt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1605730rt5 {
    C727780Sgi LIZ(Aweme aweme);

    void LIZIZ(String str, InterfaceC727810Sgl interfaceC727810Sgl);

    int LIZJ(Context context);

    C694200RKw LIZLLL(Context context);

    void LJ(String str);

    C727780Sgi LJFF(User user, UserFilterStoryInfo userFilterStoryInfo, UserAllStoryMetadata userAllStoryMetadata);

    InterfaceC1605850rtH LJI();

    C727780Sgi LJII(User user);

    boolean LJIIIIZZ(EnumC1606080rte enumC1606080rte);

    InterfaceC1605840rtG LJIIIZ(EnumC1606080rte enumC1606080rte);

    String LJIIJ();

    void LJIIJJI(String str, Map<String, ? extends Object> map);

    int[] LJIIL(Context context);

    void LJIILIIL(LifecycleOwner lifecycleOwner, AwS138S1100000_24 awS138S1100000_24);

    C727510SgH LJIILJJIL(String str, C727780Sgi c727780Sgi, String str2);

    InterfaceC728740SiG LJIILL();

    C727780Sgi LJIILLIIL(String str);

    void LJIIZILJ(String str);
}
