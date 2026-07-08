package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FG7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FG7 extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public List<? extends UrlModel> LL;
    public boolean LLILLJJLI;
    public final Map<Integer, List<C0FG8>> LLILLL;
    public final Map<Integer, List<C0FG8>> LLILZ;
    public final Map<Integer, Integer> LLILZIL;

    public C0FG7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C13BV.INSTANCE;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)));
        Integer numValueOf2 = Integer.valueOf(iLIZIZ2);
        Float fValueOf = Float.valueOf(8.0f);
        this.LLILLL = C2097608Jq.LJIIIIZZ(new Pair(3, C1697810uHb.LJIIJJI(new C0FG8(iLIZIZ, null, numValueOf, numValueOf2, null, 53, fValueOf, 18), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 83, null, 76), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(63))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, 51, Float.valueOf(-10.0f), 24))), new Pair(4, C1697810uHb.LJIIJJI(new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(71))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), 83, Float.valueOf(-12.0f), 12), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), 0, null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, 53, Float.valueOf(12.0f), 18))), new Pair(5, C1697810uHb.LJIIJJI(new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 83, Float.valueOf(-24.0f), 12), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, 51, Float.valueOf(-10.0f), 24), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 85, Float.valueOf(24.0f), 6), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), null, 53, Float.valueOf(10.0f), 18))));
        this.LLILZ = C2097608Jq.LJIIIIZZ(new Pair(3, C1697810uHb.LJIIJJI(new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), null, null, 51, Float.valueOf(-6.0f), 24), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), null, 53, fValueOf, 18))), new Pair(4, C1697810uHb.LJIIJJI(new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), null, null, 51, Float.valueOf(-6.0f), 24), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35))), null, 53, Float.valueOf(10.0f), 18))), new Pair(5, C1697810uHb.LJIIJJI(new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 51, null, 88), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51))), null, 53, null, 82), new C0FG8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))), null, 53, null, 82))));
        this.LLILZIL = C2097608Jq.LJIIIIZZ(new Pair(3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)))), new Pair(4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)))), new Pair(5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(81)))));
    }

    public final void LIZ(List<? extends UrlModel> list, boolean z) {
        Map<Integer, List<C0FG8>> map;
        List<C0FG8> list2;
        this.LL = list;
        this.LLILLJJLI = z;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        int i = 5;
        int i2 = 3;
        if (this.LL.size() != 3) {
            i2 = 4;
            if (this.LL.size() != 4) {
                if (this.LL.size() > 4) {
                    i2 = 5;
                } else {
                    return;
                }
            }
        }
        if (this.LLILLJJLI) {
            Integer num = this.LLILZIL.get(Integer.valueOf(i2));
            if (num != null) {
                int iIntValue = num.intValue();
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = iIntValue;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams);
            } else {
                return;
            }
        }
        if (this.LLILLJJLI) {
            map = this.LLILZ;
        } else {
            map = this.LLILLL;
        }
        List<C0FG8> list3 = map.get(Integer.valueOf(i2));
        if (list3 != null) {
            int i3 = 0;
            for (C0FG8 c0fg8 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C0FG8 c0fg82 = c0fg8;
                    if (i3 < this.LL.size()) {
                        if (i2 == i && (list2 = this.LLILLL.get(Integer.valueOf(i))) != null && i3 == list2.size() - 1 && this.LL.size() > i && this.LLILLJJLI) {
                            int i5 = c0fg82.LIZ;
                            Integer num2 = c0fg82.LIZIZ;
                            Integer num3 = c0fg82.LIZJ;
                            Integer num4 = c0fg82.LIZLLL;
                            Integer num5 = c0fg82.LJ;
                            int i6 = c0fg82.LJFF;
                            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_ellipsis_horizontal);
                            tuxIconView.setTintColorRes(R.attr.a1h);
                            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z.LIZJ = Float.valueOf(i5 / 2.0f);
                            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
                            layoutParams2.gravity = i6;
                            if (num2 != null) {
                                layoutParams2.leftMargin = num2.intValue();
                            }
                            if (num3 != null) {
                                layoutParams2.topMargin = num3.intValue();
                            }
                            if (num4 != null) {
                                layoutParams2.rightMargin = num4.intValue();
                            }
                            if (num5 != null) {
                                layoutParams2.bottomMargin = num5.intValue();
                            }
                            addView(tuxIconView, layoutParams2);
                        } else {
                            UrlModel urlModel = (UrlModel) ListProtector.get(this.LL, i3);
                            int i7 = c0fg82.LIZ;
                            Integer num6 = c0fg82.LIZIZ;
                            Integer num7 = c0fg82.LIZJ;
                            Integer num8 = c0fg82.LIZLLL;
                            Integer num9 = c0fg82.LJ;
                            int i8 = c0fg82.LJFF;
                            Float f = c0fg82.LJI;
                            C427660Gpo c427660Gpo = new C427660Gpo(getContext(), null, 6, 0);
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                            c427660Gpo.setPlaceholderImage(c419910GdJ.LIZ(c427660Gpo.getContext()));
                            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i7, i7);
                            layoutParams3.gravity = i8;
                            if (num6 != null) {
                                layoutParams3.leftMargin = num6.intValue();
                            }
                            if (num7 != null) {
                                layoutParams3.topMargin = num7.intValue();
                            }
                            if (num8 != null) {
                                layoutParams3.rightMargin = num8.intValue();
                            }
                            if (num9 != null) {
                                layoutParams3.bottomMargin = num9.intValue();
                            }
                            if (f != null) {
                                float fFloatValue = f.floatValue();
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427660Gpo);
                                c427660Gpo.setRotation(fFloatValue);
                            }
                            addView(c427660Gpo, layoutParams3);
                        }
                    }
                    i3 = i4;
                    i = 5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
