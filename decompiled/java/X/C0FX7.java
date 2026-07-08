package X;

import android.util.Log;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FX7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX7 implements IFetchEffectListListener {
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

    public static final void onFail$0(C0FX7 c0fx7, ExceptionResult exceptionResult) {
        ((C0FJU) c0fx7.l0).LIZ(C0FJS.FETCH, exceptionResult);
    }

    public static final void onFail$1(C0FX7 c0fx7, ExceptionResult exceptionResult) {
        if (!((InterfaceC20236714Gf) c0fx7.l0).isActive()) {
            return;
        }
        ((AbstractC365860EWa) c0fx7.l1).LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ((AbstractC365860EWa) c0fx7.l1).getClass();
        sbLIZ.append("DraftBaseEffectRestoreHandler");
        sbLIZ.append(" ; fileType : ");
        sbLIZ.append(((AbstractC365860EWa) c0fx7.l1).LIZIZ());
        sbLIZ.append(" ; restore failed ... ; e : ");
        sbLIZ.append(Log.getStackTraceString(exceptionResult.getException()));
        C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0fx7.l0;
        ArrayList arrayListLJ = C1697810uHb.LJ(((AbstractC365860EWa) c0fx7.l1).LJI(2131832433, false, new DraftFileRestoreException(exceptionResult.getErrorCode() - 30000, exceptionResult.getException(), "EffectPlatform")));
        C189200o6.m2constructorimpl(arrayListLJ);
        interfaceC20236714Gf.resumeWith(arrayListLJ);
    }

    public static final void onSuccess$0(C0FX7 c0fx7, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : (List) obj) {
            TextFontStyleData textFontStyleDataLJJIJL = ((C0FI2) c0fx7.l1).LJJIJL(effect);
            if (textFontStyleDataLJJIJL != null) {
                ((C0FI2) c0fx7.l1).getClass();
                C0FI2.LJJIJLIJ(textFontStyleDataLJJIJL, effect);
                if (!((C0FI2) c0fx7.l1).LJJIIJZLJL(textFontStyleDataLJJIJL.fileName)) {
                    arrayList.add(effect);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C196909122h.LIZ().og(arrayList, new C0FX9(c0fx7, 0));
        } else {
            ((C0FJU) c0fx7.l0).LIZIZ(C0FJT.DISK_CACHE);
        }
    }

    public static final void onSuccess$1(C0FX7 c0fx7, Object obj) {
        List list = (List) obj;
        if (((InterfaceC20236714Gf) c0fx7.l0).isActive()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            ((AbstractC365860EWa) c0fx7.l1).getClass();
            sbLIZ.append("DraftBaseEffectRestoreHandler");
            sbLIZ.append(" ; fileType : ");
            sbLIZ.append(((AbstractC365860EWa) c0fx7.l1).LIZIZ());
            sbLIZ.append(" ; restore success ...");
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            AbstractC365860EWa abstractC365860EWa = (AbstractC365860EWa) c0fx7.l1;
            Iterator it2 = ((ArrayList) abstractC365860EWa.LIZ).iterator();
            while (true) {
                Object obj2 = null;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    for (Object obj3 : list) {
                        Effect effect = (Effect) obj3;
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "draft_effect_restore_match_original_id", true, true)) {
                            if (Intrinsics.LJFF(effect.getEffectId(), abstractC365860EWa.LJIIJJI(next)) || Intrinsics.LJFF(effect.getOriginalEffectId(), abstractC365860EWa.LJIIJJI(next))) {
                                obj2 = obj3;
                                break;
                            }
                        } else if (Intrinsics.LJFF(effect.getEffectId(), abstractC365860EWa.LJIIJJI(next))) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    Effect effect2 = (Effect) obj2;
                    if (effect2 != null) {
                        abstractC365860EWa.LJIIIIZZ(effect2, next);
                    }
                } else {
                    InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0fx7.l0;
                    ArrayList arrayListLJ = C1697810uHb.LJ(((AbstractC365860EWa) c0fx7.l1).LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
                    C189200o6.m2constructorimpl(arrayListLJ);
                    interfaceC20236714Gf.resumeWith(arrayListLJ);
                    return;
                }
            }
        }
    }

    public C0FX7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
