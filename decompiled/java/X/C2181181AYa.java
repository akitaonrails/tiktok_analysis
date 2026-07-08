package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181181AYa extends C09AY implements Function0<C1AYU> {
    public final /* synthetic */ C1AYR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181181AYa(C1AYR c1ayr) {
        super(0);
        this.LL = c1ayr;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1AYU] */
    @Override // kotlin.jvm.functions.Function0
    public final C1AYU invoke() {
        C1AYR c1ayr = this.LL;
        return new C1AYV(c1ayr.LIZJ, c1ayr.LIZLLL, c1ayr.LJ, c1ayr.LJFF) { // from class: X.1AYU
            public final InterfaceC2181151AXx LJIIIZ;

            public static String LIZLLL(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
                sbLIZ.append("_LiveDataProvider_");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C1AYV
            public final C1AX3 LJIIIIZZ(int i) {
                Map<String, OnLineMicInfo> mapLJJII;
                MicPositionInfo micPositionInfo;
                String string;
                if (((CopyOnWriteArrayList) this.LJII).isEmpty()) {
                    return super.LJIIIIZZ(i);
                }
                C1AZW c1azw = C1AZW.LIZ;
                String strLIZLLL = LIZLLL(305);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMicWindow pos=");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ(strLIZLLL, strLIZIZ, null, null);
                Layout layout = this.LJ;
                String strLIZLLL2 = LIZLLL(308);
                c1azw.getClass();
                C1AZW.LIZ(strLIZLLL2, "LiveDataProvider getMicWindow", null, null);
                C1AX3 c1ax3 = null;
                if (layout == null) {
                    C1AZW.LJFF(LIZLLL(310), "live currentLayout is null", null, null);
                    C1CC2.LIZ("live currentLayout is null.", new Throwable());
                    return LIZIZ(EnumC918810a19.StateInit);
                }
                PosIdentity posIdentity = (PosIdentity) C13LP.LJJJLZIJ(i, this.LJII);
                if (posIdentity == null) {
                    return LIZIZ(EnumC918810a19.StateIdle);
                }
                int i2 = posIdentity.type;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            return LIZIZ(EnumC918810a19.StateIdle);
                        }
                        Iterator<C1AX3> it2 = this.LJI.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1AX3 next = it2.next();
                            Long l = next.LIZ.LIZIZ;
                            if (l != null) {
                                string = l.toString();
                            } else {
                                string = null;
                            }
                            if (Intrinsics.LJFF(string, posIdentity.value)) {
                                c1ax3 = next;
                                break;
                            }
                        }
                        C1AX3 c1ax32 = c1ax3;
                        if (c1ax32 != null) {
                            return c1ax32;
                        }
                        return LIZIZ(EnumC918810a19.StateIdle);
                    }
                    Iterator<C1AX3> it3 = this.LJI.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C1AX3 next2 = it3.next();
                        if (Intrinsics.LJFF(next2.LIZ.LIZJ, posIdentity.value)) {
                            c1ax3 = next2;
                            break;
                        }
                    }
                    C1AX3 c1ax33 = c1ax3;
                    if (c1ax33 != null) {
                        if (posIdentity.type == 2) {
                            c1ax33.LIZ.LJIIIZ = 1;
                        }
                        if (this.LIZLLL != 2) {
                            return c1ax33;
                        }
                        Layout layout2 = this.LJ;
                        int i3 = 0;
                        if ((layout2 != null && layout2.isFixedType()) || this.LIZJ.LIZ()) {
                            mapLJJII = this.LJIIIZ.LIZ();
                        } else {
                            mapLJJII = this.LJIIIZ.LJJII();
                        }
                        C1AXI c1axi = c1ax33.LIZ;
                        OnLineMicInfo onLineMicInfo = mapLJJII.get(posIdentity.value);
                        if (onLineMicInfo != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
                            i3 = micPositionInfo.contentType;
                        }
                        c1axi.LJIIIZ = i3;
                        return c1ax33;
                    }
                    return LIZIZ(EnumC918810a19.StateIdle);
                }
                return LIZIZ(EnumC918810a19.StateIdle);
            }

            {
                this.LJIIIZ = interfaceC2181151AXx;
            }
        };
    }
}
