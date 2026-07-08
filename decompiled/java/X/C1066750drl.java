package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ogc.news.anchor.consumer.repo.NewsAnchorStatusApi;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0drl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066750drl {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(456));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(457));

    public static String LIZLLL(String str) {
        Object obj;
        try {
            String strDecode = Uri.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url"));
            strDecode.toString();
            C189200o6.m2constructorimpl(strDecode);
            obj = strDecode;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        return (String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C2344009Gk r3, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4) {
        /*
            java.lang.String r1 = "news_content_title"
            java.lang.String r2 = ""
            if (r4 == 0) goto Lc
            java.lang.String r0 = r4.getKeyword()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto Ld
        Lc:
            r0 = r2
        Ld:
            r3.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "news_content_url"
            if (r4 == 0) goto L21
            java.lang.String r0 = r4.getSchema()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L21
            java.lang.String r0 = LIZLLL(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L21
            r2 = r0
        L21:
            r3.LJFF(r1, r2)     // Catch: java.lang.Throwable -> L28
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066750drl.LIZ(X.09Gk, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):void");
    }

    public final void LIZJ(Context context, String str, C1066760drm c1066760drm) {
        try {
            String strLIZLLL = LIZLLL(str);
            if (strLIZLLL == null) {
                return;
            }
            C1066680dre c1066680dre = C1066680dre.LIZ;
            String str2 = c1066760drm.LIZ.get("author_id");
            String str3 = c1066760drm.LIZ.get("anchor_id");
            Map<String, String> map = c1066760drm.LIZ;
            c1066680dre.getClass();
            C1066690drf c1066690drfLIZIZ = C1066680dre.LIZIZ(context, strLIZLLL, str2, map, str3);
            if (c1066690drfLIZIZ.LIZ) {
                if (c1066690drfLIZIZ.LIZIZ) {
                    C438501nD.LIZ(new AwS382S0200000_16(this, c1066760drm, 84));
                } else {
                    C438501nD.LIZIZ(new AwS382S0200000_16(this, c1066760drm, 85));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, EnumC705650Rm7 enumC705650Rm7, View view) {
        Pair pair;
        C1499850p8J c1499850p8JCreateBuilder;
        NewsAnchorStatusApi newsAnchorStatusApi;
        C11NZ<BaseResponse> c11nzLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append('_');
        sbLIZ.append(enumC705650Rm7.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!((HashSet) this.LIZ.getValue()).contains(strLIZIZ)) {
            int i = C705660Rm8.LIZ[enumC705650Rm7.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            pair = new Pair(2131832466, null);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        pair = new Pair(2131838678, null);
                    }
                } else {
                    pair = new Pair(2131838676, Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill));
                }
            } else {
                pair = new Pair(2131838671, Integer.valueOf(R.raw.icon_tick_circle_fill));
            }
            new AwS127S1200000_11(enumC705650Rm7, strLIZIZ, anchorCommonStruct, 15);
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(((Number) pair.getFirst()).intValue());
                c1389890mGx.LIZ(true);
                Integer num = (Integer) pair.getSecond();
                if (num != null) {
                    c1389890mGx.LJFF(num.intValue());
                    c1389890mGx.LJII(R.attr.a1h);
                }
                c1389890mGx.LJIIJJI();
            } else {
                C436801mw.LIZ(((Number) pair.getFirst()).intValue(), 0L, null, (Integer) pair.getSecond(), 6);
            }
            ((HashSet) this.LIZ.getValue()).add(strLIZIZ);
            Object value = this.LIZIZ.getValue();
            String id = anchorCommonStruct.getId();
            value.getClass();
            NewsAnchorStatusApi.LIZ.getClass();
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) != null && (newsAnchorStatusApi = (NewsAnchorStatusApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(NewsAnchorStatusApi.class)) != null && (c11nzLIZ = newsAnchorStatusApi.LIZ(new NewsAnchorStatusApi.MarkShowRequest(id, enumC705650Rm7.getValue()))) != null) {
                c11nzLIZ.LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Oh
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("NewsAnchorStatusRepo@5ff8.updateStatus$1");
                        C1C7U.LIZIZ("NewsAnchorStatusRepo@5ff8.updateStatus$1");
                    }
                }, new C09JN() { // from class: X.00Oi
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("NewsAnchorStatusRepo@5ff8.updateStatus$2");
                        C1C7U.LIZIZ("NewsAnchorStatusRepo@5ff8.updateStatus$2");
                    }
                });
            }
        }
    }
}
