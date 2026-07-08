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

/* JADX INFO: renamed from: X.0Hh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447690Hh1 implements InterfaceC447740Hh6 {
    public static final C447690Hh1 LIZ = new C447690Hh1();

    @Override // X.InterfaceC447740Hh6
    public final void LIZ(String str, boolean z) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LIZIZ(StickerItem stickerItem) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LIZJ() {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJFF(LifecycleCoroutineScope lifecycleCoroutineScope) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJII(C19EG c19eg, String str, String str2, boolean z, String str3, int i, int i2, long j, ArrayList arrayList, boolean z2, String str4) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIIIIZZ(Fragment fragment, String str, String str2, String str3, IMPersonalizedRecommendationParams iMPersonalizedRecommendationParams, List list, Function1 function1, boolean z, String str4, Long l) {
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJIIIZ(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        return null;
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIIJ(C19EG c19eg, VideoSticker videoSticker) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC447740Hh6
    public final boolean LJIIL(long j) {
        return false;
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIILIIL(Context context) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIILJJIL(String str, boolean z) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIILL() {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC447740Hh6
    public final boolean LJIIZILJ(Context context, int i, int i2, String str, Function1<? super Integer, Unit> function1) {
        return false;
    }

    @Override // X.InterfaceC447740Hh6
    public final View LJIJ(Context context, C0HJM c0hjm, AwS372S0200000_6 awS372S0200000_6, AwS585S0100000_6 awS585S0100000_6, AwS550S0100000_6 awS550S0100000_6) {
        return null;
    }

    @Override // X.InterfaceC447740Hh6
    public final boolean LJIJI(String str) {
        return false;
    }

    @Override // X.InterfaceC447740Hh6
    public final Fragment LJIL(int i, String str, String str2) {
        return null;
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJJ(C19EG c19eg, String str) {
    }

    @Override // X.InterfaceC447740Hh6
    public final Fragment LJJI(int i, String str, String str2) {
        return null;
    }

    @Override // X.InterfaceC447740Hh6
    public final int LJJIFFI() {
        return -1;
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJJIII(Fragment fragment, User user) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJJIIJ(String str) {
    }

    @Override // X.InterfaceC447740Hh6
    public final boolean LJJIIZI(String str) {
        return false;
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJJIJ(C19EG c19eg, String str, String str2, Bundle bundle, Integer num) {
    }

    @Override // X.InterfaceC447740Hh6
    public final void LJJIJIIJIL(C19EG c19eg, long j, int i, String str, String str2, String str3, String str4, boolean z, String str5, Map<String, String> map, Integer num, Function0<Unit> function0) {
    }

    @Override // X.InterfaceC447740Hh6
    public final AbstractC1492605sq LJIJJLI() {
        return new C447700Hh2();
    }

    @Override // X.InterfaceC447740Hh6
    public final C06TB LJIJJ(Integer num) {
        return C06TB.ANIMATED_STICKER;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJJIJIIJI(GetStickerRequest getStickerRequest, InterfaceC1364105Vn<? super List<StickerItem>> interfaceC1364105Vn) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJI(int i, long j, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJJII(int i, Long l, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJ(int i, long j, @StickerVariant int i2, StickerImage stickerImage, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LIZLLL(int i, String str, String str2, Long l, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJJIIJZLJL(int i, String str, String str2, Long l, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC447740Hh6
    public final Object LJJIIZ(String str, View view, long j, String str2, int i, String str3, Integer num, Function1 function1, boolean z, int i2, Integer num2, String str4, EnumC441530HTb enumC441530HTb, boolean z2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return Unit.LIZ;
    }
}
