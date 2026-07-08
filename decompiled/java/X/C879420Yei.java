package X;

import android.util.SparseArray;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879420Yei {
    public Map<String, String> LIZ = new LinkedHashMap();
    public final Map<String, String> LIZIZ = new LinkedHashMap();
    public LightInteractionCommonResource LIZJ;
    public BaseContent.ReferenceVideo LIZLLL;
    public Integer LJ;
    public AttachmentComponent LJFF;
    public BaseHeaderComponent LJI;
    public String LJII;
    public String LJIIIIZZ;
    public ReferenceInfo LJIIIZ;
    public SparseArray<Object> LJIIJ;

    public final C0YP2 LIZIZ() {
        InterfaceC1265604xK c1265404xI;
        C878250Ycp c878250YcpLIZJ = LIZJ();
        if (c878250YcpLIZJ == null) {
            return null;
        }
        String str = this.LJII;
        String str2 = this.LJIIIIZZ;
        if (str != null && str.length() != 0) {
            c1265404xI = new C1265504xJ(str);
        } else {
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            c1265404xI = new C1265404xI(str2);
        }
        return new C0YP2(c1265404xI, c878250YcpLIZJ.LIZ, c878250YcpLIZJ.LIZIZ, c878250YcpLIZJ.LIZJ, null, c878250YcpLIZJ.LIZLLL, c878250YcpLIZJ.LJ, null, null, this.LJIIJ, null, this.LJIIIZ, 13712);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C878250Ycp LIZJ() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879420Yei.LIZJ():X.0Ycp");
    }

    public final void LJ() {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        if (!C455040Hss.LIZ()) {
            C878250Ycp c878250YcpLIZJ = LIZJ();
            if (c878250YcpLIZJ == null) {
                return;
            }
            LIZ(c878250YcpLIZJ).LJ();
            return;
        }
        C0YP2 c0yp2LIZIZ = LIZIZ();
        if (c0yp2LIZIZ == null) {
            return;
        }
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) == null || (c0yozLJFF = c0yhxLIZ.LJFF()) == null) {
            return;
        }
        c0yozLJFF.LJI(c0yp2LIZIZ, new C0IC5(null, 3), new C0YOY() { // from class: X.0Yej
            @Override // X.C0YOY
            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
            }
        });
    }

    public final C874730YTf LIZ(C878250Ycp c878250Ycp) {
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJIIL = c878250Ycp.LIZJ;
        c874730YTfLIZ.LIZIZ.LJIIIZ = new LinkedHashMap(c878250Ycp.LIZLLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c878250Ycp.LJ);
        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
        c0ytz.LJIILIIL = linkedHashMap;
        c0ytz.LJIILL = this.LJIIJ;
        c0ytz.LJIJ = this.LJIIIZ;
        String str = this.LJII;
        if (str != null && str.length() != 0) {
            c874730YTfLIZ.LIZIZ.LJFF = str;
        } else {
            String str2 = this.LJIIIIZZ;
            c874730YTfLIZ.LIZIZ.LJFF = C0YNP.LJ(str2);
        }
        LightInteractionCommonResource lightInteractionCommonResource = this.LIZJ;
        if (lightInteractionCommonResource == null) {
            return c874730YTfLIZ;
        }
        if (Intrinsics.LJFF(lightInteractionCommonResource.getMessageType(), String.valueOf(EnumC868450Y5b.MsgTypeTemplateStickerCard.getValue()))) {
            StickerTemplate stickerTemplateLJFF = C0IAX.LJFF(lightInteractionCommonResource, this.LJFF, (String) ((LinkedHashMap) this.LIZ).get("enter_from"), (String) ((LinkedHashMap) this.LIZ).get("enter_method"), this.LJI);
            if (stickerTemplateLJFF == null) {
                return c874730YTfLIZ;
            }
            c874730YTfLIZ.LIZJ(stickerTemplateLJFF);
            return c874730YTfLIZ;
        }
        c874730YTfLIZ.LIZIZ(C0IAX.LIZJ(lightInteractionCommonResource, this.LIZLLL, this.LJ));
        return c874730YTfLIZ;
    }

    public final void LIZLLL(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(key, value);
            }
        }
        this.LIZ = linkedHashMap;
    }

    public final void LJFF(C0YTK c0ytk) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        if (C455040Hss.LIZ()) {
            C0YP2 c0yp2LIZIZ = LIZIZ();
            if (c0yp2LIZIZ == null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.code = -1051;
                c0ymw.statusMsg = "LightInteractionMsgSender: buildSendMessageParams failed";
                c0ytk.LJII(null, null, c0ymw);
                return;
            }
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                c0yozLJFF.LJI(c0yp2LIZIZ, new C0IC5(null, 3), C0YTP.LIZIZ(c0ytk, null, C0YTJ.ADDED_AND_STARTED, true, 13));
                return;
            } else {
                C0YTP.LIZ(c0ytk);
                return;
            }
        }
        C878250Ycp c878250YcpLIZJ = LIZJ();
        if (c878250YcpLIZJ == null) {
            C0YMW c0ymw2 = C0YMW.newBuilder().LIZ;
            c0ymw2.code = -1051;
            c0ymw2.statusMsg = "LightInteractionMsgSender: buildUpTask failed";
            c0ytk.LJII(null, null, c0ymw2);
            return;
        }
        LIZ(c878250YcpLIZJ).LJFF(c0ytk);
    }
}
