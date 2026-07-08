package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.ss.android.ugc.aweme.translation.model.FeedbackReportInfoResponse;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.161N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161N implements ITranslationService {
    public static final C161N LIZIZ = new C161N();
    public final /* synthetic */ ITranslationService LIZ = (ITranslationService) ServiceManager.get().getService(ITranslationService.class);

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<FeedbackReportInfoResponse> LIZ(String str, String str2) {
        return this.LIZ.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<AutoDubbingStatusResponse> LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LIZJ(Aweme aweme, String str, String str2) {
        return this.LIZ.LIZJ(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ITranslationFeedbackDelegate LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJ(Aweme aweme, Boolean bool) {
        return this.LIZ.LJ(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC19594611lQ LJFF(Context context, C705930RmZ c705930RmZ, InteractStickerStruct interactStickerStruct, C194349111v c194349111v, InterfaceC386401eo interfaceC386401eo) {
        return this.LIZ.LJFF(context, c705930RmZ, interactStickerStruct, c194349111v, interfaceC386401eo);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C0SBA LJI(Fragment fragment, VideoItemParams videoItemParams) {
        return this.LIZ.LJI(fragment, videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final CaptionItemModel LJII(Aweme aweme, String str) {
        return this.LIZ.LJII(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1339640kxu LJIIIIZZ(LifecycleCoroutineScope lifecycleCoroutineScope) {
        return this.LIZ.LJIIIIZZ(lifecycleCoroutineScope);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIIIZ(EnumC715680S5m enumC715680S5m, String str) {
        this.LIZ.LJIIIZ(enumC715680S5m, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIIJ(Aweme aweme, String str) {
        return this.LIZ.LJIIJ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ LJIIJJI(String str, List list) {
        return this.LIZ.LJIIJJI(str, list);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<TranslationResult> LJIIL(String str) {
        return this.LIZ.LJIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILIIL(Comment comment) {
        return this.LIZ.LJIILIIL(comment);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ LJIILJJIL(long j, Aweme aweme, String str, String str2) {
        return this.LIZ.LJIILJJIL(j, aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILL(Aweme aweme, Boolean bool, Boolean bool2) {
        return this.LIZ.LJIILL(aweme, bool, bool2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILLIIL(Comment comment, EnumC715680S5m enumC715680S5m) {
        return this.LIZ.LJIILLIIL(comment, enumC715680S5m);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJIIZILJ(Aweme aweme) {
        return this.LIZ.LJIIZILJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJIJ(Aweme aweme) {
        return this.LIZ.LJIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJI(Aweme aweme) {
        return this.LIZ.LJIJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJ(Aweme aweme) {
        return this.LIZ.LJIJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIJJLI(Aweme aweme, boolean z) {
        this.LIZ.LJIJJLI(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <DATA extends C161R> void LJIL(EnumC207101162h enumC207101162h, C161Q<DATA> c161q, Function1<? super DATA, Unit> function1) {
        this.LIZ.LJIL(enumC207101162h, c161q, function1);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJ() {
        return this.LIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJI(Aweme aweme) {
        return this.LIZ.LJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIFFI(boolean z, boolean z2) {
        return this.LIZ.LJJIFFI(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJII(Comment comment) {
        return this.LIZ.LJJII(comment);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIII(Aweme aweme, C0S5N c0s5n) {
        return this.LIZ.LJJIII(aweme, c0s5n);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIIJ(String str) {
        this.LIZ.LJJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, Object> LJJIIJZLJL(List<C19595011lU> list) {
        return this.LIZ.LJJIIJZLJL(list);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIZ(Aweme aweme, String str) {
        return this.LIZ.LJJIIZ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIZI(Aweme aweme, boolean z) {
        return this.LIZ.LJJIIZI(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIJ(Aweme aweme, Boolean bool, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        return this.LIZ.LJJIJ(aweme, bool, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIJIIJI(Aweme aweme) {
        return this.LIZ.LJJIJIIJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C00I7 LJJIJIIJIL(WeakReference<Context> weakReference, Aweme aweme, String str) {
        return this.LIZ.LJJIJIIJIL(weakReference, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIJIL(Aweme aweme) {
        return this.LIZ.LJJIJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIJL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        return this.LIZ.LJJIJL(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIJLIJ(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo) {
        this.LIZ.LJJIJLIJ(list, z, interfaceC386401eo);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIL(C207134163o c207134163o, EnumC715680S5m enumC715680S5m) {
        return this.LIZ.LJJIL(c207134163o, enumC715680S5m);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIZ(int i, Aweme aweme) {
        return this.LIZ.LJJIZ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJ(Aweme aweme) {
        return this.LIZ.LJJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJI() {
        this.LIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJIL(int i, List list) {
        this.LIZ.LJJJIL(i, list);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJ(Aweme aweme, String str) {
        return this.LIZ.LJJJJ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJJJJI(Aweme aweme) {
        return this.LIZ.LJJJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJJIZL(Comment comment, boolean z) {
        this.LIZ.LJJJJIZL(comment, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC346201Wa<String> LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJJL(Aweme aweme) {
        return this.LIZ.LJJJJJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJL(Aweme aweme, Boolean bool) {
        return this.LIZ.LJJJJL(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJLI(C207134163o c207134163o) {
        return this.LIZ.LJJJJLI(c207134163o);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJLL() {
        return this.LIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJZ(Aweme aweme) {
        return this.LIZ.LJJJJZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJJZI(EnumC715680S5m enumC715680S5m, String str) {
        this.LIZ.LJJJJZI(enumC715680S5m, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJJJLIIL(Aweme aweme) {
        return this.LIZ.LJJJLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJLL(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo, HashMap<String, String> map) {
        this.LIZ.LJJJLL(list, z, interfaceC386401eo, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJLZIJ(String str, String str2) {
        this.LIZ.LJJJLZIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, String> LJJJZ(TextExtraStruct textExtraStruct) {
        return this.LIZ.LJJJZ(textExtraStruct);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJL(Aweme aweme) {
        return this.LIZ.LJJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLI(C207134163o c207134163o) {
        return this.LIZ.LJJLI(c207134163o);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIIJ(Aweme aweme) {
        return this.LIZ.LJJLIIIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1344290l5P LJJLIIIJ() {
        return this.LIZ.LJJLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIIJILLIZJL() {
        this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIIJJI(C207134163o c207134163o, boolean z) {
        this.LIZ.LJJLIIIJJI(c207134163o, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIJJIZ(Aweme aweme) {
        return this.LIZ.LJJLIIIJJIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJLIIIJL(Aweme aweme, C161Q<?> c161q) {
        return this.LIZ.LJJLIIIJL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIJLJLI() {
        return this.LIZ.LJJLIIIJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ICLATranslatabilityService LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIJ() {
        this.LIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIL(Comment comment) {
        return this.LIZ.LJJLIL(comment);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C05YD<C710770RuN> LJJLJ() {
        return this.LIZ.LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLJLI(C207134163o c207134163o) {
        return this.LIZ.LJJLJLI(c207134163o);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLL(Aweme aweme, C161Q c161q) {
        return this.LIZ.LJJLL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJZ() {
        this.LIZ.LJJZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC715680S5m LJJZZI(String str) {
        return this.LIZ.LJJZZI(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C0SBA LJJZZIII(C19EG c19eg, VideoItemParams videoItemParams) {
        return this.LIZ.LJJZZIII(c19eg, videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJL(boolean z, boolean z2) {
        return this.LIZ.LJL(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, Object> LJLI() {
        return this.LIZ.LJLI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLIIIL(Comment comment) {
        return this.LIZ.LJLIIIL(comment);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJLIIL() {
        return this.LIZ.LJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJLIL() {
        return this.LIZ.LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLILLLLZI(Aweme aweme) {
        return this.LIZ.LJLILLLLZI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLJI(Aweme aweme) {
        return this.LIZ.LJLJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C162M LJLJJI(EnumC634640Ous enumC634640Ous, String str) {
        return this.LIZ.LJLJJI(enumC634640Ous, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJJL(Aweme aweme, C161Q<?> c161q) {
        return this.LIZ.LJLJJL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLJJLL(EnumC207101162h enumC207101162h, C1760006us c1760006us) {
        this.LIZ.LJLJJLL(enumC207101162h, c1760006us);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <T extends ReusedAssem<T> & C03H5 & InterfaceC712990Rxx<X>, X> InterfaceC1731706qJ<Object, AssemViewModel<C0S5G>> LJLJL(T t) {
        return this.LIZ.LJLJL(t);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJLJ() {
        return this.LIZ.LJLJLJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJLLL(Aweme aweme) {
        return this.LIZ.LJLJLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLL(EnumC207101162h enumC207101162h) {
        this.LIZ.LJLL(enumC207101162h);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLI(String str) {
        this.LIZ.LJLLI(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLLILLLL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        return this.LIZ.LJLLILLLL(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLLJ(Aweme aweme, C0SBD c0sbd, String str) {
        return this.LIZ.LJLLJ(aweme, c0sbd, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLL() {
        this.LIZ.LJLLL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLLL(List<? extends Comment> list, Fragment fragment, String str) {
        this.LIZ.LJLLLL(list, fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLLLLLL(Aweme aweme, C161Q<?> c161q) {
        return this.LIZ.LJLLLLLL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLZ(Aweme aweme) {
        return this.LIZ.LJLZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC715680S5m LJZ(String str) {
        return this.LIZ.LJZ(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJZI(Aweme aweme) {
        return this.LIZ.LJZI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJZL(String str) {
        return this.LIZ.LJZL(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String[] LL() {
        return this.LIZ.LL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLD(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        return this.LIZ.LLD(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLF(Aweme aweme, Boolean bool) {
        return this.LIZ.LLF(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<EnumC207101162h, Pair<C161Q<?>, Function1<Object, Unit>>> LLFF() {
        return this.LIZ.LLFF();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLFFF(Aweme aweme, boolean z) {
        return this.LIZ.LLFFF(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLFII(Aweme aweme, Boolean bool) {
        return this.LIZ.LLFII(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LLFZ(Aweme aweme) {
        return this.LIZ.LLFZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LLI(String str) {
        return this.LIZ.LLI(str);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedAssem<+LX/03H5;>;:LX/0Rxx<TITEM;>;ITEM:Ljava/lang/Object;>(TT;)LX/06qJ<Ljava/lang/Object;LX/0SBA;>; */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1731706qJ LLIFFJFJJ(ReusedAssem reusedAssem) {
        return this.LIZ.LLIFFJFJJ(reusedAssem);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, String> LLII(Aweme aweme) {
        return this.LIZ.LLII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLIIII(Aweme aweme, boolean z) {
        return this.LIZ.LLIIII(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<EnumC207101162h, C1760006us> LLIIIILZ() {
        return this.LIZ.LLIIIILZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LLIIIJ() {
        return this.LIZ.LLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLIIIL(Aweme aweme, String str) {
        return this.LIZ.LLIIIL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C05YD<String> LLIIIZ() {
        return this.LIZ.LLIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIJI(Comment comment, EnumC715680S5m enumC715680S5m) {
        return this.LIZ.LLIIJI(comment, enumC715680S5m);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ListenableFuture LLIIJLIL(String str, String str2) {
        return this.LIZ.LLIIJLIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIL(Aweme aweme) {
        return this.LIZ.LLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Handler LLIILII() {
        return this.LIZ.LLIILII();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LLIILZL(EnumC207101162h enumC207101162h) {
        this.LIZ.LLIILZL(enumC207101162h);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIZ() {
        return this.LIZ.LLIIZ();
    }
}
