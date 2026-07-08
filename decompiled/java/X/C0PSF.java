package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PSF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSF {
    public String LIZ;
    public String LIZIZ;
    public String LJFF;
    public C0QER LJI;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public SearchResultParam LJIIZILJ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public boolean LJII = true;
    public C0PSX LJIILIIL = C0PSX.DEFAULT;
    public String LJIJ = "";
    public String LJIJI = "";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r2.equals("search_sug") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r2.equals("related_search_keyword") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.equals("recom_search") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C653740Pka r4) {
        /*
            r3 = this;
            java.lang.String r2 = r3.LIZJ
            int r0 = r2.hashCode()
            switch(r0) {
                case -1816950631: goto L36;
                case -1191929626: goto L2d;
                case -710131922: goto L24;
                case 3452698: goto L19;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = r3.LIZJ
        Lb:
            if (r1 == 0) goto L13
        Ld:
            int r0 = r1.length()
            if (r0 != 0) goto L15
        L13:
            java.lang.String r1 = r3.LJIIL
        L15:
            r4.LJIJJLI(r1)
            return
        L19:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r1 = r3.LJIIL
            goto Lb
        L24:
            java.lang.String r1 = "search_sug"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        L2d:
            java.lang.String r1 = "related_search_keyword"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        L36:
            java.lang.String r1 = "recom_search"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PSF.LIZIZ(X.0Pka):void");
    }

    public final void LIZ(C653740Pka c653740Pka, Fragment fragment, C19EG c19eg) {
        String str;
        String enterSearchFrom;
        C664000Q2s c664000Q2s;
        String str2;
        String str3;
        String str4;
        String lastSearchId;
        String enterFromSub;
        String captionRating;
        int i;
        Map<String, String> linkedHashMap;
        Map<String, String> linkedHashMap2;
        Map<String, String> linkedHashMap3;
        C0PSG filterOption;
        ResearchFilterStruct researchFilterOption;
        C0PSG filterOption2;
        SubFilterOptionStruct categoryOption;
        C0PSG filterOption3;
        List<SubSwitchStruct> activitySwitchOption;
        C0PSG filterOption4;
        SubFilterOptionStruct sortTypeStruct;
        C0PSG filterOption5;
        SubFilterOptionStruct filterByStruct;
        ISearchContextAbility iSearchContextAbilityLIZIZ;
        C0PCY<C647460PaS> c0pcyGX;
        C647460PaS c647460PaS;
        Map<String, String> map;
        String captionRating2;
        String enterFromSub2;
        String utmSource;
        String utmSource2;
        String eventKeyword;
        String eventKeyword2;
        C664030Q2v c664030Q2v;
        C664000Q2s c664000Q2s2;
        C664000Q2s c664000Q2s3;
        C650940Pg4 c650940Pg4;
        Map<String, String> map2;
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, c19eg);
        if (c650960Pg6LJII != null && (c650940Pg4 = c650960Pg6LJII.searchEventModel) != null && (map2 = c650940Pg4.extraLogParams) != null) {
            str = map2.get("previous_page");
        } else {
            str = null;
        }
        c653740Pka.LJIIZILJ("search_keyword", this.LIZIZ);
        c653740Pka.LJIIZILJ("request_id", this.LJFF);
        c653740Pka.LJIIZILJ("log_pb", C584850Mwl.LIZ.LIZIZ(this.LJFF));
        c653740Pka.LJIIZILJ("impr_id", this.LJFF);
        c653740Pka.LJIIZILJ("search_type", this.LIZ);
        C0QER c0qer = this.LJI;
        if (c0qer != null) {
            enterSearchFrom = c0qer.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        c653740Pka.LJIJJ(enterSearchFrom);
        if (str == null || !C123100dR.LIZ(str)) {
            if (c650960Pg6LJII != null && (c664000Q2s = c650960Pg6LJII.searchCommonModel) != null) {
                str = c664000Q2s.previousPage;
            } else {
                str = null;
            }
        }
        c653740Pka.LJIIZILJ("previous_page", str);
        if (c650960Pg6LJII != null && (c664000Q2s3 = c650960Pg6LJII.searchCommonModel) != null) {
            str2 = c664000Q2s3.takoProcessId;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            c653740Pka.LJ("process_id", str2);
        }
        if (c650960Pg6LJII != null && (c664000Q2s2 = c650960Pg6LJII.searchCommonModel) != null) {
            str3 = c664000Q2s2.takoMessageId;
        } else {
            str3 = null;
        }
        if (C123100dR.LIZ(str3)) {
            c653740Pka.LJ("message_id", str3);
        }
        C0Q2M.LIZ.getClass();
        c653740Pka.LJIIZILJ("group_id", C0Q2M.LJIIL());
        if (c650960Pg6LJII != null && (c664030Q2v = c650960Pg6LJII.searchVideoModel) != null) {
            str4 = c664030Q2v.authorId;
        } else {
            str4 = null;
        }
        c653740Pka.LJIIZILJ("author_id", str4);
        c653740Pka.LJIIZILJ("is_success", String.valueOf(this.LJII ? 1 : 0));
        C644490PPr.LIZ.getClass();
        String str5 = C644490PPr.LIZIZ;
        SearchResultParam searchResultParam = this.LJIIZILJ;
        if (searchResultParam != null) {
            lastSearchId = searchResultParam.getLastSearchId();
        } else {
            lastSearchId = null;
        }
        if (C123100dR.LIZ(lastSearchId)) {
            c653740Pka.LJJJJIZL(lastSearchId);
        } else if (C123100dR.LIZ(str5)) {
            c653740Pka.LJJJJIZL(str5);
        } else {
            c653740Pka.LJJJJIZL("");
        }
        SearchResultParam searchResultParam2 = this.LJIIZILJ;
        if (searchResultParam2 != null && (eventKeyword = searchResultParam2.getEventKeyword()) != null && eventKeyword.length() != 0) {
            SearchResultParam searchResultParam3 = this.LJIIZILJ;
            if (searchResultParam3 != null) {
                eventKeyword2 = searchResultParam3.getEventKeyword();
            } else {
                eventKeyword2 = null;
            }
            c653740Pka.LJIIZILJ("event_keyword", eventKeyword2);
            SearchResultParam searchResultParam4 = this.LJIIZILJ;
            if (searchResultParam4 != null) {
                searchResultParam4.setEventKeyword("");
            }
        }
        SearchResultParam searchResultParam5 = this.LJIIZILJ;
        if (searchResultParam5 != null && (utmSource = searchResultParam5.getUtmSource()) != null && utmSource.length() != 0) {
            SearchResultParam searchResultParam6 = this.LJIIZILJ;
            if (searchResultParam6 != null) {
                utmSource2 = searchResultParam6.getUtmSource();
            } else {
                utmSource2 = null;
            }
            c653740Pka.LJIIZILJ("utm_source", utmSource2);
            SearchResultParam searchResultParam7 = this.LJIIZILJ;
            if (searchResultParam7 != null) {
                searchResultParam7.setUtmSource("");
            }
        }
        SearchResultParam searchResultParam8 = this.LJIIZILJ;
        if (searchResultParam8 != null) {
            enterFromSub = searchResultParam8.getEnterFromSub();
        } else {
            enterFromSub = null;
        }
        if (C123100dR.LIZ(enterFromSub)) {
            SearchResultParam searchResultParam9 = this.LJIIZILJ;
            if (searchResultParam9 != null) {
                enterFromSub2 = searchResultParam9.getEnterFromSub();
            } else {
                enterFromSub2 = null;
            }
            if (C123100dR.LIZ(enterFromSub2)) {
                c653740Pka.LJ("enter_from_sub", enterFromSub2);
            }
            SearchResultParam searchResultParam10 = this.LJIIZILJ;
            if (searchResultParam10 != null) {
                searchResultParam10.setEnterFromSub("");
            }
        }
        SearchResultParam searchResultParam11 = this.LJIIZILJ;
        if (searchResultParam11 != null) {
            captionRating = searchResultParam11.getCaptionRating();
        } else {
            captionRating = null;
        }
        if (C123100dR.LIZ(captionRating)) {
            SearchResultParam searchResultParam12 = this.LJIIZILJ;
            if (searchResultParam12 == null || (captionRating2 = searchResultParam12.getCaptionRating()) == null) {
                captionRating2 = "";
            }
            if (C123100dR.LIZ(captionRating2)) {
                c653740Pka.LJ("caption_rating", captionRating2);
            }
            SearchResultParam searchResultParam13 = this.LJIIZILJ;
            if (searchResultParam13 != null) {
                searchResultParam13.setCaptionRating("");
            }
        }
        if (this.LJIILL) {
            c653740Pka.LJIJJLI("click_more_general_list");
        } else {
            int i2 = this.LJIIIZ;
            if (i2 != -1 && (i = this.LJIIIIZZ) != -1 && i2 != i) {
                c653740Pka.LJIJJLI("switch_tab");
                c653740Pka.LJ("switch_tab_type", this.LJIILIIL.getValue());
                c653740Pka.LJJJ(C0PSI.LIZIZ(this.LJIIIZ));
            } else {
                String str6 = this.LJIILJJIL;
                if (str6 != null && str6.length() != 0) {
                    c653740Pka.LJIJJLI(this.LJIILJJIL);
                } else {
                    LIZIZ(c653740Pka);
                }
            }
        }
        if (Intrinsics.LJFF(this.LJIIL, "search_interest_card") && fragment != null && (iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(fragment)) != null && (c0pcyGX = iSearchContextAbilityLIZIZ.gX()) != null && (c647460PaS = (C647460PaS) c0pcyGX.LIZJ()) != null && (map = c647460PaS.LL) != null) {
            c653740Pka.LJIILLIIL.putAll(map);
        }
        if (Intrinsics.LJFF(this.LIZJ, "tab_search") || Intrinsics.LJFF(this.LIZJ, "guide_search") || Intrinsics.LJFF(this.LIZJ, "guide_search_cancel") || Intrinsics.LJFF(this.LIZJ, "correct_word")) {
            c653740Pka.LJIJJLI(this.LIZJ);
            SearchResultParam searchResultParam14 = this.LJIIZILJ;
            if (searchResultParam14 == null || (filterOption5 = searchResultParam14.getFilterOption()) == null || (filterByStruct = filterOption5.getFilterByStruct()) == null || (linkedHashMap = filterByStruct.getLogInfo()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            c653740Pka.LIZIZ(linkedHashMap);
            SearchResultParam searchResultParam15 = this.LJIIZILJ;
            if (searchResultParam15 == null || (filterOption4 = searchResultParam15.getFilterOption()) == null || (sortTypeStruct = filterOption4.getSortTypeStruct()) == null || (linkedHashMap2 = sortTypeStruct.getLogInfo()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            c653740Pka.LIZIZ(linkedHashMap2);
            SearchResultParam searchResultParam16 = this.LJIIZILJ;
            if (searchResultParam16 != null && (filterOption3 = searchResultParam16.getFilterOption()) != null && (activitySwitchOption = filterOption3.getActivitySwitchOption()) != null) {
                for (SubSwitchStruct subSwitchStruct : activitySwitchOption) {
                    String logInfo = subSwitchStruct.getLogInfo();
                    if (logInfo == null) {
                        logInfo = "";
                    }
                    c653740Pka.LIZLLL(subSwitchStruct.isSelected() ? 1 : 0, logInfo);
                }
            }
            SearchResultParam searchResultParam17 = this.LJIIZILJ;
            if (searchResultParam17 == null || (filterOption2 = searchResultParam17.getFilterOption()) == null || (categoryOption = filterOption2.getCategoryOption()) == null || (linkedHashMap3 = categoryOption.getLogInfo()) == null) {
                linkedHashMap3 = new LinkedHashMap<>();
            }
            c653740Pka.LIZIZ(linkedHashMap3);
            SearchResultParam searchResultParam18 = this.LJIIZILJ;
            if (searchResultParam18 != null && (filterOption = searchResultParam18.getFilterOption()) != null && (researchFilterOption = filterOption.getResearchFilterOption()) != null) {
                c653740Pka.LJ("filter_option_exposed", researchFilterOption.getLogInfo());
            }
        }
        if (Intrinsics.LJFF(this.LIZJ, "search_sug") && Intrinsics.LJFF(this.LJIIL, "search_sug")) {
            c653740Pka.LJIIZILJ("sug_type", this.LJIIJ);
        }
        if (c19eg != null) {
            SearchHubVM searchHubVM = (SearchHubVM) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchHubVM.class);
            C1264304x7 c1264304x7 = searchHubVM.LLILLL;
            if (c1264304x7 != null) {
                c653740Pka.LJ("entity_id", String.valueOf(c1264304x7.LIZ));
                c653740Pka.LJ("entity_keyword", c1264304x7.LIZIZ);
                searchHubVM.LLILLL = null;
            }
            Map<String, Object> value = searchHubVM.LLILLJJLI.getValue();
            if (value != null) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : value.entrySet()) {
                    if (!Intrinsics.LJFF(entry.getKey(), "entity_index")) {
                        linkedHashMap4.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    c653740Pka.LJ((String) entry2.getKey(), entry2.getValue().toString());
                }
            }
            searchHubVM.LLILLJJLI.postValue(null);
        }
    }
}
