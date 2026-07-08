package X;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0j65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267830j65 {
    public k LIZ;
    public final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public long LIZJ;
    public boolean LIZLLL;
    public final /* synthetic */ C1267790j61 LJ;

    public final synchronized void LIZ() {
        k kVar = this.LIZ;
        int textureId = kVar != null ? kVar.getTextureId() : 0;
        if (textureId > 0) {
            GLES20.glDeleteTextures(1, new int[]{textureId}, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy textureId:");
            sbLIZ.append(textureId);
            AVLog.logKibana(4, "VideoBufferPool", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        k kVar2 = this.LIZ;
        if (kVar2 != null) {
            kVar2.destroy();
        }
        this.LIZIZ.clear();
        this.LIZJ = 0L;
        this.LIZ = null;
        this.LIZLLL = true;
    }

    public final synchronized int LIZIZ() {
        k kVar;
        kVar = this.LIZ;
        return kVar != null ? kVar.getRefCount() : 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tex:");
        k kVar = this.LIZ;
        sbLIZ.append(kVar != null ? Integer.valueOf(kVar.getTextureId()) : null);
        sbLIZ.append(" ,refCount:");
        k kVar2 = this.LIZ;
        sbLIZ.append(kVar2 != null ? Integer.valueOf(kVar2.getRefCount()) : null);
        sbLIZ.append(" ,refList:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LIZJ(String str) {
        Integer numValueOf = null;
        if (this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retain ");
            sbLIZ.append(str);
            sbLIZ.append(" after mDestroyed");
            AVLog.logKibana(4, "VideoBufferPool", C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        k kVar = this.LIZ;
        if (kVar != null) {
            kVar.retain();
        }
        Integer num = this.LIZIZ.get(str);
        if (num == null) {
            num = 0;
        }
        this.LIZIZ.put(str, Integer.valueOf(num.intValue() + 1));
        if (this.LJ.LIZLLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("referrer ");
            sbLIZ2.append(str);
            sbLIZ2.append(" after retain refCnt:");
            k kVar2 = this.LIZ;
            if (kVar2 != null) {
                numValueOf = Integer.valueOf(kVar2.getRefCount());
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" mRefList:");
            sbLIZ2.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public C1267830j65(C1267790j61 c1267790j61, int i, int i2) {
        this.LJ = c1267790j61;
        InterfaceC1271740jCO interfaceC1271740jCO = new InterfaceC1271740jCO() { // from class: X.0j64
            @Override // X.InterfaceC1271740jCO
            public final void release(String str) {
                Integer numValueOf;
                C1267830j65 c1267830j65 = this.LIZ;
                synchronized (c1267830j65) {
                    if (c1267830j65.LJ.LIZLLL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("release referrer ");
                        sbLIZ.append(str);
                        sbLIZ.append(" after release refCnt:");
                        k kVar = c1267830j65.LIZ;
                        if (kVar != null) {
                            numValueOf = Integer.valueOf(kVar.getRefCount());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(" mRefList:");
                        sbLIZ.append(c1267830j65.LIZIZ);
                        sbLIZ.append(" mDestroyed:");
                        sbLIZ.append(c1267830j65.LIZLLL);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (c1267830j65.LIZLLL) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("release ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" after mDestroyed");
                        AVLog.logKibana(4, "VideoBufferPool", C2188811AlT.LIZIZ(sbLIZ2), null);
                        return;
                    }
                    Integer num = c1267830j65.LIZIZ.get(str);
                    if (num == null) {
                        num = 0;
                    }
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue > 0) {
                        c1267830j65.LIZIZ.put(str, Integer.valueOf(iIntValue));
                    } else if (iIntValue == 0) {
                        c1267830j65.LIZIZ.remove(str);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("BUG ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(" release refCnt:");
                        sbLIZ3.append(iIntValue);
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        C1274080jGA.LIZ.LIZ("VideoBufferPool#TextureBufferEntry.release", androidRuntimeException);
                        if (C1274040jG6.LIZ()) {
                            throw androidRuntimeException;
                        }
                    }
                    k kVar2 = c1267830j65.LIZ;
                    if (kVar2 != null) {
                        kVar2.release();
                    }
                    c1267830j65.LIZJ = System.currentTimeMillis();
                }
            }

            @Override // X.InterfaceC1271740jCO
            public final void retain(String str) {
                this.LIZ.LIZJ(str);
            }
        };
        try {
            GlUtil.clearAllGLError();
            int iGenerateTexture = GlUtil.generateTexture(3553);
            if (iGenerateTexture > 0) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iGenerateTexture);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GLES20.glBindTexture(3553, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createTexture width:");
                sbLIZ.append(i);
                sbLIZ.append(" height:");
                sbLIZ.append(i2);
                sbLIZ.append(" textureId");
                sbLIZ.append(iGenerateTexture);
                AVLog.logKibana(4, "VideoBufferPool", C2188811AlT.LIZIZ(sbLIZ), null);
                k kVar = new k(i, i2, EnumC1273550jFJ.RGB, iGenerateTexture, null, null, null, null, null, 0L);
                kVar.release();
                kVar.setLifeCycleCallback(interfaceC1271740jCO);
                this.LIZ = kVar;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            WeakReference<InterfaceC1268500j7A> glAllocFailListenerRef = GLThreadManager.getGlAllocFailListenerRef();
            if (glAllocFailListenerRef.get() != null) {
                glAllocFailListenerRef.get().LJ("tex alloc fail");
            }
        }
    }
}
