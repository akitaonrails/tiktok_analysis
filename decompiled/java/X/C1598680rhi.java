package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.skylight.plat.OnThisDayExtraData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598680rhi implements InterfaceC1597070rf7 {
    public static final C1598680rhi LIZ = new C1598680rhi();
    public static final Map<Integer, EnumC1597060rf6> LIZIZ;
    public static final C01GW LIZJ;
    public static SkylightDataResponse LIZLLL;
    public static final Set<EnumC1597060rf6> LJ;

    static {
        EnumC1597060rf6 enumC1597060rf6 = EnumC1597060rf6.FRIENDS;
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(1, enumC1597060rf6), new Pair(3, EnumC1597060rf6.LIVE), new Pair(4, EnumC1597060rf6.ON_THIS_DAY), new Pair(7, EnumC1597060rf6.STORY_CELEBRATION), new Pair(8, EnumC1597060rf6.LIVE_EVENT));
        LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(4));
        LJ = Collections.singleton(enumC1597060rf6);
    }

    public static C1598870ri1 LIZIZ(SkylightData skylightData) {
        String str;
        String str2;
        Aweme aweme;
        List<Aweme> list;
        TemplateData templateData = skylightData.templateData;
        OnThisDayResponse onThisDayResponse = null;
        if (templateData != null) {
            str = templateData.extraData;
        } else {
            str = null;
        }
        OnThisDayExtraData onThisDayExtraData = (OnThisDayExtraData) C08JS.LIZ(str, OnThisDayExtraData.class);
        if (onThisDayExtraData == null || (str2 = onThisDayExtraData.pastKeyMemory) == null) {
            str2 = "";
        }
        int i = skylightData.priority;
        if (((ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class)).needJumpToOnThisDayPreviewPage()) {
            CustomBizData customBizData = skylightData.customBizData;
            if (customBizData != null && (list = customBizData.awemes) != null) {
                onThisDayResponse = new OnThisDayResponse(null, 0, 0, str2, i, list);
            }
        } else {
            CustomBizData customBizData2 = skylightData.customBizData;
            if (customBizData2 != null && (aweme = customBizData2.aweme) != null) {
                onThisDayResponse = new OnThisDayResponse(aweme, 0, 0, str2, i, null);
            }
        }
        return C1618440sDa.LIZIZ.LJJIIZI().convertDayResponseToItem(onThisDayResponse);
    }

    public static Map LIZ(String str, String str2) {
        return C2097608Jq.LJIIIIZZ(new Pair("key", str), new Pair("value", str2));
    }

    @Override // X.InterfaceC1597700rg8
    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return C1597080rf8.LIZ(this, c1596730reZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045e  */
    @Override // X.InterfaceC1597070rf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1596730reZ r27, X.InterfaceC1364105Vn<? super java.util.Map<X.EnumC1597060rf6, ? extends X.C1160260gIa<? extends X.InterfaceC1891350zJl>>> r28) {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598680rhi.LIZLLL(X.0reZ, X.05Vn):java.lang.Object");
    }
}
