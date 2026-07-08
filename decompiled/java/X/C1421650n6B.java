package X;

import c1b.m;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionalInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.DescRawData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0n6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421650n6B {
    public static final /* synthetic */ C1421650n6B LIZ = new C1421650n6B();
    public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("spec", "video", "size_guide", "desc");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[PHI: r0
      0x008b: PHI (r0v76 c1b.q0) = (r0v79 c1b.q0), (r0v80 c1b.q0), (r0v81 c1b.q0), (r0v70 c1b.q0) binds: [B:40:0x0088, B:160:0x0328, B:59:0x0133, B:57:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(X.C1421680n6E r31, X.InterfaceC497601wk r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421650n6B.LIZJ(X.0n6E, X.01wk):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(java.util.List r14, float r15, float r16) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421650n6B.LIZIZ(java.util.List, float, float):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(DescRawData descRawData, AbstractC1406680mi2 abstractC1406680mi2, List list, m mVar, List list2) {
        List<InterfaceC1059904Cn> listLIZJ = abstractC1406680mi2.LIZJ();
        if (!listLIZJ.isEmpty()) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                ((ArrayList) list2).add(new C1406720mi6((CharSequence) null, "sub_title", Integer.valueOf(mVar.LJLLILLLL()), 0, (String) (0 == true ? 1 : 0), (LogisticLinkRichText) (0 == true ? 1 : 0), (ECRichText) (0 == true ? 1 : 0), true, (m) (0 == true ? 1 : 0), 761));
                arrayList.add("description");
            }
        }
        C19719612Di.LJJI(listLIZJ, list2);
        List<AdditionInfo> list3 = descRawData.additionInfo;
        if (list3 != null) {
            for (AdditionInfo additionInfo : list3) {
                String str = additionInfo.title;
                if (str == null) {
                    str = "";
                }
                Integer num = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                int i = 0;
                Object[] objArr5 = 0;
                int i2 = 1020;
                ArrayList arrayList2 = (ArrayList) list2;
                arrayList2.add(new C1406720mi6((CharSequence) str, "title", (Integer) null, 0, (String) (0 == true ? 1 : 0), (LogisticLinkRichText) (0 == true ? 1 : 0), (ECRichText) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (m) (0 == true ? 1 : 0), i2));
                List<AdditionalInfoItem> list4 = additionInfo.items;
                if (list4 != null) {
                    for (AdditionalInfoItem additionalInfoItem : list4) {
                        String str2 = additionalInfoItem.key;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = additionalInfoItem.values;
                        if (str3 == null) {
                            str3 = "";
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(str3);
                        arrayList2.add(new C1406720mi6(C1744700vVE.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), new C1421710n6H(str2, R.color.da), new C1421710n6H(str3, R.color.dg)), "text", num, i, (String) (objArr4 == true ? 1 : 0), (LogisticLinkRichText) (objArr3 == true ? 1 : 0), (ECRichText) (objArr2 == true ? 1 : 0), (boolean) (objArr5 == true ? 1 : 0), (m) (objArr == true ? 1 : 0), i2));
                    }
                }
            }
        }
    }
}
