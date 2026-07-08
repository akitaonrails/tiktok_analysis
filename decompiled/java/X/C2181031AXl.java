package X;

import android.graphics.RectF;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Insets;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181031AXl extends C09AY implements Function0<C2181231AYf> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181031AXl(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.1AYf] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C2181231AYf invoke() {
        final C1AXM c1axm = this.LL;
        C2177031AIb c2177031AIb = c1axm.LL;
        final C2181271AYj c2181271AYj = new C2181271AYj(c2177031AIb.LIZIZ, c2177031AIb.LIZJ, c2177031AIb.LJIIIIZZ, c2177031AIb.LJ, c2177031AIb.LIZLLL, c2177031AIb.LJFF instanceof C968900bJw, new InterfaceC2181411AYx() { // from class: X.1AXW
            @Override // X.InterfaceC2181411AYx
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC2181411AYx
            public final int LJJI() {
                return 0;
            }

            @Override // X.InterfaceC2181411AYx
            public final boolean LJJIIZ() {
                return false;
            }

            @Override // X.InterfaceC2181411AYx
            public final boolean LJJIJ() {
                return false;
            }

            @Override // X.InterfaceC2181411AYx
            public final C949400aoU LJJJJJL() {
                return null;
            }

            @Override // X.InterfaceC2181411AYx
            public final JSONObject LJJJJL(C1275030jHh c1275030jHh, List list, Map map, String str, InterfaceC969870bLV interfaceC969870bLV, Map map2, int i) {
                return null;
            }

            @Override // X.InterfaceC2181411AYx
            public final int LJJJJLI(String str) {
                return 0;
            }

            @Override // X.InterfaceC2181411AYx
            public final C1AZI LJJJJLL(List<C2183391Acj> list, C1AZR c1azr) {
                return null;
            }

            @Override // X.InterfaceC2181411AYx
            public final int LJJJJZ(String str) {
                return 0;
            }

            @Override // X.InterfaceC2181411AYx
            public final Map<String, OnLineMicInfo> LIZ() {
                return c1axm.LL.LJFF.LIZ();
            }

            @Override // X.InterfaceC2181411AYx
            public final List<LinkUser> LIZLLL() {
                return c1axm.LL.LJFF.LIZLLL();
            }

            @Override // X.InterfaceC2181411AYx
            public final void LJI() {
                c1axm.LL.LJFF.LJI();
            }

            @Override // X.InterfaceC2181411AYx
            public final long LJIIJJI() {
                return c1axm.LL.LJFF.LJIIJJI();
            }

            @Override // X.InterfaceC2181411AYx
            public final void LJIILIIL() {
                c1axm.LL.LJFF.LJIILIIL();
            }

            @Override // X.InterfaceC2181411AYx
            public final List<C1276580jKC> LJIILL() {
                return c1axm.LL.LJFF.LJIILL();
            }

            @Override // X.InterfaceC2181411AYx
            public final String LJJIIJ() {
                return c1axm.LL.LJFF.LJJIIJ();
            }

            @Override // X.InterfaceC2181411AYx
            public final int LJJIIJZLJL() {
                return c1axm.LLLFF;
            }

            @Override // X.InterfaceC2181411AYx
            public final Pair<Integer, Integer> LJJJJJ() {
                return c1axm.LL.LJFF.LJJJJJ();
            }

            @Override // X.InterfaceC2181411AYx
            public final String getChannelId() {
                return c1axm.LL.LJFF.getChannelId();
            }

            @Override // X.InterfaceC2181411AYx
            public final String getGroupChannelId() {
                return c1axm.LL.LJFF.getGroupChannelId();
            }

            @Override // X.InterfaceC2181411AYx
            public final void LIZJ(String str) {
                c1axm.LL.LJFF.LIZJ(str);
            }

            @Override // X.InterfaceC2181411AYx
            public final LinkUser LJJIFFI(String str) {
                C1AXQ c1axq = c1axm.LL.LJFF;
                if (str == null) {
                    str = "";
                }
                return c1axq.LJJIFFI(str);
            }

            @Override // X.InterfaceC2181411AYx
            public final void LJIILJJIL(String str, C1276750jKT c1276750jKT) {
                c1axm.LL.LJFF.LJIILJJIL(str, c1276750jKT);
            }

            @Override // X.InterfaceC2181411AYx
            public final void LJJIII(String str, List<? extends C1276580jKC> list) {
                c1axm.LL.LJFF.LJJIII(str, list);
            }
        });
        final InterfaceC2181151AXx interfaceC2181151AXxLJJLL = this.LL.LJJLL();
        final C1AYR c1ayrLJJLIIJ = this.LL.LJJLIIJ();
        final C1AXO c1axoLJLJJLL = this.LL.LJLJJLL();
        final C1AY5 c1ay5 = new C1AY5(this.LL);
        return new AbstractC1290300jgK(interfaceC2181151AXxLJJLL, c1ayrLJJLIIJ, c1axoLJLJJLL, c2181271AYj, c1ay5) { // from class: X.1AYf
            public final InterfaceC2181151AXx LJII;
            public final C1AYR LJIIIIZZ;
            public final C1AXO LJIIIZ;
            public final C2181271AYj LJIIJ;
            public final Function0<InterfaceC969870bLV> LJIIJJI;

            /* JADX WARN: Removed duplicated region for block: B:143:0x03d1  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0576  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0276 A[PHI: r1
              0x0276: PHI (r1v45 X.0jKS) = (r1v39 X.0jKS), (r1v46 X.0jKS) binds: [B:94:0x0274, B:92:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x0282 A[PHI: r1
              0x0282: PHI (r1v40 X.0jKS) = (r1v39 X.0jKS), (r1v45 X.0jKS), (r1v45 X.0jKS) binds: [B:94:0x0274, B:96:0x027a, B:98:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1290300jgK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<X.C1276750jKT> LIZJ() {
                /*
                    Method dump skipped, instruction units count: 1507
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2181231AYf.LIZJ():java.util.List");
            }

            public final Layout LJIIJ() {
                Layout layoutLIZJ = this.LJIIIIZZ.LIZJ(false);
                if (this.LJIIIZ.LIZLLL.LIZ() && ((layoutLIZJ = this.LJIIIZ.LIZLLL.LIZLLL) != null || (layoutLIZJ = this.LJIIIIZZ.LIZJ(false)) != null)) {
                    Layout layoutLIZJ2 = this.LJIIIIZZ.LIZJ(false);
                    layoutLIZJ.setVersion(layoutLIZJ2 != null ? layoutLIZJ2.version : 0);
                    Layout layoutLIZJ3 = this.LJIIIIZZ.LIZJ(false);
                    layoutLIZJ.setScene(layoutLIZJ3 != null ? layoutLIZJ3.scene : 0);
                }
                return layoutLIZJ;
            }

            public final int LJIIIZ(int i) {
                C1AYS c1aysLJ;
                Object next;
                String strValueOf;
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean z = this.LJIIJ.LIZJ;
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(z) && this.LJIIJ.LIZ == 4) {
                    return i;
                }
                C1AYR c1ayr = this.LJIIIIZZ;
                if (c1ayr.LJIIJ()) {
                    c1aysLJ = c1ayr.LIZLLL();
                } else {
                    c1aysLJ = c1ayr.LJ();
                }
                if ((c1ayr.LJFF == 4 && C918060Zzw.LIZ(c1ayr.LIZIZ)) || (c1ayr.LJFF == 0 && (!((CopyOnWriteArrayList) c1aysLJ.LJII).isEmpty()))) {
                    Iterator<T> it2 = c1ayr.LIZLLL.LIZ().entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            MicPositionInfo micPositionInfo = ((OnLineMicInfo) ((Map.Entry) next).getValue()).micPositionData;
                            if (micPositionInfo != null && micPositionInfo.position == i) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null || (strValueOf = (String) entry.getKey()) == null) {
                        strValueOf = String.valueOf(i);
                    }
                    return ((Number) C500260Jjc.LJI(c1aysLJ.LJII, new C005D(strValueOf)).getSecond()).intValue();
                }
                return c1ayr.LIZLLL.LJII(i);
            }

            public final C1282280jTO LJIIJJI(int i, Pair pair) {
                Map<String, LayoutArray> map;
                float f;
                Object next;
                Integer num;
                Layout layoutLJIIJ = LJIIJ();
                C1282280jTO c1282280jTO = null;
                if (layoutLJIIJ == null) {
                    return null;
                }
                Insets insets = layoutLJIIJ.viewForCanvas;
                LayoutArrayList layoutMaskConfigListByOnlineMicCount = layoutLJIIJ.getLayoutMaskConfigListByOnlineMicCount(this.LJII.LIZIZ());
                if (layoutMaskConfigListByOnlineMicCount == null || (map = layoutMaskConfigListByOnlineMicCount.indexLayoutArrayMap) == null) {
                    return null;
                }
                RectF rectFLIZ = C1AFG.LIZ((((Number) pair.getFirst()).floatValue() * 1.0f) / ((Number) pair.getSecond()).floatValue(), insets);
                int i2 = i + 1;
                LayoutArray layoutArray = map.get(String.valueOf(i2));
                if (layoutArray != null) {
                    RectF rectF = new RectF();
                    rectF.left = rectFLIZ.left + (layoutArray.getLeft() * rectFLIZ.width());
                    rectF.top = rectFLIZ.top + (layoutArray.getTop() * rectFLIZ.height());
                    rectF.right = rectF.left + (layoutArray.getWidth() * rectFLIZ.width());
                    rectF.bottom = rectF.top + (layoutArray.getHeight() * rectFLIZ.height());
                    if (Intrinsics.LJFF(this.LJIIJ.LJ, "live_voice")) {
                        float fFloatValue = ((Number) pair.getFirst()).floatValue() * rectF.width();
                        float fFloatValue2 = ((Number) pair.getSecond()).floatValue() * rectF.height();
                        float fFloatValue3 = rectF.left * ((Number) pair.getFirst()).floatValue();
                        float fFloatValue4 = rectF.top * ((Number) pair.getSecond()).floatValue();
                        float fMin = Math.min(fFloatValue, fFloatValue2) * LivesdkLinkmicVoiceChatLayoutConfigGroupSetting.INSTANCE.getAvatarPercentByLayoutId(this.LJIIIIZZ.LJIIIIZZ());
                        float f2 = ((fFloatValue - fMin) / 2) + fFloatValue3;
                        float f3 = f2 + fMin;
                        float f4 = fMin + fFloatValue4;
                        rectF = new RectF(f2 / ((Number) pair.getFirst()).floatValue(), fFloatValue4 / ((Number) pair.getSecond()).floatValue(), f3 / ((Number) pair.getFirst()).floatValue(), f4 / ((Number) pair.getSecond()).floatValue());
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("leftPx:");
                        sbLIZ.append(fFloatValue3);
                        sbLIZ.append(" wPx:");
                        sbLIZ.append(fFloatValue);
                        sbLIZ.append(" topPx:");
                        sbLIZ.append(fFloatValue4);
                        sbLIZ.append(" hPx:");
                        sbLIZ.append(fFloatValue2);
                        sbLIZ.append(" afterConvert left:");
                        sbLIZ.append(f2);
                        sbLIZ.append(" w:");
                        sbLIZ.append(f3 - f2);
                        sbLIZ.append(" top:");
                        sbLIZ.append(fFloatValue4);
                        sbLIZ.append(" h:");
                        sbLIZ.append(f4 - fFloatValue4);
                        sbLIZ.append(" rectF:");
                        sbLIZ.append(rectF);
                        AbstractC1290300jgK.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    c1282280jTO = new C1282280jTO(rectF.left, rectF.top, rectF.width(), rectF.height(), rectFLIZ.width() * layoutArray.getRadius());
                    double d = c1282280jTO.LIZIZ;
                    if (insets.lessThanRatioAlign() == 256) {
                        f = insets.streamOffset;
                    } else {
                        f = 0.0f;
                    }
                    c1282280jTO.LIZIZ = d + ((double) f);
                    Iterator it2 = C2097808Js.LJIL(this.LJIIIZ.LJFF()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            MicPositionInfo micPositionInfo = ((OnLineMicInfo) ((Pair) next).getSecond()).micPositionData;
                            if (micPositionInfo != null && micPositionInfo.uiPos == i) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Pair pair2 = (Pair) next;
                    if (pair2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("uiPos:");
                        sbLIZ2.append(i);
                        sbLIZ2.append(" micInfo:");
                        sbLIZ2.append(((OnLineMicInfo) pair2.getSecond()).micPositionData);
                        sbLIZ2.append("interactId:");
                        sbLIZ2.append((String) pair2.getFirst());
                        AbstractC1290300jgK.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        c1282280jTO.LJII = (String) pair2.getFirst();
                    }
                    LayoutArray layoutArray2 = map.get(String.valueOf(i2));
                    if (layoutArray2 != null && (num = layoutArray2.zOrder) != null) {
                        c1282280jTO.LJFF = Integer.valueOf(num.intValue());
                    }
                }
                return c1282280jTO;
            }

            public final String LJIIIIZZ(int i, int i2, Layout layout) {
                Map<String, OnLineMicInfo> mapLJJII;
                Object next;
                String str;
                Integer numValueOf;
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean z = this.LJIIJ.LIZJ;
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(z) && this.LJIIJ.LIZ == 4) {
                    PosIdentity posIdentity = (PosIdentity) C13LP.LJJJLZIJ(i, this.LJIIIIZZ.LJIIIZ());
                    if (posIdentity != null) {
                        int i3 = posIdentity.type;
                        if (i3 == 2 || i3 == 1) {
                            return posIdentity.value;
                        }
                        return "";
                    }
                    return "";
                }
                if (layout.isFixedType()) {
                    mapLJJII = this.LJII.LIZ();
                } else {
                    mapLJJII = this.LJII.LJJII();
                }
                Iterator it2 = C2097808Js.LJIL(mapLJJII).iterator();
                while (true) {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    Pair pair = (Pair) next;
                    if (this.LJIIIZ.LIZLLL.LIZ()) {
                        MicPositionInfo micPositionInfo = ((OnLineMicInfo) pair.getSecond()).micPositionData;
                        if (micPositionInfo != null) {
                            numValueOf = Integer.valueOf(micPositionInfo.uiPos);
                            if (numValueOf != null && numValueOf.intValue() == i2) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        MicPositionInfo micPositionInfo2 = ((OnLineMicInfo) pair.getSecond()).micPositionData;
                        if (micPositionInfo2 != null) {
                            numValueOf = Integer.valueOf(micPositionInfo2.position);
                            if (numValueOf != null) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                Pair pair2 = (Pair) next;
                if (pair2 != null && (str = (String) pair2.getFirst()) != null) {
                    return str;
                }
                return "";
            }

            {
                super(c2181271AYj);
                this.LJII = interfaceC2181151AXxLJJLL;
                this.LJIIIIZZ = c1ayrLJJLIIJ;
                this.LJIIIZ = c1axoLJLJJLL;
                this.LJIIJ = c2181271AYj;
                this.LJIIJJI = c1ay5;
            }
        };
    }
}
