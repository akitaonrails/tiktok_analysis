package X;

import Y.ACListenerS93S0300000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.CommentPostStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* JADX INFO: renamed from: X.11jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19584111jj extends AbstractC19586911kB {
    public final InteractStickerStruct LJIIIZ;
    public final Aweme LJIIJ;
    public final C19581911jN LJIIJJI;
    public View LJIIL;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594611lQ
    public final boolean LJII() {
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
        return 40;
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

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        if (((Number) C284530BDf.LIZ.getValue()).intValue() != 1) {
            return this.LJIIL;
        }
        this.LJIIL = new C0GST(this.LIZ);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View view = this.LJIIL;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
        HandlerHook.viewPostDelay(this.LJIIL, new ARunnableS129S0100000_29(this, 229), 1000L);
        return this.LJIIL;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
    public final void LIZLLL(C705930RmZ c705930RmZ) {
        this.LIZJ = c705930RmZ;
        this.LJIIJJI.LIZLLL = c705930RmZ;
    }

    @Override // X.AbstractC19586911kB
    public final int LJIILLIIL(C451220Hmi c451220Hmi) {
        CommentPostStickerStruct commentPostStickerStruct;
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct != null && (commentPostStickerStruct = interactStickerStruct.getCommentPostStickerStruct()) != null) {
            C450820Hm4 c450820Hm4 = new C450820Hm4();
            c450820Hm4.LIZJ = this.LJIIL.getContext().getString(2131829228);
            c450820Hm4.LIZLLL = new ACListenerS93S0300000_29(commentPostStickerStruct, this, c451220Hmi, 13);
            c451220Hmi.LIZ(c450820Hm4);
            LJJI("show", commentPostStickerStruct);
            return 1;
        }
        return 0;
    }

    public final void LJJI(String str, CommentPostStickerStruct commentPostStickerStruct) {
        String str2;
        String str3;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        c2344009Gk.LJIIIIZZ("group_id", this.LJIIJ.getAid());
        c2344009Gk.LJIIIIZZ("original_group_id", commentPostStickerStruct.originalAwemeId);
        c2344009Gk.LJIIIIZZ("comment_id", commentPostStickerStruct.originalCommentId);
        c2344009Gk.LJIIIIZZ("author_id", C1017070cZd.LJIJ(this.LJIIJ));
        C705930RmZ c705930RmZ = this.LIZJ;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r60.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (C729510SjV.LJJIJIL(this.LJIIJ)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str3);
        C20684815ws.LJIILLIIL("view_original_comment_sticker", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        if (!this.LJIIJ.getIsCommentPostVideo() || AwemeExtKt.isCommentPostInvisible(this.LJIIJ)) {
            return false;
        }
        return LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        if (AwemeExtKt.isCommentPostInvisible(this.LJIIJ)) {
            return false;
        }
        return LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11jN] */
    public C19584111jj(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interactStickerStruct;
        this.LJIIJ = aweme;
        this.LJIIJJI = new AbstractC19580211j6(context, this, interactStickerStruct, c705930RmZ) { // from class: X.11jN
            public final C19584111jj LJ;

            @Override // X.AbstractC19580211j6
            public final RectF LIZ(NormalTrackTimeStamp normalTrackTimeStamp) {
                float f;
                float f2;
                InterfaceC19582111jP interfaceC19582111jP;
                C690990R8n c690990R8nLIZ;
                C690990R8n c690990R8nLIZ2;
                C705930RmZ c705930RmZ2 = this.LIZLLL;
                if (c705930RmZ2 == null) {
                    return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
                InterfaceC19582111jP interfaceC19582111jP2 = c705930RmZ2.LJIIL;
                if (interfaceC19582111jP2 != null && (c690990R8nLIZ2 = interfaceC19582111jP2.LIZ()) != null) {
                    f = c690990R8nLIZ2.LIZ;
                } else {
                    f = 0.0f;
                }
                C705930RmZ c705930RmZ3 = this.LIZLLL;
                if (c705930RmZ3 != null && (interfaceC19582111jP = c705930RmZ3.LJIIL) != null && (c690990R8nLIZ = interfaceC19582111jP.LIZ()) != null) {
                    f2 = c690990R8nLIZ.LIZIZ;
                } else {
                    f2 = 0.0f;
                }
                if (f == f2) {
                    return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float width = normalTrackTimeStamp.getWidth() * f;
                float height = normalTrackTimeStamp.getHeight() * f2;
                float f3 = 2;
                float x = (f * normalTrackTimeStamp.getX()) - (width / f3);
                float y = (f2 * normalTrackTimeStamp.getY()) - (height / f3);
                return new RectF(x, y, width + x, height + y);
            }

            @Override // X.AbstractC19580211j6
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct2) {
                return C19580611jA.LIZIZ(interactStickerStruct2);
            }

            @Override // X.AbstractC19580211j6
            public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
                interfaceC19579211iw.LIZ(this.LJ.LJJ(f, f2));
            }

            {
                this.LJ = this;
            }
        };
        View view = new View(context);
        C786410Ut5.W5(view, new ViewGroup.MarginLayoutParams(-1, -1));
        this.LJIIL = view;
    }
}
