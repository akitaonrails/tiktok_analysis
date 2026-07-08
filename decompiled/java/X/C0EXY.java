package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0EXY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXY implements InterfaceC379610EuV, C0EMV {
    public static final C0EMJ LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXY.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLL = new C0EMJ();
    }

    public final InterfaceC1453430nvR LJI() {
        return (InterfaceC1453430nvR) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EXY(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1453430nvR.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        NLEModel nLEModelLIZ = c0emo.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c0emo.LIZJ) == null || !C349760DnS.LIZ(videoPublishEditModel, nLEModelLIZ)) {
            return;
        }
        List<NLESegmentComposerFilter> listLJJJJLL = C351220Dpo.LJJJJLL(nLEModelLIZ);
        int size = listLJJJJLL.size();
        if (size != 0) {
            if (size != 1) {
                LJI().l4(false);
            } else {
                FilterBean filterBeanLIZ = C366420EYe.LIZ((NLESegmentComposerFilter) ListProtector.get(listLJJJJLL, 0));
                if (filterBeanLIZ == null) {
                    return;
                }
                C0CHQ.LIZ().LJJIL().LIZIZ().LJJIIJZLJL(Collections.singletonList(new C1639650sln(filterBeanLIZ.getId(), EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS, filterBeanLIZ.getFilterFilePath(), filterBeanLIZ.getFilterFolder())));
                LJI().Dq2(new C1453000nuk(true, filterBeanLIZ, true, (String) null, true, 8), false, null, true);
            }
        } else {
            int size2 = ((ArrayList) C351220Dpo.LJLI(nLEModelLIZ)).size();
            if (!C295990Biv.LIZ() || size2 == 0) {
                LJI().l4(true);
            }
        }
        NLEModel nLEModelLIZ2 = c0emo.LIZ();
        if (nLEModelLIZ2 != null && (videoPublishEditModel2 = c0emo.LIZJ) != null) {
            LLILLL.getClass();
            C0EY9 c0ey9LIZ = C0EMJ.LIZ(nLEModelLIZ2);
            videoPublishEditModel2.setSelectedFilterId(c0ey9LIZ.LIZ);
            videoPublishEditModel2.setSelectedFilterLabel(c0ey9LIZ.LIZIZ);
            videoPublishEditModel2.setSelectedFilterCategoryKey(c0ey9LIZ.LIZJ);
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
