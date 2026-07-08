package X;

import android.os.Build;
import com.larus.business.markdown.impl.markwon.space.CustomSpaceDebugSpan;

/* JADX INFO: renamed from: X.18sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21422018sU {
    public static final C21422018sU LIZ = new C21422018sU();

    public final C14S3 LIZIZ(AbstractC21430218to abstractC21430218to, AbstractC21430218to abstractC21430218to2, boolean z) {
        AbstractC21430218to abstractC21430218to3;
        if (abstractC21430218to == null) {
            return C14S3.SPACE_NATURAL_SEGMENT;
        }
        boolean z2 = false;
        if ((abstractC21430218to instanceof C21439218vG) && (abstractC21430218to3 = abstractC21430218to.LIZ) != null) {
            AbstractC21430218to abstractC21430218to4 = abstractC21430218to3.LIZ;
            if ((abstractC21430218to4 instanceof AbstractC21445918wL) && ((AbstractC21445918wL) abstractC21430218to4).LJFF) {
                AbstractC21430218to abstractC21430218to5 = abstractC21430218to.LJ;
                if (abstractC21430218to5 instanceof C21439218vG) {
                    return C14S3.SPACE_NATURAL_SEGMENT;
                }
                if (abstractC21430218to5 != null) {
                    return C14S3.SPACE_LIST_ITEM;
                }
                if (abstractC21430218to2 != null) {
                    abstractC21430218to = abstractC21430218to2;
                }
                return LIZIZ(abstractC21430218to3, abstractC21430218to, false);
            }
        }
        if (abstractC21430218to instanceof C21439318vH) {
            C21439318vH c21439318vH = (C21439318vH) abstractC21430218to;
            if (c21439318vH.LJ != null) {
                if (c21439318vH.LJFF <= 2) {
                    return C14S3.SPACE_HEADING2;
                }
                return C14S3.SPACE_HEADING3;
            }
        }
        if (abstractC21430218to instanceof C21445118wD) {
            if (abstractC21430218to.LJ instanceof C21445118wD) {
                return C14S3.SPACE_LIST_ITEM;
            }
            AbstractC21430218to abstractC21430218to6 = abstractC21430218to.LIZ;
            if (abstractC21430218to2 != null) {
                abstractC21430218to = abstractC21430218to2;
            }
            if (z || !(abstractC21430218to6.LIZ instanceof C21439118vF)) {
                z2 = true;
            }
            return LIZIZ(abstractC21430218to6, abstractC21430218to, z2);
        }
        if ((abstractC21430218to instanceof C21445018wC) && abstractC21430218to2 != null) {
            return null;
        }
        AbstractC21430218to abstractC21430218to7 = abstractC21430218to.LJ;
        if (abstractC21430218to7 instanceof C21439318vH) {
            C21439318vH c21439318vH2 = (C21439318vH) abstractC21430218to7;
            if (c21439318vH2 != null && c21439318vH2.LJFF > 2) {
                return C14S3.SPACE_HEADING3;
            }
            return C14S3.SPACE_CHAPTER;
        }
        if ((abstractC21430218to7 instanceof AbstractC21445918wL) && (abstractC21430218to.LIZ instanceof C21439118vF) && (z || !(abstractC21430218to.LIZIZ instanceof C21445118wD))) {
            return C14S3.SPACE_LIST_ITEM;
        }
        if (abstractC21430218to7 == null) {
            AbstractC21430218to abstractC21430218to8 = abstractC21430218to.LIZ;
            if (abstractC21430218to8 instanceof C21439118vF) {
                return null;
            }
            if (abstractC21430218to8 != null) {
                if (abstractC21430218to2 != null) {
                    abstractC21430218to = abstractC21430218to2;
                }
                return LIZIZ(abstractC21430218to8, abstractC21430218to, z);
            }
        }
        return C14S3.SPACE_NATURAL_SEGMENT;
    }

    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to, C689290R1z c689290R1z, boolean z) {
        int i;
        int i2;
        Object c0gwf;
        C14S3 c14s3LIZIZ = LIZIZ(abstractC21430218to, null, false);
        Integer num = c689290R1z.LIZIZ.get(c14s3LIZIZ);
        if (num != null) {
            int iIntValue = num.intValue();
            interfaceC21427218tK.LJIIJ();
            int length = interfaceC21427218tK.length();
            int iLIZIZ = C814420VxA.LIZIZ(C445120Hcs.LIZ(Integer.valueOf(iIntValue)) / c689290R1z.LIZJ);
            interfaceC21427218tK.builder().LIZJ(" ");
            interfaceC21427218tK.LJIJI(length, C418300Gai.LIZ(iLIZIZ));
            if (z && c14s3LIZIZ != null) {
                int i3 = C14S2.LIZ[c14s3LIZIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    i = 0;
                                } else {
                                    i = -16711936;
                                }
                            } else {
                                i = -16776961;
                            }
                        } else {
                            i = -65281;
                        }
                    } else {
                        i = -256;
                    }
                } else {
                    i = -65536;
                }
                if (Integer.valueOf(i) != null) {
                    int i4 = C14S2.LIZ[c14s3LIZIZ.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        i2 = 0;
                                    } else {
                                        i2 = -16711936;
                                    }
                                } else {
                                    i2 = -16776961;
                                }
                            } else {
                                i2 = -65281;
                            }
                        } else {
                            i2 = -256;
                        }
                    } else {
                        i2 = -65536;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(num);
                    sbLIZ.append(':');
                    sbLIZ.append(c14s3LIZIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (Build.VERSION.SDK_INT >= 29) {
                        c0gwf = new CustomSpaceDebugSpan(i2, strLIZIZ);
                    } else {
                        c0gwf = new C0GWF(i2);
                    }
                    interfaceC21427218tK.LJIJI(length, c0gwf);
                }
            }
            interfaceC21427218tK.LJIIJ();
        }
    }
}
