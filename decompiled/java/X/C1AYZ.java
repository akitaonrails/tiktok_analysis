package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AYZ extends C09AY implements Function0<C1AYW> {
    public final /* synthetic */ C1AYR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AYZ(C1AYR c1ayr) {
        super(0);
        this.LL = c1ayr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1AYW invoke() {
        C1AYR c1ayr = this.LL;
        if (c1ayr.LJFF == 4) {
            C918060Zzw c918060Zzw = C918060Zzw.LIZ;
            boolean z = c1ayr.LIZIZ;
            c918060Zzw.getClass();
            if (C918060Zzw.LIZ(z)) {
                C1AYR c1ayr2 = this.LL;
                final Context context = c1ayr2.LIZJ;
                final InterfaceC2181151AXx interfaceC2181151AXx = c1ayr2.LIZLLL;
                final C2181141AXw c2181141AXw = c1ayr2.LJ;
                final int i = c1ayr2.LJFF;
                return new C1AYW(context, interfaceC2181151AXx, c2181141AXw, i) { // from class: X.1AYT
                    public final InterfaceC2181151AXx LJIIIZ;

                    public static String LIZLLL(int i2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
                        sbLIZ.append("_LinkDataProvider_");
                        sbLIZ.append(i2);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.C1AYW
                    public final C1AX3 LJIIIIZZ(int i2) {
                        C1AX3 c1ax3LIZIZ;
                        Map<String, OnLineMicInfo> mapLJJII;
                        MicPositionInfo micPositionInfo;
                        String string;
                        C1AX3 c1ax3 = null;
                        if (((CopyOnWriteArrayList) this.LJII).isEmpty()) {
                            C1AZW.LJIILL(LIZLLL(358), "ui positions is null, fallback to old logic", null, null);
                            return super.LJIIIIZZ(i2);
                        }
                        if (this.LJ == null) {
                            C1AZW.LJFF(LIZLLL(266), "link currentLayout is null", null, null);
                            C1CC2.LIZ("live currentLayout is null.", new Throwable());
                            return LIZIZ(EnumC918810a19.StateInit);
                        }
                        PosIdentity posIdentity = (PosIdentity) C13LP.LJJJLZIJ(i2, this.LJII);
                        if (posIdentity == null) {
                            return LIZIZ(EnumC918810a19.StateIdle);
                        }
                        int i3 = posIdentity.type;
                        if (i3 != 0) {
                            if (i3 != 1 && i3 != 2) {
                                if (i3 != 3) {
                                    c1ax3LIZIZ = LIZIZ(EnumC918810a19.StateIdle);
                                } else {
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
                                    c1ax3LIZIZ = c1ax3;
                                    if (c1ax3LIZIZ == null) {
                                        c1ax3LIZIZ = LIZIZ(EnumC918810a19.StateIdle);
                                    }
                                }
                            } else {
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
                                c1ax3LIZIZ = c1ax3;
                                if (c1ax3LIZIZ != null) {
                                    if (posIdentity.type == 2) {
                                        c1ax3LIZIZ.LIZ.LJIIIZ = 1;
                                    }
                                    if (this.LIZLLL == 2) {
                                        Layout layout = this.LJ;
                                        int i4 = 0;
                                        if ((layout != null && layout.isFixedType()) || this.LIZJ.LIZ()) {
                                            mapLJJII = this.LJIIIZ.LIZ();
                                        } else {
                                            mapLJJII = this.LJIIIZ.LJJII();
                                        }
                                        C1AXI c1axi = c1ax3LIZIZ.LIZ;
                                        OnLineMicInfo onLineMicInfo = mapLJJII.get(posIdentity.value);
                                        if (onLineMicInfo != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
                                            i4 = micPositionInfo.contentType;
                                        }
                                        c1axi.LJIIIZ = i4;
                                    }
                                } else {
                                    c1ax3LIZIZ = LIZIZ(EnumC918810a19.StateIdle);
                                }
                            }
                        } else {
                            c1ax3LIZIZ = LIZIZ(EnumC918810a19.StateIdle);
                        }
                        C1AZW c1azw = C1AZW.LIZ;
                        String strLIZLLL = LIZLLL(370);
                        String str = "getMicWindow pos=" + i2 + " result=" + c1ax3LIZIZ.LIZ.LIZJ;
                        c1azw.getClass();
                        C1AZW.LIZ(strLIZLLL, str, null, null);
                        return c1ax3LIZIZ;
                    }

                    {
                        this.LJIIIZ = interfaceC2181151AXx;
                    }
                };
            }
        }
        C1AYR c1ayr3 = this.LL;
        return new C1AYW(c1ayr3.LIZJ, c1ayr3.LIZLLL, c1ayr3.LJ, c1ayr3.LJFF);
    }
}
