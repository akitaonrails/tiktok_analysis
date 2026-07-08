package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0uHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698050uHz extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1698050uHz c1698050uHz, View view) {
        String str;
        Effect effect = (Effect) c1698050uHz.l0;
        if (effect != null && C1446840nko.LJ(effect)) {
            Context context = view.getContext();
            C1630580sXA c1630580sXA = (C1630580sXA) c1698050uHz.l1;
            C1636550sgn.LIZ(context, c1630580sXA.LLILLL, (Effect) c1698050uHz.l0, c1630580sXA.LLILLJJLI, null);
            return;
        }
        Effect effect2 = (Effect) c1698050uHz.l0;
        if (effect2 instanceof DraftEffect) {
            Context context2 = view.getContext();
            CKEDraftInfo draft = ((DraftEffect) ((Effect) c1698050uHz.l0)).getDraft();
            C1630580sXA c1630580sXA2 = (C1630580sXA) c1698050uHz.l1;
            ShortVideoContext shortVideoContext = c1630580sXA2.LLILLJJLI;
            InterfaceC1624480sNK interfaceC1624480sNK = c1630580sXA2.LLILLL;
            if (C1656550tD3.LIZ()) {
                C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
                c1737170vJ5.LIZ = context2;
                String str2 = shortVideoContext.enterFrom;
                String str3 = "";
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                c1737170vJ5.LIZIZ = str;
                c1737170vJ5.LJFF = "shootpage_draft";
                if (str2 == null) {
                    str2 = "";
                }
                c1737170vJ5.LIZJ = str2;
                String str4 = shortVideoContext.shootWay;
                if (str4 != null) {
                    str3 = str4;
                }
                c1737170vJ5.LIZLLL = str3;
                c1737170vJ5.LJ = shortVideoContext.getCreationId();
                c1737170vJ5.LJIIIIZZ = draft;
                c1737170vJ5.LJII = shortVideoContext.creativeModel.mecReportModel.LIZ;
                c1737170vJ5.LJIIJJI = C1623660sM0.LIZ(interfaceC1624480sNK).getKey();
                c1737170vJ5.LJIIL = shortVideoContext.LJIJJLI();
                C339780DTs.LIZJ(c1737170vJ5, AFwS266S0000000_25.get$arr$(519));
            }
            C1737910vKH.LIZ("click_edit_draft_advanced_mobile_effect", ((C1630580sXA) c1698050uHz.l1).LLIZLLLIL);
            return;
        }
        if (effect2 != null) {
            DiyPropParser.LJIIJJI(effect2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" MEEditStickerHandler click not supported: ");
        sbLIZ.append((Effect) c1698050uHz.l0);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(C1698050uHz c1698050uHz, View view) {
        C1636680sh0 c1636680sh0 = (C1636680sh0) c1698050uHz.l0;
        Effect effect = (Effect) c1636680sh0.LL;
        if (effect == null) {
            return;
        }
        C1636550sgn.LIZLLL(c1636680sh0.LLJIJIL, effect);
        C1636680sh0 c1636680sh02 = (C1636680sh0) c1698050uHz.l0;
        c1636680sh02.LLJILJIL.invoke(effect, Integer.valueOf(c1636680sh02.getAdapterPosition()), Integer.valueOf(((C1636680sh0) c1698050uHz.l0).LLILLJJLI));
        C1636550sgn.LIZ(view.getContext(), (InterfaceC1624480sNK) c1698050uHz.l1, effect, ((C1636680sh0) c1698050uHz.l0).LLJIJIL, null);
    }

    public C1698050uHz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
