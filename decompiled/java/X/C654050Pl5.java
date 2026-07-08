package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Pl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654050Pl5 {
    public static final C654050Pl5 LIZ = new C654050Pl5();

    public static void LIZ(C650460PfI c650460PfI, GameInfo gameInfo) {
        if (gameInfo != null) {
            c650460PfI.LJ("game_id", gameInfo.cpGameIdStr);
            c650460PfI.LJ("game_name", gameInfo.title);
            c650460PfI.LJ("game_tag_id", gameInfo.gameTagIdStr);
        }
    }

    public static void LIZIZ(C654720PmA c654720PmA, C654080Pl8 c654080Pl8, GameInfo gameInfo, Boolean bool, String str) {
        String str2;
        String tokenType;
        String str3;
        int iIntValue;
        int i;
        String str4;
        Integer num;
        EnumC654060Pl6 enumC654060Pl6;
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C645930PVf.LIZ(c654720PmA);
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        c654720PmA.LJJIIZI(c0prc.LLILLL);
        c654720PmA.LJJIJ(c0prc.LLIZLLLIL);
        c654720PmA.LJIJJ("general_search");
        String str5 = null;
        if (c654080Pl8 != null) {
            str2 = c654080Pl8.LIZ;
        } else {
            str2 = null;
        }
        c654720PmA.LJJIJIIJI(str2);
        if (c654080Pl8 != null && (enumC654060Pl6 = c654080Pl8.LIZLLL) != null) {
            tokenType = enumC654060Pl6.getTokenType();
        } else {
            tokenType = null;
        }
        c654720PmA.LJJIJIL(tokenType);
        String str6 = "1";
        if (c654080Pl8 == null || (str3 = c654080Pl8.LJIIIZ) == null) {
            str3 = "1";
        }
        c654720PmA.LJ("is_first_screen", str3);
        int i2 = 0;
        if (c654080Pl8 != null && (num = c654080Pl8.LJII) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c654720PmA.LJJIIZ(Integer.valueOf(iIntValue));
        if (c654080Pl8 != null) {
            Integer num2 = c654080Pl8.LJIIIIZZ;
            if (num2 != null) {
                c654720PmA.LIZLLL(num2.intValue(), "universal_rank");
            }
            Integer num3 = c654080Pl8.LJIIJ;
            if (num3 != null) {
                c654720PmA.LIZLLL(num3.intValue(), "has_structual_information");
            }
            Integer num4 = c654080Pl8.LJIIJJI;
            if (num4 != null) {
                c654720PmA.LIZLLL(num4.intValue(), "is_page");
            }
        }
        c654720PmA.LJ("entity_type", EnumC654440Pli.COMMON.getMobType());
        if (c654080Pl8 != null && (str4 = c654080Pl8.LJI) != null) {
            c654720PmA.LJ("entity_keyword", str4);
        }
        c654720PmA.LJ("is_entity", "1");
        if (c654080Pl8 != null) {
            String str7 = c654080Pl8.LIZJ;
            if (str7 != null) {
                c654720PmA.LJ("card_url", str7);
            }
            str5 = c654080Pl8.LIZIZ;
        }
        c654720PmA.LJ("card_title", str5);
        LIZ.getClass();
        LIZ(c654720PmA, gameInfo);
        if (c654080Pl8 != null) {
            i = c654080Pl8.LJ;
        } else {
            i = 0;
        }
        c654720PmA.LIZLLL(i, "has_picture");
        if (c654080Pl8 != null) {
            i2 = c654080Pl8.LJFF;
        }
        c654720PmA.LIZLLL(i2, "has_abstract");
        if (bool != null) {
            if (!bool.booleanValue()) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c654720PmA.LJ("is_music_chart", str6);
        }
        if (str != null) {
            c654720PmA.LJ("enter_method", str);
        }
    }

    public static void LIZLLL(Long l, C654080Pl8 c654080Pl8, String str, GameInfo gameInfo, int i) {
        String str2;
        String str3;
        EnumC654060Pl6 enumC654060Pl6;
        C650460PfI<C654090Pl9> c650460PfI = new C650460PfI<C654090Pl9>() { // from class: X.0Pl9
            public static final /* synthetic */ int LJIIZILJ = 0;

            {
                this.LJI = true;
            }
        };
        if (l != null) {
            l.longValue();
            c650460PfI.LIZ(C2097908Jt.LIZJ(new Pair("duration", l)));
        }
        c650460PfI.LJIJJ("general_search");
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        c650460PfI.LJJIIZI(c0prc.LLILLL);
        c650460PfI.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        String tokenType = null;
        if (c654080Pl8 != null) {
            str2 = c654080Pl8.LIZ;
        } else {
            str2 = null;
        }
        c650460PfI.LJJIJIIJI(str2);
        c650460PfI.LJJIIZ(0);
        if (c654080Pl8 != null && (enumC654060Pl6 = c654080Pl8.LIZLLL) != null) {
            tokenType = enumC654060Pl6.getTokenType();
        }
        c650460PfI.LJJIJIL(tokenType);
        c650460PfI.LJ("entity_type", EnumC654440Pli.COMMON.getMobType());
        if (str != null) {
            c650460PfI.LJ("entity_keyword", str);
        }
        c650460PfI.LJ("is_entity", "1");
        if (c654080Pl8 != null && c654080Pl8.LJFF == 1) {
            str3 = "title_with_abstract";
        } else {
            str3 = "title_without_abstract";
        }
        c650460PfI.LJ("card_style", str3);
        c650460PfI.LIZLLL(i, "is_page");
        if (c654080Pl8 != null) {
            Integer num = c654080Pl8.LJIIIIZZ;
            if (num != null) {
                c650460PfI.LIZLLL(num.intValue(), "universal_rank");
            }
            Integer num2 = c654080Pl8.LJIIJ;
            if (num2 != null) {
                c650460PfI.LIZLLL(num2.intValue(), "has_structual_information");
            }
        }
        LIZ.getClass();
        LIZ(c650460PfI, gameInfo);
        c650460PfI.LJIILJJIL();
    }

    public static void LIZJ(C650460PfI c650460PfI, String str, int i, SearchLabel searchLabel, GameInfo gameInfo, EnumC654440Pli enumC654440Pli) {
        String str2;
        C645930PVf.LIZ(c650460PfI);
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        c650460PfI.LJJIIZ(Integer.valueOf(i));
        String str3 = null;
        if (searchLabel != null) {
            str3 = searchLabel.labelId;
        }
        c650460PfI.LJJIJIIJI(str3);
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        c650460PfI.LJJIIZI(c0prc.LLILLL);
        c650460PfI.LJJIJ(c0prc.LLIZLLLIL);
        c650460PfI.LJIJJ("general_search");
        c650460PfI.LJJIJIL("entity_label_card");
        c650460PfI.LJ("entity_keyword", str);
        if (searchLabel == null || (str2 = searchLabel.labelText) == null) {
            str2 = "";
        }
        c650460PfI.LJ("entity_sub", str2);
        c650460PfI.LJ("entity_type", enumC654440Pli.getMobType());
        c650460PfI.LJ("is_entity", "1");
        c650460PfI.LJ("is_first_screen", "1");
        LIZ.getClass();
        LIZ(c650460PfI, gameInfo);
    }

    public static void LJ(C654050Pl5 c654050Pl5, C654080Pl8 c654080Pl8, GameInfo gameInfo, String str, Boolean bool, String str2, int i) {
        String str3 = str2;
        Boolean bool2 = bool;
        int i2 = i & 4;
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        c654050Pl5.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C644720PQo(c654080Pl8, gameInfo, bool2, str3, str, null), 2);
    }
}
