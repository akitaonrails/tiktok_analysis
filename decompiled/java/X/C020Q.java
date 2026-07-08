package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.GetTryOnResultResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.020Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020Q extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The expr of ");
        sbLIZ.append(c020q.s0);
        sbLIZ.append(" is not a string ");
        sbLIZ.append(c020q.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020Q c020q) {
        Throwable th = (Throwable) c020q.l1;
        if (th instanceof C477520Io2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c020q.s0);
            sbLIZ.append(" api call fail logid=");
            sbLIZ.append(((C477520Io2) ((Throwable) c020q.l1)).getxTtLogId());
            C766270U4b.LJI(10000, C2188811AlT.LIZIZ(sbLIZ));
        } else if (th instanceof C294201Ca) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c020q.s0);
            sbLIZ2.append(" desc=");
            sbLIZ2.append(((C294201Ca) ((Throwable) c020q.l1)).getDesc());
            C766270U4b.LJI(10000, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c020q.s0);
            sbLIZ3.append(" throwable=");
            sbLIZ3.append(((Throwable) c020q.l1).getMessage());
            C766270U4b.LJI(10000, C2188811AlT.LIZIZ(sbLIZ3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(C020Q c020q) {
        StringBuilder sb = new StringBuilder("delete legacy by ");
        sb.append(c020q.s0);
        sb.append(' ');
        ArrayList arrayList = (ArrayList) c020q.l1;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList2);
        sb.append(' ');
        return sb.toString();
    }

    public static final Object invoke$11(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c020q.s0);
        sbLIZ.append(" supplement empty incremental, keep awaiting next response, existing.size=");
        sbLIZ.append(((List) c020q.l1).size());
        sbLIZ.append(" completeEmpty=true");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(C020Q c020q) {
        return new C433001mK((C1126540fQC) ((C431601m6) c020q.l1).LLIZ.getValue(), c020q.s0);
    }

    public static final Object invoke$13(C020Q c020q) {
        ((Function2) c020q.l1).invoke(c020q.s0, null);
        return Unit.LIZ;
    }

    public static final Object invoke$14(C020Q c020q) {
        ((InterfaceC1631620sYq) c020q.l1).invoke(c020q.s0, "", C13BV.INSTANCE);
        return Unit.LIZ;
    }

    public static final Object invoke$15(C020Q c020q) {
        StringBuilder sb = new StringBuilder();
        sb.append(c020q.s0);
        sb.append(" handle: (params: ");
        Map map = (Map) c020q.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "data")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        sb.append(linkedHashMap);
        sb.append(')');
        return sb.toString();
    }

    public static final Object invoke$16(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init success by network cursor ");
        sbLIZ.append(((C238400w2) c020q.l1).element);
        sbLIZ.append(", conversation ");
        sbLIZ.append(c020q.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C020Q c020q) {
        C1324610kZf url = C1819620xS4.LIZ().setUrl(c020q.s0);
        PreviewGameDropsWidget previewGameDropsWidget = (PreviewGameDropsWidget) c020q.l1;
        url.LJIIL = previewGameDropsWidget.LLJILJIL;
        url.LJJI((View) previewGameDropsWidget.LLJIJIL.getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackEvent, name: ");
        sbLIZ.append(c020q.s0);
        sbLIZ.append(", params: ");
        sbLIZ.append((Map) c020q.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryon native prefetch success, requestUrl=");
        sbLIZ.append(c020q.s0);
        sbLIZ.append(", code=");
        sbLIZ.append(((GetTryOnResultResponse) c020q.l1).code);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryon native prefetch failed, requestUrl=");
        sbLIZ.append(c020q.s0);
        sbLIZ.append(", error=");
        sbLIZ.append(((Exception) c020q.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleCell don't need assemble, assem:");
        sbLIZ.append((C13IQ) c020q.l1);
        sbLIZ.append(", assemTag:");
        sbLIZ.append(c020q.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(C020Q c020q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I18nTranslateFunc error, key ");
        sbLIZ.append(c020q.s0);
        sbLIZ.append(", ");
        sbLIZ.append(((Exception) c020q.l1).getMessage());
        C1909880zne.LIZJ("", "I18nTranslateError", C2188811AlT.LIZIZ(sbLIZ), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020Q c020q) {
        ((Function2) c020q.l1).invoke(c020q.s0, null);
        return Unit.LIZ;
    }

    public static final Object invoke$9(C020Q c020q) {
        ((Function2) c020q.l1).invoke(c020q.s0, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(ArrayList arrayList, int i) {
        super(0);
        this.$t = i;
        this.s0 = null;
        this.l1 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(C431601m6 c431601m6, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c431601m6;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, C238400w2 c238400w2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c238400w2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1631620sYq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, C13IQ c13iq, int i) {
        super(0);
        this.$t = i;
        this.l1 = c13iq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, PreviewGameDropsWidget previewGameDropsWidget, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = previewGameDropsWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, GetTryOnResultResponse getTryOnResultResponse, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = getTryOnResultResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Q(String str, String str2, List<? extends InterfaceC1891350zJl> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Q(String str, String str2, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Q(Throwable th, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = th;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Q(Function2 function2, Function2<? super String, ? super LiveEffect, Unit> function22, String str) {
        super(0);
        this.$t = str;
        this.l1 = function2;
        this.s0 = function22;
    }
}
