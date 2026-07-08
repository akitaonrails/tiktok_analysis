package X;

import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272750jE1 implements InterfaceC1272770jE3, InterfaceC1268830j7h {
    public final ArrayList<InterfaceC1268830j7h> LL = new ArrayList<>();
    public final List<Object> LLILLJJLI = new ArrayList();
    public ByteBuffer LLILLL;
    public final C1271090jBL LLILZ;

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
    }

    public final C1274350jGb LIZ() {
        C1274350jGb c1274350jGb;
        AVLog.d("InteractVideoClientFactory", "Create video client ");
        synchronized (this.LL) {
            try {
                if (this.LL.isEmpty()) {
                    this.LLILZ.LIZ(this);
                }
                c1274350jGb = new C1274350jGb();
                this.LLILZ.LLILZIL.getClass();
                this.LL.add(c1274350jGb);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1274350jGb;
    }

    public final ByteBuffer LIZJ() {
        Object objRemove;
        synchronized (this.LLILLJJLI) {
            try {
                objRemove = !((ArrayList) this.LLILLJJLI).isEmpty() ? ((ArrayList) this.LLILLJJLI).remove(0) : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (objRemove instanceof ByteBuffer) {
            return (ByteBuffer) objRemove;
        }
        if ((objRemove instanceof String) && objRemove != null) {
            String str = (String) objRemove;
            int length = str.length();
            ByteBuffer byteBuffer = this.LLILLL;
            if (byteBuffer == null || byteBuffer.capacity() < length + 64) {
                this.LLILLL = ByteBuffer.allocateDirect(length + 64);
                if (length > 1024) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sei length ");
                    sbLIZ.append(length);
                    sbLIZ.append(" is too large.");
                    AVLog.iow("InteractVideoClientFactory", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            int i = 3;
            int iNativeBuildBufferFromString = 0;
            while (true) {
                int i2 = i - 1;
                if (i <= 0 || (iNativeBuildBufferFromString = EffectWrapper.nativeBuildBufferFromString(0, str, this.LLILLL)) != 0) {
                    break;
                }
                this.LLILLL = ByteBuffer.allocateDirect(this.LLILLL.capacity() * 2);
                i = i2;
            }
            if (iNativeBuildBufferFromString > 0) {
                this.LLILLL.position(0);
                this.LLILLL.limit(iNativeBuildBufferFromString);
                return this.LLILLL.slice();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BUG !  size ");
            sbLIZ2.append(iNativeBuildBufferFromString);
            sbLIZ2.append(" buffer len ");
            sbLIZ2.append(this.LLILLL.capacity());
            sbLIZ2.append(" VS ");
            sbLIZ2.append(length);
            sbLIZ2.append(" | sei ");
            sbLIZ2.append(objRemove);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("InteractVideoClientFactory");
            sbLIZ3.append(".getExtraSei");
            c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ3), androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        return null;
    }

    public final int LIZLLL() {
        int size;
        synchronized (this.LLILLJJLI) {
            try {
                size = ((ArrayList) this.LLILLJJLI).size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public C1272750jE1(C1271090jBL c1271090jBL) {
        this.LLILZ = c1271090jBL;
    }

    public final void LIZIZ(InterfaceC1272760jE2 interfaceC1272760jE2) {
        AVLog.d("InteractVideoClientFactory", "Destroy video client ");
        synchronized (this.LL) {
            try {
                this.LL.remove((C1274350jGb) interfaceC1272760jE2);
                if (this.LL.isEmpty()) {
                    this.LLILZ.LIZ(this);
                    this.LLILZ.LIZLLL(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(Object obj) {
        synchronized (this.LLILLJJLI) {
            try {
                if ((obj instanceof ByteBuffer) && C1272780jE4.LIZ((ByteBuffer) obj)) {
                    for (int i = 0; i < ((ArrayList) this.LLILLJJLI).size(); i++) {
                        Object obj2 = ((ArrayList) this.LLILLJJLI).get(i);
                        if ((obj2 instanceof ByteBuffer) && C1272780jE4.LIZ((ByteBuffer) obj2)) {
                            ((ArrayList) this.LLILLJJLI).set(i, obj);
                            break;
                        }
                    }
                    ((ArrayList) this.LLILLJJLI).add(obj);
                } else {
                    ((ArrayList) this.LLILLJJLI).add(obj);
                }
                if (C1267520j5a.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("push sei[");
                    sbLIZ.append(((ArrayList) this.LLILLJJLI).size());
                    sbLIZ.append("] [");
                    sbLIZ.append(obj);
                    sbLIZ.append(e3.f);
                    AVLog.e("InteractVideoClientFactory", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (((ArrayList) this.LLILLJJLI).size() > 30) {
                    AVLog.e("InteractVideoClientFactory", "SEI buffer overflow with drop old sei...");
                    ((ArrayList) this.LLILLJJLI).remove(0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1268830j7h
    public final void q0(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length < 1) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && LIZLLL() > 0) {
            objArr2[0] = LIZJ();
        }
        synchronized (this.LL) {
            try {
                Iterator<InterfaceC1268830j7h> it2 = this.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().q0(byteBuffer, i, i2, j, objArr2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length < 1) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && LIZLLL() > 0) {
            objArr2[0] = LIZJ();
        }
        synchronized (this.LL) {
            try {
                Iterator<InterfaceC1268830j7h> it2 = this.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().LLLLZLL(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
