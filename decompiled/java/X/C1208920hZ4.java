package X;

import Y.ARunnableS118S0100000_18;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionPage;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizAnswerCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizConfigModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizToastModel;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208920hZ4 implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
        }
    }

    public C1208920hZ4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C1208920hZ4 c1208920hZ4, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Integer numValueOf;
        new C1043010dFT();
        InterfaceC1871820yoG interfaceC1871820yoG = null;
        C1043010dFT.LIZIZ(null, AFwS206S0000000_18.get$arr$(145));
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null) {
            interfaceC1871820yoG = interfaceC1107590evd2.get("data");
        }
        if (!(interfaceC1871820yoG instanceof InterfaceC1107590evd) || (interfaceC1107590evd = (InterfaceC1107590evd) interfaceC1871820yoG) == null || (numValueOf = Integer.valueOf(interfaceC1107590evd.getInt("is_link"))) == null || numValueOf.intValue() != 1) {
            C086F c086f = C086F.LIZ;
            ARunnableS118S0100000_18 aRunnableS118S0100000_18 = new ARunnableS118S0100000_18((RavenMusicCollectionFragment) c1208920hZ4.l0, 17);
            c086f.getClass();
            C086F.LIZIZ(2000L, aRunnableS118S0100000_18);
        }
    }

    public static final void mh2$1(C1208920hZ4 c1208920hZ4, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "sub_only_playlist_created")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        InterfaceC1871820yoG interfaceC1871820yoG = null;
        if (interfaceC1107590evd2 != null) {
            interfaceC1871820yoG = interfaceC1107590evd2.get("params");
        }
        if ((interfaceC1871820yoG instanceof InterfaceC1107590evd) && (interfaceC1107590evd = (InterfaceC1107590evd) interfaceC1871820yoG) != null) {
            interfaceC1107590evd.getString("mix_id");
        }
        AssemVMLazy assemVMLazy = ((PlaylistCollectionPage) c1208920hZ4.l0).LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PlaylistCollectionPage.LLJIJIL;
        ((AssemSingleListViewModel) assemVMLazy.getValue()).manualListRefresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6 A[Catch: Exception -> 0x0147, TryCatch #1 {Exception -> 0x0147, blocks: (B:42:0x00c4, B:44:0x00c8, B:46:0x00cc, B:47:0x00d2, B:49:0x00d6, B:55:0x00e1, B:57:0x00e7, B:59:0x00ef, B:61:0x00f3, B:62:0x00f9, B:64:0x00fd, B:75:0x0114, B:77:0x0118, B:81:0x011f, B:82:0x0125, B:84:0x0129, B:87:0x012e, B:74:0x010e, B:41:0x00be), top: B:94:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd A[Catch: Exception -> 0x0147, TryCatch #1 {Exception -> 0x0147, blocks: (B:42:0x00c4, B:44:0x00c8, B:46:0x00cc, B:47:0x00d2, B:49:0x00d6, B:55:0x00e1, B:57:0x00e7, B:59:0x00ef, B:61:0x00f3, B:62:0x00f9, B:64:0x00fd, B:75:0x0114, B:77:0x0118, B:81:0x011f, B:82:0x0125, B:84:0x0129, B:87:0x012e, B:74:0x010e, B:41:0x00be), top: B:94:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[Catch: Exception -> 0x0147, TRY_ENTER, TryCatch #1 {Exception -> 0x0147, blocks: (B:42:0x00c4, B:44:0x00c8, B:46:0x00cc, B:47:0x00d2, B:49:0x00d6, B:55:0x00e1, B:57:0x00e7, B:59:0x00ef, B:61:0x00f3, B:62:0x00f9, B:64:0x00fd, B:75:0x0114, B:77:0x0118, B:81:0x011f, B:82:0x0125, B:84:0x0129, B:87:0x012e, B:74:0x010e, B:41:0x00be), top: B:94:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f A[Catch: Exception -> 0x0147, TryCatch #1 {Exception -> 0x0147, blocks: (B:42:0x00c4, B:44:0x00c8, B:46:0x00cc, B:47:0x00d2, B:49:0x00d6, B:55:0x00e1, B:57:0x00e7, B:59:0x00ef, B:61:0x00f3, B:62:0x00f9, B:64:0x00fd, B:75:0x0114, B:77:0x0118, B:81:0x011f, B:82:0x0125, B:84:0x0129, B:87:0x012e, B:74:0x010e, B:41:0x00be), top: B:94:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void mh2$2(X.C1208920hZ4 r9, X.C262100zr r10) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208920hZ4.mh2$2(X.0hZ4, X.00zr):void");
    }

    public static final void mh2$3(C1208920hZ4 c1208920hZ4, C262100zr c262100zr) {
        C1178440glu c1178440glu;
        List<PoiQuizToastModel> list;
        PoiQuizAnswerCardAssem poiQuizAnswerCardAssem = (PoiQuizAnswerCardAssem) c1208920hZ4.l0;
        poiQuizAnswerCardAssem.getClass();
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != 486990889) {
            if (iHashCode != 594641886) {
                if (iHashCode == 1388909047 && str.equals("poiQuizShowGPSReqToast")) {
                    if ((poiQuizAnswerCardAssem.Jo().LLJI != null && C1178440glu.LIZJ()) || (c1178440glu = poiQuizAnswerCardAssem.Jo().LLJI) == null) {
                        return;
                    }
                    C19EG c19egLIZ = C724240Sb0.LIZ(poiQuizAnswerCardAssem);
                    PoiQuizConfigModel poiQuizConfigModel = poiQuizAnswerCardAssem.Jo().LLJ;
                    if (poiQuizConfigModel != null) {
                        list = poiQuizConfigModel.poiQuizToastList;
                    } else {
                        list = null;
                    }
                    c1178440glu.LJ.LIZLLL(Boolean.TRUE, c1178440glu, c19egLIZ, list, new AwS562S0100000_18(poiQuizAnswerCardAssem, 2513));
                    return;
                }
                return;
            }
            if (!str.equals("poiQuizFinishBtnClick")) {
                return;
            }
            if (poiQuizAnswerCardAssem.Jo().LLJI != null && !C1178440glu.LIZJ()) {
                C1178440glu c1178440glu2 = poiQuizAnswerCardAssem.Jo().LLJI;
                if (c1178440glu2 == null) {
                    return;
                }
                C19EG c19egLIZ2 = C724240Sb0.LIZ(poiQuizAnswerCardAssem);
                poiQuizAnswerCardAssem.Jo();
                c1178440glu2.LJ.LJFF(c19egLIZ2, c1178440glu2, new AwS562S0100000_18(poiQuizAnswerCardAssem, 2516));
                return;
            }
            PoiQuizAnswerCardAssem.Go(poiQuizAnswerCardAssem.LLJ, poiQuizAnswerCardAssem.LLJJIJIIJIL, new AwS562S0100000_18(poiQuizAnswerCardAssem, 2517));
            return;
        }
        if (!str.equals("poiQuizCloseCard")) {
            return;
        }
        PoiQuizAnswerCardAssem.Go(poiQuizAnswerCardAssem.LLJ, poiQuizAnswerCardAssem.LLJJIJIIJIL, new AwS562S0100000_18(poiQuizAnswerCardAssem, 2512));
    }
}
