package X;

import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581040Mqc implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onStart$0(C581040Mqc c581040Mqc, Effect effect) {
    }

    public static final void onStart$1(C581040Mqc c581040Mqc, Effect effect) {
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

    public static final void onSuccess$0(C581040Mqc c581040Mqc, Object obj) {
        Effect effect = (Effect) obj;
        C573410MeJ c573410MeJ = (C573410MeJ) c581040Mqc.l0;
        Object obj2 = c581040Mqc.l1;
        if (effect == null) {
            c573410MeJ.LIZIZ(obj2);
            ((C573410MeJ) c581040Mqc.l0).LIZIZ(c581040Mqc.l1);
            return;
        }
        c573410MeJ.getClass();
        ArrayList arrayList = new ArrayList();
        MvThemeData mvThemeData = new MvThemeData();
        mvThemeData.LJI(effect);
        arrayList.add(mvThemeData);
        long jLIZ = c573410MeJ.LIZJ.LIZ();
        C573380MeG c573380MeG = c573410MeJ.LIZ;
        C573060Mdk c573060Mdk = c573380MeG.LIZ;
        if (c573060Mdk != null) {
            c573060Mdk.LIZ = (int) jLIZ;
        }
        c573380MeG.LJIIL = false;
        AbstractC573460MeO abstractC573460MeO = c573410MeJ.LIZIZ;
        if (abstractC573460MeO == null) {
            return;
        }
        abstractC573460MeO.LIZ(arrayList);
    }

    public static final void onSuccess$1(C581040Mqc c581040Mqc, Object obj) {
        ((StickerDownloadConfig) c581040Mqc.l0).getOnSuccess();
        ((IFetchEffectListener) c581040Mqc.l1).onSuccess(obj);
    }

    public C581040Mqc(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFail$0(C581040Mqc c581040Mqc, Effect effect, ExceptionResult exceptionResult) {
        ((C573410MeJ) c581040Mqc.l0).LIZIZ(c581040Mqc.l1);
    }

    public static final void onFail$1(C581040Mqc c581040Mqc, Effect effect, ExceptionResult exceptionResult) {
        Function1<Integer, Unit> onFail = ((StickerDownloadConfig) c581040Mqc.l0).getOnFail();
        if (onFail != null) {
            onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
        }
        ((IFetchEffectListener) c581040Mqc.l1).onFail(effect, exceptionResult);
    }
}
