package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ki2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329800ki2 implements InterfaceC1330200kig {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ki3] */
    @Override // X.InterfaceC1330200kig
    public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
        InputStream inputStreamLJII = c1328480kfu.LJII();
        try {
            try {
                final Movie movieDecodeStream = Movie.decodeStream(inputStreamLJII);
                C1329850ki7 c1329850ki7 = new C1329850ki7(movieDecodeStream);
                inputStreamLJII.reset();
                ?? r2 = new Object(movieDecodeStream) { // from class: X.0ki3
                    public final Movie LIZ;
                    public final List<Integer> LIZIZ = new ArrayList();

                    public final void LIZ() {
                        Canvas canvas = new Canvas(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        for (int i3 = 0; i3 < this.LIZ.duration(); i3 += 17) {
                            if (this.LIZ.setTime(i3) || i3 == 0) {
                                this.LIZ.draw(canvas, 0.0f, 0.0f);
                                arrayList.add(Integer.valueOf(i3));
                            }
                        }
                        int size = arrayList.size() - 1;
                        while (i2 < size) {
                            int i4 = i2 + 1;
                            ((ArrayList) this.LIZIZ).add(Integer.valueOf(((Integer) ListProtector.get(arrayList, i4)).intValue() - ((Integer) ListProtector.get(arrayList, i2)).intValue()));
                            i2 = i4;
                        }
                        ((ArrayList) this.LIZIZ).add(Integer.valueOf(this.LIZ.duration() - ((Integer) ListProtector.get(arrayList, arrayList.size() - 1)).intValue()));
                    }

                    public final int LIZIZ() {
                        return ((ArrayList) this.LIZIZ).size();
                    }

                    {
                        this.LIZ = movieDecodeStream;
                    }

                    public final int LIZJ(int i2) {
                        return ((Integer) ListProtector.get(this.LIZIZ, i2)).intValue();
                    }
                };
                r2.LIZ();
                int iLIZIZ = r2.LIZIZ();
                final C1329840ki6[] c1329840ki6Arr = new C1329840ki6[iLIZIZ];
                int i2 = 0;
                for (int i3 = 0; i3 < iLIZIZ; i3++) {
                    int iLIZJ = r2.LIZJ(i3);
                    i2 += iLIZJ;
                    c1329840ki6Arr[i3] = new C1329840ki6(c1329850ki7, i2, iLIZJ, movieDecodeStream.width(), movieDecodeStream.height(), EnumC1329860ki8.DISPOSE_DO_NOT);
                }
                final int iLJIILL = c1328480kfu.LJIILL();
                final int iDuration = movieDecodeStream.duration();
                C1329440khS c1329440khS = new C1329440khS(new InterfaceC1329600khi(c1329840ki6Arr, iLJIILL, iDuration) { // from class: X.0ki5
                    public final C1329840ki6[] LIZ;
                    public final int LIZIZ;
                    public final int LIZJ;
                    public final int[] LIZLLL;

                    @Override // X.InterfaceC1329600khi
                    public final InterfaceC1329600khi cloneOrNull() {
                        return null;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final boolean doesRenderSupportScaling() {
                        return true;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getDecodeStatus() {
                        return 0;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getLoopCount() {
                        return 0;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getFrameCount() {
                        return this.LIZ.length;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getHeight() {
                        return this.LIZ[0].LJ;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getWidth() {
                        return this.LIZ[0].LIZLLL;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getDuration() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int[] getFrameDurations() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final C1330000kiM getImageFormat() {
                        return C1328580kg4.LIZJ;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final int getSizeInBytes() {
                        return this.LIZIZ;
                    }

                    @Override // X.InterfaceC1329600khi
                    public final InterfaceC1329960kiI getFrame(int i4) {
                        return this.LIZ[i4];
                    }

                    @Override // X.InterfaceC1329600khi
                    public final C1329890kiB getFrameInfo(int i4) {
                        C1329840ki6 c1329840ki6 = this.LIZ[i4];
                        c1329840ki6.getClass();
                        return new C1329890kiB(0, 0, c1329840ki6.LIZLLL, c1329840ki6.LJ, EnumC1329870ki9.BLEND_WITH_PREVIOUS, this.LIZ[i4].LJFF);
                    }

                    {
                        this.LIZ = c1329840ki6Arr;
                        this.LIZIZ = iLJIILL;
                        this.LIZJ = iDuration;
                        this.LIZLLL = new int[c1329840ki6Arr.length];
                        int length = c1329840ki6Arr.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            this.LIZLLL[i4] = this.LIZ[i4].LIZJ;
                        }
                    }
                });
                c1328480kfu.LJIJJLI();
                C1329380khM c1329380khM = new C1329380khM(c1329440khS, c1329360khK, c1328480kfu.LLILLL);
                try {
                    inputStreamLJII.close();
                    return c1329380khM;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return c1329380khM;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException("Error while decoding gif", e2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                inputStreamLJII.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }
}
