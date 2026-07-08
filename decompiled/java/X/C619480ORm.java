package X;

import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyTemplate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ORm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619480ORm {
    public static final C619480ORm LIZ = new C619480ORm();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(491));
    public static WeakReference<InterfaceC1541990qEH> LIZJ;
    public static boolean LIZLLL;

    public static boolean LIZJ() {
        return C619510ORp.LIZ || C621810OaB.LIZIZ;
    }

    public static String LIZ() {
        if (LIZJ()) {
            return (String) C2505809rs.LIZ.getValue();
        }
        for (CommentSurveyTemplate commentSurveyTemplate : C619500ORo.LIZ) {
            if (Intrinsics.LJFF(commentSurveyTemplate.id, "dislike_survey")) {
                return commentSurveyTemplate.schema;
            }
        }
        return null;
    }

    public static boolean LIZIZ() {
        String strLIZ = LIZ();
        if (strLIZ == null || strLIZ.length() <= 0) {
            return false;
        }
        return C2525209v0.LIZ || LIZJ();
    }

    public static void LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        C20684815ws.LJIILLIIL("dislike_creater_and_sound_panel_show", c2344009Gk.LIZ);
    }

    public static void LJ(Aweme aweme, String str, String str2) {
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("dislike_toast_click", c2344009Gk.LIZ);
    }

    public static void LJFF(Aweme aweme, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("dislike_toast_show", c2344009Gk.LIZ);
    }

    public static void LJI(Context context, Aweme aweme, String str, String str2, Function0 function0) {
        String strLJI;
        C619520ORq.LIZ.getClass();
        C619520ORq.LIZIZ = aweme;
        if (LIZJ()) {
            strLJI = (String) C2505609rq.LIZ.getValue();
        } else {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("pns_wtv_share_feedback_url", "aweme://lynxview_popup/?channel=ecosystem_content_templates&bundle=pages%2Fdislike_panel%2Ftemplate.js&use_spark=1&enable_prefetch=1&show_mask=1&transition_animation=bottom&show_loading=0&legacy_auto_popup=1&self_adaptive_height=1");
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLJI);
        LIZ.getClass();
        if (LIZJ()) {
            sparkContext.LJJ(C1543000qFu.class, new C620890OWx());
        }
        String aid = aweme.getAid();
        if (aid == null) {
            return;
        }
        sparkContext.LJJJZ("aweme_id", aid);
        if (str == null) {
            str = "";
        }
        sparkContext.LJJJZ("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        sparkContext.LJJJZ("enter_method", str2);
        sparkContext.LJJJJZI(new C639110P4z(function0, 3));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        if (LIZJ()) {
            LIZLLL(aweme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(Context context, final Aweme aweme, String str, final String str2, final String str3) {
        List<TextExtraStruct> textExtra;
        String lowerCase;
        String str4;
        final Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("dislike_toast_vibrate", true)) {
                new C0ZDN(context).LIZ(0);
            }
            final C1389910mGz c1389910mGz = new C1389910mGz(activityLIZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJIIJ(str);
            c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            c1389910mGz.LIZLLL(AFwS195S0000000_9.get$arr$(492));
            LIZ.getClass();
            if (LIZIZ()) {
                c1389910mGz.LIZ.LIZLLL = 2;
                c1389910mGz.LJFF(2131836313);
                c1389910mGz.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.0OMY
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws JSONException {
                        InterfaceC1541990qEH interfaceC1541990qEH;
                        InterfaceC1541990qEH interfaceC1541990qEH2;
                        C619480ORm c619480ORm = C619480ORm.LIZ;
                        Activity activity = activityLIZ;
                        c619480ORm.getClass();
                        C619480ORm.LIZ();
                        WeakReference<InterfaceC1541990qEH> weakReference = C619480ORm.LIZJ;
                        if (weakReference != null && (interfaceC1541990qEH2 = weakReference.get()) != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("dismiss_key", activity.getString(2131857752));
                            interfaceC1541990qEH2.LIZ("detailTapped", jSONObject);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("openDislikeDetailSchema view=");
                        WeakReference<InterfaceC1541990qEH> weakReference2 = C619480ORm.LIZJ;
                        if (weakReference2 != null) {
                            interfaceC1541990qEH = weakReference2.get();
                        } else {
                            interfaceC1541990qEH = null;
                        }
                        sbLIZ.append(interfaceC1541990qEH);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C619480ORm.LIZLLL(aweme);
                        C619480ORm.LJ(aweme, str2, str3);
                        C619480ORm.LIZLLL = true;
                        c1389910mGz.LIZJ();
                    }
                };
                String strLIZ = LIZ();
                if (strLIZ != null) {
                    C619520ORq.LIZ.getClass();
                    C619520ORq.LIZIZ = aweme;
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(strLIZ);
                    if (LIZJ()) {
                        sparkContext.LJJ(C1543000qFu.class, new C620890OWx());
                    }
                    sparkContext.LJJJZ("aweme_id", aweme.getAid());
                    if (str2 == null) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    sparkContext.LJJJZ("enter_from", str4);
                    String str5 = "";
                    if (str3 != 0) {
                        str5 = str3;
                    }
                    sparkContext.LJJJZ("enter_method", str5);
                    sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0ORn
                        @Override // X.AbstractC1537870q7d
                        public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str6, C1542120qEU c1542120qEU) {
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str6, String str7) {
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                            C619480ORm.LIZJ = new WeakReference<>(interfaceC1541990qEH);
                        }
                    });
                    c1537900q7g.getClass();
                    new C1541950qED(activityLIZ, sparkContext).LIZIZ();
                }
                LJFF(aweme, str2, str3);
            } else if (aweme != null && (textExtra = aweme.getTextExtra()) != null) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    if (textExtraStruct.getType() == 1) {
                        String[] strArrLIZ = C274580ApU.LIZ();
                        String hashTagName = textExtraStruct.getHashTagName();
                        if (hashTagName != null) {
                            lowerCase = hashTagName.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase = null;
                        }
                        if (C13LQ.LJJIJIIJI(lowerCase, strArrLIZ) < 0) {
                            c1389910mGz.LIZ.LIZLLL = 2;
                            c1389910mGz.LJFF(2131836313);
                            final C259800zU c259800zU = new C259800zU();
                            c259800zU.element = str3;
                            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "m_dislike_with_reason", false) == 1) {
                                c259800zU.element = "last_panel_submit";
                            }
                            c1389910mGz.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.0OLl
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
                                /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
                                /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    FragmentManager supportFragmentManager;
                                    ?? arrayList;
                                    String lowerCase2;
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                                    c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                                    c2344009Gk.LIZJ(aweme.getAuthor().getFollowStatus(), "follow_status");
                                    C20684815ws.LJIILLIIL("filter_hashtag_click_details", c2344009Gk.LIZ);
                                    C619480ORm c619480ORm = C619480ORm.LIZ;
                                    Aweme aweme2 = aweme;
                                    c619480ORm.getClass();
                                    C619480ORm.LIZLLL(aweme2);
                                    C619480ORm.LJ(aweme, str2, c259800zU.element);
                                    Activity activity = activityLIZ;
                                    Aweme aweme3 = aweme;
                                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                                        C616200OEw c616200OEw = new C616200OEw(C1388190mED.LIZ(activity), AFwS240S0000000_9.get$arr$(880), false);
                                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                                        c2344009Gk2.LJIIIIZZ("enter_from", "long_press_not_interested");
                                        C20684815ws.LJIILLIIL("enter_video_filter_kw", c2344009Gk2.LIZ);
                                        c616200OEw.setMAweme(aweme3);
                                        List<TextExtraStruct> textExtra2 = aweme3.getTextExtra();
                                        if (textExtra2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (TextExtraStruct textExtraStruct2 : textExtra2) {
                                                TextExtraStruct textExtraStruct3 = textExtraStruct2;
                                                if (textExtraStruct3.getType() == 1 && textExtraStruct3.getHashTagName() != null) {
                                                    String[] strArrLIZ2 = C274580ApU.LIZ();
                                                    String hashTagName2 = textExtraStruct3.getHashTagName();
                                                    if (hashTagName2 != null) {
                                                        lowerCase2 = hashTagName2.toLowerCase(Locale.ROOT);
                                                    } else {
                                                        lowerCase2 = null;
                                                    }
                                                    if (C13LQ.LJJIJIIJI(lowerCase2, strArrLIZ2) < 0) {
                                                        arrayList2.add(textExtraStruct2);
                                                    }
                                                }
                                            }
                                            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                            Iterator it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add(((TextExtraStruct) it2.next()).getHashTagName());
                                            }
                                        } else {
                                            arrayList = C13BV.INSTANCE;
                                        }
                                        C635500OwG mAdapter = c616200OEw.getMAdapter();
                                        mAdapter.getClass();
                                        for (String str6 : arrayList) {
                                            List<C617920OLm> list = mAdapter.LLILLJJLI;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append('#');
                                            sbLIZ.append(str6);
                                            ((ArrayList) list).add(new C617920OLm(C2188811AlT.LIZIZ(sbLIZ), 2));
                                        }
                                        HandlerHook.viewPost(c616200OEw.getHashtagsFromXml(), new ARunnableS109S0100000_9((Object) c616200OEw, 170));
                                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                                        C0OM1 c0om1 = new C0OM1();
                                        C1250250idj c1250250idj = new C1250250idj();
                                        c1250250idj.LIZJ = activity.getString(2131836306);
                                        c0om1.LIZJ = c1250250idj;
                                        C1251150ifB c1251150ifB = new C1251150ifB();
                                        C419910GdJ c419910GdJ = new C419910GdJ();
                                        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
                                        c1251150ifB.LIZLLL();
                                        c1251150ifB.LJ = c419910GdJ;
                                        c1251150ifB.LIZJ(new AwS403S0200000_2(aweme3, c616200OEw, 68));
                                        c0om1.LIZIZ(c1251150ifB);
                                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                                        tuxSheet.LLJJIJIL = c0om1;
                                        tuxSheet.LLJJJ = null;
                                        tuxSheet.LLJJIII = c616200OEw;
                                        c1390920mIc.LJIIIIZZ(1);
                                        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                                        tuxSheet2.LLJLILLLLZIIL = false;
                                        C1391850mK7.LIZIZ(tuxSheet2, "not_interested_reason_choose_nscreen");
                                        tuxSheet2.show(supportFragmentManager, "hashtag");
                                    }
                                    c1389910mGz.LIZJ();
                                }
                            };
                            C619480ORm c619480ORm = LIZ;
                            String str6 = (String) c259800zU.element;
                            c619480ORm.getClass();
                            LJFF(aweme, str2, str6);
                        }
                    }
                }
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LIZLLL = 3;
                c1360890lWB.LJ = null;
            } else {
                C1360890lWB c1360890lWB2 = c1389910mGz.LIZ;
                c1360890lWB2.LIZLLL = 3;
                c1360890lWB2.LJ = null;
            }
            C1391850mK7.LIZIZ(c1389910mGz, "not_interested_bottomwindow");
            c1389910mGz.LJIIJJI();
        }
    }
}
