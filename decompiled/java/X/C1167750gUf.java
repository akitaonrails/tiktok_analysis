package X;

import Y.AfS68S0201000_18;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0gUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167750gUf {
    public static MixListResponse LIZIZ;
    public static final C1167750gUf LIZ = new C1167750gUf();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static boolean LIZLLL() {
        return Keva.getRepo("keva_mixlist_repo_name").getInt(LIZIZ(), 0) <= 0;
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_mixlist_num_key");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(e3.e);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            sb.append((String) it2.next());
            if (i != arrayList.size() - 1) {
                sb.append(",");
            } else {
                sb.append(e3.f);
            }
            i = i2;
        }
        return sb.toString();
    }

    public static void LJ(int i) {
        Keva.getRepo("keva_mixlist_repo_name").storeInt(LIZIZ(), i);
    }

    public static void LIZ(final Activity activity, final Aweme aweme, final String str, final int i, final InterfaceC1167780gUi interfaceC1167780gUi, final String str2, final String str3, final boolean z) {
        String aid;
        String aid2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i == EnumC1163900gOS.VIDEOADD.getOperation()) {
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                arrayList.add(aid2);
            }
        } else if (i == EnumC1163900gOS.VIDEOREMOVE.getOperation() && aweme != null && (aid = aweme.getAid()) != null) {
            arrayList2.add(aid);
        }
        MixFeedApi.LIZ.getClass();
        C1169360gXG.LIZ().manageMixFeed(i, str, "", LIZJ(arrayList), LIZJ(arrayList2), "", null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0gUg
            @Override // X.C09JN
            public final void accept(Object obj) {
                int i2;
                String str4;
                C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.addOrRemoveVideoToMix$result$1");
                int i3 = 0;
                if (((BaseResponse) obj).status_code == 0) {
                    if (i == EnumC1163900gOS.VIDEOADD.getOperation()) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJIIIZ(2131825169);
                        c1389890mGx.LJIIJJI();
                        interfaceC1167780gUi.LIZIZ(true);
                        if (z) {
                            str4 = "create";
                        } else {
                            str4 = "add";
                        }
                        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                        String str5 = str2;
                        String str6 = str3;
                        String str7 = str;
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                        Aweme aweme2 = aweme;
                        if (aweme2 != null && aweme2.isSubOnlyVideo()) {
                            i3 = 1;
                        }
                        Integer numValueOf = Integer.valueOf(i3);
                        c1169160gWw.getClass();
                        C1169160gWw.LJII(str5, str6, str7, 1, numValueOf, null, 0, str4, strLJJLIIIJ);
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                        c1389890mGx2.LJIIIZ(2131850546);
                        c1389890mGx2.LJIIJJI();
                        C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
                        String str8 = str2;
                        String str9 = str3;
                        String str10 = str;
                        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                        Aweme aweme3 = aweme;
                        if (aweme3 != null && aweme3.isSubOnlyVideo()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(i2);
                        c1169160gWw2.getClass();
                        C1169160gWw.LJIJJLI(str8, str9, str10, strLJJLIIIJ2, 1, numValueOf2, null, 0);
                        if (activity instanceof MixVideoDetailActivity) {
                            C1440005kM.LIZ(new C739260SzE(aweme, null, false));
                            C1440005kM.LIZ(new C1167770gUh(aweme, str));
                        } else {
                            interfaceC1167780gUi.LIZ(true);
                            C1440005kM.LIZ(new C1167710gUb());
                        }
                    }
                } else if (i == EnumC1163900gOS.VIDEOADD.getOperation()) {
                    interfaceC1167780gUi.LIZIZ(false);
                } else {
                    interfaceC1167780gUi.LIZ(false);
                }
                C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.addOrRemoveVideoToMix$result$1");
            }
        }, new AfS68S0201000_18(i, interfaceC1167780gUi, activity, 0));
    }
}
