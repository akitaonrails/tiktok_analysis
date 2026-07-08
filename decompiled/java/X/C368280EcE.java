package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368280EcE extends RelativeLayout {
    public final RelativeLayout.LayoutParams LL;
    public final LinearLayout LLILLJJLI;
    public final C368230Ec9 LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public NLETrackSlot LLJI;

    public final void LIZIZ() {
        LinearLayout linearLayout;
        this.LLIZLLLIL = (int) ((this.LLILZ / this.LLIZ) * C360610EBv.LIZJ());
        RelativeLayout.LayoutParams layoutParams = this.LL;
        if (layoutParams != null) {
            layoutParams.width = (int) (this.LLILZIL * C360610EBv.LIZJ());
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        if (linearLayout2 != null) {
            C786410Ut5.d6(linearLayout2, this.LL);
        }
        LinearLayout linearLayout3 = this.LLILLJJLI;
        if (linearLayout3 != null) {
            C369030EdR.LIZJ(linearLayout3, 0, 0, 0, 0);
        }
        if (this.LLJ || (linearLayout = this.LLILLJJLI) == null) {
            return;
        }
        C369030EdR.LIZJ(linearLayout, -this.LLIZLLLIL, 0, 0, 0);
    }

    public final NLETrackSlot getMainTrackSlot$editor_trackpanel_release() {
        return this.LLJI;
    }

    public C368280EcE(Context context) {
        ViewGroup.LayoutParams layoutParams;
        super(context, null, 0);
        this.LLIZ = 1.0f;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d5z, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.l29);
        this.LLILLJJLI = linearLayout;
        C368230Ec9 c368230Ec9 = (C368230Ec9) findViewById(R.id.jn1);
        c368230Ec9.setEnableShade(true);
        this.LLILLL = c368230Ec9;
        if (linearLayout != null) {
            layoutParams = linearLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        this.LL = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
    }

    public final void LIZ(int i) {
        C368230Ec9 c368230Ec9 = this.LLILLL;
        if (c368230Ec9 != null && c368230Ec9.getRound() == i) {
            return;
        }
        C368230Ec9 c368230Ec92 = this.LLILLL;
        if (c368230Ec92 != null) {
            c368230Ec92.setRound(i);
        }
        invalidate();
    }

    public final void setData(NLETrackSlot nLETrackSlot) {
        long duration;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            this.LLJI = nLETrackSlot;
            C368230Ec9 c368230Ec9 = this.LLILLL;
            long duration2 = 0;
            if (c368230Ec9 != null) {
                c368230Ec9.LIZLLL(0L, nLETrackSlot);
            }
            long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            this.LLILZ = timeClipStart / j;
            this.LLILZIL = nLETrackSlot.getDuration() / j;
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIL(nLETrackSlot)) {
                NLEResourceAV nLEResourceAVLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot);
                if (nLEResourceAVLJJIIJZLJL != null) {
                    duration2 = nLEResourceAVLJJIIJZLJL.getDuration() / j;
                }
            } else {
                if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                    duration = nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
                } else {
                    NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                    if (resource != null) {
                        duration = resource.getDuration();
                    }
                }
                duration2 = duration / j;
            }
            this.LLILZLL = duration2;
            this.LLIZ = C351220Dpo.LIZ(nLESegmentVideoDynamicCast);
            this.LLJ = C351220Dpo.LLJJIJIL(nLETrackSlot);
            LIZIZ();
            C368230Ec9 c368230Ec92 = this.LLILLL;
            if (c368230Ec92 != null) {
                c368230Ec92.setEnablePreInitVisibleRect(true);
            }
            C368230Ec9 c368230Ec93 = this.LLILLL;
            if (c368230Ec93 != null) {
                c368230Ec93.invalidate();
            }
        }
    }

    public final void setEndDivider(boolean z) {
        C368230Ec9 c368230Ec9 = this.LLILLL;
        if (c368230Ec9 != null) {
            c368230Ec9.setEndDivider(z);
        }
    }

    public final void setMainTrackSlot$editor_trackpanel_release(NLETrackSlot nLETrackSlot) {
        this.LLJI = nLETrackSlot;
    }

    public final void setStartDivider(boolean z) {
        C368230Ec9 c368230Ec9 = this.LLILLL;
        if (c368230Ec9 != null) {
            c368230Ec9.setStartDivider(z);
        }
    }
}
