package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC2181411AYx {
    Map<String, OnLineMicInfo> LIZ();

    void LIZJ(String str);

    List<LinkUser> LIZLLL();

    void LJI();

    long LJIIJJI();

    void LJIILIIL();

    void LJIILJJIL(String str, C1276750jKT c1276750jKT);

    List<C1276580jKC> LJIILL();

    void LJJ(Map<String, String> map);

    int LJJI();

    LinkUser LJJIFFI(String str);

    void LJJIII(String str, List<? extends C1276580jKC> list);

    String LJJIIJ();

    int LJJIIJZLJL();

    boolean LJJIIZ();

    boolean LJJIJ();

    Pair<Integer, Integer> LJJJJJ();

    C949400aoU LJJJJJL();

    JSONObject LJJJJL(C1275030jHh c1275030jHh, List list, Map map, String str, InterfaceC969870bLV interfaceC969870bLV, Map map2, int i);

    int LJJJJLI(String str);

    C1AZI LJJJJLL(List<C2183391Acj> list, C1AZR c1azr);

    int LJJJJZ(String str);

    String getChannelId();

    String getGroupChannelId();
}
