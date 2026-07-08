package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0pXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515580pXg implements C0POE<byte[]> {
    public boolean LIZ;
    public final /* synthetic */ C0V0E LIZIZ;
    public final /* synthetic */ C1515820pY4 LIZJ;
    public final /* synthetic */ C1515670pXp LIZLLL;

    @Override // X.C0POE
    public final void onComplete() {
        C1515670pXp c1515670pXp = this.LIZLLL;
        C0POE<byte[]> c0poe = c1515670pXp.LLJJ;
        if (c0poe != null) {
            c0poe.onComplete();
        } else {
            c1515670pXp.LLJJI.add(new ARunnableS123S0100000_23(this, 165));
        }
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        C1515670pXp c1515670pXp = this.LIZLLL;
        C0POE<byte[]> c0poe = c1515670pXp.LLJJ;
        if (c0poe != null) {
            c0poe.onFailed(th);
        } else {
            c1515670pXp.LLJJI.add(new ARunnableS92S0200000_23(this, th, 105));
        }
    }

    @Override // X.C0POE
    public final void onNext(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (!this.LIZ) {
            C0V0E c0v0e = this.LIZIZ;
            final C1515820pY4 c1515820pY4 = this.LIZJ;
            C1515560pXe c1515560pXe = (C1515560pXe) c0v0e;
            C1515550pXd c1515550pXd = c1515560pXe.LIZ;
            TypedInput typedInput = c1515560pXe.LIZIZ;
            c1515550pXd.getClass();
            try {
                String charset = "UTF-8";
                if (typedInput.mimeType() != null) {
                    charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charset);
                    try {
                        final Object obj = c1515550pXd.LIZIZ.read(c1515550pXd.LIZ.LJIIL(inputStreamReader));
                        if (obj instanceof InterfaceC1201180hMa) {
                            if (c1515820pY4.getRequestInfo() == null) {
                                c1515820pY4.LLILZLL = new InterfaceC1515700pXs() { // from class: X.0pXi
                                    @Override // X.InterfaceC1515700pXs
                                    public final void LIZ(C1494600ozq c1494600ozq) {
                                        if (c1494600ozq != null) {
                                            try {
                                                ((InterfaceC1201180hMa) obj).setRequestInfo(c1494600ozq);
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                return;
                                            }
                                        }
                                        c1515820pY4.LLILZLL = null;
                                    }
                                };
                            }
                            ((InterfaceC1201180hMa) obj).setRequestInfo(c1515820pY4.getRequestInfo());
                        }
                        Field declaredField = obj.getClass().getDeclaredField("originQuery");
                        declaredField.setAccessible(true);
                        String str = (String) declaredField.get(obj);
                        if (str != null) {
                            C1507060pJw.LJII().LJIIIIZZ(obj, str);
                        }
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            this.LIZ = true;
            return;
        }
        C1515670pXp c1515670pXp = this.LIZLLL;
        C0POE<byte[]> c0poe = c1515670pXp.LLJJ;
        if (c0poe != null) {
            c0poe.onNext(bArr2);
        } else {
            c1515670pXp.LLJJI.add(new ARunnableS92S0200000_23(this, bArr2, 104));
        }
    }

    public C1515580pXg(C1515670pXp c1515670pXp, C1515560pXe c1515560pXe, C1515820pY4 c1515820pY4) {
        this.LIZLLL = c1515670pXp;
        this.LIZIZ = c1515560pXe;
        this.LIZJ = c1515820pY4;
    }
}
