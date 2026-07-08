package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ege, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371020Ege extends i<InterfaceC375010En5, C371090Egl, C371100Egm, C371080Egk> implements InterfaceC379610EuV, InterfaceC375010En5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public ArrayList<InterfaceC371030Egf> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C371020Ege.class, "nleApi", "getNleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/api/NLECropApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = 8;
    }

    public final FrameCacheViewModel H4() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return (FrameCacheViewModel) C364210EPr.LIZIZ(FrameCacheViewModel.class);
    }

    public final InterfaceC374920Emw K4() {
        return (InterfaceC374920Emw) this.LLJILLL.getValue(this, LLJJI[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C371100Egm> o2() {
        return AFwS191S0000000_5.get$arr$(197);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C371080Egk> w2() {
        return new AwS549S0100000_5(this, 717);
    }

    @Override // X.InterfaceC375010En5
    public void WV() {
        if (C1664590tQ1.LJII(this) instanceof C19EG) {
            for (InterfaceC371030Egf interfaceC371030Egf : this.LLJJ) {
                C370920EgU c370920EgUWQ2 = H4().wQ2();
                C23250099c.LIZLLL(c370920EgUWQ2, c370920EgUWQ2.LLJILJIL, null, new C358350E3d(c370920EgUWQ2, interfaceC371030Egf, null), 2);
            }
            this.LLJJ.clear();
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC375010En5
    public void Y3(long j) {
        i3(new AwS24S0000100_5(j, 5));
    }

    @Override // X.InterfaceC375010En5
    public void lu2(NLETrackSlot nLETrackSlot) {
        i3(new AwS584S0100000_5(nLETrackSlot, 611));
    }

    @Override // X.InterfaceC375010En5
    public void y2(long j) {
        i3(new AwS24S0000100_5(j, 6));
    }

    public C371020Ege(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374920Emw.class, null);
        this.LLJJ = new ArrayList<>();
    }

    public final Bitmap F4(String str, int i) {
        if (!(C1664590tQ1.LJII(this) instanceof C19EG)) {
            return null;
        }
        return H4().vQ2(i, str);
    }

    public final void O4(final NLETrackSlot nLETrackSlot, final float f, final int i) {
        NLEResType resourceType;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
        if (resource != null) {
            resourceType = resource.getResourceType();
        } else {
            resourceType = null;
        }
        if (resourceType == NLEResType.IMAGE || !(C1664590tQ1.LJII(this) instanceof C19EG)) {
            return;
        }
        final long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
        C370720EgA.LIZ.getClass();
        final String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
        InterfaceC371030Egf interfaceC371030Egf = new InterfaceC371030Egf() { // from class: X.0Egd
            @Override // X.InterfaceC371030Egf
            public final C371000Egc LIZ() {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    int iLIZIZ = C814420VxA.LIZIZ(((timeClipStart + (i2 * f)) / 1000.0f) / 1000.0f) * LSPassThroughRecordSizeConfig.DEFAULT;
                    if (this.H4().vQ2(iLIZIZ, strLIZIZ) == null) {
                        arrayList.add(Integer.valueOf(iLIZIZ));
                    }
                }
                boolean zLLLL = C351220Dpo.LLLL(nLETrackSlot);
                if (arrayList.isEmpty()) {
                    C13BV c13bv = C13BV.INSTANCE;
                    return new C371000Egc(c13bv, c13bv, c13bv);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C370780EgG(((Number) it2.next()).intValue(), 3, strLIZIZ, false, zLLLL));
                }
                return new C371000Egc(C13BV.INSTANCE, arrayList2, arrayList2);
            }

            @Override // X.InterfaceC371030Egf
            public final void LIZIZ(C370820EgK c370820EgK) {
                this.i3(AFwS234S0000000_5.get$arr$(308));
            }
        };
        this.LLJJ.add(interfaceC371030Egf);
        C370920EgU c370920EgUWQ2 = H4().wQ2();
        C23250099c.LIZLLL(c370920EgUWQ2, c370920EgUWQ2.LLJILJIL, null, new C358360E3e(c370920EgUWQ2, interfaceC371030Egf, null), 2);
        FrameCacheViewModel.yQ2(H4());
    }
}
