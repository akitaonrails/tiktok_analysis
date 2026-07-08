package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;

/* JADX INFO: renamed from: X.19O5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19O5 {
    public final View LIZ;
    public final ConstraintFloatWindowLayout.LayoutParams LIZIZ;

    public static String LIZJ(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public C19O5(View view) {
        this.LIZ = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintFloatWindowLayout.LayoutParams) {
            this.LIZIZ = (ConstraintFloatWindowLayout.LayoutParams) layoutParams;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public final void LIZIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            ConstraintFloatWindowLayout.LayoutParams layoutParams = this.LIZIZ;
                            if (layoutParams != null) {
                                layoutParams.baselineToBaseline = -1;
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("unknown constraint");
                    }
                    ConstraintFloatWindowLayout.LayoutParams layoutParams2 = this.LIZIZ;
                    if (layoutParams2 == null) {
                        return;
                    }
                    layoutParams2.bottomToTop = -1;
                    layoutParams2.bottomToBottom = -1;
                    layoutParams2.bottomMargin = -1;
                    layoutParams2.goneBottomMargin = -1;
                    return;
                }
                ConstraintFloatWindowLayout.LayoutParams layoutParams3 = this.LIZIZ;
                if (layoutParams3 == null) {
                    return;
                }
                layoutParams3.topToBottom = -1;
                layoutParams3.topToTop = -1;
                layoutParams3.topMargin = -1;
                layoutParams3.goneTopMargin = -1;
                return;
            }
            ConstraintFloatWindowLayout.LayoutParams layoutParams4 = this.LIZIZ;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams4.rightToRight = -1;
            layoutParams4.rightToLeft = -1;
            layoutParams4.rightMargin = -1;
            layoutParams4.goneRightMargin = -1;
            return;
        }
        ConstraintFloatWindowLayout.LayoutParams layoutParams5 = this.LIZIZ;
        if (layoutParams5 == null) {
            return;
        }
        layoutParams5.leftToRight = -1;
        layoutParams5.leftToLeft = -1;
        layoutParams5.leftMargin = -1;
        layoutParams5.goneLeftMargin = -1;
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        ConstraintFloatWindowLayout.LayoutParams layoutParams = this.LIZIZ;
        if (layoutParams != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (i3 == 5) {
                                    layoutParams.baselineToBaseline = i2;
                                    layoutParams.bottomToBottom = -1;
                                    layoutParams.bottomToTop = -1;
                                    layoutParams.topToTop = -1;
                                    layoutParams.topToBottom = -1;
                                } else if (i3 != 3) {
                                    if (i3 == 4) {
                                        layoutParams.bottomToBottom = -1;
                                        layoutParams.bottomToTop = -1;
                                        layoutParams.topToTop = -1;
                                        layoutParams.topToBottom = -1;
                                        return;
                                    }
                                } else {
                                    layoutParams.bottomToBottom = -1;
                                    layoutParams.bottomToTop = -1;
                                    layoutParams.topToTop = -1;
                                    layoutParams.topToBottom = -1;
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("right to ");
                                sbLIZ.append(LIZJ(i3));
                                sbLIZ.append(" undefined");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(LIZJ(i));
                            sbLIZ2.append(" to ");
                            sbLIZ2.append(LIZJ(i3));
                            sbLIZ2.append(" unknown");
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (i3 != 3) {
                            if (i3 == 4) {
                                layoutParams.bottomToBottom = i2;
                                layoutParams.bottomToTop = -1;
                                layoutParams.baselineToBaseline = -1;
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("right to ");
                                sbLIZ3.append(LIZJ(i3));
                                sbLIZ3.append(" undefined");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        } else {
                            layoutParams.bottomToTop = i2;
                            layoutParams.bottomToBottom = -1;
                            layoutParams.baselineToBaseline = -1;
                        }
                        layoutParams.bottomMargin = i4;
                        return;
                    }
                    if (i3 != 3) {
                        if (i3 == 4) {
                            layoutParams.topToBottom = i2;
                            layoutParams.topToTop = -1;
                            layoutParams.baselineToBaseline = -1;
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("right to ");
                            sbLIZ4.append(LIZJ(i3));
                            sbLIZ4.append(" undefined");
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    } else {
                        layoutParams.topToTop = i2;
                        layoutParams.topToBottom = -1;
                        layoutParams.baselineToBaseline = -1;
                    }
                    layoutParams.topMargin = i4;
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        layoutParams.rightToRight = i2;
                        layoutParams.rightToLeft = -1;
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("right to ");
                        sbLIZ5.append(LIZJ(i3));
                        sbLIZ5.append(" undefined");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                } else {
                    layoutParams.rightToLeft = i2;
                    layoutParams.rightToRight = -1;
                }
                layoutParams.rightMargin = i4;
                return;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    layoutParams.leftToRight = i2;
                    layoutParams.leftToLeft = -1;
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Left to ");
                    sbLIZ6.append(LIZJ(i3));
                    sbLIZ6.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                }
            } else {
                layoutParams.leftToLeft = i2;
                layoutParams.leftToRight = -1;
            }
            layoutParams.leftMargin = i4;
        }
    }
}
