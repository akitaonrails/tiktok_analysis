package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857870Xl3 {
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final C857480XkQ<AVTextExtraStruct> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1677));

    public final void LIZ() {
        CaptionModel captionModel = this.LIZIZ.creativeModel.postPageModel.captionModel;
        String str = captionModel.markupText;
        if (str == null) {
            str = "";
        }
        List<AVTextExtraStruct> list = captionModel.markupExtra;
        C857480XkQ<AVTextExtraStruct> c857480XkQ = this.LIZJ;
        List<AbstractC858320Xlm<AVTextExtraStruct>> listLIZJ = c857480XkQ.LIZIZ.LIZJ(str, list);
        ((ArrayList) c857480XkQ.LJ).clear();
        ((ArrayList) c857480XkQ.LJ).addAll(listLIZJ);
        if (this.LIZIZ.creativeModel.editPostModel == null) {
            List<AbstractC858390Xlt> listLIZIZ = C19719512Dh.LIZIZ(this.LIZJ.LJ);
            ArrayList arrayList = new ArrayList();
            for (AbstractC857880Xl4 abstractC857880Xl4 : (List) this.LIZLLL.getValue()) {
                abstractC857880Xl4.LIZJ(listLIZIZ);
                List<AbstractC858390Xlt> listLIZ = abstractC857880Xl4.LIZ();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                for (AbstractC858390Xlt abstractC858390Xlt : listLIZ) {
                    abstractC858390Xlt.getClass();
                    arrayList2.add(abstractC858390Xlt);
                }
                arrayList.addAll(arrayList2);
            }
            listLIZIZ.addAll(0, arrayList);
        }
        List listLIZIZ2 = C19719512Dh.LIZIZ(this.LIZJ.LJ);
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (Object obj : listLIZIZ2) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (obj instanceof C858540Xm8) {
                AbstractC858390Xlt abstractC858390Xlt2 = (AbstractC858390Xlt) C13LP.LJJJLZIJ(i2, listLIZIZ2);
                if (abstractC858390Xlt2 instanceof C858350Xlp) {
                    C858350Xlp c858350Xlp = (C858350Xlp) abstractC858390Xlt2;
                    if (!u.LJJIIJZLJL(c858350Xlp.LJIILJJIL(), " ", false)) {
                        c858350Xlp.LJIIIZ = (String) AFwS229S0000000_2.get$arr$(913).invoke(c858350Xlp.LJIIIZ);
                    }
                } else {
                    arrayList3.add(Integer.valueOf(i2));
                }
            }
            i = i2;
        }
        int i3 = 0;
        for (Object obj2 : arrayList3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iIntValue = i3 + ((Number) obj2).intValue();
            if (iIntValue > listLIZIZ2.size()) {
                iIntValue = listLIZIZ2.size();
            }
            ListProtector.add(listLIZIZ2, iIntValue, new C858350Xlp(0, 0, " "));
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.String] */
    public final void LIZIZ() {
        String chain;
        CaptionModel captionModel = this.LIZIZ.creativeModel.postPageModel.captionModel;
        String chain2 = captionModel.chain;
        if ((chain2 == null || chain2.length() <= 0) && ((chain2 = this.LIZIZ.getChain()) == null || chain2.length() == 0)) {
            chain2 = null;
        }
        boolean z = captionModel.disableDeleteChain || ((chain = this.LIZIZ.getChain()) != null && chain.length() > 0 && this.LIZIZ.getDisableDeleteChain());
        ArrayList arrayList = new ArrayList();
        for (AbstractC858390Xlt abstractC858390Xlt : (ArrayList) this.LIZJ.LJ) {
            if (!abstractC858390Xlt.LJIL()) {
                if (!C857900Xl6.LIZIZ(abstractC858390Xlt)) {
                    break;
                }
            } else {
                arrayList.add(abstractC858390Xlt);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String strLIZIZ = "";
        int i = 0;
        int length = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            AbstractC858390Xlt abstractC858390Xlt2 = (AbstractC858390Xlt) obj;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = abstractC858390Xlt2.LJIILJJIL();
            if (i != arrayList.size() - 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) c259800zU.element);
                sbLIZ.append(' ');
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
            }
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c259800zU, (C259800zU<List<InterfaceC891770Yyd>>) 1678);
            if (!abstractC858390Xlt2.LJIL()) {
                throw new UnsupportedOperationException("Can't new boundary metadata for non-chain type text block");
            }
            AVTextExtraStruct aVTextExtraStructLJIJ = abstractC858390Xlt2.LJIJ(awS558S0100000_14);
            aVTextExtraStructLJIJ.start += length;
            aVTextExtraStructLJIJ.end += length;
            arrayList2.add(aVTextExtraStructLJIJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append((String) c259800zU.element);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            length += ((String) c259800zU.element).length();
            i = i2;
        }
        if (strLIZIZ.length() == 0 && chain2 != null && chain2.length() != 0 && z) {
            VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
            CaptionModel captionModel2 = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            captionModel2.chain = chain2;
            captionModel2.disableDeleteChain = true;
            videoPublishEditModel.setChain(chain2);
            this.LIZIZ.setDisableDeleteChain(true);
            return;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        PostPageModel postPageModel = videoPublishEditModel2.creativeModel.postPageModel;
        CaptionModel captionModel3 = postPageModel.captionModel;
        captionModel3.chain = strLIZIZ;
        captionModel3.disableDeleteChain = true;
        postPageModel.transientExtra = arrayList2;
        videoPublishEditModel2.setChain(strLIZIZ);
    }

    public C857870Xl3(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C857480XkQ<AVTextExtraStruct> c857480XkQ) {
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = c857480XkQ;
    }
}
