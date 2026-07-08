package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZM6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZM6 implements C0ICL {
    public static final C0ZM6 LL = new C0ZM6();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(518));
    public static final C01GW LLILLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(516));
    public static final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(519));
    public static final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(517));

    public static void LIZ() {
        ((Map) LLILLJJLI.getValue()).clear();
        ((Map) LLILLL.getValue()).clear();
        ((Map) LLILZ.getValue()).clear();
        ((Map) LLILZIL.getValue()).clear();
    }

    @Override // X.C0ICL
    public final C0ZCV LJJJI(C869590Y9l c869590Y9l, GifContent gifContent) {
        BaseContent.ReferenceVideo refVideo;
        Integer referenceScene;
        LightInteractionCommonResource lightInteractionCommonResourceLJJJLZIJ = C0ZM5.LLILLL.LJJJLZIJ(c869590Y9l);
        if (lightInteractionCommonResourceLJJJLZIJ == null) {
            return null;
        }
        C01GW c01gw = LLILZIL;
        C0ZCV c0zcvLIZJ = (C0ZCV) ((Map) c01gw.getValue()).get(Long.valueOf(c869590Y9l.getMsgId()));
        if (c0zcvLIZJ == null) {
            if (gifContent != null) {
                refVideo = gifContent.getRefVideo();
            } else {
                refVideo = null;
            }
            if ((gifContent instanceof GifContent) && gifContent != null) {
                referenceScene = gifContent.getReferenceScene();
            } else {
                referenceScene = null;
            }
            c0zcvLIZJ = C0IAX.LIZJ(lightInteractionCommonResourceLJJJLZIJ, refVideo, referenceScene);
            if (c0zcvLIZJ == null) {
                return null;
            }
        }
        ((Map) c01gw.getValue()).put(Long.valueOf(c869590Y9l.getMsgId()), c0zcvLIZJ);
        return c0zcvLIZJ;
    }

    @Override // X.C0ICL
    public final BaseTemplate LJIIIIZZ(C869590Y9l c869590Y9l, AttachmentComponent attachmentComponent, String str, String str2) {
        String str3;
        C0ZM5 c0zm5 = C0ZM5.LLILLL;
        String strLJI = c0zm5.LJI(c869590Y9l);
        if (strLJI == null || c869590Y9l.getMsgId() == 0) {
            return null;
        }
        C01GW c01gw = LLILLL;
        BaseTemplate baseTemplateLJFF = (BaseTemplate) ((Map) c01gw.getValue()).get(Long.valueOf(c869590Y9l.getMsgId()));
        if (baseTemplateLJFF == null) {
            LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = c0zm5.LJJIIZI(strLJI);
            if (lightInteractionCommonResourceLJJIIZI != null) {
                if (attachmentComponent != null) {
                    str3 = attachmentComponent.id;
                } else {
                    str3 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJI);
                sbLIZ.append('_');
                sbLIZ.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C01GW c01gw2 = LLILLJJLI;
                baseTemplateLJFF = (BaseTemplate) ((Map) c01gw2.getValue()).get(strLIZIZ);
                if (baseTemplateLJFF != null || (baseTemplateLJFF = C0IAX.LJFF(lightInteractionCommonResourceLJJIIZI, attachmentComponent, str, str2, null)) != null) {
                    ((Map) c01gw2.getValue()).put(strLIZIZ, baseTemplateLJFF);
                }
            }
            return null;
        }
        ((Map) c01gw.getValue()).put(Long.valueOf(c869590Y9l.getMsgId()), baseTemplateLJFF);
        return baseTemplateLJFF;
    }
}
