package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;

/* JADX INFO: renamed from: X.0wJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775990wJh implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onStart$0(C1775990wJh c1775990wJh, Effect effect) {
    }

    public static final void onStart$1(C1775990wJh c1775990wJh, Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, effect, exceptionResult);
                break;
            case 1:
                onFail$1(this, effect, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        switch (this.$t) {
            case 0:
                onStart$0(this, effect);
                break;
            case 1:
                onStart$1(this, effect);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effect);
                break;
            case 1:
                onSuccess$1(this, effect);
                break;
        }
    }

    public static final void onSuccess$0(C1775990wJh c1775990wJh, Object obj) {
        C1704730uSl c1704730uSl = new C1704730uSl(obj);
        if (obj != null) {
            C1705310uTh.LJJ(((C1705310uTh) c1775990wJh.l0).LIZIZ, Collections.singletonList(obj));
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1775990wJh.l1;
            C189200o6.m2constructorimpl(c1704730uSl);
            interfaceC20236714Gf.resumeWith(c1704730uSl);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c1775990wJh.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf2.resumeWith(c1704730uSl);
    }

    public static final void onSuccess$1(C1775990wJh c1775990wJh, Object obj) {
        C1704730uSl c1704730uSl = new C1704730uSl(obj);
        if (obj != null) {
            C1705310uTh.LJJ(((C1705310uTh) c1775990wJh.l0).LIZIZ, Collections.singletonList(obj));
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1775990wJh.l1;
            C189200o6.m2constructorimpl(c1704730uSl);
            interfaceC20236714Gf.resumeWith(c1704730uSl);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c1775990wJh.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf2.resumeWith(c1704730uSl);
    }

    public C1775990wJh(C1705310uTh c1705310uTh, C2252611DEt c2252611DEt, int i) {
        this.$t = i;
        this.l0 = c1705310uTh;
        this.l1 = c2252611DEt;
    }

    public static final void onFail$0(C1775990wJh c1775990wJh, Effect effect, ExceptionResult exceptionResult) {
        C1704730uSl c1704730uSl = new C1704730uSl(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), effect);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1775990wJh.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf.resumeWith(c1704730uSl);
    }

    public static final void onFail$1(C1775990wJh c1775990wJh, Effect effect, ExceptionResult exceptionResult) {
        C1704730uSl c1704730uSl = new C1704730uSl(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), effect);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1775990wJh.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf.resumeWith(c1704730uSl);
    }
}
