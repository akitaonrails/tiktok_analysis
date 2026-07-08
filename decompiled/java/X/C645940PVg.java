package X;

/* JADX INFO: renamed from: X.0PVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645940PVg {
    public static final C654740PmC LIZ(C653660PkS c653660PkS) {
        String str;
        C664030Q2v c664030Q2v;
        String str2 = c653660PkS.LJIILJJIL;
        String str3 = c653660PkS.LJIIJJI;
        String str4 = c653660PkS.LJIIJ;
        String str5 = c653660PkS.LJFF;
        String str6 = c653660PkS.LJIIIIZZ;
        int i = c653660PkS.LJIILL;
        C654740PmC c654740PmC = new C654740PmC(c653660PkS);
        c654740PmC.LJIIZILJ("search_id", str4);
        c654740PmC.LJIIZILJ("search_keyword", str5);
        c654740PmC.LJIIZILJ("log_pb", str2);
        c654740PmC.LJIIZILJ("impr_id", str3);
        c654740PmC.LJIJJ(str6);
        c654740PmC.LJIIZILJ("is_aladdin", "1");
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664030Q2v = c650960Pg6LIZJ.searchVideoModel) != null) {
            str = c664030Q2v.groupId;
        } else {
            str = null;
        }
        c654740PmC.LJIIZILJ("last_from_group_id", str);
        c654740PmC.LJJIIZ(Integer.valueOf(i));
        c654740PmC.LJIIZILJ("universal_rank", String.valueOf(c653660PkS.LJIILLIIL));
        return c654740PmC;
    }

    public static final C654760PmE LIZIZ(C653660PkS c653660PkS) {
        String str = c653660PkS.LJIILJJIL;
        String str2 = c653660PkS.LJIIJJI;
        String str3 = c653660PkS.LJIIJ;
        String str4 = c653660PkS.LJFF;
        String str5 = c653660PkS.LJIIIIZZ;
        int i = c653660PkS.LJIILL;
        C654760PmE c654760PmE = new C654760PmE(c653660PkS);
        c654760PmE.LJIIZILJ("search_id", str3);
        c654760PmE.LJIIZILJ("search_keyword", str4);
        c654760PmE.LJIIZILJ("log_pb", str);
        c654760PmE.LJIIZILJ("impr_id", str2);
        c654760PmE.LJIJJ(str5);
        c654760PmE.LJIIZILJ("is_aladdin", "1");
        c654760PmE.LJJIIZ(Integer.valueOf(i));
        c654760PmE.LJIIZILJ("universal_rank", String.valueOf(c653660PkS.LJIILLIIL));
        return c654760PmE;
    }
}
