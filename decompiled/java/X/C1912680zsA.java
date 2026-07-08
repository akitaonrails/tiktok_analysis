package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.experiment.PoiThirdPartyDisclaimerSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS9S3100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912680zsA {
    public static final C1912680zsA LIZ = new C1912680zsA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(767));

    public static PoiThirdPartyDisclaimerSettings.DisclaimerData LIZ() {
        return (PoiThirdPartyDisclaimerSettings.DisclaimerData) LIZIZ.getValue();
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        Object objOpt;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("enter_method", str2, linkedHashMap);
        C1189060h32.LJJ("button_name", str4, linkedHashMap);
        if (str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        linkedHashMap.put(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C20684815ws.LJIILLIIL("click_disclaimer_panel", linkedHashMap);
    }

    public static void LIZJ(C1912680zsA c1912680zsA, Context context, FragmentManager fragmentManager, EnumC1779910wQ1 enumC1779910wQ1, final String str, final String str2, final String str3, AwS429S0200000_28 awS429S0200000_28, int i) {
        boolean z;
        Object objOpt;
        CharSequence charSequenceConcat;
        AwS429S0200000_28 awS429S0200000_282 = awS429S0200000_28;
        if ((i & 256) != 0) {
            awS429S0200000_282 = null;
        }
        c1912680zsA.getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_disclaimer_interaction_opt", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        C770750ULh c770750ULh = new C770750ULh();
        if (Intrinsics.LJFF(LIZ().useLogo, Boolean.TRUE)) {
            C0HTI c0hti = new C0HTI();
            PoiThirdPartyDisclaimerSettings.LIZ.getClass();
            Intrinsics.LJFF(PoiThirdPartyDisclaimerSettings.LIZ().logoKey, "Data_Privacy_Light");
            c0hti.LIZ = R.drawable.f622p2;
            c770750ULh.LIZ = c0hti.LIZ(context);
            c770750ULh.LIZLLL = 2;
        }
        String str4 = LIZ().title;
        if (str4 != null) {
            c770750ULh.LJ = str4;
        }
        String str5 = LIZ().subTitle;
        if (str5 != null) {
            c770750ULh.LJFF = str5;
        }
        ArrayList arrayList = new ArrayList();
        List<PoiThirdPartyDisclaimerSettings.Content> list = LIZ().contentList;
        if (list != null) {
            int i2 = 0;
            for (PoiThirdPartyDisclaimerSettings.Content content : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PoiThirdPartyDisclaimerSettings.Content content2 = content;
                    if ((i2 != 0 || enumC1779910wQ1 != EnumC1779910wQ1.CLAIM) && (charSequenceConcat = content2.contentFormat) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        List<PoiThirdPartyDisclaimerSettings.HighLightWord> list2 = content2.highLightWords;
                        if (list2 != null) {
                            for (PoiThirdPartyDisclaimerSettings.HighLightWord highLightWord : list2) {
                                String str6 = highLightWord.name;
                                if (str6 != null) {
                                    arrayList2.add(new Pair(str6, highLightWord.url));
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            int i4 = 0;
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(charSequenceConcat, new String[]{"%s"}, 0, 6);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : listLJJLIIIJILLIZJL) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    arrayList3.add(obj);
                                    Pair pair = (Pair) C13LP.LJJJLZIJ(i4, arrayList2);
                                    if (pair != null) {
                                        C444940Hca c444940Hca = new C444940Hca();
                                        c444940Hca.LIZJ = (String) pair.getFirst();
                                        c444940Hca.LIZIZ(42);
                                        c444940Hca.LIZIZ = false;
                                        c444940Hca.LIZLLL(5);
                                        c444940Hca.LJI = true;
                                        c444940Hca.LJIIIIZZ = new AwS429S0200000_28(context, pair, 164);
                                        arrayList3.add(c444940Hca.LIZ(context));
                                    }
                                    i4 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            CharSequence[] charSequenceArr = (CharSequence[]) arrayList3.toArray(new CharSequence[0]);
                            charSequenceConcat = TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
                        }
                        arrayList.add(new C345890DhD(charSequenceConcat, content2.hasDot));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            c770750ULh.LIZLLL(arrayList);
        }
        int i6 = C1779920wQ2.LIZ[enumC1779910wQ1.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                c770750ULh.LJI(LIZ().jumpBtnWord, new AwS9S3100000_28(str, awS429S0200000_282, str2, str3, 2));
            } else {
                throw new C1954807lC();
            }
        } else {
            c770750ULh.LJI(LIZ().clickBtnWord, new AwS9S3100000_28(str, awS429S0200000_282, str2, str3, 1));
        }
        c770750ULh.LJIILLIIL = true;
        boolean z2 = true ^ z;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = z2;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = z2;
        final Function0 function0 = null;
        tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0zsB
            /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
            @Override // android.content.DialogInterface.OnCancelListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCancel(android.content.DialogInterface r7) {
                /*
                    r6 = this;
                    kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2
                    if (r0 == 0) goto L7
                    r0.invoke()
                L7:
                    X.0zsA r5 = X.C1912680zsA.LIZ
                    java.lang.String r4 = r1
                    java.lang.String r3 = r3
                    java.lang.String r2 = r4
                    java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
                    X.0De4 r1 = X.C1391190mJ3.LJIIJ(r7)
                    r5.getClass()
                    if (r1 == 0) goto L3e
                    X.0De7 r0 = X.C343970De7.LIZ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L28
                    java.lang.String r0 = "blank"
                L24:
                    X.C1912680zsA.LIZIZ(r4, r3, r2, r0)
                    return
                L28:
                    X.0De6 r0 = X.C343960De6.LIZ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L33
                    java.lang.String r0 = "slide_to_exit"
                    goto L24
                L33:
                    X.0De8 r0 = X.C343980De8.LIZ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L3e
                    java.lang.String r0 = "cancel"
                    goto L24
                L3e:
                    r0 = 0
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnCancelListenerC1912690zsB.onCancel(android.content.DialogInterface):void");
            }
        };
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(null, 19);
        tuxSheet.show(fragmentManager, "poi_third_party_disclaimer");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("enter_method", str2, linkedHashMap);
        if (str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        linkedHashMap.put(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C20684815ws.LJIILLIIL("show_disclaimer_panel", linkedHashMap);
    }
}
