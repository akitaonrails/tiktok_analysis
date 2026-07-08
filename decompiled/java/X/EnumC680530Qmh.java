package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0Qmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public enum EnumC680530Qmh {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;

    public static final int MIN_CROP_LENGTH_PX = C341940Daq.LIZ(56.0d);
    public float LL;

    public static float getHeight() {
        return BOTTOM.getCoordinate() - TOP.getCoordinate();
    }

    public static float getWidth() {
        return RIGHT.getCoordinate() - LEFT.getCoordinate();
    }

    public float getCoordinate() {
        return this.LL;
    }

    public static EnumC680530Qmh valueOf(String str) {
        return (EnumC680530Qmh) C08FF.LIZ(EnumC680530Qmh.class, str);
    }

    public void adjustCoordinate(float f) {
        float coordinate = LEFT.getCoordinate();
        float coordinate2 = TOP.getCoordinate();
        float coordinate3 = RIGHT.getCoordinate();
        float coordinate4 = BOTTOM.getCoordinate();
        int i = C680560Qmk.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LL = ((coordinate3 - coordinate) / f) + coordinate2;
                        return;
                    }
                    return;
                }
                this.LL = (f * (coordinate4 - coordinate2)) + coordinate;
                return;
            }
            this.LL = coordinate4 - ((coordinate3 - coordinate) / f);
            return;
        }
        this.LL = coordinate3 - (f * (coordinate4 - coordinate2));
    }

    public void offset(float f) {
        this.LL += f;
    }

    public void setCoordinate(float f) {
        this.LL = f;
    }

    public float snapOffset(RectF rectF) {
        float f;
        float f2 = this.LL;
        int i = C680560Qmk.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    f = rectF.bottom;
                } else {
                    f = rectF.right;
                }
            } else {
                f = rectF.top;
            }
        } else {
            f = rectF.left;
        }
        return f - f2;
    }

    public float snapToRect(RectF rectF) {
        float f = this.LL;
        int i = C680560Qmk.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LL = rectF.bottom;
                    }
                } else {
                    this.LL = rectF.right;
                }
            } else {
                this.LL = rectF.top;
            }
        } else {
            this.LL = rectF.left;
        }
        return this.LL - f;
    }

    public boolean isOutsideMargin(RectF rectF, float f) {
        int i = C680560Qmk.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (rectF.bottom - this.LL >= f) {
                        return false;
                    }
                } else if (rectF.right - this.LL >= f) {
                    return false;
                }
            } else if (this.LL - rectF.top >= f) {
                return false;
            }
        } else if (this.LL - rectF.left >= f) {
            return false;
        }
        return true;
    }

    public boolean isNewRectangleOutOfBounds(EnumC680530Qmh enumC680530Qmh, RectF rectF, float f) {
        float fSnapOffset = enumC680530Qmh.snapOffset(rectF);
        int i = C680560Qmk.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        EnumC680530Qmh enumC680530Qmh2 = LEFT;
                        if (enumC680530Qmh.equals(enumC680530Qmh2)) {
                            float f2 = rectF.left;
                            float coordinate = RIGHT.getCoordinate() - fSnapOffset;
                            float coordinate2 = TOP.getCoordinate();
                            return LIZJ(coordinate2, f2, ((coordinate - f2) / f) + coordinate2, rectF, coordinate);
                        }
                        if (enumC680530Qmh.equals(RIGHT)) {
                            float f3 = rectF.right;
                            float coordinate3 = enumC680530Qmh2.getCoordinate() - fSnapOffset;
                            float coordinate4 = TOP.getCoordinate();
                            return LIZJ(coordinate4, coordinate3, ((f3 - coordinate3) / f) + coordinate4, rectF, f3);
                        }
                    }
                } else {
                    EnumC680530Qmh enumC680530Qmh3 = TOP;
                    if (enumC680530Qmh.equals(enumC680530Qmh3)) {
                        float f4 = rectF.top;
                        float coordinate5 = BOTTOM.getCoordinate() - fSnapOffset;
                        float coordinate6 = LEFT.getCoordinate();
                        return LIZJ(f4, coordinate6, coordinate5, rectF, (f * (coordinate5 - f4)) + coordinate6);
                    }
                    if (enumC680530Qmh.equals(BOTTOM)) {
                        float f5 = rectF.bottom;
                        float coordinate7 = enumC680530Qmh3.getCoordinate() - fSnapOffset;
                        float coordinate8 = LEFT.getCoordinate();
                        return LIZJ(coordinate7, coordinate8, f5, rectF, (f * (f5 - coordinate7)) + coordinate8);
                    }
                }
            } else {
                EnumC680530Qmh enumC680530Qmh4 = LEFT;
                if (enumC680530Qmh.equals(enumC680530Qmh4)) {
                    float f6 = rectF.left;
                    float coordinate9 = RIGHT.getCoordinate() - fSnapOffset;
                    float coordinate10 = BOTTOM.getCoordinate();
                    return LIZJ(coordinate10 - ((coordinate9 - f6) / f), f6, coordinate10, rectF, coordinate9);
                }
                if (enumC680530Qmh.equals(RIGHT)) {
                    float f7 = rectF.right;
                    float coordinate11 = enumC680530Qmh4.getCoordinate() - fSnapOffset;
                    float coordinate12 = BOTTOM.getCoordinate();
                    return LIZJ(coordinate12 - ((f7 - coordinate11) / f), coordinate11, coordinate12, rectF, f7);
                }
            }
        } else {
            EnumC680530Qmh enumC680530Qmh5 = TOP;
            if (enumC680530Qmh.equals(enumC680530Qmh5)) {
                float f8 = rectF.top;
                float coordinate13 = BOTTOM.getCoordinate() - fSnapOffset;
                float coordinate14 = RIGHT.getCoordinate();
                return LIZJ(f8, coordinate14 - (f * (coordinate13 - f8)), coordinate13, rectF, coordinate14);
            }
            if (enumC680530Qmh.equals(BOTTOM)) {
                float f9 = rectF.bottom;
                float coordinate15 = enumC680530Qmh5.getCoordinate() - fSnapOffset;
                float coordinate16 = RIGHT.getCoordinate();
                return LIZJ(coordinate15, coordinate16 - (f * (f9 - coordinate15)), f9, rectF, coordinate16);
            }
        }
        return true;
    }

    public static boolean LIZJ(float f, float f2, float f3, RectF rectF, float f4) {
        if (f >= rectF.top && f2 >= rectF.left && f3 <= rectF.bottom && f4 <= rectF.right) {
            return false;
        }
        return true;
    }

    public void adjustCoordinate(float f, float f2, RectF rectF, float f3, float f4) {
        float coordinate;
        float coordinate2;
        float coordinate3;
        float coordinate4;
        int i = C680560Qmk.LIZ[ordinal()];
        float coordinate5 = Float.POSITIVE_INFINITY;
        if (i != 1) {
            if (i != 2) {
                float coordinate6 = Float.NEGATIVE_INFINITY;
                if (i != 3) {
                    if (i == 4) {
                        float fMax = rectF.bottom;
                        if (fMax - f2 >= f3) {
                            EnumC680530Qmh enumC680530Qmh = TOP;
                            float coordinate7 = enumC680530Qmh.getCoordinate();
                            float f5 = MIN_CROP_LENGTH_PX;
                            if (f2 <= coordinate7 + f5) {
                                coordinate4 = enumC680530Qmh.getCoordinate() + f5;
                            } else {
                                coordinate4 = Float.NEGATIVE_INFINITY;
                            }
                            if ((f2 - enumC680530Qmh.getCoordinate()) * f4 <= f5) {
                                coordinate6 = enumC680530Qmh.getCoordinate() + (f5 / f4);
                            }
                            fMax = Math.max(f2, Math.max(coordinate6, coordinate4));
                        }
                        this.LL = fMax;
                        return;
                    }
                    return;
                }
                float fMax2 = rectF.right;
                if (fMax2 - f >= f3) {
                    EnumC680530Qmh enumC680530Qmh2 = LEFT;
                    float coordinate8 = enumC680530Qmh2.getCoordinate();
                    float f6 = MIN_CROP_LENGTH_PX;
                    if (f <= coordinate8 + f6) {
                        coordinate3 = enumC680530Qmh2.getCoordinate() + f6;
                    } else {
                        coordinate3 = Float.NEGATIVE_INFINITY;
                    }
                    if ((f - enumC680530Qmh2.getCoordinate()) / f4 <= f6) {
                        coordinate6 = enumC680530Qmh2.getCoordinate() + (f6 * f4);
                    }
                    fMax2 = Math.max(f, Math.max(coordinate3, coordinate6));
                }
                this.LL = fMax2;
                return;
            }
            float fMin = rectF.top;
            if (f2 - fMin >= f3) {
                EnumC680530Qmh enumC680530Qmh3 = BOTTOM;
                float coordinate9 = enumC680530Qmh3.getCoordinate();
                float f7 = MIN_CROP_LENGTH_PX;
                if (f2 >= coordinate9 - f7) {
                    coordinate2 = enumC680530Qmh3.getCoordinate() - f7;
                } else {
                    coordinate2 = Float.POSITIVE_INFINITY;
                }
                if ((enumC680530Qmh3.getCoordinate() - f2) * f4 <= f7) {
                    coordinate5 = enumC680530Qmh3.getCoordinate() - (f7 / f4);
                }
                fMin = Math.min(f2, Math.min(coordinate2, coordinate5));
            }
            this.LL = fMin;
            return;
        }
        float fMin2 = rectF.left;
        if (f - fMin2 >= f3) {
            EnumC680530Qmh enumC680530Qmh4 = RIGHT;
            float coordinate10 = enumC680530Qmh4.getCoordinate();
            float f8 = MIN_CROP_LENGTH_PX;
            if (f >= coordinate10 - f8) {
                coordinate = enumC680530Qmh4.getCoordinate() - f8;
            } else {
                coordinate = Float.POSITIVE_INFINITY;
            }
            if ((enumC680530Qmh4.getCoordinate() - f) / f4 <= f8) {
                coordinate5 = enumC680530Qmh4.getCoordinate() - (f8 * f4);
            }
            fMin2 = Math.min(f, Math.min(coordinate, coordinate5));
        }
        this.LL = fMin2;
    }
}
