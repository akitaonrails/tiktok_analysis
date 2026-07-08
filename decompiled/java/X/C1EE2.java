package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.service.IPhotoModeExtraService;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.1EE2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EE2 implements IPostModeService {
    public static final C1EE2 LIZIZ = new C1EE2();
    public final /* synthetic */ IPostModeService LIZ = (IPostModeService) ServiceManager.get().getService(IPostModeService.class);

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IInterceptor LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final long LJ(String str, String str2, String str3) {
        return this.LIZ.LJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJFF(Object obj) {
        return this.LIZ.LJFF(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC720540SOe LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIIIIZZ(Aweme aweme, String str, boolean z) {
        return this.LIZ.LJIIIIZZ(aweme, str, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIIZ(Context context) {
        this.LIZ.LJIIIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIJ(int i, Context context, String str, List list) {
        this.LIZ.LJIIJ(i, context, str, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0M3E LJIIJJI(ViewGroup viewGroup) {
        return this.LIZ.LJIIJJI(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<?> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILIIL(Aweme aweme, String str) {
        return this.LIZ.LJIILIIL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILJJIL() {
        this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJIIZILJ(Object obj) {
        return this.LIZ.LJIIZILJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIJI(C19EG c19eg, VideoItemParams videoItemParams, PostModeDetailParams postModeDetailParams, String str, Bitmap bitmap, SlidesImageLoadParams slidesImageLoadParams, Fragment fragment, Function1 function1) {
        this.LIZ.LJIJI(c19eg, videoItemParams, postModeDetailParams, str, bitmap, slidesImageLoadParams, fragment, function1);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC661560PxC LJIJJ(ViewGroup viewGroup, String str, EnumC671230QUn enumC671230QUn, Function1<? super String, Unit> function1, boolean z, EnumC1781440wSU enumC1781440wSU, InterfaceC21663219qI interfaceC21663219qI) {
        return this.LIZ.LJIJJ(viewGroup, str, enumC671230QUn, function1, z, enumC1781440wSU, interfaceC21663219qI);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJIL(String str) {
        return this.LIZ.LJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJ() {
        return this.LIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJI(int i, Context context, String str, String str2, String str3, String str4, String str5, String str6, List list, AwS572S0100000_28 awS572S0100000_28) {
        this.LIZ.LJJI(i, context, str, str2, str3, str4, str5, str6, list, awS572S0100000_28);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIFFI(Context context, String str, Aweme aweme, IntRange intRange, EnumC1334360kpO enumC1334360kpO) {
        this.LIZ.LJJIFFI(context, str, aweme, intRange, enumC1334360kpO);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final ReusedUIContentAssem<? extends C03H5> LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Pair LJJIII(Context context, C120B c120b, String str, ClientText clientText, boolean z, boolean z2, Float f, Float f2, int i, C19715412Bs c19715412Bs, C720060SMi c720060SMi, C19714112Bf c19714112Bf) {
        return this.LIZ.LJJIII(context, c120b, str, clientText, z, z2, f, f2, i, c19715412Bs, c720060SMi, c19714112Bf);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJIIJ(Object obj) {
        return this.LIZ.LJJIIJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        return this.LIZ.LJJIIJZLJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIIZ(String str, Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, Function1<? super InterfaceC469401sC, Unit> function1, Function2<? super File, ? super Throwable, Unit> function2) {
        this.LIZ.LJJIIZ(str, context, aweme, i, enumC1334360kpO, function1, function2);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIIZI(Fragment fragment) {
        return this.LIZ.LJJIIZI(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIJ(Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, C587790N3p c587790N3p) {
        this.LIZ.LJJIJ(context, aweme, i, enumC1334360kpO, c587790N3p);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIJIIJI() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends AbstractC738140SxQ> LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJJIJIL(Aweme aweme) {
        return this.LIZ.LJJIJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIJL() {
        return this.LIZ.LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJIJLIJ(Object obj) {
        return this.LIZ.LJJIJLIJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeExtraService LJJIL() {
        return this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIZ(Aweme aweme) {
        return this.LIZ.LJJIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<?> LJJJ() {
        return this.LIZ.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJI(Aweme aweme, String str) {
        return this.LIZ.LJJJI(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJIL(String str) {
        this.LIZ.LJJJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final float LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJJI(String str, String str2, String str3) {
        return this.LIZ.LJJJJI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJJJJIZL(String str, String str2, String str3) {
        return this.LIZ.LJJJJIZL(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJJ(String str) {
        this.LIZ.LJJJJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final FeedContentLayoutInfo LJJJJJL(Context context, C120B c120b, String str, ClientText clientText, boolean z, Float f, int i, C19715312Br c19715312Br) {
        return this.LIZ.LJJJJJL(context, c120b, str, clientText, z, f, i, c19715312Br);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJL(int i, Context context, String str, List list) {
        this.LIZ.LJJJJL(i, context, str, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJJLI(boolean z, boolean z2, Float f, int i, int i2) {
        return this.LIZ.LJJJJLI(z, z2, f, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJJLL() {
        return this.LIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJZ(String str, Aweme aweme, int i, Function2<? super Bitmap, ? super Throwable, Unit> function2) {
        this.LIZ.LJJJJZ(str, aweme, i, function2);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJJJJZI() {
        return this.LIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJLIIL(C0RQ9 c0rq9) {
        return this.LIZ.LJJJLIIL(c0rq9);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C19647311tv LJJJLL(Context context, FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, boolean z) {
        return this.LIZ.LJJJLL(context, feedContentLayoutInfo, i, i2, i3, i4, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeLogUtil LJJJLZIJ() {
        return this.LIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJZ(Activity activity) {
        return this.LIZ.LJJJZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJL() {
        return this.LIZ.LJJL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C19647311tv LJJLI(Context context, FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, View view, C720060SMi c720060SMi, int i5, boolean z, InterfaceC710220RtU interfaceC710220RtU) {
        return this.LIZ.LJJLI(context, feedContentLayoutInfo, i, i2, i3, i4, view, c720060SMi, i5, z, interfaceC710220RtU);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJLIIIIJ(Aweme aweme, int i, InterfaceC1685420txc<? super Bitmap, ? super Throwable, ? super String, ? super Integer, ? super Integer, Unit> interfaceC1685420txc) {
        this.LIZ.LJJLIIIIJ(aweme, i, interfaceC1685420txc);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJ() {
        return this.LIZ.LJJLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJILLIZJL() {
        return this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJLIIIJJI(int i, String str, long j, String str2, String str3, boolean z) {
        this.LIZ.LJJLIIIJJI(i, str, j, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJJIZ(Aweme aweme) {
        return this.LIZ.LJJLIIIJJIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJL() {
        return this.LIZ.LJJLIIIJL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJJLIIIJLJLI(boolean z) {
        return this.LIZ.LJJLIIIJLJLI(z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<?>> LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJLIL(Aweme aweme, Object obj) {
        return this.LIZ.LJJLIL(aweme, obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJLJ() {
        return this.LIZ.LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0M3F LJJLJLI(ViewGroup viewGroup, boolean z) {
        return this.LIZ.LJJLJLI(viewGroup, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLL(Aweme aweme) {
        return this.LIZ.LJJLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJZ(Activity activity, int i, Object obj, Object obj2) {
        this.LIZ.LJJZ(activity, i, obj, obj2);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Pair<Bitmap.Config, Map<String, Object>> LJJZZI(UrlModel urlModel) {
        return this.LIZ.LJJZZI(urlModel);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJZZIII() {
        return this.LIZ.LJJZZIII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Pair LJL(Context context, Aweme aweme, C0S5R c0s5r, C0S5S c0s5s, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, InteractAreaCommonAbility interactAreaCommonAbility, BottomBarPriorityAbility bottomBarPriorityAbility, String str, boolean z5) {
        return this.LIZ.LJL(context, aweme, c0s5r, c0s5s, z, z2, z3, i, i2, z4, interactAreaCommonAbility, bottomBarPriorityAbility, str, z5);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJLI(EnumC1334360kpO enumC1334360kpO, String str) {
        this.LIZ.LJLI(enumC1334360kpO, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0SAE LJLIIIL() {
        return this.LIZ.LJLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJLIIL(Aweme aweme, String str, boolean z) {
        return this.LIZ.LJLIIL(aweme, str, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJLIL(C19EG c19eg) {
        this.LIZ.LJLIL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean showEngagementCount() {
        return this.LIZ.showEngagementCount();
    }
}
