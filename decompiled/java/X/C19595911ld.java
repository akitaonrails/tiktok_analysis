package X;

import Y.ACListenerS93S0300000_29;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import java.util.List;

/* JADX INFO: renamed from: X.11ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19595911ld extends AbstractC19586911kB {
    public final Aweme LJIIIZ;
    public final C19581811jM LJIIJ;
    public final View LJIIJJI;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594611lQ
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 19;
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
        C0P0T c0p0t = this.LJFF;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void onResume() {
        C0P0T c0p0t = this.LJFF;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
    public final void LIZLLL(C705930RmZ c705930RmZ) {
        this.LIZJ = c705930RmZ;
        this.LJIIJ.LIZLLL = c705930RmZ;
    }

    @Override // X.AbstractC19586911kB
    public final float LJIILIIL(float f) {
        int i;
        IDeviceCapability iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
        if ((iDeviceCapability != null && iDeviceCapability.k(this.LIZ)) || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            Rect rect = new Rect();
            this.LIZIZ.getGlobalVisibleRect(rect);
            int iLJIIIIZZ = C14KQ.LJIIIIZZ(this.LIZ);
            int i2 = rect.left;
            if (i2 > 0 && (i = rect.right) > 0 && i2 < i && iLJIIIIZZ > 0 && i2 <= iLJIIIIZZ && i <= iLJIIIIZZ) {
                float fWidth = f - ((iLJIIIIZZ - rect.width()) / 2);
                this.LIZIZ.getLocalVisibleRect(new Rect());
                if (fWidth > 0.0f && fWidth >= r1.left && fWidth <= r1.right) {
                    return fWidth;
                }
                return f;
            }
            return f;
        }
        return f;
    }

    @Override // X.AbstractC19586911kB
    public final int LJIILLIIL(C451220Hmi c451220Hmi) {
        InteractStickerStruct interactStickerStruct;
        VideoShareInfoStruct videoShareInfoStruct;
        boolean z = false;
        if (C0OAD.LIZIZ(this.LJIIIZ) || (interactStickerStruct = this.LJII) == null || (videoShareInfoStruct = interactStickerStruct.getVideoShareInfoStruct()) == null) {
            return 0;
        }
        C450820Hm4 c450820Hm4 = new C450820Hm4();
        c450820Hm4.LIZJ = this.LJIIJJI.getContext().getString(2131847922);
        c450820Hm4.LIZLLL = new ACListenerS93S0300000_29(videoShareInfoStruct, c451220Hmi, this, 15);
        c451220Hmi.LIZ(c450820Hm4);
        if (C2203211BKt.LIZ(this.LJIIIZ) != null) {
            z = true;
        }
        LJJI("show", videoShareInfoStruct, z);
        return 1;
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJJ(long j) {
        this.LJI = false;
    }

    @Override // X.AbstractC19586911kB
    public final Context LJIJJLI(Context context) {
        return C1385040m98.LIZ(context, false);
    }

    public final void LJJI(String str, VideoShareInfoStruct videoShareInfoStruct, boolean z) {
        String str2;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("creator_id", videoShareInfoStruct.authorId);
        c2344009Gk.LJIIIIZZ("original_group_id", videoShareInfoStruct.awemeId);
        C705930RmZ c705930RmZ = this.LIZJ;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r60.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LJIIIZ));
        c2344009Gk.LJIIIIZZ("group_id", this.LJIIIZ.getAid());
        c2344009Gk.LJIIIIZZ("story_collection_id", C729510SjV.LJII(this.LJIIIZ));
        c2344009Gk.LIZJ(z ? 1 : 0, "is_share_public_comment_to_story");
        C20684815ws.LJIILLIIL("view_original_post", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        if (!AwemeExtKt.isSharedStoryVisible(this.LJIIIZ)) {
            return false;
        }
        return LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct != null && interactStickerStruct.getVideoShareInfoStruct() != null) {
            return LJIIIZ(j, i, f, f2, interfaceC19579211iw);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.11jM] */
    public C19595911ld(int i, final Context context, C194349111v c194349111v, final InteractStickerStruct interactStickerStruct, final C705930RmZ c705930RmZ, Aweme aweme, final InterfaceC665370Q7z interfaceC665370Q7z) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = aweme;
        this.LJIIJ = new AbstractC19580211j6(context, this, interactStickerStruct, c705930RmZ, interfaceC665370Q7z) { // from class: X.11jM
            public final C19595911ld LJ;
            public final InterfaceC665370Q7z LJFF;

            @Override // X.AbstractC19580211j6
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct2) {
                return C19580611jA.LIZIZ(interactStickerStruct2);
            }

            @Override // X.AbstractC19580211j6
            public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
                this.LJ.LJJ(f, f2);
            }

            @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
            public final boolean LJI(float f, float f2, int i2, long j) {
                IVideoCellAbility iVideoCellAbility;
                List<NormalTrackTimeStamp> listLIZIZ = C19580611jA.LIZIZ(this.LIZJ);
                if (listLIZIZ == null) {
                    return false;
                }
                C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                C705930RmZ c705930RmZ2 = this.LIZLLL;
                Context context2 = this.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7z2 = this.LJFF;
                Fragment fragment = null;
                if (interfaceC665370Q7z2 != null && (iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IVideoCellAbility.class, null)) != null) {
                    fragment = iVideoCellAbility.getFragment();
                }
                return c1618440sDa.LJIJJ(f, f2, listLIZIZ, c705930RmZ2, context2, fragment);
            }

            {
                this.LJ = this;
                this.LJFF = interfaceC665370Q7z;
            }
        };
        View view = new View(context);
        C786410Ut5.W5(view, new ViewGroup.MarginLayoutParams(-1, -1));
        this.LJIIJJI = view;
    }
}
