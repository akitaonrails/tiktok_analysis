package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608900NuS implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;

    public C608900NuS(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        QuickExternalShareVM quickExternalShareVM;
        Aweme aweme;
        String aid;
        String strKey;
        DataCenter dataCenter;
        String strLIZIZ;
        String strKey2;
        String str;
        String aid2;
        Aweme aweme2;
        VideoItemParams videoItemParams2 = videoItemParams;
        C704830Rkn c704830Rkn = this.LL;
        if (c704830Rkn != null) {
            Object obj = c704830Rkn.LJFF.get("quick_share_vm");
            if ((obj instanceof QuickExternalShareVM) && (quickExternalShareVM = (QuickExternalShareVM) obj) != null && videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (aid = aweme.getAid()) != null) {
                C608890NuR.LIZIZ.add(aid);
                C608890NuR.LJ(videoItemParams2.getAweme().getAid(), videoItemParams2.mEventType);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("click channel:");
                InterfaceC1369790lkX interfaceC1369790lkX = quickExternalShareVM.LLILLJJLI;
                if (interfaceC1369790lkX != null) {
                    strKey = interfaceC1369790lkX.key();
                } else {
                    strKey = null;
                }
                sbLIZ.append(strKey);
                C2188811AlT.LIZIZ(sbLIZ);
                String str2 = videoItemParams2.mEventType;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C609080Nuk c609080Nuk = C608890NuR.LIZLLL.get(aweme.getAid());
                VideoItemParams item = quickExternalShareVM.getItem();
                if (item != null && (dataCenter = item.dataCenter) != null) {
                    dataCenter.zQ2(null, "video_quick_external_button_click");
                    if (!C0R93.LIZ(str2)) {
                        C609000Nuc.LIZLLL().storeInt(C609000Nuc.LIZLLL, 0);
                        C609000Nuc.LIZLLL().storeInt(C609000Nuc.LJ, -1);
                    }
                    String aid3 = aweme.getAid();
                    if (aid3 == null) {
                        aid3 = "";
                    }
                    boolean zLJFF = Intrinsics.LJFF(C608890NuR.LIZIZ(aid3, "has_re_showed_cache_key"), "1");
                    if (zLJFF) {
                        VideoItemParams item2 = quickExternalShareVM.getItem();
                        if (item2 == null || (aweme2 = item2.getAweme()) == null || (aid2 = aweme2.getAid()) == null) {
                            aid2 = "";
                        }
                        strLIZIZ = C608890NuR.LIZIZ(aid2, "has_showed_trigger_source");
                    } else {
                        strLIZIZ = ((C608930NuV) quickExternalShareVM.getState()).LL;
                    }
                    C609010Nud c609010Nud = C609010Nud.LIZ;
                    String aid4 = aweme.getAid();
                    if (aid4 == null) {
                        aid4 = "";
                    }
                    String authorUid = AwemeExtKt.getAuthorUid(aweme);
                    InterfaceC1369790lkX interfaceC1369790lkX2 = quickExternalShareVM.LLILLJJLI;
                    if (interfaceC1369790lkX2 == null || (strKey2 = interfaceC1369790lkX2.key()) == null) {
                        strKey2 = "";
                    }
                    if (c609080Nuk != null && (str = c609080Nuk.LIZIZ) != null) {
                        str3 = str;
                    }
                    c609010Nud.getClass();
                    C609010Nud.LIZ(false, aid4, authorUid, strLIZIZ, str2, strKey2, str3, zLJFF ? 1 : 0, aweme);
                }
            }
        }
        return new C1387205bq(null);
    }
}
