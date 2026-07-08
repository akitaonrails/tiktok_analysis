package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Srw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734740Srw extends AbstractC737180Svs {
    public final C735210Ssh LL;
    public final WeakReference<C0HTT<C737030Svd>> LLILLJJLI;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLL;

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        LJJIIZ(true);
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_collect_video_action";
    }

    @Override // X.AbstractC737180Svs
    public final boolean LIZIZ() {
        return !C1017070cZd.LJJLIL(this.LL.LIZ);
    }

    public final boolean LJJIJLIJ() {
        Boolean boolLIZ;
        Aweme aweme = this.LL.LIZ;
        IAwemeCollectionState iAwemeCollectionState = (IAwemeCollectionState) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionState.class, false, false, false, 14, null);
        if (iAwemeCollectionState == null || (boolLIZ = iAwemeCollectionState.LIZ(aweme)) == null) {
            return false;
        }
        return boolLIZ.booleanValue();
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        int i = !LJJIJLIJ() ? 2131836886 : 2131836885;
        int i2 = !LJJIJLIJ() ? R.raw.icon_bookmark : R.raw.icon_bookmark_slash;
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(i2);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(i);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            C786410Ut5.LLLLLL(c427760Gpy, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return !LJJIJLIJ() ? R.raw.icon_bookmark_fill : R.raw.icon_bookmark_fill_slash;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return !LJJIJLIJ() ? 2131836886 : 2131836885;
    }

    public final void LJJIIZ(boolean z) {
        String string;
        String string2;
        String logExtra;
        Object obj;
        Map<String, ? extends Object> mapLJIIL;
        Long creativeId;
        Long adId;
        String string3;
        String string4;
        String logExtra2;
        Object obj2;
        Map<String, ? extends Object> mapLJIIL2;
        Long creativeId2;
        Long adId2;
        String str = "user";
        if (!LJJIJLIJ()) {
            if (z) {
                C734080Sqs c734080Sqs = C734080Sqs.LIZ;
                String value = this.LL.LJI.getValue();
                C735210Ssh c735210Ssh = this.LL;
                if (!c735210Ssh.LJFF) {
                    str = "visitor";
                }
                String str2 = c735210Ssh.LJIIIZ;
                c734080Sqs.getClass();
                C734080Sqs.LIZ(value, str, "add_to_favorites", str2);
            }
            ICollect iCollect = (ICollect) PluggableExtentionKt.pluggableSpi$default(ICollectAweme.class, false, false, false, 14, null);
            if (iCollect != null) {
                String aid = this.LL.LIZ.getAid();
                Aweme aweme = this.LL.LIZ;
                if (!AwemeExtKt.isMonetizationTraffic(aweme)) {
                    mapLJIIL2 = C2097608Jq.LJ();
                } else {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                    Pair[] pairArr = new Pair[7];
                    AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
                    if (monetizationData != null && (adId2 = monetizationData.getAdId()) != null) {
                        string3 = adId2.toString();
                    } else {
                        string3 = null;
                    }
                    pairArr[0] = new Pair("ad_id", string3);
                    AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme);
                    if (monetizationData2 != null && (creativeId2 = monetizationData2.getCreativeId()) != null) {
                        string4 = creativeId2.toString();
                    } else {
                        string4 = null;
                    }
                    pairArr[1] = new Pair("creative_id", string4);
                    AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme);
                    if (monetizationData3 != null) {
                        logExtra2 = monetizationData3.getLogExtra();
                    } else {
                        logExtra2 = null;
                    }
                    pairArr[2] = new Pair("log_extra", logExtra2);
                    pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                    pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                    pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                    android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                    if (pairLIZ != null) {
                        obj2 = pairLIZ.first;
                    } else {
                        obj2 = null;
                    }
                    pairArr[6] = new Pair("google_aid", obj2);
                    mapLJIIL2 = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
                }
                iCollect.collect(aid, mapLJIIL2, new AwS625S0100000_11(this, 121), new AwS625S0100000_11(this, 122));
                return;
            }
            if (this.LL.LJIIIIZZ) {
                Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILLL;
                if (function2 == null) {
                    return;
                }
                function2.invoke(Boolean.FALSE, null);
                return;
            }
            C737030Svd c737030Svd = new C737030Svd(99, new C734750Srx(true, false));
            C0HTT<C737030Svd> c0htt = this.LLILLJJLI.get();
            if (c0htt == null) {
                return;
            }
            c0htt.LLIIL(c737030Svd);
            return;
        }
        if (z) {
            C734080Sqs c734080Sqs2 = C734080Sqs.LIZ;
            String value2 = this.LL.LJI.getValue();
            C735210Ssh c735210Ssh2 = this.LL;
            if (!c735210Ssh2.LJFF) {
                str = "visitor";
            }
            String str3 = c735210Ssh2.LJIIIZ;
            c734080Sqs2.getClass();
            C734080Sqs.LIZ(value2, str, "remove_from_favorites", str3);
        }
        ICollect iCollect2 = (ICollect) PluggableExtentionKt.pluggableSpi$default(ICollectAweme.class, false, false, false, 14, null);
        if (iCollect2 != null) {
            String aid2 = this.LL.LIZ.getAid();
            Aweme aweme2 = this.LL.LIZ;
            if (!AwemeExtKt.isMonetizationTraffic(aweme2)) {
                mapLJIIL = C2097608Jq.LJ();
            } else {
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                Map<String, Object> mapLIZ2 = EngagementTraceImpl.LIZIZ().LIZ();
                Pair[] pairArr2 = new Pair[7];
                AwemeRawAd monetizationData4 = AwemeExtKt.getMonetizationData(aweme2);
                if (monetizationData4 != null && (adId = monetizationData4.getAdId()) != null) {
                    string = adId.toString();
                } else {
                    string = null;
                }
                pairArr2[0] = new Pair("ad_id", string);
                AwemeRawAd monetizationData5 = AwemeExtKt.getMonetizationData(aweme2);
                if (monetizationData5 != null && (creativeId = monetizationData5.getCreativeId()) != null) {
                    string2 = creativeId.toString();
                } else {
                    string2 = null;
                }
                pairArr2[1] = new Pair("creative_id", string2);
                AwemeRawAd monetizationData6 = AwemeExtKt.getMonetizationData(aweme2);
                if (monetizationData6 != null) {
                    logExtra = monetizationData6.getLogExtra();
                } else {
                    logExtra = null;
                }
                pairArr2[2] = new Pair("log_extra", logExtra);
                pairArr2[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                pairArr2[4] = new Pair("access", C786410Ut5.b3(contextLIZ2));
                pairArr2[5] = new Pair("package", contextLIZ2.getPackageName());
                android.util.Pair<String, Boolean> pairLIZ2 = C614430O8b.LIZ(contextLIZ2);
                if (pairLIZ2 != null) {
                    obj = pairLIZ2.first;
                } else {
                    obj = null;
                }
                pairArr2[6] = new Pair("google_aid", obj);
                mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr2), mapLIZ2);
            }
            iCollect2.unCollect(aid2, mapLJIIL, new AwS625S0100000_11(this, 123), new AwS625S0100000_11(this, 124));
            return;
        }
        if (this.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function22 = this.LLILLL;
            if (function22 == null) {
                return;
            }
            function22.invoke(Boolean.FALSE, null);
            return;
        }
        C737030Svd c737030Svd2 = new C737030Svd(99, new C734750Srx(false, false));
        C0HTT<C737030Svd> c0htt2 = this.LLILLJJLI.get();
        if (c0htt2 == null) {
            return;
        }
        c0htt2.LLIIL(c737030Svd2);
    }

    public C734740Srw(C735210Ssh c735210Ssh, C0HTT<C737030Svd> c0htt) {
        this.LL = c735210Ssh;
        this.LLILLJJLI = new WeakReference<>(c0htt);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ(false);
    }

    public final void LJJJ(Aweme aweme, boolean z) {
        int aIGCLabelType;
        String str;
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "profile_long_press");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(aweme.getAuthor()));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        c2344009Gk.LJIIIIZZ("enter_method", "profile_long_press");
        c2344009Gk.LJIIIIZZ("panel_source", "profile_long_press");
        c2344009Gk.LJIIIIZZ("tab_name", this.LL.LJI.getValue());
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c2344009Gk.LJ(Boolean.valueOf(AwemeBizExtKt.isHighlighted(aweme)), "is_highlighted");
        c2344009Gk.LIZJ(AwemeBizExtKt.getOriginalPos(aweme), "rank_index");
        int i = 0;
        if (!AwemeExtKt.isCollected(aweme)) {
            C1359610lU7.LJ(c2344009Gk, aweme, null);
        }
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        C2344009Gk c2344009Gk2 = (C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        AIGCInfo aIGCInfo = aweme.aigcInfo;
        if (aIGCInfo != null) {
            aIGCLabelType = aIGCInfo.getAIGCLabelType();
        } else {
            aIGCLabelType = 0;
        }
        c2344009Gk2.LIZJ(aIGCLabelType, "aigc_theme_status");
        if (aweme.getIsCommentPostVideo()) {
            i = 1;
        }
        c2344009Gk2.LIZJ(i, "is_comment_post_video");
        c2344009Gk2.LIZJ(C1601690rmZ.LIZ(aweme), "has_alternative_text");
        c2344009Gk2.LJ(Boolean.valueOf(C1601690rmZ.LIZJ()), "screen_reader_enabled");
        Map<String, String> map = c2344009Gk2.LIZ;
        if (z) {
            str = "favourite_video";
        } else {
            str = "cancel_favourite_video";
        }
        C20684815ws.LJIILLIIL(str, map);
    }
}
