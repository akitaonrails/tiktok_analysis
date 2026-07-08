package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Eav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367470Eav extends AbstractC368090Ebv implements InterfaceC497601wk {
    public static final int LLLLILI;
    public static final int LLLLJ;
    public static final HashMap<String, Bitmap> LLLLJI;
    public final C368630Ecn LLJIJIL;
    public final C368390EcP LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public float LLJJI;
    public RectF LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public InterfaceC367710EbJ LLJJJIL;
    public final RectF LLJJJJ;
    public final Paint LLJJJJJIL;
    public final Paint LLJJJJLIIL;
    public final TextPaint LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public long LLJLIL;
    public final Rect LLJLILLLLZIIL;
    public final Path LLJLL;
    public Bitmap LLJLLIL;
    public Bitmap LLJLLL;
    public final C1DFB LLJZ;
    public boolean LLJZIJLIL;
    public final Paint LLL;
    public final C01GW LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public Bitmap LLLFZ;
    public final List<Pair<Long, Float>> LLLI;
    public String LLLII;
    public InterfaceC367810EbT LLLIIII;
    public final int LLLIIIIL;
    public final int LLLIIIL;
    public final int LLLIIL;
    public final int LLLIILIL;
    public final int LLLIL;
    public final int LLLILZ;
    public final int LLLILZJ;
    public final int LLLILZLLLI;
    public final int LLLIZZ;
    public final int LLLJ;
    public final int LLLJIL;
    public final int LLLJL;
    public final int LLLL;
    public final int LLLLII;
    public final int LLLLIIIILLL;
    public final int LLLLIIL;
    public final int LLLLIILL;
    public final C01GW LLLLIILLL;
    public InterfaceC367590Eb7 LLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: JSONException -> 0x00e9, TryCatch #0 {JSONException -> 0x00e9, blocks: (B:8:0x0010, B:10:0x0018, B:12:0x001e, B:14:0x002b, B:16:0x0031, B:18:0x0043, B:20:0x0049, B:22:0x0053, B:24:0x0059, B:26:0x005f, B:28:0x0067, B:29:0x006c, B:31:0x0078, B:38:0x0087, B:39:0x008b, B:41:0x0095, B:42:0x0099, B:44:0x00a3, B:46:0x00ab, B:49:0x00b4, B:51:0x00b8, B:53:0x00c3, B:55:0x00c9, B:57:0x00d1, B:59:0x00da, B:61:0x00e3), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: JSONException -> 0x00e9, TryCatch #0 {JSONException -> 0x00e9, blocks: (B:8:0x0010, B:10:0x0018, B:12:0x001e, B:14:0x002b, B:16:0x0031, B:18:0x0043, B:20:0x0049, B:22:0x0053, B:24:0x0059, B:26:0x005f, B:28:0x0067, B:29:0x006c, B:31:0x0078, B:38:0x0087, B:39:0x008b, B:41:0x0095, B:42:0x0099, B:44:0x00a3, B:46:0x00ab, B:49:0x00b4, B:51:0x00b8, B:53:0x00c3, B:55:0x00c9, B:57:0x00d1, B:59:0x00da, B:61:0x00e3), top: B:66:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getDrawBitmapFromInfoStickerAsset() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367470Eav.getDrawBitmapFromInfoStickerAsset():void");
    }

    static {
        ColorProtector.parseColor("#5E76EE");
        ColorProtector.parseColor("#5E76EE");
        LLLLILI = ColorProtector.parseColor("#514EFB");
        LLLLJ = ColorProtector.parseColor("#E5674E");
        LLLLJI = new HashMap<>();
    }

    private final float getLineHeight() {
        return C0FU0.LIZ(7.0f);
    }

    private final C367540Eb2 getOldTrackViewModel() {
        return (C367540Eb2) this.LLLLIILLL.getValue();
    }

    private final InterfaceC367590Eb7 getTrackViewModel() {
        InterfaceC367590Eb7 interfaceC367590Eb7 = this.LLLLIL;
        return interfaceC367590Eb7 == null ? getOldTrackViewModel() : interfaceC367590Eb7;
    }

    public final boolean LJIILJJIL() {
        return ((Boolean) this.LLLF.getValue()).booleanValue();
    }

    public final void LJIIZILJ() {
        float f = this.LLLILZLLLI;
        this.LLJLLL = LJIIL(f, f, R.raw.icon_camera_sticker_round_fill);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLJLLL != null) {
            this.LLJLLL = null;
        }
        if (this.LLJLLIL != null) {
            this.LLJLLIL = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJJ;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public int getBgColor() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC368090Ebv
    public int getBgRadius() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC368090Ebv
    public float getClipLength() {
        return this.LLJJI;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public RectF getClipRectF() {
        return this.LLJJIII;
    }

    public final C368390EcP getConfig() {
        return this.LLJILJIL;
    }

    public final String getContentText() {
        return this.LLLII;
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJZ;
    }

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJILLL;
    }

    public final boolean getHasLine$editor_trackpanel_release() {
        return this.LLLFF;
    }

    public final InterfaceC367810EbT getLabelPainter$editor_trackpanel_release() {
        return this.LLLIIII;
    }

    public final boolean getShouldDrawTextFlag$editor_trackpanel_release() {
        return this.LLLFFI;
    }

    public final String getText() {
        return this.LLLII;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJIJI;
    }

    public final C368630Ecn getTrackGroup() {
        return this.LLJIJIL;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLLLIL;
    }

    public final String getTtsAudioPath() {
        return this.LLJJJ;
    }

    public final InterfaceC367710EbJ getTtsWavePainter() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public final void LJI(Canvas canvas) {
        int scrollX;
        View view;
        float clipLength;
        float clipStart;
        int scrollX2;
        float f;
        float fWidth;
        View view2;
        String resourceFile;
        NLESegmentImageSticker nLESegmentImageStickerDynamicCast;
        NLEResourceNode imageFile;
        int iLIZ;
        float f2;
        int i;
        float fWidth2;
        int i2;
        float fLIZIZ;
        float f3;
        float f4;
        int i3;
        float f5;
        int i4;
        int i5;
        Bitmap bitmap;
        int i6;
        int i7;
        float fWidth3;
        float fLIZIZ2;
        float f6;
        int i8;
        Bitmap bitmap2;
        int width;
        int scrollX3;
        int scrollX4;
        int bgColor;
        canvas.getClipBounds(this.LLJLILLLLZIIL);
        if (!this.LLJJ) {
            Paint paint = this.LLJJJJJIL;
            Typeface typeface = C368130Ebz.LIZ;
            Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.e2));
            if (numLIZIZ != null) {
                bgColor = numLIZIZ.intValue();
            } else {
                bgColor = getBgColor();
            }
            paint.setColor(bgColor);
            canvas.drawRoundRect(new RectF(this.LLJLILLLLZIIL), getBgRadius(), getBgRadius(), this.LLJJJJJIL);
        }
        if (!this.LLJJ || getTrackStyle() == C0E6E.LINE) {
            Rect rect = this.LLJLILLLLZIIL;
            int i9 = rect.left;
            int i10 = C367650EbD.LLILZLL;
            int i11 = i9 + i10;
            int i12 = rect.right - i10;
            C0E6E trackStyle = getTrackStyle();
            C0E6E c0e6e = C0E6E.LINE;
            if (trackStyle == c0e6e) {
                int i13 = (int) (C368640Eco.LJJIL / 2);
                i11 -= i13;
                i12 += i13;
                setBgRadius(this.LLJILJIL.LJ);
            }
            Rect rect2 = this.LLJLILLLLZIIL;
            RectF rectF = new RectF(i11, rect2.top, i12, rect2.bottom);
            this.LLJLL.reset();
            this.LLJLL.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            if (getTrackStyle() != c0e6e) {
                canvas.clipPath(this.LLJLL);
            }
        }
        this.LLJJJJJIL.setColor(getBgColor());
        if (getBgRadius() > 0) {
            RectF rectF2 = new RectF(this.LLJLILLLLZIIL);
            ViewGroup parentView = getParentView();
            if (parentView != null) {
                width = parentView.getWidth();
            } else {
                width = 0;
            }
            int left = getLeft();
            ViewGroup parentView2 = getParentView();
            if (parentView2 != null) {
                scrollX3 = parentView2.getScrollX();
            } else {
                scrollX3 = 0;
            }
            int i14 = left - scrollX3;
            int right = getRight();
            ViewGroup parentView3 = getParentView();
            if (parentView3 != null) {
                scrollX4 = parentView3.getScrollX();
            } else {
                scrollX4 = 0;
            }
            int i15 = right - scrollX4;
            if (i14 < 0) {
                float f7 = rectF2.left;
                int i16 = -i14;
                int bgRadius = getBgRadius();
                if (i16 > bgRadius) {
                    i16 = bgRadius;
                }
                rectF2.left = f7 - i16;
            }
            if (i15 > width) {
                float f8 = rectF2.right;
                int i17 = i15 - width;
                int bgRadius2 = getBgRadius();
                if (i17 > bgRadius2) {
                    i17 = bgRadius2;
                }
                rectF2.right = f8 + i17;
            }
            canvas.drawRoundRect(rectF2, getBgRadius(), getBgRadius(), this.LLJJJJJIL);
        } else {
            canvas.drawRect(this.LLJLILLLLZIIL, this.LLJJJJJIL);
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release != null && C351220Dpo.LLJJLIIIJLLLLLLLZ(nleTrackSlot$editor_trackpanel_release)) {
            if (nleTrackSlot$editor_trackpanel_release.hasExtra("previewIconPath")) {
                resourceFile = nleTrackSlot$editor_trackpanel_release.getExtra("previewIconPath");
            } else if (!C351220Dpo.LLJJJIL(nleTrackSlot$editor_trackpanel_release) || (nLESegmentImageStickerDynamicCast = NLESegmentImageSticker.dynamicCast((NLENode) nleTrackSlot$editor_trackpanel_release.getMainSegment())) == null || (imageFile = nLESegmentImageStickerDynamicCast.getImageFile()) == null || (resourceFile = imageFile.getResourceFile()) == null) {
                resourceFile = "";
            }
            if (!Intrinsics.LJFF(resourceFile, this.LLJILJILJ)) {
                this.LLJILJILJ = resourceFile;
                this.LLJLLL = null;
                this.LLJLLIL = null;
            }
            if (!C351220Dpo.LLIZ(nleTrackSlot$editor_trackpanel_release) && ((bitmap2 = this.LLJLLL) == null || bitmap2.isRecycled())) {
                if (!this.LLJZIJLIL && this.LLJLLL == null) {
                    this.LLJZIJLIL = true;
                    C23250099c.LIZLLL(this, null, null, new C0E72(this, resourceFile, null), 3);
                }
            } else {
                int iSave = canvas.save();
                if (this.LLJLIL <= 0 && this.LLJJLIIIJLLLLLLLZ <= 0 && this.LLJL <= 0) {
                    iLIZ = 0;
                } else {
                    iLIZ = C0FU0.LIZ(3.0f);
                }
                if (C351220Dpo.LLIZ(nleTrackSlot$editor_trackpanel_release) && ((bitmap = this.LLJLLL) == null || bitmap.isRecycled())) {
                    float f9 = this.LLLILZLLLI;
                    this.LLJLLL = LJIIL(f9, f9, R.raw.icon_calendar_fill);
                }
                NLETrackSlot nleTrackSlot$editor_trackpanel_release2 = getNleTrackSlot$editor_trackpanel_release();
                if (nleTrackSlot$editor_trackpanel_release2 != null && C351220Dpo.LLJJJIL(nleTrackSlot$editor_trackpanel_release2)) {
                    f2 = 0.0f;
                } else {
                    Bitmap bitmap3 = this.LLJLLL;
                    if (bitmap3 != null && bitmap3.getWidth() == this.LLLILZLLLI && getTrackHeight() == this.LLLIIIIL) {
                        f2 = C367530Eb1.LIZIZ * 2;
                    } else {
                        f2 = C367530Eb1.LIZIZ;
                    }
                }
                if (getTrackHeight() < this.LLLIIIIL) {
                    i = this.LLLIILIL;
                } else if (getTrackHeight() == this.LLLIIIIL) {
                    i = this.LLLIL;
                } else {
                    i = this.LLLILZ;
                }
                float f10 = i + f2 + iLIZ;
                Bitmap bitmap4 = this.LLJLLL;
                if (bitmap4 != null) {
                    if (getTrackHeight() < this.LLLIIIIL) {
                        Bitmap bitmap5 = this.LLJLLIL;
                        if (bitmap5 == null || bitmap5.isRecycled()) {
                            NLETrackSlot nleTrackSlot$editor_trackpanel_release3 = getNleTrackSlot$editor_trackpanel_release();
                            if (nleTrackSlot$editor_trackpanel_release3 != null && C351220Dpo.LLJJJIL(nleTrackSlot$editor_trackpanel_release3)) {
                                i5 = this.LLLILZLLLI;
                            } else if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release)) {
                                i5 = this.LLLJL;
                            } else {
                                i5 = this.LLLILZJ;
                            }
                            getContext();
                            this.LLJLLIL = C383660F2m.LIZJ(bitmap4, i5, i5, Bitmap.Config.ARGB_8888);
                        }
                        Bitmap bitmap6 = this.LLJLLIL;
                        if (bitmap6 != null) {
                            bitmap4 = bitmap6;
                        }
                    }
                    if (LJIILJJIL()) {
                        if (getClipRectF().width() == 0.0f) {
                            fWidth2 = getMeasuredWidth();
                        } else {
                            fWidth2 = getClipRectF().width();
                        }
                    } else {
                        fWidth2 = 0.0f;
                    }
                    if (getTrackHeight() < this.LLLIIIIL) {
                        if (C351220Dpo.LLJJJIL(nleTrackSlot$editor_trackpanel_release)) {
                            i2 = this.LLLILZLLLI;
                        } else {
                            i2 = this.LLLILZJ;
                        }
                    } else if (C351220Dpo.LLJJJIL(nleTrackSlot$editor_trackpanel_release)) {
                        i2 = this.LLLJ;
                    } else {
                        Bitmap bitmap7 = this.LLJLLL;
                        if (bitmap7 != null && bitmap7.getWidth() == this.LLLILZLLLI) {
                            i2 = this.LLLILZLLLI;
                        } else {
                            i2 = this.LLLIZZ;
                        }
                    }
                    if (LJIIJJI()) {
                        if (getTrackHeight() < this.LLLIIIIL) {
                            fLIZIZ = C418440Gaw.LIZIZ(6);
                        } else if (getTrackHeight() == this.LLLIIIIL) {
                            fLIZIZ = C418440Gaw.LIZIZ(10);
                        } else {
                            fLIZIZ = C418440Gaw.LIZIZ(12);
                        }
                    } else {
                        fLIZIZ = this.LLLIIL;
                    }
                    if (LJIILJJIL()) {
                        f3 = ((fWidth2 - fLIZIZ) - f2) - i2;
                    } else {
                        f3 = fWidth2 + fLIZIZ + f2;
                    }
                    Path path = new Path();
                    float f11 = i2;
                    RectF rectF3 = new RectF(f3, f10, f3 + f11, f10 + f11);
                    float f12 = this.LLLIIIL;
                    path.addRoundRect(rectF3, f12, f12, Path.Direction.CCW);
                    canvas.clipPath(path);
                    if (LJIILJJIL()) {
                        if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() < this.LLLIIIIL) {
                            f5 = fWidth2 - this.LLLLIILL;
                            i4 = this.LLLJL;
                        } else if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() == this.LLLIIIIL) {
                            f5 = fWidth2 - this.LLLLIIL;
                            i4 = this.LLLJIL;
                        } else {
                            f4 = ((fWidth2 - fLIZIZ) - f2) - f11;
                        }
                        f4 = f5 - i4;
                    } else {
                        if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() < this.LLLIIIIL) {
                            i3 = this.LLLLIILL;
                        } else if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() == this.LLLIIIIL) {
                            i3 = this.LLLLIIL;
                        } else {
                            f4 = fWidth2 + fLIZIZ + f2;
                        }
                        f4 = i3;
                    }
                    if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() < this.LLLIIIIL) {
                        f10 = 0.0f;
                    } else if (C351220Dpo.LLJZIJLIL(nleTrackSlot$editor_trackpanel_release) && getTrackHeight() == this.LLLIIIIL) {
                        f10 = this.LLLLIIL;
                    }
                    canvas.drawBitmap(bitmap4, f4, f10, this.LLJJJJJIL);
                }
                canvas.restoreToCount(iSave);
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f_, getContext());
            if (numLIZJ != null) {
                this.LLJJJJJIL.setColor(numLIZJ.intValue());
                this.LLJJJJJIL.setAlpha(51);
                if (getTrackHeight() < this.LLLIIIIL) {
                    i6 = this.LLLIILIL;
                } else if (getTrackHeight() == this.LLLIIIIL) {
                    i6 = this.LLLIL;
                } else {
                    i6 = this.LLLILZ;
                }
                if (getTrackHeight() < this.LLLIIIIL) {
                    i7 = this.LLLILZLLLI;
                } else {
                    i7 = this.LLLJ;
                }
                if (LJIILJJIL()) {
                    if (getClipRectF().width() == 0.0f) {
                        fWidth3 = getMeasuredWidth();
                    } else {
                        fWidth3 = getClipRectF().width();
                    }
                } else {
                    fWidth3 = 0.0f;
                }
                if (LJIIJJI()) {
                    if (getTrackHeight() < this.LLLIIIIL) {
                        fLIZIZ2 = C418440Gaw.LIZIZ(6);
                    } else if (getTrackHeight() == this.LLLIIIIL) {
                        fLIZIZ2 = C418440Gaw.LIZIZ(10);
                    } else {
                        fLIZIZ2 = C418440Gaw.LIZIZ(12);
                    }
                } else {
                    fLIZIZ2 = this.LLLIIL;
                }
                if (LJIILJJIL()) {
                    f6 = (fWidth3 - fLIZIZ2) - i7;
                } else {
                    f6 = fWidth3 + fLIZIZ2;
                }
                float f13 = i6 + i7;
                float f14 = i6;
                RectF rectF4 = new RectF(f6, f14, i7 + f6, f13);
                float f15 = this.LLLIIIL;
                canvas.drawRoundRect(rectF4, f15, f15, this.LLJJJJJIL);
                if (this.LLJLLL == null) {
                    this.LLJJJJLIIL.setStrokeWidth(this.LLLLIIIILLL);
                    this.LLJJJJLIIL.setAlpha(76);
                    this.LLJJJJLIIL.setPathEffect(new DashPathEffect(new float[]{C12ES.LIZJ(4.0f, getContext()), C12ES.LIZJ(2.0f, getContext())}, 0.0f));
                    if (getTrackHeight() < this.LLLIIIIL) {
                        i8 = this.LLLLII;
                    } else {
                        i8 = this.LLLL;
                    }
                    float f16 = i7 / 2;
                    canvas.drawCircle(f6 + f16, f14 + f16, i8, this.LLJJJJLIIL);
                }
            }
        }
        if (this.LLLFFI) {
            if (this.LLLFZ == null) {
                this.LLLFZ = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.d_2);
            }
            Bitmap bitmap8 = this.LLLFZ;
            if (bitmap8 != null) {
                canvas.drawBitmap(bitmap8, C0FU0.LIZ(4.0f), C0FU0.LIZ(4.0f), this.LLJJJJJIL);
            }
        }
        if (!((ArrayList) this.LLLI).isEmpty()) {
            if (getClipStart() == 0.0f && getClipLength() == 0.0f) {
                clipLength = getMeasuredWidth();
                clipStart = 0.0f;
            } else {
                clipLength = getClipLength() - getClipStart();
                clipStart = getClipStart();
            }
            this.LLJJJIL.LIZIZ((0 * getTimelineScale()) + clipStart, 0.0f, 1.0f);
            Object parent = getParent();
            if ((parent instanceof C368630Ecn) && (view2 = (View) parent) != null) {
                scrollX2 = view2.getScrollX();
            } else {
                scrollX2 = 0;
            }
            float f18 = scrollX2;
            int i18 = C368630Ecn.LLLLJI;
            getContext();
            float fLIZ = (C369020EdQ.LIZ() + f18) - clipStart;
            float left2 = getLeft() + clipStart + getTranslationX();
            if (f18 > left2) {
                f = f18 - left2;
            } else {
                f = 0.0f;
            }
            if (fLIZ < clipLength) {
                clipLength = fLIZ;
            }
            if (LJIILJJIL()) {
                if (getClipLength() == 0.0f) {
                    fWidth = this.LLJLILLLLZIIL.right;
                } else {
                    fWidth = getClipRectF().width();
                }
                this.LLJJJJ.set(this.LLJLILLLLZIIL.left, 0.0f, fWidth, getMeasuredHeight());
            } else {
                this.LLJJJJ.set(f, 0.0f, clipLength, getMeasuredHeight());
            }
            this.LLJJJIL.LIZLLL(canvas, this.LLJJJJ, this.LLLI, getTimelineScale(), EnumC367660EbE.TEXT_TO_SPEECH, getClipRectF().width());
            int iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.m5);
            int iLIZ3 = C446980Hfs.LIZ(getContext(), R.color.m4);
            Rect rect3 = this.LLJLILLLLZIIL;
            this.LLL.setShader(new LinearGradient(rect3.left, 0.0f, rect3.right, 0.0f, iLIZ2, iLIZ3, Shader.TileMode.CLAMP));
            if (getBgRadius() > 0) {
                canvas.drawRoundRect(new RectF(this.LLJLILLLLZIIL), getBgRadius(), getBgRadius(), this.LLL);
            } else {
                canvas.drawRect(this.LLJLILLLLZIIL, this.LLL);
            }
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release4 = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release4 != null) {
            Object parent2 = getParent();
            if ((parent2 instanceof C368630Ecn) && (view = (View) parent2) != null) {
                scrollX = view.getScrollX();
            } else {
                scrollX = 0;
            }
            this.LLLIIII.LIZIZ(this, nleTrackSlot$editor_trackpanel_release4, new RectF(this.LLJLILLLLZIIL), canvas, scrollX, 0L);
        }
        super.LJI(canvas);
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJJ) {
            setBgRadius(LJIIJ(getTrackViewModel().LIZIZ()));
            LJI(canvas);
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgColor(int i) {
        this.LLJJIJIIJIL = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgRadius(int i) {
        this.LLJJIJIL = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipLength(float f) {
        this.LLJJI = f;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipRectF(RectF rectF) {
        this.LLJJIII = rectF;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setDrawDivider(boolean z) {
        if (this.LLJILLL != z) {
            this.LLJILLL = z;
            invalidate();
        }
    }

    public final void setHasLine$editor_trackpanel_release(boolean z) {
        this.LLLFF = z;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setItemSelected(boolean z) {
        this.LLJJ = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(InterfaceC367810EbT interfaceC367810EbT) {
        this.LLLIIII = interfaceC367810EbT;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setSegment(NLETrackSlot nLETrackSlot) {
        int iIntValue;
        int iIntValue2;
        TrackShowType trackShowTypeLIZIZ;
        NLEModel curNLEModelStage;
        NLEStyStickerAnim animation;
        String content;
        setNleTrackSlot$editor_trackpanel_release(nLETrackSlot);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        String strLIZIZ = "";
        if (NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f9, getContext());
            if (numLIZJ != null) {
                setBgColor(numLIZJ.intValue());
            }
            setText("");
        }
        if (NLESegmentImageSticker.dynamicCast((NLENode) mainSegment) != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f9, getContext());
            if (numLIZJ2 != null) {
                setBgColor(numLIZJ2.intValue());
            }
            setText("");
        } else {
            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) mainSegment);
            if (nLESegmentTextStickerDynamicCast != null) {
                setText(nLETrackSlot.getExtra("text"));
                if (a0.LJJJIL(this.LLLII)) {
                    setText(nLESegmentTextStickerDynamicCast.getContent());
                }
                Typeface typeface = C368130Ebz.LIZ;
                Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bqi));
                if (numLIZIZ != null) {
                    iIntValue = numLIZIZ.intValue();
                } else {
                    iIntValue = LLLLILI;
                }
                Integer numLIZIZ2 = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bqe));
                if (numLIZIZ2 != null) {
                    iIntValue2 = numLIZIZ2.intValue();
                } else {
                    iIntValue2 = LLLLJ;
                }
                if (Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE") && (((trackShowTypeLIZIZ = getTrackViewModel().LIZIZ()) != TrackShowType.NORMAL && trackShowTypeLIZIZ != TrackShowType.NORMAL_WITHOUT_OVERLAY) || (curNLEModelStage = this.LLJIJIL.getCurNLEModelStage()) == null || C351220Dpo.LJJLIIIJILLIZJL(curNLEModelStage).size() <= 0)) {
                    iIntValue = iIntValue2;
                }
                setBgColor(iIntValue);
                if (nLETrackSlot.hasExtra("tts_audio_path")) {
                    if (!Intrinsics.LJFF(this.LLJJJ, nLETrackSlot.getExtra("tts_audio_path"))) {
                        String extra = nLETrackSlot.getExtra("tts_audio_path");
                        this.LLJJJ = extra;
                        C20137613qo c20137613qo = C20137613qo.LIZ;
                        long j = C20137613qo.LIZJ(extra).LIZ;
                        ((ArrayList) this.LLLI).clear();
                        C817503Hh c817503Hh = C817503Hh.LL;
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C352040Dr8(this, j, null), 2);
                    }
                } else {
                    this.LLJJJ = "";
                    ((ArrayList) this.LLLI).clear();
                    invalidate();
                }
            }
        }
        NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment);
        if (nLESegmentTextTemplateDynamicCast != null) {
            for (int i = 0; i < nLESegmentTextTemplateDynamicCast.getTextClips().size(); i++) {
                if (i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append('\\');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                Iterator<NLETextTemplateClip> it2 = nLESegmentTextTemplateDynamicCast.getTextClips().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        NLETextTemplateClip next = it2.next();
                        if (next.getIndex() == i) {
                            content = next.getContent();
                            break;
                        }
                    } else {
                        content = null;
                        break;
                    }
                }
                sbLIZ2.append(content);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            setText(strLIZIZ);
            setBgColor(LLLLILI);
        }
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(mainSegment);
        if (nLESegmentStickerDynamicCast != null && (animation = nLESegmentStickerDynamicCast.getAnimation()) != null) {
            if (animation.getLoop()) {
                long inDuration = animation.getInDuration();
                nLETrackSlot.getDuration();
                this.LLJLIL = inDuration;
                invalidate();
                return;
            }
            long inDuration2 = animation.getInDuration();
            long outDuration = animation.getOutDuration();
            nLETrackSlot.getDuration();
            this.LLJJLIIIJLLLLLLLZ = inDuration2;
            this.LLJL = outDuration;
            invalidate();
        }
    }

    public final void setShouldDrawTextFlag$editor_trackpanel_release(boolean z) {
        if (z != this.LLLFFI) {
            this.LLLFFI = z;
            invalidate();
        }
    }

    public final void setText(String str) {
        if (!Intrinsics.LJFF(str, this.LLLII)) {
            this.LLLII = str;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJIJI = f;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLLLIL = interfaceC367590Eb7;
    }

    public final void setTtsAudioPath(String str) {
        this.LLJJJ = str;
    }

    public final void setTtsWavePainter(InterfaceC367710EbJ interfaceC367710EbJ) {
        this.LLJJJIL = interfaceC367710EbJ;
    }

    public C367470Eav(C19EG c19eg, C368630Ecn c368630Ecn) {
        super(c19eg, null, 0);
        this.LLJIJIL = c368630Ecn;
        Typeface typeface = C368130Ebz.LIZ;
        this.LLJILJIL = C368130Ebz.LIZ(getContext());
        this.LLJILLL = true;
        this.LLJJIII = new RectF();
        this.LLJJIJI = C360610EBv.LIZJ();
        this.LLJJIJIIJIL = ColorProtector.parseColor("#51c7b1");
        this.LLJJJ = "";
        this.LLJJJIL = new C369590EeL();
        this.LLJJJJ = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJJJJJIL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.LLJJJJLIIL = paint2;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C367530Eb1.LIZ);
        textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LLJJL = textPaint;
        new Path();
        C0FU0.LIZ(2.0f);
        this.LLJLILLLLZIIL = new Rect();
        this.LLJLL = new Path();
        this.LLJZ = C0PEM.LIZJ;
        this.LLL = new Paint();
        this.LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1055));
        this.LLLI = new ArrayList();
        this.LLLII = "";
        this.LLLIIII = new InterfaceC367810EbT() { // from class: X.0EaV
            public final TextPaint LIZ;
            public final float LIZIZ;

            @Override // X.InterfaceC367810EbT
            public final void LIZ(C367200EaU c367200EaU) {
            }

            {
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setColor(-1);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C0FU0.LIZ(10.0f));
                textPaint2.setStrokeWidth(C0FU0.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
                this.LIZ = textPaint2;
                this.LIZIZ = C0FU0.LIZ(4.0f);
            }

            @Override // X.InterfaceC367810EbT
            public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
                C367470Eav c367470Eav;
                int iLIZ;
                if ((interfaceC368560Ecg instanceof C367470Eav) && (c367470Eav = (C367470Eav) interfaceC368560Ecg) != null) {
                    float f = this.LIZIZ;
                    if (!(!((ArrayList) c367470Eav.LLLI).isEmpty())) {
                        iLIZ = 0;
                    } else {
                        iLIZ = C0FU0.LIZ(19.0f);
                    }
                    canvas.drawText(c367470Eav.getContentText(), f + iLIZ, ((c367470Eav.getMeasuredHeight() + this.LIZ.getTextSize()) / 2.0f) - C0FU0.LIZ(2.0f), this.LIZ);
                }
            }
        };
        this.LLLIIIIL = C360610EBv.LJ;
        this.LLLIIIL = C0FU0.LIZ(4.0f);
        this.LLLIIL = C0FU0.LIZ(4.0f);
        this.LLLIILIL = C0FU0.LIZ(3.0f);
        this.LLLIL = C0FU0.LIZ(4.0f);
        this.LLLILZ = C0FU0.LIZ(10.0f);
        this.LLLILZJ = C0FU0.LIZ(14.0f);
        this.LLLILZLLLI = C0FU0.LIZ(18.0f);
        this.LLLIZZ = C0FU0.LIZ(22.0f);
        this.LLLJ = C0FU0.LIZ(26.0f);
        this.LLLJIL = C0FU0.LIZ(36.0f);
        this.LLLJL = C0FU0.LIZ(24.0f);
        this.LLLL = C0FU0.LIZ(8.0f);
        this.LLLLII = C0FU0.LIZ(6.0f);
        this.LLLLIIIILLL = C0FU0.LIZ(1.14f);
        this.LLLLIIL = C0FU0.LIZ(-1.0f);
        this.LLLLIILL = C0FU0.LIZ(1.0f);
        this.LLLLIILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(293));
        this.LLLLIL = c368630Ecn.getTrackViewModelCompat();
    }

    public final void LJIILIIL(final int i, final String str) {
        Size sizeLIZIZ = C20137413qm.LIZ.LIZIZ(i, str);
        VEUtils.getVideoFrames2(str, new int[]{0}, sizeLIZIZ.getWidth(), sizeLIZIZ.getHeight(), false, new InterfaceC1286300jZs() { // from class: X.0Eay
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                C354270Duj.LIZJ(0L, new C367510Eaz(byteBuffer, this.LIZ, str, i2, i3, i));
                return true;
            }
        });
    }

    public final Bitmap LJIIL(float f, float f2, int i) {
        Object c098200Yq;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        c419910GdJ.LJFF = true;
        int i2 = (int) f;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        try {
            c098200Yq = Bitmap.createBitmap(tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ(), Bitmap.Config.ARGB_8888);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Bitmap bitmap = (Bitmap) c098200Yq;
        if (bitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap);
        tuxIconDrawableLIZ.setBounds(0, 0, i2, (int) f2);
        tuxIconDrawableLIZ.draw(canvas);
        return bitmap;
    }

    public final Bitmap LJIILLIIL(int i, int i2, Bitmap bitmap) {
        int width;
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (iMin > i) {
            if (bitmap.getWidth() > bitmap.getHeight()) {
                i = (int) (bitmap.getWidth() * (i / bitmap.getHeight()));
            }
            if (bitmap.getWidth() <= bitmap.getHeight()) {
                i2 = (int) (bitmap.getHeight() * (i2 / bitmap.getWidth()));
            }
            getContext();
            return C383660F2m.LIZJ(bitmap, i, i2, Bitmap.Config.ARGB_8888);
        }
        if (iMax < i) {
            if (bitmap.getWidth() > bitmap.getHeight()) {
                width = i;
            } else {
                width = (int) (bitmap.getWidth() * (i2 / bitmap.getHeight()));
            }
            if (bitmap.getWidth() > bitmap.getHeight()) {
                i2 = (int) (bitmap.getHeight() * (i / bitmap.getWidth()));
            }
            getContext();
            return C383660F2m.LIZJ(bitmap, width, i2, Bitmap.Config.ARGB_8888);
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(int r8, int r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C367480Eaw
            if (r0 == 0) goto L25
            r6 = r11
            X.0Eaw r6 = (X.C367480Eaw) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            int r9 = r6.LLILLJJLI
            int r8 = r6.LL
            goto L57
        L25:
            X.0Eaw r6 = new X.0Eaw
            r6.<init>(r7, r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            X.0Eg6 r1 = new X.0Eg6     // Catch: java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L64
            r1.LIZIZ(r8)     // Catch: java.lang.Throwable -> L64
            r1.LIZ(r9)     // Catch: java.lang.Throwable -> L64
            X.0Eg7 r0 = new X.0Eg7     // Catch: java.lang.Throwable -> L64
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            r6.LL = r8     // Catch: java.lang.Throwable -> L64
            r6.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L64
            r6.LLILZIL = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = X.C383660F2m.LIZIZ(r2, r10, r0, r6)     // Catch: java.lang.Throwable -> L64
            if (r1 != r5) goto L5a
            return r5
        L57:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L64
        L5a:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L63
            android.graphics.Bitmap r0 = r7.LJIILLIIL(r8, r9, r1)     // Catch: java.lang.Throwable -> L64
            return r0
        L63:
            return r4
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L77
            return r4
        L77:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367470Eav.LJIILL(int, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJL.setTextSize(C0FU0.LIZ(10.0f));
        int iLIZ = C0FU0.LIZ(8.0f);
        C369030EdR.LIZJ(this, iLIZ, 0, iLIZ, 0);
    }
}
