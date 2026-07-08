package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JND, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$4$1$1", f = "PlayerOverlayPortraitLayout.kt", l = {}, m = "invokeSuspend")
public final class C0JND extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JNF LL;
    public final /* synthetic */ C490900JMy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JND(C0JNF c0jnf, C490900JMy c490900JMy, InterfaceC1364105Vn<? super C0JND> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0jnf;
        this.LLILLJJLI = c490900JMy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JND(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveIconView playBtn;
        int i;
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JNF c0jnf = this.LL;
        if ((c0jnf.LIZ || c0jnf.LIZIZ) && (playBtn = this.LLILLJJLI.getPlayBtn()) != null) {
            if (this.LL.LIZ) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LLJJIJIL(playBtn, i);
        }
        C0JNF c0jnf2 = this.LL;
        if (c0jnf2.LIZIZ) {
            if (c0jnf2.LIZ) {
                C491160JNy seekbarContainer = this.LLILLJJLI.getSeekbarContainer();
                if (seekbarContainer != null) {
                    AnonymousClass0956 anonymousClass0956 = seekbarContainer.LLJJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C12P2 seekBar = seekbarContainer.getSeekBar();
                    if (seekBar != null) {
                        seekBar.setSeekBarShowType(seekbarContainer.LLJ);
                    }
                }
            } else {
                C491160JNy seekbarContainer2 = this.LLILLJJLI.getSeekbarContainer();
                if (seekbarContainer2 != null) {
                    seekbarContainer2.setSeekbarShowType(1);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$4$1$1");
        return unit;
    }
}
