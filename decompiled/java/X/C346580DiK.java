package X;

import com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitWidget;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346580DiK extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346580DiK(C338760DPu c338760DPu, int i) {
        super(5);
        this.$t = i;
        this.l0 = c338760DPu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346580DiK(CaptionSplitWidget captionSplitWidget, int i) {
        super(5);
        this.$t = i;
        this.l0 = captionSplitWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346580DiK(CommerceAgentContentAssem commerceAgentContentAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = commerceAgentContentAssem;
    }

    public static final Object invoke$0(C346580DiK c346580DiK, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        long jLongValue4 = ((Number) obj4).longValue();
        Map<String, String> map = (Map) obj5;
        C0DT4 c0dt4 = ((CaptionSplitWidget) c346580DiK.l0).LLJLILLLLZIIL;
        if (c0dt4 != null) {
            c0dt4.LIZLLL(jLongValue, jLongValue2, jLongValue3, jLongValue4, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C346580DiK c346580DiK, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super/*android.widget.FrameLayout*/.onLayout(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Type inference failed for: r0v182, types: [com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardPostProcessProtocol] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.util.List<? extends X.05op>] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(X.C346580DiK r26, java.lang.Object r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346580DiK.invoke$2(X.0DiK, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
