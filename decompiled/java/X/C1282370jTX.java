package X;

import Y.ARunnableS120S0100000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;

/* JADX INFO: renamed from: X.0jTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282370jTX extends C1282400jTa {
    public SafeHandlerThread.SafeHandler LLLI;
    public EnumC1277800jMA LLLII;

    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        AVLog.logKibana(5, "OesTextureHWEncoder", this.LLLFZ.toString(), null);
        SafeHandlerThread.SafeHandler safeHandler = this.LLLI;
        if (safeHandler != null) {
            C1283060jUe.LIZIZ(safeHandler, new ARunnableS120S0100000_20(this, 408));
        } else {
            super.release();
        }
    }

    @Override // X.C1282400jTa
    public final boolean LLJJI() {
        AVLog.iod("OesTextureHWEncoder", "using OesTextureHWEncoder!");
        return super.LLJJI();
    }

    public final void LLJJIJI() {
        super.release();
    }

    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder
    public final int Encode(VideoFrame videoFrame) {
        if (videoFrame.getBuffer() instanceof InterfaceC1278160jMk) {
            InterfaceC1278160jMk interfaceC1278160jMk = (InterfaceC1278160jMk) videoFrame.getBuffer();
            if (this.LLLII != interfaceC1278160jMk.getType()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Texture type changed: ");
                sbLIZ.append(this.LLLII);
                sbLIZ.append(" -> ");
                sbLIZ.append(interfaceC1278160jMk.getType());
                AVLog.iow("OesTextureHWEncoder", C2188811AlT.LIZIZ(sbLIZ));
                this.LLLII = interfaceC1278160jMk.getType();
            }
        }
        return super.Encode(videoFrame);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        boolean z;
        AVLog.iow("OesTextureHWEncoder", "InitEncoder");
        this.LLLFZ.LJ(21);
        Thread threadU3 = C786410Ut5.u3();
        if (threadU3 instanceof SafeHandlerThread) {
            this.LLLI = (SafeHandlerThread.SafeHandler) ((SafeHandlerThread) threadU3).getHandler();
        }
        int iInitEncoder = 22;
        this.LLLFZ.LJ(22);
        try {
            iInitEncoder = super.InitEncoder(tEBundle);
            z = iInitEncoder;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLFZ.LIZLLL(iInitEncoder, th);
            z = 0;
        }
        AVLog.iow("OesTextureHWEncoder", "OesTextureHWEncoder init " + z);
        return z;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void setNativeObj(long j) {
        if (j == 0) {
            try {
                release();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.setNativeObj(j);
    }

    public C1282370jTX(C1277590jLp c1277590jLp, boolean z) {
        String str;
        super(c1277590jLp);
        if (z) {
            str = C1282590jTt.LIZ;
        } else {
            str = "video/avc";
        }
        this.LLILLJJLI = str;
        this.LLLFZ.LJFF("OesTextureHWEncoder");
    }
}
