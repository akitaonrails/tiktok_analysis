package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PMF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PMF {
    public static void LIZ(Fragment fragment, C0PME c0pme) {
        String str;
        C0PMG c0pmg;
        int originType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Processing schema: ");
        DynamicPatch dynamicPatch = c0pme.LIZIZ;
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        DynamicPatch dynamicPatch2 = c0pme.LIZIZ;
        if (dynamicPatch2 != null && (originType = dynamicPatch2.getOriginType()) != 0 && originType != 80) {
            if (originType == 81) {
                c0pmg = new C0PMG() { // from class: X.0Q1S
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:102:0x019f  */
                    /* JADX WARN: Removed duplicated region for block: B:137:0x0233  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
                    /* JADX WARN: Type inference failed for: r1v16 */
                    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.fragment.app.Fragment] */
                    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.fragment.app.Fragment] */
                    /* JADX WARN: Type inference failed for: r5v10 */
                    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.fragment.app.Fragment] */
                    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.fragment.app.Fragment] */
                    /* JADX WARN: Type inference failed for: r9v1, types: [X.19EG, android.app.Activity] */
                    /* JADX WARN: Type inference failed for: r9v2, types: [android.content.Context] */
                    /* JADX WARN: Type inference failed for: r9v6 */
                    @Override // X.C0PMG
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(final androidx.fragment.app.Fragment r14, final X.C0PME r15) {
                        /*
                            Method dump skipped, instruction units count: 910
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0Q1S.LIZ(androidx.fragment.app.Fragment, X.0PME):void");
                    }
                };
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unknown DynamicPatch's origin_type: ");
                sbLIZ2.append(originType);
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            c0pmg = new C0PMG() { // from class: X.0PMD
                @Override // X.C0PMG
                public final void LIZ(Fragment fragment2, C0PME c0pme2) {
                    View viewFindViewById;
                    C648830Pcf c648830Pcf;
                    String str2;
                    boolean z;
                    int i;
                    C644910PRh c644910PRhLIZJ;
                    C644910PRh c644910PRhLIZJ2;
                    View view = c0pme2.LJ;
                    String str3 = null;
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.gdi);
                    } else {
                        viewFindViewById = null;
                    }
                    if ((viewFindViewById instanceof C648830Pcf) && (c648830Pcf = (C648830Pcf) viewFindViewById) != null) {
                        c648830Pcf.setOnVisibleChanged(new AwS589S0100000_10(c0pme2, 659));
                        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
                        if (interfaceC649890PeNLIZ != null && (c644910PRhLIZJ2 = interfaceC649890PeNLIZ.LIZJ()) != null) {
                            str2 = c644910PRhLIZJ2.LIZ;
                        } else {
                            str2 = null;
                        }
                        String strLJIILIIL = C644560PPy.LJIILIIL(c0pme2.LIZLLL);
                        InterfaceC649890PeN interfaceC649890PeNLIZ2 = C664290Q3v.LIZ();
                        if (interfaceC649890PeNLIZ2 != null && (c644910PRhLIZJ = interfaceC649890PeNLIZ2.LIZJ()) != null) {
                            str3 = c644910PRhLIZJ.LIZJ;
                        }
                        Pair[] pairArr = new Pair[4];
                        String str4 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        pairArr[0] = new Pair("search_id", str2);
                        pairArr[1] = new Pair("search_type", strLJIILIIL);
                        String str5 = c0pme2.LIZJ;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        pairArr[2] = new Pair("use_scenario", str4);
                        if (str3 == null) {
                            str3 = "else";
                        }
                        pairArr[3] = new Pair("tns_ban_type", str3);
                        c648830Pcf.LIZ(fragment2, c0pme2.LIZIZ, C2097608Jq.LJIIIIZZ(pairArr));
                        C0P6Y c0p6y = c0pme2.LJII;
                        if (c0p6y != null) {
                            if (c648830Pcf.getVisibility() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            if (boolValueOf != null) {
                                boolValueOf.booleanValue();
                                if (!Intrinsics.LJFF(boolValueOf, Boolean.valueOf(c0p6y.LLILLJJLI))) {
                                    c0p6y.LLILLJJLI = boolValueOf.booleanValue();
                                    LiveData liveData = (LiveData) c0p6y.LLILLL.getValue();
                                    if (boolValueOf.booleanValue()) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    liveData.setValue(i);
                                }
                            }
                        }
                    }
                }
            };
        }
        c0pmg.LIZ(fragment, c0pme);
    }
}
