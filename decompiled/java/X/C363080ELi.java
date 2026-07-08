package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.VideoCropService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS37S0200100_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ELi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363080ELi extends C09AY implements Function2<C363110ELl, Function1<? super NLETrackSlot, ? extends Unit>, Unit> {
    public final /* synthetic */ SurfaceView LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ ViewGroup.LayoutParams LLILZ;
    public final /* synthetic */ C0E48 LLILZIL;
    public final /* synthetic */ Function2<C363110ELl, Function1<? super NLETrackSlot, Unit>, Unit> LLILZLL;
    public final /* synthetic */ VideoCropService LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ Function1<NLETrackSlot, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C363080ELi(SurfaceView surfaceView, ViewGroup viewGroup, int i, ViewGroup.LayoutParams layoutParams, C0E48 c0e48, Function2 function2, VideoCropService videoCropService, long j, AwS214S0300000_5 awS214S0300000_5) {
        super(2);
        this.LL = surfaceView;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = i;
        this.LLILZ = layoutParams;
        this.LLILZIL = c0e48;
        this.LLILZLL = function2;
        this.LLIZ = videoCropService;
        this.LLIZLLLIL = j;
        this.LLJ = awS214S0300000_5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ELj] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C363110ELl c363110ELl, Function1<? super NLETrackSlot, ? extends Unit> function1) {
        ViewGroup viewGroup;
        ViewParent parent = this.LL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
        }
        C786410Ut5.LLIIII(this.LL, 0);
        this.LLILLJJLI.addView(this.LL, this.LLILLL, this.LLILZ);
        C0E55 player = this.LLILZIL.getPlayer();
        final C0E48 c0e48 = this.LLILZIL;
        final VideoCropService videoCropService = this.LLIZ;
        player.LJIL(new INLEListenerFirstFrame() { // from class: X.0ELj
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
            public final void onRendered() {
                c0e48.getPlayer().LJIIIZ(this);
                videoCropService.isCropPanelShowing = false;
                float[] fArrLLJLLIL = c0e48.getPlayer().LLJLLIL();
                if (fArrLLJLLIL != null) {
                    C2102208Lk.LIZ(null, new AwS406S0200000_5(c0e48, fArrLLJLLIL, 67), 31);
                }
            }
        });
        final SurfaceView surfaceView = this.LL;
        final AwS37S0200100_5 awS37S0200100_5 = new AwS37S0200100_5(this.LLILZIL, this.LLIZ, this.LLIZLLLIL, 1);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.0EZs
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                surfaceView.getHolder().removeCallback(this);
                C1524805y2.LIZ(new AwS549S0100000_5(awS37S0200100_5, (Function0<Unit>) 712));
            }
        });
        Function2<C363110ELl, Function1<? super NLETrackSlot, Unit>, Unit> function2 = this.LLILZLL;
        if (function2 != null) {
            function2.invoke(c363110ELl, new AwS584S0100000_5(this.LLJ, (Function1<? super NLETrackSlot, Unit>) 608));
        }
        return Unit.LIZ;
    }
}
