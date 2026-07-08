package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19634211ro extends AbstractC388880FMo<LiveCountDownStickerModel> {
    public final InterfaceC388760FMc LJII;
    public C19634511rr LJIIIIZZ;
    public final C19634311rp LJIIIZ;

    @Override // X.AbstractC388880FMo
    public final C0FEF LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.LIVE_COUNTDOWN;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        LiveCountDownStickerModel liveCountDownStickerModel = (LiveCountDownStickerModel) stickerModel;
        return liveCountDownStickerModel.copy(BaseStickerModel.copy$default(liveCountDownStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), liveCountDownStickerModel.title, liveCountDownStickerModel.endTime, liveCountDownStickerModel.lastEditTime, liveCountDownStickerModel.subscribeNum, liveCountDownStickerModel.subscribe, liveCountDownStickerModel.textAlreadyExpired, liveCountDownStickerModel.textTobeSubscribed, liveCountDownStickerModel.textAlreadySubscribed, liveCountDownStickerModel.maxLine, liveCountDownStickerModel.clickable, liveCountDownStickerModel.editable, liveCountDownStickerModel.visible);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C19634411rq(this.LIZ, (LiveCountDownStickerModel) stickerModel, this.LIZIZ, this.LJII, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        LiveCountDownStickerModel liveCountDownStickerModel;
        if (c0ftj instanceof C19634411rq) {
            liveCountDownStickerModel = ((C19634411rq) c0ftj).LJJJLL().LIZ;
        } else {
            liveCountDownStickerModel = new LiveCountDownStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_COUNTDOWN, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), null, 0L, System.currentTimeMillis(), 0L, Boolean.FALSE, "", "", "", 1, true, false, true);
        }
        if (C19618011pC.LIZ(str)) {
            liveCountDownStickerModel.getBaseStickerModel().setStickerSource("2");
        }
        C19634511rr c19634511rr = this.LJIIIIZZ;
        LiveCountDownStickerModel liveCountDownStickerModel2 = null;
        if (c19634511rr == null) {
            this.LJIIIIZZ = new C19634511rr(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C19634511rr c19634511rr2 = this.LJIIIIZZ;
            if (c19634511rr2 == null) {
                c19634511rr2 = null;
            }
            frameLayout.addView(c19634511rr2, layoutParams);
            C19634511rr c19634511rr3 = this.LJIIIIZZ;
            if (c19634511rr3 == null) {
                c19634511rr3 = null;
            }
            c19634511rr3.LJIIL(liveCountDownStickerModel, new AwS573S0100000_29(this, 27), this.LIZLLL);
        } else {
            c19634511rr.getStateContainer().LIZLLL(new AwS608S0100000_29(liveCountDownStickerModel, 492), true);
            C1664680tQA<LiveCountDownStickerModel> c1664680tQA = c19634511rr.LLJJIJIIJIL;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(new AwS608S0100000_29(liveCountDownStickerModel, 493), true);
            c19634511rr.LLJJIII = liveCountDownStickerModel;
        }
        C19634511rr c19634511rr4 = this.LJIIIIZZ;
        if (c19634511rr4 == null) {
            c19634511rr4 = null;
        }
        c19634511rr4.setStickerEditListener(new C0FSM(EnumC1466150oFx.LIVE_COUNTDOWN, function1, c390370FSh, c0ftj));
        C19634511rr c19634511rr5 = this.LJIIIIZZ;
        if (c19634511rr5 == null) {
            c19634511rr5 = null;
        }
        c19634511rr5.getClass();
        int visibility = c19634511rr5.getVisibility();
        int i = 0;
        c19634511rr5.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c19634511rr5);
        TextView textView = c19634511rr5.LLILZLL;
        if (textView != null) {
            LiveCountDownStickerModel liveCountDownStickerModel3 = c19634511rr5.LLJJIII;
            if (liveCountDownStickerModel3 != null) {
                liveCountDownStickerModel2 = liveCountDownStickerModel3;
            }
            String title = liveCountDownStickerModel2.getTitle();
            if (title != null && title.length() != 0) {
                i = 4;
            }
            C786410Ut5.LLIL(textView, i);
        }
        c19634511rr5.LLJJI = EnumC19360110oh.EDIT_OPENING;
        InterfaceC19635111rx mobService = c19634511rr5.getMobService();
        if (mobService != null) {
            mobService.LIZIZ(c19634511rr5.LLJJJIL);
        }
        HandlerHook.viewPostDelay(c19634511rr5, new ARunnableS129S0100000_29(c19634511rr5, 121), 300L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11rp] */
    public C19634211ro(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = interfaceC388760FMc;
        this.LJIIIZ = new C0FEF() { // from class: X.11rp
            @Override // X.C0FEF
            public final boolean onBackPressed() {
                Editable editableC;
                C19634511rr c19634511rr = this.LL.LJIIIIZZ;
                if (c19634511rr == null || c19634511rr.LLJJI == EnumC19360110oh.EDIT_QUITED) {
                    return false;
                }
                C391430FWj edLiveTitle = c19634511rr.getLiveCountDownStickerView().getEdLiveTitle();
                if (edLiveTitle == null || (editableC = C2204961BRm.C(edLiveTitle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H4lAYPe+C+y1xhFJ1VDSby5gWRL060TeXVI2LSscvfhJiA==", null))) == null || editableC.length() == 0 || !c19634511rr.LJIILIIL()) {
                    TextView textView = c19634511rr.LLILZLL;
                    if (textView != null) {
                        textView.performClick();
                    }
                } else {
                    TextView textView2 = c19634511rr.LLILZIL;
                    if (textView2 != null) {
                        textView2.performClick();
                    }
                }
                return true;
            }
        };
    }
}
