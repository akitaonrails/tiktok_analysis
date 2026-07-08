package X;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCInlineLinkData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.101Q, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101Q {
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C191784101e LIZ(com.ss.android.ugc.tiktok.tuc.model.TUCButtonData r11, X.C101H<? extends X.C07XH> r12) {
        /*
            java.lang.String r3 = r11.title
            java.lang.String r4 = ""
            if (r3 != 0) goto L7
            r3 = r4
        L7:
            java.lang.String r0 = r11.viewID
            if (r0 == 0) goto Lc
            r4 = r0
        Lc:
            java.lang.String r2 = r11.style
            if (r2 == 0) goto L5b
            int r1 = r2.hashCode()
            r0 = -817598092(0xffffffffcf447174, float:-3.2957696E9)
            if (r1 == r0) goto L50
            r0 = -324798127(0xffffffffeca3f951, float:-1.5858582E27)
            if (r1 == r0) goto L45
            r0 = -314765822(0xffffffffed3d0e02, float:-3.65685E27)
            if (r1 != r0) goto L5b
            java.lang.String r0 = "primary"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
            X.101d r5 = X.EnumC191783101d.PRIMARY
        L2d:
            boolean r10 = r11.enableDebouncing
            com.ss.android.ugc.tiktok.tuc.model.TUCProcessData r1 = r11.action
            if (r1 == 0) goto L43
            kotlin.jvm.internal.AwS394S0200000_28 r6 = new kotlin.jvm.internal.AwS394S0200000_28
            r0 = 81
            r6.<init>(r12, r1, r0)
        L3a:
            X.101e r2 = new X.101e
            r7 = 0
            r8 = r7
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L43:
            r6 = 0
            goto L3a
        L45:
            java.lang.String r0 = "constSecondary"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
            X.101d r5 = X.EnumC191783101d.CONST_SECONDARY
            goto L2d
        L50:
            java.lang.String r0 = "secondary"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
            X.101d r5 = X.EnumC191783101d.SECONDARY
            goto L2d
        L5b:
            X.101d r5 = X.EnumC191783101d.PRIMARY
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101Q.LIZ(com.ss.android.ugc.tiktok.tuc.model.TUCButtonData, X.101H):X.101e");
    }

    public static final C722300SUy LIZIZ(TUCIconData tUCIconData, C101H<? extends C07XH> c101h) {
        Integer num = tUCIconData.type;
        Integer numValueOf = null;
        int iLIZLLL = -1;
        if (num != null) {
            if (num.intValue() == 1) {
                int iOrdinal = C0SV1.LOCAL.ordinal();
                String str = tUCIconData.localImageName;
                if (str != null) {
                    iLIZLLL = c101h.LJ(str);
                }
                return new C722300SUy(null, iOrdinal, iLIZLLL, 12);
            }
            if (num.intValue() == 3) {
                int iOrdinal2 = C0SV1.TUX.ordinal();
                String str2 = tUCIconData.tuxIconName;
                if (str2 != null) {
                    iLIZLLL = c101h.LIZLLL(str2);
                }
                String str3 = tUCIconData.tintColorRes;
                if (str3 != null) {
                    numValueOf = Integer.valueOf(c101h.LIZJ(str3));
                }
                return new C722300SUy(numValueOf, iOrdinal2, iLIZLLL, 4);
            }
        }
        return new C722300SUy(null, 0, 0, 15);
    }

    public static final C191791101l LIZJ(TUCLinkTextData tUCLinkTextData, C101H<? extends C07XH> c101h) {
        AwS394S0200000_28 awS394S0200000_28;
        ArrayList arrayList = new ArrayList();
        List<TUCInlineLinkData> list = tUCLinkTextData.links;
        String str = "";
        if (list != null) {
            for (TUCInlineLinkData tUCInlineLinkData : list) {
                String str2 = tUCInlineLinkData.text;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = tUCInlineLinkData.url;
                if (str3 == null) {
                    str3 = "";
                }
                TUCProcessData tUCProcessData = tUCInlineLinkData.action;
                if (tUCProcessData != null) {
                    awS394S0200000_28 = new AwS394S0200000_28((C101H) c101h, (C101H<? extends C07XH>) tUCProcessData, (TUCProcessData) 82);
                } else {
                    awS394S0200000_28 = null;
                }
                arrayList.add(new C191795101p(str2, str3, awS394S0200000_28));
            }
        }
        String str4 = tUCLinkTextData.text;
        if (str4 != null) {
            str = str4;
        }
        return new C191791101l(str, arrayList);
    }

    public static Spanned LIZLLL(C191791101l c191791101l, Context context) {
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZLLL(1);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(43);
        ArrayList arrayList = new ArrayList();
        for (C191795101p c191795101p : c191791101l.LIZIZ) {
            c444940Hca.LIZJ = c191795101p.LIZ;
            c444940Hca.LJIIIIZZ = new AwS572S0100000_28(c191795101p, 893);
            arrayList.add(c444940Hca.LIZ(context));
        }
        String str = c191791101l.LIZ;
        Spannable[] spannableArr = (Spannable[]) arrayList.toArray(new Spannable[0]);
        return C10KE.LIZIZ(str, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }

    public static final void LJ(TUCProcessData tUCProcessData, String str) {
        TUCEventData tUCEventData = tUCProcessData.event;
        if (tUCEventData == null) {
            return;
        }
        Map<String, String> linkedHashMap = tUCEventData.injectExtra;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (str != null) {
            linkedHashMap.put("enter_from", str);
            tUCEventData.setInjectExtra(linkedHashMap);
        }
    }
}
