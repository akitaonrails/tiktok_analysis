package Y;

import X.C0U5Z;
import X.C0UD4;
import X.C1161920gLG;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C19EG;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C745360TLq;
import X.C745370TLr;
import X.C760630Tsb;
import X.C761610TuB;
import X.C761880Tuc;
import X.C761890Tud;
import X.C761910Tuf;
import X.C768430UCj;
import X.C775680Ubm;
import X.C775750Ubt;
import X.C775770Ubv;
import X.C814420VxA;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS44S0201000_12 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS44S0201000_12 aCListenerS44S0201000_12, View view) {
        C775680Ubm.LIZIZ().vQ2(new C775750Ubt("toast", String.valueOf(((C775680Ubm) aCListenerS44S0201000_12.l0).LLILZ), aCListenerS44S0201000_12.i2));
        C775680Ubm.LIZIZ().vQ2(new C775770Ubv("toast"));
        ((C1389910mGz) aCListenerS44S0201000_12.l1).LIZJ();
        C775680Ubm c775680Ubm = (C775680Ubm) aCListenerS44S0201000_12.l0;
        int i = aCListenerS44S0201000_12.i2;
        c775680Ubm.getClass();
        C1389910mGz c1389910mGz = new C1389910mGz(c775680Ubm.LLILLJJLI);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJIIIZ(2131855053);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZLLL = 0;
        c1360890lWB.LJIIIIZZ = new ACListenerS44S0201000_12(c775680Ubm, i, c1389910mGz, 1);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
        c1389910mGz.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389910mGz.LIZ(false);
        c1389910mGz.LJIIJJI();
    }

    public static final void onClick$1(ACListenerS44S0201000_12 aCListenerS44S0201000_12, View view) {
        C775680Ubm.LIZIZ().vQ2(new C775750Ubt("toast", String.valueOf(((C775680Ubm) aCListenerS44S0201000_12.l0).LLILZ), aCListenerS44S0201000_12.i2));
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        C19EG c19eg = ((C775680Ubm) aCListenerS44S0201000_12.l0).LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://webcast_broadcast?page=broadcast&scene=open_panel&params=panel_name%3Dmore_panel%26cell_name%3DSTABLE_MODE%26enter_from%3Dtoast%26extra%3D");
        sbLIZ.append(aCListenerS44S0201000_12.i2);
        iActionHandlerService.handle(c19eg, C2188811AlT.LIZIZ(sbLIZ));
        ((C1389910mGz) aCListenerS44S0201000_12.l1).LIZJ();
    }

    public static final void onClick$2(ACListenerS44S0201000_12 aCListenerS44S0201000_12, View view) {
        C745370TLr c745370TLr = (C745370TLr) aCListenerS44S0201000_12.l0;
        if (c745370TLr != null) {
            ((C745360TLq) aCListenerS44S0201000_12.l1).LL.invoke(c745370TLr, Integer.valueOf(aCListenerS44S0201000_12.i2));
        }
    }

    public static final void onClick$3(ACListenerS44S0201000_12 aCListenerS44S0201000_12, View view) {
        String id;
        Object next;
        String tagsUpdatedAt;
        if (C761910Tuf.LIZ) {
            return;
        }
        C761880Tuc c761880Tuc = (C761880Tuc) aCListenerS44S0201000_12.l0;
        if (c761880Tuc.LLILZ != null) {
            if (!c761880Tuc.LLILLL.yQ2((LiveEffect) aCListenerS44S0201000_12.l1) && !((LiveEffect) aCListenerS44S0201000_12.l1).LJJIJIIJI()) {
                C761880Tuc c761880Tuc2 = (C761880Tuc) aCListenerS44S0201000_12.l0;
                LiveEffect liveEffect = (LiveEffect) aCListenerS44S0201000_12.l1;
                BaseEffectViewModel.vQ2(c761880Tuc2.LLILLL, liveEffect, new AwS378S0200000_12(c761880Tuc2, liveEffect, 69), 28);
                return;
            }
            C761880Tuc c761880Tuc3 = (C761880Tuc) aCListenerS44S0201000_12.l0;
            c761880Tuc3.LLLJ(c761880Tuc3.LLILZIL);
            ((C761880Tuc) aCListenerS44S0201000_12.l0).LLLILZ(aCListenerS44S0201000_12.i2);
            C761880Tuc c761880Tuc4 = (C761880Tuc) aCListenerS44S0201000_12.l0;
            int i = aCListenerS44S0201000_12.i2;
            c761880Tuc4.LLILZIL = i;
            if (((ArrayList) c761880Tuc4.LL).size() > i && ((LiveEffect) ListProtector.get(c761880Tuc4.LL, i)).LIZJ != null) {
                ((LiveEffect) ListProtector.get(c761880Tuc4.LL, i)).LJJZ(false);
                C0U5Z c0u5zLIZ = C760630Tsb.LIZ();
                Effect effect = ((LiveEffect) ListProtector.get(c761880Tuc4.LL, i)).LIZJ;
                if (effect != null) {
                    id = effect.getId();
                } else {
                    id = null;
                }
                if (!((ArrayList) c0u5zLIZ.LIZ).isEmpty() && !TextUtils.isEmpty(id)) {
                    Iterator it2 = ((ArrayList) c0u5zLIZ.LIZ).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Effect effect2 = ((LiveEffect) next).LIZJ;
                            if (effect2 != null && Intrinsics.LJFF(effect2.getId(), id)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LiveEffect liveEffect2 = (LiveEffect) next;
                    if (liveEffect2 != null) {
                        liveEffect2.LJJZ(false);
                        Effect effect3 = liveEffect2.LIZJ;
                        if (effect3 != null) {
                            tagsUpdatedAt = effect3.getTagsUpdatedAt();
                        } else {
                            tagsUpdatedAt = null;
                        }
                        EffectManager effectManager = c0u5zLIZ.LIZJ;
                        if (effectManager != null) {
                            effectManager.updateTag(id, tagsUpdatedAt, null);
                        }
                    }
                }
            }
            C768430UCj c768430UCj = C768430UCj.LIZ;
            LiveEffect liveEffect3 = (LiveEffect) aCListenerS44S0201000_12.l1;
            String str = C0UD4.LIZ;
            C768430UCj.LJ(liveEffect3, 0L, false, "livefiltercomposerexperiment");
            ((C761880Tuc) aCListenerS44S0201000_12.l0).LLILZ.LIZ(aCListenerS44S0201000_12.i2);
        }
    }

    public static final void onClick$4(ACListenerS44S0201000_12 aCListenerS44S0201000_12, View view) {
        ((C761610TuB) aCListenerS44S0201000_12.l0).LLLLLZ(view, (SoundEffect) aCListenerS44S0201000_12.l1, aCListenerS44S0201000_12.i2);
    }

    public ACListenerS44S0201000_12(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }

    public ACListenerS44S0201000_12(C761880Tuc c761880Tuc, LiveEffect liveEffect, int i, C761890Tud c761890Tud, int i2) {
        this.$t = i2;
        this.l0 = c761880Tuc;
        this.l1 = liveEffect;
        this.i2 = i;
    }
}
