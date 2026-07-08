package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416390mxh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZLLL(k kVar) {
        if (kVar instanceof h) {
            k kVar2 = (k) C13LP.LJJJLIIL(kVar.LJIIL());
            if (kVar2 == null || !(kVar2 instanceof q) || !(kVar2.LJIILJJIL().LL instanceof String)) {
                return null;
            }
            return kVar2.LJIL();
        }
        if (!(kVar instanceof q)) {
            return null;
        }
        return kVar.LJIL();
    }

    public static void LJ(n nVar) {
        String strLJIL;
        n nVarLJIILIIL;
        k kVarLJJIIZ;
        String strLJIL2;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        String strLIZLLL;
        k kVarLJJIIZ4;
        Number numberLJIILIIL;
        Number numberLJIILIIL2;
        LIZ(nVar, "asset_id");
        LIZ(nVar, "resource_id");
        LJII(nVar, "cover_list", "cover");
        LJII(nVar, "icon_list", "icon");
        LJII(nVar, "package_list", "file");
        k kVarLJJIIZ5 = nVar.LJJIIZ("business_extra");
        if (kVarLJJIIZ5 != null && (kVarLJJIIZ5 instanceof n)) {
            n nVarLJIILIIL2 = kVarLJJIIZ5.LJIILIIL();
            k kVarLJJIIZ6 = nVarLJIILIIL2.LJJIIZ("dep_resources_total_size");
            if (kVarLJJIIZ6 != null) {
                if (kVarLJJIIZ6 instanceof q) {
                    q qVarLJIILJJIL = kVarLJJIIZ6.LJIILJJIL();
                    Object obj = qVarLJIILJJIL.LL;
                    if (!(obj instanceof Number)) {
                        if ((obj instanceof String) && (numberLJIILIIL2 = C2095008Iq.LJIILIIL(qVarLJIILJJIL.LJIL())) != null) {
                            nVarLJIILIIL2.LJJIII(numberLJIILIIL2, "dep_resources_total_size");
                        } else {
                            nVarLJIILIIL2.LJJIJL("dep_resources_total_size");
                        }
                    }
                } else if ((kVarLJJIIZ6 instanceof n) && (kVarLJJIIZ4 = kVarLJJIIZ6.LJIILIIL().LJJIIZ("total")) != null && (kVarLJJIIZ4 instanceof q)) {
                    q qVarLJIILJJIL2 = kVarLJJIIZ4.LJIILJJIL();
                    Object obj2 = qVarLJIILJJIL2.LL;
                    if (obj2 instanceof Number) {
                        nVarLJIILIIL2.LJJIFFI("dep_resources_total_size", kVarLJJIIZ4);
                    } else if ((obj2 instanceof String) && (numberLJIILIIL = C2095008Iq.LJIILIIL(qVarLJIILJJIL2.LJIL())) != null) {
                        nVarLJIILIIL2.LJJIII(numberLJIILIIL, "dep_resources_total_size");
                    } else {
                        nVarLJIILIIL2.LJJIJL("dep_resources_total_size");
                    }
                } else {
                    nVarLJIILIIL2.LJJIJL("dep_resources_total_size");
                }
            }
            LIZ(nVarLJIILIIL2, "tags_updated_at");
            LJI(nVarLJIILIIL2, "tags_updated_at");
            LJFF(nVarLJIILIIL2, "ptime");
            LIZJ(nVarLJIILIIL2, "ptime", "publish_time");
            LJFF(nVarLJIILIIL2, "publish_time");
            LIZJ(nVarLJIILIIL2, "origin_panel", "panel_key");
            LIZJ(nVarLJIILIIL2, "music_post_unavailable", "music_unavailable_in_post");
            LJIIIIZZ(nVarLJIILIIL2, "music_model");
            LJIIIIZZ(nVarLJIILIIL2, "meta_song_id");
            LJIIIIZZ(nVarLJIILIIL2, "clip_id_list");
            LJIIIIZZ(nVarLJIILIIL2, "meta_song_id_list");
            k kVarLJJIIZ7 = nVarLJIILIIL2.LJJIIZ("hashtag");
            if (kVarLJJIIZ7 != null && (kVarLJJIIZ7 instanceof q)) {
                h hVar = new h();
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(kVarLJJIIZ7.LJIL(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((String) obj3).length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    hVar.LJJIII((String) it3.next());
                }
                nVarLJIILIIL2.LJJIFFI("hashtag", hVar);
            }
            LJII(nVarLJIILIIL2, "preview_video_list", "preview_video");
            k kVarLJJIIZ8 = nVarLJIILIIL2.LJJIIZ("tags");
            if (!nVar.LJJIJIIJIL("tags") && kVarLJJIIZ8 != null) {
                if (kVarLJJIIZ8 instanceof h) {
                    nVar.LJJIFFI("tags", kVarLJJIIZ8);
                } else if (kVarLJJIIZ8 instanceof q) {
                    h hVar2 = new h();
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(kVarLJJIIZ8.LJIL(), new String[]{","}, 0, 6);
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                    Iterator it4 = listLJJLIIIJILLIZJL2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(a0.LJLIIIL((String) it4.next()).toString());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        if (((String) obj4).length() > 0) {
                            arrayList4.add(obj4);
                        }
                    }
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        hVar2.LJJIII((String) it5.next());
                    }
                    nVar.LJJIFFI("tags", hVar2);
                }
            }
            k kVarLJJIIZ9 = nVarLJIILIIL2.LJJIIZ("clip_id_list");
            if (kVarLJJIIZ9 != null) {
                String strLIZLLL2 = LIZLLL(kVarLJJIIZ9);
                if (strLIZLLL2 != null && !nVarLJIILIIL2.LJJIJIIJIL("music_model")) {
                    nVarLJIILIIL2.LJJIIJ("music_model", strLIZLLL2);
                }
                k kVarLJJIIZ10 = nVarLJIILIIL2.LJJIIZ("music_id");
                if (strLIZLLL2 != null && (kVarLJJIIZ10 == null || (kVarLJJIIZ10 instanceof m) || ((kVarLJJIIZ10 instanceof q) && kVarLJJIIZ10.LJIL().length() == 0))) {
                    nVarLJIILIIL2.LJJIIJ("music_id", strLIZLLL2);
                }
            }
            k kVarLJJIIZ11 = nVarLJIILIIL2.LJJIIZ("meta_song_id_list");
            if (kVarLJJIIZ11 != null && !nVarLJIILIIL2.LJJIJIIJIL("meta_song_id") && (strLIZLLL = LIZLLL(kVarLJJIIZ11)) != null) {
                nVarLJIILIIL2.LJJIIJ("meta_song_id", strLIZLLL);
            }
            k kVarLJJIIZ12 = nVarLJIILIIL2.LJJIIZ("distribution_extra");
            if (kVarLJJIIZ12 != null && !nVarLJIILIIL2.LJJIJIIJIL("extra")) {
                nVarLJIILIIL2.LJJIFFI("extra", kVarLJJIIZ12);
            }
            k kVarLJJIIZ13 = nVarLJIILIIL2.LJJIIZ("effect_analyze_info");
            if (kVarLJJIIZ13 != null && (kVarLJJIIZ13 instanceof n)) {
                n nVarLJIILIIL3 = kVarLJJIIZ13.LJIILIIL();
                LIZ(nVarLJIILIIL3, "sdk_version");
                LIZIZ(nVarLJIILIIL3, nVarLJIILIIL2, "sdk_version", "sdk_version");
                LIZIZ(nVarLJIILIIL3, nVarLJIILIIL2, "sdk_extra", "sdk_extra");
                if (!nVarLJIILIIL2.LJJIJIIJIL("system_list") && (kVarLJJIIZ3 = nVarLJIILIIL3.LJJIIZ("system_list")) != null) {
                    if (kVarLJJIIZ3 instanceof q) {
                        h hVar3 = new h();
                        List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(kVarLJJIIZ3.LJIL(), new String[]{","}, 0, 6);
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL3, 10));
                        Iterator it6 = listLJJLIIIJILLIZJL3.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(a0.LJLIIIL((String) it6.next()).toString());
                        }
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : arrayList5) {
                            if (((String) obj5).length() > 0) {
                                arrayList6.add(obj5);
                            }
                        }
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            hVar3.LJJIII((String) it7.next());
                        }
                        nVarLJIILIIL2.LJJIFFI("system_list", hVar3);
                    } else {
                        nVarLJIILIIL2.LJJIFFI("system_list", kVarLJJIIZ3);
                    }
                }
            }
            LIZ(nVarLJIILIIL2, "sdk_version");
            LJI(nVarLJIILIIL2, "sdk_version");
            k kVarLJJIIZ14 = nVarLJIILIIL2.LJJIIZ("album_effect_info");
            if (kVarLJJIIZ14 != null && (kVarLJJIIZ14 instanceof n)) {
                n nVarLJIILIIL4 = kVarLJJIIZ14.LJIILIIL();
                LIZIZ(nVarLJIILIIL4, nVarLJIILIIL2, "parent", "parent");
                LIZIZ(nVarLJIILIIL4, nVarLJIILIIL2, "children", "children");
                LIZIZ(nVarLJIILIIL4, nVarLJIILIIL2, "effect_type", "effect_type");
            }
            k kVarLJJIIZ15 = nVarLJIILIIL2.LJJIIZ("nle_info");
            if (kVarLJJIIZ15 != null && (kVarLJJIIZ15 instanceof n)) {
                n nVarLJIILIIL5 = kVarLJJIIZ15.LJIILIIL();
                LIZ(nVarLJIILIIL5, "fragment_count");
                LIZIZ(nVarLJIILIIL5, nVarLJIILIIL2, "nle_summary", "nle_summary");
                LIZIZ(nVarLJIILIIL5, nVarLJIILIIL2, "fragment_count", "fragment_count");
                LIZIZ(nVarLJIILIIL5, nVarLJIILIIL2, "urs_list", "urs");
                LIZIZ(nVarLJIILIIL5, nVarLJIILIIL2, "nle_extra", "nle_extra");
            }
            LJI(nVarLJIILIIL2, "fragment_count");
            if (nVarLJIILIIL2.LJJIJIIJIL("music_url") && (kVarLJJIIZ2 = nVarLJIILIIL2.LJJIIZ("music_url")) != null && (kVarLJJIIZ2 instanceof q) && kVarLJJIIZ2.LJIL().length() > 0) {
                return;
            }
            k kVarLJJIIZ16 = nVarLJIILIIL2.LJJIIZ("template_music_info");
            if (kVarLJJIIZ16 != null && (kVarLJJIIZ16 instanceof n) && (nVarLJIILIIL = kVarLJJIIZ16.LJIILIIL()) != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("backup_music_url")) != null && (kVarLJJIIZ instanceof q) && kVarLJJIIZ.LJIL().length() > 0 && (strLJIL2 = kVarLJJIIZ.LJIL()) != null) {
                nVarLJIILIIL2.LJJIIJ("music_url", strLJIL2);
                return;
            }
            k kVarLJJIIZ17 = nVarLJIILIIL2.LJJIIZ("template_backup_music_url");
            if (kVarLJJIIZ17 != null && (kVarLJJIIZ17 instanceof q) && kVarLJJIIZ17.LJIL().length() > 0 && (strLJIL = kVarLJJIIZ17.LJIL()) != null) {
                nVarLJIILIIL2.LJJIIJ("music_url", strLJIL);
            }
        }
    }

    public static void LIZ(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof Number)) {
            nVar.LJJIIJ(str, kVarLJJIIZ.LJIL());
        }
    }

    public static void LJFF(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null) {
            return;
        }
        if (!(kVarLJJIIZ instanceof q)) {
            nVar.LJJIJL(str);
            return;
        }
        q qVarLJIILJJIL = kVarLJJIIZ.LJIILJJIL();
        Object obj = qVarLJIILJJIL.LL;
        if (!(obj instanceof Number)) {
            if (obj instanceof String) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(qVarLJIILJJIL.LJIL());
                if (lLJIILIIL != null) {
                    nVar.LJJIII(lLJIILIIL, str);
                    return;
                } else {
                    nVar.LJJIJL(str);
                    return;
                }
            }
            nVar.LJJIJL(str);
        }
    }

    public static void LJI(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null) {
            return;
        }
        if (!(kVarLJJIIZ instanceof q)) {
            nVar.LJJIIJ(str, kVarLJJIIZ.toString());
            return;
        }
        q qVarLJIILJJIL = kVarLJJIIZ.LJIILJJIL();
        Object obj = qVarLJIILJJIL.LL;
        if (!(obj instanceof String)) {
            if (obj instanceof Number) {
                nVar.LJJIIJ(str, kVarLJJIIZ.LJIL());
            } else if (obj instanceof Boolean) {
                nVar.LJJIIJ(str, String.valueOf(qVarLJIILJJIL.LJ()));
            } else {
                nVar.LJJIIJ(str, qVarLJIILJJIL.toString());
            }
        }
    }

    public static void LJIIIIZZ(n nVar, String str) {
        Object next;
        String string;
        String strLJIL;
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null) {
            return;
        }
        if (kVarLJJIIZ instanceof h) {
            k kVar = (k) C13LP.LJJJLIIL(kVarLJJIIZ.LJIIL());
            if (kVar != null && (kVar instanceof q) && (kVar.LJIILJJIL().LL instanceof String) && (strLJIL = kVar.LJIL()) != null) {
                nVar.LJJIIJ(str, strLJIL);
                return;
            } else {
                nVar.LJJIJL(str);
                return;
            }
        }
        if (!(kVarLJJIIZ instanceof q)) {
            return;
        }
        String strLJIL2 = kVarLJJIIZ.LJIL();
        if (!a0.LJJIIZI(strLJIL2, ",", false)) {
            return;
        }
        Iterator it2 = a0.LJJLIIIJILLIZJL(strLJIL2, new String[]{","}, 0, 6).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (a0.LJLIIIL((String) next).toString().length() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        nVar.LJJIIJ(str, string);
    }

    public static void LIZJ(n nVar, String str, String str2) {
        if (nVar.LJJIJIIJIL(str) && !nVar.LJJIJIIJIL(str2)) {
            nVar.LJJIFFI(str2, nVar.LJJIIZ(str));
        }
    }

    public static void LJII(n nVar, String str, String str2) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof h)) {
            k kVar = (k) C13LP.LJJJLIIL(kVarLJJIIZ.LJIIL());
            if (kVar != null && (kVar instanceof n)) {
                if (!nVar.LJJIJIIJIL(str2)) {
                    nVar.LJJIFFI(str2, kVar);
                    return;
                }
                return;
            }
            nVar.LJJIJL(str);
        }
    }

    public static void LIZIZ(n nVar, n nVar2, String str, String str2) {
        if (nVar.LJJIJIIJIL(str) && !nVar2.LJJIJIIJIL(str2)) {
            nVar2.LJJIFFI(str2, nVar.LJJIIZ(str));
        }
    }
}
