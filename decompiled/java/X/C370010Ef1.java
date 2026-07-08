package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0Ef1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370010Ef1 extends FrameLayout {
    public C369970Eex LL;
    public C370070Ef7 LLILLJJLI;
    public final C01GW LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final int LLILZLL;
    public NLETrackSlot LLIZ;
    public InterfaceC370140EfE LLIZLLLIL;

    public final boolean LIZJ() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    public final C370070Ef7 getAudioSelectFrameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bat);
            this.LLILLJJLI = (C370070Ef7) callbackFindViewById;
        }
        return (C370070Ef7) callbackFindViewById;
    }

    public final Pair<Float, Float> getAudioSelectFramePosition() {
        return new Pair<>(Float.valueOf(getAudioSelectFrameFromXml().getSelectFrameRect().left), Float.valueOf(getAudioSelectFrameFromXml().getSelectFrameRect().right));
    }

    public final C369970Eex getAudioTrackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bax);
            this.LL = (C369970Eex) callbackFindViewById;
        }
        return (C369970Eex) callbackFindViewById;
    }

    private final int getAudioTrackEndPadding() {
        return LIZJ() ? getAudioTrackLeftPadding() : getAudioTrackRightPadding();
    }

    private final int getAudioTrackStartPadding() {
        return LIZJ() ? getAudioTrackRightPadding() : getAudioTrackLeftPadding();
    }

    public final long getAudioSelectFrameEndTime() {
        return getAudioSelectFrameStartTime() + C814420VxA.LIZJ((getAudioSelectFrameFromXml().getSelectFrameRect().width() / (getAudioSelectFrameFromXml() != null ? r0.getScale() : this.LLILZIL)) * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long getAudioSelectFrameStartTime() {
        C369970Eex audioTrackFromXml = getAudioTrackFromXml();
        int scrollX = audioTrackFromXml != null ? audioTrackFromXml.getScrollX() : 0;
        C370070Ef7 audioSelectFrameFromXml = getAudioSelectFrameFromXml();
        float scale = audioSelectFrameFromXml != null ? audioSelectFrameFromXml.getScale() : this.LLILZIL;
        float f = scrollX;
        return C814420VxA.LIZJ(((LIZJ() ? ((LIZ(scale) - f) - getAudioSelectFrameFromXml().getSelectFrameRect().right) - getAudioTrackStartPadding() : (f + getAudioSelectFrameFromXml().getSelectFrameRect().left) - getAudioTrackStartPadding()) / scale) * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final int getAudioTrackLeftPadding() {
        C369970Eex audioTrackFromXml = getAudioTrackFromXml();
        if (audioTrackFromXml != null) {
            return audioTrackFromXml.getRootPadding().getFirst().intValue();
        }
        return 0;
    }

    public final int getAudioTrackRightPadding() {
        C369970Eex audioTrackFromXml = getAudioTrackFromXml();
        if (audioTrackFromXml != null) {
            return audioTrackFromXml.getRootPadding().getSecond().intValue();
        }
        return 0;
    }

    public final int getAudioTrackTotalPadding() {
        C369970Eex audioTrackFromXml = getAudioTrackFromXml();
        if (audioTrackFromXml != null) {
            return audioTrackFromXml.getRootPadding().getFirst().intValue() + audioTrackFromXml.getRootPadding().getSecond().intValue();
        }
        return 0;
    }

    public final float getSelectFrameClipLeftBound() {
        int audioTrackLeftPadding = getAudioTrackLeftPadding();
        return Math.max(audioTrackLeftPadding - (getAudioTrackFromXml() != null ? r0.getScrollX() : 0), this.LLILZ);
    }

    public final float getSelectFrameClipRightBound() {
        int audioTrackRightPadding = getAudioTrackRightPadding();
        float f = this.LLILZLL - this.LLILZ;
        C369970Eex audioTrackFromXml = getAudioTrackFromXml();
        int scrollX = audioTrackFromXml != null ? audioTrackFromXml.getScrollX() : 0;
        C370070Ef7 audioSelectFrameFromXml = getAudioSelectFrameFromXml();
        return Math.min((LIZ(audioSelectFrameFromXml != null ? audioSelectFrameFromXml.getScale() : 0.0f) - scrollX) - audioTrackRightPadding, f);
    }

    public final InterfaceC370140EfE getAudioSelectFrameClipListener() {
        return this.LLIZLLLIL;
    }

    public final float LIZ(float f) {
        NLESegment mainSegment;
        long duration;
        NLETrackSlot nLETrackSlot = this.LLIZ;
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment);
        if (nLESegmentAudioDynamicCast != null) {
            if (nLESegmentAudioDynamicCast.getResource().getDuration() == 0) {
                duration = nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart();
            } else {
                duration = nLESegmentAudioDynamicCast.getResource().getDuration();
            }
            return (((duration / nLESegmentAudioDynamicCast.getAbsSpeed()) / LSPassThroughRecordSizeConfig.DEFAULT) * f) + getAudioTrackTotalPadding();
        }
        return 0.0f;
    }

    public final void LIZIZ(float f) {
        NLESegment mainSegment;
        long duration;
        int scrollX;
        float fLIZ;
        float f2;
        NLETrackSlot nLETrackSlot = this.LLIZ;
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment);
        if (nLESegmentAudioDynamicCast != null) {
            NLETrackSlot nLETrackSlot2 = this.LLIZ;
            if (nLETrackSlot2 != null) {
                duration = nLETrackSlot2.getDuration();
            } else {
                duration = 0;
            }
            float f3 = (duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * f;
            C369970Eex audioTrackFromXml = getAudioTrackFromXml();
            if (audioTrackFromXml != null) {
                scrollX = audioTrackFromXml.getScrollX();
            } else {
                scrollX = 0;
            }
            float timeClipStart = (((nLESegmentAudioDynamicCast.getTimeClipStart() / nLESegmentAudioDynamicCast.getAbsSpeed()) / LSPassThroughRecordSizeConfig.DEFAULT) * f) + getAudioTrackStartPadding();
            if (LIZJ()) {
                fLIZ = (LIZ(f) - timeClipStart) - scrollX;
            } else {
                fLIZ = timeClipStart - scrollX;
            }
            C370070Ef7 audioSelectFrameFromXml = getAudioSelectFrameFromXml();
            if (audioSelectFrameFromXml != null) {
                RectF selectFrameRect = audioSelectFrameFromXml.getSelectFrameRect();
                if (LIZJ()) {
                    f2 = fLIZ - f3;
                } else {
                    f2 = fLIZ;
                }
                selectFrameRect.left = f2;
                RectF selectFrameRect2 = audioSelectFrameFromXml.getSelectFrameRect();
                if (!LIZJ()) {
                    fLIZ += f3;
                }
                selectFrameRect2.right = fLIZ;
                audioSelectFrameFromXml.setScale(f);
                audioSelectFrameFromXml.invalidate();
            }
            C369970Eex audioTrackFromXml2 = getAudioTrackFromXml();
            if (audioTrackFromXml2 != null) {
                audioTrackFromXml2.LLILZLL.setOutScrollX(scrollX);
            }
            C369970Eex audioTrackFromXml3 = getAudioTrackFromXml();
            if (audioTrackFromXml3 != null) {
                audioTrackFromXml3.LIZ(getAudioSelectFrameFromXml().getSelectFrameRect().left, getAudioSelectFrameFromXml().getSelectFrameRect().width(), getAudioTrackLeftPadding());
            }
        }
    }

    public final void setAudioScrollListener(InterfaceC370150EfF interfaceC370150EfF) {
        getAudioTrackFromXml().setScrollLister$tools_camera_edit_release(interfaceC370150EfF);
    }

    public final void setAudioSelectFrameClipListener(InterfaceC370140EfE interfaceC370140EfE) {
        this.LLIZLLLIL = interfaceC370140EfE;
    }

    public final void setAudioSelectFrameFromXml(C370070Ef7 c370070Ef7) {
        this.LLILLJJLI = c370070Ef7;
    }

    public final void setAudioTrackFromXml(C369970Eex c369970Eex) {
        this.LL = c369970Eex;
    }

    public C370010Ef1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1510));
        this.LLILZ = C0FU0.LIZ(42.0f);
        this.LLILZIL = C0FU0.LIZ(34.0f) / 1000.0f;
        this.LLILZLL = C0FU0.LIZJ(C0EHL.LIZ());
        boolean z = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bzm, this, true) instanceof ViewGroup;
        getAudioSelectFrameFromXml().setOnMoveDownListener(new AwS584S0100000_5(this, 681));
        getAudioSelectFrameFromXml().setOnMoveListener(new AwS619S0100000_5(this, 24));
        getAudioSelectFrameFromXml().setOnMoveUpListener(new AwS584S0100000_5(this, 682));
        if (C293810BfP.LIZ()) {
            C370070Ef7 audioSelectFrameFromXml = getAudioSelectFrameFromXml();
            if (audioSelectFrameFromXml != null) {
                ViewGroup.LayoutParams layoutParams = audioSelectFrameFromXml.getLayoutParams();
                if (layoutParams != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(62));
                    C786410Ut5.W5(audioSelectFrameFromXml, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C370070Ef7 audioSelectFrameFromXml2 = getAudioSelectFrameFromXml();
            if (audioSelectFrameFromXml2 != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(audioSelectFrameFromXml2, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(18))), null, null, false, 29);
            }
            C369970Eex audioTrackFromXml = getAudioTrackFromXml();
            if (audioTrackFromXml != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(audioTrackFromXml, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(18))), null, null, false, 29);
            }
        }
    }

    public final void LIZLLL(float f, float f2) {
        C370070Ef7 audioSelectFrameFromXml = getAudioSelectFrameFromXml();
        float f3 = f2 - f;
        audioSelectFrameFromXml.getSelectFrameRect().left = f;
        audioSelectFrameFromXml.getSelectFrameRect().right = f2;
        if (audioSelectFrameFromXml.getSelectFrameRect().left < getSelectFrameClipLeftBound()) {
            audioSelectFrameFromXml.getSelectFrameRect().left = getSelectFrameClipLeftBound();
            audioSelectFrameFromXml.getSelectFrameRect().right = getSelectFrameClipLeftBound() + f3;
            new C0ZDN(audioSelectFrameFromXml.getContext()).LIZ(3);
        }
        if (audioSelectFrameFromXml.getSelectFrameRect().right > getSelectFrameClipRightBound()) {
            audioSelectFrameFromXml.getSelectFrameRect().right = getSelectFrameClipRightBound();
            audioSelectFrameFromXml.getSelectFrameRect().left = getSelectFrameClipRightBound() - f3;
            new C0ZDN(audioSelectFrameFromXml.getContext()).LIZ(3);
        }
        audioSelectFrameFromXml.invalidate();
        getAudioTrackFromXml().LIZ(getAudioSelectFrameFromXml().getSelectFrameRect().left, getAudioSelectFrameFromXml().getSelectFrameRect().width(), getAudioTrackLeftPadding());
    }
}
