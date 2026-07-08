package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fangroup.settings.GroupChatConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZFW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFW implements C0Z6T {
    public static final C0ZFW LIZ = new C0ZFW();

    public static final boolean LJIJ(String str) {
        return LJJIIZ(Long.valueOf(C461720I8s.LIZJ()), str);
    }

    public static final boolean LJIJI(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || coreInfo.getOwner() != C461720I8s.LIZJ()) {
            return false;
        }
        return true;
    }

    public static final C0Y8T LJIJJLI(String str) {
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
    }

    public static final Long LJJI(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null) {
            return Long.valueOf(coreInfo.getOwner());
        }
        return null;
    }

    public static final int LJJII(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return 0;
        }
        return c0y8tLIZ.getMemberCount();
    }

    public static final long LJJIII(String str) {
        return C0YNP.LJII(str);
    }

    @Override // X.C0Z6T
    public final int LIZ(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8Y coreInfo2;
        Map<String, String> ext2;
        String str2;
        Integer numLJIIJJI;
        if (c0y8t != null && (coreInfo2 = c0y8t.getCoreInfo()) != null && (ext2 = coreInfo2.getExt()) != null && (str2 = ext2.get("a:s_group_member_limit")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            return numLJIIJJI.intValue();
        }
        if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:group_type")) == null) {
            str = "default";
        }
        return C0ZFX.LIZ(str);
    }

    @Override // X.C0Z6T
    public final boolean LIZIZ(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str = ext.get("a:show_on_profile");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "1");
    }

    @Override // X.C0Z6T
    public final boolean LIZJ(C0Y8T c0y8t) {
        if (c0y8t.getMemberCount() == 1 && c0y8t.isMember()) {
            return true;
        }
        return false;
    }

    @Override // X.C0Z6T
    public final boolean LIZLLL(SharePackage sharePackage) {
        String str;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "group");
    }

    @Override // X.C0Z6T
    public final boolean LJ(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str = ext.get("a:group_type");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, EnumC913760Zt0.QR_CODE_GROUP.getValue());
    }

    @Override // X.C0Z6T
    public final int LJFF(C0Y8T c0y8t) {
        String str;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:group_type")) == null) {
            str = "default";
        }
        Integer num = ((GroupChatConfig) C896540ZFc.LIZIZ.getValue()).groupAdminConfigMap.get(str);
        if (num == null && (num = C896540ZFc.LIZ.groupAdminConfigMap.get("default")) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C0Z6T
    public final C0ZFY LJI(C0Y8T c0y8t) {
        Long lLJIILIIL;
        Map<String, String> ext = null;
        if (c0y8t != null) {
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            if (coreInfo != null) {
                ext = coreInfo.getExt();
            }
            if (c0y8t != null && c0y8t.isGroupChat() && ext != null) {
                if (!Intrinsics.LJFF(ext.get("ban_status"), "1") && !Intrinsics.LJFF(ext.get("ban_status_v2"), "1")) {
                    return C896520ZFa.LIZ;
                }
                String str = ext.get("ban_expiry");
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    if (lLJIILIIL.longValue() == 0) {
                        return new C0ZFY() { // from class: X.0ZFZ
                        };
                    }
                    if (lLJIILIIL.longValue() == -1) {
                        return C1635606ao.LIZ;
                    }
                    if (lLJIILIIL.longValue() > 0) {
                        return new C880780Ygu(lLJIILIIL.longValue());
                    }
                    return new C0ZFY() { // from class: X.0ZFb
                    };
                }
                return new C0ZFY() { // from class: X.0ZFb
                };
            }
        }
        return new C0ZFY() { // from class: X.0ZFb
        };
    }

    @Override // X.C0Z6T
    public final boolean LJII(String str) {
        String str2;
        Map<String, String> ext;
        C0Y8T c0y8tLJ = C0YNP.LIZIZ(str).LJ();
        if (c0y8tLJ == null || !c0y8tLJ.isGroupChat()) {
            return false;
        }
        C0Y8Y coreInfo = c0y8tLJ.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
            str2 = ext.get("a:group_name_modified");
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, "1")) {
            return false;
        }
        return true;
    }

    @Override // X.C0Z6T
    public final String LJIIIIZZ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        String desc;
        if (c0y8t == null || (coreInfo = c0y8t.getCoreInfo()) == null || (desc = coreInfo.getDesc()) == null) {
            return "";
        }
        return desc;
    }

    @Override // X.C0Z6T
    public final boolean LJIIIZ(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.isMember() && !c0y8t.isDissolved() && c0y8t.getCoreInfo() != null && !LJJIIJZLJL(c0y8t)) {
            return true;
        }
        return false;
    }

    @Override // X.C0Z6T
    public final String LJIIJ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        String name;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (name = coreInfo.getName()) != null && C123100dR.LIZ(name)) {
            return name;
        }
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131829002);
    }

    @Override // X.C0Z6T
    public final boolean LJIIJJI(String str) {
        return LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str));
    }

    @Override // X.C0Z6T
    public final String LJIIL(String str) {
        return LJIIIIZZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
    }

    @Override // X.C0Z6T
    public final void LJIILIIL(String str) {
        C0Y8Y coreInfo;
        C0Y8T c0y8tLJ = C0YNP.LIZIZ(str).LJ();
        if (c0y8tLJ != null && c0y8tLJ.isGroupChat() && (coreInfo = c0y8tLJ.getCoreInfo()) != null && coreInfo.getExt() != null) {
            c0y8tLJ.getCoreInfo().getExt().put("a:group_name_modified", "1");
        }
    }

    @Override // X.C0Z6T
    public final boolean LJIILJJIL(C0Y8T c0y8t) {
        if (c0y8t == null || c0y8t.getMemberCount() < LIZ(c0y8t)) {
            return false;
        }
        return true;
    }

    @Override // X.C0Z6T
    public final UrlModel LJIILL(C0Y8T c0y8t) {
        String strLJIILLIIL;
        if (c0y8t == null || (strLJIILLIIL = LIZ.LJIILLIIL(c0y8t)) == null || strLJIILLIIL.length() == 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strLJIILLIIL));
        return urlModel;
    }

    @Override // X.C0Z6T
    public final String LJIILLIIL(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null) {
            return coreInfo.getIcon();
        }
        return null;
    }

    @Override // X.C0Z6T
    public final boolean LJIIZILJ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:risk_disable_join")) != null && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJJ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (LJIJI(c0y8t)) {
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
                str = ext.get("a:ban_owner_appeal");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "1")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String LJJIFFI(String str) {
        Long lLJJI;
        if (str == null || (lLJJI = LJJI(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str))) == null) {
            return null;
        }
        return lLJJI.toString();
    }

    public final Boolean LJJIIJ(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return null;
        }
        return Boolean.valueOf(LJJIIJZLJL(c0y8tLIZ));
    }

    public final boolean LJJIIJZLJL(C0Y8T c0y8t) {
        C0ZFY c0zfyLJI = LJI(c0y8t);
        if (!Intrinsics.LJFF(c0zfyLJI, C1635606ao.LIZ) && !(c0zfyLJI instanceof C880780Ygu)) {
            return false;
        }
        return true;
    }

    public static final List<String> LJJ(String str, boolean z) {
        List<Long> memberIds;
        List<Long> memberIds2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (z) {
            if (c0y8tLIZ != null && (memberIds2 = c0y8tLIZ.getMemberIds()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Long> it2 = memberIds2.iterator();
                while (it2.hasNext()) {
                    String string = it2.next().toString();
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        if (c0y8tLIZ != null && (memberIds = c0y8tLIZ.getMemberIds()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Long> it3 = memberIds.iterator();
            while (it3.hasNext()) {
                String string2 = it3.next().toString();
                if (string2 != null) {
                    arrayList2.add(string2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!C1572306Dp.LIZ((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJJIIZ(Long l, String str) {
        Long lValueOf;
        C0Y8Y coreInfo;
        if (l == null) {
            return false;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
            lValueOf = Long.valueOf(coreInfo.getOwner());
        } else {
            lValueOf = null;
        }
        return Intrinsics.LJFF(lValueOf, l);
    }

    public final String LJIL(Context context, C0Y8T c0y8t, C0ZFY c0zfy) {
        int i;
        int i2;
        if (c0zfy instanceof C880780Ygu) {
            if (LJIJJ(c0y8t)) {
                i2 = 2131832016;
            } else {
                i2 = 2131832018;
            }
            String string = context.getString(i2);
            long j = ((C880780Ygu) c0zfy).LIZ;
            String strLIZIZ = C2215181Bmu.LJIIL.getValue().LIZIZ(TimeUnit.SECONDS.toMillis(j), Locale.getDefault());
            int iLJJJ = a0.LJJJ(string, "{s_date_time}", 0, false, 6);
            if (iLJJJ != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C13LN.LJZL(iLJJJ, string));
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(string.substring(iLJJJ + 13));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return string;
        }
        if (Intrinsics.LJFF(c0zfy, C1635606ao.LIZ)) {
            if (LJIJJ(c0y8t)) {
                i = 2131832013;
            } else {
                i = 2131832015;
            }
            return context.getString(i);
        }
        return null;
    }
}
