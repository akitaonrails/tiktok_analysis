package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19633911rl extends AbstractC388880FMo<LiveEventCountDownStickerModel> {
    public final InterfaceC388760FMc LJII;
    public C19635211ry LJIIIIZZ;
    public final C19634011rm LJIIIZ;

    @Override // X.AbstractC388880FMo
    public final C0FEF LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.LIVE_EVENT_COUNTDOWN;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = (LiveEventCountDownStickerModel) stickerModel;
        return liveEventCountDownStickerModel.copy(BaseStickerModel.copy$default(liveEventCountDownStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2147483646, 15, null), liveEventCountDownStickerModel.title, liveEventCountDownStickerModel.endTime, liveEventCountDownStickerModel.lastEditTime, liveEventCountDownStickerModel.subscribeNum, liveEventCountDownStickerModel.subscribe, liveEventCountDownStickerModel.textAlreadyExpired, liveEventCountDownStickerModel.textTobeSubscribed, liveEventCountDownStickerModel.textAlreadySubscribed, liveEventCountDownStickerModel.maxLine, liveEventCountDownStickerModel.clickable, liveEventCountDownStickerModel.editable, liveEventCountDownStickerModel.visible, liveEventCountDownStickerModel.eventId, liveEventCountDownStickerModel.isDefaultTitle);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C19634111rn(this.LIZ, (LiveEventCountDownStickerModel) stickerModel, this.LIZIZ, this.LJII, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        LiveEventCountDownStickerModel liveEventCountDownStickerModel;
        if (c0ftj instanceof C19634111rn) {
            liveEventCountDownStickerModel = ((C19634111rn) c0ftj).LJJJLL().LIZ;
        } else {
            liveEventCountDownStickerModel = new LiveEventCountDownStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), null, 0L, System.currentTimeMillis(), 0L, Boolean.FALSE, "", "", "", 1, true, false, true, 0L, false);
        }
        if (C19618011pC.LIZ(str)) {
            liveEventCountDownStickerModel.getBaseStickerModel().setStickerSource("2");
        }
        C19635211ry c19635211ry = this.LJIIIIZZ;
        C19635211ry c19635211ry2 = null;
        if (c19635211ry == null) {
            this.LJIIIIZZ = new C19635211ry(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C19635211ry c19635211ry3 = this.LJIIIIZZ;
            if (c19635211ry3 == null) {
                c19635211ry3 = null;
            }
            frameLayout.addView(c19635211ry3, layoutParams);
            C19635211ry c19635211ry4 = this.LJIIIIZZ;
            if (c19635211ry4 == null) {
                c19635211ry4 = null;
            }
            c19635211ry4.LJIIJJI(liveEventCountDownStickerModel, new AwS573S0100000_29(this, 911), this.LIZLLL);
        } else {
            c19635211ry.getStateContainer().LIZLLL(new AwS608S0100000_29(liveEventCountDownStickerModel, 774), true);
            C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA = c19635211ry.LLILZLL;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(new AwS608S0100000_29(liveEventCountDownStickerModel, 775), true);
            c19635211ry.LLILZ = liveEventCountDownStickerModel;
        }
        C19635211ry c19635211ry5 = this.LJIIIIZZ;
        if (c19635211ry5 == null) {
            c19635211ry5 = null;
        }
        c19635211ry5.setStickerEditListener(new C0FSM(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, function1, c390370FSh, c0ftj));
        C19635211ry c19635211ry6 = this.LJIIIIZZ;
        if (c19635211ry6 != null) {
            c19635211ry2 = c19635211ry6;
        }
        c19635211ry2.LJIILLIIL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11rm] */
    public C19633911rl(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = interfaceC388760FMc;
        this.LJIIIZ = new C0FEF() { // from class: X.11rm
            @Override // X.C0FEF
            public final boolean onBackPressed() {
                C19635211ry c19635211ry = this.LL.LJIIIIZZ;
                if (c19635211ry == null) {
                    return false;
                }
                c19635211ry.getClass();
                return false;
            }
        };
    }
}
