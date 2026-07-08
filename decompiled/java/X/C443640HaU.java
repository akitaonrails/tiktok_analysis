package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443640HaU extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    public C443640HaU(Context context) {
        this(context, null, 6);
    }

    public C443640HaU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r0 = r10.total - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r0 <= 99) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r0 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        addView(LIZJ(r5, r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.friends.model.MutualStruct r10) {
        /*
            r9 = this;
            r0 = 8
            X.C786410Ut5.v1(r9, r0)
            java.util.List<com.ss.android.ugc.aweme.friends.model.MutualUser> r0 = r10.userList
            r6 = 0
            r8 = 1
            if (r0 == 0) goto Lad
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r8) goto Lad
            java.util.List<com.ss.android.ugc.aweme.friends.model.MutualUser> r3 = r10.userList
            if (r3 == 0) goto L93
            X.C786410Ut5.v1(r9, r6)
            r0 = 0
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r9, r0)
            r9.removeAllViews()
            int r7 = r3.size()
            r5 = 0
        L26:
            r2 = 99
            r4 = 2
            if (r5 >= r7) goto L6a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r5)
            if (r0 != 0) goto L32
            return
        L32:
            int r0 = r3.size()
            int r0 = r0 - r8
            if (r5 < r0) goto Lab
            int r1 = r10.total
            int r0 = r3.size()
            if (r1 > r0) goto Lab
            r1 = 0
        L42:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r5)
            com.ss.android.ugc.aweme.friends.model.MutualUser r0 = (com.ss.android.ugc.aweme.friends.model.MutualUser) r0
            android.view.View r0 = r9.LIZIZ(r0, r5, r1)
            if (r5 != r4) goto L94
            int r1 = r3.size()
            r0 = 3
            if (r1 != r0) goto L9c
            int r1 = r3.size()
            int r0 = r10.total
            if (r1 != r0) goto L9c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r5)
            com.ss.android.ugc.aweme.friends.model.MutualUser r0 = (com.ss.android.ugc.aweme.friends.model.MutualUser) r0
            android.view.View r0 = r9.LIZIZ(r0, r5, r6)
            r9.addView(r0)
        L6a:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
            int r0 = r3.size()
            if (r0 > r4) goto L93
            int r0 = r3.size()
            int r1 = r10.total
            if (r0 >= r1) goto L93
            int r0 = r3.size()
            int r1 = r1 - r0
            int r0 = r3.size()
            if (r1 > r2) goto L8c
            r2 = r1
        L8c:
            android.view.View r0 = r9.LIZJ(r0, r2)
            r9.addView(r0)
        L93:
            return
        L94:
            if (r5 >= r4) goto L9c
            r9.addView(r0)
            int r5 = r5 + 1
            goto L26
        L9c:
            int r0 = r10.total
            int r0 = r0 - r4
            if (r0 <= r2) goto La3
            r0 = 99
        La3:
            android.view.View r0 = r9.LIZJ(r5, r0)
            r9.addView(r0)
            goto L6a
        Lab:
            r1 = 1
            goto L42
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C443640HaU.LIZ(com.ss.android.ugc.aweme.friends.model.MutualStruct):void");
    }

    public final void setAvatarSizeModel(int i) {
        this.LLJ = i;
    }

    public final void setCollabInFeedLabel(boolean z) {
        this.LLILZIL = z;
    }

    public final void setDarkMode(boolean z) {
        this.LLILLL = z;
    }

    public final void setSocialVideoTag(boolean z) {
        this.LLILZ = z;
    }

    public final View LIZJ(int i, int i2) {
        View viewSd;
        Pair pair;
        if (this.LLILZLL) {
            int i3 = this.LLIZ;
            int i4 = this.LLIZLLLIL;
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            int i5 = this.LLILLJJLI;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            if (C426750GoL.LIZLLL(tuxTextView.getContext())) {
                layoutParams.setMargins(0, 0, (this.LL * i) + iLIZIZ, 0);
            } else {
                layoutParams.setMargins((this.LL * i) + iLIZIZ, 0, 0, 0);
            }
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextColor(i4);
            tuxTextView.setTuxFont(82);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
            tuxTextView.setGravity(17);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setStyle(Paint.Style.FILL);
            }
            Paint paint2 = shapeDrawable.getPaint();
            if (paint2 != null) {
                paint2.setColor(i3);
            }
            Paint paint3 = shapeDrawable.getPaint();
            if (paint3 != null) {
                paint3.setAntiAlias(true);
            }
            tuxTextView.setBackground(shapeDrawable);
            tuxTextView.setText(tuxTextView.getContext().getString(2131845802, Integer.valueOf(i2)));
            return tuxTextView;
        }
        if (this.LLILLL) {
            viewSd = C786410Ut5.Sd(R.layout.d63, C786410Ut5.ne(getContext()), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.d62, C786410Ut5.ne(getContext()), null);
        }
        int i6 = this.LLJ;
        if (i6 != 14) {
            if (i6 != 16) {
                if (i6 != 22) {
                    if (i6 != 32) {
                        if (i6 != 36) {
                            if (i6 != 40) {
                                pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LL));
                            } else {
                                pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                            }
                        } else {
                            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))));
                        }
                    } else {
                        pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                    }
                } else {
                    pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
                }
            } else {
                pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            }
        } else {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iIntValue, iIntValue);
        if (C426750GoL.LIZLLL(viewSd.getContext())) {
            layoutParams2.setMargins(0, 0, iIntValue2 * i, 0);
        } else {
            layoutParams2.setMargins(iIntValue2 * i, 0, 0, 0);
        }
        C786410Ut5.W5(viewSd, layoutParams2);
        if (!this.LLILLL) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bw);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(360));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.bx);
            c384050F3z.LJII = iIntValue;
            c384050F3z.LJI = iIntValue;
            viewSd.setBackground(c384050F3z.LIZ(viewSd.getContext()));
            C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        }
        ((TextView) viewSd.findViewById(R.id.tv_num)).setText(getContext().getString(2131845802, Integer.valueOf(i2)));
        return viewSd;
    }

    public C443640HaU(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        boolean z = this.LLILLL;
        int i3 = R.color.dq;
        if (z) {
            i2 = R.color.dq;
        } else {
            i2 = R.color.an;
        }
        this.LLIZ = C446980Hfs.LIZ(context, i2);
        this.LLIZLLLIL = C446980Hfs.LIZ(context, this.LLILLL ? i3 : R.color.da);
    }

    public final View LIZIZ(MutualUser mutualUser, int i, boolean z) {
        View viewSd;
        Pair pair;
        final Float fValueOf;
        UrlModel avatarMedium = null;
        if (this.LLILZLL) {
            int i2 = this.LL;
            int i3 = i * i2;
            if (z) {
                fValueOf = Float.valueOf(i2);
            } else {
                fValueOf = null;
            }
            final Context context = getContext();
            RemoteImageView remoteImageView = new RemoteImageView(context, fValueOf) { // from class: X.0GZO
                public static final float LLILZLL = C418440Gaw.LIZIZ(Float.valueOf(1.0f));
                public final Float LLILLJJLI;
                public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(458));
                public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(459));
                public final boolean LLILZIL;

                private final Path getCirclePath() {
                    return (Path) this.LLILLL.getValue();
                }

                private final Path getCutoutCirclePath() {
                    return (Path) this.LLILZ.getValue();
                }

                @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
                public final void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    C20597815iq.LIZ(this);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
                public final void onDraw(Canvas canvas) {
                    try {
                        canvas.clipPath(getCirclePath());
                        if (this.LLILZIL) {
                            canvas.clipPath(getCutoutCirclePath(), Region.Op.DIFFERENCE);
                        }
                        super.onDraw(canvas);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        BitmapCrashChecker.doCheck(e, this);
                        throw e;
                    }
                }

                {
                    this.LLILLJJLI = fValueOf;
                    this.LLILZIL = fValueOf != null;
                }

                @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
                public final void onMeasure(int i4, int i5) {
                    float measuredWidth;
                    super.onMeasure(i4, i5);
                    int i6 = 1;
                    if (getLayoutDirection() == 1) {
                        i6 = -1;
                    }
                    float measuredWidth2 = getMeasuredWidth() * 0.5f;
                    float f = i6;
                    Float f2 = this.LLILLJJLI;
                    if (f2 != null) {
                        measuredWidth = f2.floatValue();
                    } else {
                        measuredWidth = getMeasuredWidth() * 0.7f;
                    }
                    getCirclePath().reset();
                    getCirclePath().addCircle(measuredWidth2, measuredWidth2, measuredWidth2, Path.Direction.CW);
                    getCutoutCirclePath().reset();
                    getCutoutCirclePath().addCircle((f * measuredWidth) + measuredWidth2, measuredWidth2, LLILZLL + measuredWidth2, Path.Direction.CW);
                }
            };
            int i4 = this.LLILLJJLI;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
            if (C426750GoL.LIZLLL(remoteImageView.getContext())) {
                layoutParams.setMargins(0, 0, i3, 0);
            } else {
                layoutParams.setMargins(i3, 0, 0, 0);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(remoteImageView);
            remoteImageView.setLayoutParams(layoutParams);
            if (mutualUser != null) {
                avatarMedium = mutualUser.getAvatarMedium();
            }
            C1324840ka2.LJFF(remoteImageView, avatarMedium);
            return remoteImageView;
        }
        if (this.LLILLL) {
            viewSd = C786410Ut5.Sd(R.layout.d61, C786410Ut5.ne(getContext()), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.d60, C786410Ut5.ne(getContext()), null);
        }
        C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        if (!this.LLILZ && !this.LLILZIL) {
            if (this.LLILLL && i == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setStroke(2, C960203pA.LIZ(R.attr.bt, viewSd.getContext()));
                viewSd.setBackground(gradientDrawable);
            }
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(C960203pA.LIZ(R.attr.bx, viewSd.getContext()));
            viewSd.setBackground(gradientDrawable2);
        }
        int i5 = this.LLJ;
        if (i5 != 14) {
            if (i5 != 16) {
                if (i5 != 22) {
                    if (i5 != 32) {
                        if (i5 != 36) {
                            if (i5 != 40) {
                                pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LL));
                            } else {
                                pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                            }
                        } else {
                            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))));
                        }
                    } else {
                        pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                    }
                } else {
                    pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
                }
            } else {
                pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            }
        } else {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iIntValue, iIntValue);
        if (C426750GoL.LIZLLL(viewSd.getContext())) {
            layoutParams2.setMargins(0, 0, iIntValue2 * i, 0);
        } else {
            layoutParams2.setMargins(iIntValue2 * i, 0, 0, 0);
        }
        C786410Ut5.W5(viewSd, layoutParams2);
        RemoteImageView remoteImageView2 = (RemoteImageView) viewSd.findViewById(R.id.bh2);
        if (mutualUser != null) {
            avatarMedium = mutualUser.getAvatarMedium();
        }
        C1324840ka2.LJFF(remoteImageView2, avatarMedium);
        return viewSd;
    }
}
