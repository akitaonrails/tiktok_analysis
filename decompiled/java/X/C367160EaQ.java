package X;

import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367160EaQ implements InterfaceC367810EbT {
    public final C19EG LIZ;
    public final C0E48 LIZIZ;
    public int LIZJ;
    public final C444890HcV LIZLLL;
    public final TuxIconDrawable LJ;
    public final TuxIconDrawable LJFF;
    public C0E5S LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final Rect LJIIJ;
    public String LJIIJJI;
    public C367200EaU LJIIL;

    public final boolean LIZJ() {
        LiveState<TrackShowType> liveStateQ82;
        C0E5S c0e5s = this.LJI;
        return ((c0e5s == null || (liveStateQ82 = c0e5s.Q82()) == null) ? null : liveStateQ82.LIZJ()) == TrackShowType.NORMAL;
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LJIIIZ.getValue()).booleanValue();
    }

    public static boolean LJ(NLETrackSlot nLETrackSlot) {
        NLEStyStickerAnim animation;
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentStickerDynamicCast != null && (animation = nLESegmentStickerDynamicCast.getAnimation()) != null) {
            if (animation.hasInDuration() || animation.hasOutDuration()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
        this.LJIIL = c367200EaU;
    }

    public C367160EaQ(C19EG c19eg, C0E48 c0e48) {
        float f;
        float f2;
        this.LIZ = c19eg;
        this.LIZIZ = c0e48;
        float f3 = 9.0f;
        if (C297330Bl5.LIZIZ()) {
            f = 8.0f;
        } else if (C297330Bl5.LIZJ()) {
            f = 9.0f;
        } else {
            f = 7.0f;
        }
        this.LIZJ = C0FU0.LIZ(f);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setColor(c19eg.getResources().getColor(R.color.f569bc));
        c444890HcV.setAntiAlias(true);
        if (C297330Bl5.LIZIZ()) {
            f2 = 12.0f;
        } else {
            f2 = 10.0f;
        }
        c444890HcV.setTextSize(C0FU0.LIZ(f2));
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        c444890HcV.LIZ(62);
        this.LIZLLL = c444890HcV;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_human_soundwave_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = false;
        this.LJ = c419910GdJ.LIZ(c19eg);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_text_animate_background_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ2.LJFF = false;
        this.LJFF = c419910GdJ2.LIZ(c19eg);
        C0FU0.LIZ(8.0f);
        if (!C297330Bl5.LIZIZ()) {
            if (C297330Bl5.LIZJ()) {
                f3 = 10.0f;
            } else {
                f3 = 8.0f;
            }
        }
        this.LJII = C0FU0.LIZ(f3);
        this.LJIIIIZZ = C0FU0.LIZ(14.0f);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 701));
        this.LJIIJ = new Rect();
        this.LJIIJJI = "";
        this.LJIIL = new C367200EaU(0, 0.0f, 0.0f, 0, 0, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    @Override // X.InterfaceC367810EbT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC368560Ecg r16, com.bytedance.ies.nle.editor_jni.NLETrackSlot r17, android.graphics.RectF r18, android.graphics.Canvas r19, int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367160EaQ.LIZIZ(X.0Ecg, com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.graphics.RectF, android.graphics.Canvas, int, long):void");
    }
}
