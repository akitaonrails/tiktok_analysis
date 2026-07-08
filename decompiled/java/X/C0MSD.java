package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.ss.android.ugc.gamora.layout.LayoutNLETrackStub;

/* JADX INFO: renamed from: X.0MSD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSD extends C0MSH {
    public final /* synthetic */ LayoutNLETrackStub LJI;

    @Override // X.C0MSH
    public final void LIZ() {
        LayoutNLETrackStub layoutNLETrackStub = this.LJI;
        C0MSD c0msd = layoutNLETrackStub.LLJJJJJIL;
        if (c0msd != null) {
            layoutNLETrackStub.LLJI = c0msd.LIZLLL;
            layoutNLETrackStub.LLJIJIL = c0msd.LJ;
            layoutNLETrackStub.LLJILJIL = c0msd.LJFF;
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceFile(c0msd.LIZ);
            nLEResourceAV.setResourceType(c0msd.LIZIZ.getNleResType());
            layoutNLETrackStub.LLILZ.setAVFile(nLEResourceAV);
            if (layoutNLETrackStub.LLJILJIL <= 0) {
                Long l = c0msd.LIZJ;
                layoutNLETrackStub.LLJILJIL = l != null ? l.longValue() : 60000000L;
            }
            long jMin = (long) Math.min(layoutNLETrackStub.LLJILJIL, 6.0E7d);
            layoutNLETrackStub.LLJILJIL = jMin;
            layoutNLETrackStub.LLILZ.setTimeClipEnd(jMin);
            layoutNLETrackStub.LLILZLL.setDuration(layoutNLETrackStub.LLJILJIL);
            layoutNLETrackStub.LLILZLL.setEndTime(layoutNLETrackStub.LLJILJIL);
            layoutNLETrackStub.LLILZIL.setDuration(layoutNLETrackStub.LLJILJIL);
            layoutNLETrackStub.LLILZ.setTimeClipStart(0L);
            layoutNLETrackStub.LLILZLL.setStartTime(0L);
            layoutNLETrackStub.LLILZIL.setStartTime(0L);
            layoutNLETrackStub.LLILZLL.setMainSegment(layoutNLETrackStub.LLILZ);
            layoutNLETrackStub.LLILZIL.addSlotAtEnd(layoutNLETrackStub.LLILZLL);
            C786410Ut5.LJLILLLLZI(layoutNLETrackStub.LLILLL, 2);
            layoutNLETrackStub.LLJJJ = true;
            layoutNLETrackStub.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MSD(String str, C0L9K c0l9k, Long l, LayoutNLETrackStub layoutNLETrackStub) {
        super(str, c0l9k, l);
        this.LJI = layoutNLETrackStub;
    }
}
