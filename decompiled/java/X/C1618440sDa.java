package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService;
import com.ss.android.ugc.aweme.story.friends.IStoryFriendsService;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0sDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618440sDa implements IStoryService {
    public static final C1618440sDa LIZIZ = new C1618440sDa();
    public final /* synthetic */ IStoryService LIZ = (IStoryService) ServiceManager.get().getService(IStoryService.class);

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner) {
        return this.LIZ.LIZIZ(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIIIIZZ(Aweme aweme) {
        return this.LIZ.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIIZ() {
        this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LJIIJ(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC734870Ss9 LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(String str, User user, String str2, String str3, boolean z, int i, Integer num, Function2<? super String, ? super HashMap<String, String>, Boolean> function2, boolean z2) {
        this.LIZ.LJIIL(str, user, str2, str3, z, i, num, function2, z2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIILIIL(Aweme aweme) {
        return this.LIZ.LJIILIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIILJJIL(String str) {
        return this.LIZ.LJIILJJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438300HGq LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFollowUpPublishService LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIZILJ(int i) {
        this.LIZ.LJIIZILJ(i);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJ(int i, C19EG c19eg) {
        this.LIZ.LJIJ(i, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJI(Aweme aweme) {
        this.LIZ.LJIJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJJ(float f, float f2, List<? extends NormalTrackTimeStamp> list, C705930RmZ c705930RmZ, Context context, Fragment fragment) {
        return this.LIZ.LJIJJ(f, f2, list, c705930RmZ, context, fragment);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1618460sDc LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIL() {
        this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0ROW LJJ() {
        return this.LIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259230isD LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1593650rZb LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259300isK LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0TRR LJJIII() {
        return this.LIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC706770Rnv LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJIIJZLJL() {
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIIZ(Aweme aweme, String str) {
        this.LIZ.LJJIIZ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIJ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        this.LIZ.LJJIJ(interfaceC665370Q7z, str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryMainTrackService LJJIJIIJI() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC718030SEn LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597970rgZ LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJIJL(Fragment fragment, C2189821An6 c2189821An6, String str, String str2, EnumC1985807qC enumC1985807qC) {
        return this.LIZ.LJJIJL(fragment, c2189821An6, str, str2, enumC1985807qC);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729970SkF LJJIJLIJ() {
        return this.LIZ.LJJIJLIJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIL(AwS587S0100000_8 awS587S0100000_8) {
        this.LIZ.LJJIL(awS587S0100000_8);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729990SkH LJJIZ() {
        return this.LIZ.LJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final RectF LJJJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LJJJ(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJI(Aweme aweme) {
        return this.LIZ.LJJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC721960STq LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryRevealService LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final NetworkPartner LJJJJI() {
        return this.LIZ.LJJJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729810Sjz LJJJJIZL() {
        return this.LIZ.LJJJJIZL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final <T extends C0X12> void LJJJJJ(String str, T t, Function1<? super T, ? extends List<? extends Aweme>> function1) {
        this.LIZ.LJJJJJ(str, t, function1);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1569000qvq LJJJJJL() {
        return this.LIZ.LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJJL(InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, MotionEvent motionEvent) {
        return this.LIZ.LJJJJL(interfaceC665370Q7z, fragment, motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJJLI(String str) {
        this.LIZ.LJJJJLI(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJJLL() {
        return this.LIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryHomepageService LJJJJZ() {
        return this.LIZ.LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC727710Sgb LJJJJZI(Context context) {
        return this.LIZ.LJJJJZI(context);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJLIIL() {
        this.LIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJLL() {
        return this.LIZ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1605350rsT LJJJLZIJ() {
        return this.LIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFriendsService LJJJZ() {
        return this.LIZ.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0SPF LJJL(String str) {
        return this.LIZ.LJJL(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryPreloaderV2 LJJLI() {
        return this.LIZ.LJJLI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJLIIIIJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        this.LIZ.LJJLIIIIJ(interfaceC665370Q7z, z);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final List LJJLIIIJ(int i, Aweme aweme) {
        return this.LIZ.LJJLIIIJ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597000rf0 LJJLIIIJILLIZJL() {
        return this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC330760Cxu LJJLIIIJJI() {
        return this.LIZ.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1588370rR5 LJJLIIIJJIZ() {
        return this.LIZ.LJJLIIIJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438360HGw LJJLIIIJL() {
        return this.LIZ.LJJLIIIJL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC728100ShE LJJLIIIJLJLI() {
        return this.LIZ.LJJLIIIJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryCelebrationService LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Bitmap LJJLIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LJJLIIJ(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZ.getTag();
    }
}
