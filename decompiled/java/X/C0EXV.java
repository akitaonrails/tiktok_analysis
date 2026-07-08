package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EXV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXV implements InterfaceC379610EuV, InterfaceC366210EXj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.FILTER_INFO;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public C0EY9 LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public NLESegmentComposerFilter LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXV.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXV.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
        if (C301670Bs5.LIZ()) {
            this.LLILZLL = true;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXV(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1453430nvR.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return C351220Dpo.LLJI(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        FilterBean filterBeanLIZ;
        FilterBean filterBeanLIZ2;
        InterfaceC1453220nv6 value;
        if (!this.LLILZLL) {
            return false;
        }
        if (c0eyd.LIZIZ) {
            if (this.LLIZ == 1) {
                C0EY9 c0ey9 = this.LLILZIL;
                if (c0ey9 != null) {
                    VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
                    videoPublishEditModel.setSelectedFilterId(c0ey9.LIZ);
                    videoPublishEditModel.setSelectedFilterLabel(c0ey9.LIZIZ);
                    videoPublishEditModel.setSelectedFilterCategoryKey(c0ey9.LIZJ);
                    VideoPublishEditModel videoPublishEditModel2 = c0ey3.LIZIZ;
                    NLESegmentComposerFilter nLESegmentComposerFilter = this.LLIZLLLIL;
                    if (nLESegmentComposerFilter != null && (filterBeanLIZ2 = C366420EYe.LIZ(nLESegmentComposerFilter)) != null) {
                        C1664750tQH c1664750tQH = this.LLILLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
                        if (((InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).xq1().getValue() != null && (value = ((InterfaceC1455860nzM) this.LLILLL.getValue(this, interfaceC2217461BqaArr[0])).zj2().getValue()) != null) {
                            videoPublishEditModel2.setSelectedFilterIntensity(r3.LIZ(filterBeanLIZ2, value) / 100);
                        }
                    }
                }
                return false;
            }
            c0ey3.LIZIZ.setSelectedFilterId(null);
            c0ey3.LIZIZ.setSelectedFilterLabel(null);
            c0ey3.LIZIZ.setSelectedFilterCategoryKey(null);
            return false;
        }
        this.LLILZLL = false;
        int i = this.LLIZ;
        if (i == 0 || i != 1) {
            ((InterfaceC1453430nvR) this.LLILZ.getValue(this, LLJ[1])).l4(false);
        } else {
            NLESegmentComposerFilter nLESegmentComposerFilter2 = this.LLIZLLLIL;
            if (nLESegmentComposerFilter2 == null || (filterBeanLIZ = C366420EYe.LIZ(nLESegmentComposerFilter2)) == null) {
                return false;
            }
            C0CHQ.LIZ().LJJIL().LIZIZ().LJJIIJZLJL(Collections.singletonList(new C1639650sln(filterBeanLIZ.getId(), EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS, filterBeanLIZ.getFilterFilePath(), filterBeanLIZ.getFilterFolder())));
            ((InterfaceC1453430nvR) this.LLILZ.getValue(this, LLJ[1])).Dq2(new C1453000nuk(true, filterBeanLIZ, true, (String) null, true, 8), false, null, true);
        }
        VideoPublishEditModel videoPublishEditModel3 = c0ey3.LIZIZ;
        C0EY9 c0ey92 = this.LLILZIL;
        if (c0ey92 != null) {
            videoPublishEditModel3.setSelectedFilterId(c0ey92.LIZ);
            videoPublishEditModel3.setSelectedFilterLabel(c0ey92.LIZIZ);
            videoPublishEditModel3.setSelectedFilterCategoryKey(c0ey92.LIZJ);
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (!C351220Dpo.LLJ(nLETrackSlot) && !C351220Dpo.LLIIII(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[PHI: r4
      0x0047: PHI (r4v5 java.util.Collection) = (r4v0 java.util.Collection), (r4v6 java.util.Collection) binds: [B:17:0x0045, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r4
      0x004b: PHI (r4v4 java.util.Collection) = (r4v0 java.util.Collection), (r4v5 java.util.Collection) binds: [B:17:0x0045, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3 A[SYNTHETIC] */
    @Override // X.InterfaceC366210EXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C0EXH r8, X.C0EY3 r9, X.C366230EXl r10) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXV.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
