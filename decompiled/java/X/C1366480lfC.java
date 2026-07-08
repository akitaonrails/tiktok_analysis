package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366480lfC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(C1371590lnR c1371590lnR, C1367850lhP c1367850lhP, Context context, InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        ArrayList<InterfaceC1370450llb> arrayListLJIILIIL;
        C259800zU c259800zU = new C259800zU();
        BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
        C1365560ldi c1365560ldi = new C1365560ldi(context, c1371590lnR, interfaceC1362720lZ8, c259800zU, baseSharePackage);
        C1369880lkg c1369880lkg = new C1369880lkg(context, c1371590lnR, c1367850lhP, interfaceC1362720lZ8, baseSharePackage);
        ArrayList<InterfaceC1370450llb> arrayList = new ArrayList<>();
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        if (interfaceC1366500lfE != null && (arrayListLJIILIIL = interfaceC1366500lfE.LJIILIIL(c1371590lnR)) != null) {
            arrayList = arrayListLJIILIIL;
        }
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LJFF(context, c1371590lnR.LJIJJ, c1371590lnR.LIZ);
        }
        c1367850lhP.LLILZIL = c1371590lnR;
        c1367850lhP.LLILZLL = c1371590lnR.LJIJJ;
        c1367850lhP.LLILLL = arrayList;
        c1367850lhP.LLIZLLLIL = c1365560ldi;
        c1367850lhP.LLJ = c1369880lkg;
        C1370460llc c1370460llc = c1367850lhP.LLILZ;
        if (c1370460llc != null) {
            c1370460llc.LLLFZ(arrayList);
        }
        C1370460llc c1370460llc2 = c1367850lhP.LLILZ;
        if (c1370460llc2 != null) {
            c1370460llc2.notifyDataSetChanged();
        }
    }

    public static void LIZIZ(C1371590lnR c1371590lnR, final C1369580lkC c1369580lkC, String str, Context context, InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        InterfaceC1366490lfD interfaceC1366490lfD;
        C786410Ut5.B0(c1369580lkC, 0);
        if (c1369580lkC.getShowStyle() == EnumC1369720lkQ.COLLAPSE) {
            c1369580lkC.LLJJJ = new InterfaceC1369680lkM() { // from class: X.0lgq
                public final void LIZ(boolean z) {
                    String str2;
                    if (z) {
                        C1369870lkf.LJJIIZ = 1;
                        C1369870lkf.LIZ.clear();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("panel_source", c1369580lkC.getEnterMethod());
                    if (z) {
                        str2 = "expand";
                    } else {
                        str2 = "close";
                    }
                    linkedHashMap.put("enter_method", str2);
                    InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
                    if (interfaceC1367490lgp != null) {
                        interfaceC1367490lgp.LIZ("click_more_external_share", linkedHashMap);
                    }
                }

                @Override // X.InterfaceC1369680lkM
                public final void LIZIZ(int i) {
                    c1369580lkC.LIZIZ(i);
                    LIZ(true);
                }

                @Override // X.InterfaceC1369680lkM
                public final void LJIIJ(int i) {
                    c1369580lkC.LJIIJ(i);
                    LIZ(false);
                }
            };
        }
        c1369580lkC.LJIIZILJ(c1371590lnR.LIZ, false);
        c1369580lkC.LLJJ = new C1365560ldi(context, c1371590lnR, interfaceC1362720lZ8, new C259800zU(), c1371590lnR.LJIJJ);
        if (Intrinsics.LJFF(str, "first_panel") && (interfaceC1366490lfD = c1371590lnR.LJJIFFI) != null) {
            interfaceC1366490lfD.LJFF(context, c1371590lnR.LJIJJ, c1371590lnR.LIZ);
        }
    }

    public static void LIZ(boolean z, C1371590lnR c1371590lnR, InterfaceC1369790lkX interfaceC1369790lkX, int i, Context context, InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIIZ(true, c1371590lnR.LJIJJ, i);
        C786410Ut5.LJJJI("clicked_channel_position", String.valueOf(i), c1371590lnR.LJIJJ.extras);
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZ(interfaceC1369790lkX, z, c1371590lnR.LJIJJ, context);
        }
        if ((!interfaceC1369790lkX.LIZJ() || interfaceC1369790lkX.LJJJLIIL()) && !interfaceC1369790lkX.LJJLIIIJJI() && c1371590lnR.LJIJJ.LIZLLL(interfaceC1369790lkX)) {
            interfaceC1362720lZ8.F8(new C572640Md4());
        }
    }
}
