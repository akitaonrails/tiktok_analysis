package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0igx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1252250igx {
    void LIZ(Context context, String str, String str2, Map map, AwS563S0100000_19 awS563S0100000_19, AwS415S0200000_14 awS415S0200000_14);

    void LIZIZ(int i, String str, boolean z);

    void LIZJ(String str, boolean z);

    void LIZLLL(Context context, String str, String str2, boolean z, Map map, boolean z2, Map map2, Function0 function0);

    boolean LJ(String str, boolean z, Keva keva, boolean z2, boolean z3);

    String LJFF(int i, Context context, String str, boolean z, boolean z2);

    void LJI(int i, int i2, String str);

    boolean LJII(Long l, Long l2);

    Drawable LJIIIIZZ(Context context);

    void LJIIIZ(String str, Map<String, String> map);

    void LJIIJ(FollowStatus followStatus);

    boolean LJIIJJI(String str);

    void LJIIL(String str);

    void LJIILIIL(String str);

    @InterfaceC1294060jmO
    boolean LJIILJJIL(String str);

    void LJIILL(Context context, User user, String str);
}
