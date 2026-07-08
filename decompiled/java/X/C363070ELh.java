package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.VideoCropService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS214S0300000_5;

/* JADX INFO: renamed from: X.0ELh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363070ELh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SurfaceView LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;
    public final /* synthetic */ InterfaceC361710EGb LLILZ;
    public final /* synthetic */ VideoCropService LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;
    public final /* synthetic */ NavigationScene LLIZ;
    public final /* synthetic */ Scene LLIZLLLIL;
    public final /* synthetic */ C0E48 LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ ViewGroup.LayoutParams LLJILJIL;
    public final /* synthetic */ Function2<C363110ELl, Function1<? super NLETrackSlot, Unit>, Unit> LLJILJILJ;
    public final /* synthetic */ long LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363070ELh(SurfaceView surfaceView, ViewGroup viewGroup, NLETrackSlot nLETrackSlot, InterfaceC361710EGb interfaceC361710EGb, VideoCropService videoCropService, C19EG c19eg, NavigationScene navigationScene, Scene scene, C0E48 c0e48, long j, int i, ViewGroup.LayoutParams layoutParams, Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function2, long j2) {
        super(0);
        this.LL = surfaceView;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = nLETrackSlot;
        this.LLILZ = interfaceC361710EGb;
        this.LLILZIL = videoCropService;
        this.LLILZLL = c19eg;
        this.LLIZ = navigationScene;
        this.LLIZLLLIL = scene;
        this.LLJ = c0e48;
        this.LLJI = j;
        this.LLJIJIL = i;
        this.LLJILJIL = layoutParams;
        this.LLJILJILJ = function2;
        this.LLJILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C786410Ut5.LLIIII(this.LL, 8);
        C786410Ut5.LJJJLZIJ(this.LL, this.LLILLJJLI);
        AwS214S0300000_5 awS214S0300000_5 = new AwS214S0300000_5(this.LLILLL, this.LLILZ, C351490DqF.LIZIZ(this.LLILLL, this.LLILZ), 14);
        VideoCropService videoCropService = this.LLILZIL;
        C19EG c19eg = this.LLILZLL;
        NavigationScene navigationScene = this.LLIZ;
        Scene scene = this.LLIZLLLIL;
        C0E48 c0e48 = this.LLJ;
        videoCropService.pushCropScene(c19eg, navigationScene, scene, c0e48, this.LLJI, awS214S0300000_5, new C363080ELi(this.LL, this.LLILLJJLI, this.LLJIJIL, this.LLJILJIL, c0e48, this.LLJILJILJ, videoCropService, this.LLJILLL, awS214S0300000_5));
        return Unit.LIZ;
    }
}
