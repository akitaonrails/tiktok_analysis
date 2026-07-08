package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.music.MusicStickerFactoryService;
import com.ss.android.ugc.aweme.sticker.music.MusicStickerViewFactoryApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS273S0300000_29;

/* JADX INFO: renamed from: X.11jK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19581611jK extends AbstractC19586911kB {
    public final InteractStickerStruct LJIIIZ;
    public final Aweme LJIIJ;
    public View LJIIJJI;
    public final C01GW LJIIL;

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 42;
    }

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
        MusicStickerStruct musicStickerStruct;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C705930RmZ c705930RmZ = this.LIZJ;
        String str = null;
        c2344009Gk.LJIIIIZZ("enter_from", (c705930RmZ == null || (c0r60 = c705930RmZ.LJIIZILJ) == null) ? null : c0r60.LIZ);
        Aweme aweme = this.LJIIJ;
        c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getGroupId() : null);
        Aweme aweme2 = this.LJIIJ;
        c2344009Gk.LJIIIIZZ("author_id", aweme2 != null ? AwemeExtKt.getAuthorUid(aweme2) : null);
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct != null && (musicStickerStruct = interactStickerStruct.getMusicStickerStruct()) != null) {
            str = musicStickerStruct.musicId;
        }
        c2344009Gk.LJIIIIZZ("music_id", str);
        C20684815ws.LJIILLIIL("music_sticker_show", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
        C1398440mUk.LIZ.getClass();
        if (C1398440mUk.LIZIZ()) {
            Context context = this.LIZ;
            InteractStickerStruct interactStickerStruct = this.LJIIIZ;
            C1398440mUk.LIZLLL(context, this.LJIIJ, this.LIZJ, interactStickerStruct);
            return;
        }
        Context context2 = this.LIZ;
        InteractStickerStruct interactStickerStruct2 = this.LJIIIZ;
        C1398440mUk.LIZJ(context2, this.LJIIJ, this.LIZJ, interactStickerStruct2);
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        MusicStickerViewFactoryApi musicStickerViewFactoryApi;
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct == null) {
            return null;
        }
        Object objLIZ = C04TD.LIZ(MusicStickerViewFactoryApi.class, false);
        if (objLIZ != null) {
            musicStickerViewFactoryApi = (MusicStickerViewFactoryApi) objLIZ;
        } else {
            if (C04TD.y5 == null) {
                synchronized (MusicStickerViewFactoryApi.class) {
                    if (C04TD.y5 == null) {
                        C04TD.y5 = new MusicStickerFactoryService();
                    }
                }
            }
            musicStickerViewFactoryApi = C04TD.y5;
        }
        C19581711jL c19581711jLLIZ = musicStickerViewFactoryApi.LIZ(this.LIZ, interactStickerStruct);
        C786410Ut5.LJLLLLLL(4, c19581711jLLIZ.getView());
        HandlerHook.viewPost(c19581711jLLIZ.getView(), new ARunnableS88S0200000_19(this, c19581711jLLIZ, 33));
        C19615711op view = c19581711jLLIZ.getView();
        this.LJIIJJI = view;
        return view;
    }

    @Override // X.AbstractC19586911kB
    public final int LJIILLIIL(C451220Hmi c451220Hmi) {
        int i;
        int i2;
        C450840Hm6 c450840Hm6 = new C450840Hm6();
        Context context = c451220Hmi.LIZ;
        C1398440mUk.LIZ.getClass();
        if (C1398440mUk.LIZIZ()) {
            i = 2131837728;
        } else {
            i = 2131837725;
        }
        c450840Hm6.LIZLLL = context.getString(i);
        if (C1398440mUk.LIZIZ()) {
            i2 = R.raw.icon_camera_fill;
        } else {
            i2 = R.raw.icon_eye_fill;
        }
        c450840Hm6.LIZ = i2;
        c450840Hm6.LIZIZ = R.attr.ee;
        c450840Hm6.LJFF = new ACListenerS163S0100000_29(this, 164);
        c451220Hmi.LIZIZ(c450840Hm6);
        return 1;
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return ((AbstractC19580211j6) this.LJIIL.getValue()).LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return ((AbstractC19580211j6) this.LJIIL.getValue()).LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    public C19581611jK(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interactStickerStruct;
        this.LJIIJ = aweme;
        this.LJIIL = C452501pT.LIZIZ(new AwS273S0300000_29(context, this, c705930RmZ, 13));
    }
}
