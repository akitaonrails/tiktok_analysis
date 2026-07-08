package X;

import com.ss.android.ugc.aweme.exp.safety.DMCameraSafetyExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896060ZDg {
    public static final String LIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:mask_type");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -606053617) {
                if (iHashCode != 277474905) {
                    if (iHashCode == 1022432685) {
                        str.equals("keywords_filter");
                    }
                } else if (str.equals("negativity_filter")) {
                    return "negativity_model";
                }
            } else if (str.equals("nude_filter")) {
                return "ansa_model";
            }
        }
        return "filtered_keyword";
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        BaseResponseComponent baseResponseComponentNc;
        Map<String, String> map;
        if (!C896400ZEo.LJI(c869590Y9l) || C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (baseResponseComponentNc = baseTemplateLIZ.Nc()) != null && (map = baseResponseComponentNc.extras) != null) {
            str = map.get("a:open_msg_pop_up_notice");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "1");
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        String str;
        List listLJJLIIIJILLIZJL;
        if (C0Z5J.LIZLLL(c869590Y9l) || Intrinsics.LJFF(c869590Y9l.getLocalExt().get("a:nude_unmask"), "1")) {
            return true;
        }
        if (C123100dR.LIZ(c869590Y9l.getExt().get("a:nude_unmask")) && (str = c869590Y9l.getExt().get("a:nude_unmask")) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (listLJJLIIIJILLIZJL.contains(curUserId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l) {
        if (!C902250ZaR.LIZ()) {
            return false;
        }
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJJIFFI();
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l) || !C0Z5J.LIZJ(c869590Y9l) || LIZIZ(c869590Y9l)) {
            return false;
        }
        if (C0ZDX.LJJIJ(c869590Y9l)) {
            return true;
        }
        return !LIZJ(c869590Y9l);
    }

    public static final C0ZSW LJFF(C869590Y9l c869590Y9l) {
        String strLJ;
        if (!C896400ZEo.LJIIIIZZ(c869590Y9l)) {
            return null;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null) {
            strLJ = C896400ZEo.LJ(baseTemplateLIZ);
        } else {
            strLJ = null;
        }
        if (C123100dR.LIZ(strLJ)) {
            return null;
        }
        String str = c869590Y9l.getLocalExt().get("local_ext_paired_msg_id");
        if (str != null && str.length() != 0) {
            if (!C896400ZEo.LJII(c869590Y9l)) {
                return null;
            }
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                return C0ZSW.PHOTO_SWAP_INITIATE_MASK;
            }
            return C0ZSW.PHOTO_SWAP_REPLY_MASK;
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            return C0ZSW.PHOTO_SWAP_INITIATE_MASK;
        }
        return C0ZSW.PHOTO_SWAP_REPLY_MASK;
    }

    public static final void LJIIIIZZ(C869590Y9l c869590Y9l) {
        c869590Y9l.getLocalExt().put("a:nude_unmask", "1");
        C0Z5J.LJ(c869590Y9l);
        C603540Nlo.LIZIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, C2097608Jq.LJIIIIZZ(new Pair("a:nude_unmask", new C0Y3R("1")), new Pair("a:unmasked", new C0Y3R("1"))), new C0Y3I("Update nudify UnMask"), false);
    }

    public static final C0ZSW LJ(C869590Y9l c869590Y9l, boolean z) {
        if (((Boolean) C902250ZaR.LIZLLL.getValue()).booleanValue() && LIZLLL(c869590Y9l)) {
            return C0ZSW.NUDE_MASK;
        }
        if (c869590Y9l.getCreatedAt() > DMCameraSafetyExperiment.LIZJ) {
            if (!C0ZDX.LJJIJ(c869590Y9l) && !z) {
                IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
                if (iDmToolsDebugService != null) {
                    iDmToolsDebugService.LJJIFFI();
                }
            } else if (!C0ZDX.LJJJJIZL(c869590Y9l)) {
                return C0ZSW.SAFETY_MASK;
            }
        }
        C0ZSW c0zswLJFF = LJFF(c869590Y9l);
        if (c0zswLJFF != null) {
            return c0zswLJFF;
        }
        return C0ZSW.NO_MASK;
    }

    public static final void LJI(C869590Y9l c869590Y9l, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c869590Y9l.getLocalExt().put("a:force_mask", str);
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "a:force_mask", new C0Y3R(str), new C0Y3I("Add message mask"));
    }

    public static final void LJII(String str, boolean z) {
        String str2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null) {
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            Map<String, String> localExt = c0y8tLIZ.getLocalExt();
            if (localExt != null) {
                localExt.put("a:media_mask", str2);
            }
            C0YNP.LIZIZ(c0y8tLIZ.getConversationId()).LJJ(c0y8tLIZ.getLocalExt(), null);
        }
    }
}
