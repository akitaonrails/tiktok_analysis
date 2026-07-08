package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19SV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19SV extends C16GD implements Animatable {
    public final C19SW LLILLJJLI;
    public final Context LLILLL;
    public final C19SZ LLILZ;

    public C19SV() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return C16GF.LIZIZ(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getAlpha() : this.LLILLJJLI.LIZ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.LLILLJJLI.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.LL == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        final Drawable.ConstantState constantState = this.LL.getConstantState();
        return new Drawable.ConstantState(constantState) { // from class: X.19SX
            public final Drawable.ConstantState LIZ;

            @Override // android.graphics.drawable.Drawable.ConstantState
            public final boolean canApplyTheme() {
                return this.LIZ.canApplyTheme();
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public final int getChangingConfigurations() {
                return this.LIZ.getChangingConfigurations();
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public final Drawable newDrawable() {
                C19SV c19sv = new C19SV();
                c19sv.LL = this.LIZ.newDrawable();
                c19sv.LL.setCallback(c19sv.LLILZ);
                return c19sv;
            }

            {
                this.LIZ = constantState;
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public final Drawable newDrawable(Resources resources) {
                C19SV c19sv = new C19SV();
                c19sv.LL = this.LIZ.newDrawable(resources);
                c19sv.LL.setCallback(c19sv.LLILZ);
                return c19sv;
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
                C19SV c19sv = new C19SV();
                c19sv.LL = this.LIZ.newDrawable(resources, theme);
                c19sv.LL.setCallback(c19sv.LLILZ);
                return c19sv;
            }
        };
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicHeight() : this.LLILLJJLI.LIZ.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicWidth() : this.LLILLJJLI.LIZ.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getOpacity() : this.LLILLJJLI.LIZ.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.isAutoMirrored() : this.LLILLJJLI.LIZ.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.LL;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.LLILLJJLI.LIZIZ.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.LL;
        return drawable != null ? drawable.isStateful() : this.LLILLJJLI.LIZ.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.LLILLJJLI.LIZIZ.isStarted()) {
                return;
            }
            this.LLILLJJLI.LIZIZ.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.LLILLJJLI.LIZIZ.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19SZ] */
    public C19SV(Context context) {
        ?? r1 = new Drawable.Callback() { // from class: X.19SZ
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                this.LL.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                this.LL.unscheduleSelf(runnable);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                this.LL.scheduleSelf(runnable, j);
            }
        };
        this.LLILZ = r1;
        this.LLILLL = context;
        this.LLILLJJLI = new C19SW(r1);
    }

    @Override // X.C16GD, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LIZ(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.LLILLJJLI.LIZ.draw(canvas);
        if (this.LLILLJJLI.LIZIZ.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.LLILLJJLI.LIZ.setBounds(rect);
        }
    }

    @Override // X.C16GD, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.LLILLJJLI.LIZ.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.LLILLJJLI.LIZ.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.LLILLJJLI.LIZ.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.LLILLJJLI.LIZ.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.LLILLJJLI.LIZ.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJI(drawable, i);
        } else {
            this.LLILLJJLI.LIZ.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJII(drawable, colorStateList);
        } else {
            this.LLILLJJLI.LIZ.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LJIIIIZZ(drawable, mode);
        } else {
            this.LLILLJJLI.LIZ.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.LLILLJJLI.LIZ.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator animatorLIZ;
        Drawable drawable = this.LL;
        if (drawable != null) {
            C16GF.LIZLLL(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayLJI = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LJ);
                    int resourceId = typedArrayLJI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C19LH c19lhLIZ = C19LH.LIZ(resources, resourceId, theme);
                        c19lhLIZ.LLILZLL = false;
                        c19lhLIZ.setCallback(this.LLILZ);
                        C19SW c19sw = this.LLILLJJLI;
                        if (c19sw.LIZ != null) {
                            c19sw.LIZ.setCallback(null);
                        }
                        this.LLILLJJLI.LIZ = c19lhLIZ;
                    }
                    typedArrayLJI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C21518719Jh.LJFF);
                    String strXd = C786410Ut5.Xd(typedArrayObtainAttributes, 0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.LLILLL;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                animatorLIZ = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (0 != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                } catch (XmlPullParserException e2) {
                                    e = e2;
                                }
                                try {
                                    animatorLIZ = C21518519Jf.LIZ(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Can't load animation resource ID #0x");
                                    sbLIZ.append(Integer.toHexString(resourceId2));
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(C2188811AlT.LIZIZ(sbLIZ));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Can't load animation resource ID #0x");
                                    sbLIZ2.append(Integer.toHexString(resourceId2));
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(C2188811AlT.LIZIZ(sbLIZ2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                }
                            }
                            animatorLIZ.setTarget(this.LLILLJJLI.LIZ.LLILLJJLI.LIZIZ.LJIILJJIL.get(strXd));
                            C19SW c19sw2 = this.LLILLJJLI;
                            if (c19sw2.LIZJ == null) {
                                c19sw2.LIZJ = new ArrayList<>();
                                this.LLILLJJLI.LIZLLL = new C830490Whz<>();
                            }
                            this.LLILLJJLI.LIZJ.add(animatorLIZ);
                            this.LLILLJJLI.LIZLLL.put(animatorLIZ, strXd);
                        } else {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C19SW c19sw3 = this.LLILLJJLI;
        if (c19sw3.LIZIZ == null) {
            c19sw3.LIZIZ = new AnimatorSet();
        }
        c19sw3.LIZIZ.playTogether(c19sw3.LIZJ);
    }
}
