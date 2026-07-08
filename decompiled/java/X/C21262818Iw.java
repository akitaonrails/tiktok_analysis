package X;

import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21262818Iw extends C09AY implements Function0<Boolean> {
    public C21262818Iw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        InitBtmSDKTask.LL.getClass();
        return Boolean.valueOf(InitBtmSDKTask.LJFF() >= 2);
    }
}
