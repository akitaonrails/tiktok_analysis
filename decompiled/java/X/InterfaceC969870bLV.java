package X;

import android.graphics.RectF;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0bLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC969870bLV {
    LinkUserState L8(String str);

    boolean LIZ();

    List<PosIdentity> LIZIZ();

    boolean LIZJ();

    int LIZLLL(String str);

    boolean LJ(String str);

    long LJFF(String str);

    boolean LJI(String str);

    JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3);

    double LJIIIIZZ(Layout layout, String str);

    boolean LJIIIZ(String str, String str2, String str3, RectF rectF);

    ImageModel LJIIJ(String str, boolean z);

    int LJIIJJI();

    int LJIIL(String str);

    void LJIILIIL(C966870bGf c966870bGf);

    boolean LJIILJJIL(String str);

    boolean LJIILL();

    boolean LJIILLIIL(String str);

    boolean LJIIZILJ();

    RectF LJIJ(RectF rectF, long j, long j2);

    boolean LJIJI();

    double LJIJJ(String str);

    EnumC1276740jKS LJIJJLI();

    int LJIL(String str);

    RectF LJJ(RectF rectF, long j, long j2);

    ImageModel LJJI(String str);

    boolean LJJIFFI(Layout layout, String str, RectF rectF);

    @InterfaceC1294060jmO
    RectF LJJII(RectF rectF);

    boolean LJJIII(String str);
}
