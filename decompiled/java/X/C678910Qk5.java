package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678910Qk5 extends AbstractC644860PRc {
    @Override // X.AbstractC644860PRc
    public final InterfaceC644890PRf LJ(ViewGroup viewGroup, ComponentInfo componentInfo) {
        return null;
    }

    @Override // X.AbstractC644860PRc
    public final int LJFF() {
        return R.layout.evu;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678910Qk5.LJIIIIZZ():void");
    }

    @Override // X.AbstractC644860PRc, X.InterfaceC644890PRf
    public final void init() {
        super.init();
        LJIIIIZZ();
    }

    @Override // X.AbstractC644860PRc
    public final void LJII() {
        LJIIIIZZ();
    }

    @Override // X.AbstractC644860PRc
    public final boolean LIZLLL(ComponentInfo componentInfo) {
        QueryCorrectComponentInfo queryCorrectComponentInfo;
        QueryCorrectComponentInfo queryCorrectComponentInfo2;
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        QueryDesc queryDescLIZIZ;
        String str5;
        String str6;
        QueryDesc queryDescLIZIZ2;
        String str7;
        QueryDesc queryDescLIZIZ3;
        QueryDesc queryDescLIZIZ4;
        BizData bizData = this.LIZ.bizData;
        String str8 = null;
        if (bizData != null) {
            queryCorrectComponentInfo = bizData.queryCorrectInfo;
        } else {
            queryCorrectComponentInfo = null;
        }
        BizData bizData2 = componentInfo.bizData;
        if (bizData2 != null) {
            queryCorrectComponentInfo2 = bizData2.queryCorrectInfo;
        } else {
            queryCorrectComponentInfo2 = null;
        }
        if (queryCorrectComponentInfo2 == queryCorrectComponentInfo) {
            return false;
        }
        if (queryCorrectComponentInfo != null) {
            Integer numValueOf2 = Integer.valueOf(queryCorrectComponentInfo.correctLevel);
            if (queryCorrectComponentInfo2 != null) {
                numValueOf = Integer.valueOf(queryCorrectComponentInfo2.correctLevel);
            } else {
                numValueOf = null;
            }
            if (numValueOf2.equals(numValueOf) && (str = queryCorrectComponentInfo.correctedQuery) != null) {
                if (queryCorrectComponentInfo2 != null) {
                    str2 = queryCorrectComponentInfo2.correctedQuery;
                } else {
                    str2 = null;
                }
                if (str.equals(str2) && (str3 = queryCorrectComponentInfo.originalQuery) != null) {
                    if (queryCorrectComponentInfo2 != null) {
                        str4 = queryCorrectComponentInfo2.originalQuery;
                    } else {
                        str4 = null;
                    }
                    if (str3.equals(str4) && (queryDescLIZIZ = C643130PKl.LIZIZ(queryCorrectComponentInfo, "correct")) != null && (str5 = queryDescLIZIZ.text) != null) {
                        if (queryCorrectComponentInfo2 != null && (queryDescLIZIZ4 = C643130PKl.LIZIZ(queryCorrectComponentInfo2, "correct")) != null) {
                            str6 = queryDescLIZIZ4.text;
                        } else {
                            str6 = null;
                        }
                        if (str5.equals(str6) && (queryDescLIZIZ2 = C643130PKl.LIZIZ(queryCorrectComponentInfo, "origin")) != null && (str7 = queryDescLIZIZ2.text) != null) {
                            if (queryCorrectComponentInfo2 != null && (queryDescLIZIZ3 = C643130PKl.LIZIZ(queryCorrectComponentInfo2, "origin")) != null) {
                                str8 = queryDescLIZIZ3.text;
                            }
                            if (str7.equals(str8)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public C678910Qk5(ViewGroup viewGroup, ComponentInfo componentInfo) {
        super(viewGroup, componentInfo);
    }

    public final void LJIIJ(QueryCorrectComponentInfo queryCorrectComponentInfo, String str, boolean z) {
        String str2;
        String str3;
        Map<String, String> map;
        C1440005kM.LIZ(new C668900QLo(str));
        if (z) {
            str2 = "origin";
        } else {
            str2 = "correct";
        }
        QueryDesc queryDescLIZIZ = C643130PKl.LIZIZ(queryCorrectComponentInfo, str2);
        if (queryDescLIZIZ != null && (map = queryDescLIZIZ.eventParam) != null) {
            str3 = map.get("click_type");
        } else {
            str3 = null;
        }
        int i = queryCorrectComponentInfo.correctLevel;
        String str4 = queryCorrectComponentInfo.correctedQuery;
        String str5 = queryCorrectComponentInfo.originalQuery;
        if (str3 == null) {
            if (z) {
                str3 = "original_keyword";
            } else {
                str3 = "corrected_keyword";
            }
        }
        LJIIIZ(i, "click", str4, str5, str3);
    }

    public final void LJIIIZ(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        View view = this.LIZLLL;
        if (view != null && (iSearchContextAbilityLIZ = C0Q3E.LIZ(view)) != null && (c0pcyPh1 = iSearchContextAbilityLIZ.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str6 = c0prc.LLILLL;
        } else {
            str6 = null;
        }
        C678950Qk9 c678950Qk9 = new C678950Qk9();
        c678950Qk9.LJIIZILJ("action_type", str);
        c678950Qk9.LJIIZILJ("log_pb", C584850Mwl.LIZ.LJ(str6));
        c678950Qk9.LJIIZILJ("correction_type", str5);
        c678950Qk9.LJIIZILJ("impr_id", str6);
        c678950Qk9.LJIIZILJ("corrected_keyword", str2);
        c678950Qk9.LJIIZILJ("original_keyword", str3);
        c678950Qk9.LJIIZILJ("click_type", str4);
        c678950Qk9.LJIILJJIL();
    }
}
