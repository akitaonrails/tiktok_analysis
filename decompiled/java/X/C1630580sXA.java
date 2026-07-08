package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import mn3.e0;

/* JADX INFO: renamed from: X.0sXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630580sXA extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi, InterfaceC1623110sL7 {
    public final ShortVideoContext LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final InterfaceC1650230t2r LLILZ;
    public View LLILZIL;
    public Effect LLILZLL;
    public final boolean LLIZ = C1444550nh7.LIZ();
    public final Map<String, String> LLIZLLLIL;

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        View view = this.LLILZIL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        View view;
        if ((this.LLILZLL instanceof DraftEffect) && (view = this.LLILZIL) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.w4h);
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.oy, constraintLayout, false);
        this.LLILZIL = viewTd;
        if (viewTd != null) {
            C786410Ut5.LJLLLLLL(8, viewTd);
            if (constraintLayout != null) {
                constraintLayout.addView(viewTd, 0);
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LIZLLL(viewTd.getId(), 0, 1, 0, 2);
            c19mb.LJIIIIZZ(viewTd.getId(), 4, 0, 4);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        View view;
        if ((this.LLILZLL instanceof DraftEffect) && (view = this.LLILZIL) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        if (!C2176908fv.LIZ().contains(C1623660sM0.LIZ(this.LLILLL).getKey())) {
            return false;
        }
        if (!C1446840nko.LJ(c1627370sRz.LIZ)) {
            Effect effect = c1627370sRz.LIZ;
            if (!(effect instanceof DraftEffect)) {
                if (this.LLIZ) {
                    C1449600npG.LJ(effect);
                    return false;
                }
                DiyPropParser.LJIIJJI(effect);
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC1622390sJx, X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        this.LLILZLL = abstractC1627380sS0.LIZ();
        return super.LJIILL(interfaceC1622070sJR, abstractC1627380sS0);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        int i;
        IEffectCreatorService iEffectCreatorService;
        Effect effect = c1627370sRz.LIZ;
        View view = this.LLILZIL;
        if (view != null) {
            if (effect != null && ((iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) == null || !iEffectCreatorService.LJI(effect))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" MEEditStickerHandler visibility not supported by filter, effect: ");
                sbLIZ.append(effect);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJLLLLLL(8, view);
            } else if (!C2176908fv.LIZ().contains(C1623660sM0.LIZ(this.LLILLL).getKey())) {
                C786410Ut5.LJLLLLLL(8, view);
            } else if (!C1446840nko.LJ(effect) && !(effect instanceof DraftEffect)) {
                if (effect != null) {
                    DiyPropParser.LJIIJJI(effect);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" MEEditStickerHandler visibility not supported: ");
                sbLIZ2.append(effect);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                C786410Ut5.LJLLLLLL(8, view);
            } else {
                if (c1627370sRz.LIZJ != EnumC1448980noG.RECOVER) {
                    C1737910vKH.LIZ("show_edit_draft_advanced_mobile_effect", this.LLIZLLLIL);
                }
                C786410Ut5.LJLLLLLL(0, view);
            }
            TextView textView = (TextView) view.findViewById(R.id.ayl);
            if (C1446840nko.LJ(effect)) {
                i = 2131833785;
            } else if (effect instanceof DraftEffect) {
                i = 2131846781;
            } else {
                if (effect != null) {
                    DiyPropParser.LJIIJJI(effect);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(" MEEditStickerHandler text not supported: ");
                sbLIZ3.append(effect);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                i = 2131833181;
            }
            textView.setText(i);
            C786410Ut5.I7(new C1698050uHz(effect, this, 0), view);
        }
    }

    public C1630580sXA(ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK, e0 e0Var) {
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = e0Var;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("creation_id", shortVideoContext.getCreationId());
        String str = shortVideoContext.enterFrom;
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        String str2 = shortVideoContext.shootWay;
        pairArr[2] = new Pair("shoot_way", str2 != null ? str2 : "");
        this.LLIZLLLIL = C2097608Jq.LJIIIIZZ(pairArr);
    }
}
