package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.020R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020R extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020R c020r, Object obj) {
        ((C01IS) c020r.l1).LJI = c020r.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020R c020r, Object obj) {
        ((C01IS) c020r.l1).LJI = c020r.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020R c020r, Object obj) {
        Function1 function1;
        String str;
        if (((Boolean) obj).booleanValue()) {
            function1 = (Function1) c020r.l1;
            str = c020r.s0;
        } else {
            function1 = (Function1) c020r.l1;
            str = "";
        }
        function1.invoke(str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020R c020r, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            Map<String, String> map = DMGeckoCommonChannelManager.LIZIZ;
            String str = c020r.s0;
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            map.put(str, strLIZLLL);
            Function2 function2 = (Function2) c020r.l1;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, c1533790q13.LIZLLL());
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/photo_swap_lottie/");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            Function2 function22 = (Function2) c020r.l1;
            if (function22 != null) {
                function22.invoke(Boolean.FALSE, c1533790q13.LIZLLL.toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020R c020r, Object obj) {
        ((List) c020r.l1).add(new Pair(c020r.s0, obj));
        return Unit.LIZ;
    }

    public static final Object invoke$5(C020R c020r, Object obj) {
        ((List) c020r.l1).add(new Pair(c020r.s0, obj));
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020R c020r, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c020r.l1;
        C364901bL c364901bL = new C364901bL((File) obj, c020r.s0);
        C189200o6.m2constructorimpl(c364901bL);
        interfaceC1364105Vn.resumeWith(c364901bL);
        return Unit.LIZ;
    }

    public static final Object invoke$7(C020R c020r, Object obj) {
        ((List) c020r.l1).add(new Pair(c020r.s0, obj));
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020R c020r, Object obj) {
        String name;
        List list;
        UrlModel icon;
        List list2 = (List) obj;
        if (!list2.isEmpty()) {
            LiveEffect liveEffect = (LiveEffect) ListProtector.get(list2, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Effect icon name: ");
            if (liveEffect != null) {
                name = liveEffect.getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            sbLIZ.append(", id: ");
            sbLIZ.append(c020r.s0);
            C20441214yg.LIZIZ("VictoryLapFunnyEffectEntity", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c020r.l1;
            String str = c020r.s0;
            if (liveEffect == null || (icon = liveEffect.getIcon()) == null || (list = icon.urlList) == null) {
                list = C13BV.INSTANCE;
            }
            interfaceC1631620sYq.invoke(str, str, list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C020R c020r, Object obj) {
        ((List) c020r.l1).add(new Pair(c020r.s0, obj));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020R(C01IS c01is, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c01is;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020R(String str, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l1 = c23260099m;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020R(String str, String str2, InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit> interfaceC1631620sYq) {
        super(1);
        this.$t = interfaceC1631620sYq;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020R(String str, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020R(List list, List<Pair<String, String>> list2, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020R(Function2 function2, Function2<? super Boolean, ? super String, Unit> function22, String str) {
        super(1);
        this.$t = str;
        this.l1 = function2;
        this.s0 = function22;
    }
}
