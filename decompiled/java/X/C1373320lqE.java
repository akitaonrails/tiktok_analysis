package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0lqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373320lqE {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final UrlModel LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final C1372850lpT LJIIJ;
    public final C1372850lpT LJIIJJI;
    public final C1372850lpT LJIIL;
    public final C1372850lpT LJIILIIL;
    public final C1372850lpT LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final List<String> LJIJ;
    public final List<String> LJIJI;
    public final int LJIJJ;
    public final List<String> LJIJJLI;
    public final List<String> LJIL;
    public final List<String> LJJ;
    public final List<String> LJJI;

    public C1373320lqE(String str, Aweme aweme, String str2, String str3, String str4, String str5, UrlModel urlModel, UrlModel urlModel2, String str6, String str7, C1372850lpT c1372850lpT, C1372850lpT c1372850lpT2, C1372850lpT c1372850lpT3, C1372850lpT c1372850lpT4, C1372850lpT c1372850lpT5, boolean z, String str8, String str9, List list, int i, List list2, List list3, List list4, List list5, int i2) {
        List list6 = list5;
        List list7 = list4;
        List list8 = list3;
        int i3 = i;
        List list9 = list;
        List list10 = list2;
        boolean z2 = z;
        aweme = (i2 & 2) != 0 ? null : aweme;
        str3 = (i2 & 8) != 0 ? "" : str3;
        str4 = (i2 & 16) != 0 ? "" : str4;
        String str10 = (i2 & 32) == 0 ? str5 : "";
        if ((i2 & 32768) != 0) {
            new Bundle();
        }
        z2 = (i2 & 65536) != 0 ? true : z2;
        list9 = (i2 & 1048576) != 0 ? null : list9;
        i3 = (i2 & 2097152) != 0 ? 0 : i3;
        list10 = (i2 & 4194304) != 0 ? null : list10;
        list8 = (i2 & 8388608) != 0 ? null : list8;
        list7 = (i2 & 16777216) != 0 ? null : list7;
        list6 = (i2 & 33554432) != 0 ? null : list6;
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str10;
        this.LJI = urlModel;
        this.LJII = urlModel2;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = c1372850lpT;
        this.LJIIJJI = c1372850lpT2;
        this.LJIIL = c1372850lpT3;
        this.LJIILIIL = c1372850lpT4;
        this.LJIILJJIL = c1372850lpT5;
        this.LJIILL = z2;
        this.LJIILLIIL = str8;
        this.LJIIZILJ = str9;
        this.LJIJ = null;
        this.LJIJI = list9;
        this.LJIJJ = i3;
        this.LJIJJLI = list10;
        this.LJIL = list8;
        this.LJJ = list7;
        this.LJJI = list6;
    }
}
