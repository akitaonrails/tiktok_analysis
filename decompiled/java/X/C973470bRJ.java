package X;

import Y.AfS34S0210000_15;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchPrepareRetryIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchPrepareRetryMaxLimitSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0bRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973470bRJ {
    public static C11JF LIZIZ;
    public static final C01GW LIZ = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(191));
    public static InterfaceC973490bRL LIZJ = new C956550b01();
    public static List<Long> LIZLLL = C13BV.INSTANCE;

    public static void LIZIZ(String str) {
        LiveMatchTakeStageOptSetting liveMatchTakeStageOptSetting = LiveMatchTakeStageOptSetting.INSTANCE;
        if (!liveMatchTakeStageOptSetting.isEnableOptRedundantApi()) {
            return;
        }
        C20441214yg.LJIIIZ("MatchPrepareFetchService", "startFetch");
        if (liveMatchTakeStageOptSetting.isEnableOptRedundantApi() && LiveMatchPrepareRetryMaxLimitSetting.INSTANCE.getValue() > 0) {
            LIZ(C915980Zwa.LJII().getChannelId(), AFwS250S0000000_15.get$arr$(112), AFwS250S0000000_15.get$arr$(113), false);
        } else {
            C20441214yg.LJ("MatchPrepareFetchService", "startFetchTask return, canStartFetchTask==false");
        }
    }

    public static void LIZ(long j, Function1 function1, Function1 function12, boolean z) {
        Boolean boolValueOf;
        if (j == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doRequestPrepareApi");
            sbLIZ.append(", return by prepare api error channel id is empty");
            C20441214yg.LJ("MatchPrepareFetchService", C2188811AlT.LIZIZ(sbLIZ));
            function12.invoke(new Exception("RequestPrepareApi_channelId_is_0"));
            return;
        }
        int value = 0;
        if (!z) {
            C11JF c11jf = LIZIZ;
            if (c11jf != null) {
                boolValueOf = Boolean.valueOf(c11jf.isDisposed());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                Iterator<C954460awe> it2 = listLLILZLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().LJ));
                }
                if (C973560bRS.LIZ(LIZLLL, arrayList)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("doRequestPrepareApi");
                    sbLIZ2.append(", return by isOnlyOnce = false , isFetchingPrepareDataWithUidListNoChange = true");
                    C20441214yg.LJ("MatchPrepareFetchService", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
        }
        new C974490bSx().LJIJJLI("prepare_request");
        C974490bSx c974490bSx = new C974490bSx();
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<MultiMatchPrepareResponse>> c11nzPrepareMultiMatchPb = ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).prepareMultiMatchPb(j);
        if (!z) {
            value = LiveMatchPrepareRetryMaxLimitSetting.INSTANCE.getValue();
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = c11nzPrepareMultiMatchPb.LJJLIIIJLJLI(new C1811860xFY(value, LiveMatchPrepareRetryIntervalSetting.INSTANCE.getValue())).LJIILIIL(new C0UO0()).LJJLL(new AfS34S0210000_15(c974490bSx, function1, z, 2), new AfS34S0210000_15(c974490bSx, function12, z, 3));
        if (z) {
            List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLILZLL2, 10));
            Iterator<C954460awe> it3 = listLLILZLL2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(it3.next().LJ));
            }
            ((C11NJ) LIZ.getValue()).LIZ(interfaceC420801kMLJJLL);
            return;
        }
        List<C954460awe> listLLILZLL3 = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLILZLL3, 10));
        Iterator<C954460awe> it4 = listLLILZLL3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(it4.next().LJ));
        }
        LIZLLL = arrayList3;
        C11JF c11jf2 = LIZIZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        LIZIZ = (C11JF) interfaceC420801kMLJJLL;
    }
}
