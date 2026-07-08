package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import org.json.JSONObject;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.0K77, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0K77 {
    boolean LIZ();

    void LIZIZ(int i, String str, HashMap<String, Object> map);

    C13IQ<? extends AbstractC738140SxQ> LIZJ();

    void LIZLLL(HashMap<String, Object> map);

    void LJ();

    boolean LJFF(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C0K75 c0k75);

    void LJI(View view, List list, User user, Function0 function0, Function1 function1, boolean z);

    boolean LJII(JSONObject jSONObject);

    String LJIIIIZZ(String str);

    boolean LJIIIZ(Context context, String str, boolean z, Integer num);

    AnonymousClass0951 LJIIJ();

    boolean LJIIJJI();

    void LJIIL(AFwS193S0000000_7 aFwS193S0000000_7);

    void LJIILIIL(Context context, String str, long j, String str2);

    MutableLiveData LJIILJJIL();

    boolean LJIILL(Aweme aweme);

    void LJIILLIIL(int i, View view);

    void LJIIZILJ(String str);

    String LJIJ(Integer num);

    View LJIJI(Context context, AttributeSet attributeSet, int i);

    boolean LJIJJ(Aweme aweme);

    void LJIJJLI(HashMap<String, Object> map);

    boolean LJIL(Aweme aweme);

    boolean LJJ();

    boolean LJJI(com.ss.android.ugc.aweme.profile.model.User user);

    void LJJIFFI(AFwS193S0000000_7 aFwS193S0000000_7);

    void LJJII(C512220K6y c512220K6y);

    void LJJIII(View view, Boolean bool);

    void LJJIIJ(int i, long j, String str, String str2);

    Drawable LJJIIJZLJL(String str);

    String LJJIIZ(String str, byte[] bArr);

    boolean LJJIIZI(Aweme aweme);

    void LJJIJ(long j);

    void LJJIJIIJI(Object obj, InterfaceC1631630sYr<? super String, ? super String, ? super Boolean, ? super Map<String, String>, Unit> interfaceC1631630sYr);

    boolean LJJIJIIJIL(Aweme aweme);

    void LJJIJIL(LifecycleOwner lifecycleOwner, Function0<Unit> function0);

    void LJJIJL(Object obj);

    String LJJIJLIJ(String str, String str2);

    boolean LJJIL(View view, String str, String str2, ImageView.ScaleType scaleType, InterfaceC511480K4c interfaceC511480K4c);

    Fragment LJJIZ(boolean z, long j, String str, Boolean bool, AFwS237S0000000_7 aFwS237S0000000_7, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0 function0);

    void LJJJ(LifecycleOwner lifecycleOwner);

    boolean LJJJI(String str);

    void LJJJIL(View view);

    boolean LJJJJ(View view, String str, InterfaceC511480K4c interfaceC511480K4c, boolean z);

    String LJJJJI();

    long LJJJJIZL(View view, String str, String str2, boolean z, boolean z2, int i, Function1<? super Animatable, Unit> function1);

    boolean LJJJJJ(View view, Object obj, List list, Integer num, Integer num2, ImageView.ScaleType scaleType, Boolean bool, Boolean bool2, Float f, boolean z, C0K42 c0k42);

    Fragment LJJJJJL(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function0<Unit> function0, Function0<Unit> function02, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str8);

    void LJJJJL(String str);

    boolean LJJJJLI(Aweme aweme);

    boolean LJJJJLL(Aweme aweme);

    String LJJJJZ(String str);

    boolean LJJJJZI(Aweme aweme);

    boolean Xs();

    boolean ch(Fragment fragment, String str);

    String getWebcastLanguage();
}
