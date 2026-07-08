package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20140313rF {
    public static final C20141413rQ LIZ;
    public static final C603820NmG<String, Typeface> LIZIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            LIZ = new C20141413rQ() { // from class: X.13rP
                public static Font LJI(FontFamily fontFamily, int i2) {
                    int i3;
                    int i4;
                    if ((i2 & 1) != 0) {
                        i3 = OppoPermissionPopupMaskDelayExp.DEFAULT;
                    } else {
                        i3 = 400;
                    }
                    if ((i2 & 2) != 0) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    FontStyle fontStyle = new FontStyle(i3, i4);
                    Font font = fontFamily.getFont(0);
                    int iLJII = LJII(fontStyle, font.getStyle());
                    for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
                        Font font2 = fontFamily.getFont(i5);
                        int iLJII2 = LJII(fontStyle, font2.getStyle());
                        if (iLJII2 < iLJII) {
                            font = font2;
                            iLJII = iLJII2;
                        }
                    }
                    return font;
                }

                public static int LJII(FontStyle fontStyle, FontStyle fontStyle2) {
                    int i2;
                    int iAbs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
                    if (fontStyle.getSlant() == fontStyle2.getSlant()) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    return iAbs + i2;
                }

                @Override // X.C20141413rQ
                public final Typeface LIZJ(Context context, InputStream inputStream) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C20141413rQ
                public final C20139813rA LJFF(int i2, C20139813rA[] c20139813rAArr) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C20141413rQ
                public final Typeface LIZIZ(Context context, C20139813rA[] c20139813rAArr, int i2) {
                    int i3;
                    ContentResolver contentResolver = context.getContentResolver();
                    try {
                        FontFamily.Builder builder = null;
                        for (C20139813rA c20139813rA : c20139813rAArr) {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorL4 = C786410Ut5.l4(contentResolver, c20139813rA.LIZ);
                                if (parcelFileDescriptorL4 != null) {
                                    try {
                                        Font.Builder weight = new Font.Builder(parcelFileDescriptorL4).setWeight(c20139813rA.LIZJ);
                                        if (c20139813rA.LIZLLL) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                        Font fontBuild = weight.setSlant(i3).setTtcIndex(c20139813rA.LIZIZ).build();
                                        if (builder == null) {
                                            builder = new FontFamily.Builder(fontBuild);
                                        } else {
                                            builder.addFont(fontBuild);
                                        }
                                        parcelFileDescriptorL4.close();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            parcelFileDescriptorL4.close();
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily fontFamilyBuild = builder.build();
                        return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(LJI(fontFamilyBuild, i2).getStyle()).build();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }

                @Override // X.C20141413rQ
                public final Typeface LIZ(Context context, C20141813rU c20141813rU, Resources resources, int i2) {
                    int i3;
                    try {
                        FontFamily.Builder builder = null;
                        for (C20141613rS c20141613rS : c20141813rU.LIZ) {
                            try {
                                Font.Builder weight = new Font.Builder(resources, c20141613rS.LJFF).setWeight(c20141613rS.LIZIZ);
                                if (c20141613rS.LIZJ) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                Font fontBuild = weight.setSlant(i3).setTtcIndex(c20141613rS.LJ).setFontVariationSettings(c20141613rS.LIZLLL).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily fontFamilyBuild = builder.build();
                        return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(LJI(fontFamilyBuild, i2).getStyle()).build();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }

                @Override // X.C20141413rQ
                public final Typeface LIZLLL(Context context, Resources resources, int i2, String str, int i3) {
                    try {
                        Font fontBuild = new Font.Builder(resources, i2).build();
                        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            };
        } else if (i >= 28) {
            LIZ = new C20141213rO() { // from class: X.07oX
                @Override // X.C20141213rO
                public final Typeface LJIIJ(Object obj) {
                    try {
                        Object objNewInstance = Array.newInstance(this.LJFF, 1);
                        Array.set(objNewInstance, 0, obj);
                        return (Typeface) this.LJIIJJI.invoke(null, objNewInstance, "sans-serif", -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }

                @Override // X.C20141213rO
                public final Method LJIILL(Class<?> cls) throws NoSuchMethodException {
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                }
            };
        } else if (i >= 26) {
            LIZ = new C20141213rO();
        } else if (i < 24 || C20141013rM.LIZJ == null) {
            LIZ = new C20141113rN();
        } else {
            LIZ = new C20141013rM();
        }
        LIZIZ = new C603820NmG<>(16);
    }

    public static String LIZIZ(Resources resources, int i, String str, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(resources.getResourcePackageName(i));
        sbLIZ.append('-');
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(i2);
        sbLIZ.append('-');
        sbLIZ.append(i);
        sbLIZ.append('-');
        sbLIZ.append(i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13rD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LIZ(android.content.Context r11, X.InterfaceC20140813rK r12, android.content.res.Resources r13, int r14, java.lang.String r15, int r16, int r17, X.AbstractC20142713rd r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20140313rF.LIZ(android.content.Context, X.13rK, android.content.res.Resources, int, java.lang.String, int, int, X.13rd, boolean):android.graphics.Typeface");
    }
}
