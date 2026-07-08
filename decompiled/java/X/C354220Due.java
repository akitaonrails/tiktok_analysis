package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Due, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C354220Due extends AbstractC354420Duy {
    @Override // X.AbstractC354420Duy
    public final void LIZLLL(C354540DvA c354540DvA, C354550DvB c354550DvB) {
        String extra;
        String extra2;
        C354240Dug c354240Dug = c354540DvA.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        String str = c354510Dv7.LIZIZ;
        String str2 = c354510Dv7.LIZJ;
        NLETrackSlot nLETrackSlot = c354240Dug.LIZIZ;
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if (videoEffects != null) {
            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                C354260Dui.LIZ.getClass();
                if (!C354260Dui.LJIILJJIL(nLEVideoEffect) && !Intrinsics.LJFF(nLEVideoEffect.getExtra("I2V"), "I2V")) {
                    if (nLEVideoEffect.hasExtra("ep_magic_resource_id") && (extra2 = nLEVideoEffect.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra2)) && Intrinsics.LJFF(str, extra2)) {
                        nLETrackSlot.removeVideoEffect(nLEVideoEffect);
                        C354260Dui.LJ(nLETrackSlot, str, str2);
                        nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
                        nLETrackSlot.removeExtraWithKey("biz_magic_is_combine_gameplay_render_with_effect");
                        nLETrackSlot.removeExtraWithKey("ep_replaced_i2i_magic_by_render_proxy");
                        c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
                        return;
                    }
                } else {
                    c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
                    return;
                }
            }
        }
        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
        if (filters != null) {
            for (NLEFilter nLEFilter : filters) {
                if (nLEFilter.hasExtra("ep_magic_resource_id") && (extra = nLEFilter.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra)) && Intrinsics.LJFF(str, extra)) {
                    nLETrackSlot.removeFilter(nLEFilter);
                    C354260Dui.LIZ.getClass();
                    C354260Dui.LJ(nLETrackSlot, str, str2);
                    nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
                    c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
                    return;
                }
            }
        }
        if (nLETrackSlot.hasExtra("ep_magic_resource_id")) {
            String extra3 = nLETrackSlot.getExtra("ep_magic_resource_id");
            if (extra3 != null && extra3.length() != 0 && Intrinsics.LJFF(extra3, str)) {
                C354260Dui.LIZ.getClass();
                C354260Dui.LJ(nLETrackSlot, str, str2);
                nLETrackSlot.removeExtraWithKey("is_from_ep_magic");
            }
        } else {
            nLETrackSlot.removeExtraWithKey("is_from_ep_magic");
        }
        nLETrackSlot.removeExtraWithKey("from_ep_create");
        c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    @Override // X.AbstractC354420Duy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZJ(X.C354540DvA r17, X.C354550DvB r18, X.C354570DvD r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354220Due.LIZJ(X.0DvA, X.0DvB, X.0DvD):void");
    }
}
