package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FMH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FMH {
    public final C1DRG LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 13));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(11));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 12));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 11));
    public final List<C09AE> LJFF = new ArrayList();

    public final InterfaceC388390FKr LIZJ() {
        C0FVY c0fvy;
        C0FWO c0fwo;
        InterfaceC1450920nrO interfaceC1450920nrO = (InterfaceC1450920nrO) this.LIZ.LJIIL(null, InterfaceC1450920nrO.class);
        if (interfaceC1450920nrO == null || (c0fvy = (C0FVY) interfaceC1450920nrO.V51(C0FVY.class)) == null || (c0fwo = (C0FWO) c0fvy.LLIIIZ(EnumC1466150oFx.TEXT)) == null) {
            return null;
        }
        return c0fwo.R4();
    }

    public final void LJ() {
        try {
            C201955140j.LIZJ(C1421590n65.LIZIZ, "onDestroy preloadJobList");
            Iterator it2 = ((ArrayList) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((C09AE) it2.next()).LIZIZ(null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final boolean LIZLLL() {
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        String str;
        InterfaceC388390FKr interfaceC388390FKrLIZJ = LIZJ();
        return (interfaceC388390FKrLIZJ == null || (c1664680tQALLZLLIL = interfaceC388390FKrLIZJ.LLZLLIL()) == null || (textStickerModel = c1664680tQALLZLLIL.LIZ) == null || (textTemplateModel = textStickerModel.getTextTemplateModel()) == null || (str = textTemplateModel.templatePath) == null || str.length() <= 0) ? false : true;
    }

    public C0FMH(C1DRG c1drg) {
        this.LIZ = c1drg;
    }

    public final void LJFF(String str) {
        C201955140j.LIZJ(C1421590n65.LIZIZ, "preLoadNext");
        C0FMR c0fmr = (C0FMR) this.LJ.getValue();
        if (str.length() != 0 && c0fmr.LIZIZ(str) == null) {
            ((ArrayList) this.LJFF).add(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMG(this, str, c0fmr, null), 3));
        }
    }

    public final void LJI(C0FMO c0fmo, InspirationItemData inspirationItemData) {
        String title;
        TextFontModel textFontModelLIZ;
        int iLIZ;
        String effectId;
        int iOptInt;
        Effect effect = c0fmo.LIZ;
        boolean zLJIIIZ = TextTemplateTools.LJIIIZ(effect);
        if (TextTemplateTools.LJIIIZ(c0fmo.LIZ)) {
            title = inspirationItemData.getContent();
        } else {
            title = inspirationItemData.getTitle();
        }
        Effect effect2 = c0fmo.LIZIZ;
        if (effect2 != null) {
            textFontModelLIZ = C363490EMx.LIZ(effect2, c0fmo.LIZJ);
        } else {
            textFontModelLIZ = null;
        }
        InterfaceC388390FKr interfaceC388390FKrLIZJ = LIZJ();
        if (interfaceC388390FKrLIZJ == null || (iLIZ = interfaceC388390FKrLIZJ.LLZ()) <= 0) {
            iLIZ = C388240FKc.LIZ();
        }
        InterfaceC388390FKr interfaceC388390FKrLIZJ2 = LIZJ();
        if (interfaceC388390FKrLIZJ2 != null) {
            String unzipPath = effect.getUnzipPath();
            boolean zLJIIJ = TextTemplateTools.LJIIJ(effect);
            Effect effect3 = c0fmo.LIZIZ;
            String str = "";
            if (effect3 == null || (effectId = effect3.getEffectId()) == null) {
                effectId = "";
            }
            String str2 = c0fmo.LIZJ;
            String effectId2 = effect.getEffectId();
            if (effectId2 == null) {
                effectId2 = "";
            }
            String name = effect.getName();
            if (name != null) {
                str = name;
            }
            boolean zLJIIIIZZ = TextTemplateTools.LJIIIIZZ(effect);
            String str3 = c0fmo.LJ;
            String str4 = c0fmo.LJFF;
            try {
                iOptInt = new JSONObject(effect.getExtra()).optInt("default_select_index", 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                iOptInt = 0;
            }
            interfaceC388390FKrLIZJ2.LLZLI(true, iLIZ, new TextTemplateModel(unzipPath, true, zLJIIJ, true, title, false, false, false, effectId, str2, effectId2, zLJIIIIZZ, zLJIIIZ, str, str3, -1, null, false, false, false, false, null, str4, true, TextTemplateTools.LJIIIZ(effect), iOptInt, C1697810uHb.LJIIJJI(inspirationItemData.getTitle(), inspirationItemData.getContent()), null, 138346720, null), textFontModelLIZ, AFwS234S0000000_5.get$arr$(8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r14, com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData r15, X.InterfaceC1364105Vn<? super X.C0FMO> r16) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FMH.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData, X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(int i, InspirationItemData inspirationItemData, C0FMP c0fmp) {
        C0FMO c0fmoLIZIZ = ((C0FMR) this.LJ.getValue()).LIZIZ(inspirationItemData.getEffectId());
        if (c0fmoLIZIZ != null) {
            c0fmp.LIZJ(i, c0fmoLIZIZ);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FMI(this, inspirationItemData, c0fmp, i, null), 3);
        }
    }
}
