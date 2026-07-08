package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393850mNL implements InterfaceC1066840dru {
    public Aweme LIZ;
    public AnchorCommonStruct LIZIZ;
    public String LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(594));

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        return R.raw.icon_capcut;
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    public static String LJIIJJI() {
        n nVar = new n();
        for (Map.Entry entry : ((LinkedHashMap) C1197304mJ.LIZ()).entrySet()) {
            nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
        }
        return C1741890vQh.LJIIIIZZ(nVar);
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C360560EBq.LIZ(listLJJLIIIJILLIZJL);
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
    }

    public final IAnchorBusinessApi LJIIJ() {
        return (IAnchorBusinessApi) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1393850mNL c1393850mNL = new C1393850mNL();
        c1393850mNL.LIZJ = this.LIZJ;
        c1393850mNL.LIZ = this.LIZ;
        c1393850mNL.LIZIZ = this.LIZIZ;
        return c1393850mNL;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct != null) {
            return anchorCommonStruct.getIcon();
        }
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b6  */
    @Override // X.InterfaceC1066840dru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C2344009Gk r20) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393850mNL.LIZJ(X.09Gk):void");
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1357400lQY c1357400lQY = C1357400lQY.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        String str = this.LIZJ;
        c1357400lQY.getClass();
        if (anchorCommonStruct != null && C1357400lQY.LIZIZ(anchorCommonStruct)) {
            C20684815ws.LJIILLIIL("guide_user_m2_show", C1357400lQY.LIZ(anchorCommonStruct, str, false));
        }
        C1065370dpX.LIZJ(this, this.LIZJ, this.LIZ, c2344009Gk);
    }

    public final Map<String, String> LJIIIZ(C2344009Gk c2344009Gk) {
        String authorUid;
        String aid;
        String str = this.LIZJ;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        Aweme aweme = this.LIZ;
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        Aweme aweme2 = this.LIZ;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LIZ));
        return c2344009Gk.LIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        this.LIZJ = str;
        this.LIZ = aweme;
        this.LIZIZ = anchorCommonStruct;
        if (anchorCommonStruct.getType() != EnumC1430380nKG.VIA_MAKER.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.CAPCUT.getTYPE()) {
            return false;
        }
        return true;
    }
}
