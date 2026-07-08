package X;

import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19628011qo extends AbstractC388880FMo<MentionStickerModel> {
    public final InterfaceC388760FMc LJII;
    public C19628311qr LJIIIIZZ;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.MENTION;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        MentionStickerModel mentionStickerModel = (MentionStickerModel) stickerModel;
        return mentionStickerModel.copy(BaseStickerModel.copy$default(mentionStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, mentionStickerModel.visible, mentionStickerModel.useCapsuleStyle);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C19628111qp(this.LIZ, (MentionStickerModel) stickerModel, this.LIZIZ, this.LJII, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
        MentionStickerModel mentionStickerModel;
        boolean zLIZIZ;
        if (c0ftj instanceof C19628111qp) {
            mentionStickerModel = ((C19628111qp) c0ftj).LJJJLL().LIZ;
        } else {
            boolean z = false;
            BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.MENTION, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null);
            InterfaceC19628411qs interfaceC19628411qsLIZJ = this.LJII.LIZJ();
            if (interfaceC19628411qsLIZJ != null) {
                interfaceC19628411qsLIZJ.LIZJ();
                z = true;
            }
            InterfaceC19628411qs interfaceC19628411qsLIZJ2 = this.LJII.LIZJ();
            if (interfaceC19628411qsLIZJ2 != null) {
                zLIZIZ = interfaceC19628411qsLIZJ2.LIZIZ();
            } else {
                zLIZIZ = false;
            }
            mentionStickerModel = new MentionStickerModel(baseStickerModel, null, null, null, null, null, null, z, false, true, zLIZIZ);
        }
        if (Intrinsics.LJFF(str, "sticker_panel")) {
            mentionStickerModel.getBaseStickerModel().setStickerSource("2");
        }
        C19628311qr c19628311qr = this.LJIIIIZZ;
        C19628311qr c19628311qr2 = null;
        if (c19628311qr == null) {
            this.LJIIIIZZ = new C19628311qr(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C19628311qr c19628311qr3 = this.LJIIIIZZ;
            if (c19628311qr3 == null) {
                c19628311qr3 = null;
            }
            frameLayout.addView(c19628311qr3, layoutParams);
            C19628311qr c19628311qr4 = this.LJIIIIZZ;
            if (c19628311qr4 == null) {
                c19628311qr4 = null;
            }
            c19628311qr4.LJIIJ(mentionStickerModel, new AwS573S0100000_29(this, 1017), this.LJII.LJJ(), this.LIZLLL);
        } else {
            c19628311qr.getStateContainer().LIZLLL(new AwS601S0100000_22(mentionStickerModel, 831), true);
            C1664680tQA<MentionStickerModel> c1664680tQA = c19628311qr.LLJILJILJ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(new AwS608S0100000_29(mentionStickerModel, 759), true);
            c19628311qr.LLJIJIL = mentionStickerModel;
        }
        C19628311qr c19628311qr5 = this.LJIIIIZZ;
        if (c19628311qr5 == null) {
            c19628311qr5 = null;
        }
        c19628311qr5.setStickerEditListener(new C0FSM(EnumC1466150oFx.MENTION, function1, c390370FSh, c0ftj));
        C19628311qr c19628311qr6 = this.LJIIIIZZ;
        if (c19628311qr6 != null) {
            c19628311qr2 = c19628311qr6;
        }
        c19628311qr2.getClass();
        int visibility = c19628311qr2.getVisibility();
        c19628311qr2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c19628311qr2);
        HandlerHook.viewPostDelay(c19628311qr2, new ARunnableS119S0100000_19(c19628311qr2, 185), 300L);
    }

    public C19628011qo(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = interfaceC388760FMc;
    }
}
