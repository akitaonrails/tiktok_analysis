package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import webcast.api.sub.GetSubOnlyLiveStatResponse;
import webcast.data.SubOnlyLiveGeneralStat;

/* JADX INFO: renamed from: X.0Jam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494780Jam {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableString LIZ(GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData getSubOnlyLiveStatData, boolean z) {
        String strLJIIL;
        String strLJIIL2;
        long j;
        String strLJIIL3;
        int iFloor;
        String strLJIJJ;
        SubOnlyLiveGeneralStat subOnlyLiveGeneralStat;
        String strLJIJJ2;
        int i = getSubOnlyLiveStatData.descriptionType;
        long j2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && getSubOnlyLiveStatData.titleType == 4 && (subOnlyLiveGeneralStat = getSubOnlyLiveStatData.generalStat) != null) {
                            int iFloor2 = (int) Math.floor(subOnlyLiveGeneralStat.totalSubOnlyLiveTime / ((double) 3600.0f));
                            int iFloor3 = (int) Math.floor((subOnlyLiveGeneralStat.totalSubOnlyLiveTime - (((long) iFloor2) * 3600)) / ((double) 60.0f));
                            StringBuilder sb = new StringBuilder();
                            if (iFloor2 > 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(iFloor2);
                                sbLIZ.append('h');
                                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (iFloor3 > 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(iFloor3);
                                sbLIZ2.append('m');
                                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            if (iFloor2 > 0 || iFloor3 > 0) {
                                if (z) {
                                    strLJIJJ2 = C497740JfY.LJIJJ(2131856599, sb.toString());
                                } else {
                                    strLJIJJ2 = C497740JfY.LJIJJ(2131844209, sb.toString());
                                }
                                return new SpannableString(strLJIJJ2);
                            }
                            return null;
                        }
                        return null;
                    }
                    if (getSubOnlyLiveStatData.titleType == 3) {
                        SubOnlyLiveGeneralStat subOnlyLiveGeneralStat2 = getSubOnlyLiveStatData.generalStat;
                        if (subOnlyLiveGeneralStat2 != null) {
                            long j3 = subOnlyLiveGeneralStat2.totalActiveSub;
                            iFloor = 100;
                            if (j3 != 0) {
                                double d = (subOnlyLiveGeneralStat2.totalSubViewer / j3) * ((double) 100);
                                if (d < 1.0d && d >= 0.0d) {
                                    d = 1.0d;
                                }
                                iFloor = (int) Math.floor(d);
                            }
                        } else {
                            iFloor = 0;
                        }
                        if (z) {
                            strLJIJJ = C497740JfY.LJIJJ(2131856603, String.valueOf(iFloor));
                        } else {
                            strLJIJJ = C497740JfY.LJIJJ(2131844213, String.valueOf(iFloor));
                        }
                        return new SpannableString(strLJIJJ);
                    }
                    return null;
                }
                SubOnlyLiveGeneralStat subOnlyLiveGeneralStat3 = getSubOnlyLiveStatData.generalStat;
                if (subOnlyLiveGeneralStat3 != null) {
                    j = subOnlyLiveGeneralStat3.totalNewSub;
                    j2 = subOnlyLiveGeneralStat3.totalExtendSub;
                } else {
                    j = 0;
                }
                if (z) {
                    strLJIIL3 = C497740JfY.LJIIL(2131755996, (int) j, Long.valueOf(j), C497740JfY.LJIIL(2131755997, (int) j2, Long.valueOf(j2)));
                } else {
                    strLJIIL3 = C497740JfY.LJIIL(2131755599, (int) j, Long.valueOf(j), C497740JfY.LJIIL(2131755600, (int) j2, Long.valueOf(j2)));
                }
                return new SpannableString(strLJIIL3);
            }
            SubOnlyLiveGeneralStat subOnlyLiveGeneralStat4 = getSubOnlyLiveStatData.generalStat;
            if (subOnlyLiveGeneralStat4 != null) {
                j2 = subOnlyLiveGeneralStat4.totalExtendSub;
            }
            if (z) {
                strLJIIL2 = C497740JfY.LJIIL(2131755995, (int) j2, Long.valueOf(j2));
            } else {
                strLJIIL2 = C497740JfY.LJIIL(2131755598, (int) j2, Long.valueOf(j2));
            }
            return new SpannableString(strLJIIL2);
        }
        SubOnlyLiveGeneralStat subOnlyLiveGeneralStat5 = getSubOnlyLiveStatData.generalStat;
        if (subOnlyLiveGeneralStat5 != null) {
            j2 = subOnlyLiveGeneralStat5.totalNewSub;
        }
        if (z) {
            strLJIIL = C497740JfY.LJIIL(2131755994, (int) j2, Long.valueOf(j2));
        } else {
            strLJIIL = C497740JfY.LJIIL(2131755597, (int) j2, Long.valueOf(j2));
        }
        return new SpannableString(strLJIIL);
    }

    public static SpannableString LIZIZ(Context context, GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData getSubOnlyLiveStatData, boolean z) {
        String strLJIJJ;
        SpannableString spannableString;
        int iLJJJ;
        int length;
        String strLJIJJ2;
        String strLJIJJ3;
        String strLJIJJ4;
        String strLJIJJ5;
        String strLJIJJ6;
        int i = getSubOnlyLiveStatData.titleType;
        int i2 = 0;
        if (i != 0) {
            float f = 0.0f;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            String strLJIJI = C497740JfY.LJIJI(2131844207);
                            if (z) {
                                strLJIJJ6 = C497740JfY.LJIJJ(2131856623, strLJIJI);
                            } else {
                                strLJIJJ6 = C497740JfY.LJIJJ(2131844208, strLJIJI);
                            }
                            spannableString = new SpannableString(strLJIJJ6);
                            iLJJJ = a0.LJJJ(strLJIJJ6, strLJIJI, 0, false, 6);
                            length = strLJIJI.length();
                        } else {
                            SubOnlyLiveGeneralStat subOnlyLiveGeneralStat = getSubOnlyLiveStatData.generalStat;
                            if (subOnlyLiveGeneralStat != null) {
                                f = subOnlyLiveGeneralStat.subOnlyLiveTimeRank;
                            }
                            String strValueOf = String.valueOf((int) Math.floor(f));
                            if (z) {
                                strLJIJJ5 = C497740JfY.LJIJJ(2131856600, strValueOf);
                            } else {
                                strLJIJJ5 = C497740JfY.LJIJJ(2131844210, strValueOf);
                            }
                            iLJJJ = a0.LJJJ(strLJIJJ5, strValueOf, 0, false, 6);
                            length = strValueOf.length();
                            spannableString = new SpannableString(strLJIJJ5);
                        }
                    } else {
                        SubOnlyLiveGeneralStat subOnlyLiveGeneralStat2 = getSubOnlyLiveStatData.generalStat;
                        if (subOnlyLiveGeneralStat2 != null) {
                            f = subOnlyLiveGeneralStat2.subViewerRank;
                        }
                        String strValueOf2 = String.valueOf((int) Math.floor(f));
                        if (z) {
                            strLJIJJ4 = C497740JfY.LJIJJ(2131856604, strValueOf2);
                        } else {
                            strLJIJJ4 = C497740JfY.LJIJJ(2131844214, strValueOf2);
                        }
                        iLJJJ = a0.LJJJ(strLJIJJ4, strValueOf2, 0, false, 6);
                        length = strValueOf2.length();
                        spannableString = new SpannableString(strLJIJJ4);
                    }
                } else {
                    SubOnlyLiveGeneralStat subOnlyLiveGeneralStat3 = getSubOnlyLiveStatData.generalStat;
                    if (subOnlyLiveGeneralStat3 != null) {
                        f = subOnlyLiveGeneralStat3.extendSubRank;
                    }
                    String strValueOf3 = String.valueOf((int) Math.floor(f));
                    if (z) {
                        strLJIJJ3 = C497740JfY.LJIJJ(2131856602, strValueOf3);
                    } else {
                        strLJIJJ3 = C497740JfY.LJIJJ(2131844212, strValueOf3);
                    }
                    iLJJJ = a0.LJJJ(strLJIJJ3, strValueOf3, 0, false, 6);
                    length = strValueOf3.length();
                    spannableString = new SpannableString(strLJIJJ3);
                }
            } else {
                SubOnlyLiveGeneralStat subOnlyLiveGeneralStat4 = getSubOnlyLiveStatData.generalStat;
                if (subOnlyLiveGeneralStat4 != null) {
                    f = subOnlyLiveGeneralStat4.newSubRank;
                }
                String strValueOf4 = String.valueOf((int) Math.floor(f));
                if (z) {
                    strLJIJJ2 = C497740JfY.LJIJJ(2131856601, strValueOf4);
                } else {
                    strLJIJJ2 = C497740JfY.LJIJJ(2131844211, strValueOf4);
                }
                iLJJJ = a0.LJJJ(strLJIJJ2, strValueOf4, 0, false, 6);
                length = strValueOf4.length();
                spannableString = new SpannableString(strLJIJJ2);
            }
            i2 = 1;
        } else {
            String strLJIJI2 = C497740JfY.LJIJI(2131844207);
            if (z) {
                strLJIJJ = C497740JfY.LJIJJ(2131856623, strLJIJI2);
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131844208, strLJIJI2);
            }
            spannableString = new SpannableString(strLJIJJ);
            iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI2, 0, false, 6);
            length = strLJIJI2.length();
        }
        if (iLJJJ >= 0) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.eu2, context)), iLJJJ, length + iLJJJ + i2, 17);
        }
        return spannableString;
    }
}
