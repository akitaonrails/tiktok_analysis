package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerRequest;
import com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0Hh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC447740Hh6 {
    void LIZ(String str, boolean z);

    void LIZIZ(StickerItem stickerItem);

    void LIZJ();

    Object LIZLLL(int i, String str, String str2, Long l, String str3, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJ(int i, long j, @StickerVariant int i2, StickerImage stickerImage, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJFF(LifecycleCoroutineScope lifecycleCoroutineScope);

    Object LJI(int i, long j, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJII(C19EG c19eg, String str, String str2, boolean z, String str3, int i, int i2, long j, ArrayList arrayList, boolean z2, String str4);

    void LJIIIIZZ(Fragment fragment, String str, String str2, String str3, IMPersonalizedRecommendationParams iMPersonalizedRecommendationParams, List list, Function1 function1, boolean z, String str4, Long l);

    Object LJIIIZ(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1);

    void LJIIJ(C19EG c19eg, VideoSticker videoSticker);

    void LJIIJJI();

    boolean LJIIL(long j);

    void LJIILIIL(Context context);

    void LJIILJJIL(String str, boolean z);

    void LJIILL();

    void LJIILLIIL();

    boolean LJIIZILJ(Context context, int i, int i2, String str, Function1<? super Integer, Unit> function1);

    View LJIJ(Context context, C0HJM c0hjm, AwS372S0200000_6 awS372S0200000_6, AwS585S0100000_6 awS585S0100000_6, AwS550S0100000_6 awS550S0100000_6);

    boolean LJIJI(String str);

    C06TB LJIJJ(Integer num);

    AbstractC1492605sq LJIJJLI();

    Fragment LJIL(int i, String str, String str2);

    void LJJ(C19EG c19eg, String str);

    Fragment LJJI(int i, String str, String str2);

    int LJJIFFI();

    Object LJJII(int i, Long l, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJJIII(Fragment fragment, User user);

    void LJJIIJ(String str);

    Object LJJIIJZLJL(int i, String str, String str2, Long l, String str3, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LJJIIZ(String str, View view, long j, String str2, int i, String str3, Integer num, Function1 function1, boolean z, int i2, Integer num2, String str4, EnumC441530HTb enumC441530HTb, boolean z2, InterfaceC1364105Vn interfaceC1364105Vn);

    boolean LJJIIZI(String str);

    void LJJIJ(C19EG c19eg, String str, String str2, Bundle bundle, Integer num);

    Object LJJIJIIJI(GetStickerRequest getStickerRequest, InterfaceC1364105Vn<? super List<StickerItem>> interfaceC1364105Vn);

    void LJJIJIIJIL(C19EG c19eg, long j, int i, String str, String str2, String str3, String str4, boolean z, String str5, Map<String, String> map, Integer num, Function0<Unit> function0);
}
