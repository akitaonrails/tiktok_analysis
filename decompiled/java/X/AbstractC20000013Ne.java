package X;

import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S0110000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20000013Ne implements InterfaceC20001313Nr {
    public final C19996113Lr callbackManager;
    public boolean isCanceled;
    public boolean isRunning;
    public int level;
    public long modifyTime;
    public String tag = "";
    public String taskId;

    @Override // X.InterfaceC20001313Nr
    public void cancel() {
        this.isCanceled = true;
        runOnMainThread(new AwS574S0100000_30(this, 409));
    }

    public abstract void execute();

    public boolean isSupportPaused() {
        return false;
    }

    public abstract void onCancel();

    public void onPause(boolean z) {
    }

    public void onPreExecute() {
    }

    public final void reset() {
        this.isCanceled = false;
    }

    @Override // X.InterfaceC20001313Nr
    public void run() {
        this.isRunning = true;
        String str = this.taskId;
        if (str != null) {
            C19996113Lr c19996113Lr = this.callbackManager;
            C13MA c13maLIZ = c19996113Lr != null ? c19996113Lr.LIZ(str) : null;
            if (c13maLIZ instanceof C13M4) {
                ((C13M4) c13maLIZ).onStart();
            }
        }
        if (this.isCanceled) {
            return;
        }
        execute();
        String str2 = this.taskId;
        if (str2 != null) {
            C19996113Lr c19996113Lr2 = this.callbackManager;
            C13MA c13maLIZ2 = c19996113Lr2 != null ? c19996113Lr2.LIZ(str2) : null;
            if (c13maLIZ2 instanceof C13M4) {
                ((C13M4) c13maLIZ2).onFinally();
            }
        }
        this.isRunning = false;
    }

    @Override // X.InterfaceC20001313Nr
    public String getId() {
        String str = this.taskId;
        return str == null ? CardStruct.IStatusCode.DEFAULT : str;
    }

    public String getTag() {
        return C504670Jqj.LIZIZ(this.tag) ? String.valueOf(C13LE.LIZ(getClass()).LJI()) : this.tag;
    }

    @Override // X.InterfaceC20001313Nr
    public int getLevel() {
        return this.level;
    }

    @Override // X.InterfaceC20001313Nr
    public long getModifyTime() {
        return this.modifyTime;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    @Override // X.InterfaceC20001313Nr
    public void pause(boolean z) {
        this.isCanceled = true;
        runOnMainThread(new AwS146S0110000_30(this, z, 2));
    }

    public void runOnMainThread(Function0<Unit> function0) {
        C13QI.LIZ(new ARunnableS124S0100000_24(function0, 169));
    }

    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    @Override // X.InterfaceC20001313Nr
    public void setLevel(int i) {
        this.level = i;
    }

    @Override // X.InterfaceC20001313Nr
    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    @Override // X.InterfaceC20001313Nr
    public void setTag(String str) {
        this.tag = str;
    }

    public AbstractC20000013Ne(String str, C19996113Lr c19996113Lr) {
        this.taskId = str;
        this.callbackManager = c19996113Lr;
    }
}
