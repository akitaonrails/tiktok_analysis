package Y;

import X.C191300oR;
import X.C20441214yg;
import X.C480460Ism;
import X.C497740JfY;
import X.C915050Zv5;
import X.C917840Zza;
import X.C952930auB;
import X.C953100auS;
import X.C953230auf;
import X.C953270auj;
import X.C953610avH;
import X.C953760avW;
import X.C953770avX;
import X.EnumC952890au7;
import X.EnumC952940auC;
import X.EnumC953380auu;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateParams;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AkS3S2100100_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS3S2100100_15 akS3S2100100_15, Object obj) {
        EnumC952890au7 enumC952890au7;
        EnumC952890au7 enumC952890au72;
        EnumC952890au7 enumC952890au73;
        EnumC952890au7 enumC952890au74;
        C953770avX c953770avX = (C953770avX) obj;
        C953100auS c953100auS = (C953100auS) akS3S2100100_15.l2;
        String str = null;
        if (c953100auS != null) {
            enumC952890au7 = c953100auS.LIZJ;
        } else {
            enumC952890au7 = null;
        }
        if (enumC952890au7 != EnumC952890au7.PREVIEW_SETTING) {
            if (c953100auS != null) {
                enumC952890au72 = c953100auS.LIZJ;
            } else {
                enumC952890au72 = null;
            }
            if (enumC952890au72 != EnumC952890au7.PREVIEW_BOARD_ICON) {
                if (c953100auS != null) {
                    enumC952890au73 = c953100auS.LIZJ;
                } else {
                    enumC952890au73 = null;
                }
                if (enumC952890au73 != EnumC952890au7.PREVIEW_PLAYBOOK) {
                    if (c953100auS != null) {
                        enumC952890au74 = c953100auS.LIZJ;
                    } else {
                        enumC952890au74 = null;
                    }
                    if (enumC952890au74 != EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK) {
                        C953610avH.LJJI.getClass();
                        if (C953610avH.LJJII == null) {
                            C952930auB.LIZ(EnumC952940auC.CREATE, EnumC953380auu.CLICK_SAVE, CardStruct.IStatusCode.DEFAULT, "");
                        }
                        Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LIZLLL(3, c953770avX.LJII)).iterator();
                        while (it2.hasNext()) {
                            C953760avW.LIZIZ.LIZ().LJIILIIL(((C953770avX) it2.next()).LIZIZ());
                        }
                        C953770avX c953770avXLIZ = c953770avX.LIZ(3);
                        if (c953770avXLIZ != null) {
                            long j = akS3S2100100_15.j3;
                            String str2 = akS3S2100100_15.s1;
                            c953770avXLIZ.LJIIIIZZ = 1;
                            c953770avXLIZ.LJIIL = Long.valueOf(j);
                            c953770avXLIZ.LJIILIIL = str2;
                            c953770avXLIZ.LJIIJJI = false;
                            C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
                            c915050Zv5.LIZ().LJIIL(c953770avXLIZ);
                            c915050Zv5.LIZ().LJIILJJIL();
                            C953770avX c953770avXLIZ2 = c953770avX.LIZ(2);
                            if (c953770avXLIZ2 != null) {
                                long j2 = akS3S2100100_15.j3;
                                String str3 = akS3S2100100_15.s1;
                                c953770avXLIZ2.LJIIIIZZ = 1;
                                c953770avXLIZ2.LJIIL = Long.valueOf(j2);
                                c953770avXLIZ2.LJIILIIL = str3;
                                c953770avXLIZ2.LJIIJJI = false;
                                C915050Zv5 c915050Zv52 = C953760avW.LIZIZ;
                                c915050Zv52.LIZ().LJIIL(c953770avXLIZ2);
                                c915050Zv52.LIZ().LJIILJJIL();
                            }
                            C953610avH.LJJI.getClass();
                            if (C953610avH.LJJII == null) {
                                C952930auB.LIZ(EnumC952940auC.CREATE, EnumC953380auu.SAVE_FILE, CardStruct.IStatusCode.DEFAULT, "");
                            }
                            C20441214yg.LJIIIZ("TemplateManager_noticeboard", "useTemplate save file success");
                            return c953770avXLIZ;
                        }
                        "Data item is null".toString();
                        throw new IllegalArgumentException("Data item is null");
                    }
                }
            }
        }
        String str4 = akS3S2100100_15.s0;
        C915050Zv5 c915050Zv53 = C953760avW.LIZIZ;
        C953770avX c953770avXLJIIIIZZ = c915050Zv53.LIZ().LJIIIIZZ();
        if (c953770avXLJIIIIZZ != null) {
            str = c953770avXLJIIIIZZ.LJII;
        }
        if (Intrinsics.LJFF(str4, str)) {
            C953770avX c953770avXLIZ3 = c953770avX.LIZ(1);
            if (c953770avXLIZ3 != null) {
                long j3 = akS3S2100100_15.j3;
                String str5 = akS3S2100100_15.s1;
                c953770avXLIZ3.LJIIIIZZ = 1;
                c953770avXLIZ3.LJIIL = Long.valueOf(j3);
                c953770avXLIZ3.LJIILIIL = str5;
                c953770avXLIZ3.LJIIJJI = true;
                c915050Zv53.LIZ().LJIIL(c953770avXLIZ3);
                c915050Zv53.LIZ().LJIILJJIL();
                C953770avX c953770avXLIZ4 = c953770avX.LIZ(2);
                if (c953770avXLIZ4 != null) {
                    long j4 = akS3S2100100_15.j3;
                    String str6 = akS3S2100100_15.s1;
                    c953770avXLIZ4.LJIIIIZZ = 1;
                    c953770avXLIZ4.LJIIL = Long.valueOf(j4);
                    c953770avXLIZ4.LJIILIIL = str6;
                    c953770avXLIZ4.LJIIJJI = true;
                    c915050Zv53.LIZ().LJIIL(c953770avXLIZ4);
                    c915050Zv53.LIZ().LJIILJJIL();
                }
                C20441214yg.LJIIIZ("TemplateManager_noticeboard", "useTemplate save file success");
                return c953770avXLIZ3;
            }
            "Data item is null".toString();
            throw new IllegalArgumentException("Data item is null");
        }
        throw new RuntimeException("Fail to update preview");
    }

    public static final Object apply$1(AkS3S2100100_15 akS3S2100100_15, Object obj) {
        int i;
        C953270auj c953270auj = (C953270auj) obj;
        Iterator<CloudDraftItemManager.Label> it2 = ((C917840Zza) akS3S2100100_15.l2).LIZLLL.labels.iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += (long) it2.next().text.length();
        }
        C953230auf c953230auf = C953230auf.LIZ;
        long j = akS3S2100100_15.j3;
        c953230auf.getClass();
        if (C953230auf.LJIIL(j)) {
            i = 2;
        } else {
            i = 3;
        }
        C480460Ism.LIZ().getClass();
        INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
        NoticeboardTemplateUpdateParams noticeboardTemplateUpdateParams = new NoticeboardTemplateUpdateParams();
        String str = akS3S2100100_15.s0;
        long j2 = akS3S2100100_15.j3;
        String strLJIJI = akS3S2100100_15.s1;
        C917840Zza c917840Zza = (C917840Zza) akS3S2100100_15.l2;
        noticeboardTemplateUpdateParams.mediaNodeId = str;
        NoticeboardMaterialInfo noticeboardMaterialInfo = new NoticeboardMaterialInfo();
        noticeboardMaterialInfo.backgroundImageUri = c953270auj.LIZ;
        noticeboardMaterialInfo.coverImageUri = c953270auj.LIZIZ;
        noticeboardMaterialInfo.configJsonUri = c953270auj.LIZJ;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131853998);
        }
        noticeboardMaterialInfo.title = strLJIJI;
        noticeboardMaterialInfo.textCharCount = length;
        noticeboardMaterialInfo.textBoxCount = c917840Zza.LIZLLL.labels.size();
        noticeboardMaterialInfo.thumbCoverImageUri = c953270auj.LIZLLL;
        noticeboardTemplateUpdateParams.noticeboardMaterialInfo = noticeboardMaterialInfo;
        noticeboardTemplateUpdateParams.noticeboardTemplateId = j2;
        noticeboardTemplateUpdateParams.updateType = i;
        noticeboardTemplateUpdateParams.privateStatus = C953230auf.LJIIIZ();
        return C191300oR.LIZJ(C191300oR.LIZ(iNoticeboardApi.updateTemplate(noticeboardTemplateUpdateParams), "TemplateManager_noticeboard", "updateTemplate")).LJIILL(new AfS2S1000100_15(akS3S2100100_15.s0, akS3S2100100_15.j3, 0));
    }

    public static final Object apply$2(AkS3S2100100_15 akS3S2100100_15, Object obj) {
        C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "download success");
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        return CloudDraftItemManager.LJII((C917840Zza) obj, Long.valueOf(akS3S2100100_15.j3), akS3S2100100_15.s0, ((ConvertNoticeboardMaterialInfo) akS3S2100100_15.l2).title, akS3S2100100_15.s1);
    }

    public AkS3S2100100_15(long j, String str, String str2, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.j3 = j;
        this.l2 = obj;
        this.s1 = str2;
    }
}
