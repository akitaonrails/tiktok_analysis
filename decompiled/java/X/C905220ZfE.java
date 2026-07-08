package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.ui.recyclerview.DynamicMarginLinearLayoutManager;
import com.ss.android.ugc.aweme.im.ui.recyclerview.DynamicMarginLinearLayoutManager2;
import com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager;

/* JADX INFO: renamed from: X.0ZfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905220ZfE implements InterfaceC905140Zf6 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final boolean LIZ;
    public volatile C905230ZfF LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905220ZfE.class, "provider", "getProvider()Lcom/ss/android/ugc/aweme/im/ui/recyclerview/DefaultChatLinearLayoutManagerProvider;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C905220ZfE() {
        this(true);
    }

    public C905220ZfE(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC905140Zf6
    public final InnerChatLinearLayoutManager LIZ(View view) {
        C905230ZfF c905230ZfF = this.LIZIZ;
        if (c905230ZfF == null) {
            synchronized (this) {
                c905230ZfF = this.LIZIZ;
                if (c905230ZfF == null) {
                    c905230ZfF = new C905230ZfF(Boolean.valueOf(this.LIZ).booleanValue());
                    this.LIZIZ = c905230ZfF;
                }
            }
        }
        if (((Boolean) C271400AkM.LIZ.getValue()).booleanValue()) {
            return new DynamicMarginLinearLayoutManager2(view, c905230ZfF.LIZ);
        }
        return new DynamicMarginLinearLayoutManager(view, c905230ZfF.LIZ);
    }
}
