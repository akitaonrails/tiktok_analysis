package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;

/* JADX INFO: renamed from: X.19NB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19NB {
    public static final C19NB LIZIZ = new C19NB();
    public static final String[] LIZJ = {"standard", "accelerate", "decelerate", "linear"};
    public String LIZ = "identity";

    public double LIZ(double d) {
        return d;
    }

    public double LIZIZ(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C19NB LIZJ(final String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C19NB(str) { // from class: X.19NH
                public final double LIZLLL;
                public final double LJ;
                public final double LJFF;
                public final double LJI;

                {
                    this.LIZ = str;
                    int iIndexOf = str.indexOf(40);
                    int iIndexOf2 = str.indexOf(44, iIndexOf);
                    this.LIZLLL = CastDoubleProtector.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
                    int i = iIndexOf2 + 1;
                    int iIndexOf3 = str.indexOf(44, i);
                    this.LJ = CastDoubleProtector.parseDouble(str.substring(i, iIndexOf3).trim());
                    int i2 = iIndexOf3 + 1;
                    int iIndexOf4 = str.indexOf(44, i2);
                    this.LJFF = CastDoubleProtector.parseDouble(str.substring(i2, iIndexOf4).trim());
                    int i3 = iIndexOf4 + 1;
                    this.LJI = CastDoubleProtector.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                }

                @Override // X.C19NB
                public final double LIZ(double d) {
                    if (d <= 0.0d) {
                        return 0.0d;
                    }
                    if (d >= 1.0d) {
                        return 1.0d;
                    }
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    do {
                        d2 *= 0.5d;
                        if (LIZLLL(d3) < d) {
                            d3 += d2;
                        } else {
                            d3 -= d2;
                        }
                    } while (d2 > 0.01d);
                    double d4 = d3 - d2;
                    double dLIZLLL = LIZLLL(d4);
                    double d5 = d3 + d2;
                    double dLIZLLL2 = LIZLLL(d5);
                    double dLJ = LJ(d4);
                    return (((LJ(d5) - dLJ) * (d - dLIZLLL)) / (dLIZLLL2 - dLIZLLL)) + dLJ;
                }

                @Override // X.C19NB
                public final double LIZIZ(double d) {
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    do {
                        d2 *= 0.5d;
                        if (LIZLLL(d3) < d) {
                            d3 += d2;
                        } else {
                            d3 -= d2;
                        }
                    } while (d2 > 1.0E-4d);
                    double d4 = d3 - d2;
                    double dLIZLLL = LIZLLL(d4);
                    double d5 = d3 + d2;
                    double dLIZLLL2 = LIZLLL(d5);
                    return (LJ(d5) - LJ(d4)) / (dLIZLLL2 - dLIZLLL);
                }

                public final double LIZLLL(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.LIZLLL * d2 * d3 * d) + (this.LJFF * d3 * d * d) + (d * d * d);
                }

                public final double LJ(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.LJ * d2 * d3 * d) + (this.LJI * d3 * d * d) + (d * d * d);
                }
            };
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    final String str2 = "cubic(0.4, 0.05, 0.8, 0.7)";
                    return new C19NB(str2) { // from class: X.19NH
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str2;
                            int iIndexOf = str2.indexOf(40);
                            int iIndexOf2 = str2.indexOf(44, iIndexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str2.substring(iIndexOf + 1, iIndexOf2).trim());
                            int i = iIndexOf2 + 1;
                            int iIndexOf3 = str2.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str2.substring(i, iIndexOf3).trim());
                            int i2 = iIndexOf3 + 1;
                            int iIndexOf4 = str2.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str2.substring(i2, iIndexOf4).trim());
                            int i3 = iIndexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str2.substring(i3, str2.indexOf(41, i3)).trim());
                        }

                        @Override // X.C19NB
                        public final double LIZ(double d) {
                            if (d <= 0.0d) {
                                return 0.0d;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            double dLJ = LJ(d4);
                            return (((LJ(d5) - dLJ) * (d - dLIZLLL)) / (dLIZLLL2 - dLIZLLL)) + dLJ;
                        }

                        @Override // X.C19NB
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (dLIZLLL2 - dLIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LIZLLL * d2 * d3 * d) + (this.LJFF * d3 * d * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJ * d2 * d3 * d) + (this.LJI * d3 * d * d) + (d * d * d);
                        }
                    };
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    final String str3 = "cubic(0.0, 0.0, 0.2, 0.95)";
                    return new C19NB(str3) { // from class: X.19NH
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str3;
                            int iIndexOf = str3.indexOf(40);
                            int iIndexOf2 = str3.indexOf(44, iIndexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str3.substring(iIndexOf + 1, iIndexOf2).trim());
                            int i = iIndexOf2 + 1;
                            int iIndexOf3 = str3.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str3.substring(i, iIndexOf3).trim());
                            int i2 = iIndexOf3 + 1;
                            int iIndexOf4 = str3.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str3.substring(i2, iIndexOf4).trim());
                            int i3 = iIndexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str3.substring(i3, str3.indexOf(41, i3)).trim());
                        }

                        @Override // X.C19NB
                        public final double LIZ(double d) {
                            if (d <= 0.0d) {
                                return 0.0d;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            double dLJ = LJ(d4);
                            return (((LJ(d5) - dLJ) * (d - dLIZLLL)) / (dLIZLLL2 - dLIZLLL)) + dLJ;
                        }

                        @Override // X.C19NB
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (dLIZLLL2 - dLIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LIZLLL * d2 * d3 * d) + (this.LJFF * d3 * d * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJ * d2 * d3 * d) + (this.LJI * d3 * d * d) + (d * d * d);
                        }
                    };
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    final String str4 = "cubic(1, 1, 0, 0)";
                    return new C19NB(str4) { // from class: X.19NH
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str4;
                            int iIndexOf = str4.indexOf(40);
                            int iIndexOf2 = str4.indexOf(44, iIndexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str4.substring(iIndexOf + 1, iIndexOf2).trim());
                            int i = iIndexOf2 + 1;
                            int iIndexOf3 = str4.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str4.substring(i, iIndexOf3).trim());
                            int i2 = iIndexOf3 + 1;
                            int iIndexOf4 = str4.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str4.substring(i2, iIndexOf4).trim());
                            int i3 = iIndexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str4.substring(i3, str4.indexOf(41, i3)).trim());
                        }

                        @Override // X.C19NB
                        public final double LIZ(double d) {
                            if (d <= 0.0d) {
                                return 0.0d;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            double dLJ = LJ(d4);
                            return (((LJ(d5) - dLJ) * (d - dLIZLLL)) / (dLIZLLL2 - dLIZLLL)) + dLJ;
                        }

                        @Override // X.C19NB
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (dLIZLLL2 - dLIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LIZLLL * d2 * d3 * d) + (this.LJFF * d3 * d * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJ * d2 * d3 * d) + (this.LJI * d3 * d * d) + (d * d * d);
                        }
                    };
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    final String str5 = "cubic(0.4, 0.0, 0.2, 1)";
                    return new C19NB(str5) { // from class: X.19NH
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str5;
                            int iIndexOf = str5.indexOf(40);
                            int iIndexOf2 = str5.indexOf(44, iIndexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str5.substring(iIndexOf + 1, iIndexOf2).trim());
                            int i = iIndexOf2 + 1;
                            int iIndexOf3 = str5.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str5.substring(i, iIndexOf3).trim());
                            int i2 = iIndexOf3 + 1;
                            int iIndexOf4 = str5.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str5.substring(i2, iIndexOf4).trim());
                            int i3 = iIndexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str5.substring(i3, str5.indexOf(41, i3)).trim());
                        }

                        @Override // X.C19NB
                        public final double LIZ(double d) {
                            if (d <= 0.0d) {
                                return 0.0d;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            double dLJ = LJ(d4);
                            return (((LJ(d5) - dLJ) * (d - dLIZLLL)) / (dLIZLLL2 - dLIZLLL)) + dLJ;
                        }

                        @Override // X.C19NB
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double dLIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double dLIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (dLIZLLL2 - dLIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LIZLLL * d2 * d3 * d) + (this.LJFF * d3 * d * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJ * d2 * d3 * d) + (this.LJI * d3 * d * d) + (d * d * d);
                        }
                    };
                }
                break;
        }
        return LIZIZ;
    }
}
