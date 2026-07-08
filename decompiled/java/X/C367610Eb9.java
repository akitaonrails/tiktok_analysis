package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Eb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C367610Eb9 extends AbstractC368090Ebv {
    public static final int LLLILZLLLI;
    public static final int LLLIZZ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public RectF LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final Rect LLJJIJI;
    public final Path LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public final Paint LLJJJ;
    public final TextPaint LLJJJIL;
    public final Path LLJJJJ;
    public final Paint LLJJJJJIL;
    public final Paint LLJJJJLIIL;
    public final C01GW LLJJL;
    public EnumC367660EbE LLJJLIIIJLLLLLLLZ;
    public final Set<Long> LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public float LLJLL;
    public InterfaceC367710EbJ LLJLLIL;
    public float LLJLLL;
    public InterfaceC367810EbT LLJZ;
    public final List<Pair<Long, Float>> LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public InterfaceC367590Eb7 LLLFF;
    public NLETrackSlot LLLFFI;
    public String LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public String LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public Integer LLLIIL;
    public boolean LLLIILIL;
    public List<Integer> LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;

    public final C369670EeT getFadeState() {
        return null;
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        return true;
    }

    public final void setAudioBeatsUse(boolean z) {
    }

    public final void setCurrentInRootState(boolean z) {
    }

    public final void setFadeState(C369670EeT c369670EeT) {
    }

    public final void setNeedDrawStickPoint(boolean z) {
    }

    static {
        C0FU0.LIZ(1.5f);
        LLLILZLLLI = ColorProtector.parseColor("#202020");
        ColorProtector.parseColor("#7F3D7A7F");
        LLLIZZ = C0FU0.LIZ(1.0f);
        ColorProtector.parseColor("#57000000");
    }

    private final ContextThemeWrapper getDarkContext() {
        return (ContextThemeWrapper) this.LLLII.getValue();
    }

    private final Paint getLinearBgPaint() {
        return (Paint) this.LLJJL.getValue();
    }

    private final C367540Eb2 getOldTrackViewModel() {
        return (C367540Eb2) this.LLLF.getValue();
    }

    private final InterfaceC367590Eb7 getTrackViewModel() {
        InterfaceC367590Eb7 interfaceC367590Eb7 = this.LLLFF;
        return interfaceC367590Eb7 == null ? getOldTrackViewModel() : interfaceC367590Eb7;
    }

    private final float getWaveBaseLine() {
        float fHeight = this.LLJJIJI.height() - ((Math.abs(this.LLJJJIL.ascent()) - this.LLJJJIL.descent()) / 2);
        int i = C367650EbD.LLILZLL;
        return fHeight - C367650EbD.LLIZLLLIL;
    }

    public void LJIILIIL() {
        int iLIZIZ;
        C0E75 c0e75LIZ;
        if (this.LLJILJIL) {
            InterfaceC367590Eb7 trackViewModel = getTrackViewModel();
            if (((trackViewModel == null || (c0e75LIZ = trackViewModel.LIZ()) == null) ? null : c0e75LIZ.LJ) != C0E6E.LINE) {
                setBgRadius(0);
                return;
            }
        }
        if (LJIIJJI()) {
            int trackHeight = getTrackHeight();
            int i = AbstractC367990Ebl.LJIILIIL;
            iLIZIZ = trackHeight > AbstractC367990Ebl.LJIILJJIL + (-1) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = getTrackViewModel().LIZIZ() == TrackShowType.NORMAL ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        }
        setBgRadius(iLIZIZ);
    }

    public final ArrayList<Pair<Long, Float>> getWavePointsDataFromCache() {
        long duration;
        ArrayList<Pair<Long, Float>> arrayList = new ArrayList<>();
        if (!this.LLJZIJLIL.isEmpty()) {
            arrayList.addAll(this.LLJZIJLIL);
        } else {
            NLETrackSlot nLETrackSlot = this.LLLFFI;
            if (nLETrackSlot != null) {
                int i = 0;
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                if (nLESegmentAudio != null && nLESegmentAudio.getRepeatCount() == NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()) {
                    duration = nLETrackSlot.getMeasuredEndTime() - nLETrackSlot.getMeasuredStartTime();
                } else if (nLETrackSlot.getMainSegment().getResource().getDuration() == 0) {
                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                    duration = nLESegmentAudioDynamicCast != null ? nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart() : 0L;
                } else {
                    duration = nLETrackSlot.getMainSegment().getResource().getDuration();
                }
                String resourceFile = nLETrackSlot.getMainSegment().getResource().getResourceFile();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(resourceFile);
                sbLIZ.append((int) ((duration / 1000) / ((long) 33)));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                HashMap<String, float[]> map = C352030Dr7.LIZ;
                if (map.get(strLIZIZ) != null) {
                    float[] fArr = map.get(strLIZIZ);
                    int length = fArr.length;
                    int i2 = 0;
                    while (i < length) {
                        arrayList.add(new Pair<>(Long.valueOf(i2 * 33), Float.valueOf(fArr[i])));
                        i++;
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    private final float getBaseLine() {
        return (getMeasuredHeight() / 2) + ((Math.abs(this.LLJJJIL.ascent()) - this.LLJJJIL.descent()) / 2) + C0FU0.LIZ(1.0f);
    }

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJILJIL;
    }

    public final List<Integer> getAllStickPoints() {
        return this.LLLIL;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public int getBgColor() {
        return this.LLJJI;
    }

    @Override // X.AbstractC368090Ebv
    public int getBgRadius() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC368090Ebv
    public float getClipLength() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public RectF getClipRectF() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJIJIL;
    }

    public final boolean getDrawLabel() {
        return this.LLLIILIL;
    }

    public final InterfaceC367810EbT getLabelPainter$editor_trackpanel_release() {
        return this.LLJZ;
    }

    public final float getMinDrawRegionWidth() {
        return this.LLJLLL;
    }

    public final Integer getOutScrollX() {
        return this.LLLIIL;
    }

    public final InterfaceC367710EbJ getPainter() {
        return this.LLJLLIL;
    }

    public final String getText() {
        return this.LLLIIII;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJ;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLLFF;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public /* synthetic */ C367610Eb9(Context context) {
        this(context, null, 0);
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public final void LJI(Canvas canvas) {
        int bgColor;
        float clipLength;
        float clipStart;
        int scrollX;
        View view;
        float f;
        Number numberValueOf;
        long fadeOutLength;
        Pair pair;
        Number numberValueOf2;
        float f2;
        float f3;
        NLETrackSlot nLETrackSlot;
        int iLIZ;
        int iLIZ2;
        String resourceName;
        float fWidth;
        EnumC367660EbE enumC367660EbE;
        NLETrackSlot nLETrackSlot2;
        int scrollX2;
        View view2;
        int i;
        int i2;
        if (getParent() == null) {
            return;
        }
        LJIILIIL();
        Canvas canvas2 = canvas;
        canvas2.getClipBounds(this.LLJJIJI);
        Paint paint = this.LLJJJ;
        Typeface typeface = C368130Ebz.LIZ;
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.e2));
        if (numLIZIZ != null) {
            bgColor = numLIZIZ.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        if (!this.LLLILZJ) {
            canvas2.drawRoundRect(new RectF(this.LLJJIJI), getBgRadius(), getBgRadius(), this.LLJJJ);
        }
        if (!this.LLJILJIL) {
            if (this.LLLIIIIL) {
                i = this.LLJJIJI.left + LLLIZZ;
            } else {
                i = this.LLJJIJI.left;
            }
            if (this.LLLIIIL) {
                i2 = this.LLJJIJI.right - LLLIZZ;
            } else {
                i2 = this.LLJJIJI.right;
            }
            Rect rect = this.LLJJIJI;
            RectF rectF = new RectF(i, rect.top, i2, rect.bottom);
            this.LLJJIJIIJIL.reset();
            this.LLJJIJIIJIL.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas2.clipPath(this.LLJJIJIIJIL);
            canvas2.getClipBounds(this.LLJJIJI);
        }
        Paint paint2 = this.LLJJJ;
        int i3 = C367740EbM.LIZ;
        paint2.setColor(C367740EbM.LIZ(getAlpha(), getBgColor()));
        if (getBgRadius() > 0) {
            canvas2.drawRoundRect(new RectF(this.LLJJIJI), getBgRadius(), getBgRadius(), this.LLJJJ);
        } else {
            canvas2.drawRect(this.LLJJIJI, this.LLJJJ);
        }
        EnumC367660EbE enumC367660EbE2 = this.LLJJLIIIJLLLLLLLZ;
        int iWidth = 0;
        if (enumC367660EbE2 != EnumC367660EbE.MUSIC && enumC367660EbE2 != EnumC367660EbE.RECORD && enumC367660EbE2 != (enumC367660EbE = EnumC367660EbE.SOUND_EFFECT)) {
            if (enumC367660EbE2 == enumC367660EbE && (nLETrackSlot2 = this.LLLFFI) != null) {
                Object parent = getParent();
                if ((parent instanceof View) && (view2 = (View) parent) != null) {
                    scrollX2 = view2.getScrollX();
                } else {
                    scrollX2 = 0;
                }
                canvas2 = canvas2;
                this.LLJZ.LIZIZ(this, nLETrackSlot2, this.LLJJIJIL, canvas2, scrollX2, 0L);
            }
        } else {
            if (getClipStart() == 0.0f && getClipLength() == 0.0f) {
                clipLength = getMeasuredWidth();
                clipStart = 0.0f;
            } else {
                clipLength = getClipLength() - getClipStart();
                clipStart = getClipStart();
            }
            float timelineScale = this.LLJLIL * getTimelineScale();
            float f4 = (this.LLJLL * clipStart) + timelineScale;
            float timelineScale2 = this.LLJLILLLLZIIL * getTimelineScale();
            float f5 = this.LLJLL;
            this.LLJLLIL.LIZIZ(f4, timelineScale, f5);
            this.LLJLLIL.LJFF(timelineScale2 + (clipStart * f5), (int) this.LLJLILLLLZIIL, (int) this.LLJLIL);
            Integer num = this.LLLIIL;
            if (num != null) {
                scrollX = num.intValue();
            } else {
                Object parent2 = getParent();
                if ((parent2 instanceof C368630Ecn) && (view = (View) parent2) != null) {
                    scrollX = view.getScrollX();
                } else {
                    scrollX = 0;
                }
            }
            float f6 = scrollX;
            float f7 = (this.LLJLLL + f6) - clipStart;
            float left = getLeft() + clipStart + getTranslationX();
            if (f6 > left) {
                f = f6 - left;
            } else {
                f = 0.0f;
            }
            if (f7 < clipLength) {
                clipLength = f7;
            }
            if (((Boolean) this.LLLI.getValue()).booleanValue()) {
                if (getClipLength() == 0.0f) {
                    fWidth = this.LLJJIJI.right;
                } else {
                    fWidth = getClipRectF().width();
                }
                this.LLJJIJIL.set(this.LLJJIJI.left, 0.0f, fWidth, getMeasuredHeight());
            } else {
                this.LLJJIJIL.set(f, 0.0f, clipLength, getMeasuredHeight());
            }
            if (getClipStart() == 0.0f && getClipRectF().width() != 0.0f) {
                numberValueOf = Float.valueOf(getClipRectF().width());
            } else {
                numberValueOf = Integer.valueOf(getMeasuredWidth());
            }
            boolean z = !((ArrayList) this.LLJZIJLIL).isEmpty();
            if (z && !this.LLLILZJ) {
                this.LLJLLIL.LIZLLL(canvas2, this.LLJJIJIL, this.LLJZIJLIL, getTimelineScale(), this.LLJJLIIIJLLLLLLLZ, numberValueOf.floatValue());
            }
            if (this.LLLILZ && !this.LLLILZJ && (nLETrackSlot = this.LLLFFI) != null && z) {
                EnumC367660EbE enumC367660EbE3 = this.LLJJLIIIJLLLLLLLZ;
                int[] iArr = C367670EbF.LIZIZ;
                int i4 = iArr[enumC367660EbE3.ordinal()];
                if (i4 != 1 && i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            iLIZ = C446980Hfs.LIZ(getContext(), R.color.m5);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        iLIZ = C446980Hfs.LIZ(getContext(), R.color.m2);
                    }
                } else {
                    iLIZ = C446980Hfs.LIZ(getContext(), R.color.lz);
                }
                int i5 = iArr[this.LLJJLIIIJLLLLLLLZ.ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.m4);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.m1);
                    }
                } else {
                    iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.ly);
                }
                Rect rect2 = new Rect();
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    NLEResourceNode resource = nLESegmentAudioDynamicCast.getResource();
                    if (resource != null && (resourceName = resource.getResourceName()) != null && (!a0.LJJJIL(resourceName))) {
                        this.LLJJJIL.getTextBounds(resourceName, 0, resourceName.length(), rect2);
                        iWidth = rect2.width();
                    }
                    int iLIZ3 = rect2.left + iWidth + C0FU0.LIZ(44.0f);
                    Rect rect3 = this.LLJJIJI;
                    rect2.left = rect3.left;
                    rect2.top = rect3.top;
                    int i6 = rect3.right;
                    if (iLIZ3 > i6) {
                        iLIZ3 = i6;
                    }
                    rect2.right = iLIZ3;
                    rect2.bottom = rect3.bottom;
                    getLinearBgPaint().setShader(new LinearGradient(rect2.left, 0.0f, rect2.right, 0.0f, iLIZ, iLIZ2, Shader.TileMode.CLAMP));
                    if (getBgRadius() > 0) {
                        canvas2.drawRoundRect(new RectF(rect2), getBgRadius(), getBgRadius(), getLinearBgPaint());
                    } else {
                        canvas2.drawRect(rect2, getLinearBgPaint());
                    }
                }
            }
            NLETrackSlot nLETrackSlot3 = this.LLLFFI;
            if (nLETrackSlot3 != null) {
                NLEFilter filterByName = nLETrackSlot3.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
                long fadeInLength = 0;
                if (filterByName == null) {
                    pair = new Pair(0L, 0L);
                } else {
                    NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
                    if (nLESegmentAudioFadeFilterDynamicCast != null) {
                        fadeInLength = nLESegmentAudioFadeFilterDynamicCast.getFadeInLength();
                        fadeOutLength = nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength();
                    } else {
                        fadeOutLength = 0;
                    }
                    pair = new Pair(Long.valueOf(fadeInLength), Long.valueOf(fadeOutLength));
                }
                long jLongValue = ((Number) pair.getFirst()).longValue();
                long jLongValue2 = ((Number) pair.getSecond()).longValue();
                if (getClipLength() - getClipStart() <= 0.0f) {
                    numberValueOf2 = Integer.valueOf(getMeasuredWidth());
                } else {
                    numberValueOf2 = Float.valueOf(getClipLength() - getClipStart());
                }
                float fFloatValue = numberValueOf2.floatValue();
                long jLongValue3 = (long) (numberValueOf2.longValue() / (getTimelineScale() * 2));
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                long jMin = Math.min(jLongValue / j, jLongValue3);
                long jMin2 = Math.min(jLongValue2 / j, jLongValue3);
                if (((Boolean) this.LLLI.getValue()).booleanValue()) {
                    f2 = jMin2;
                } else {
                    f2 = jMin;
                }
                float timelineScale3 = f2 * getTimelineScale();
                if (((Boolean) this.LLLI.getValue()).booleanValue()) {
                    f3 = jMin;
                } else {
                    f3 = jMin2;
                }
                float timelineScale4 = f3 * getTimelineScale();
                float f8 = fFloatValue - timelineScale4;
                if (timelineScale3 > 0.0f) {
                    LJIIL(canvas2, 0.0f, timelineScale3, 0.5f, 0.0f, true);
                }
                if (timelineScale4 > 0.0f) {
                    LJIIL(canvas2, f8, fFloatValue, 0.0f, 0.5f, false);
                }
            }
            NLETrackSlot nLETrackSlot4 = this.LLLFFI;
            if (nLETrackSlot4 != null && this.LLLIILIL) {
                canvas2 = canvas2;
                this.LLJZ.LIZIZ(this, nLETrackSlot4, this.LLJJIJIL, canvas2, scrollX, 0L);
            }
            if ((!this.LLLIL.isEmpty()) && !this.LLLILZJ) {
                this.LLJLLIL.LJ(canvas2, this.LLJJIJIL, this.LLLIL, getTimelineScale(), numberValueOf.floatValue());
            }
            if (this.LLLILZJ && !this.LLJILJIL) {
                this.LLJLLIL.LIZJ(canvas2, this.LLJJIJIL, new RectF(this.LLJJIJI), getBgRadius());
            }
        }
        super.LJI(canvas2);
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            if (!this.LLJILJIL) {
                LJI(canvas);
                return;
            }
            return;
        }
        LJI(canvas);
    }

    public final void setAllStickPoints(List<Integer> list) {
        this.LLLIL = list;
    }

    public final void setBannedMusic(boolean z) {
        this.LLLILZJ = z;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgColor(int i) {
        this.LLJJI = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgRadius(int i) {
        this.LLJJIII = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipLength(float f) {
        this.LLJILJILJ = f;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipRectF(RectF rectF) {
        this.LLJILLL = rectF;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setDrawDivider(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            invalidate();
        }
    }

    public final void setDrawEndDivider(boolean z) {
        this.LLLIIIL = z;
    }

    public final void setDrawLabel(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setDrawStartDivider(boolean z) {
        this.LLLIIIIL = z;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setItemSelected(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(InterfaceC367810EbT interfaceC367810EbT) {
        this.LLJZ = interfaceC367810EbT;
    }

    public final void setMinDrawRegionWidth(float f) {
        this.LLJLLL = f;
    }

    public final void setNeedDrawGradientLayer(boolean z) {
        this.LLLILZ = z;
    }

    public final void setOutScrollX(Integer num) {
        this.LLLIIL = num;
    }

    public final void setPainter(InterfaceC367710EbJ interfaceC367710EbJ) {
        this.LLJLLIL = interfaceC367710EbJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSegment(com.bytedance.ies.nle.editor_jni.NLETrackSlot r15) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367610Eb9.setSegment(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final void setText(String str) {
        if (!Intrinsics.LJFF(str, this.LLLIIII)) {
            this.LLLIIII = str;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJ = f;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLLFF = interfaceC367590Eb7;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        invalidate();
    }

    public C367610Eb9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = true;
        this.LLJILLL = new RectF();
        this.LLJJ = C360610EBv.LIZJ();
        this.LLJJI = LLLILZLLLI;
        this.LLJJIJI = new Rect();
        this.LLJJIJIIJIL = new Path();
        this.LLJJIJIL = new RectF();
        Paint paint = new Paint();
        this.LLJJJ = paint;
        TextPaint textPaint = new TextPaint();
        this.LLJJJIL = textPaint;
        Path path = new Path();
        this.LLJJJJ = path;
        Paint paint2 = new Paint();
        this.LLJJJJJIL = paint2;
        Paint paint3 = new Paint();
        this.LLJJJJLIIL = paint3;
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(3));
        this.LLJJLIIIJLLLLLLLZ = EnumC367660EbE.MUSIC;
        this.LLJL = new LinkedHashSet();
        this.LLJLL = 1.0f;
        this.LLJLLIL = new C369590EeL();
        int i2 = C368630Ecn.LLLLJI;
        this.LLJLLL = C369020EdQ.LIZ();
        this.LLJZ = new InterfaceC367810EbT(this) { // from class: X.0EbB
            public final C367610Eb9 LIZ;
            public final Context LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL;
            public final float LJ = 42.0f;
            public final int LJFF = ColorProtector.parseColor("#33FFFFFF");
            public final Paint LJI;
            public final Paint LJII;
            public final Paint LJIIIIZZ;
            public final Rect LJIIIZ;
            public final Rect LJIIJ;
            public final TextPaint LJIIJJI;
            public final C01GW LJIIL;

            @Override // X.InterfaceC367810EbT
            public final void LIZ(C367200EaU c367200EaU) {
            }

            public final float LJ() {
                return ((Number) this.LJIIL.getValue()).floatValue();
            }

            {
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                Paint paint4 = new Paint();
                this.LJI = paint4;
                Paint paint5 = new Paint();
                this.LJII = paint5;
                Paint paint6 = new Paint();
                this.LJIIIIZZ = paint6;
                this.LJIIIZ = new Rect();
                this.LJIIJ = new Rect();
                TextPaint textPaint2 = new TextPaint();
                this.LJIIJJI = textPaint2;
                this.LJIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(7));
                paint4.setAntiAlias(true);
                paint5.setColor(-1);
                paint5.setAntiAlias(true);
                paint5.setTextSize(C0FU0.LIZ(9.0f));
                Rect rect = new Rect();
                paint5.getTextBounds("0.0", 0, 3, rect);
                rect.height();
                C0FU0.LIZ(16.0f);
                paint6.setColor(-1);
                paint6.setAntiAlias(true);
                paint6.setTextSize(C0FU0.LIZ(8.0f));
                Rect rect2 = new Rect();
                paint6.getTextBounds("0.0", 0, 3, rect2);
                rect2.height();
                C0FU0.LIZ(16.0f);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C367650EbD.LLJIJIL);
                textPaint2.setStrokeWidth(C0FU0.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
            }

            public final void LIZJ(Canvas canvas, String str) {
                float fWidth;
                int iLIZ;
                if (this.LIZJ) {
                    fWidth = this.LJIIIZ.width();
                    iLIZ = C0FU0.LIZ(50.0f);
                } else {
                    fWidth = this.LJIIIZ.width();
                    iLIZ = C0FU0.LIZ(28.0f);
                }
                float f = fWidth + iLIZ;
                this.LJII.getTextBounds(str, 0, str.length(), this.LJIIJ);
                canvas.drawRoundRect(f, C0FU0.LIZ(4.0f), this.LJIIJ.width() + f + C0FU0.LIZ(8.0f), C0FU0.LIZ(20.0f), LJ(), LJ(), this.LJI);
                canvas.drawText(str, f + C0FU0.LIZ(4.0f), C0FU0.LIZ(15.0f), this.LJII);
            }

            public final void LIZLLL(Canvas canvas, boolean z, String str, C367610Eb9 c367610Eb9) {
                Paint paint4 = this.LJI;
                int i3 = C367740EbM.LIZ;
                paint4.setColor(C367740EbM.LIZ(c367610Eb9.getAlpha(), this.LJFF));
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LIZIZ, R.drawable.c0c);
                if (drawableLIZIZ != null) {
                    if (z) {
                        canvas.drawRoundRect(C0FU0.LIZ(4.0f), C0FU0.LIZ(4.0f), C0FU0.LIZ(22.0f) + this.LJIIIZ.width(), C0FU0.LIZ(20.0f), LJ(), LJ(), this.LJI);
                    }
                    drawableLIZIZ.setBounds(C0FU0.LIZ(6.0f), C0FU0.LIZ(6.0f), C0FU0.LIZ(18.0f), C0FU0.LIZ(18.0f));
                    drawableLIZIZ.draw(canvas);
                    this.LJIIJJI.setTextSize(C367650EbD.LLJ);
                    this.LJIIJJI.getTextBounds(str, 0, str.length(), this.LJIIIZ);
                    this.LJIIJJI.setColor(C367740EbM.LIZ(c367610Eb9.getAlpha(), -1));
                    canvas.drawText(str, C0FU0.LIZ(18.0f), C0FU0.LIZ(15.0f), this.LJIIJJI);
                }
            }

            @Override // X.InterfaceC367810EbT
            public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i3, long j) {
                String filterName;
                int i4;
                EnumC367660EbE enumC367660EbE;
                boolean z;
                boolean z2;
                float fWidth;
                int iLIZ;
                EnumC367660EbE enumC367660EbE2;
                NLESegmentFilter segment;
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLETrackSlot.getAudioFilter() == null || (segment = nLETrackSlot.getAudioFilter().getSegment()) == null || (filterName = NLESegmentFilter.dynamicCast(segment).getFilterName()) == null) {
                    filterName = "";
                }
                float absSpeed = nLESegmentAudioDynamicCast.getAbsSpeed();
                nLESegmentAudioDynamicCast.getVolume();
                String resourceName = nLESegmentAudioDynamicCast.getResource().getResourceName();
                NLEResType resourceType = nLETrackSlot.getMainSegment().getResource().getResourceType();
                if (resourceType == null) {
                    i4 = -1;
                } else {
                    i4 = C350320DoM.LIZ[resourceType.ordinal()];
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        enumC367660EbE = EnumC367660EbE.MUSIC;
                    } else {
                        enumC367660EbE = EnumC367660EbE.SOUND_EFFECT;
                    }
                } else {
                    enumC367660EbE = EnumC367660EbE.RECORD;
                }
                if (enumC367660EbE != EnumC367660EbE.MUSIC && enumC367660EbE != EnumC367660EbE.RECORD && enumC367660EbE != (enumC367660EbE2 = EnumC367660EbE.SOUND_EFFECT)) {
                    if (enumC367660EbE == enumC367660EbE2) {
                        LIZLLL(canvas, false, resourceName, this.LIZ);
                        String strJ4 = C786410Ut5.j4("%3.1fx", Arrays.copyOf(new Object[]{Float.valueOf(absSpeed)}, 1));
                        if (!Intrinsics.LJFF(strJ4, "1.0x") && !this.LIZLLL) {
                            LIZJ(canvas, strJ4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!a0.LJJJIL(resourceName)) {
                    LIZLLL(canvas, true, resourceName, this.LIZ);
                }
                if (filterName.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LIZIZ, R.drawable.by7);
                    if (drawableLIZIZ != null) {
                        if (this.LIZJ) {
                            fWidth = this.LJIIIZ.width();
                            iLIZ = C0FU0.LIZ(50.0f);
                        } else {
                            fWidth = this.LJIIIZ.width();
                            iLIZ = C0FU0.LIZ(28.0f);
                        }
                        float f = fWidth + iLIZ;
                        canvas.drawRect(f, C0FU0.LIZ(4.0f), f + C0FU0.LIZ(this.LJ), C0FU0.LIZ(20.0f), this.LJI);
                        int iLIZ2 = (int) (f + C0FU0.LIZ(3.0f));
                        int iLIZ3 = C0FU0.LIZ(7.0f);
                        drawableLIZIZ.setBounds(iLIZ2, iLIZ3, ((drawableLIZIZ.getIntrinsicWidth() * 2) / 3) + iLIZ2, ((drawableLIZIZ.getIntrinsicHeight() * 2) / 3) + iLIZ3);
                        drawableLIZIZ.draw(canvas);
                        canvas.drawText(filterName, C0FU0.LIZ(3.0f) + iLIZ2 + ((drawableLIZIZ.getIntrinsicWidth() * 2) / 3), iLIZ3 + C0FU0.LIZ(8.0f), this.LJIIIIZZ);
                    }
                    this.LIZLLL = true;
                } else {
                    this.LIZLLL = false;
                }
                if (C351220Dpo.LLLFZ(nLETrackSlot)) {
                    Drawable drawableLIZIZ2 = C800330VaR.LIZIZ(this.LIZIZ, R.drawable.c3_);
                    if (drawableLIZIZ2 != null) {
                        float fWidth2 = this.LJIIIZ.width() + C0FU0.LIZ(28.0f);
                        canvas.drawRoundRect(fWidth2, C0FU0.LIZ(4.0f), fWidth2 + C0FU0.LIZ(18.0f), C0FU0.LIZ(20.0f), LJ(), LJ(), this.LJI);
                        int i5 = (int) fWidth2;
                        drawableLIZIZ2.setBounds(C0FU0.LIZ(3.0f) + i5, C0FU0.LIZ(7.0f), i5 + C0FU0.LIZ(15.0f), C0FU0.LIZ(19.0f));
                        drawableLIZIZ2.draw(canvas);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LIZJ = z2;
                String strJ42 = C786410Ut5.j4("%3.1fx", Arrays.copyOf(new Object[]{Float.valueOf(absSpeed)}, 1));
                if (Intrinsics.LJFF(strJ42, "1.0x") || this.LIZLLL) {
                    return;
                }
                LIZJ(canvas, strJ42);
            }
        };
        this.LLJZIJLIL = new ArrayList();
        this.LLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(2));
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(4));
        this.LLLFZ = "";
        this.LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 3));
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(context, 2));
        this.LLLIIII = "";
        this.LLLIIIIL = true;
        this.LLLIIIL = true;
        this.LLLIILIL = true;
        this.LLLIL = C13BV.INSTANCE;
        this.LLLILZ = true;
        paint.setAntiAlias(true);
        float f = C367650EbD.LLJIJIL;
        paint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f);
        textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        paint3.setAntiAlias(true);
        paint3.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C0FU0.LIZ(1.0f));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C369030EdR.LIZJ(this, C0FU0.LIZ(8.0f), C0FU0.LIZ(6.0f), 0, C0FU0.LIZ(6.0f));
    }

    public final void LJIIL(Canvas canvas, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6 = f;
        float measuredHeight = getMeasuredHeight();
        float f7 = f2 - f6;
        canvas.save();
        canvas.clipRect(f6, 0.0f, f2, measuredHeight);
        float f8 = f2;
        this.LLJJJJLIIL.setShader(new LinearGradient(f6, 0.0f, f2, 0.0f, C367740EbM.LIZ(f3, -16777216), C367740EbM.LIZ(f4, -16777216), Shader.TileMode.CLAMP));
        this.LLJJJJ.reset();
        if (!z) {
            f6 -= f7;
        }
        Path path = this.LLJJJJ;
        if (z) {
            f8 = 2 * f2;
        }
        float f9 = 2;
        float f10 = measuredHeight * f9;
        path.addOval(f6, 0.0f, f8, f10, Path.Direction.CW);
        canvas.drawPath(this.LLJJJJ, this.LLJJJJLIIL);
        Paint paint = this.LLJJJJJIL;
        ContextThemeWrapper darkContext = getDarkContext();
        int iIntValue = R.attr.zk;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, darkContext);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        paint.setColor(iIntValue);
        if (z) {
            f5 = f9 * f2;
        } else {
            f5 = f2;
        }
        canvas.drawOval(f6, 0.0f, f5, f10, this.LLJJJJJIL);
        this.LLJJJJLIIL.setShader(null);
        canvas.restore();
    }
}
