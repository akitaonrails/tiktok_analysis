package X;

import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20742116Ep {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(String str, a.c cVar, InterfaceC20742616Eu interfaceC20742616Eu) {
        switch (str.hashCode()) {
            case -1926202173:
                if (str.equals("app:tux_badgeVariant")) {
                    String str2 = cVar.LIZ;
                    if (Intrinsics.LJFF(str2, "dot")) {
                        interfaceC20742616Eu.setVariant(0);
                        return true;
                    }
                    if (Intrinsics.LJFF(str2, "number")) {
                        interfaceC20742616Eu.setVariant(1);
                        return true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can not parse tux_badgeVariant: unknown value ");
                    sbLIZ.append(cVar.LIZ);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            case -319391448:
                if (str.equals("app:tux_badgeDotSize")) {
                    interfaceC20742616Eu.setDotSize((int) ec.a.LIZJ(((View) interfaceC20742616Eu).getContext(), cVar));
                    return true;
                }
                return false;
            case 1183102157:
                if (str.equals("app:tux_badgeCount")) {
                    interfaceC20742616Eu.setCount(CastIntegerProtector.parseInt(cVar.LIZ));
                    return true;
                }
                return false;
            case 2048955789:
                if (str.equals("app:tux_badgeMaxCount")) {
                    String str3 = cVar.LIZ;
                    if (str3 != null) {
                        switch (str3.hashCode()) {
                            case -1375924450:
                                if (str3.equals("max99plus")) {
                                    interfaceC20742616Eu.setMaxCount(2);
                                    return true;
                                }
                                break;
                            case 245332047:
                                if (str3.equals("max999plus")) {
                                    interfaceC20742616Eu.setMaxCount(3);
                                    return true;
                                }
                                break;
                            case 372892271:
                                if (str3.equals("max9plus")) {
                                    interfaceC20742616Eu.setMaxCount(1);
                                    return true;
                                }
                                break;
                            case 1887918305:
                                if (str3.equals("unlimited")) {
                                    interfaceC20742616Eu.setMaxCount(0);
                                    return true;
                                }
                                break;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("can not parse tux_badgeMaxCount: unknown value ");
                    sbLIZ2.append(cVar.LIZ);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return false;
            default:
                return false;
        }
    }
}
