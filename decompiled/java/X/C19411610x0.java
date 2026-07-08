package X;

import Y.ACListenerS53S0201000_29;
import Y.AObjectS298S0200000_29;
import Y.ARunnableS30S0110000_11;
import Y.ATListenerS461S0100000_29;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackFragment;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS663S0100000_14;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19411610x0 extends AbstractC19412910xD<RecommendHashtag> {
    public final InterfaceC1631620sYq<Integer, Integer, RecommendHashtag, Unit> LLJI;
    public final Function2<Integer, RecommendHashtag, Unit> LLJIJIL;
    public final ViewModelStoreOwner LLJILJIL;
    public List<String> LLJILJILJ;
    public final List<String> LLJILLL = new ArrayList();
    public String LLJJ = "";
    public final List<RecommendHashtag> LLJJI = new ArrayList();
    public RecyclerView LLJJIII;

    public final int LLLFZ(String str) {
        List<String> list = this.LLJILJILJ;
        if (list != null && list.contains(str)) {
            List<String> list2 = this.LLJILJILJ;
            if (list2 != null) {
                return list2.indexOf(str);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C0CHQ.LIZ().isDebugConfigOpen();
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getOriginRank error, cachedData: ");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", item: ");
        sbLIZ.append(str);
        c1437510nVlLJJLIIIJ.LIZ("RECOMMEND_HASHTAG", C2188811AlT.LIZIZ(sbLIZ));
        return -1;
    }

    public final void LLLI(String str) {
        int iLLLFZ;
        if (!((ArrayList) this.LLJILLL).contains(str) && (iLLLFZ = LLLFZ(str)) != -1 && ((ArrayList) this.LLJJI).size() > iLLLFZ) {
            ((ArrayList) this.LLJILLL).add(str);
            Function2<Integer, RecommendHashtag, Unit> function2 = this.LLJIJIL;
            Integer numValueOf = Integer.valueOf(iLLLFZ);
            Object obj = ListProtector.get(this.LLJJI, iLLLFZ);
            ((RecommendHashtag) obj).setLogId(this.LLJJ);
            function2.invoke(numValueOf, (RecommendHashtag) obj);
        }
    }

    @Override // X.AbstractC19412510x9, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJJIII = recyclerView;
    }

    public final void setData(List<RecommendHashtag> list) {
        ((ArrayList) this.LLJJI).addAll(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<RecommendHashtag> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getChallengeName());
        }
        this.LLJILJILJ = arrayList;
        C0CNO.LIZLLL(0L, new AObjectS298S0200000_29(this, list, 1));
    }

    @Override // X.AbstractC19412410x8
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C19394610uG) {
            final C19394610uG c19394610uG = (C19394610uG) viewHolder;
            int iLLLFZ = LLLFZ(((RecommendHashtag) ListProtector.get(this.LLIZLLLIL, i)).getChallengeName());
            final RecommendHashtag recommendHashtag = (RecommendHashtag) ListProtector.get(this.LLIZLLLIL, i);
            final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 823);
            c19394610uG.LLILLL = (HashTagMobHelper) C1659630tI1.LJIIIIZZ((Scene) c19394610uG.LLILLJJLI, null, null, 6).get(HashTagMobHelper.class);
            String challengeName = recommendHashtag.getChallengeName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(challengeName);
            ((TextView) c19394610uG.itemView.findViewById(R.id.dmz)).setText(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.I7(new ACListenerS53S0201000_29(c19394610uG, iLLLFZ, recommendHashtag, 4), c19394610uG.itemView);
            c19394610uG.itemView.setOnTouchListener(new ATListenerS461S0100000_29(c19394610uG, 26));
            c19394610uG.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.116n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    FeedbackOptionValue[] feedbackOptionValueArr;
                    boolean zBooleanValue;
                    String challengeName2;
                    String queryId;
                    String logId;
                    C194475116r.LIZ.getClass();
                    HashtagFeedbackValue hashtagFeedbackValueLIZ = C194475116r.LIZ();
                    List<RecommendHashtag> list = null;
                    if (hashtagFeedbackValueLIZ != null) {
                        feedbackOptionValueArr = hashtagFeedbackValueLIZ.feedbackOptionValues;
                    } else {
                        feedbackOptionValueArr = null;
                    }
                    if (feedbackOptionValueArr != null && feedbackOptionValueArr.length != 0) {
                        C112C.LIZ.getClass();
                        if (!C112C.LJII) {
                            HashTagMobHelper hashTagMobHelper = c19394610uG.LLILLL;
                            if (hashTagMobHelper != null) {
                                RecommendHashtag recommendHashtag2 = recommendHashtag;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    String str = hashTagMobHelper.LL;
                                    String str2 = "";
                                    if (str == null) {
                                        str = "";
                                    }
                                    jSONObject.put("creation_id", str);
                                    if (recommendHashtag2 == null || (challengeName2 = recommendHashtag2.getChallengeName()) == null) {
                                        challengeName2 = "";
                                    }
                                    jSONObject.put("hashtag", challengeName2);
                                    if (recommendHashtag2 == null || (queryId = recommendHashtag2.getQueryId()) == null) {
                                        queryId = "";
                                    }
                                    jSONObject.put("query_id", queryId);
                                    RecommendHashtagResponse recommendHashtagResponse = C112C.LJIIIZ;
                                    if (recommendHashtagResponse != null) {
                                        list = recommendHashtagResponse.items;
                                    }
                                    jSONObject.put("hashtag_list", HashTagMobHelper.wQ2(list));
                                    if (recommendHashtag2 == null || (logId = recommendHashtag2.getLogId()) == null) {
                                        logId = "";
                                    }
                                    jSONObject.put("log_id", logId);
                                    jSONObject.put("feedback_cnt", String.valueOf(C112C.LJI));
                                    C1403010mc7.LIZ.getMusicService().al();
                                    String strLIZIZ = C2275708vr.LIZIZ();
                                    if (strLIZIZ != null) {
                                        str2 = strLIZIZ;
                                    }
                                    jSONObject.put("tos_key", str2);
                                    C20684815ws.LJIJ("hashtag_recommendation_feedback_page_show", jSONObject);
                                } catch (ClassCastException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                } catch (NullPointerException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                            KeyboardStateViewModel keyboardStateViewModel = c19394610uG.LLILZ;
                            if (keyboardStateViewModel != null) {
                                Boolean value = keyboardStateViewModel.LL.getValue();
                                if (value != null) {
                                    zBooleanValue = value.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                keyboardStateViewModel.LLILZIL = zBooleanValue;
                            }
                            final HashtagFeedbackFragment hashtagFeedbackFragment = new HashtagFeedbackFragment();
                            hashtagFeedbackFragment.LLIZ = c19394610uG.LLILLL;
                            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                            c1390920mIc.LIZ.LLJLILLLLZIIL = true;
                            c1390920mIc.LJIIIIZZ(1);
                            TuxSheet tuxSheet = c1390920mIc.LIZ;
                            tuxSheet.LLJJIJI = hashtagFeedbackFragment;
                            tuxSheet.LLJJIJIIJIL = true;
                            c1390920mIc.LJI(16);
                            final C19394610uG c19394610uG2 = c19394610uG;
                            final RecommendHashtag recommendHashtag3 = recommendHashtag;
                            final Function1<Integer, Unit> function1 = awS608S0100000_29;
                            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.116p
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    String str3;
                                    String challengeName3;
                                    String queryId2;
                                    List<RecommendHashtag> list2;
                                    String logId2;
                                    String str4 = TuxSheet._pnsPageId;
                                    AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                                    HashTagMobHelper hashTagMobHelper2 = c19394610uG2.LLILLL;
                                    if (hashTagMobHelper2 != null) {
                                        String str5 = hashtagFeedbackFragment.LLILZLL;
                                        boolean zLJFF = Intrinsics.LJFF(abstractC343940De4LJIIJJI, C194476116s.LIZ);
                                        HashtagFeedbackFragment hashtagFeedbackFragment2 = hashtagFeedbackFragment;
                                        String str6 = "";
                                        Object orDefault = ((LinkedHashMap) hashtagFeedbackFragment2.MR().LL).getOrDefault(hashtagFeedbackFragment2.LLILZLL, "");
                                        RecommendHashtag recommendHashtag4 = recommendHashtag3;
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            String str7 = hashTagMobHelper2.LL;
                                            if (str7 == null) {
                                                str7 = "";
                                            }
                                            jSONObject2.put("creation_id", str7);
                                            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str5);
                                            if (zLJFF) {
                                                str3 = "1";
                                            } else {
                                                str3 = CardStruct.IStatusCode.DEFAULT;
                                            }
                                            jSONObject2.put("is_submit_feedback", str3);
                                            if (orDefault == null) {
                                                orDefault = "";
                                            }
                                            jSONObject2.put("feedback_detail", orDefault);
                                            if (recommendHashtag4 == null || (challengeName3 = recommendHashtag4.getChallengeName()) == null) {
                                                challengeName3 = "";
                                            }
                                            jSONObject2.put("hashtag", challengeName3);
                                            if (recommendHashtag4 == null || (queryId2 = recommendHashtag4.getQueryId()) == null) {
                                                queryId2 = "";
                                            }
                                            jSONObject2.put("query_id", queryId2);
                                            C112C.LIZ.getClass();
                                            RecommendHashtagResponse recommendHashtagResponse2 = C112C.LJIIIZ;
                                            if (recommendHashtagResponse2 != null) {
                                                list2 = recommendHashtagResponse2.items;
                                            } else {
                                                list2 = null;
                                            }
                                            jSONObject2.put("hashtag_list", HashTagMobHelper.wQ2(list2));
                                            if (recommendHashtag4 == null || (logId2 = recommendHashtag4.getLogId()) == null) {
                                                logId2 = "";
                                            }
                                            jSONObject2.put("log_id", logId2);
                                            jSONObject2.put("feedback_cnt", String.valueOf(C112C.LJI));
                                            C1403010mc7.LIZ.getMusicService().al();
                                            String strLIZIZ2 = C2275708vr.LIZIZ();
                                            if (strLIZIZ2 != null) {
                                                str6 = strLIZIZ2;
                                            }
                                            jSONObject2.put("tos_key", str6);
                                            C20684815ws.LJIJ("hashtag_recommendation_feedback_result", jSONObject2);
                                        } catch (ClassCastException e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                        } catch (NullPointerException e5) {
                                            TryCatchGuardChecker.doCheck(e5);
                                        } catch (Exception e6) {
                                            TryCatchGuardChecker.doCheck(e6);
                                        }
                                    }
                                    boolean z = true;
                                    if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C194476116s.LIZ)) {
                                        function1.invoke(Integer.valueOf(c19394610uG2.getBindingAdapterPosition()));
                                        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = c19394610uG2.getBindingAdapter();
                                        if (bindingAdapter != null) {
                                            bindingAdapter.notifyItemRemoved(c19394610uG2.getBindingAdapterPosition());
                                        }
                                        C112C.LIZ.getClass();
                                        C112C.LJI++;
                                    }
                                    KeyboardStateViewModel keyboardStateViewModel2 = c19394610uG2.LLILZ;
                                    if (keyboardStateViewModel2 != null) {
                                        if (!keyboardStateViewModel2.LLILZIL) {
                                            z = false;
                                        }
                                        keyboardStateViewModel2.runOnUiThread(new ARunnableS30S0110000_11(keyboardStateViewModel2, z, 10));
                                    }
                                    C112C.LIZ.getClass();
                                    C112C.LJII = false;
                                }
                            };
                            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                            tuxSheet2.LLILLJJLI = onDismissListener;
                            FragmentManager fragmentManagerLJIIJ = C20622515mp.LJIIJ(c19394610uG2.itemView);
                            if (fragmentManagerLJIIJ != null) {
                                tuxSheet2.show(fragmentManagerLJIIJ, "hashtag_feedback");
                                C112C.LIZ.getClass();
                                C112C.LJII = true;
                                return true;
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    @Override // X.AbstractC19412410x8
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C19394610uG.LLJ;
        ViewModelStoreOwner viewModelStoreOwner = this.LLJILJIL;
        AwS678S0100000_29 awS678S0100000_29 = new AwS678S0100000_29(this, 12);
        if (((Number) C296210BjH.LIZ.getValue()).intValue() == 1) {
            return new C19394610uG(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxy, viewGroup, false), awS678S0100000_29, viewModelStoreOwner);
        }
        return new C19394610uG(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxz, viewGroup, false), awS678S0100000_29, viewModelStoreOwner);
    }

    public C19411610x0(AwS663S0100000_14 awS663S0100000_14, AwS628S0100000_14 awS628S0100000_14, ViewModelStoreOwner viewModelStoreOwner) {
        this.LLJI = awS663S0100000_14;
        this.LLJIJIL = awS628S0100000_14;
        this.LLJILJIL = viewModelStoreOwner;
        if (this.LL) {
            this.LL = false;
            onShowFooterChanged(false);
        }
    }
}
