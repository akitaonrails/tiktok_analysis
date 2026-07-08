package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AwS32S2200000_10;

/* JADX INFO: renamed from: X.0Qam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673140Qam {
    public static final /* synthetic */ int LIZ = 0;

    public static C676920Qgs LIZ(SearchResultParam searchResultParam, boolean z, String str, String str2) {
        boolean z2;
        C676920Qgs c676920Qgs;
        String str3;
        String str4;
        String str5;
        boolean zLIZ = C650150Pen.LIZ(searchResultParam);
        boolean zLIZ2 = C07KC.LIZ();
        if (C293700BfE.LIZ() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ3 = C0QV7.LIZ();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_search_top_tab_layout_state_fix", true, true)) {
            if (!zLIZ) {
                c676920Qgs = new C676920Qgs("FixDisabledNotMallEntry", false, false, z, zLIZ2, z2, zLIZ3, false);
            } else if (!zLIZ2) {
                c676920Qgs = new C676920Qgs("FixDisabledTopBarHideDisabled", false, true, z, false, z2, zLIZ3, false);
            } else if (z2) {
                if (zLIZ3) {
                    str5 = "FixDisabledSimpleTabFollowFingerEnabled";
                } else {
                    str5 = "FixDisabledSimpleTabFollowFingerDisabled";
                }
                c676920Qgs = new C676920Qgs(str5, zLIZ3, true, z, true, true, zLIZ3, false);
            } else {
                boolean z3 = !z;
                if (z) {
                    str4 = "FixDisabledSingleTabDisabled";
                } else {
                    str4 = "FixDisabledMultiTabSupportsCollapse";
                }
                c676920Qgs = new C676920Qgs(str4, z3, true, z, true, false, zLIZ3, false);
            }
        } else if (z) {
            c676920Qgs = new C676920Qgs("SingleTabDisabled", false, zLIZ, true, zLIZ2, z2, zLIZ3, true);
        } else if (!zLIZ) {
            c676920Qgs = new C676920Qgs("NotMallEntry", false, false, false, zLIZ2, z2, zLIZ3, true);
        } else if (!zLIZ2) {
            c676920Qgs = new C676920Qgs("TopBarHideDisabled", false, true, false, false, z2, zLIZ3, true);
        } else if (z2) {
            if (zLIZ3) {
                str3 = "SimpleTabFollowFingerEnabled";
            } else {
                str3 = "SimpleTabFollowFingerDisabled";
            }
            c676920Qgs = new C676920Qgs(str3, zLIZ3, true, false, true, true, zLIZ3, true);
        } else {
            c676920Qgs = new C676920Qgs("MultiTabSupportsCollapse", true, true, false, true, false, zLIZ3, true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        C1931907hV.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new AwS32S2200000_10(c676920Qgs, str, str2, searchResultParam, 3));
        return c676920Qgs;
    }
}
