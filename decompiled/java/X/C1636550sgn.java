package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0sgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636550sgn {
    public static final String LIZIZ(Effect effect) {
        if (effect != null && C1446840nko.LIZJ(effect)) {
            if (u.LJIJI(C1446840nko.LIZIZ(effect), "ai_create", false)) {
                return "1";
            }
            if (u.LJIJI(C1446840nko.LIZIZ(effect), "ai_create_i2v", false)) {
                return "2";
            }
            if (u.LJIJI(C1446840nko.LIZIZ(effect), "ai_create_fl2v", false)) {
                return "3";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final void LIZLLL(ShortVideoContext shortVideoContext, Effect effect) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("creation_id", shortVideoContext.getCreationId());
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_from", str);
        String str3 = shortVideoContext.shootWay;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("shoot_way", str3);
        String id = effect.getId();
        if (id == null) {
            id = "";
        }
        pairArr[3] = new Pair("template_id", id);
        String name = effect.getName();
        if (name != null) {
            str2 = name;
        }
        pairArr[4] = new Pair("template_name", str2);
        pairArr[5] = new Pair("is_aigc_template", LIZIZ(effect));
        pairArr[6] = new Pair("is_existing_effect", CardStruct.IStatusCode.DEFAULT);
        pairArr[7] = new Pair("is_pro_template", "1");
        C1449260noi.LJ("click_mobile_effect_template", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final String LJ(String str, String str2) {
        if (Intrinsics.LJFF(str, "mobile_effect_detail_page") && Intrinsics.LJFF(str2, "prop_page")) {
            return "mobile_effect_detail_page";
        }
        if (Intrinsics.LJFF(str, "EH_h5_banner") && Intrinsics.LJFF(str2, "h5_banner")) {
            return "EH_h5_banner";
        }
        return "";
    }

    public static final void LIZJ(Context context, Effect effect, ShortVideoContext shortVideoContext, EffectCategoryModel effectCategoryModel) {
        if (!C1656550tD3.LIZ()) {
            return;
        }
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
        c1737170vJ5.LIZ = context;
        c1737170vJ5.LJFF = "shootpage_template";
        c1737170vJ5.LIZIZ = str;
        c1737170vJ5.LIZJ = str;
        String str3 = shortVideoContext.shootWay;
        if (str3 != null) {
            str2 = str3;
        }
        c1737170vJ5.LIZLLL = str2;
        c1737170vJ5.LJ = shortVideoContext.getCreationId();
        c1737170vJ5.LJIIJJI = effectCategoryModel.getKey();
        c1737170vJ5.LJIIL = shortVideoContext.LJIJJLI();
        if (C1446840nko.LIZJ(effect)) {
            c1737170vJ5.LJI = "ame_aigc_template";
        }
        if (effect != null) {
            C1636590sgr c1636590sgr = new C1636590sgr();
            c1636590sgr.LIZIZ = effect.getEffectId();
            String unzipPath = effect.getUnzipPath();
            c1636590sgr.LIZ = unzipPath;
            if (unzipPath.length() > 0 && c1636590sgr.LIZIZ.length() > 0) {
                c1737170vJ5.LJIIIZ = c1636590sgr;
            }
            c1737170vJ5.LJIILJJIL = effect.getResourceId();
            c1737170vJ5.LJIILL = effect.getEffectId();
            c1737170vJ5.LJII = shortVideoContext.creativeModel.mecReportModel.LIZ;
            c1737170vJ5.LJIJI = "1";
        }
        C339780DTs.LIZJ(c1737170vJ5, AFwS266S0000000_25.get$arr$(518));
    }

    public static final void LIZ(final Context context, final InterfaceC1624480sNK interfaceC1624480sNK, Effect effect, final ShortVideoContext shortVideoContext, InterfaceC1625550sP3 interfaceC1625550sP3) {
        if (C1626430sQT.LIZIZ(interfaceC1624480sNK, effect, false)) {
            return;
        }
        if (C1626430sQT.LIZ(interfaceC1624480sNK, effect, false)) {
            LIZJ(context, effect, shortVideoContext, C1623660sM0.LIZ(interfaceC1624480sNK));
        } else {
            final List listLJIJI = C13LQ.LJIJI(new InterfaceC1625550sP3[]{new C1636600sgs() { // from class: X.0sgq
                @Override // X.InterfaceC1625550sP3
                public final void onSuccess(Effect effect2) {
                    C1636550sgn.LIZJ(context, effect2, shortVideoContext, C1623660sM0.LIZ(interfaceC1624480sNK));
                }
            }, interfaceC1625550sP3});
            interfaceC1624480sNK.LJJLIIIIJ(new C1629340sVA(effect, false, null, 6), new InterfaceC1625550sP3(listLJIJI) { // from class: X.0sOw
                public final List<InterfaceC1625550sP3> LL;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = listLJIJI;
                }

                @Override // X.InterfaceC1625550sP3
                public final void LJIIIIZZ(Effect effect2) {
                    Iterator<InterfaceC1625550sP3> it2 = this.LL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIIIIZZ(effect2);
                    }
                }

                @Override // X.InterfaceC1625550sP3
                public final void onSuccess(Effect effect2) {
                    Iterator<InterfaceC1625550sP3> it2 = this.LL.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess(effect2);
                    }
                }

                @Override // X.InterfaceC1625550sP3
                public final void LJII(int i, Effect effect2) {
                    Iterator<InterfaceC1625550sP3> it2 = this.LL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJII(i, effect2);
                    }
                }

                @Override // X.InterfaceC1625550sP3
                public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                    Iterator<InterfaceC1625550sP3> it2 = this.LL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJIILLIIL(effect2, exceptionResult);
                    }
                }
            });
        }
    }
}
