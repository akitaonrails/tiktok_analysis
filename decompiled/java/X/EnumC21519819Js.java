package X;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class EnumC21519819Js {
    public static final EnumC21519819Js ALPHA;
    public static final /* synthetic */ EnumC21519819Js[] LL;
    public static final EnumC21519819Js ROTATION;
    public static final EnumC21519819Js ROTATION_X;
    public static final EnumC21519819Js ROTATION_Y;
    public static final EnumC21519819Js SCALE_X;
    public static final EnumC21519819Js SCALE_Y;
    public static final EnumC21519819Js TRANSLATION_X;
    public static final EnumC21519819Js TRANSLATION_Y;
    public static final EnumC21519819Js TRANSLATION_Z;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final EnumC21519819Js f226X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final EnumC21519819Js f227Y;
    public static final EnumC21519819Js Z;
    public final int renderProperty;

    public EnumC21519819Js() {
        throw null;
    }

    public static EnumC21519819Js valueOf(String str) {
        return (EnumC21519819Js) C08FF.LIZ(EnumC21519819Js.class, str);
    }

    public static EnumC21519819Js[] values() {
        return (EnumC21519819Js[]) LL.clone();
    }

    public abstract float get(View view);

    public abstract void set(View view, float f);

    static {
        EnumC21519819Js enumC21519819Js = new EnumC21519819Js() { // from class: X.19Jz
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getTranslationX();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Jc(view, f);
            }
        };
        TRANSLATION_X = enumC21519819Js;
        EnumC21519819Js enumC21519819Js2 = new EnumC21519819Js() { // from class: X.19K0
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getTranslationY();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.ed(view, f);
            }
        };
        TRANSLATION_Y = enumC21519819Js2;
        EnumC21519819Js enumC21519819Js3 = new EnumC21519819Js() { // from class: X.19K1
            @Override // X.EnumC21519819Js
            public final float get(View view) {
                return view.getTranslationZ();
            }

            @Override // X.EnumC21519819Js
            public final void set(View view, float f) {
                view.setTranslationZ(f);
            }
        };
        TRANSLATION_Z = enumC21519819Js3;
        EnumC21519819Js enumC21519819Js4 = new EnumC21519819Js() { // from class: X.19Jo
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getScaleX();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Ob(view, f);
            }
        };
        SCALE_X = enumC21519819Js4;
        EnumC21519819Js enumC21519819Js5 = new EnumC21519819Js() { // from class: X.19Jp
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getScaleY();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.pc(view, f);
            }
        };
        SCALE_Y = enumC21519819Js5;
        EnumC21519819Js enumC21519819Js6 = new EnumC21519819Js() { // from class: X.19Jw
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getRotation();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Ab(view, f);
            }
        };
        ROTATION = enumC21519819Js6;
        EnumC21519819Js enumC21519819Js7 = new EnumC21519819Js() { // from class: X.19Jx
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getRotationX();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Hb(view, f);
            }
        };
        ROTATION_X = enumC21519819Js7;
        EnumC21519819Js enumC21519819Js8 = new EnumC21519819Js() { // from class: X.19Jy
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getRotationY();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Ib(view, f);
            }
        };
        ROTATION_Y = enumC21519819Js8;
        EnumC21519819Js enumC21519819Js9 = new EnumC21519819Js() { // from class: X.19Ju
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getX();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Fd(view, f);
            }
        };
        f226X = enumC21519819Js9;
        EnumC21519819Js enumC21519819Js10 = new EnumC21519819Js() { // from class: X.19Jv
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getY();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.Ld(view, f);
            }
        };
        f227Y = enumC21519819Js10;
        EnumC21519819Js enumC21519819Js11 = new EnumC21519819Js() { // from class: X.19Jq
            @Override // X.EnumC21519819Js
            public final float get(View view) {
                return view.getZ();
            }

            @Override // X.EnumC21519819Js
            public final void set(View view, float f) {
                view.setZ(f);
            }
        };
        Z = enumC21519819Js11;
        EnumC21519819Js enumC21519819Js12 = new EnumC21519819Js() { // from class: X.19Jr
            @Override // X.EnumC21519819Js
            public float get(View view) {
                return view.getAlpha();
            }

            @Override // X.EnumC21519819Js
            public void set(View view, float f) {
                C786410Ut5.T4(view, f);
            }
        };
        ALPHA = enumC21519819Js12;
        LL = new EnumC21519819Js[]{enumC21519819Js, enumC21519819Js2, enumC21519819Js3, enumC21519819Js4, enumC21519819Js5, enumC21519819Js6, enumC21519819Js7, enumC21519819Js8, enumC21519819Js9, enumC21519819Js10, enumC21519819Js11, enumC21519819Js12};
    }

    public EnumC21519819Js(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.renderProperty = i2;
    }
}
