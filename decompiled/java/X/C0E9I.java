package X;

import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;

/* JADX INFO: renamed from: X.0E9I, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9I extends AbstractC381020Ewm<C0E9J> implements C0E9J {
    public static final int LLILZIL = 8;
    public final C1DRG LLILLL;
    public String LLILZ;

    public C0E9J X1() {
        return this;
    }

    @Override // X.C0E9J
    public void ni0() {
        C0E48 c0e48W1;
        String uuid;
        NLECommit head;
        String str = this.LLILZ;
        if (str == null || (c0e48W1 = W1()) == null) {
            return;
        }
        NLEBranch branch = c0e48W1.LLFII().LJI().getBranch();
        if (branch == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
            uuid = "";
        }
        c0e48W1.LLFII().LJI().trimRange(str, uuid);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        super.onCreate();
        C0E48 c0e48W1 = W1();
        this.LLILZ = (c0e48W1 == null || (nLEEditorLJI = c0e48W1.LLFII().LJI()) == null || (branch = nLEEditorLJI.getBranch()) == null || (head = branch.getHead()) == null) ? null : head.getUUID();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    public C0E9I(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
    }
}
