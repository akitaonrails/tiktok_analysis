package X;

import android.graphics.RectF;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TOP_LEFT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0Qmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC680480Qmc {
    public static final EnumC680480Qmc BOTTOM;
    public static final EnumC680480Qmc BOTTOM_LEFT;
    public static final EnumC680480Qmc BOTTOM_RIGHT;
    public static final EnumC680480Qmc CENTER;
    public static final EnumC680480Qmc LEFT;
    public static final /* synthetic */ EnumC680480Qmc[] LLILLJJLI;
    public static final EnumC680480Qmc RIGHT;
    public static final EnumC680480Qmc TOP;
    public static final EnumC680480Qmc TOP_LEFT;
    public static final EnumC680480Qmc TOP_RIGHT;
    public final AbstractC680570Qml LL;

    static {
        final EnumC680530Qmh enumC680530Qmh = EnumC680530Qmh.TOP;
        final EnumC680530Qmh enumC680530Qmh2 = EnumC680530Qmh.LEFT;
        EnumC680480Qmc enumC680480Qmc = new EnumC680480Qmc("TOP_LEFT", 0, new AbstractC680570Qml(enumC680530Qmh, enumC680530Qmh2) { // from class: X.0Qmj
            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                EnumC680530Qmh enumC680530Qmh3 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh4 = EnumC680530Qmh.LEFT;
                if (enumC680530Qmh3 == enumC680530Qmh4) {
                    coordinate = f;
                } else {
                    coordinate = enumC680530Qmh4.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh5 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.TOP;
                if (enumC680530Qmh5 == enumC680530Qmh6) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = enumC680530Qmh6.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh7 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh8 = EnumC680530Qmh.RIGHT;
                if (enumC680530Qmh7 == enumC680530Qmh8) {
                    coordinate3 = f;
                } else {
                    coordinate3 = enumC680530Qmh8.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh9 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh10 = EnumC680530Qmh.BOTTOM;
                if (enumC680530Qmh9 == enumC680530Qmh10) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = enumC680530Qmh10.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C680610Qmp c680610Qmp = this.LIZJ;
                    c680610Qmp.LIZ = this.LIZIZ;
                    c680610Qmp.LIZIZ = this.LIZ;
                } else {
                    C680610Qmp c680610Qmp2 = this.LIZJ;
                    c680610Qmp2.LIZ = this.LIZ;
                    c680610Qmp2.LIZIZ = this.LIZIZ;
                }
                C680610Qmp c680610Qmp3 = this.LIZJ;
                EnumC680530Qmh enumC680530Qmh11 = c680610Qmp3.LIZ;
                EnumC680530Qmh enumC680530Qmh12 = c680610Qmp3.LIZIZ;
                enumC680530Qmh11.adjustCoordinate(f, f2, rectF, f4, f3);
                enumC680530Qmh12.adjustCoordinate(f3);
                if (enumC680530Qmh12.isOutsideMargin(rectF, f4)) {
                    enumC680530Qmh12.snapToRect(rectF);
                    enumC680530Qmh11.adjustCoordinate(f3);
                }
            }
        });
        TOP_LEFT = enumC680480Qmc;
        final EnumC680530Qmh enumC680530Qmh3 = EnumC680530Qmh.RIGHT;
        EnumC680480Qmc enumC680480Qmc2 = new EnumC680480Qmc("TOP_RIGHT", 1, new AbstractC680570Qml(enumC680530Qmh, enumC680530Qmh3) { // from class: X.0Qmj
            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                EnumC680530Qmh enumC680530Qmh32 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh4 = EnumC680530Qmh.LEFT;
                if (enumC680530Qmh32 == enumC680530Qmh4) {
                    coordinate = f;
                } else {
                    coordinate = enumC680530Qmh4.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh5 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.TOP;
                if (enumC680530Qmh5 == enumC680530Qmh6) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = enumC680530Qmh6.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh7 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh8 = EnumC680530Qmh.RIGHT;
                if (enumC680530Qmh7 == enumC680530Qmh8) {
                    coordinate3 = f;
                } else {
                    coordinate3 = enumC680530Qmh8.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh9 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh10 = EnumC680530Qmh.BOTTOM;
                if (enumC680530Qmh9 == enumC680530Qmh10) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = enumC680530Qmh10.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C680610Qmp c680610Qmp = this.LIZJ;
                    c680610Qmp.LIZ = this.LIZIZ;
                    c680610Qmp.LIZIZ = this.LIZ;
                } else {
                    C680610Qmp c680610Qmp2 = this.LIZJ;
                    c680610Qmp2.LIZ = this.LIZ;
                    c680610Qmp2.LIZIZ = this.LIZIZ;
                }
                C680610Qmp c680610Qmp3 = this.LIZJ;
                EnumC680530Qmh enumC680530Qmh11 = c680610Qmp3.LIZ;
                EnumC680530Qmh enumC680530Qmh12 = c680610Qmp3.LIZIZ;
                enumC680530Qmh11.adjustCoordinate(f, f2, rectF, f4, f3);
                enumC680530Qmh12.adjustCoordinate(f3);
                if (enumC680530Qmh12.isOutsideMargin(rectF, f4)) {
                    enumC680530Qmh12.snapToRect(rectF);
                    enumC680530Qmh11.adjustCoordinate(f3);
                }
            }
        });
        TOP_RIGHT = enumC680480Qmc2;
        final EnumC680530Qmh enumC680530Qmh4 = EnumC680530Qmh.BOTTOM;
        EnumC680480Qmc enumC680480Qmc3 = new EnumC680480Qmc("BOTTOM_LEFT", 2, new AbstractC680570Qml(enumC680530Qmh4, enumC680530Qmh2) { // from class: X.0Qmj
            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                EnumC680530Qmh enumC680530Qmh32 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh42 = EnumC680530Qmh.LEFT;
                if (enumC680530Qmh32 == enumC680530Qmh42) {
                    coordinate = f;
                } else {
                    coordinate = enumC680530Qmh42.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh5 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.TOP;
                if (enumC680530Qmh5 == enumC680530Qmh6) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = enumC680530Qmh6.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh7 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh8 = EnumC680530Qmh.RIGHT;
                if (enumC680530Qmh7 == enumC680530Qmh8) {
                    coordinate3 = f;
                } else {
                    coordinate3 = enumC680530Qmh8.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh9 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh10 = EnumC680530Qmh.BOTTOM;
                if (enumC680530Qmh9 == enumC680530Qmh10) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = enumC680530Qmh10.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C680610Qmp c680610Qmp = this.LIZJ;
                    c680610Qmp.LIZ = this.LIZIZ;
                    c680610Qmp.LIZIZ = this.LIZ;
                } else {
                    C680610Qmp c680610Qmp2 = this.LIZJ;
                    c680610Qmp2.LIZ = this.LIZ;
                    c680610Qmp2.LIZIZ = this.LIZIZ;
                }
                C680610Qmp c680610Qmp3 = this.LIZJ;
                EnumC680530Qmh enumC680530Qmh11 = c680610Qmp3.LIZ;
                EnumC680530Qmh enumC680530Qmh12 = c680610Qmp3.LIZIZ;
                enumC680530Qmh11.adjustCoordinate(f, f2, rectF, f4, f3);
                enumC680530Qmh12.adjustCoordinate(f3);
                if (enumC680530Qmh12.isOutsideMargin(rectF, f4)) {
                    enumC680530Qmh12.snapToRect(rectF);
                    enumC680530Qmh11.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM_LEFT = enumC680480Qmc3;
        EnumC680480Qmc enumC680480Qmc4 = new EnumC680480Qmc("BOTTOM_RIGHT", 3, new AbstractC680570Qml(enumC680530Qmh4, enumC680530Qmh3) { // from class: X.0Qmj
            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                EnumC680530Qmh enumC680530Qmh32 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh42 = EnumC680530Qmh.LEFT;
                if (enumC680530Qmh32 == enumC680530Qmh42) {
                    coordinate = f;
                } else {
                    coordinate = enumC680530Qmh42.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh5 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.TOP;
                if (enumC680530Qmh5 == enumC680530Qmh6) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = enumC680530Qmh6.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh7 = this.LIZIZ;
                EnumC680530Qmh enumC680530Qmh8 = EnumC680530Qmh.RIGHT;
                if (enumC680530Qmh7 == enumC680530Qmh8) {
                    coordinate3 = f;
                } else {
                    coordinate3 = enumC680530Qmh8.getCoordinate();
                }
                EnumC680530Qmh enumC680530Qmh9 = this.LIZ;
                EnumC680530Qmh enumC680530Qmh10 = EnumC680530Qmh.BOTTOM;
                if (enumC680530Qmh9 == enumC680530Qmh10) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = enumC680530Qmh10.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C680610Qmp c680610Qmp = this.LIZJ;
                    c680610Qmp.LIZ = this.LIZIZ;
                    c680610Qmp.LIZIZ = this.LIZ;
                } else {
                    C680610Qmp c680610Qmp2 = this.LIZJ;
                    c680610Qmp2.LIZ = this.LIZ;
                    c680610Qmp2.LIZIZ = this.LIZIZ;
                }
                C680610Qmp c680610Qmp3 = this.LIZJ;
                EnumC680530Qmh enumC680530Qmh11 = c680610Qmp3.LIZ;
                EnumC680530Qmh enumC680530Qmh12 = c680610Qmp3.LIZIZ;
                enumC680530Qmh11.adjustCoordinate(f, f2, rectF, f4, f3);
                enumC680530Qmh12.adjustCoordinate(f3);
                if (enumC680530Qmh12.isOutsideMargin(rectF, f4)) {
                    enumC680530Qmh12.snapToRect(rectF);
                    enumC680530Qmh11.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM_RIGHT = enumC680480Qmc4;
        EnumC680480Qmc enumC680480Qmc5 = new EnumC680480Qmc("LEFT", 4, new AbstractC680570Qml(enumC680530Qmh2) { // from class: X.0Qmi
            public final EnumC680530Qmh LIZLLL;

            {
                super(null, enumC680530Qmh2);
                this.LIZLLL = enumC680530Qmh2;
            }

            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                EnumC680530Qmh enumC680530Qmh5 = EnumC680530Qmh.TOP;
                float coordinate = enumC680530Qmh5.getCoordinate();
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.BOTTOM;
                float coordinate2 = enumC680530Qmh6.getCoordinate();
                float width = ((EnumC680530Qmh.getWidth() / f3) - EnumC680530Qmh.getHeight()) / 2.0f;
                enumC680530Qmh5.setCoordinate(coordinate - width);
                enumC680530Qmh6.setCoordinate(coordinate2 + width);
                if (enumC680530Qmh5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh5, rectF, f3)) {
                    enumC680530Qmh6.offset(-enumC680530Qmh5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (enumC680530Qmh6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh6, rectF, f3)) {
                    enumC680530Qmh5.offset(-enumC680530Qmh6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        LEFT = enumC680480Qmc5;
        EnumC680480Qmc enumC680480Qmc6 = new EnumC680480Qmc("TOP", 5, new AbstractC680570Qml(enumC680530Qmh) { // from class: X.0Qmg
            public final EnumC680530Qmh LIZLLL;

            {
                super(enumC680530Qmh, null);
                this.LIZLLL = enumC680530Qmh;
            }

            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                EnumC680530Qmh enumC680530Qmh5 = EnumC680530Qmh.LEFT;
                float coordinate = enumC680530Qmh5.getCoordinate();
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.RIGHT;
                float coordinate2 = enumC680530Qmh6.getCoordinate();
                float height = ((EnumC680530Qmh.getHeight() * f3) - EnumC680530Qmh.getWidth()) / 2.0f;
                enumC680530Qmh5.setCoordinate(coordinate - height);
                enumC680530Qmh6.setCoordinate(coordinate2 + height);
                if (enumC680530Qmh5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh5, rectF, f3)) {
                    enumC680530Qmh6.offset(-enumC680530Qmh5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (enumC680530Qmh6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh6, rectF, f3)) {
                    enumC680530Qmh5.offset(-enumC680530Qmh6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        TOP = enumC680480Qmc6;
        EnumC680480Qmc enumC680480Qmc7 = new EnumC680480Qmc("RIGHT", 6, new AbstractC680570Qml(enumC680530Qmh3) { // from class: X.0Qmi
            public final EnumC680530Qmh LIZLLL;

            {
                super(null, enumC680530Qmh3);
                this.LIZLLL = enumC680530Qmh3;
            }

            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                EnumC680530Qmh enumC680530Qmh5 = EnumC680530Qmh.TOP;
                float coordinate = enumC680530Qmh5.getCoordinate();
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.BOTTOM;
                float coordinate2 = enumC680530Qmh6.getCoordinate();
                float width = ((EnumC680530Qmh.getWidth() / f3) - EnumC680530Qmh.getHeight()) / 2.0f;
                enumC680530Qmh5.setCoordinate(coordinate - width);
                enumC680530Qmh6.setCoordinate(coordinate2 + width);
                if (enumC680530Qmh5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh5, rectF, f3)) {
                    enumC680530Qmh6.offset(-enumC680530Qmh5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (enumC680530Qmh6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh6, rectF, f3)) {
                    enumC680530Qmh5.offset(-enumC680530Qmh6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        RIGHT = enumC680480Qmc7;
        EnumC680480Qmc enumC680480Qmc8 = new EnumC680480Qmc("BOTTOM", 7, new AbstractC680570Qml(enumC680530Qmh4) { // from class: X.0Qmg
            public final EnumC680530Qmh LIZLLL;

            {
                super(enumC680530Qmh4, null);
                this.LIZLLL = enumC680530Qmh4;
            }

            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                EnumC680530Qmh enumC680530Qmh5 = EnumC680530Qmh.LEFT;
                float coordinate = enumC680530Qmh5.getCoordinate();
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.RIGHT;
                float coordinate2 = enumC680530Qmh6.getCoordinate();
                float height = ((EnumC680530Qmh.getHeight() * f3) - EnumC680530Qmh.getWidth()) / 2.0f;
                enumC680530Qmh5.setCoordinate(coordinate - height);
                enumC680530Qmh6.setCoordinate(coordinate2 + height);
                if (enumC680530Qmh5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh5, rectF, f3)) {
                    enumC680530Qmh6.offset(-enumC680530Qmh5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (enumC680530Qmh6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(enumC680530Qmh6, rectF, f3)) {
                    enumC680530Qmh5.offset(-enumC680530Qmh6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM = enumC680480Qmc8;
        EnumC680480Qmc enumC680480Qmc9 = new EnumC680480Qmc("CENTER", 8, new AbstractC680570Qml() { // from class: X.0Qmf
            @Override // X.AbstractC680570Qml
            public final void LIZIZ(float f, float f2, RectF rectF, float f3) {
                EnumC680530Qmh enumC680530Qmh5 = EnumC680530Qmh.LEFT;
                float coordinate = enumC680530Qmh5.getCoordinate();
                EnumC680530Qmh enumC680530Qmh6 = EnumC680530Qmh.TOP;
                float coordinate2 = enumC680530Qmh6.getCoordinate();
                EnumC680530Qmh enumC680530Qmh7 = EnumC680530Qmh.RIGHT;
                float coordinate3 = enumC680530Qmh7.getCoordinate();
                EnumC680530Qmh enumC680530Qmh8 = EnumC680530Qmh.BOTTOM;
                float f4 = f - ((coordinate + coordinate3) / 2.0f);
                float coordinate4 = f2 - ((coordinate2 + enumC680530Qmh8.getCoordinate()) / 2.0f);
                enumC680530Qmh5.offset(f4);
                enumC680530Qmh6.offset(coordinate4);
                enumC680530Qmh7.offset(f4);
                enumC680530Qmh8.offset(coordinate4);
                if (enumC680530Qmh5.isOutsideMargin(rectF, f3)) {
                    enumC680530Qmh7.offset(enumC680530Qmh5.snapToRect(rectF));
                } else if (enumC680530Qmh7.isOutsideMargin(rectF, f3)) {
                    enumC680530Qmh5.offset(enumC680530Qmh7.snapToRect(rectF));
                }
                if (enumC680530Qmh6.isOutsideMargin(rectF, f3)) {
                    enumC680530Qmh8.offset(enumC680530Qmh6.snapToRect(rectF));
                } else {
                    if (!enumC680530Qmh8.isOutsideMargin(rectF, f3)) {
                        return;
                    }
                    enumC680530Qmh6.offset(enumC680530Qmh8.snapToRect(rectF));
                }
            }

            @Override // X.AbstractC680570Qml
            public final void LIZ(float f, float f2, float f3, RectF rectF, float f4) {
                LIZIZ(f, f2, rectF, f4);
            }
        });
        CENTER = enumC680480Qmc9;
        LLILLJJLI = new EnumC680480Qmc[]{enumC680480Qmc, enumC680480Qmc2, enumC680480Qmc3, enumC680480Qmc4, enumC680480Qmc5, enumC680480Qmc6, enumC680480Qmc7, enumC680480Qmc8, enumC680480Qmc9};
    }

    public static EnumC680480Qmc[] values() {
        return (EnumC680480Qmc[]) LLILLJJLI.clone();
    }

    public static EnumC680480Qmc valueOf(String str) {
        return (EnumC680480Qmc) C08FF.LIZ(EnumC680480Qmc.class, str);
    }

    public EnumC680480Qmc(String str, int i, AbstractC680570Qml abstractC680570Qml) {
        this.LL = abstractC680570Qml;
    }

    public void updateCropWindow(float f, float f2, RectF rectF, float f3) {
        this.LL.LIZIZ(f, f2, rectF, f3);
    }

    public void updateCropWindow(float f, float f2, float f3, RectF rectF, float f4) {
        this.LL.LIZ(f, f2, f3, rectF, f4);
    }
}
