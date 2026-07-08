package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ETm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365200ETm extends ViewGroup {
    public final C365260ETs LL;
    public final InterfaceC365270ETt LLILLJJLI;
    public final C356830Dyr LLILLL;
    public final C01GW LLILZ;
    public final Map<NLETrackSlot, C365220ETo> LLILZIL;
    public Pair<? extends NLETrackSlot, C365220ETo> LLILZLL;
    public Pair<? extends NLETrackSlot, C365220ETo> LLIZ;
    public float LLIZLLLIL;
    public ImageView LLJ;
    public boolean LLJI;
    public float LLJIJIL;
    public Pair<Integer, Integer> LLJILJIL;
    public EnumC365130ETf LLJILJILJ;
    public long LLJILLL;
    public final C01GW LLJJ;

    private final C365250ETr getClipView() {
        return (C365250ETr) this.LLILZ.getValue();
    }

    private final int getCursorWidth() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final NLETrackSlot getSelectedSlot$tools_camera_edit_release() {
        Pair<? extends NLETrackSlot, C365220ETo> pair = this.LLIZ;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    public final void LJII() {
        C365250ETr clipView = getClipView();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, clipView);
        removeView(clipView);
        getClipView().setSlot$tools_camera_edit_release(EnumC365230ETp.NONE);
        this.LLIZ = null;
    }

    public final C365250ETr getClipView$tools_camera_edit_release() {
        return getClipView();
    }

    public final float LIZ(float f) {
        int cursorWidth = this.LL.LJIIJJI - (getCursorWidth() / 2);
        int iLIZIZ = (C1415610mwR.LIZIZ() - this.LL.LJIIJJI) - (getCursorWidth() / 2);
        float f2 = cursorWidth;
        if (f >= f2) {
            f2 = iLIZIZ;
            if (f <= f2) {
                return f;
            }
        }
        return f2;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        ImageView imageView = this.LLJ;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        if (C444960Hcc.LIZIZ()) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.setMarginStart(i);
        }
        ImageView imageView3 = this.LLJ;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C786410Ut5.c6(imageView2, marginLayoutParams);
    }

    public final void LIZLLL(float f) {
        if (C444960Hcc.LIZJ(getContext())) {
            f = 1 - f;
        }
        int iLIZIZ = C1415610mwR.LIZIZ();
        LIZJ((int) LIZ((this.LL.LJIIJJI + ((iLIZIZ - (r1 * 2)) * f)) - (getCursorWidth() / 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot r6) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365200ETm.LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final void LJI(boolean z) {
        float f;
        if (z) {
            f = 1.1f;
        } else {
            f = 1.0f;
        }
        ImageView imageView = this.LLJ;
        if (imageView == null) {
            imageView = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView.animate();
        viewPropertyAnimatorAnimate.scaleX(f);
        viewPropertyAnimatorAnimate.scaleY(f);
        viewPropertyAnimatorAnimate.setDuration(50L);
        viewPropertyAnimatorAnimate.start();
    }

    public final float LJIIIIZZ(float f) {
        int iLIZIZ = C1415610mwR.LIZIZ();
        float f2 = (f - this.LL.LJIIJJI) / (iLIZIZ - (r1 * 2));
        if (f2 > 0.99d) {
            f2 = 1.0f;
        }
        if (f2 < 0.01d) {
            f2 = 0.0f;
        }
        if (C444960Hcc.LIZIZ()) {
            return 1 - f2;
        }
        return f2;
    }

    public final void setCursor$tools_camera_edit_release(ImageView imageView) {
        this.LLJ = imageView;
    }

    public final void setDuration$tools_camera_edit_release(int i) {
        this.LLIZLLLIL = (C1415610mwR.LIZIZ() - (this.LL.LJIIJJI * 2)) / i;
        invalidate();
    }

    public final void LJ(float f, boolean z, boolean z2) {
        if (z) {
            LJI(true);
            return;
        }
        if (z2) {
            LJI(false);
        }
        float fLIZ = LIZ(f);
        LIZJ((int) fLIZ);
        float fLJIIIIZZ = LJIIIIZZ(fLIZ + (getCursorWidth() / 2));
        InterfaceC365270ETt interfaceC365270ETt = this.LLILLJJLI;
        if (interfaceC365270ETt != null) {
            interfaceC365270ETt.LIZ(fLJIIIIZZ, z2);
        }
    }

    public C365200ETm(C365260ETs c365260ETs, InterfaceC365270ETt interfaceC365270ETt, Context context, C356830Dyr c356830Dyr) {
        super(context, null, 0);
        this.LL = c365260ETs;
        this.LLILLJJLI = interfaceC365270ETt;
        this.LLILLL = c356830Dyr;
        this.LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1132));
        this.LLILZIL = new LinkedHashMap();
        this.LLIZLLLIL = 1.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJILJ = EnumC365130ETf.LLILZ;
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1133));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C365220ETo second;
        C365220ETo second2;
        Pair<? extends NLETrackSlot, C365220ETo> pair;
        NLETrackSlot first;
        Pair<? extends NLETrackSlot, C365220ETo> pair2;
        C365220ETo second3;
        int endTime;
        int height = getHeight();
        int i5 = this.LL.LJIIJ;
        int i6 = (height - i5) / 2;
        int i7 = i5 + i6;
        if (this.LLJILJILJ == EnumC365130ETf.LLILLL) {
            if (!this.LLJI && (pair = this.LLILZLL) != null && (first = pair.getFirst()) != null && (pair2 = this.LLILZLL) != null && (second3 = pair2.getSecond()) != null) {
                float f = this.LL.LJIIJJI;
                long startTime = first.getStartTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                int i8 = (int) (f + ((startTime / j) * this.LLIZLLLIL));
                if (C348520DlS.LJII(first)) {
                    endTime = C348520DlS.LJ(first);
                } else {
                    endTime = (int) (first.getEndTime() / j);
                }
                int iRint = this.LL.LJIIJJI + ((int) Math.rint(endTime * this.LLIZLLLIL));
                if (C444960Hcc.LIZIZ()) {
                    second3.layout(C1415610mwR.LIZIZ() - iRint, i6, C1415610mwR.LIZIZ() - i8, i7);
                } else {
                    second3.layout(i8, i6, iRint, i7);
                }
            } else {
                return;
            }
        } else {
            for (Map.Entry entry : ((LinkedHashMap) this.LLILZIL).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry.getKey();
                View view = (View) entry.getValue();
                if (this.LLJI) {
                    Pair<? extends NLETrackSlot, C365220ETo> pair3 = this.LLIZ;
                    if (pair3 != null) {
                        second = pair3.getSecond();
                    } else {
                        second = null;
                    }
                    if (!Intrinsics.LJFF(second, view)) {
                    }
                }
                int i9 = this.LL.LJIIJJI;
                long startTime2 = nLETimeSpaceNode.getStartTime();
                long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                int iRint2 = i9 + ((int) Math.rint((startTime2 / j2) * this.LLIZLLLIL));
                int iRint3 = this.LL.LJIIJJI + ((int) Math.rint((nLETimeSpaceNode.getEndTime() / j2) * this.LLIZLLLIL));
                if (C444960Hcc.LIZIZ()) {
                    view.layout(C1415610mwR.LIZIZ() - iRint3, i6, C1415610mwR.LIZIZ() - iRint2, i7);
                } else {
                    view.layout(iRint2, i6, iRint3, i7);
                }
            }
        }
        Pair<? extends NLETrackSlot, C365220ETo> pair4 = this.LLIZ;
        if (pair4 != null && (second2 = pair4.getSecond()) != null) {
            int height2 = (getHeight() - this.LL.LJI) / 2;
            C365250ETr clipView = getClipView();
            int left = second2.getLeft() - this.LL.LJFF;
            int right = second2.getRight();
            C365260ETs c365260ETs = this.LL;
            clipView.layout(left, height2, right + c365260ETs.LJFF, c365260ETs.LJI + height2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C365200ETm r13, float r14, boolean r15, boolean r16, boolean r17, int r18) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365200ETm.LIZIZ(X.0ETm, float, boolean, boolean, boolean, int):void");
    }
}
