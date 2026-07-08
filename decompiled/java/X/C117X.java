package X;

import Y.ACListenerS53S0201000_29;
import Y.ARunnableS30S0110000_11;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackFragment;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.117X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117X extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C117V> LL;
    public final Context LLILLJJLI;
    public final InterfaceC194502117s LLILLL;
    public boolean LLILZ;
    public final IAVPublishExtension.IAddHashTagCallback LLILZIL;
    public final HashTagMobHelper LLILZLL;
    public String LLIZ;
    public final VideoPublishEditModel LLIZLLLIL;
    public final KeyboardStateViewModel LLJ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C117V) ListProtector.get(this.LL, i)).LIZIZ;
    }

    public final void LLLI(int i, C117V c117v) {
        String queryId;
        String str;
        HashTagMobHelper hashTagMobHelper = this.LLILZLL;
        if (hashTagMobHelper != null) {
            Integer numValueOf = Integer.valueOf(i);
            String imprId = "";
            if (numValueOf != null) {
                numValueOf.intValue();
                AVChallenge aVChallenge = c117v.LIZ;
                if (aVChallenge == null || (str = aVChallenge.challengeName) == null) {
                    str = "";
                }
                hashTagMobHelper.AQ2(new C857430XkL(str, numValueOf, hashTagMobHelper.LLIZLLLIL, aVChallenge.cid, c117v.LJFF));
            }
            if (TextUtils.equals(c117v.LJFF, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.LLILZLL;
                Integer numValueOf2 = Integer.valueOf(i);
                hashTagMobHelper2.getClass();
                if (numValueOf2 != null) {
                    numValueOf2.intValue();
                    String str2 = c117v.LIZ.cid;
                    C736480Suk c736480Suk = new C736480Suk();
                    c736480Suk.LIZ("words_content", c117v.LIZ.challengeName);
                    c736480Suk.LIZ("words_position", numValueOf2.toString());
                    c736480Suk.LIZ("words_source", "sug");
                    c736480Suk.LIZ("search_position", "challenge_create");
                    c736480Suk.LIZ("raw_query", hashTagMobHelper2.LLILZ);
                    c736480Suk.LIZ("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.LLILLL;
                    if (recommendWordMob != null) {
                        queryId = recommendWordMob.getQueryId();
                    } else {
                        queryId = null;
                    }
                    c736480Suk.LIZ("query_id", queryId);
                    c736480Suk.LIZ("group_id", str2);
                    LogPbBean logPbBean = hashTagMobHelper2.LLILLJJLI;
                    if (logPbBean != null) {
                        imprId = logPbBean.getImprId();
                    }
                    c736480Suk.LIZ("impr_id", imprId);
                    C20684815ws.LJIJ("trending_words_show", c736480Suk.LIZIZ());
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C117V c117v;
        String quantityString;
        int i2;
        int i3;
        if (i >= 0 && i < this.LL.size()) {
            c117v = (C117V) ListProtector.get(this.LL, i);
        } else {
            c117v = null;
        }
        String strLIZIZ = "";
        if ((viewHolder instanceof C194484117a) && c117v != null) {
            String challengeName = c117v.LIZ.getChallengeName();
            if (challengeName == null) {
                challengeName = "";
            }
            if (!challengeName.startsWith("#")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("#");
                sbLIZ.append(challengeName);
                challengeName = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (TextUtils.equals(c117v.LJFF, "search")) {
                strLIZIZ = "search_hashtag";
            } else if (TextUtils.equals(c117v.LJFF, "history")) {
                strLIZIZ = "history_hashtag";
            } else if (TextUtils.equals(c117v.LJFF, "recommendation")) {
                strLIZIZ = "thumb_up_hashtag";
            }
            C194484117a c194484117a = (C194484117a) viewHolder;
            final boolean zLJIIIZ = AVCommerceServiceImpl.LJIIJ().LJIIIZ(this.LLILLJJLI, challengeName, c194484117a.LL, Boolean.TRUE, strLIZIZ);
            AVChallenge aVChallenge = c117v.LIZ;
            String str = this.LLIZ;
            if (i == 0 && aVChallenge.isNew(str)) {
                c194484117a.LLILZ.setText(2131847148);
                c194484117a.LLILZ.setTextColor(C1308910kAL.LIZJ(R.attr.a00, c194484117a.LLIZ).intValue());
            } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_hashtag_style", true) == 2) {
                C786410Ut5.LLIL(c194484117a.LLILZ, 8);
            } else {
                TextView textView = c194484117a.LLILZ;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_hashtag_style", true) == 1) {
                    quantityString = c194484117a.LLILZ.getResources().getQuantityString(2131755368, (int) aVChallenge.getPostCount(), C1843500y4a.LIZIZ(aVChallenge.getPostCount()));
                } else {
                    quantityString = c194484117a.LLILZ.getResources().getQuantityString(2131755369, (int) aVChallenge.getViewCount(), C1843500y4a.LIZIZ(aVChallenge.getViewCount()));
                }
                textView.setText(quantityString);
                c194484117a.LLILZ.setTextColor(C1308910kAL.LIZJ(R.attr.a1k, c194484117a.LLIZ).intValue());
            }
            TextView textView2 = c194484117a.LLILZ;
            if (!c117v.LIZLLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLIL(textView2, i2);
            C786410Ut5.LJZI(4, c194484117a.LLILZLL);
            int i4 = c117v.LIZJ;
            ImageView imageView = c194484117a.LLILLJJLI;
            if (this.LLILZ && i4 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJZI(i3, imageView);
            if (i4 > 0) {
                c194484117a.LLILLJJLI.setImageResource(i4);
            }
            if (c117v.LIZ.chaType == 1) {
                C786410Ut5.LLLLLLZZ(c194484117a.LLILLL, 0);
            } else {
                C786410Ut5.LLLLLLZZ(c194484117a.LLILLL, 8);
            }
            final String str2 = strLIZIZ;
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.117f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LLILZIL.LLLFZ(c117v, i, zLJIIIZ, str2);
                }
            }, viewHolder.itemView);
            RecommendHashTagData.AdData adData = c117v.LJ;
            if (adData != null) {
                Context context = this.LLILLJJLI;
                HashMap map = new HashMap();
                int i5 = i + 1;
                map.put("topic_order", Integer.valueOf(i5));
                C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                c1020020ceOLIZ.LIZ = "launch_ad";
                c1020020ceOLIZ.LIZIZ = "show";
                c1020020ceOLIZ.LJIIIZ("topic");
                c1020020ceOLIZ.LJIIIIZZ(adData.logExtra);
                c1020020ceOLIZ.LIZLLL(Long.valueOf(adData.creativeId));
                c1020020ceOLIZ.LIZ(map);
                c1020020ceOLIZ.LJIIJ(context);
                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("launch_ad", "show", String.valueOf(adData.creativeId), adData.logExtra, CardStruct.IStatusCode.DEFAULT);
                c1022820ciuLJ.LIZJ("topic", "refer");
                c1022820ciuLJ.LIZIZ(Integer.valueOf(i5), "topic_order");
                c1022820ciuLJ.LJIIIIZZ();
            }
            if (c117v.LIZIZ == 2) {
                C194484117a c194484117a2 = (C194484117a) viewHolder;
                c194484117a2.LLILZIL.setOnTouchListener(new ATListenerS461S0100000_29(viewHolder, 25));
                final LinearLayout linearLayout = c194484117a2.LLILZIL;
                final KeyboardStateViewModel keyboardStateViewModel = this.LLJ;
                final HashTagMobHelper hashTagMobHelper = this.LLILZLL;
                linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.116o
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        FeedbackOptionValue[] feedbackOptionValueArr;
                        String str3;
                        String str4;
                        String str5;
                        boolean zBooleanValue;
                        C194475116r.LIZ.getClass();
                        HashtagFeedbackValue hashtagFeedbackValueLIZ = C194475116r.LIZ();
                        List<AVChallenge> list = null;
                        if (hashtagFeedbackValueLIZ != null) {
                            feedbackOptionValueArr = hashtagFeedbackValueLIZ.feedbackOptionValues;
                        } else {
                            feedbackOptionValueArr = null;
                        }
                        if (feedbackOptionValueArr != null && feedbackOptionValueArr.length != 0) {
                            C112C.LIZ.getClass();
                            if (!C112C.LJII) {
                                C117V c117v2 = c117v;
                                if (c117v2.LJI) {
                                    HashTagMobHelper hashTagMobHelper2 = hashTagMobHelper;
                                    if (hashTagMobHelper2 != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            String str6 = hashTagMobHelper2.LL;
                                            String str7 = "";
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            jSONObject.put("creation_id", str6);
                                            AVChallenge aVChallenge2 = c117v2.LIZ;
                                            if (aVChallenge2 == null || (str3 = aVChallenge2.challengeName) == null) {
                                                str3 = "";
                                            }
                                            jSONObject.put("hashtag", str3);
                                            AVChallenge aVChallenge3 = c117v2.LIZ;
                                            if (aVChallenge3 == null || (str4 = aVChallenge3.queryId) == null) {
                                                str4 = "";
                                            }
                                            jSONObject.put("query_id", str4);
                                            SearchRecommendChallengeList searchRecommendChallengeList = C112C.LJIIJ;
                                            if (searchRecommendChallengeList != null) {
                                                list = searchRecommendChallengeList.items;
                                            }
                                            jSONObject.put("hashtag_list", HashTagMobHelper.vQ2(list));
                                            AVChallenge aVChallenge4 = c117v2.LIZ;
                                            if (aVChallenge4 == null || (str5 = aVChallenge4.logId) == null) {
                                                str5 = "";
                                            }
                                            jSONObject.put("log_id", str5);
                                            jSONObject.put("feedback_cnt", String.valueOf(C112C.LJI));
                                            C1403010mc7.LIZ.getMusicService().al();
                                            String strLIZIZ2 = C2275708vr.LIZIZ();
                                            if (strLIZIZ2 != null) {
                                                str7 = strLIZIZ2;
                                            }
                                            jSONObject.put("tos_key", str7);
                                            C20684815ws.LJIJ("hashtag_recommendation_feedback_page_show", jSONObject);
                                        } catch (ClassCastException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        } catch (NullPointerException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                        }
                                    }
                                    KeyboardStateViewModel keyboardStateViewModel2 = keyboardStateViewModel;
                                    if (keyboardStateViewModel2 != null) {
                                        keyboardStateViewModel2.runOnUiThread(new ARunnableS30S0110000_11(keyboardStateViewModel2, 9));
                                    }
                                    KeyboardStateViewModel keyboardStateViewModel3 = keyboardStateViewModel;
                                    if (keyboardStateViewModel3 != null) {
                                        Boolean value = keyboardStateViewModel3.LL.getValue();
                                        if (value != null) {
                                            zBooleanValue = value.booleanValue();
                                        } else {
                                            zBooleanValue = false;
                                        }
                                        keyboardStateViewModel3.LLILZIL = zBooleanValue;
                                    }
                                    final HashtagFeedbackFragment hashtagFeedbackFragment = new HashtagFeedbackFragment();
                                    hashtagFeedbackFragment.LLIZ = hashTagMobHelper;
                                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                                    c1390920mIc.LIZ.LLJLILLLLZIIL = true;
                                    c1390920mIc.LJIIIIZZ(1);
                                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                                    tuxSheet.LLJJIJI = hashtagFeedbackFragment;
                                    tuxSheet.LLJJIJIIJIL = true;
                                    c1390920mIc.LJI(16);
                                    final HashTagMobHelper hashTagMobHelper3 = hashTagMobHelper;
                                    final C117V c117v3 = c117v;
                                    final KeyboardStateViewModel keyboardStateViewModel4 = keyboardStateViewModel;
                                    DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.116q
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            Object obj;
                                            String str8;
                                            String str9;
                                            List<AVChallenge> list2;
                                            String str10;
                                            AVChallenge aVChallenge5;
                                            AVChallenge aVChallenge6;
                                            AVChallenge aVChallenge7;
                                            String str11 = TuxSheet._pnsPageId;
                                            AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                                            HashTagMobHelper hashTagMobHelper4 = hashTagMobHelper3;
                                            if (hashTagMobHelper4 != null) {
                                                String str12 = hashtagFeedbackFragment.LLILZLL;
                                                boolean zLJFF = Intrinsics.LJFF(abstractC343940De4LJIIJJI, C194476116s.LIZ);
                                                HashtagFeedbackFragment hashtagFeedbackFragment2 = hashtagFeedbackFragment;
                                                String str13 = "";
                                                Object orDefault = ((LinkedHashMap) hashtagFeedbackFragment2.MR().LL).getOrDefault(hashtagFeedbackFragment2.LLILZLL, "");
                                                C117V c117v4 = c117v3;
                                                try {
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    String str14 = hashTagMobHelper4.LL;
                                                    if (str14 == null) {
                                                        str14 = "";
                                                    }
                                                    jSONObject2.put("creation_id", str14);
                                                    jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str12);
                                                    String str15 = "1";
                                                    if (zLJFF) {
                                                        obj = "1";
                                                    } else {
                                                        obj = CardStruct.IStatusCode.DEFAULT;
                                                    }
                                                    jSONObject2.put("is_submit_feedback", obj);
                                                    if (orDefault == null) {
                                                        orDefault = "";
                                                    }
                                                    jSONObject2.put("feedback_detail", orDefault);
                                                    if (c117v4 == null || c117v4.LIZ.chaType != 1) {
                                                        str15 = CardStruct.IStatusCode.DEFAULT;
                                                    }
                                                    jSONObject2.put("is_hashtag_history", str15);
                                                    if (c117v4 == null || (aVChallenge7 = c117v4.LIZ) == null || (str8 = aVChallenge7.challengeName) == null) {
                                                        str8 = "";
                                                    }
                                                    jSONObject2.put("hashtag", str8);
                                                    if (c117v4 == null || (aVChallenge6 = c117v4.LIZ) == null || (str9 = aVChallenge6.queryId) == null) {
                                                        str9 = "";
                                                    }
                                                    jSONObject2.put("query_id", str9);
                                                    SearchRecommendChallengeList searchRecommendChallengeList2 = C112C.LJIIJ;
                                                    if (searchRecommendChallengeList2 != null) {
                                                        list2 = searchRecommendChallengeList2.items;
                                                    } else {
                                                        list2 = null;
                                                    }
                                                    jSONObject2.put("hashtag_list", HashTagMobHelper.vQ2(list2));
                                                    if (c117v4 == null || (aVChallenge5 = c117v4.LIZ) == null || (str10 = aVChallenge5.logId) == null) {
                                                        str10 = "";
                                                    }
                                                    jSONObject2.put("log_id", str10);
                                                    C112C.LIZ.getClass();
                                                    jSONObject2.put("feedback_cnt", String.valueOf(C112C.LJI));
                                                    C1403010mc7.LIZ.getMusicService().al();
                                                    String strLIZIZ3 = C2275708vr.LIZIZ();
                                                    if (strLIZIZ3 != null) {
                                                        str13 = strLIZIZ3;
                                                    }
                                                    jSONObject2.put("tos_key", str13);
                                                    C20684815ws.LJIJ("hashtag_recommendation_feedback_result", jSONObject2);
                                                } catch (ClassCastException e4) {
                                                    TryCatchGuardChecker.doCheck(e4);
                                                } catch (NullPointerException e5) {
                                                    TryCatchGuardChecker.doCheck(e5);
                                                } catch (Exception e6) {
                                                    TryCatchGuardChecker.doCheck(e6);
                                                }
                                            }
                                            if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C194476116s.LIZ)) {
                                                C112C.LIZ.getClass();
                                                C112C.LJI++;
                                            }
                                            KeyboardStateViewModel keyboardStateViewModel5 = keyboardStateViewModel4;
                                            if (keyboardStateViewModel5 != null) {
                                                keyboardStateViewModel5.runOnUiThread(new ARunnableS30S0110000_11(keyboardStateViewModel5, keyboardStateViewModel5.LLILZIL, 10));
                                            }
                                            C112C.LIZ.getClass();
                                            C112C.LJII = false;
                                        }
                                    };
                                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                                    tuxSheet2.LLILLJJLI = onDismissListener;
                                    FragmentManager fragmentManagerLJIIJ = C20622515mp.LJIIJ(linearLayout);
                                    if (fragmentManagerLJIIJ != null) {
                                        tuxSheet2.show(fragmentManagerLJIIJ, "hashtag_feedback");
                                        C112C.LIZ.getClass();
                                        C112C.LJII = true;
                                        return true;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                });
            }
            LLLI(i, c117v);
            return;
        }
        if (!(viewHolder instanceof C194492117i) || c117v == null) {
            return;
        }
        String challengeName2 = c117v.LIZ.getChallengeName();
        if (challengeName2 != null) {
            strLIZIZ = challengeName2;
        }
        if (!strLIZIZ.startsWith("#")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("#");
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C194491117h c194491117h = (C194491117h) viewHolder;
        ((C03BD) c194491117h.LL).setTagName(strLIZIZ);
        View view = c194491117h.LL;
        View.OnClickListener aCListenerS53S0201000_29 = new ACListenerS53S0201000_29(c117v, i, this, 3);
        if (C1848410yCV.LIZ) {
            aCListenerS53S0201000_29 = new f(aCListenerS53S0201000_29);
        }
        a aVar = new a(aCListenerS53S0201000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(view);
        }
        view.setOnClickListener(aVar);
        LLLI(i, c117v);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(7:6|7|30|15|(4:17|32|18|(3:20|23|(1:25)))|28|29)(1:8))(1:9)|34|10|(1:12)|7|30|15|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.lang.String r4 = "onCreateViewHolder getParent() != null crash hook, holder "
            r0 = 2
            if (r7 == r0) goto L27
            r0 = 3
            if (r7 == r0) goto L1a
            r2 = 0
        L9:
            android.view.View r3 = r2.itemView
            int r0 = r6.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131395481(0x7f0a8399, float:1.8411676E38)
            r3.setTag(r0, r1)
            goto L50
        L1a:
            X.117i r2 = new X.117i
            X.03BD r1 = new X.03BD
            android.content.Context r0 = r5.LLILLJJLI
            r1.<init>(r0)
            r2.<init>(r1)
            goto L3c
        L27:
            X.117a r2 = new X.117a
            android.content.Context r0 = r5.LLILLJJLI
            android.view.LayoutInflater r3 = X.C786410Ut5.ne(r0)
            r1 = 2131563120(0x7f0d1270, float:1.8751688E38)
            r0 = 0
            android.view.View r1 = X.C786410Ut5.Td(r3, r1, r6, r0)
            android.content.Context r0 = r5.LLILLJJLI
            r2.<init>(r0, r1)
        L3c:
            android.view.View r3 = r2.itemView     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9
            androidx.fragment.app.Fragment r1 = X.C946803n0.LIZ(r6)     // Catch: java.lang.Throwable -> L4b
            r0 = 2131368321(0x7f0a1981, float:1.8356589E38)
            r3.setTag(r0, r1)     // Catch: java.lang.Throwable -> L4b
            goto L9
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L9
        L50:
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lac
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto Lb6
            r3 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "catch_onCreateViewHolder_crash"
            r1.getClass()     // Catch: java.lang.Exception -> L69
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto Lb6
            goto L6d
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Lac
        L6d:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lac
            r1.<init>(r4)     // Catch: java.lang.Exception -> Lac
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lac
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = " parent "
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lac
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = " viewType "
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            r1.append(r7)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lac
            X.C1AF0.LIZJ(r0)     // Catch: java.lang.Exception -> Lac
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lac
            android.view.ViewParent r1 = r0.getParent()     // Catch: java.lang.Exception -> Lac
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto Lb6
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lac
            X.C786410Ut5.LJJJLZIJ(r0, r1)     // Catch: java.lang.Exception -> Lac
            goto Lb6
        Lac:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C2081408Dk.LIZ(r0)
            X.C2344809Gs.LIZ(r0)
        Lb6:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            X.C20612085q.LIZ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117X.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final void LLLFZ(C117V c117v, int i, boolean z, String str) {
        String imprId;
        if (z) {
            AVCommerceServiceImpl.LJIIJ().LIZIZ(str, c117v.LIZ.challengeName);
        }
        InterfaceC194502117s interfaceC194502117s = this.LLILLL;
        String queryId = null;
        if (interfaceC194502117s != null) {
            AVChallenge aVChallenge = c117v.LIZ;
            C117U c117u = (C117U) interfaceC194502117s;
            c117u.LIZJ();
            c117u.LLJJIII = false;
            C0ZI0 c0zi0 = c117u.LLJI.LIZIZ;
            int selectionStart = c0zi0.getSelectionStart();
            if (C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)) != null) {
                String strSubstring = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)).toString().substring(0, selectionStart);
                if (C856940XjY.LIZJ(strSubstring) || strSubstring.endsWith("#")) {
                    C857030Xjh c857030XjhLIZIZ = C856940XjY.LIZIZ(strSubstring, aVChallenge.getChallengeName());
                    if (c857030XjhLIZIZ.LIZJ != null) {
                        try {
                            C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)).replace(strSubstring.lastIndexOf("#"), selectionStart, c857030XjhLIZIZ.LIZJ);
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c0zi0.LJJJI(true);
                        String strTrim = c857030XjhLIZIZ.LIZJ.trim();
                        if (!C856940XjY.LIZJ(strTrim)) {
                            ((HashSet) c0zi0.LLJLILLLLZIIL).add(strTrim);
                        }
                    }
                }
            }
        }
        RecommendHashTagData.AdData adData = c117v.LJ;
        if (adData != null) {
            Context context = this.LLILLJJLI;
            HashMap map = new HashMap();
            int i2 = i + 1;
            map.put("topic_order", Integer.valueOf(i2));
            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
            c1020020ceOLIZ.LIZ = "launch_ad";
            c1020020ceOLIZ.LIZIZ = "click";
            c1020020ceOLIZ.LJIIIZ("topic");
            c1020020ceOLIZ.LJIIIIZZ(adData.logExtra);
            c1020020ceOLIZ.LIZLLL(Long.valueOf(adData.creativeId));
            c1020020ceOLIZ.LIZ(map);
            c1020020ceOLIZ.LJIIJ(context);
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("launch_ad", "click", String.valueOf(adData.creativeId), adData.logExtra, CardStruct.IStatusCode.DEFAULT);
            c1022820ciuLJ.LIZJ("topic", "refer");
            c1022820ciuLJ.LIZIZ(Integer.valueOf(i2), "topic_order");
            c1022820ciuLJ.LJIIIIZZ();
        }
        HashTagMobHelper hashTagMobHelper = this.LLILZLL;
        if (hashTagMobHelper != null) {
            hashTagMobHelper.xQ2("click_tag_button", c117v, Integer.valueOf(i), null, this.LLIZLLLIL, ((C117U) this.LLILLL).LLJL);
            if (TextUtils.equals(c117v.LJFF, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.LLILZLL;
                Integer numValueOf = Integer.valueOf(i);
                hashTagMobHelper2.getClass();
                if (numValueOf != null) {
                    numValueOf.intValue();
                    String str2 = c117v.LIZ.cid;
                    C736480Suk c736480Suk = new C736480Suk();
                    c736480Suk.LIZ("words_content", c117v.LIZ.challengeName);
                    c736480Suk.LIZ("words_position", numValueOf.toString());
                    c736480Suk.LIZ("words_source", "sug");
                    c736480Suk.LIZ("search_position", "challenge_create");
                    c736480Suk.LIZ("raw_query", hashTagMobHelper2.LLILZ);
                    c736480Suk.LIZ("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.LLILLL;
                    if (recommendWordMob != null) {
                        queryId = recommendWordMob.getQueryId();
                    }
                    c736480Suk.LIZ("query_id", queryId);
                    c736480Suk.LIZ("group_id", str2);
                    LogPbBean logPbBean = hashTagMobHelper2.LLILLJJLI;
                    if (logPbBean == null) {
                        imprId = "";
                    } else {
                        imprId = logPbBean.getImprId();
                    }
                    c736480Suk.LIZ("impr_id", imprId);
                    C20684815ws.LJIJ("trending_words_click", c736480Suk.LIZIZ());
                }
            }
            BaseTitleHelper baseTitleHelper = this.LLILZLL.LLILZIL;
            if (baseTitleHelper != null) {
                this.LLILZIL.onHashTagUpdate(baseTitleHelper.LL);
            }
        }
    }

    public C117X(Scene scene, List list, InterfaceC194502117s interfaceC194502117s, VideoPublishEditModel videoPublishEditModel, KeyboardStateViewModel keyboardStateViewModel, IAVPublishExtension.IAddHashTagCallback iAddHashTagCallback) {
        this.LLILZLL = (HashTagMobHelper) C1659630tI1.LJFF(scene).get(HashTagMobHelper.class);
        this.LLIZLLLIL = videoPublishEditModel;
        this.LL = list;
        this.LLILLJJLI = scene.requireActivity();
        this.LLILLL = interfaceC194502117s;
        this.LLILZIL = iAddHashTagCallback;
        this.LLJ = keyboardStateViewModel;
    }
}
