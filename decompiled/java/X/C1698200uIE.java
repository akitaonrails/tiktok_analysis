package X;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0uIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698200uIE implements IFetchEffectListListener {
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
            case 2:
                onFail$2(this, exceptionResult);
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
            case 2:
                onSuccess$2(this, list);
                break;
        }
    }

    public static final void onFail$0(C1698200uIE c1698200uIE, ExceptionResult exceptionResult) {
        ((MutableLiveData) c1698200uIE.l0).setValue(C1641640sp0.LIZLLL(EnumC1641550sor.ERROR, null));
    }

    public static final void onFail$1(C1698200uIE c1698200uIE, ExceptionResult exceptionResult) {
        C1632000sZS.LIZ((C11PR) c1698200uIE.l0, (C09AJ) c1698200uIE.l1, null);
    }

    public static final void onFail$2(C1698200uIE c1698200uIE, ExceptionResult exceptionResult) {
        IFetchEffectListener iFetchEffectListener = (IFetchEffectListener) c1698200uIE.l1;
        if (exceptionResult == null) {
            exceptionResult = new ExceptionResult(-1, new IllegalStateException("get effect info error"));
        }
        iFetchEffectListener.onFail(null, exceptionResult);
    }

    public static final void onSuccess$0(C1698200uIE c1698200uIE, Object obj) {
        List list = (List) obj;
        if (C1256140inE.LIZ(list)) {
            ((MutableLiveData) c1698200uIE.l0).setValue(C1641640sp0.LIZLLL(EnumC1641550sor.ERROR, null));
            return;
        }
        boolean z = false;
        if (ListProtector.get(list, 0) == null) {
            ((MutableLiveData) c1698200uIE.l0).setValue(C1641640sp0.LIZLLL(EnumC1641550sor.ERROR, null));
            return;
        }
        ((C1645790svh) c1698200uIE.l1).LIZIZ = (Effect) ListProtector.get(list, 0);
        ((C1645790svh) c1698200uIE.l1).getClass();
        if (((C1645790svh) c1698200uIE.l1).LIZIZ != null) {
            z = true;
        }
        ((MutableLiveData) c1698200uIE.l0).setValue(C1641640sp0.LIZLLL(EnumC1641550sor.SUCCESS, new Pair(Boolean.valueOf(z), 2)));
        C1645790svh c1645790svh = (C1645790svh) c1698200uIE.l1;
        Application application = C0CHQ.LIZ;
        if (c1645790svh.LIZ == null) {
            c1645790svh.LIZ = C1633850scR.LIZ(application, null);
        }
        c1645790svh.LIZ.LIZJ(((C1645790svh) c1698200uIE.l1).LIZIZ, new IFetchEffectListener() { // from class: X.0svi
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            }
        });
    }

    public static final void onSuccess$1(C1698200uIE c1698200uIE, Object obj) {
        Effect effect;
        List list = (List) obj;
        C11PR c11pr = (C11PR) c1698200uIE.l0;
        C09AJ c09aj = (C09AJ) c1698200uIE.l1;
        if (list != null) {
            effect = (Effect) C13LP.LJJJLL(list);
        } else {
            effect = null;
        }
        C1632000sZS.LIZ(c11pr, c09aj, effect);
    }

    public static final void onSuccess$2(C1698200uIE c1698200uIE, Object obj) {
        List list = (List) obj;
        if (list != null && (!list.isEmpty())) {
            ((C1629480sVO) c1698200uIE.l0).LIZJ((Effect) ListProtector.get(list, 0), (IFetchEffectListener) c1698200uIE.l1);
            return;
        }
        c1698200uIE.onFail(new ExceptionResult(-1, new IllegalStateException("get effect info error")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1698200uIE(Object obj, MutableLiveData<C1641640sp0<Pair<Boolean, Integer>>> mutableLiveData, C1645790svh c1645790svh) {
        this.$t = c1645790svh;
        this.l0 = obj;
        this.l1 = mutableLiveData;
    }
}
