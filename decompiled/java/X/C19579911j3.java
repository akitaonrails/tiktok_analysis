package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.11j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19579911j3 extends AbstractC19586911kB {
    public final Long LJIIIZ;
    public final Long LJIIJ;
    public final C01GW LJIIJJI;
    public final C19580011j4 LJIIL;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
        C0R60 c0r60;
        C705930RmZ c705930RmZ = this.LIZJ;
        if (c705930RmZ == null || (c0r60 = c705930RmZ.LJIIZILJ) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0r60.LIZ);
        c2344009Gk.LJIIIIZZ("group_id", c0r60.LIZLLL);
        c2344009Gk.LJIIIIZZ("author_id", c0r60.LIZJ);
        c2344009Gk.LJ(this.LJIIJ, "question_id");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("sticker_type", "question");
        c2344009Gk.LJ(this.LJIIIZ, "question_user_id");
        c2344009Gk.LJIIIIZZ("options_show", "both_for_q");
        C20684815ws.LJIILLIIL("sticker_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        return (View) this.LJIIJJI.getValue();
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
    public final void LIZLLL(C705930RmZ c705930RmZ) {
        this.LIZJ = c705930RmZ;
        this.LJIIL.LIZLLL = c705930RmZ;
    }

    @Override // X.AbstractC19586911kB
    public final int LJIILLIIL(C451220Hmi c451220Hmi) {
        Long lValueOf;
        String strLJIILJJIL;
        int i;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        QaStruct qaStruct;
        InteractStickerStruct interactStickerStruct = this.LJII;
        if (interactStickerStruct != null && (qaStruct = interactStickerStruct.getQaStruct()) != null) {
            lValueOf = Long.valueOf(qaStruct.questionId);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null && lValueOf.longValue() != 0) {
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(c451220Hmi.LIZ)) == null) {
                strLJIILJJIL = "";
            }
            C450840Hm6 c450840Hm6 = new C450840Hm6();
            c450840Hm6.LIZLLL = c451220Hmi.LIZ.getString(2131845719);
            if (TextUtils.equals(strLJIILJJIL, "ar")) {
                i = R.drawable.c48;
            } else {
                i = R.drawable.c47;
            }
            c450840Hm6.LIZ = i;
            c450840Hm6.LJFF = new ACListenerS163S0100000_29(this, 192);
            C450840Hm6 c450840Hm62 = new C450840Hm6();
            c450840Hm62.LIZLLL = c451220Hmi.LIZ.getString(2131821948);
            c450840Hm62.LIZ = R.drawable.c46;
            c450840Hm62.LJFF = new ACListenerS163S0100000_29(this, 191);
            c451220Hmi.LIZIZ(c450840Hm6);
            c451220Hmi.LIZIZ(c450840Hm62);
            return 2;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(c451220Hmi.LIZ);
        c1233040iBy.LIZIZ(2131845725);
        c1233040iBy.LIZLLL();
        return 0;
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return this.LJIIL.LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        LJIJ();
        return this.LJIIL.LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    public C19579911j3(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        Long lValueOf;
        QaStruct qaStruct;
        QaStruct qaStruct2;
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        InteractStickerStruct interactStickerStruct2 = this.LJII;
        Long lValueOf2 = null;
        if (interactStickerStruct2 != null && (qaStruct2 = interactStickerStruct2.getQaStruct()) != null) {
            lValueOf = Long.valueOf(qaStruct2.userId);
        } else {
            lValueOf = null;
        }
        this.LJIIIZ = lValueOf;
        InteractStickerStruct interactStickerStruct3 = this.LJII;
        if (interactStickerStruct3 != null && (qaStruct = interactStickerStruct3.getQaStruct()) != null) {
            lValueOf2 = Long.valueOf(qaStruct.questionId);
        }
        this.LJIIJ = lValueOf2;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1093));
        this.LJIIL = new C19580011j4(context, this, interactStickerStruct, c705930RmZ, aweme);
    }
}
