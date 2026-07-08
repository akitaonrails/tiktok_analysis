package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Qlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679900Qlg implements Serializable {
    public static final int $stable = 0;
    public final Integer bgColor;
    public final EnumC586020Mye bgMode;
    public final Float bottomLeftRadius;
    public final Float bottomRightRadius;
    public final Float radius;
    public final Float topLeftRadius;
    public final Float topRightRadius;

    public C679900Qlg() {
        this(null, null, null, null, null, null, EnumC586020Mye.AREA_CARD);
    }

    public C679900Qlg(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, EnumC586020Mye enumC586020Mye) {
        this.radius = f;
        this.topLeftRadius = f2;
        this.topRightRadius = f3;
        this.bottomLeftRadius = f4;
        this.bottomRightRadius = f5;
        this.bgColor = num;
        this.bgMode = enumC586020Mye;
    }
}
