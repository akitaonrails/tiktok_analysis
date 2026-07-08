package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776000wJi implements IFetchEffectListListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, list);
                break;
            case 1:
                onSuccess$1(this, list);
                break;
        }
    }

    public static final void onFail$0(C1776000wJi c1776000wJi, ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
            msg = exceptionResult.getMsg();
        } else {
            numValueOf = null;
            msg = null;
        }
        C1704730uSl c1704730uSl = new C1704730uSl(numValueOf, msg, null);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776000wJi.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf.resumeWith(c1704730uSl);
    }

    public static final void onFail$1(C1776000wJi c1776000wJi, ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        ArrayList arrayList = new ArrayList();
        if (exceptionResult != null) {
            errorCode = exceptionResult.getErrorCode();
        } else {
            errorCode = -1;
        }
        Integer numValueOf = Integer.valueOf(errorCode);
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "downloadEffectByIds failed";
        }
        C1704730uSl c1704730uSl = new C1704730uSl(numValueOf, msg, arrayList);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776000wJi.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf.resumeWith(c1704730uSl);
    }

    public static final void onSuccess$0(C1776000wJi c1776000wJi, Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            C1705310uTh.LJJ(((C1705310uTh) c1776000wJi.l0).LIZIZ, list);
            C1704730uSl c1704730uSl = new C1704730uSl(ListProtector.get(list, 0));
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776000wJi.l1;
            C189200o6.m2constructorimpl(c1704730uSl);
            interfaceC20236714Gf.resumeWith(c1704730uSl);
            return;
        }
        C1704730uSl c1704730uSl2 = new C1704730uSl(null);
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c1776000wJi.l1;
        C189200o6.m2constructorimpl(c1704730uSl2);
        interfaceC20236714Gf2.resumeWith(c1704730uSl2);
    }

    public static final void onSuccess$1(C1776000wJi c1776000wJi, Object obj) {
        List list = (List) obj;
        C1704730uSl c1704730uSl = new C1704730uSl(list);
        if (list != null) {
            C1705310uTh.LJJ(((C1705310uTh) c1776000wJi.l0).LIZIZ, list);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776000wJi.l1;
            C189200o6.m2constructorimpl(c1704730uSl);
            interfaceC20236714Gf.resumeWith(c1704730uSl);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c1776000wJi.l1;
        C189200o6.m2constructorimpl(c1704730uSl);
        interfaceC20236714Gf2.resumeWith(c1704730uSl);
    }

    public C1776000wJi(C1705310uTh c1705310uTh, C2252611DEt c2252611DEt, int i) {
        this.$t = i;
        this.l0 = c1705310uTh;
        this.l1 = c2252611DEt;
    }
}
