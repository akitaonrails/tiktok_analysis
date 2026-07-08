package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ibm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249040ibm {
    public static final C1249040ibm LIZ = new C1249040ibm();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(836));

    public static Map LIZ() {
        return (Map) LIZIZ.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static List LIZIZ(User user, List list) {
        int i;
        InterfaceC546120LbO interfaceC546120LbOLIZIZ;
        boolean zLJ;
        boolean zBooleanValue;
        IProfileMusicTabService iProfileMusicTabService;
        Boolean boolValueOf;
        k kVarLJJIIZ;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ProfileComponents profileComponents = (ProfileComponents) it2.next();
                String str = profileComponents.componentName;
                if (str != null) {
                    Boolean boolValueOf2 = null;
                    switch (str.hashCode()) {
                        case -1893890292:
                            if (str.equals("profile_tab_ecommerce_showcase")) {
                                i = 12;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case -1648586267:
                            if (str.equals("profile_tab_music")) {
                                n nVar = profileComponents.bizData;
                                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("show_artist_playlist")) != null) {
                                    zLJ = kVarLJJIIZ.LJ();
                                } else {
                                    zLJ = false;
                                }
                                if (user != null && (iProfileMusicTabService = (IProfileMusicTabService) ServiceManager.get().getService(IProfileMusicTabService.class)) != null && (boolValueOf = Boolean.valueOf(iProfileMusicTabService.LJJIIJZLJL(user))) != null) {
                                    zBooleanValue = boolValueOf.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getSupportTabs showArtistPlayListValue:");
                                sbLIZ.append(zLJ);
                                sbLIZ.append(", showGhostMusicTab:");
                                sbLIZ.append(zBooleanValue);
                                C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
                                if (zLJ || zBooleanValue) {
                                    i = 3;
                                    arrayList.add(Integer.valueOf(i));
                                }
                            }
                            break;
                        case -1469523907:
                            if (str.equals("profile_tab_pine_drama_watch_history")) {
                                i = 20;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case -1328158556:
                            if (str.equals("profile_tab_short_drama")) {
                                i = 18;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case -1175660221:
                            if (str.equals("profile_tab_private")) {
                                i = 10;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case -746233985:
                            if (str.equals("profile_tab_cast")) {
                                i = 21;
                                AITheaterProfileService.LIZ.getClass();
                                AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                                if (aITheaterProfileServiceLIZ != null && (interfaceC546120LbOLIZIZ = aITheaterProfileServiceLIZ.LIZIZ()) != null && interfaceC546120LbOLIZIZ.LIZLLL()) {
                                    arrayList.add(Integer.valueOf(i));
                                }
                            }
                            break;
                        case -745958441:
                            if (str.equals("profile_tab_like")) {
                                i = 2;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case -53914142:
                            if (str.equals("profile_tab_ecommerce_store")) {
                                i = 14;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 124554716:
                            if (str.equals("profile_tab_favorite")) {
                                i = 6;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 190156241:
                            if (str.equals("profile_tab_effect")) {
                                i = 4;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 561719699:
                            if (str.equals("profile_tab_repost")) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("userblock=[");
                                if (user != null) {
                                    boolValueOf2 = Boolean.valueOf(user.isBlock);
                                }
                                sbLIZ2.append(boolValueOf2);
                                sbLIZ2.append("] from server config ");
                                sbLIZ2.append(profileComponents.bizData);
                                C1720106oR.LJI("repost_biz", C2188811AlT.LIZIZ(sbLIZ2));
                                if (user == null || !user.isBlock) {
                                    i = 15;
                                    arrayList.add(Integer.valueOf(i));
                                }
                            }
                            break;
                        case 600411254:
                            if (str.equals("profile_tab_public_post")) {
                                i = 0;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 772937582:
                            if (str.equals("profile_tab_business_page")) {
                                i = 17;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 1605609247:
                            if (str.equals("profile_tab_sticker_store") && !C19252910Tv.LIZIZ.LIZLLL().block().LIZIZ() && C457760HxG.LIZIZ(false)) {
                                i = 16;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                        case 1677284792:
                            if (str.equals("profile_tab_live_game_org_account")) {
                                i = 19;
                                arrayList.add(Integer.valueOf(i));
                            }
                            break;
                    }
                }
            }
        }
        IProfileAppDiffProtocol.LIZ.getClass();
        C1253780ijQ.LIZ().LIZIZ();
        if (arrayList.isEmpty()) {
            arrayList.add(0);
            arrayList.add(2);
        }
        return arrayList;
    }
}
