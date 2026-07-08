package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.genaifoundation.utils.GenAIStylizedStagesBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Exk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381620Exk extends AbstractC381680Exq {
    public C381620Exk(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        super(interfaceC497601wk, videoPublishEditModel, interfaceC381790Ey1);
    }

    public final void LJIIIZ(C381600Exi c381600Exi, float f, float f2, InterfaceC382380Eyy interfaceC382380Eyy, boolean z) {
        String str;
        EnumC377680ErO enumC377680ErO;
        List listSingletonList;
        String string;
        C381710Ext c381710Ext;
        List listSingletonList2;
        C381710Ext next;
        if (C378050Erz.LIZ[c381600Exi.LIZIZ.ordinal()] == 1) {
            str = c381600Exi.LIZ;
            if (a0.LJJJIL(str)) {
                str = (String) C2536809ws.LIZ.getValue();
            }
            enumC377680ErO = EnumC377680ErO.FL_2_VIDEO;
            listSingletonList = c381600Exi.LJIIL;
        } else {
            str = c381600Exi.LIZ;
            if (a0.LJJJIL(str)) {
                str = (String) C274150Aon.LIZ.getValue();
            }
            enumC377680ErO = EnumC377680ErO.IMAGE_2_VIDEO;
            if (!c381600Exi.LJIIL.isEmpty()) {
                listSingletonList = c381600Exi.LJIIL;
            } else if (!a0.LJJJIL(c381600Exi.LJI)) {
                listSingletonList = Collections.singletonList(c381600Exi.LJI);
            } else {
                listSingletonList = C13BV.INSTANCE;
            }
        }
        EnumC377680ErO enumC377680ErO2 = c381600Exi.LIZLLL;
        if (enumC377680ErO2 == null) {
            if (c381600Exi.LJIILIIL == EnumC378310EsP.AI_TRANSITION) {
                enumC377680ErO2 = EnumC377680ErO.AI_TRANSITION;
            } else {
                enumC377680ErO2 = enumC377680ErO;
            }
        }
        if (c381600Exi.LJI.length() > 0) {
            C2225908np c2225908np = C2225908np.LIZ;
            String str2 = c381600Exi.LJI;
            c2225908np.getClass();
            string = Uri.fromFile(new C0VSJ(str2)).toString();
        } else {
            string = "";
        }
        CreativeInfo creativeInfo = this.LIZIZ.creativeModel.creativeInfo;
        String str3 = c381600Exi.LJIIJJI;
        String str4 = c381600Exi.LJII;
        int i = c381600Exi.LJIIJ / LSPassThroughRecordSizeConfig.DEFAULT;
        String str5 = c381600Exi.LJIIIIZZ.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
        Iterator it2 = listSingletonList.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C382120EyY((String) it2.next(), null, 6));
        }
        EnumC377820Erc enumC377820Erc = c381600Exi.LJ;
        if (enumC377820Erc == null) {
            enumC377820Erc = EnumC377820Erc.EP_AIGC_T2V;
        }
        Map<String, String> mapLIZ = c381600Exi.LIZ();
        int type = c381600Exi.LJIIZILJ.getType();
        if (c381600Exi.LJIIZILJ == EnumC378140Es8.NONE) {
            listSingletonList2 = C13BV.INSTANCE;
        } else {
            if (!c381600Exi.LJIJ.isEmpty()) {
                Iterator<C381710Ext> it3 = c381600Exi.LJIJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.LIZ == 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c381710Ext = next;
                if (c381710Ext == null) {
                    c381710Ext = (C381710Ext) C13LP.LJJJJZI(c381600Exi.LJIJ);
                }
            } else {
                String str6 = c381600Exi.LJIIJJI;
                if (a0.LJJJIL(str6)) {
                    str6 = "keep_ratio";
                }
                String str7 = c381600Exi.LJIIIIZZ.LIZIZ;
                if (a0.LJJJIL(str7)) {
                    str7 = c381600Exi.LJIIIIZZ.LIZ;
                }
                String strLIZ = C2537009wu.LIZ();
                String str8 = c381600Exi.LJIIIIZZ.LIZIZ;
                if (a0.LJJJIL(str8)) {
                    str8 = c381600Exi.LJIIIIZZ.LIZ;
                }
                String strLIZJ = C2292508yZ.LIZJ(new GenAIStylizedStagesBuilder.StageReqJson(str6, str8, 3));
                String str9 = c381600Exi.LJIIIZ;
                if (a0.LJJJIL(str9)) {
                    str9 = CardStruct.IStatusCode.DEFAULT;
                }
                c381710Ext = new C381710Ext(0, strLIZ, strLIZJ, str7, str9, 1);
            }
            C381710Ext c381710ExtLIZ = C381710Ext.LIZ(c381710Ext, null, 62);
            if (!(!a0.LJJJIL(c381710ExtLIZ.LIZLLL))) {
                String str10 = c381600Exi.LJIIIIZZ.LIZIZ;
                if (a0.LJJJIL(str10)) {
                    str10 = c381600Exi.LJIIIIZZ.LIZ;
                }
                if (!a0.LJJJIL(str10)) {
                    c381710ExtLIZ = C381710Ext.LIZ(c381710ExtLIZ, str10, 55);
                }
            }
            listSingletonList2 = Collections.singletonList(c381710ExtLIZ);
        }
        C382170Eyd c382170Eyd = new C382170Eyd(creativeInfo, str, arrayList, str4, i, str3, str5, enumC377820Erc, enumC377680ErO2, mapLIZ, type, listSingletonList2, 267384872);
        EnumC378310EsP enumC378310EsP = c381600Exi.LJIILIIL;
        C381700Exs c381700Exs = new C381700Exs(EnumC337080DJi.APPLY, new NLETrackSlot(), new PromptModel("", "", PromptType.NONE, "", "", "", false));
        EnumC381960EyI enumC381960EyI = c381600Exi.LIZJ;
        if (enumC381960EyI == null) {
            enumC381960EyI = EnumC381960EyI.EDITOR_PRO_AIGC_T2V;
        }
        EnumC381980EyK enumC381980EyK = c381600Exi.LJFF;
        if (enumC381980EyK == null) {
            enumC381980EyK = EnumC381980EyK.EDITOR_PRO_AIGC_T2V;
        }
        LJIIIIZZ(enumC378310EsP, string, c381700Exs, interfaceC382380Eyy, c382170Eyd, enumC381960EyI, z, enumC381980EyK);
    }
}
