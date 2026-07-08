package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.tasm.TemplateData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548310qOT extends AbstractC1548320qOU {
    public C1540620qC4 LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C1540620qC4 c1540620qC4 = this.LLILLL;
        if (c1540620qC4 != null) {
            c1540620qC4.LJJIFFI("");
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        long jLongValue;
        C1540620qC4 c1540620qC4;
        InterfaceC1548390qOb interfaceC1548390qOb;
        long jLongValue2;
        InterfaceC1548330qOV interfaceC1548330qOV = (InterfaceC1548330qOV) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            containerID = "";
        }
        String eventName = interfaceC1548330qOV.getEventName();
        if (eventName == null) {
            eventName = "";
        }
        Number timestamp = interfaceC1548330qOV.getTimestamp();
        if (timestamp != null) {
            jLongValue = timestamp.longValue();
        } else {
            jLongValue = -1;
        }
        List<InterfaceC1548340qOW> eventNames = interfaceC1548330qOV.getEventNames();
        if (eventNames == null) {
            eventNames = C13BV.INSTANCE;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            c1540620qC4 = (C1540620qC4) interfaceC634840OvC2.LIZIZ(C1540620qC4.class);
        } else {
            c1540620qC4 = null;
        }
        this.LLILLL = c1540620qC4;
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            interfaceC1548390qOb = (InterfaceC1548390qOb) interfaceC634840OvC3.LIZIZ(InterfaceC1548390qOb.class);
        } else {
            interfaceC1548390qOb = null;
        }
        C1529870puj.LIZ.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID);
        LIZJ(interfaceC1548330qOV.getBySharedData(), interfaceC1548330qOV.getSubscribeGlobalEvent(), eventName, jLongValue, interfaceC1548390qOb, interfaceC1541990qEHLJFF);
        for (InterfaceC1548340qOW interfaceC1548340qOW : eventNames) {
            Boolean bySharedData = interfaceC1548340qOW.getBySharedData();
            Boolean subscribeGlobalEvent = interfaceC1548340qOW.getSubscribeGlobalEvent();
            String eventName2 = interfaceC1548340qOW.getEventName();
            Number timestamp2 = interfaceC1548340qOW.getTimestamp();
            if (timestamp2 != null) {
                jLongValue2 = timestamp2.longValue();
            } else {
                jLongValue2 = -1;
            }
            LIZJ(bySharedData, subscribeGlobalEvent, eventName2, jLongValue2, interfaceC1548390qOb, interfaceC1541990qEHLJFF);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1548380qOa.class, null), "");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0foN, X.0qOX, java.lang.Object] */
    public final void LIZJ(Boolean bool, Boolean bool2, final String str, long j, final InterfaceC1548390qOb interfaceC1548390qOb, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1548290qOR c1548290qOR;
        C1537480q70 hybridContext;
        C1537480q70 hybridContext2;
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool3)) {
            if (Intrinsics.LJFF(bool2, bool3)) {
                if (interfaceC1541990qEH == null || (hybridContext2 = interfaceC1541990qEH.getHybridContext()) == null || (c1548290qOR = (C1548290qOR) hybridContext2.LJFF(C1548290qOR.class)) == null) {
                    c1548290qOR = new C1548290qOR(null);
                }
                ?? r2 = new InterfaceC1141530foN() { // from class: X.0qOX
                    @Override // X.InterfaceC1141530foN
                    public final void mh2(C262100zr c262100zr) {
                        Map<String, Object> mapLIZ;
                        C1540620qC4 c1540620qC4 = this.LL.LLILLL;
                        if (c1540620qC4 != null) {
                            String str2 = str;
                            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                            if (interfaceC1107590evd != null) {
                                mapLIZ = interfaceC1107590evd.LIZ();
                            } else {
                                mapLIZ = null;
                            }
                            c1540620qC4.LJIL(TemplateData.LJII(mapLIZ), str2, false);
                        }
                    }
                };
                c1548290qOR.LIZ.add(new C1548300qOS(str, r2));
                if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                    hybridContext.LJJ(C1548290qOR.class, c1548290qOR);
                }
                C1548820qPI.LIZLLL(str, r2);
                C1540620qC4 c1540620qC4 = this.LLILLL;
                if (c1540620qC4 != null) {
                    if (C1535880q4Q.LIZ) {
                        c1540620qC4.LJJIII.add(new Pair<>(str, r2));
                    } else {
                        c1540620qC4.LJJII.put(str, (InterfaceC1141530foN) r2);
                    }
                }
            }
            C1540620qC4 c1540620qC42 = this.LLILLL;
            if (c1540620qC42 != null) {
                c1540620qC42.LJIILLIIL.LIZIZ(new C0OV4(null, j, new InterfaceC1548390qOb() { // from class: X.0qOY
                    @Override // X.InterfaceC1548390qOb
                    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str2) {
                        Map<String, Object> mapLIZ;
                        C1540620qC4 c1540620qC43 = this.LL.LLILLL;
                        if (c1540620qC43 != null) {
                            if (interfaceC1107590evd != null) {
                                mapLIZ = interfaceC1107590evd.LIZ();
                            } else {
                                mapLIZ = null;
                            }
                            c1540620qC43.LJIL(TemplateData.LJII(mapLIZ), str2, false);
                        }
                    }
                }, interfaceC1541990qEH), str);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(bool2, bool3)) {
            InterfaceC1141530foN interfaceC1141530foN = new InterfaceC1141530foN() { // from class: X.0qOZ
                @Override // X.InterfaceC1141530foN
                public final void mh2(C262100zr c262100zr) {
                    InterfaceC1548390qOb interfaceC1548390qOb2 = interfaceC1548390qOb;
                    if (interfaceC1548390qOb2 != null) {
                        interfaceC1548390qOb2.H4(c262100zr.LIZIZ, c262100zr.LIZ);
                    }
                }
            };
            C1548820qPI.LIZLLL(str, interfaceC1141530foN);
            C1540620qC4 c1540620qC43 = this.LLILLL;
            if (c1540620qC43 != null) {
                if (C1535880q4Q.LIZ) {
                    c1540620qC43.LJJIII.add(new Pair<>(str, interfaceC1141530foN));
                } else {
                    c1540620qC43.LJJII.put(str, interfaceC1141530foN);
                }
            }
        }
        C1540620qC4 c1540620qC44 = this.LLILLL;
        if (c1540620qC44 == null) {
            return;
        }
        c1540620qC44.LJIILLIIL.LIZIZ(new C0OV4(null, j, interfaceC1548390qOb, interfaceC1541990qEH), str);
    }
}
