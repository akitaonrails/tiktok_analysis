package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.125i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196988125i implements IFetchEffectChannelListener {
    public final /* synthetic */ Function1 LIZ;
    public final /* synthetic */ C196986125g LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetch fail err: ");
        sbLIZ.append(exceptionResult.getMsg());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        Iterator<Effect> it2 = effectChannelResponse.getAllCategoryEffects().iterator();
        while (it2.hasNext()) {
            this.LIZIZ.LJII(it2.next());
        }
        Function1 function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(this.LIZIZ.LJ());
        }
        C196986125g c196986125g = this.LIZIZ;
        for (String str : c196986125g.LIZ.keySet()) {
            if (((ConcurrentHashMap) c196986125g.LIZIZ).get(str) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("text font ");
                sbLIZ.append(str);
                sbLIZ.append(" is null");
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                c196986125g.LJ.LJJJJI("textfont", false, true, new C19773612Yc(c196986125g, 5));
                return;
            }
        }
    }

    public C196988125i(C196986125g c196986125g, AwS395S0200000_29 awS395S0200000_29) {
        this.LIZIZ = c196986125g;
        this.LIZ = awS395S0200000_29;
    }
}
