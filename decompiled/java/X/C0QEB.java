package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.Map;

/* JADX INFO: renamed from: X.0QEB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QEB {
    public static final C0QEB LIZ = new C0QEB();

    public static void LIZ(n nVar, C653660PkS c653660PkS) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (c653660PkS != null) {
            Map<String, String> mapLIZ = c653660PkS.LIZ();
            if (mapLIZ != null && (str6 = mapLIZ.get("is_inner")) != null) {
                nVar.LJJIIJ("is_inner", str6);
            }
            Map<String, String> mapLIZ2 = c653660PkS.LIZ();
            if (mapLIZ2 != null && (str5 = mapLIZ2.get("is_page")) != null) {
                nVar.LJJIIJ("is_page", str5);
            }
        }
        if (c653660PkS != null) {
            Map<String, String> mapLIZ3 = c653660PkS.LIZ();
            if (mapLIZ3 != null && (str4 = mapLIZ3.get("token_type")) != null) {
                nVar.LJJIIJ("token_type", str4);
            }
            Map<String, String> mapLIZ4 = c653660PkS.LIZ();
            if (mapLIZ4 != null && (str3 = mapLIZ4.get("is_llm_page")) != null) {
                nVar.LJJIIJ("is_llm_page", str3);
            }
            Map<String, String> mapLIZ5 = c653660PkS.LIZ();
            if (mapLIZ5 != null && (str2 = mapLIZ5.get("design_type")) != null) {
                nVar.LJJIIJ("design_type", str2);
            }
            Map<String, String> mapLIZ6 = c653660PkS.LIZ();
            if (mapLIZ6 != null && (str = mapLIZ6.get("token_type")) != null) {
                nVar.LJJIIJ("token_type", str);
            }
        }
    }

    public static void LIZIZ(C0QDA c0qda, C653660PkS c653660PkS) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (c653660PkS != null) {
            Map<String, String> mapLIZ = c653660PkS.LIZ();
            if (mapLIZ != null && (str5 = mapLIZ.get("is_inner")) != null) {
                c0qda.LJ("is_inner", str5);
            }
            Map<String, String> mapLIZ2 = c653660PkS.LIZ();
            if (mapLIZ2 != null && (str4 = mapLIZ2.get("is_page")) != null) {
                c0qda.LJ("is_page", str4);
            }
            Map<String, String> mapLIZ3 = c653660PkS.LIZ();
            if (mapLIZ3 != null && (str3 = mapLIZ3.get("token_type")) != null) {
                c0qda.LJ("token_type", str3);
            }
            Map<String, String> mapLIZ4 = c653660PkS.LIZ();
            if (mapLIZ4 != null && (str2 = mapLIZ4.get("is_llm_page")) != null) {
                c0qda.LJ("is_llm_page", str2);
            }
            Map<String, String> mapLIZ5 = c653660PkS.LIZ();
            if (mapLIZ5 != null && (str = mapLIZ5.get("design_type")) != null) {
                c0qda.LJ("design_type", str);
            }
        }
    }

    public static void LIZJ(Word word, C653660PkS c653660PkS, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String word2;
        Integer numValueOf;
        String str7;
        String id;
        String str8;
        String str9;
        C0QEC c0qec = new C0QEC();
        String str10 = null;
        if (c653660PkS != null) {
            str6 = c653660PkS.LJFF;
        } else {
            str6 = null;
        }
        c0qec.LJIIZILJ("raw_query", str6);
        if (word != null) {
            word2 = word.getWord();
        } else {
            word2 = null;
        }
        c0qec.LJIIZILJ("words_content", word2);
        if (word != null) {
            numValueOf = Integer.valueOf(word.getWordPosition());
        } else {
            numValueOf = null;
        }
        c0qec.LJJJJL(numValueOf);
        if (c653660PkS != null) {
            str7 = c653660PkS.LJIIJJI;
        } else {
            str7 = null;
        }
        c0qec.LJIIZILJ("impr_id", str7);
        if (word != null) {
            id = word.getId();
        } else {
            id = null;
        }
        c0qec.LJIIZILJ("group_id", id);
        if (c653660PkS != null) {
            str8 = c653660PkS.LJJJJLI;
        } else {
            str8 = null;
        }
        c0qec.LJJIJLIJ(str8);
        c0qec.LJIIZILJ("button_type", str);
        c0qec.LJIIZILJ("words_source", str2);
        if (str4 != null) {
            c0qec.LJ("words_label", str4);
        }
        String str11 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLJJLI;
        if (str11.length() == 0 && (c653660PkS == null || (str11 = c653660PkS.LJI) == null)) {
            str11 = "";
        }
        c0qec.LJJJJ(str11);
        Map<String, String> mapLLLLLZ = C1ER1.LIZIZ.LLLLLZ(str5);
        if (mapLLLLLZ != null) {
            for (Map.Entry<String, String> entry : mapLLLLLZ.entrySet()) {
                String value = entry.getValue();
                if (C123100dR.LIZ(value) && value != null) {
                    c0qec.LJIIZILJ(entry.getKey(), entry.getValue());
                }
            }
        }
        if (c653660PkS != null) {
            String str12 = c653660PkS.LJJJZ;
            if (str12 != null) {
                c0qec.LJIIZILJ("query_recommend", str12);
            }
            str9 = c653660PkS.LJII;
        } else {
            str9 = null;
        }
        c0qec.LJIIZILJ("sug_type", str9);
        LIZIZ(c0qec, c653660PkS);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0qec.LJFF("feedback_id", str3, c2082308Dt);
        if (c653660PkS != null) {
            str10 = c653660PkS.LJJIJ;
        }
        c0qec.LJFF("design_type", str10, c2082308Dt);
        c0qec.LJIILJJIL();
    }
}
