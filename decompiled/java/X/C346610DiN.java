package X;

import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346610DiN extends NLEEditor {
    public static final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public static final C01GW<ReentrantReadWriteLock.ReadLock> LJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(290));
    public static final C01GW<ReentrantReadWriteLock.WriteLock> LJFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(291));
    public final ReentrantReadWriteLock LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    public final ReentrantReadWriteLock.ReadLock LIZ() {
        C01GW c01gw = C274930Aq3.LIZ;
        return C274930Aq3.LIZIZ ? (ReentrantReadWriteLock.ReadLock) this.LIZJ.getValue() : LJ.getValue();
    }

    public final ReentrantReadWriteLock.WriteLock LIZIZ() {
        C01GW c01gw = C274930Aq3.LIZ;
        return C274930Aq3.LIZIZ ? (ReentrantReadWriteLock.WriteLock) this.LIZIZ.getValue() : LJFF.getValue();
    }

    public C346610DiN() {
        this(NLEEditorJniJNI.new_NLEEditor());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean canRedo() {
        LIZ().lock();
        try {
            boolean zCanRedo = super.canRedo();
            LIZ().unlock();
            return zCanRedo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean canUndo() {
        LIZ().lock();
        try {
            boolean zCanUndo = super.canUndo();
            LIZ().unlock();
            return zCanUndo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean commit() {
        LIZIZ().lock();
        try {
            boolean zCommit = super.commit();
            LIZIZ().unlock();
            return zCommit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void delete() {
        LIZIZ().lock();
        try {
            super.delete();
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean done() {
        LIZIZ().lock();
        try {
            boolean zDone = super.done();
            LIZIZ().unlock();
            return zDone;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final VecNLEResourceNodeSPtr getAllResources() {
        LIZ().lock();
        try {
            VecNLEResourceNodeSPtr allResources = super.getAllResources();
            LIZ().unlock();
            return allResources;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEBranch getBranch() {
        LIZ().lock();
        try {
            NLEBranch branch = super.getBranch();
            LIZ().unlock();
            return branch;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEModel getModel() {
        LIZ().lock();
        try {
            NLEModel model = super.getModel();
            LIZ().unlock();
            return model;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEModel getStageModel() {
        LIZ().lock();
        try {
            NLEModel stageModel = super.getStageModel();
            LIZ().unlock();
            return stageModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean redo() {
        LIZIZ().lock();
        try {
            boolean zRedo = super.redo();
            LIZIZ().unlock();
            return zRedo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean resetHead() {
        LIZIZ().lock();
        try {
            boolean zResetHead = super.resetHead();
            LIZIZ().unlock();
            return zResetHead;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final String store() {
        LIZIZ().lock();
        try {
            String strStore = super.store();
            LIZIZ().unlock();
            return strStore;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final String storeWithoutLock() {
        LIZIZ().lock();
        try {
            String strStoreWithoutLock = super.storeWithoutLock();
            LIZIZ().unlock();
            return strStoreWithoutLock;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean undo() {
        LIZIZ().lock();
        try {
            boolean zUndo = super.undo();
            LIZIZ().unlock();
            return zUndo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void finalize() {
        super.finalize();
    }

    public C346610DiN(long j) {
        super(j, true);
        this.LIZ = new ReentrantReadWriteLock();
        this.LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1043));
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1042));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void addConsumer(NLEEditorListener nLEEditorListener) {
        LIZIZ().lock();
        try {
            super.addConsumer(nLEEditorListener);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean done(String str) {
        LIZIZ().lock();
        try {
            boolean zDone = super.done(str);
            LIZIZ().unlock();
            return zDone;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEError exportEditor(String str) {
        LIZ().lock();
        try {
            NLEError nLEErrorExportEditor = super.exportEditor(str);
            LIZ().unlock();
            return nLEErrorExportEditor;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final String getGlobalExtra(String str) {
        LIZ().lock();
        try {
            String globalExtra = super.getGlobalExtra(str);
            LIZ().unlock();
            return globalExtra;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean goTo(String str) {
        LIZIZ().lock();
        try {
            boolean zGoTo = super.goTo(str);
            LIZIZ().unlock();
            return zGoTo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEError importEditor(String str) {
        LIZIZ().lock();
        try {
            NLEError nLEErrorImportEditor = super.importEditor(str);
            LIZIZ().unlock();
            return nLEErrorImportEditor;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean redo(int i) {
        LIZIZ().lock();
        try {
            boolean zRedo = super.redo(i);
            LIZIZ().unlock();
            return zRedo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void removeConsumer(NLEEditorListener nLEEditorListener) {
        LIZIZ().lock();
        try {
            super.removeConsumer(nLEEditorListener);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final NLEError restore(String str) {
        LIZIZ().lock();
        try {
            NLEError nLEErrorRestore = super.restore(str);
            LIZIZ().unlock();
            return nLEErrorRestore;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void setBranchListener(NLEBranchListener nLEBranchListener) {
        LIZIZ().lock();
        try {
            super.setBranchListener(nLEBranchListener);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void setListener(NLEEditorListener nLEEditorListener) {
        LIZIZ().lock();
        try {
            super.setListener(nLEEditorListener);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void setMeasureOption(boolean z) {
        LIZIZ().lock();
        try {
            super.setMeasureOption(z);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void setModel(NLEModel nLEModel) {
        LIZIZ().lock();
        try {
            super.setModel(nLEModel);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean undo(int i) {
        LIZIZ().lock();
        try {
            boolean zUndo = super.undo(i);
            LIZIZ().unlock();
            return zUndo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void setGlobalExtra(String str, String str2) {
        LIZIZ().lock();
        try {
            super.setGlobalExtra(str, str2);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final void trim(long j, long j2) {
        LIZIZ().lock();
        try {
            super.trim(j, j2);
            LIZIZ().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
    public final boolean trimRange(String str, String str2) {
        LIZIZ().lock();
        try {
            boolean zTrimRange = super.trimRange(str, str2);
            LIZIZ().unlock();
            return zTrimRange;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ().unlock();
            throw th;
        }
    }
}
