package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: X.0MCS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCS {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0069: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:16777321), block:B:65:0x006a */
    public static Bitmap LIZIZ(Uri uri) {
        InterfaceC1320200kSY interfaceC1320200kSY;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI;
        C1323050kX9 c1323050kX9;
        AbstractC1325130kaV abstractC1325130kaV;
        InterfaceC1320200kSY interfaceC1320200kSY2 = null;
        underlyingBitmap = null;
        Bitmap underlyingBitmap = null;
        try {
            if (uri == null) {
                return null;
            }
            try {
                interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(uri).LIZ(), null);
                try {
                    Object objLIZIZ = C1321330kUN.LIZIZ(interfaceC1320200kSYLJI);
                    if (objLIZIZ instanceof C1323050kX9) {
                        c1323050kX9 = (C1323050kX9) objLIZIZ;
                    } else {
                        c1323050kX9 = null;
                    }
                    if (c1323050kX9 != null && (abstractC1325130kaV = (AbstractC1325130kaV) c1323050kX9.get()) != null) {
                        underlyingBitmap = abstractC1325130kaV.getUnderlyingBitmap();
                    }
                    interfaceC1320200kSYLJI.close();
                    return underlyingBitmap;
                } catch (IllegalArgumentException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC1320200kSYLJI != null) {
                        interfaceC1320200kSYLJI.close();
                    }
                    return null;
                } catch (InterruptedException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC1320200kSYLJI != null) {
                        interfaceC1320200kSYLJI.close();
                    }
                    return null;
                } catch (SecurityException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC1320200kSYLJI != null) {
                        interfaceC1320200kSYLJI.close();
                    }
                    return null;
                } catch (RuntimeException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    if (interfaceC1320200kSYLJI != null) {
                        interfaceC1320200kSYLJI.close();
                    }
                    return null;
                }
            } catch (IllegalArgumentException e5) {
                e = e5;
                interfaceC1320200kSYLJI = null;
            } catch (InterruptedException e6) {
                e = e6;
                interfaceC1320200kSYLJI = null;
            } catch (SecurityException e7) {
                e = e7;
                interfaceC1320200kSYLJI = null;
            } catch (RuntimeException e8) {
                e = e8;
                interfaceC1320200kSYLJI = null;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC1320200kSY2 = interfaceC1320200kSY2;
                    }
                    interfaceC1320200kSY2 = interfaceC1320200kSY2;
                }
                if (interfaceC1320200kSY2 != null) {
                    interfaceC1320200kSY2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC1320200kSY2 = interfaceC1320200kSY;
        }
    }

    public static boolean LIZ(Bitmap bitmap, RectF rectF, String str) throws Throwable {
        if (bitmap == null) {
            return false;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fWidth = rectF.width();
        if (fWidth <= width) {
            width = fWidth;
        }
        float fHeight = rectF.height();
        if (fHeight <= height) {
            height = fHeight;
        }
        float width2 = (bitmap.getWidth() / 2.0f) - (width / 2.0f);
        float height2 = (bitmap.getHeight() / 2.0f) - (height / 2.0f);
        if (width2 < 0.0f) {
            width2 = 0.0f;
        }
        float width3 = bitmap.getWidth() - width;
        if (width2 > width3) {
            width2 = width3;
        }
        if (height2 < 0.0f) {
            height2 = 0.0f;
        }
        float height3 = bitmap.getHeight() - height;
        if (height2 > height3) {
            height2 = height3;
        }
        rectF.set(width2, height2, width + width2, height + height2);
        float fWidth2 = rectF.left + rectF.width();
        float fHeight2 = rectF.top + rectF.height();
        if (fWidth2 > bitmap.getWidth()) {
            rectF.right = bitmap.getWidth();
        }
        if (fHeight2 > bitmap.getHeight()) {
            rectF.bottom = bitmap.getHeight();
        }
        Throwable th = null;
        if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, 1.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) rectF.height(), matrix, false);
            if (bitmapCreateBitmap != null) {
                try {
                    C0VSV c0vsv = new C0VSV(str);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c0vsv);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                            C2107108Nh.LIZ(bufferedOutputStream, null);
                            C2107108Nh.LIZ(c0vsv, null);
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                C2107108Nh.LIZ(bufferedOutputStream, th);
                                                throw th;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                                try {
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    th = th;
                                                    while (true) {
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C2107108Nh.LIZ(c0vsv, th);
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                th = null;
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                } catch (IllegalStateException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return false;
                }
            }
        }
        return false;
    }
}
