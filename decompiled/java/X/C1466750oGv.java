package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0oGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466750oGv implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFail$0(C1466750oGv c1466750oGv, Effect effect, ExceptionResult exceptionResult) {
    }

    public static final void onStart$0(C1466750oGv c1466750oGv, Effect effect) {
    }

    public static final void onStart$1(C1466750oGv c1466750oGv, Effect effect) {
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

    public static final void onSuccess$0(C1466750oGv c1466750oGv, Object obj) {
        List<String> tags;
        String str;
        InterfaceC1460950o7Z interfaceC1460950o7Z;
        if (C2354709Kn.LIZIZ(((Effect) c1466750oGv.l0).getUnzipPath()) && (tags = ((Effect) c1466750oGv.l0).getTags()) != null && (str = (String) C13LP.LJJJLZIJ(0, tags)) != null && (interfaceC1460950o7Z = (InterfaceC1460950o7Z) c1466750oGv.l1) != null) {
            interfaceC1460950o7Z.onSuccess(str);
        }
    }

    public static final void onSuccess$1(C1466750oGv c1466750oGv, Object obj) {
        Effect effect = (Effect) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadResource onSuccess: ");
        sbLIZ.append(effect);
        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
        if (effect != null && effect.getZipPath() != null) {
            ((C1424090nA7) c1466750oGv.l0).LJ.put(effect.getResource_id(), effect);
            ((InterfaceC2329309At) c1466750oGv.l1).onSuccess(effect);
        } else {
            ((InterfaceC2329309At) c1466750oGv.l1).onError(new RuntimeException("downloadResource null effect", new RuntimeException(String.valueOf(EnumC358710E4n.DOWNLOAD_EFFECT_FAIL.getValue()))));
        }
    }

    public C1466750oGv(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFail$1(C1466750oGv c1466750oGv, Effect effect, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadResource onFail ");
        sbLIZ.append(exceptionResult);
        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC2329309At) c1466750oGv.l1).onError(exceptionResult.getException());
    }
}
